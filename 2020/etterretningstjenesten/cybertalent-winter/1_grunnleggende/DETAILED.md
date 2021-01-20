# 1. Grunnleggende ([Simple version](./README.md))
Having completed last years CTF, these challenges (except **1.5_nettverk**) were copy paste from my notes. You can find more information regarding the challenges in these write-ups: [Sithis](https://github.com/williamsolem/Etjenesten-Cybertalent-CTF-Writeup), [Agent Random](https://blog.agentrandom.com/cybertalent-ctf/), [zig](https://www.indregard.no/2020/03/e-tjenestens-ctf/), [UnblvR](https://github.com/myrdyr/ctf-writeups/tree/master/etjenesten20), or [SgtSIGSEGV](https://blog.mrfjo.org/2020/03/02/NIS-Cybertalent).

## 1.5_nettverk
> # Nettverksprogrammering
> 
> Så langt har oppgavene dreid seg om å få tilgang til filer på en maskin hvor man allerede har tilgang. Dataangrep starter ofte ved at man må skaffe seg denne tilgangen ved å utnytte en *nettverkstjeneste* som er tilgjengelig på internett.
> 
> I denne mappen ligger en server som, etter å ha blitt startet, lytter på port `tcp/10015`. For å få tak i flagget trenger du ikke overflows som i forrige oppgave, men du må vise at du behersker programmeringsferdigheter som å håndtere flere samtidige tilkoblinger og konvertering av binære data.
> 
> ```sh
> $ cp client.py ~/1.5_client.py
> $ ./server
> $ # I ny terminal:
> $ nano ~/1.5_client.py
> $ ~/1.5_client.py
> $ scoreboard <FLAGG>
> ```

Simple Python networking challenge. More information on Python socket programming can be found in the official Python documentation [here](https://docs.python.org/3/howto/sockets.html) and [here](https://docs.python.org/3/library/socket.html).

```python
import socket
import struct
import select

TCP_IP = "127.0.0.1"
TCP_PORT = 10015

connections = []

conn = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
conn.connect((TCP_IP, TCP_PORT))
print(conn.recv(4096).decode("utf-8"))
# Dette er en grunnleggende introduksjon til nettverksprogrammering.
# Når du har åpnet ti nye tilkoblinger til denne serveren vil du få videre instruksjoner på denne socketen.

for i in range(10):
    c = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    c.connect((TCP_IP, TCP_PORT))
    connections.append(c)

print(conn.recv(4096).decode("utf-8"))
# Du vil nå få tilsendt et 32-bits heltall i `network byte order` i hver av de ti andre sesjonene.
# Summer alle, og send resultatet tilbake på denne socketen.
# Det er mange måter å konvertere data på. En av dem er `struct.unpack`.

summ = 0
for c in connections:
    value = c.recv(4096)
    value = struct.unpack('>i', value)[0]
    summ += value

summ = struct.pack('>i', summ)
conn.sendall(summ)

print(conn.recv(4096).decode("utf-8"))
# Neste melding sendes fordelt over de ti sesjonene.
# For å unngå å blokkere mens du leser kan du for eksempel bruke `select.select()` eller `socket.settimeout(0)`.

result = ""
reading = True
while reading:
    readers, _, _ = select.select(connections, [], [], 5)
    if len(readers) == 0:
        break
    for reader in readers:
        result += reader.recv(4096).decode()
    print(result)

```

```
$ python3 solve.py
Husk at utf-8 kan ha multi-byte tegn 😊

╭────────────────────────────────────────╮
│ Gratulerer!                            │
│                                        │
│ Her er flagget:                        │
│                                        │
├────────────────────────────────────────┤
│    059d93ffd79c5cbd77268f17141c22e7    │
╰────────────────────────────────────────╯
```

```
login@corax:~$ scoreboard 059d93ffd79c5cbd77268f17141c22e7
Kategori: 1. Grunnleggende
Oppgave:  1.5_nettverk
Svar:     059d93ffd79c5cbd77268f17141c22e7

Gratulerer, korrekt svar!
```
