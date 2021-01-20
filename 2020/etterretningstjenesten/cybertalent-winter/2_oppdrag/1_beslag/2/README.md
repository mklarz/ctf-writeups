# 2.1\_beslag\_2

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/c31cc360cb9e4ef79c39d8f7bffa223d.png" width="200">

Opening the **Chat** we are presented with a view with `Access Denied` and tells us to log in to https://mobile.cybertalent.no/challenge.

* * *

## mobile.cybertalent.no

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/5f0651cd892341d1b38be71f045f05fd.png" width="300">

We re-use the credentials from **2.1\_beslag\_1** (`hungry_hippo_123:secretpassword`) to successfully login, and are now presented with some challenge words. The words are refreshed every 10 seconds. Submitting something random calls a `POST /challenge` and returns `Bad response code`.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/eaabfc39f79f4efbaffd3b18d7c0fd6c.png" width="300">

Sending the challenge into the application with `/response TroveShrineMarbleBehavior` gives us the following response, which also returns `Bad response code` when submitting.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/d7ff0ae189ee4515a982c84360406fda.png" width="300">

* * *

## Reversing

### `ChatActivity.onCreate(Bundle)`

When `ChatActivity` is created the `onCreate` method is called, which again sets up new [`View.OnKeyListener`](https://developer.android.com/reference/android/view/View.OnKeyListener) (via. `new a()`). The public method [`onKey`](https://developer.android.com/reference/android/view/View.OnKeyListener#onKey%28android.view.View,%20int,%20android.view.KeyEvent%29 "https://developer.android.com/reference/android/view/View.OnKeyListener#onKey(android.view.View,%20int,%20android.view.KeyEvent)") in this class listens to the input. Then it loads in the `SharedPreferences` for `ChatActivity`, and finally starts the activity thread with the `new b()` (`Runnable`) class.

```java
public void onCreate(Bundle bundle) {
    // snip...
    this.p.setOnKeyListener(new a());
    SharedPreferences preferences = getPreferences(0);
    // snip...
    Thread thread = new Thread(new b());
    thread.start()
}
```

* * *

### `ChatActivity.q` (`SharedPreferences`)

The `SharedPreferences` can be found in `data/data/no.cybertalent.liberatortoolkit/shared_prefs/ChatActivity.xml` of the phone dump.

```xml
<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
    <string name="nick">hungry_hippo_123</string>
    <string name="token">0000</string>
</map>
```

* * *

### `ChatActivity.b.run()`

As mentioned, `ChatActivity.onCreate` starts the activity thread with a new instance of the `ChatActivity.b` (`Runnable`) class, which contains the following code for the `ChatActivity.b.run()` function.
`ChatHelper.a(String, String)` is a function that handles the communication between the application and the remote chat API. When this is first run it calls `https://mobile.cybertalent.no/chat?token=0000`, which responds with the text seen in the initial chat screenshot above.

```java
ChatActivity.this.o.post(new a(ChatHelper.a("chat", ChatActivity.q.getString("token", "0000"))));
Thread.sleep(1000);
```

* * *

### `ChatActivity.a.onKey(View, int, KeyEvent)`

The `onKey` only function calls the `ChatActivity.t()` if the input key is `Enter`.

```java
public boolean onKey(View view, int i, KeyEvent keyEvent) {
    if (keyEvent.getAction() != 0 || i != 66) {
        return false;
    }
    ChatActivity chatActivity = ChatActivity.this;
    SharedPreferences sharedPreferences = ChatActivity.q;
    chatActivity.t();
    return true;
}
```

* * *

### `ChatActivity.t()`

`t()` is a function that handles all the input (general chat) and commands (`/nick`, `/token` and `/response`) from the input field, as shown below.

* * *

#### `/response <challenge>`

The following code is executed when the input matches `/response <challenge>`. `ChatHelper.getResponse(String)` is called with the provided challenge, in addition `a1` is prefixed to the final string if the static boolean `ChatHelper.emu` is `true`.

```java
String response = ChatHelper.getResponse(split[1]);
StringBuilder sb = new StringBuilder();
if (ChatHelper.emu) {
  sb.append("a1");
}
sb.append(response.toLowerCase());
// --- snip ---
```

* * *

#### say

A new thread is started if the input is not a command (begins with a `/`), `ChatActivity.c` is a `Runnable` class.

```java
new Thread(new c(charSequence)).start();
```

* * *

##### `ChatActivity.c.run()`

This function fetches `token` and `nick` from `SharedPreferences`, and then does a `POST https://mobile.cybertalent.no/say` with a simple JSON object:

```json
{
    "content": "<input>",
    "token": "<SharedPreferences.token>",
    "nick": "<SharedPreferences.nick>"
}
```

* * *

### `ChatHelper.getResponse(String)`

`getResponse` is a native function, that uses functions provided in a provided native library.

```java
public static native String getResponse(String str);
```

Let's take a closer look at the `getResponse` function in the native library that was extracted from the APK.

* * *

#### `libnative-lib.so`

We find that that the native `getResponse` function (`Java_no_cybertalent_liberatortoolkit_helpers_ChatHelper_getResponse`) calls `ChatHelper` and prefixes the return string with `deadbeef` if `CheckHelper.emu` is `true`.

```c
lVar3 = (**(code **)(*param_1 + 0x480))(param_1,param_2,&DAT_00100a8e,&DAT_00100a19); // DAT_00100a8e = emu
if (lVar3 != 0) {
	cVar1 = (**(code **)(*param_1 + 0x490))(param_1,param_2,lVar3);
	local_59 = cVar1 == '\0';
}
// --- snip ---
bVar9 = (local_59 & 1) == 0;
if (bVar9) {
	*(undefined8 *)((long)pvVar5 + 1) = 7378415037781730660; // feebdaed => deadbeef
}
```

* * *

### `ChatHelper.emu`

`emu` is a static boolean variable, that checks if the application is running within an emulator, we therefore need to find a way to override the results of this variable.

```java
public static final boolean emu;

static {
  boolean z;
  if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
    String str = Build.FINGERPRINT;
    if (!str.startsWith("generic") && !str.startsWith("unknown")) {
      String str2 = Build.HARDWARE;
      if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
        String str3 = Build.MODEL;
        if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
          String str4 = Build.PRODUCT;
          if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
            z = false;
            emu = z;
          }
        }
      }
    }
  }
  z = true;
  emu = z;
}
```

* * *

## Solution flow

We now have everything we need to generate a correct response code and get a token, and we know that every response code is only valid for 10 seconds, our flow will be the following:

1.  Override the `ChatHelper.emu` static variable to return `false`.
2.  Login to the `mobile.cybertalent.no` portal via. `/login` with the credentials `hungry_hippo_123:secretpassword`.
3.  Get a challenge code from `/getchall`.
4.  Pass the challenge code into the `ChatHelper.getResponse()` method.
5.  Submit the generated response code to `/challenge` and get our token.
6.  Fetch the chat from `/chat?token=x` with our token.

* * *

### Automation

To interact with the Android application we can use [Frida](https://frida.re/), which is a dynamic instrumentation toolkit for developers, reverse-engineers, and security researchers. We need to override the value of `ChatHelper.emu` and then call the `ChatHelper.getResponse` function. The Frida [JavaScript API](https://frida.re/docs/javascript-api/) is well documented and we finish our script.

##### [`frida-chat.js`](./frida-chat.js)

```js
console.log("Loaded frida-chat.js");

function getResponse(challenge) {
  setTimeout(function() {
    Java.perform(function () {
      var ChatHelper = Java.use("no.cybertalent.liberatortoolkit.helpers.ChatHelper")
      ChatHelper.emu.value = false;
      send(ChatHelper.getResponse(challenge));
    });
  }, 100);
}

rpc.exports = {
    getresponse: getResponse
};
```

* * *

Combining this with some python code automates this entire solution flow for us, in addition the code also launches / spawns the application. Running the script takes about a second and successfully generates a valid token and extracts the chat.

##### [`extract_chat.py`](./extract_chat.py)

```python
import sys
import frida
import requests

s = requests.Session()

def login():
    r = s.post("https://mobile.cybertalent.no/login", json={
        "user": "hungry_hippo_123",
        "pass": "secretpassword"
    });
    r.raise_for_status()
    j = r.json()
    if "success" not in j or j["success"] != "Logged in":
        print("Failed logging in:")
        print(j)
        exit(1)

def get_challenge():
    login()
    r = s.post("https://mobile.cybertalent.no/getchall")
    r.raise_for_status()
    return r.json()["chall"]

def get_token(response):
    r = s.post("https://mobile.cybertalent.no/challenge", json={
        "response": response
    })
    j = r.json()
    return j["success"]

def get_chat(token):
    r = s.get("https://mobile.cybertalent.no/chat?token=" + token)
    return r.content.decode()

def on_message(message, data):
    if "payload" in message:
        response = message["payload"].lower()
        print("Response:", response)
        token = get_token(response)
        print("Token:", token)
        chat = get_chat(token)
        print(chat)
    else:
        print(message)
        print(data)
    exit(0)

with open("frida-chat.js") as f:
    ss = f.read()

device = frida.get_usb_device()
pid = device.spawn(["no.cybertalent.liberatortoolkit"])
session = device.attach(pid)

script = session.create_script(ss)
script.on("message", on_message)
script.load()

challenge = get_challenge()
print("Challenge:", challenge)

script.exports.getResponse(challenge)
device.resume(pid)
sys.stdin.read()
```

* * *

```sh
$ python extract_chat.py > chat.txt
Loaded frida-chat.js
Challenge: GorillaPoloOperatingBreeze
Response: 5fa780b9babab1a6a7baa74786bd80b182b9a4bf5080bdbd88bd
Token: 7c6ccda74458e01ec197
```

Entering the token into the app with `/token 7c6ccda74458e01ec197` gives us the following view:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/f59754f0f1ee44198cf861d09bd836f4.png" width="200">

```sh
$ cat chat.txt | head -n 20
############################################
#      Welcome to the #LT3000 chat.        #
#                                          #
# * Use at own risk.                       #
# * All comms are encrypted.               #
# * Please do not use real names.          #
# * Have fun!                              #
#                                          #
############################################


2 users currently online.

FLAG: 04907eee5386072670b5107b744b2f8481294377

--- Day changed 02 DES 2020 ---

[09:04] B4tCracK: Hi every1, i read that SecureChat was bought by some megacorp, don't think it's safe anymore. let's talk here instead
[09:40] RADAR: willco
[09:46] eireen89: You made this thing all by yourself?
```

The entire chat log can be found [here](./chat.txt).

* * *

```shell
login@corax:~$ scoreboard 04907eee5386072670b5107b744b2f8481294377
Kategori: 2. Oppdrag
Oppgave:  2.1_beslag_2
Svar:     04907eee5386072670b5107b744b2f8481294377

Flott! Nå vet vi litt mer om gisseltakerne.
Ligger det noen interessante filer eller tekniske spor her også?
```
