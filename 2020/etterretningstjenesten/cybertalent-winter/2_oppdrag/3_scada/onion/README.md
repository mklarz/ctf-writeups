# 2.3_onion
_This task was possible to solve beforehand by doing a simple nmap scan on the same network that `corax` was on._ 

With the help of the extracted `Important links` file from the Vault in the Android application, we find the following URL.

```
Hidden service URL:
http://fileserver/files/onion_name.txt
```

Downloading this we are presented with a [Tor (anonymity network)](https://www.torproject.org) URI: `tpcoe34czvwcm2uqsthc4xviy6hkngzexo2qhstwhh42itwplbqmm6id.onion`. Opening it in the Tor browser gives us the `scada_frontend`.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/onion/screenshots/6232a528e67e4d2aa3102f540dfa4096.png" width="500">

Checking the Javascript console in the browser, we see the following log, containing our flag. In addition it tells use that we can use the host `scada` instead of the onion host for a stable connection.

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/3_scada/onion/screenshots/5d8f1ba6d119409295ebf6413a9a7889.png" width="500">

---

```sh
login@corax:~$ scoreboard b4ba373b44abfb94763e54297d3d19d8
Kategori: 2. Oppdrag
Oppgave:  2.3_onion
Svar:     b4ba373b44abfb94763e54297d3d19d8

Du har fått tilgang til gisseltakerenes bakdør inn i styringssystemet. Klarer du å styre systemet selv?
```
