const zeroPad = (num, places) => String(num).padStart(places, '0')
console.log("Loaded frida-vault.js");
setTimeout(function() {
  Java.perform(function () {
    // Override the `CheckHelper.is` function.
    var CheckHelper = Java.use("no.cybertalent.liberatortoolkit.helpers.CheckHelper");
    CheckHelper.is.implementation = function() {
      return false;
    }

    // For checking pin_hash
    var base64 = Java.use('android.util.Base64');

    // Find the VaultActivity
    Java.choose("no.cybertalent.liberatortoolkit.VaultActivity", {
      onMatch: function (instance) {
        console.log("Found VaultActivity object instance: " + instance);
        console.log("Starting bruteforce...");
        for (var i = 0; i <= 9999; i++) {
          let pin = zeroPad(i, 4);
          var t_result = instance.t(pin);
          var finalize_result = instance.finalize(t_result);

          var base = [];
          for (var a = 0; a < 16; a++) {
            base.push(finalize_result[a]);
          }
          var b64 = base64.encodeToString(base, 0).trim();
          if (b64 === "BSzN6uy2dDcolImpMKxffg==") {
            console.log("Found PIN:", pin);
            return;
          }
        }
      },
      onComplete: function () { }
    });
  });
}, 5000);
