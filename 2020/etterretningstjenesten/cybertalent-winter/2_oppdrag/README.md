# 2. Oppdrag ([Detailed version](./DETAILED.md))

We are informed that a group of terrorists have kidnapped an unknown amount of people from a Norwegian research vessel "MS KOLDBJORN". The entire rep can be found in Norwegian [here](./INTREP.txt).

Our priorities are to:
1. Release the hostage(s)
2. Identifiy the kidnappers
3. Hold onto the Norwegian sovereignty of the Queen and Motherland (Note: the translation here might be incorrect, search for "Dronning Maud Land" [here](https://www.stortinget.no/globalassets/pdf/stortingsarkivet/duuk/1946-1965/590622u.pdf))

We are provided with 2 files, a pcap file ([`traffic_log_suspect_3577374.pcap`](./traffic_log_suspect_3577374.pcap)), which contains network traffic from one of the confiscated phones, and an archive ([`phone_dump.tgz`](./phone_dump.tgz)) containing the contents of an Android mobile phone that was confiscated from one of the suspects.

We start with extracting the archive, and find the following files:
```sh
├── data
│   └── data
│       └── no.cybertalent.liberatortoolkit
│           ├── databases
│           │   └── users.db
│           ├── files
│           │   └── data.bin
│           └── shared_prefs
│               ├── ChatActivity.xml
│               └── VaultActivity.xml
└── sdcard
    ├── Android
    │   └── data
    │       └── no.cybertalent.liberatortoolkit
    │           └── files
    │               ├── !aW1wb3J0YW50X2xpbmtz
    │               ├── !c2hvcHBpbmdfbGlzdA==
    │               ├── !dG9kbw==
    │               └── !ZmxhZw==
    └── Download
        └── lt3000.apk

12 directories, 9 files
```

In other words, we have an APK (`sdcard/Download/lt3000.apk`), and the application data for it. Having never done a proper Android/APK reversing I spent some extra time setting up a proper environment. I decided to learn how to use the following tools:

- [Android Studio](https://developer.android.com/studio) with a Android Virtual Device (AVD) image without the Play API
- [JADX](https://github.com/skylot/jadx) to decompile the APK
- [Frida](https://frida.re/) for hijacking and dynamic reverse engineering of the Android application
- [objection](https://github.com/sensepost/objection) for some extra Android explotation fun

With the environment now setup, we can continue our investigation.

---

## [2.1_beslag](./1_beslag)
We start by decompiling the APK with JADX, and find a package named `no.cybertalent.liberatortoolkit`, with the following classes:

```sh
├── ChatActivity.java
├── EditActivity.java
├── helpers
│   ├── ChatHelper.java
│   └── CheckHelper.java
├── MainActivity.java
├── R.java
├── TunerActivity.java
└── VaultActivity.java
```

**Note:** Enabling the `Show Inconsistent code` option in the JADX preference is very helpful.

![ec5edf6fa99b426186ffbce24a8f0b11.png](./1_beslag/screenshots/ec5edf6fa99b426186ffbce24a8f0b11.png)

Looking through the classes we find a found 3 interesting Activity classes: `TunerActivity`, `ChatActivity`, and `VaultActivity`. We also find some helper classes (`ChatHelper` and `CheckHelper`) that check if the application is running in an emulator (`ChatHelper.emu`), and if the Android is rooted (`CheckHelper.is(Context context`).

In addition we find a native library named `libnative-lib.so` with the following functions:
```
ChatHelper.getResponse
VaulActivity.finalize
VaulActivity.undo
```

---

### Installation
Continuing with setting up Android Studio and start an AVD (Android Virtual Device) to install and run the APK. It's important to use an Android image without the Play Store API, as it does not allow us to root. We start the emulator, install the APK, and transfer over the data.


```sh
$ emulator -writable-system -avd cybertalent21_oppdrag -no-snapshot-load -qemu
$ adb devices
List of devices attached
emulator-5554	device
$ adb root
restarting adbd as root
$ adb install lt3000.apk
$ adb push data/* /data/user/0
$ adb push sdcard/* /sdcard
```

When we launch the application we are presented with the following screen.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/screenshots/adcd050632644c9abe2ab93ef7cbf942.png" width="200">

Each button map to each activity we found earlier in the decompiled APK, we therefore assume that each button corresponds to each challenge (`2.1_beslag_x`).

### [2.1_beslag_1](./1_beslag/1)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/1/screenshots/a6b5a8142ef947baa332361cedb37b68.png" width="200">

We are presented with some form of authentication, and a channel switcher with 9 channels. The channels play various audio, mostly static, but also some music and a radio show.

---

### Reversing
Checking `TunerActivity` there is a function `onValueChange` that is called everytime the channel is changed. There is some form authentication that checks the username and password through a SQLite database.
```java
SQLiteDatabase readableDatabase = new c.a.a.d.b(tunerActivity2).getReadableDatabase();
Cursor query = readableDatabase.query("users", new String[]{"password_hash"}, "username = ?", new String[]{charSequence}, null, null, null);
```

In addition, there is some interesting code that does something different on Channel 7 when the user is authenticated, it calls `c.a.a.d.a.b` with two files, `data.bin`, and `data.mp3`. 
```java
if (this.f1160a.getValue() == 7) {
// --- snip ---
    File file = new File(TunerActivity.this.getFilesDir().getAbsolutePath() + "/data.bin");
    File file2 = new File(TunerActivity.this.getFilesDir().getAbsolutePath() + "/data.mp3");
    c.a.a.d.a.b(file, file2, charSequence2.getBytes());
// --- snip ---
```

---

### `data.bin`
Looking back to the files provided with the challenge, we find `data.bin`. It is however containing some form of raw or encrypted data.
There is however no `data.mp3`, looking closer at the decompiled code we find the following function call.
```java
c.a.a.d.a.b(file, file2, charSequence2.getBytes());
```

The `c.a.a.d.a` class contains various functions, shortly put; it uses the provided password and a static salt to generate a `SecretKey` that is used to AES decrypt `data.bin`.
```java
public static final byte[] f1089a = "saltpaamaten".getBytes();
```

And within the `c.a.a.d.a.b(File, File, byte[])` function
```java
Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
SecretKey c2 = c(bArr);
```

We now know that we need to find the user credentials to decrypt the file.

---

### `users.db`
Knowing that the credentials are stored in a SQLite database, we recall that there is a `users.db` file in the phone dump that we can look closer at.

```sh
$ sqlite3 data/data/no.cybertalent.liberatortoolkit/databases/users.db
sqlite> SELECT * FROM users;
_id|username|firstname|lastname|password_hash
1|hungry_hippo_123|Frank|Shorius|2034F6E32958647FDFF75D265B455EBF
```

We now have have a username, name and a hashed password. After a quick Google search, we find out that the password is `secretpassword`, giving us: `hungry_hippo_123:2034F6E32958647FDFF75D265B455EBF:secretpassword`.

Plotting the credentials into the app and scrolling through the channels we get some different audio for Channel 7, a robotic woman repeating the phrase:
> Your flag is london underscore calling.

The `data.mp3` file can be found [here](./1_bedrag/1/data.mp3).

---

```sh
login@corax:~$ scoreboard london_calling
Bra jobbet!
Det hadde vært praktisk om vi visste hvordan de har kommunisert.
```

---

### [2.1\_beslag\_2](./1_beslag/2)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/c31cc360cb9e4ef79c39d8f7bffa223d.png" width="200">

Opening the **Chat** we are presented with a view with `Access Denied` and tells us to log in to https://mobile.cybertalent.no/challenge.

* * *

#### mobile.cybertalent.no

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/5f0651cd892341d1b38be71f045f05fd.png" width="300">

We re-use the credentials from **2.1\_beslag\_1** (`hungry_hippo_123:secretpassword`) to successfully login, and are now presented with some challenge words. The words are refreshed every 10 seconds. Submitting something random calls a `POST /challenge` and returns `Bad response code`.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/eaabfc39f79f4efbaffd3b18d7c0fd6c.png" width="300">

Sending the challenge into the application with `/response TroveShrineMarbleBehavior` gives us the following response, which also returns `Bad response code` when submitting.

* * *

#### Reversing

##### `ChatActivity.onCreate(Bundle)`

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

##### `ChatActivity.q` (`SharedPreferences`)

The `SharedPreferences` can be found in `data/data/no.cybertalent.liberatortoolkit/shared_prefs/ChatActivity.xml` of the phone dump.

```xml
<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
    <string name="nick">hungry_hippo_123</string>
    <string name="token">0000</string>
</map>
```

* * *

##### `ChatActivity.b.run()`

As mentioned, `ChatActivity.onCreate` starts the activity thread with a new instance of the `ChatActivity.b` (`Runnable`) class, which contains the following code for the `ChatActivity.b.run()` function.
`ChatHelper.a(String, String)` is a function that handles the communication between the application and the remote chat API. When this is first run it calls `https://mobile.cybertalent.no/chat?token=0000`, which responds with the text seen in the initial chat screenshot above.

```java
ChatActivity.this.o.post(new a(ChatHelper.a("chat", ChatActivity.q.getString("token", "0000"))));
Thread.sleep(1000);
```

* * *

##### `ChatActivity.a.onKey(View, int, KeyEvent)`

The `onKey` only function calls the `ChatActivity.t()` if the input key is `Enter`.

```java
public boolean onKey(View view, int i, KeyEvent keyEvent) {
    // --- snip ---
    chatActivity.t();
}
```

* * *

##### `ChatActivity.t()`

`t()` is a function that handles all the input (general chat) and commands (`/nick`, `/token` and `/response`) from the input field, as shown below.

* * *

###### `/response <challenge>`

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

###### say

A new thread is started if the input is not a command (begins with a `/`), `ChatActivity.c` is a `Runnable` class.

```java
new Thread(new c(charSequence)).start();
```

* * *

###### `ChatActivity.c.run()`

This function fetches `token` and `nick` from `SharedPreferences`, and then does a `POST https://mobile.cybertalent.no/say` with a simple JSON object:

```json
{
    "content": "<input>",
    "token": "<SharedPreferences.token>",
    "nick": "<SharedPreferences.nick>"
}
```

* * *

##### `ChatHelper.getResponse(String)`

`getResponse` is a native function, that uses functions provided in a provided native library.

```java
public static native String getResponse(String str);
```

Let's take a closer look at the `getResponse` function in the native library that was extracted from the APK.

* * *

###### `libnative-lib.so`

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

##### `ChatHelper.emu`

`emu` is a static boolean variable, that checks if the application is running within an emulator, we therefore need to find a way to override the results of this variable.

```java
public static final boolean emu;

static {
  // --- snip ---
  if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
    emu = false;
  }
  emu = true;
}
```

* * *

#### Solution flow

We now have everything we need to generate a correct response code and get a token, and we know that every response code is only valid for 10 seconds, our flow will be the following:

1.  Override the `ChatHelper.emu` static variable to return `false`.
2.  Login to the `mobile.cybertalent.no` portal via. `/login` with the credentials `hungry_hippo_123:secretpassword`.
3.  Get a challenge code from `/getchall`.
4.  Pass the challenge code into the `ChatHelper.getResponse()` method.
5.  Submit the generated response code to `/challenge` and get our token.
6.  Fetch the chat from `/chat?token=x` with our token.

* * *

##### Automation

To interact with the Android application we can use [Frida](https://frida.re/), which is a dynamic instrumentation toolkit for developers, reverse-engineers, and security researchers. We need to override the value of `ChatHelper.emu` and then call the `ChatHelper.getResponse` function. The Frida [JavaScript API](https://frida.re/docs/javascript-api/) is well documented and we finish our script.

###### [`frida-chat.js`](./1_beslag/2/frida-chat.js)

```js
// --- snip ---
var ChatHelper = Java.use("no.cybertalent.liberatortoolkit.helpers.ChatHelper")
ChatHelper.emu.value = false;
send(ChatHelper.getResponse(challenge));
// --- snip ---
```

* * *

Combining this with some python code automates this entire solution flow for us, in addition the code also launches / spawns the application. Running the script takes about a second and successfully generates a valid token and extracts the chat.

###### [`extract_chat.py`](./1_beslag/2/extract_chat.py)

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

The entire chat log can be found [here](./1_beslag/2/chat.txt).

* * *

```shell
login@corax:~$ scoreboard 04907eee5386072670b5107b744b2f8481294377
Flott! Nå vet vi litt mer om gisseltakerne.
Ligger det noen interessante filer eller tekniske spor her også?
```

---

### [2.1\_beslag\_3](./1_beslag/3)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/3/screenshots/ccf96e06b1e14cd9a87f104ffbe11aa4.png" width="200">

The **Vault** view has a 4 number input (a PIN), and a list of 4 different items, we recall the items being files found from the initial phone dump.

```sh
└── sdcard
    └── Android
        └── data
            └── no.cybertalent.liberatortoolkit
                └── files
                    ├── !aW1wb3J0YW50X2xpbmtz
                    ├── !c2hvcHBpbmdfbGlzdA==
                    ├── !dG9kbw==
                    └── !ZmxhZw==
```

The names are encoded in base 64, decoding them gives us the following names
```
important_links
shopping_list
todo
flag                           
```

* * *

#### Reversing

##### `VaultActivity.onCreate(Bundle)`

When `VaultActivity` is created the `onCreate` method is called, which initializes the 4 NumberPickers and loads in the `SharedPreferences` and checks for the locked state and the hash of the pin. It then ends by creating a new instance of the `c.a.a.d.c` class. The `VaultActivity` has a `onLockerClick` listener that triggers whenever the **UNLOCK**/**LOCK** button is clicked.

```java
// --- snip ---
if (!preferences.contains("locked")) {
    w(false);
}
if (!s.contains("pin_hash")) {
    edit.putString("pin_hash", "null");
}
// --- snip ---
new c(this).execute(new Void[0]);
```

* * *

##### `SharedPreferences`

The `SharedPreferences` can be found in `data/data/no.cybertalent.liberatortoolkit/shared_prefs/VaultActivity.xml` of the phone dump.

```xml
<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
    <boolean name="locked" value="true" />
    <string name="pin_hash">BSzN6uy2dDcolImpMKxffg==</string>
</map>
```

* * *

##### `VaultActivity.onLockerClick(View)`

The function starts by checking `VaultActivity.u()`, which returns `true` if the Vault is in a locked state. It then grabs the value of each number picker (the pin numbers) and first calls `t(pin)`, and then calls the `finalize` function with the result from `t(pin)`.

It then base 64 encodes the first 16 bytes from the `finalize` function, and compares this to the `pin_hash` in our `SharedPreferences`. If it matches, it continues looping through the files above, and passes them to `c.a.a.d.a.b(File, File, byte[])`, with the encoded filename, decoded filename, and the remaining 32 bytes from the `finalize` function, as arguments.

```java
byte[] finalize = finalize(t(r.toString()));
// --- snip ---
if (Base64.encodeToString(Arrays.copyOfRange(finalize, 0, 16), 0).trim().equals(s.getString("pin_hash", null).trim())) {
    while (i5 < length) {
        File file = fileArr[i5];
        if (file.getName().startsWith("!") && u()) {
            c.a.a.d.a.b(file, new File((file.getParent() + "/" + new String(Base64.decode(file.getName().substring(i4), 0))).replace(str4, str3)), Arrays.copyOfRange(finalize, 16, 48));
            // --- snip ---
        }
// --- snip ---
```

#### `c.a.a.d.c`

This is a `AsyncTask` class is called at the end of `VaultActivity.onCreate`. It downloads a file from `https://mobile.cybertalent.no/xtra` (a copy can be found [here](./1_beslag/3/xtra)), and once downloaded executes `VaultActivity.undo` with the data, and then sets the `VaulActivity.t` **variable** (not the function) to the result of the `undo` function.

```java
// --- snip ---
InputStream openStream = new URL("https://mobile.cybertalent.no/xtra").openStream();
// --- snip ---
VaultActivity.t = ByteBuffer.wrap(vaultActivity.undo(bArr2));
```

##### `VaultActivity.undo(byte[])`

`undo` is a native function, that uses functions provided in a provided native library.

```java
public native byte[] undo(byte[] bArr);
```

We could take a close look at the `undo` function in the native library that was extracted from the APK earlier, and we could use Frida to read the return data, but we decide to test out [objection](https://github.com/sensepost/objection).

> `objection` is a runtime mobile exploration toolkit, powered by Frida, built to help you assess the security posture of your mobile applications, without needing a jailbreak.

We start objection and start listening to function calls to `undo`.

```sh
$ objection -g no.cybertalent.liberatortoolkit explore
Using USB device `Android Emulator 5556`
Agent injected and responds ok!

     _   _         _   _
 ___| |_|_|___ ___| |_|_|___ ___
| . | . | | -_|  _|  _| | . |   |
|___|___| |___|___|_| |_|___|_|_|
      |___|(object)inject(ion) v1.9.6

     Runtime Mobile Exploration
        by: @leonjza from @sensepost

[tab] for command suggestions
...o.cybertalent.liberatortoolkit on (pwn: 8.0.0) [usb] #
```

```
# android hooking watch class_method no.cybertalent.liberatortoolkit.VaultActivity.undo --dump-args --dump-backtrace --dump-return

(agent) Attempting to watch class no.cybertalent.liberatortoolkit.VaultActivity and method undo.
(agent) Hooking no.cybertalent.liberatortoolkit.VaultActivity.undo([B)
(agent) Registering job 8769892465034. Type: watch-method for: no.cybertalent.liberatortoolkit.VaultActivity.undo
```
And after launching Vault we see that `undo` function has been called:

```
(agent) [8769892465034] Arguments no.cybertalent.liberatortoolkit.VaultActivity.undo([100,120,48,53,79,103,27,-9,92,-72,-93,-75,14,111,54,80,100,0,112,0,120,52,0,0,0,0,-72,0,29,0,112,0,10,0,-28,...)
(agent) [8769892465034] Return Value: [100,101,120,10,48,51,53,0,79,-51,103,-12,27,...]

```
Saving the return bytestream to a file, we get a `Dalvik dex file`, and can now decompile it with JADX. We see that this `extra` class has a `getData` function that accepts a String `str`, it appends the salt `y_so_salty` to the string and then generates a MD5, and a SHA256 hash out of the string. It then returns them both in the same output, in that order. The class and java source files can be found [here](.).

```java
public class extra {
    private static final String SALT = "y_so_salty";
    public static byte[] getData(String str) {
        sb.append(str);
        sb.append(SALT);
        // --- snip ---
        MessageDigest instance = MessageDigest.getInstance("md5");
        MessageDigest instance2 = MessageDigest.getInstance("sha256");
        // --- snip ---
        return byteArrayOutputStream.toByteArray();
```

* * *

##### `VaultActivity.t(String)`

The argument passed into the function is the PIN (i.e. `"0000"`, `"1337"`). The function attempts to load the `VaultActivity.t` **variable** (not the function) into memory as a class and call the `extra.getData(String)` method.
We now know that the `getData` function returns a MD5 digest, followed by a SHA256 digest, which is exactly what this function (`t(String)`) does as well, it is only a wrapper around the `getData` function call.

```java
public final byte[] t(String str) {
    // --- snip ---
    cls = new InMemoryDexClassLoader(t, getClassLoader()).loadClass("com.example.extra.extra");
    // --- snip ---
    method = cls.getMethod("getData", String.class);
}
```

* * *

##### `VaulActivity.finalize(byte[])`

`finalize` is a another native function, this time we use Ghidra to take a closer look at the function from the library that was extracted from the APK.

```java
public native byte[] finalize(byte[] bArr);
```

* * *

###### `libnative-lib.so`

We find that that the native method of `finalize` (`Java_no_cybertalent_liberatortoolkit_VaultActivity_finalize`) calls the static boolean method `CheckHelper.is(Context)`, and then checks if the `/proc/self/status` file contains `TracerPid: 0`, to finially return some result back to the caller. `TracerPid` returns the [PID of process tracing this process (0 if not being traced)](https://man7.org/linux/man-pages/man5/proc.5.html).

In other words this function seems to be doing additional checks that we need to bypass.

```c
// --- snip ---
uVar5 = _JNIEnv::CallObjectMethod((_jobject *)param_1,p_Var6,uVar5);
p_Var4 = (_jmethodID *)
       (**(code **)(*param_1 + 0x30))
                 (param_1,"no/cybertalent/liberatortoolkit/helpers/CheckHelper");
uVar7 = (**(code **)(*param_1 + 0x388))
                (param_1,p_Var4,&DAT_00100a92,"(Landroid/content/Context;)Z"); // DAT_00100a92 = "is"
cVar1 = _JNIEnv::CallStaticBooleanMethod((_jclass *)param_1,p_Var4,uVar7,uVar5);
// --- snip ---
__fd = __open_2("/proc/self/status",0);
// --- snip ---
```

* * *

##### `CheckHelper.is(Context)`

The `is` function simply returns `true` if it believes we have a rooted Android device by checking various known directories that a rooted Android device has access to.

```java
public class CheckHelper {
    public static boolean is(Context context) {
    	// --- snip ---
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            if (new File(a.b(strArr[i], string)).exists()) {
                return true;
            }
        }
        return false;
    }
}
```

* * *

##### `c.a.a.d.a.b(File, File, byte[])`

When the correct PIN has been entered in `onLockerClick` it starts looping through all the encrypted files and calls this (`c.a.a.d.a.b`) function. We recall seeing this exact same function being used from the `TunerActivity` challenge, and therefore know that it is used to decrypt files, where the third argument (`byte[]`) is the key. In our case this key would be the SHA256 part of the TODO.

* * *

#### Solution flow

We now have everything we need to find the PIN and decrypt the files in the Vault. We can solve this challenge without running the application, but that is no fun. Our flow will be the following:

1.  Override the `CheckHelper.is(Context)` function to return `false`.
2.  Get an instance of `VaultActivity`.
3.  Loop through the numbers 0000 - 9999.
4.  Use the number as PIN and pass it into `VaulActivity.t(String)`
5.  Pass the result to `VaultActivity.finalize()`.
6.  Base 64 encode the first 16 bytes of the resultt and compare it to the `pin_hash` variable from the `SharedPreferences`.
7.  If it matches, stop the bruteforcing and print out the PIN.
8.  Input the PIN and unlock the Vault.

* * *

##### Automation

We now use [Frida](https://frida.re/) again to automate our solution flow. We could go even further with this script by launching the Vault view automatically, and executing the unlock, instead of just outputting the PIN.

###### [`frida-vault.js`](./1_beslag/3/frida-vault.py)

```js
// --- snip ---
// Override the `CheckHelper.is` function.
var CheckHelper = Java.use("no.cybertalent.liberatortoolkit.helpers.CheckHelper");
CheckHelper.is.implementation = function() {
	return false;
}
// --- snip ---
for (var i = 0; i <= 9999; i++) {
    var finalize_result = instance.finalize(instance.t(pin));
    // --- snip ---
    if (b64 === "BSzN6uy2dDcolImpMKxffg==") {
    	console.log("Found PIN:", pin);
    	return;
    }
}
```

###### [`unlock_vault.py`](./1_beslag/3/unlock_vault.py)

* * *

Executing the script and letting it run for a few seconds results with the PIN `5693`, and we can now open the various files.

```sh
$ python unlock_vault.py
Loaded frida-vault.js
Found VaultActivity object instance: no.cybertalent.liberatortoolkit.VaultActivity@d097244
Starting bruteforce...
Found PIN: 5693
```

* * *

###### Todo

```
Buy xmas presents
Find an xmas tree
Order airline tickets
```

###### Flag

```
d025828e7d38c133d3224154ae7785b344536761
```

###### Shopping list
```
1 Milk
1 Bread
6 Eggs
1000 rounds 7.76mm
10 HE grenades
4 Yoghurt
1 Butter
```

###### Important links

```
Hidden service URL:
http://fileserver/files/onion_name.txt
 
Scada client binary:
http://fileserver/files/082391170510954df0c28af1ebb9380a
Rembember this only works on the internal network, not from the outside.
```

* * *

```sh
login@corax:~$ scoreboard d025828e7d38c133d3224154ae7785b344536761
Kanskje det ligger noen interessante filer her?
```















## [2.2_seatheworld](./2_seatheworld)

### [2.2_seatheworld](./2_seatheworld/1)

Continuing our investigation we start taking a look at the provided network traffic dump file `traffic_log_suspect_3577374.pcap`, and find DNS query requests done to a `ns1.seatheworld.tld` server.

After looking at the list of [DNS records](https://en.wikipedia.org/wiki/List_of_DNS_record_types) we attempt to perform a [DNS zone transfer (AXFR)](https://en.wikipedia.org/wiki/DNS_zone_transfer), resulting in the record `_flagg.nusse.seatheworld.tld`, we also take mental a note of the DNS record for `nusse.seatheworld.tld`.

```
login@corax:~$ dig @ns1.seatheworld.tld seatheworld.tld AXFR
_flagg.nusse.seatheworld.tld. 600 IN	TXT	"03e5e4ecc1c8d69eff7f2de0a4367724"
nusse.seatheworld.tld.	600	IN	A	203.0.113.23
```

---

```sh
login@corax:~$ scoreboard 03e5e4ecc1c8d69eff7f2de0a4367724
Bra jobbet!
Hva kan det være denne maskinen brukes til?
```

### [2.2_seatheworld_aksess](./2_seatheworld/aksess)

We start by doing a nmap scan on the `nusse.seatheworld.tld` server and find references to `IBM OS/390 ftpd V1R10`, `IBM Telnet TN3270`, and `IBM httpd V5R3M0`.

---

#### 80/tcp - IBM httpd V5R3M0

We start by using `socat` to tunnel the traffic through SSH `socat TCP-LISTEN:1080,reuseaddr,fork "EXEC:ssh cybertalent nc nusse.seatheworld.tld 80"`. Another and a better solution to this is to use [sshuttle](https://github.com/sshuttle/sshuttle).

The **CONFIGURATION AND ADMINISTRATION FORMS** page used HTTP Basic authentication, we look for default IBM credentials and find the following [documentation](https://www.ibm.com/support/knowledgecenter/SSTQBD_12.0.1/com.ibm.zsys.rdt.guide.adcd.doc/topics/userids.html).

| User ID | Password |
| ------- | -------- |
| ADCDMST (RACF® special authority) | SYS1 or ADCDMST |
| IBMUSER (RACF special authority) | SYS1 or IBMUSER |
| SYSADM (DB2® and RACF special authority) | SYS1 or SYSADM |
| SYSOPR (DB2 and RACF special authority) | SYS1 or SYSOPR |
| ADCDA - ADCDZ | TEST |
| WEBADM | WEBADM |
| OPEN1 through OPEN3 | SYS1 |
| ZOSMFAD |	ZOSMFAD |

Testing the `WEBADM:WEBADM` credentials we successfully log in to the admin web interface, but are prompted to change password, and do so.

---

#### 23/tcp - IBM Telnet TN3270 (TN3270E)

> The [IBM 3270](https://en.wikipedia.org/wiki/IBM_3270) is a family of block oriented display and printer computer terminals introduced by IBM in 1971 and normally used to communicate with IBM mainframes.

And after reading up on the official [introduction](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.znetwork/znetwork_261.htm) and some [documentation](
https://www.ibm.com/ru/software/info/students/zm9/zcontest1.pdf) we find [x3270](http://x3270.bgp.nu/):

> x3270 is an IBM 3270 terminal emulator for the X Window System and Windows. It runs on most Unix-like operating systems -- e.g., Linux, Mac OS X, Solaris and Cygwin. It also runs natively on Windows. 

We also find 3270 related commands installed on the `corax` host.
```sh
login@corax:~$ x3270if
usage:
 x3270if [options] "action[(param[,...])]"
// --- snip ---
```

After installing x3270 locally, we connect to the telnet port that we have proxied through `socat`.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/6aeef77b6f344fd2b054f784479a143f.png" width="300">

`localhost` does not work, so `127.0.0.1` had to be used instead. After connecting we are presented with a developer image of the IBM mainframe operating system [z/OS](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zmainframe/zconc_opsyszosintro.htm). We take a note of the `LOGON` command example (`LOGON IBMUSER`).

---

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/6de1406078d54e97be4cd95d622b198b.png" width="300">

Entering `LOGON` we are presented with the `TSO/E LOGON` view.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/5b13118bac2741d5a72b0b8382958f19.png" width="300">

With the hint from the initial page (`LOGON IBMUSER`), we recall the [documentation](https://www.ibm.com/support/knowledgecenter/SSTQBD_12.0.1/com.ibm.zsys.rdt.guide.adcd.doc/topics/userids.html) containing default credentials and enter `IBMUSER:SYS1` and get the first flag.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/c98ebc2593b84f37b5dcbcecf5681968.png" width="300">

---

```sh
login@corax:~$ scoreboard RETRO_IS_THE_NEW_MODERN
Navn på gisseltakerne burde være tilgjengelig et sted på denne stormaskinen.
```

### [2.2_seatheworld_booking](./2_seatheworld/booking)

From the first view we get information on how to load the application.

```
START BOOKING APPLICATION (IBMUSER ONLY):
LOAD IBMUSER.SEATW.LOAD(BOOKING)
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/8a8d4fd95c4542009d56869b7e3b4a31.png" width="300">

We recall seeing a booking reference code from seized chat log from `07 DES 2020`: `WJWQX`.

```
--- Day changed 07 DES 2020 ---

[08:27] hungry_hippo_123: btw can't find my booking reference
// --- snip ---
[11:26] B4tCracK: and duh, yeah, you need the reference. i got it here two secs
[12:08] B4tCracK: WJWQX
```

Entering the booking reference code we are given information regarding `Frank Shorius`'s booking.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/d79a39aa11a64fd2bfcff18e7d122b58.png" width="300">

The system does not allow searching through older bookings, so I attempted to write a bruteforce script (see below) without luck. Looking back to the first view, we recall seeing a Skype contact address and attempt to do some _social engineering_.

```
SKYPE CONTACT ADDRESS:
LIVE:.CID.8F97B1C571970F8C
```
---

#### Social engineering

Adding the ID we are welcomed by a tech support person. We tell them that we lost the other booking references and simply ask them for the other names.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/a8b5a71800e94e8390a31cda10fd512e.png" width="500">
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/ab55fd619c3441f8a47459391c5d9791.png" width="500">
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/2be2a9b3c7c446eb8c26ac3d95ca95e8.png" width="500">
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/65ec4da2266f404384969aa6ba3f1724.png" width="500">
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/68e6d539ad894a728d7659076cfc6fa3.png" width="500">

```
Øvrige navn på den bookingen er:

Joe Farnaby
Eireen Farnaby
Dillian Cruise

Det er ingen flere reservasjonsnummer tilknyttet denne reisen. 
```
---

#### Other bookings

We use the provided names to find the other bookings to see if we find any other useful information, and finially submitting one of the names as a flag.

```
 SEARCHING FOR TRAVELS BY JOE FARNABY...
  
 BOOKING: WTHHX                   NAME: JOE FARNABY 
 JOURNEY: AMS 2020-12-14 18:20    TXA 2020-12-14 22:40
 **********************************************************
   FOUND 1 RECORDS 
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/d6b9f0f6876f402d898f432077a622cc.png" width="300">

```
 BOOKING: DY6MY                   NAME: EIREEN FARNABY 
 JOURNEY: AMS 2020-12-14 18:20    TXA 2020-12-14 22:40
```

```
 BOOKING: UHKVP                   NAME: DILLIAN CRUISE
 JOURNEY: AMS 2020-12-14 18:20    TXA 2020-12-14 22:40
```

---

```sh
login@corax:~$ scoreboard joe farnaby
Bra jobbet med å identifisere gisseltakerene!
Mon tro om vi hadde fått enda mer ut av en teknisk tilgang også?
```

---

#### Bruteforce

After attempting to find the booking reference codes / names on the system without luck, we attempt to bruteforce the reference codes for fun (without luck of course) with [py3270](https://pypi.org/project/py3270/).

You can find the bruteforcer [here](../9000_madness/2_seatheworld_bookings_bruteforcer).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/ec55a1a099714a3d82164be6cb3cfc3d.gif" width="400">


### [2.2_seatheworld_ekstra](./2_seatheworld/ekstra)

We read up on the offical [documentation](https://www.ibm.com/support/knowledgecenter/SSLTBW) of the IBM mainframe given in the first view. We are also given a list of useful commands, and take a special note of `ISPF` and `SUBMIT`.

---

#### LISTC
Listing the data sets we find the following data sets under ``IBMUSER.SEATW``:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/77dab66b0c3b4540a6e2cd51a8c26e9f.png" width="300">

---

#### ISPF

> [ISPF](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zconcepts/zconc_whatisispf.htm) is a full panel application navigated by keyboard. ISPF includes a text editor and browser, and functions for locating and listing files and performing other utility functions. 

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/aa2a33f3b56940b8bfdd310a8e93251f.png" width="300">

---

#### `IBMUSER.SEATW.SRC`

Knowing that we can view the data sets, we take a closer look at the `IBMUSER.SEATW.SRC` data set, and find 3 files, `C`, `CIPHER`, and `JCL`.

```
   Menu  Functions  Utilities  Help                                             
 ────────────────────────────────────────────────────────────────────────────── 
 VIEW     IBMUSER.SEATW.SRC                                  Row 00001 of 00003
 Command ===>                                                  Scroll ===> PAGE
    Name     Prompt          Size    Created           Changed            ID   
 . C                          327   2020/12/08   2020/12/16 12:47:42    IBMUSER 
 . CIPHER                       1   2020/12/09   2020/12/09 08:35:48    IBMUSER 
 . JCL                          6   2020/12/08   2020/12/14 22:41:25    IBMUSER 
   **End**                                                                      
```

We input `SELECT C` (a copy of the source code can be found [here](../../9000_madness/2_seatheworld_data_set_downloader/datasets/IBMUSER.SEATW.SRC(C))) and find the source code of the booking application. Most interesting is the `SKIP_FLAG` definition on line #5 and the IF statement on line #317 that stops the `print_flag()` function from executing.

```c
000005 #define SKIP_FLAG 1    
// --- snip ---
000317     if (SKIP_FLAG) 
000318         printf( 
000319             "\n***********************************************" 
000320             "\n FLAG: NOT PRINTING DUE TO COMPILE TIME OPTION" 
000321             "\n***********************************************\n\n"); 
000322     else 
000323         print_flag(); 
// --- snip ---
```

We also dump the other data sets, you can find them [here](../9000_madness/2_seatheworld_data_set_downloader/datasets).

---

#### EDIT

We now want to change the value of `SKIP_FLAG` to `0` so that the `print_flag()` is executed. We go back to the ISPF menu and use the same method as previously, but with the `VIEW` command this time, and edit the source file, replacing `1` with a `0`: `#define SKIP_FLAG 0`

---

#### SUBMIT

Now we need to compile this, and go back to the main menu and execute the `SUBMIT` and provide the [Job control language (JCL)](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zjcl/zjclc_basicjclconcepts.htm) file to compile the application.
> Job control language (JCL) is a set of statements that you code to tell the z/OS® operating system about the work you want it to perform. Although this set of statements is quite large, most jobs can be run using a very small subset. Learn about essential and most frequently used JCL statements and parameters, as well as coding techniques.
> 
```
SUBMIT IBMUSER.SEATW.SRC(JCL)
 IKJ56250I JOB STWCOMPL(JOB01125) SUBMITTED
 READY
```

---

#### Flag
Loading the application again gives us the final flag.

```
LOAD IBMUSER.SEATW.LOAD(BOOKING) 
  FLAG: c0da14705d803523d572a0480a51d61c
```

---

```
Gratulerer! Du har utvist grunnleggende kunnskap om IBM stormaskiner.
Det er behov for kunnskap om en rekke forskjellige systemer i en jobb hos oss,
og evnen til å sette seg inn i nye (og gamle!) ting er viktig.

En stor takk til IBM Norge som lot oss benytte z/OS for årets CTF!
```

---

#### Data set downloader
There is a way to download the data sets in the mainframe through the UNIX shell, we therefore create a [data set downloader](../9000_madness/2_seatheworld_data_set_downloader/download_datasets.py) data connects to the host through SSH and transfers the data sets from the main frame, to the host, and finally to localhost. More information regarding copying files can be found [here](https://www.ibm.com/support/knowledgecenter/SSLTBW_2.4.0/com.ibm.zos.v2r4.bpxa400/cpfilemem.htm).

```
IBMUSER:/u/ibmuser >cp "//'ibmuser.seatw.src(c)'" example
IBMUSER:/u/ibmuser >cat example | head
#include <stdio.h>
```

---

#### Analyzing the bookings
Now that we have a data set downloader, we use it to download the `BOOKING` data set, the script can be found [here](../9000_madness/2_seatheworld_bookings_parser/parse_bookings.py).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/7430b4b8e93b4bc2a9d68cea3ba1eb6e.png" width="300">













## [2.3_scada](./3_scada)

### [2.3_onion](./3_scada/onion)
_This task was possible to solve beforehand by doing a simple nmap scan on the same network that `corax` was on._ 

With the help of the extracted `Important links` file from the Vault in the Android application, we find the following URL.

```
Hidden service URL:
http://fileserver/files/onion_name.txt
```

Downloading this we are presented with a [Tor (anonymity network)](https://www.torproject.org) URI: `tpcoe34czvwcm2uqsthc4xviy6hkngzexo2qhstwhh42itwplbqmm6id.onion`. Opening it in the Tor browser gives us the `scada_frontend`.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/onion/screenshots/6232a528e67e4d2aa3102f540dfa4096.png" width="500">

Checking the Javascript console in the browser, we see the following log, containing our flag. In addition it tells use that we can use the host `scada` instead of the onion host for a stable connection.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/onion/screenshots/5d8f1ba6d119409295ebf6413a9a7889.png" width="500">

---

```sh
login@corax:~$ scoreboard b4ba373b44abfb94763e54297d3d19d8
Du har fått tilgang til gisseltakerenes bakdør inn i styringssystemet. Klarer du å styre systemet selv?
```

### [2.3_scada_aksess](./3_scada/aksess)

The previous flag gave us a hint regarding a _backdoor_ (bakdør).

```
Du har fått tilgang til gisseltakerenes bakdør inn i styringssystemet.
Klarer du å styre systemet selv?
```

And from the chat log `07 DES 2020`, we see that they talk about a backdoor and usernames.

```
[18:27] B4tCracK: for future reference; your username to the backdoor is the first three letters of your first name followed by the
[18:27] B4tCracK: length of your username here and ending with your last name. The capital letters of your name stays capital.
```
---

#### Usernames
We have all the information we need to find the usernames for each person and generate the following list.

| Username           | Full name      | Backdoor username |
| ------------------ | -------------- | ----------------- |
| hungry_hippo_123   | Frank Shorius  | Fra16Shorius      |
| eireen89           | Eireen Farnaby | Eir8Farnaby       |
| RADAR              | Joe Farnaby    | Joe5Farnaby       |
| B4tCracK           | Dillian Cruise | Dil8Cruise        |

----

#### Enumeration

We now need to find the actual backdoor. We already know there is a web application (`scada_frontend`) running on the `scada` host, and decide to scan it with nmap. We see two additional ports, `1338` and `1339`, and see that port `1338` requests a username.

---

#### Backdoor
Manually connecting to port `1338` promps for a username, and if we input something random we see that the username is not recognized. However, if we input one of the usernames from our list, we see that Frank's user has been revoked answer. We therefore assume that this port is the backdoor that we need to use.

```sh
login@corax:~$ nc scada 1338
Username: test
That username is not recognized
We were unable to log you in..
```
```sh
login@corax:~$ nc scada 1338
Username: Fra16Shorius
User access revoked..
We were unable to log you in..
```

--- 

#### Multi-factor authentication

Connecting to the backdor using one of the other usernames we are prompted for a PIN that has been sent to the users' phone via. SMS.
```sh
login@corax:~$ nc scada 1338
Username: Joe5Farnaby
We have now sent a login PIN to you via SMS
Enter PIN: 111
..the provided PIN was not correct.
```
Attempting to add more than 3 digits result with the same error message appended multiple times, depending on how many extra digits we add, indicating that the connection is held open. 
```sh
login@corax:~$ nc scada 1338
Username: Joe5Farnaby
We have now sent a login PIN to you via SMS
Enter PIN: 1111
..the provided PIN was not correct.
..the provided PIN was not correct.
```
```sh
login@corax:~$ nc scada 1338
Username: Joe5Farnaby
We have now sent a login PIN to you via SMS
Enter PIN: 11111
..the provided PIN was not correct.
..the provided PIN was not correct.
..the provided PIN was not correct.
```
---

#### Bruteforce
We write a quick and dirty [Python script](./3_scada/aksess/access_backdoor.py) that runs a loop that tries to login with the username `Joe5Farnaby`. It is possible to bruteforce this PIN as the connection after the first attempt is still open, and continue allowing the client to send data. Running this script gives us a welcome back message and the flag is included.

---

```sh
login@corax:~$ scoreboard 6b7e34a771b84d0863ce3c7dbd887463
Godt jobbet! Nå må du bare hjelpe gisselet med å komme seg ut av bygningen!
```

### [2.3_scada_gissel](./3_scada/gissel)

With the help of the extracted `Important links` file from the Vault in the Android application, we find a URL to a `Scada client binary` and proceed with downloading it.
```
Scada client binary:
http://fileserver/files/082391170510954df0c28af1ebb9380a
```
---

#### Scada client binary
Taking a closer look at the binary we see that it attempts to send instructions to a server.

```sh
$ ./082391170510954df0c28af1ebb9380a scada 1339
Sending instruction number 000
Sending instruction number 001
Sending instruction number 002
```

---

##### Network packets

We proceed with starting Wireshark and forward the port to our local machine and attempt to execute the binary again. We notice a packet with the data `020431313132` being sent every time the binary prints a `Sending instruction number`, the data never changes. Transforming this data `02 04 31 31 31 32` gives us the following `? ? 1 1 1 2`.

![f288b72a5f014423a1457dba0b5ddad5.png](./3_scada/gissel/screenshots/f288b72a5f014423a1457dba0b5ddad5.png)

---

##### Reversing

Opening the binary in Ghidra we see that the logic in the `main` function calls a `make_instruction` function with the parameter `2`, `11`, and `12`, and then sends it to the specified host. 

We notice that the first parameter, `2`, matches the first value in our packet data `02`, and in addition, the ASCII hex code for the number `1` is `31`, and `2` for `32`. Giving us ``2 ? 11 12`` as our data, matching the arguments sent to `make_instruction(2,11,12...`. We also assume that the 2nd value in the packet data is the length of the following data `len(1112) = 4`, thus we have `2 4 11 12`.

The `local_c` variable is simply a loop increment counter, which is the number printed when running the binary. We also take a mental note of the `sleep(5)`, as this will be important for later.

```c
 while( true ) {
    local_10 = connect_to_server(param_2[1],param_2[2],param_2[2]);
    local_14 = make_instruction(2,11,12,&local_20,&local_28);
    // --- snip ---
    printf("Sending instruction number %03d\n",(ulong)local_c);
    sVar1 = write(local_10,local_20,local_28);
    // --- snip ---
    sleep(5);
    local_c = local_c + 1;
  }

```

Furthermore, we double check what we found below by looking in the `make_instruction` function. And confirm that the binary generates an identical instruction that is sent for each loop increment. This is why we never saw the packet data change in the network traffic. 
```c
make_instruction(undefined param_1,byte param_2,byte param_3,void **param_4,long *param_5)
  iVar1 = snprintf((char *)&local_1d,5,"%02d%02d",(ulong)param_2,(ulong)param_3);
  if (iVar1 == 4) {
  // --- snip ---
```

Knowing now that the client library sends some kind of instructions to the backdoor, we need to figure out what these instructions mean.

---

#### Scada frontend
Going back to the frontend and, we notice that the red box moves around, and some of the "walls" are changing colors.
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/gissel/screenshots/a0111cef11e04d948f7de4e79961e864.gif" width="500">

Taking a closer look at the network tab of the browser developer tools we see WebSocket communication between the frontend and a server running on port `1339`. Notice also that the data in these packet contain of some ID (`0005`) and the word `locked`.
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/gissel/screenshots/bc0325ae4d264c00851b63c689917fa3.png" width="700">

---

##### Files
We continue by quickly downloading the web application files with `wget -r scada`, and notice that the web application is in fact a [Vue.js](https://vuejs.org/) application and **the [source maps](https://developer.mozilla.org/en-US/docs/Tools/Debugger/How_to/Use_a_source_map) are available**. Put shortly, source maps are there mainly for developers, but it also allows visitors to view the "source code" of your web application, instead of having to deobfuscate/unminify it first.

You can find an example where I used the same technique for PST's (Norwegian Police Security Service) NPST 2020 competition [here](https://github.com/mklarz/npst2020-src).

The files can be found [here](./3_scada/gissel/scada_frontend/packed)

##### Unpacking the source code
As we are only interested in the web application, we ignore the chunk-vendors, and continue with unpacking.

```sh
$ unpack ./unpacked app.0459ce51.js.map
--- snip ---
🎉  All done! Enjoy exploring your code 💻
```

And are yet again presented with new files (they can be found [here](./3_scada/gissel/scada_frontend/unpacked)), and continue to dig deeper.

---

##### Scada frontend source code

Looking at `src/components/Scada.vue` we find the following HTML, which passes the current data into a `Map` component, and then prints the flag if it is set. We can also see how the web application connects with to the WebSocket we found earlier. If the WebSocket data packet includes the word `flag`, the data is parsed and the variable is set, thus printing out the flag.  

```html
<template>
	<div class="scada">
		<Map v-if="this.json_data !== ''" v-bind:data='JSON.parse(this.json_data)'/>
		<h1 v-else>Currently no SCADA data</h1>
	</div>
	<footer class="flag" v-if="this.flag !== ''">
	  <pre>Prisoner managed to escape. Flag: "{{ flag }}"</pre>
	</footer>
</template>
```

```js
// snip
let sock = self.ws ? self.ws : new WebSocket(`ws://${location.hostname}:1339/`);
let magic_message = "POm8HLEmXJ1L2b1EhaXvdg==";
sock.onopen = function() {
	self.ws = sock;
	//console.log("[open] Conn established");
	//console.log(`Sending to server ${magic_message}`);
	sock.send(magic_message);
};
sock.onmessage = function(e) {
	//console.log(`[message] Data from server ${e.data}`);
	if (e.data.includes("flag")) {
		self.flag = JSON.parse(e.data)["flag"]
	}
	self.json_data = e.data;
};
// snip
},
```

Continuing with our treasure hunt, we look at the data passed to the `Map` (`src/components/Map.vue`) component, and see that the component uses [the data](./3_scada/gissel/scada_frontend/websocket.json), which we found earlier in the WebSocket connection. We look for the number we found in the binary, `1112`, and see that it's here as well. As the value of these keys are either `locked` or `unlocked`, we assume that they are doors in map.

```html
--- snip ---
<Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
<Tile v-bind:state='"ver-"+data["0005"]'/>
<Tile v-bind:state='"hor-"+data["1112"]'/>
--- snip ---
```

Knowing this, we try to execute our binary once again, and notice one of the doors (door ID `1112`, see map below) changing colors from red to green.

Having the source code of the frontend it was very feasible to generate a map with each door ID mapped.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/gissel/screenshots/73b4f3df7c2a45b5bde670cd6bf0199b.png" width="500">

Looking at the animated picture of the map from earlier, we can see that the doors change their states from red, to green, to yellow, and finially back to red. Each of the 4 corners in the map have doors opening and closing, all except of the top right corner, where the hostage is located within a cell. We therefore assume that the terrorists patrol each their own corner.

----

#### Custom Scada client
After some quick testing, we map the possible door states to their own ID.
| ID | State    | 
| -- | -------- |
| 00 | Locked   |
| 01 | Unlocked |
| 02 | Open     |

Going back to the network packet for the original Scada Client Library, we recall the data being in the format `020431313132` or `241112`, and we now have a complete overview of how to open and close each door

| State ID | Length | Door ID  |
| -------- | ------ | -------- |
| 02       | 04     | 31313132 |
| 2        | 4      | 1112     |

Continuing with our progress, we decide to create our [own version](./3_scada/gissel/scada_client.py) of the Scada Client. Ideally it should use the data from the websocket to decide which door to open and close, but doing it manually works fine.

---

#### Rescue operation

We can finially start our rescue operation and only need to find a path that we want to use, and be careful to not step into the view of either the motion detector, or the patrols.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/gissel/screenshots/5d3bf4df9c45481e8702bb811f09feba.png" width="500">

Starting the client and recalling from earlier, that the instruction had a sleep time of 5 seconds (`sleep(5)`), we wait for each door to close (about 5 seconds), before continuing to the next door. This is assuming that the hostage needs time to move between the doors.

```
$ python scada_client.py scada 1338
--- snip ---
>>>>>>>>>>>>>>>> OPEN DOORS <<<<<<<<<<<<<<<<
(press 'q' to go back to the menu)
Door ID: 0005
[*] Done!
--- snip ---
>>>>>>>>>>>>>>>> OPEN DOORS <<<<<<<<<<<<<<<<
(press 'q' to go back to the menu)
Door ID: 3499
[*] Done!
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/gissel/screenshots/5ca9d47be3fa4285b5c129f25011a9e7.png" width="500">

---

```
login@corax:~$ scoreboard edf5691e9a719cf5d7c23954ef90f94e
Gratulerer! Du klarte å frigi gisselet, og har løst årets oppdrag!
I en jobb i Etterretningstjenesten vil du få mulighet til å bidra til å løse
et viktig samfunnsoppdrag med ekte situasjoner og "skarpe" oppdrag.

Vi har laget denne CTF-en for å tiltrekke oss søkere til vårt talentprogram
i 2021.

Talentprogram cyberoperasjoner er et unikt kursopplegg som tilbys kandidater
med riktig motivasjon, kompetanse og personlige egenskaper.
Ved å løse dette oppdraget har du bevist at du har motivasjon og
kompetanse som vi trenger. Du trenger ikke kunne alt fra før - gjennom
talentprogrammet blir du skikkelig god. Vi oppfordrer deg til å søke!

Talentprogrammet er bare én av mange veier inn i tjenesten. Vi har behov
for medarbeidere med et bredt spekter av bakgrunn og kompetanse. Vil du vite
mer om hvilke muligheter som finnes for en karriere i Etterretningstjenesten,
så kan du sende en e-post til karriere@etj.no. Vi håper å høre fra deg!
```

