<template>
    <div class="scada">
        <Map v-if="this.json_data !== ''" v-bind:data='JSON.parse(this.json_data)'/>
        <h1 v-else>Currently no SCADA data</h1>
    </div>
    <footer class="flag" v-if="this.flag !== ''">
        <pre>Prisoner managed to escape. Flag: "{{ flag }}"</pre>
    </footer>
</template>

<script>
import Map from './Map.vue'

export default {
    name: "SCADA",
    components: {
        Map
    },
    props: {
        msg: String,
    },
    data() {
        return {
            ws: undefined,
            json_data: "",
            flag: ""
        }
    },
    methods: {
        fetchdata() {
            let self = this;
            let sock = self.ws ? self.ws : new WebSocket(`ws://${location.hostname}:1339/`);
            let magic_message = "POm8HLEmXJ1L2b1EhaXvdg==";
            sock.onopen = function() {
                self.ws = sock;
                //console.log("[open] Conn established");
                //console.log(`Sending to server ${magic_message}`);
                sock.send(magic_message);
            };
            sock.onmessage = function(e) {
                //console.log(`[message] Data from server ${e.data}`);
                if (e.data.includes("flag")) {
                    self.flag = JSON.parse(e.data)["flag"]
                }
                self.json_data = e.data;
            };
            sock.onclose = function(e) {
                self.ws = undefined;
                if (e.wasClean) {
                    //console.log(`[close] Connection closed cleanly, ${e.code} for reason ${e.reason}`);
                } else {
                    //console.log("[close] Connection died");
                }
            };
            sock.onerror = function(e) {
                console.log("[error]:", e);
            }
        }
    },
    beforeMount() {
        this.fetchdata();
    }
}
</script>

<style>
.scada {
    display: flex;
    justify-content: center;
    align-content: center;
    text-align: center;
}
.flag {
    display: flex;
    justify-content: center;
    align-content: center;
    text-align: center;
}
.flag>pre {
    border: 2px solid red;
    padding: 10px;
    color: black;
}
</style>
