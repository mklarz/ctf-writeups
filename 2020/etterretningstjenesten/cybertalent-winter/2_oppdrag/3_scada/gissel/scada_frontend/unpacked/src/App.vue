<template>
    <SCADA msg="SCADA System Viewer"/>
</template>

<script>
import SCADA from './components/Scada.vue'

export default {
    name: 'App',
    components: {
        SCADA
    },
    beforeMount() {
        console.log("PRO TIP: In case the TOR connection is unstable - you can access this via the hostname 'scada' internally");
        console.log("Here is a flag: b4ba373b44abfb94763e54297d3d19d8");
    }
}
</script>

<style>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #00ff00;
}
html {
    background-color: #9d9d9d;
}
</style>
