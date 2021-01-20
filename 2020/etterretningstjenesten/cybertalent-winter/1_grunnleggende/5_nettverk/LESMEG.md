# Nettverksprogrammering

Så langt har oppgavene dreid seg om å få tilgang til filer på en maskin hvor man allerede har tilgang. Dataangrep starter ofte ved at man må skaffe seg denne tilgangen ved å utnytte en *nettverkstjeneste* som er tilgjengelig på internett.

I denne mappen ligger en server som, etter å ha blitt startet, lytter på port `tcp/10015`. For å få tak i flagget trenger du ikke overflows som i forrige oppgave, men du må vise at du behersker programmeringsferdigheter som å håndtere flere samtidige tilkoblinger og konvertering av binære data.

```sh
$ cp client.py ~/1.5_client.py
$ ./server
$ # I ny terminal:
$ nano ~/1.5_client.py
$ ~/1.5_client.py
$ scoreboard <FLAGG>
```

