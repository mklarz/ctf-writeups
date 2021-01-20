# 3.2.3_transfer

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

#### documentation.pdf
![fdc153d857084628b197823b79f9f03e.png](./screenshots/fdc153d857084628b197823b79f9f03e.png)
![cfee4412b5bd4ad1b2014672c4b886ab.png](./screenshots/cfee4412b5bd4ad1b2014672c4b886ab.png)


## [3.2.3_transfer_easy](./easy)

The documentation provides information in regards to the transfer protocol. We finish skimming through it and continue by opening the `pcapng` in Wireshark and extract every "transfer" packet and start splitting up the data in the packets as noted in the documentation. 

---

### Transport packets
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

### Reversing
We know that the interesting data will be in the `CONTENT` header and attempt to decode the hex values of the first packets, and then notice that the unhexed content is in fact **base64** encoded strings. 

| # | HEX | BASE64 | DECODED |
| - | - | - | - | 
| 1 | 5a33566c633351365a33566c6333513d | Z3Vlc3Q6Z3Vlc3Q= | guest:guest |
| 2 | 556b4d30 | UkM0 | RC4 |
| 3 | 4f37564733624461513671654d6d537a453035357a72526a3951334d306e61523156436c7037704e73413d3d | O7VG3bDaQ6qeMmSzE055zrRj9Q3M0naR1VClp7pNsA== | **_RAW DATA_** |
| 4 | 5a4254577a7162314e727532796d714d5835516c72673d3d | ZBTWzqb1Nru2ymqMX5Qlrg== | **_RAW DATA_** |

---

### Encryption
Packet #3 and #4 contain raw that after we decoded them, but the packet before (packet #2) hint us toward [RC4 (Rivest Cipher 4)](https://en.wikipedia.org/wiki/RC4), which is a stream cipher. Knowing this, we assume that packet #3 contains the decrypted data, and packet #4 contains the key provided to the user after it logged in with `guest:guest` as username and password.

Plotting this into [CyberChef](https://gchq.github.io/CyberChef/#recipe=From_Base64('A-Za-z0-9%2B/%3D',true)RC4(%7B'option':'Base64','string':'ZBTWzqb1Nru2ymqMX5Qlrg%3D%3D'%7D,'Latin1','Latin1')&input=TzdWRzNiRGFRNnFlTW1TekUwNTV6clJqOVEzTTBuYVIxVkNscDdwTnNBPT0) we successfully decrypted the packet contents:
```sh
ls /tmp/transfer
FLAG_1
FLAG_2
```

---

### Flag

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





## [3.2.3_transfer_medium](./medium)

We recall from **3.2.3_transfer_easy** that there is a `FLAG_2` in `/tmp/transfer`, and therefore need to implement the transport protocol so that we can fetch the flag.

---

### Instructions
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

### Transfer Client
I decided it would be easier to simply implement the entire transfer protcol in a transfer client CLI, you can find it [here](./medium/transfer_client.py). With this I found that instruction #4 was used to change directories, whilst instruction #8 was used to disconnect.

**Foreshadowing:** this CLI will be **_very_** helpful later on.

---

### Flag

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
