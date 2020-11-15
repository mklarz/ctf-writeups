# Hack4Troops CTF 2020
## Web
### BLUESET

Website with a pong, which requires you to win 10,000 times to get the flag. View the source of the website and find `game.js`, which contains obfuscated Javascript code.
```bash
$ cat game.js
var _0x14e3=['r1bYyxK=','BxzKsxm=','qKfuCLC=','zhjHDW==','tLfkteW=','CM4GDgHPCYiPka==',
'mtv8mtn8nq==','Dgzcywu=','yMLUza==','rgj6A0e=','BxD4Cge=','AwnQrwe=','oxWXnhWXmNWXmq==',
--- snip ---
```

"Beautify" the Javascript with a service such as https://beautifier.io/.

Search for `flag` through the file:
```bash
$ cat nice.js | grep -i flag
var flag1 = "D";
var flag2 = "O";
var flag3 = "D";
var flag4 = "G";
var flag5 = "E";
var flag6 = "_";
var flag7 = "T";
var flag8 = "H";
var flag9 = "I";
var flag10 = "S";
```
`FLAG:DODGE_THIS`

### SHATTEREDTEMPLES
Use [gobuster](https://github.com/OJ/gobuster) to check if we can find any directories:
```bash
$ gobuster dir --expanded --threads 4 --timeout 30s -k \
-w ~/code/ctf/lists/dirb/wordlists/common.txt -k \
-u https://webchallenges.ctf.hackfortroops.org/shatteredtemples/
```

Giving us `https://webchallenges.ctf.hackfortroops.org/shatteredtemples/files` after a while.
Run gobuster again, but with the new URL instead.

After a while this gives us `https://webchallenges.ctf.hackfortroops.org/shatteredtemples/files/password`
```bash
wget https://webchallenges.ctf.hackfortroops.org/shatteredtemples/files/password && cat password
FLAG:ANYONE_CAN_BE_A_FISHERMAN
```
`FLAG:ANYONE_CAN_BE_A_FISHERMAN`

## Forensics / Crypto / Reverse
### BINGOBOX
> Retrieve the flag from the attached GNU/Linux x64 binary.

```bash
$ file binary
bingobox/binary: ELF 64-bit LSB executable, x86-64, version 1 (GNU/Linux), 
statically linked, BuildID[sha1]=73a2352f1a9e53f47e0e3b952e8d35626e12f142,
for GNU/Linux 3.2.0, not stripped
```

```bash
$ ./binary
Input the password: test
```

Open Ghidra, search for `Input the password`:
![72d53f24.png](attachments/72d53f24.png?raw=true)

Check out `0054c005`, which is inside a `prompt` function, decompile this:

#### prompt
```c
/* WARNING: Unknown calling convention yet parameter storage is locked */
/* prompt() */

undefined8 prompt(void)

{
  int iVar1;
  basic_ostream *this;
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_c8 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_a8 [47];
  allocator<char> local_79;
  basic_string *local_78 [4];
  basic_string *local_58 [4];
  basic_string *local_38 [5];
  
  operator<<<std--char_traits<char>>((basic_ostream *)cout,"Input the password: ");
  basic_string(local_a8);
                    /* try { // try from 004049ec to 004049f0 has its CatchHandler @ 00404bb1 */
  operator>><char,std--char_traits<char>,std--allocator<char>>
            ((basic_istream *)cin,(basic_string *)local_a8);
  allocator();
                    /* try { // try from 00404a12 to 00404a16 has its CatchHandler @ 00404b8c */
  basic_string((char *)local_c8,(allocator *)"V$Lvk");
  ~allocator(&local_79);
                    /* try { // try from 00404a3b to 00404b5a has its CatchHandler @ 00404b9d */
  operator+<char,std--char_traits<char>,std--allocator<char>>
            ((basic_string *)local_78,(char *)local_c8);
  operator=(local_c8,local_78);
  ~basic_string((basic_string<char,std--char_traits<char>,std--allocator<char>> *)local_78);
  operator+<char,std--char_traits<char>,std--allocator<char>>
            ((basic_string *)local_58,(char *)local_c8);
  operator=(local_c8,local_58);
  ~basic_string((basic_string<char,std--char_traits<char>,std--allocator<char>> *)local_58);
  operator+<char,std--char_traits<char>,std--allocator<char>>
            ((basic_string *)local_38,(char *)local_c8);
  operator=(local_c8,local_38);
  ~basic_string((basic_string<char,std--char_traits<char>,std--allocator<char>> *)local_38);
  iVar1 = compare(local_a8,(basic_string *)local_c8);
  if (iVar1 == 0) {
    this = operator<<<std--char_traits<char>>((basic_ostream *)cout,"IN_");
    operator<<<std--char_traits<char>>(this,"PLAI");
    this = operator<<<std--char_traits<char>>((basic_ostream *)cout,"N_SI");
    this = operator<<<std--char_traits<char>>(this,"GHT");
    operator<<((basic_ostream<char,std--char_traits<char>> *)this,endl<char,std--char_traits<char>>)
    ;
                    /* WARNING: Subroutine does not return */
    exit(0);
  }
  ~basic_string(local_c8);
  ~basic_string(local_a8);
  return 0;
}

```

See plaintext at the end:
```c
this = operator<<<std--char_traits<char>>((basic_ostream *)cout,"IN_");
operator<<<std--char_traits<char>>(this,"PLAI");
this = operator<<<std--char_traits<char>>((basic_ostream *)cout,"N_SI");
this = operator<<<std--char_traits<char>>(this,"GHT");
```
`FLAG:IN_PLAIN_SIGHT`

### BINGOSPLIT
> Retrieve the flag from the attached GNU/Linux x64 binary.
```bash
$ file binary
binary: ELF 64-bit LSB executable, x86-64, version 1 (GNU/Linux),
statically linked, BuildID[sha1]=ad6ab43290d8ad49d73b3804fe192239d3061a26,
for GNU/Linux 3.2.0, not stripped
```

```bash
$ ./binary
Input the password: test
```

Open Ghidra, search for `Input the password`:
![30e892b3.png](attachments/30e892b3.png?raw=true)


Check out `0054d091`, we don't get a reference within a function this time:
![4adcf1d5.png](attachments/4adcf1d5.png?raw=true)

Find the references to `0054d091`, right click `s_Input_the_password:_0054d09f` and show the references:
![51d00652.png](attachments/51d00652.png?raw=true)
![25262f66.png](attachments/25262f66.png?raw=true)

Go to `00405410` and notice that we're inside a `prompt` function again, decompile it.

#### prompt
```c
/* WARNING: Unknown calling convention yet parameter storage is locked */
/* prompt() */

undefined8 prompt(void)

{
  int iVar1;
  basic_ostream *this;
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_118 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_f8 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_d8 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_b8 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_98 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_78 [32];
  basic_string *local_58 [5];
  uint local_2c;
  uint local_28;
  uint local_24;
  int local_20;
  int local_1c;
  
  operator<<<std--char_traits<char>>((basic_ostream *)cout,"Input the password: ");
  basic_string(local_d8);
  local_1c = 0;
                    /* try { // try from 0040544a to 00405501 has its CatchHandler @ 0040568d */
  operator>><char,std--char_traits<char>,std--allocator<char>>
            ((basic_istream *)cin,(basic_string *)local_d8);
  getFakePassword[abi:cxx11]();
  iVar1 = compare(local_b8,"hu[@oA%,.12");
  ~basic_string(local_b8);
  if (iVar1 == 0) {
    local_1c = 1;
  }
  local_24 = 4;
  local_28 = 7;
  local_2c = 3;
  getFakePassword[abi:cxx11]();
  iVar1 = compare(local_98,"f#2{PsE@#;");
  ~basic_string(local_98);
  if (iVar1 == 0) {
    getFakePassword[abi:cxx11]();
                    /* try { // try from 0040550c to 00405510 has its CatchHandler @ 00405654 */
    getFlag0[abi:cxx11]();
    local_1c = 1;
    ~basic_string(local_f8);
    ~basic_string(local_118);
  }
  local_20 = 0;
  local_2c = local_2c ^ local_24 ^ local_24 ^ local_28 ^ local_24;
  if (local_1c != 1) {
    local_2c = local_2c ^ local_24 ^ local_24 ^ local_24;
                    /* try { // try from 0040557e to 00405582 has its CatchHandler @ 0040568d */
    getPassword[abi:cxx11]();
                    /* try { // try from 00405594 to 00405598 has its CatchHandler @ 00405668 */
    iVar1 = compare(local_d8,(basic_string *)local_78);
    ~basic_string(local_78);
    if (iVar1 == 0) {
      basic_string(local_f8);
                    /* try { // try from 004055c4 to 00405615 has its CatchHandler @ 00405679 */
      getFlag[abi:cxx11]();
      operator=(local_f8,local_58);
      ~basic_string((basic_string<char,std--char_traits<char>,std--allocator<char>> *)local_58);
      this = operator<<<char,std--char_traits<char>,std--allocator<char>>
                       ((basic_ostream *)cout,(basic_string *)local_f8);
      operator<<((basic_ostream<char,std--char_traits<char>> *)this,
                 endl<char,std--char_traits<char>>);
      local_20 = 1;
      ~basic_string(local_f8);
    }
    if (local_20 == 1) {
                    /* WARNING: Subroutine does not return */
      exit(0);
    }
  }
  ~basic_string(local_d8);
  return 0xffffffff;
}
```

Notice the calls to `getFlag0` on line `43` and `getFlag` on line `60`, check out the `getFlag0` function first.

#### getFlag0
```c
/* WARNING: Unknown calling convention yet parameter storage is locked */
/* getFlag0[abi:cxx11]() */

basic_string<char,std--char_traits<char>,std--allocator<char>> * getFlag0[abi:cxx11](void)

{
  char *pcVar1;
  basic_string *pbVar2;
  undefined *puVar3;
  basic_string<char,std--char_traits<char>,std--allocator<char>> *in_RDI;
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_78 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_58 [42];
  allocator<char> local_2e;
  allocator<char> local_2d;
  undefined4 local_2c;
  uint local_28;
  uint local_24;
  uint local_20;
  undefined local_1c;
  undefined local_1b;
  undefined local_1a;
  undefined local_19;
  
  basic_string(in_RDI);
  local_19 = 0x5f;
                    /* try { // try from 00404e29 to 00404efb has its CatchHandler @ 004050dd */
  operator=(in_RDI,"EK@F");
  pcVar1 = (char *)operator[](in_RDI,0);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,1);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,2);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,3);
  *pcVar1 = *pcVar1 + '\x01';
  append(in_RDI,"8");
  pcVar1 = (char *)operator[](in_RDI,4);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,4);
  *pcVar1 = *pcVar1 + '\x01';
  pbVar2 = (basic_string *)append(in_RDI,"GOO");
  operator=(in_RDI,pbVar2);
  local_1a = 0x41;
  local_1b = 0x5b;
  local_1c = 0x54;
  allocator();
                    /* try { // try from 00404f26 to 00404f2a has its CatchHandler @ 00405099 */
  basic_string((char *)local_58,(allocator *)&DAT_0054d078);
  ~allocator(&local_2e);
                    /* try { // try from 00404f45 to 00404f73 has its CatchHandler @ 004050cc */
  append(in_RDI,"_");
  puVar3 = (undefined *)operator[](in_RDI,9);
  *puVar3 = local_19;
  append(in_RDI,"S");
  allocator();
                    /* try { // try from 00404f92 to 00404f96 has its CatchHandler @ 004050aa */
  basic_string((char *)local_78,(allocator *)&DAT_0054d080);
  ~allocator(&local_2d);
                    /* try { // try from 00404fb1 to 0040507d has its CatchHandler @ 004050bb */
  append(in_RDI,"I");
  local_20 = 4;
  local_24 = 7;
  local_28 = 3;
  append(in_RDI,"Z");
  local_2c = 0x45;
  local_28 = local_20 ^ local_24 ^ local_20 ^ local_20;
  append(in_RDI,"X");
  append(in_RDI,"Z");
  local_28 = local_20 ^ local_24 ^ local_20 ^ local_20;
  append(in_RDI,"O");
  append(in_RDI,"O");
  ~basic_string(local_78);
  ~basic_string(local_58);
  return in_RDI;
}
```
```c
pbVar2 = (basic_string *)append(in_RDI,"GOO");
append(in_RDI,"_");
append(in_RDI,"S");
append(in_RDI,"I");
append(in_RDI,"Z");
append(in_RDI,"X");
append(in_RDI,"Z");
append(in_RDI,"O");
append(in_RDI,"O");
```
`GOO_S_IZXZOO` makes no sense, check out the `getFlag` function instead.

#### getFlag
```c
/* WARNING: Unknown calling convention yet parameter storage is locked */
/* getFlag[abi:cxx11]() */

basic_string<char,std--char_traits<char>,std--allocator<char>> * getFlag[abi:cxx11](void)

{
  char *pcVar1;
  basic_string *pbVar2;
  undefined *puVar3;
  basic_string<char,std--char_traits<char>,std--allocator<char>> *in_RDI;
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_78 [32];
  basic_string<char,std--char_traits<char>,std--allocator<char>> local_58 [42];
  allocator<char> local_2e;
  allocator<char> local_2d;
  undefined4 local_2c;
  uint local_28;
  uint local_24;
  uint local_20;
  undefined local_1c;
  undefined local_1b;
  undefined local_1a;
  undefined local_19;
  
  basic_string(in_RDI);
  local_19 = 0x5f;
                    /* try { // try from 0040512c to 004051fe has its CatchHandler @ 004053e0 */
  operator=(in_RDI,"EK@F");
  pcVar1 = (char *)operator[](in_RDI,0);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,1);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,2);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,3);
  *pcVar1 = *pcVar1 + '\x01';
  append(in_RDI,"8");
  pcVar1 = (char *)operator[](in_RDI,4);
  *pcVar1 = *pcVar1 + '\x01';
  pcVar1 = (char *)operator[](in_RDI,4);
  *pcVar1 = *pcVar1 + '\x01';
  pbVar2 = (basic_string *)append(in_RDI,"DIG");
  operator=(in_RDI,pbVar2);
  local_1a = 0x41;
  local_1b = 0x5b;
  local_1c = 0x54;
  allocator();
                    /* try { // try from 00405229 to 0040522d has its CatchHandler @ 0040539c */
  basic_string((char *)local_58,(allocator *)&DAT_0054d090);
  ~allocator(&local_2e);
                    /* try { // try from 00405248 to 00405276 has its CatchHandler @ 004053cf */
  append(in_RDI,"_");
  puVar3 = (undefined *)operator[](in_RDI,9);
  *puVar3 = local_19;
  append(in_RDI,"D");
  allocator();
                    /* try { // try from 00405295 to 00405299 has its CatchHandler @ 004053ad */
  basic_string((char *)local_78,(allocator *)&DAT_0054d096);
  ~allocator(&local_2d);
                    /* try { // try from 004052b4 to 00405380 has its CatchHandler @ 004053be */
  append(in_RDI,"I");
  local_20 = 4;
  local_24 = 7;
  local_28 = 3;
  append(in_RDI,"G");
  local_2c = 0x45;
  local_28 = local_20 ^ local_24 ^ local_20 ^ local_20;
  append(in_RDI,"_");
  append(in_RDI,"D");
  local_28 = local_20 ^ local_24 ^ local_20 ^ local_20;
  append(in_RDI,"U");
  append(in_RDI,"G");
  ~basic_string(local_78);
  ~basic_string(local_58);
  return in_RDI;
}
```
```c
pbVar2 = (basic_string *)append(in_RDI,"DIG");
append(in_RDI,"_");
append(in_RDI,"D");
append(in_RDI,"I");
append(in_RDI,"G");
append(in_RDI,"_");
append(in_RDI,"D");
append(in_RDI,"U");
append(in_RDI,"G");
```
`FLAG:DIG_DIG_DUG`

### COLDCORE
```bash
$ file coldcore.pcap
coldcore.pcap: pcap capture file, microsecond ts (little-endian) -
version 2.4 (Ethernet, capture length 262144)
```
Open the capture file in Wireshark.

We only have 16 packets, notice the packet lengths.
![338baf40.png](attachments/338baf40.png?raw=true)

Add a filter `frame.len > 74`,  giving us packet `4` and `12`.
![b80d9d23.png](attachments/b80d9d23.png?raw=true)

Right-click on each packet and follow the TCP stream:
![eee32576.png](attachments/eee32576.png?raw=true)

#### Packet `#4`, `tcp.stream eq 0` 
**Show and save data as `Raw`**, this gives us the hexstring `01f3653adcafecffe02255ec22ce957b71a19838da77d668d7099c09ed94bbf0`, which most likely is the encrypted flag.
![2852ac74.png](attachments/2852ac74.png?raw=true)

#### Packet `#12`, `tcp.stream eq 1`
The next stream gives us a public key, save this key to a file `key.pub`.
![2700c620.png](attachments/2700c620.png?raw=true)
```
-----BEGIN PUBLIC KEY-----
MDswDQYJKoZIhvcNAQEBBQADKgAwJwIgAsTTsSbPL3u2A8VvkVpJhkQoth87oPtH
yo7PqkfHAPcCAwEAAQ==
-----END PUBLIC KEY-----
```

Use `openssl` to view the information about the public key.
```bash
$ openssl rsa -pubin -in key.pub -text -modulus
RSA Public-Key: (250 bit)
Modulus:
    02:c4:d3:b1:26:cf:2f:7b:b6:03:c5:6f:91:5a:49:
    86:44:28:b6:1f:3b:a0:fb:47:ca:8e:cf:aa:47:c7:
    00:f7
Exponent: 65537 (0x10001)
Modulus=2C4D3B126CF2F7BB603C56F915A49864428B61F3BA0FB47CA8ECFAA47C700F7
-----BEGIN PUBLIC KEY-----
MDswDQYJKoZIhvcNAQEBBQADKgAwJwIgAsTTsSbPL3u2A8VvkVpJhkQoth87oPtH
yo7PqkfHAPcCAwEAAQ==
-----END PUBLIC KEY-----
```
We now have the modulus `(n)` and the exponent `(e)` of the key, notice the key length `(250 bit)`.
Convert the modulus hex to an integer:
```
$ echo 'ibase=16;2C4D3B126CF2F7BB603C56F915A49864428B61F3BA0FB47CA8ECFAA47C700F7' | bc
1252388766339927246848494379804139754497490487124672088674574288719888974071
```
The goal is now to find the factors (`p` and `q`) of the modulus, we can use https://factordb.com for [this](http://factordb.com/index.php?query=1252388766339927246848494379804139754497490487124672088674574288719888974071):
![d7d8d797.png](attachments/d7d8d797.png?raw=true)

```
p = 34748356909702664562373096044649397279
q = 36041668663482244409045202924094660649
```

Convert the exported ciphertext from packet `#4` to an integer:
```
01f3653adcafecffe02255ec22ce957b71a19838da77d668d7099c09ed94bbf0
=882355348623422157142228655970963113607866392063363219551854288858583972848
```

We now have the following variables:
```
e = 65537
p = 34748356909702664562373096044649397279
q = 36041668663482244409045202924094660649
c = 882355348623422157142228655970963113607866392063363219551854288858583972848
```

Be lazy and use these variables with [RsaCtfTool](https://github.com/Ganapati/RsaCtfTool).
```bash
$ python3 RsaCtfTool.py \
-e 65537 \
-p 34748356909702664562373096044649397279 \
-q 36041668663482244409045202924094660649 \
--uncipher 882355348623422157142228655970963113607866392063363219551854288858583972848
private argument is not set, the private key will not be displayed, even if recovered.

Results for /tmp/tmpd7uwpmhd:

Unciphered data :
HEX : 0x0002db96324262a567fd1a84dd00464c41473a4d3454485f49355f483452440a
INT (big endian) : 5049225864427901548162120050109071913034297794073380774996465479314457610
INT (little endian) : 4643841438976908897862334256701692905293648950165356641885321247127898882560
STR : b'\x00\x02\xdb\x962Bb\xa5g\xfd\x1a\x84\xdd\x00FLAG:M4TH_I5_H4RD\n'
```
`FLAG:M4TH_I5_H4RD`
