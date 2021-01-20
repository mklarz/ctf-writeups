package a.h.c;

import android.content.Context;
import android.os.Process;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f439a = new Object();

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
