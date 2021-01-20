<template>
    <img v-if="state === 'ver-unlocked'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'ver-locked'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'ver-opened'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'hor-unlocked'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'hor-locked'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'hor-opened'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'botleft'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'botmid'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'botright'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'cross'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'leftmid'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'leftright'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'rightmid'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'topbot'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'topleft'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'topmid'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'topright'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'exit'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">
    <img v-else-if="state === 'cell'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">
    <img v-else-if="state === 'sensor-detected'" v-bind:src="'/map/' + state + '.png'" v-bind:alt="state">   
    <img v-else-if="state === 'sensor-nothing'" src="/map/empty.png" alt="empty">   
    <img v-else src="/map/empty.png" alt="empty">   
</template>

<script>
export default {
    name: "Tile",
    props: {
        state: String
    }
}
</script>

<style>
img {
    width: 100%;
    max-height: 100%;
    object-fit: cover;
}
</style>
