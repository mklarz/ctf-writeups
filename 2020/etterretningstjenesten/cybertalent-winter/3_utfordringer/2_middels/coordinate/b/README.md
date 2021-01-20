# 3.2.1_coordinate_b

![583102f8e83c450cb8d7478e145cc99a.png](./screenshots/583102f8e83c450cb8d7478e145cc99a.png)

Instead of writing down the number manually, we extract the embedded data.
```shell
$ zsteg coordinate.png -e b8,b,lsb,xy > b8_b.txt
[37.4040208986156, -122.11557126842482]
[38.88824944889722, -77.02301190382201]
[34.17304019448849, -117.88486574343878]
[26.16538153242349, -80.31681550621417 ]
[52.540198575411445, 13.626773749372456]
[53.51014017498718, -2.395029415893364]
[41.59016842165888, -93.6275330132897]
[37.80074583736261,-122.45645702947891]
```

The data look like GPS coordinates, and when plotting them into Google Maps we see that they are coordinates to streets/rivers/buildings that are supposed to look like letters, giving us the following:

* `37.4040208986156, -122.11557126842482`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/545ffcbbf6c6449ea45122e427c6fcc5.png" width="100">

**F**

**Flag:** `F`

* `38.88824944889722, -77.02301190382201`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/7805570b38334a248b75e3370af708c0.png" width="100">

**O**

**Flag:** `FO`

* `34.17304019448849, -117.88486574343878`
This one initially didn't make sense, but after checking the satellite map, we see that it's supposed to be the letter `N`.
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/bfe894cbe99f4ccc8dc67de6a80995a3.png" width="100">

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/b0bc721629e640ae8e002055cea6785c.png" width="100">

**N**

**Flag:** `FON`

* `26.16538153242349, -80.31681550621417`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/2af28ac30505472b814511da955549fb.png" width="100">

**T**

**Flag:** `FONT`

* `52.540198575411445, 13.626773749372456`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/6675a70367704d65a9dbe4aaf20cafc4.png" width="100">

**S**

**Flag:** `FONTS`

* `53.51014017498718, -2.395029415893364`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/101208d8a17f47eaa206a6c07ddf0ffc.png" width="100">

**I**

**Flag:** `FONTSI`

* `41.59016842165888, -93.6275330132897`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/ab05b311a2c34443a231cefbd0815b73.png" width="100">

**Z**

**Flag:** `FONTSIZ`


* `37.80074583736261,-122.45645702947891`
<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/3_utfordringer/2_middels/coordinate/b/screenshots/2ede67f325e54c2c8e44c7f82fe738f8.png" width="100">

**E**

**Flag:** `FONTSIZE`

```shell
login@corax:~$ scoreboard FONTSIZE
Kategori: 3.2. Utfordringer middels
Oppgave:  3.2.1_coordinate_b
Svar:     FONTSIZE

Gratulerer, korrekt svar!
```
