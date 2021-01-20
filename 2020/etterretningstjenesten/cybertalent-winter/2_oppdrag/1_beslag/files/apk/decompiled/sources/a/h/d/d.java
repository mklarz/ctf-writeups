package a.h.d;

import a.h.c.b.b;
import a.h.c.b.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d extends i {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f459b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f460c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean e(Object obj, String str, int i, boolean z) {
        f();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void f() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f) {
            f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f460c = constructor;
            f459b = cls;
            d = method;
            e = method2;
        }
    }

    @Override // a.h.d.i
    public Typeface a(Context context, b bVar, Resources resources, int i) {
        f();
        try {
            Object newInstance = f460c.newInstance(new Object[0]);
            c[] cVarArr = bVar.f440a;
            for (c cVar : cVarArr) {
                File n = a.h.b.d.n(context);
                if (n == null) {
                    return null;
                }
                try {
                    if (!a.h.b.d.i(n, resources, cVar.f)) {
                        n.delete();
                        return null;
                    }
                    if (!e(newInstance, n.getPath(), cVar.f442b, cVar.f443c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    n.delete();
                }
            }
            f();
            try {
                Object newInstance2 = Array.newInstance(f459b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
