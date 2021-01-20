# 1. Grunnleggende ([Detailed version](./DETAILED.md))
Having completed last years CTF, these challenges (except **1.5_nettverk**) were copy paste from my notes. You can find more information regarding the challenges in these write-ups: [Sithis](https://github.com/williamsolem/Etjenesten-Cybertalent-CTF-Writeup), [Agent Random](https://blog.agentrandom.com/cybertalent-ctf/), [zig](https://www.indregard.no/2020/03/e-tjenestens-ctf/), [UnblvR](https://github.com/myrdyr/ctf-writeups/tree/master/etjenesten20), or [SgtSIGSEGV](https://blog.mrfjo.org/2020/03/02/NIS-Cybertalent).

## 1.5_nettverk

Simple Python networking challenge. More information on Python socket programming can be found in the official Python documentation [here](https://docs.python.org/3/howto/sockets.html) and [here](https://docs.python.org/3/library/socket.html).

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
Gratulerer, korrekt svar!
```
