# 2.1_beslag_1

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/1_beslag/1/screenshots/a6b5a8142ef947baa332361cedb37b68.png" width="200">

We are presented with some form of authentication, and a channel switcher with 9 channels. The channels play various audio, mostly static, but also some music and a radio show.

---

## Reversing
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

## `data.bin`
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

## `users.db`
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

The `data.mp3` file can be found [here](./data.mp3).

---

```sh
login@corax:~$ scoreboard london_calling
Kategori: 2. Oppdrag
Oppgave:  2.1_beslag_1
Svar:     london_calling

Bra jobbet!
Det hadde vært praktisk om vi visste hvordan de har kommunisert.
```
