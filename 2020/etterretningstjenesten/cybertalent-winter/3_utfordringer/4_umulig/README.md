# 3.4. Utfordringer umulig
## 3.4.8_transfer_root
Having created a complete CLI for the [transfer client](../2_middels/transfer/medium/transfer_client.py) earlier, we can connect to the transfer server and navigate around the file system and find a flag in `/root/FLAG`.

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
