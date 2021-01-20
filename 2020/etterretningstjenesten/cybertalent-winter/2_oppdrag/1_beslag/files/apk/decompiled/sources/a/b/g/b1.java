package a.b.g;

import a.h.j.m;
import a.h.j.r;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f141a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f141a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f141a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f141a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static boolean b(View view) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        return view.getLayoutDirection() == 1;
    }
}
