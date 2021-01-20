# 2.2_seatheworld_booking


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

## Social engineering

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

## Other bookings

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

## Bruteforce

After attempting to find the booking reference codes / names on the system without luck, we attempt to bruteforce the reference codes for fun (without luck of course) with [py3270](https://pypi.org/project/py3270/).

You can find the bruteforcer [here](../../../9000_madness/2_seatheworld_bookings_bruteforcer).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/ec55a1a099714a3d82164be6cb3cfc3d.gif" width="400">
