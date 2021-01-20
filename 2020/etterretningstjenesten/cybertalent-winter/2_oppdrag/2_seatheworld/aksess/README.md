# 2.2_seatheworld_aksess

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

## 80/tcp - IBM httpd V5R3M0

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

## 21/tcp - IBM OS/390 ftpd V1R10

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

## 22/tcp - OpenSSH 3.8.1p1 (protocol 2.0)

Attempting to log in to SSH with the `user:user` credentials we are given an error, and decide to continue with the telnet port instead.
```
login@corax:~$ ssh -oKexAlgorithms=+diffie-hellman-group1-sha1 user@nusse.seatheworld.tld
user@nusse.seatheworld.tld's password:
22: FSUM7351 not found
```

---

## 23/tcp - IBM Telnet TN3270 (TN3270E)

> The [IBM 3270](https://en.wikipedia.org/wiki/IBM_3270) is a family of block oriented display and printer computer terminals introduced by IBM in 1971 and normally used to communicate with IBM mainframes.

And after reading up on the official  [introduction](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.znetwork/znetwork_261.htm) and some [documentation](
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
