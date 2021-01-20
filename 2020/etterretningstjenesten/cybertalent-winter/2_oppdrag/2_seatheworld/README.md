# 2.2_seatheworld

## [2.2_seatheworld](./1)

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

## [2.2_seatheworld_aksess](./aksess)

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

### 80/tcp - IBM httpd V5R3M0

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

### 21/tcp - IBM OS/390 ftpd V1R10

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

### 22/tcp - OpenSSH 3.8.1p1 (protocol 2.0)

Attempting to log in to SSH with the `user:user` credentials we are given an error, and decide to continue with the telnet port instead.
```
login@corax:~$ ssh -oKexAlgorithms=+diffie-hellman-group1-sha1 user@nusse.seatheworld.tld
user@nusse.seatheworld.tld's password:
22: FSUM7351 not found
```

---

### 23/tcp - IBM Telnet TN3270 (TN3270E)

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

## [2.2_seatheworld_booking](./booking)

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

### Social engineering

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

### Other bookings

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

### Bruteforce

After attempting to find the booking reference codes / names on the system without luck, we attempt to bruteforce the reference codes for fun (without luck of course) with [py3270](https://pypi.org/project/py3270/).

You can find the bruteforcer [here](../../9000_madness/2_seatheworld_bookings_bruteforcer).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/ec55a1a099714a3d82164be6cb3cfc3d.gif" width="400">


## [2.2_seatheworld_ekstra](./ekstra)

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

### LISTC
Listing the data sets we find the following data sets under ``IBMUSER.SEATW``:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/77dab66b0c3b4540a6e2cd51a8c26e9f.png" width="300">

---

### ISPF

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

### `IBMUSER.SEATW.SRC`

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

We input `SELECT C` (a copy of the source code can be found [here](../../9000_madness/2_seatheworld_data_set_downloader/datasets/IBMUSER.SEATW.SRC(C))) and find the source code of the booking application. Most interesting is the `SKIP_FLAG` definition on line #5 and the IF statement on line #317 that stops the `print_flag()` function from executing.

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

We also dump the other data sets, you can find them [here](../../9000_madness/2_seatheworld_data_set_downloader/datasets).

---

### EDIT

We now want to change the value of `SKIP_FLAG` to `0` so that the `print_flag()` is executed. We go back to the ISPF menu and use the same method as previously, but with the `VIEW` command this time, and edit the source file, replacing `1` with a `0`: `#define SKIP_FLAG 0`

---

### SUBMIT

Now we need to compile this, and go back to the main menu and execute the `SUBMIT` and provide the [Job control language (JCL)](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zjcl/zjclc_basicjclconcepts.htm) file to compile the application.
> Job control language (JCL) is a set of statements that you code to tell the z/OS® operating system about the work you want it to perform. Although this set of statements is quite large, most jobs can be run using a very small subset. Learn about essential and most frequently used JCL statements and parameters, as well as coding techniques.
> 
```
SUBMIT IBMUSER.SEATW.SRC(JCL)
 IKJ56250I JOB STWCOMPL(JOB01125) SUBMITTED
 READY
```

---

### Flag
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

### Data set downloader
There is a way to download the data sets in the mainframe through the UNIX shell, we therefore create a [data set downloader](../../9000_madness/2_seatheworld_data_set_downloader/download_datasets.py) data connects to the host through SSH and transfers the data sets from the main frame, to the host, and finally to localhost. More information regarding copying files can be found [here](https://www.ibm.com/support/knowledgecenter/SSLTBW_2.4.0/com.ibm.zos.v2r4.bpxa400/cpfilemem.htm).

```
IBMUSER:/u/ibmuser >cp "//'ibmuser.seatw.src(c)'" example
IBMUSER:/u/ibmuser >cat example | head
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
```

---

### Analyzing the bookings
Now that we have a data set downloader, we use it to download the `BOOKING` data set, the script can be found [here](../../9000_madness/2_seatheworld_bookings_parser/parse_bookings.py).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/7430b4b8e93b4bc2a9d68cea3ba1eb6e.png" width="300">
