LESMEG

# Minesweeper
I denne oppgaven skal du lage en minesweeper-klient som automatisk løser brett den får fra en minesweeper-server.

Du må løse 10 brett på rad med varierende vanskelighetsgrad. Det er mulig å oppnå totalt 3 flagg på denne oppgaven.

Det første brettet og flagget er mulig å løse for hånd da du har en hel klokketime på deg til å løse denne, men etter det vil du ikke ha tid til å løse de manuelt. Du må altså skrive en solver som via APIet mot serveren løser brettene raskt.


## Klienten
For å unngå misbruk av tjenesten genereres det nye brett for hver gang du starter et nytt spill.

Du må altså starte på nytt hver gang du har gjort en feil for å klare å hente ut siste flagg.

Siden serveren generer brett ved starten av nytt spill, i stedet for nytt brett, har vi gjort noen endringer i forhold til "vanlige" minesweeper-regler. Du kan ikke starte hvor som helst og forvente at dette er en trygg flis/posisjon. Vi har sørget for at posisjon 0,0 alltid er trygg og at det er mulig å løse brettet dersom du starter i denne posisjonen - hint hint.

Når klienten klikker på en flis vil serveren kun svare med verdien på denne flisen, eventuelt en feilmelding. Serveren vil ikke åpne garantert sikre fliser (høyreklikk på en "ferdig" flis i MS Minesweeper) for deg. Du må selve implementere denne funksjonaliteten i klienten.


## API
Kommunikasjonen mellom klient og server foregår over en usikker gRPC-kanal. APIet kan implementeres i en rekke forskjellige språk - se [https://grpc.io/docs/languages/](https://grpc.io/docs/languages/).

Du kan med fordel utvikle denne klienten med et kompilert språk, og laste opp binærfila på login@ctf.cybertalent.no med scp. Dersom du foretrekker tolket språk og ikke vil pakke det inn i en kjørbar binærfil tilbyr vi kun biblioteker for Python3 (https://grpc.io/docs/languages/python/quickstart/) på login@ctf.cybertalent.no.

APIet er definert i minesweeper.proto som ligger i samme mappe som denne LESMEG-fila. I denne fila vil du finne alle RPC-kall og meldingstyper du må implementere for å snakke med serveren.

Husk å bruke "insecure" kall i biblioteket ditt, da vi ikke benytter autentisering eller kryptering i dette APIet.

Du starter et nytt spill med å kalle `NewGame`. Her mottar du en ID til det første brettet du må løse.

For å løse et brett starter du med å kalle `StartLevel`. For å åpne en flis på brettet kaller du `Click`. Når du mener at du har funnet alle minene lager du en liste med alle mine-posisjonene og kaller `SolveLevel`.

Dersom du ikke løser brettene raskt nok, klikker på en mine, eller sender inn en løsning med feil posisjon på en mine, vil du måtte starte spillet på nytt med `NewGame`.

Merk at når du kaller `NewGame` vil det kunne ta noe tid før du får en respons fra serveren. Dette er fordi serveren må generere brett som du skal kunne klare å løse.


## Server
Serveren kjører usikker gRPC på `minesweeper:1989`.


## Eksempelbrett solveren din må klare
```
0 0 0 1 X 3 3 2 1 0 0
0 0 0 1 2 X X X 2 0 0
0 0 0 0 1 2 4 X 2 0 0
0 0 0 0 0 0 1 2 2 2 1
0 0 0 0 0 0 0 1 X 2 X
1 1 1 1 1 0 0 1 1 3 2
X 1 1 X 1 0 0 0 1 2 X
1 1 1 1 1 0 0 0 2 X 3
1 2 1 2 1 1 0 0 2 X 2
X 2 X 2 X 1 0 0 1 1 1
```

```
0 0 1 X 1 0 0 2 X 2
0 0 1 1 1 0 0 2 X 2
0 0 1 1 1 0 0 2 2 2
0 0 2 X 3 1 1 1 X 1
0 1 3 X 3 X 2 2 1 1
1 2 X 2 2 3 X 2 0 0
1 X 3 2 0 2 X 2 0 0
1 2 X 1 0 1 1 1 1 1
0 1 1 1 1 1 1 0 2 X
0 0 0 0 1 X 1 0 2 X
```

```
0 0 0 0 0 1 1 1 1 X 2 X 1 1 X
0 0 1 1 1 1 X 1 1 2 3 2 1 1 1
0 1 3 X 2 1 1 2 2 3 X 1 0 0 0
0 1 X X 3 1 0 1 X X 4 4 2 1 0
0 1 2 3 X 1 0 2 3 4 X X X 1 0
0 0 0 1 1 1 0 1 X 2 2 3 2 1 0
1 1 1 1 1 1 1 2 1 1 0 0 0 0 0
X 3 3 X 1 1 X 1 0 0 0 0 0 0 0
2 X X 2 2 2 2 1 1 1 1 0 0 1 1
2 3 3 1 1 X 1 0 2 X 2 0 0 1 X
1 X 1 1 2 2 1 0 2 X 2 0 0 1 1
1 1 1 2 X 2 1 1 3 3 3 1 0 1 1
1 1 1 2 X 2 1 X 2 X X 1 0 1 X
2 X 1 2 2 2 1 2 3 3 3 2 1 1 1
X 2 1 1 X 1 1 2 X 1 1 X 1 0 0
1 1 0 1 1 1 1 X 2 1 1 1 1 0 0
```


## Flagg
Det første flagget får du etter å ha løst det første brettet. Dette viser hovedsaklig at du har implementert APIet.

Det andre flagget får du etter de neste 7 brettene. Her får du 10 sekunder på deg til å løse hvert enkelt brett fra du kaller `StartLevel`.

Det siste flagget får du etter de siste 2 brettene. Disse er en del vanskeligere og du har bare 5 sekunder på deg.

Lykke til!