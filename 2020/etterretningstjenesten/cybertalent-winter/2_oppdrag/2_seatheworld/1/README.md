# 2.2_seatheworld

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
