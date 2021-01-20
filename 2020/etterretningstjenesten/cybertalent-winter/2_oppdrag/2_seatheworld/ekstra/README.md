# 2.2_seatheworld_ekstra

We read up on the offical [documentation](https://www.ibm.com/support/knowledgecenter/SSLTBW) of the IBM mainframe given in the first view. We are also given a list of useful commands, and take a special note of `ISPF` and `SUBMIT`.

```
 ***************************************************************** 
 *  USEFUL COMMANDS:                                             *
 *  ----------  --------------------------                       *
 *  CTRL-A 1    - CANCEL CURRENT COMMAND                         *
 *  ISPF        - LOAD ISPF                                      *
 *  HELP        - LIST MORE USEFUL COMMANDS                      *
 *  ALLOCATE    - ALLOCATE DATA SET                              *
 *  EDIT        - EDIT DATA SET                                  *
 *  LISTC       - LIST DATA SET                                  *
 *  LOAD        - LOAD DATA SET                                  *
 *  SUBMIT      - SUBMIT BATCH JOB                               *
 *****************************************************************
```

---

## LISTC
Listing the data sets we find the following data sets under ``IBMUSER.SEATW``:

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/77dab66b0c3b4540a6e2cd51a8c26e9f.png" width="300">

---

## ISPF

> [ISPF](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zconcepts/zconc_whatisispf.htm) is a full panel application navigated by keyboard. ISPF includes a text editor and browser, and functions for locating and listing files and performing other utility functions. 

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/aa2a33f3b56940b8bfdd310a8e93251f.png" width="300">

Looking further into the **VIEW** option and its documentation/tutorial:

```
 TUTORIAL -------------------------- VIEW ----------------------------- TUTORIAL
 OPTION  ===>                                                                  
                                                                               
                                                                                
                      -----------------------------------                       
                      |             VIEW                |                       
                      -----------------------------------                       
                                                                                
   View allows you to display source data or output listings.  With View,       
   members of partitioned data sets, DASD-resident sequential data sets,        
   or z/OS UNIX files can be displayed, and updated using Edit primary          
   and line commands.  Changes to data are not saved.                           
                                                                                
   Browse also allows you to display data or output listings.  With             
   Browse, members of partitioned data sets, DASD-resident sequential           
   data sets, or z/OS UNXI files can be displayed, and can be scrolled          
   forward, backward, left, or right.  Browse can be selected from the          
   View Entry Panel.                                                            
                                                                                
 The following topics are presented in sequence, or may be selected by number:  
   0 - General introduction              2 - SCLM View entry panel              
   1 - View entry panel                  3 - Ending a view session              
 The following topics will be presented only if selected by number:             
   4 - Using View                                                               
   5 - Using Browse                                                             

```
---

## `IBMUSER.SEATW.SRC`

Knowing that we can view the data sets, we take a closer look at the `IBMUSER.SEATW.SRC` data set, and find 3 files, `C`, `CIPHER`, and `JCL`.

```
   Menu  RefList  RefMode  Utilities  Workstation  Help                         
 ────────────────────────────────────────────────────────────────────────────── 
                                View Entry Panel                               
 Command ===>                                                                  
                                                                               
 ISPF Library:                                                                 
    Project . . . IBMUSER                                                       
    Group . . . . SEATW    . . .          . . .          . . .                  
    Type  . . . . SRC                                                           
    Member  . . .                 (Blank or pattern for member selection list)  
                                                                                
 Other Partitioned, Sequential or VSAM Data Set, or z/OS UNIX file:            
    Name . . . . .                                                            +
    Volume Serial . .           (If not cataloged)                              
                                                                                
 Workstation File:                                                             
    File Name  . .                                                              
                                         Options
 Initial Macro  . . . .                     Confirm Cancel/Move/Replace        
 Profile Name . . . . .                     Browse Mode                        
 Format Name  . . . . .                     View on Workstation                
 Data Set Password  . .                  /  Warn on First Data Change          
 Record Length  . . . .                     Mixed Mode                         
                                            View ASCII data                    
```

```
   Menu  Functions  Utilities  Help                                             
 ────────────────────────────────────────────────────────────────────────────── 
 VIEW     IBMUSER.SEATW.SRC                                  Row 00001 of 00003
 Command ===>                                                  Scroll ===> PAGE
    Name     Prompt          Size    Created           Changed            ID   
 . C                          327   2020/12/08   2020/12/16 12:47:42    IBMUSER 
 . CIPHER                       1   2020/12/09   2020/12/09 08:35:48    IBMUSER 
 . JCL                          6   2020/12/08   2020/12/14 22:41:25    IBMUSER 
   **End**                                                                      
```

We input `SELECT C` (a copy of the source code can be found [here](../../../9000_madness/2_seatheworld_data_set_downloader/datasets/IBMUSER.SEATW.SRC(C))) and find the source code of the booking application. Most interesting is the `SKIP_FLAG` definition on line #5 and the IF statement on line #317 that stops the `print_flag()` function from executing.

```c
000005 #define SKIP_FLAG 1
// --- snip ---
000313 main(int argc, char **argv) 
000314 { 
000315     int tries = 0; 
000316                                                                     
000317     if (SKIP_FLAG) 
000318         printf( 
000319             "\n***********************************************" 
000320             "\n FLAG: NOT PRINTING DUE TO COMPILE TIME OPTION" 
000321             "\n***********************************************\n\n"); 
000322     else 
000323         print_flag(); 
000324                                                                     
000325     while (main_menu() && tries++ < 200) 
000326         ; 
000327 } 
```

We also dump the other data sets, you can find them [here](../../../9000_madness/2_seatheworld_data_set_downloader/datasets).

---

## EDIT

We now want to change the value of `SKIP_FLAG` to `0` so that the `print_flag()` is executed. We go back to the ISPF menu and use the same method as previously, but with the `VIEW` command this time, and edit the source file, replacing `1` with a `0`: `#define SKIP_FLAG 0`

---

## SUBMIT

Now we need to compile this, and go back to the main menu and execute the `SUBMIT` and provide the [Job control language (JCL)](https://www.ibm.com/support/knowledgecenter/zosbasics/com.ibm.zos.zjcl/zjclc_basicjclconcepts.htm) file to compile the application.
> Job control language (JCL) is a set of statements that you code to tell the z/OS® operating system about the work you want it to perform. Although this set of statements is quite large, most jobs can be run using a very small subset. Learn about essential and most frequently used JCL statements and parameters, as well as coding techniques.
> 
```
SUBMIT IBMUSER.SEATW.SRC(JCL)
 IKJ56250I JOB STWCOMPL(JOB01125) SUBMITTED
 READY
```

---

## Flag
Loading the application again gives us the final flag.

```
LOAD IBMUSER.SEATW.LOAD(BOOKING) 
 ***********************************************
  FLAG: c0da14705d803523d572a0480a51d61c
 ***********************************************
```

---

```
login@corax:~$ scoreboard c0da14705d803523d572a0480a51d61c
Kategori: 2. Oppdrag
Oppgave:  2.2_seatheworld_ekstra
Svar:     c0da14705d803523d572a0480a51d61c

Gratulerer! Du har utvist grunnleggende kunnskap om IBM stormaskiner.
Det er behov for kunnskap om en rekke forskjellige systemer i en jobb hos oss,
og evnen til å sette seg inn i nye (og gamle!) ting er viktig.

En stor takk til IBM Norge som lot oss benytte z/OS for årets CTF!
```

---

## Data set downloader
There is a way to download the data sets in the mainframe through the UNIX shell, we therefore create a [data set downloader](../../../9000_madness/2_seatheworld_data_set_downloader/download_datasets.py) data connects to the host through SSH and transfers the data sets from the main frame, to the host, and finally to localhost. More information regarding copying files can be found [here](https://www.ibm.com/support/knowledgecenter/SSLTBW_2.4.0/com.ibm.zos.v2r4.bpxa400/cpfilemem.htm).

```
IBMUSER:/u/ibmuser >cp "//'ibmuser.seatw.src(c)'" example
IBMUSER:/u/ibmuser >cat example | head
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
```

---

## Analyzing the bookings
Now that we have a data set downloader, we use it to download the `BOOKING` data set, the script can be found [here](../../../9000_madness/2_seatheworld_bookings_parser/parse_bookings.py).

<img src="https://raw.githubusercontent.com/mklarz/ctf-writeups/main/2020/etterretningstjenesten/cybertalent-winter/2_oppdrag/2_seatheworld/booking/screenshots/7430b4b8e93b4bc2a9d68cea3ba1eb6e.png" width="300">
