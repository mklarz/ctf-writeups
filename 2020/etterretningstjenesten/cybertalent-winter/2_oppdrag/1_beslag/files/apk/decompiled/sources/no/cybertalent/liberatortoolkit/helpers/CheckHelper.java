package no.cybertalent.liberatortoolkit.helpers;

import android.content.Context;
import android.os.Build;
import b.a.a.a.a;
import java.io.File;
import no.cybertalent.liberatortoolkit.R;

public class CheckHelper {
    public static boolean is(Context context) {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String string = context.getString(R.string.su);
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            if (new File(a.b(strArr[i], string)).exists()) {
                return true;
            }
        }
        return false;
    }
}
