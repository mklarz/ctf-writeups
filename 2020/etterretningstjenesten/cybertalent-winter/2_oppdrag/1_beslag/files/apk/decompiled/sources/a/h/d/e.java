package a.h.d;

import a.e.f;
import a.h.b.d;
import a.h.c.b.b;
import a.h.c.b.c;
import a.h.g.e;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b.a.a.a.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e extends d {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public e() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m(cls2);
            method2 = n(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder d = a.d("Unable to collect necessary methods for class ");
            d.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", d.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method2;
        this.k = method;
        this.l = method4;
        this.m = method5;
    }

    private Object l() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.h.d.i, a.h.d.d
    public Typeface a(Context context, b bVar, Resources resources, int i2) {
        if (!k()) {
            return super.a(context, bVar, resources, i2);
        }
        Object l2 = l();
        if (l2 == null) {
            return null;
        }
        c[] cVarArr = bVar.f440a;
        for (c cVar : cVarArr) {
            if (!h(context, l2, cVar.f441a, cVar.e, cVar.f442b, cVar.f443c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d))) {
                g(l2);
                return null;
            }
        }
        if (!j(l2)) {
            return null;
        }
        return i(l2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x00cd */
    @Override // a.h.d.i
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.c[] cVarArr, int i2) {
        Typeface i3;
        boolean z;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!k()) {
            e.c cVar = (e.c) i.d(cVarArr, i2, new h(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(cVar.f477a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(cVar.f479c).setItalic(cVar.d).build();
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            f<String, Typeface> fVar = a.h.g.e.f472a;
            HashMap hashMap = new HashMap();
            for (e.c cVar2 : cVarArr) {
                if (cVar2.e == 0) {
                    Uri uri = cVar2.f477a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, d.p(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object l2 = l();
            if (l2 == null) {
                return null;
            }
            int length = cVarArr.length;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                e.c cVar3 = cVarArr[i4];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(cVar3.f477a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.j.invoke(l2, byteBuffer, Integer.valueOf(cVar3.f478b), null, Integer.valueOf(cVar3.f479c), Integer.valueOf(cVar3.d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        g(l2);
                        return null;
                    }
                    z2 = true;
                }
                i4++;
                z2 = z2;
            }
            if (!z2) {
                g(l2);
                return null;
            } else if (j(l2) && (i3 = i(l2)) != null) {
                return Typeface.create(i3, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // a.h.d.i
    public Typeface c(Context context, Resources resources, int i2, String str, int i3) {
        if (!k()) {
            return super.c(context, resources, i2, str, i3);
        }
        Object l2 = l();
        if (l2 == null) {
            return null;
        }
        if (!h(context, l2, str, 0, -1, -1, null)) {
            g(l2);
            return null;
        } else if (!j(l2)) {
            return null;
        } else {
            return i(l2);
        }
    }

    public final void g(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean h(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean k() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method m(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
