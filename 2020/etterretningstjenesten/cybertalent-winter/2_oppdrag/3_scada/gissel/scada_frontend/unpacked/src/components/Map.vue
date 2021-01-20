<template>
    <div class=room>
        <!-- TOP ROW -->
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1718"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0304"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["1719"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["1619"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["1519"]'/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["0305"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["0205"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["0105"]'/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="cell"/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1819"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1419"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0405"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0005"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <!-- ROOM ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["1927"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["0511"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1920"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"ver-"+data["0513"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1925"]'/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1325"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0510"]'/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["2627"]'/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["1112"]'/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1921"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0506"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["1926"]'/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["2425"]'/>
        <Tile state="rightmid"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["0512"]'/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["0910"]'/>
        <Tile state="rightmid"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1922"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["1924"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0507"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["0509"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["1923"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-13"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["0508"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- BOT ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["1928"]'/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="cross"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["1358"]'/>
        <Tile state="topbot"/>
        <Tile state="cross"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["0557"]'/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <!-- ESCAPE ROW -->
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <Tile state="leftright"/>
        <!-- ESCAPE ROW -->
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <Tile v-bind:state='"ver-"+data["2858"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <Tile v-bind:state='"ver-"+data["5758"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <Tile state="leftright"/>
        <!-- ESCAPE ROW -->
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-28"]'/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-58"]'/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-57"]'/>
        <Tile state="leftright"/>
        <!-- TOP ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["2833"]'/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="cross"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["4358"]'/>
        <Tile state="topbot"/>
        <Tile state="cross"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["4457"]'/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3233"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4748"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["3234"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["3134"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["3034"]'/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["4749"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["4649"]'/>
        <Tile state="botmid"/>
        <Tile v-bind:state='"hor-"+data["4549"]'/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3334"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["2934"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4849"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4449"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <!-- ROOM ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["3442"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["4956"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3435"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile v-bind:state='"ver-"+data["4349"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3440"]'/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4954"]'/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["4142"]'/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["5556"]'/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3436"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4950"]'/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["3441"]'/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["3940"]'/>
        <Tile state="rightmid"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile state="rightmid"/>
        <Tile/>
        <Tile state="botleft"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["4955"]'/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <Tile/>
        <Tile state="topleft"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["5354"]'/>
        <Tile state="rightmid"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3437"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3439"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4951"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["4953"]'/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- ROOM ROW -->
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["3438"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile v-bind:state='"ver-"+data["3943"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <tile v-bind:state='"sensor-"+data["motion-sensor-43"]'/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile state="leftmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["4952"]'/>
        <Tile state="topbot"/>
        <Tile state="topright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="leftright"/>
        <!-- BOT ROW -->
        <Tile state="botleft"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile v-bind:state='"hor-"+data["3499"]'/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botmid"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="topbot"/>
        <Tile state="botright"/>
        <!-- ESCAPE ROW -->
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile state="exit"/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
        <Tile/>
    </div>
</template>

<script>
import Tile from './Tile.vue'

export default {
    name: "Map",
    components: {
        Tile
    },
    props: {
        data: Object
    }
}
</script>

<style>
.room {
    display: grid;
    grid-template-rows: repeat(33, 1fr);
    grid-template-columns: repeat(33, 1fr);
    width: 80vmin;
    height: 80vmin;
}
.room::before {
    content: '';
    width: 0;
    padding-bottom: 100%;
    grid-row: 1 / 1;
    grid-column: 1 / 1;
}
.room > *:first-child {
    grid-row: 1 / 1;
    grid-column: 1 / 1;
}
</style>
