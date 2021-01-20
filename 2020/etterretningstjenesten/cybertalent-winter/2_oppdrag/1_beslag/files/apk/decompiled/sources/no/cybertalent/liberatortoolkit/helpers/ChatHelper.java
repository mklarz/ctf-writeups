package no.cybertalent.liberatortoolkit.helpers;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public class ChatHelper {
    public static final boolean emu;

    static {
        boolean z;
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z = false;
                            emu = z;
                        }
                    }
                }
            }
        }
        z = true;
        emu = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        throw r6;
     */
    public static String a(String str, String str2) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL("https://mobile.cybertalent.no/" + str + "?token=" + str2).openStream());
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    String sb2 = sb.toString();
                    bufferedInputStream.close();
                    return sb2;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static native String getResponse(String str);
}
