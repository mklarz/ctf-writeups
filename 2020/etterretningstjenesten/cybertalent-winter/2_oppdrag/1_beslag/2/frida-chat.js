console.log("Loaded frida-chat.js");

function getResponse(challenge) {
  setTimeout(function() {
    Java.perform(function () {
      var ChatHelper = Java.use("no.cybertalent.liberatortoolkit.helpers.ChatHelper")
      ChatHelper.emu.value = false;
      send(ChatHelper.getResponse(challenge));
    });
  }, 100);
}

rpc.exports = {
    getresponse: getResponse
};
