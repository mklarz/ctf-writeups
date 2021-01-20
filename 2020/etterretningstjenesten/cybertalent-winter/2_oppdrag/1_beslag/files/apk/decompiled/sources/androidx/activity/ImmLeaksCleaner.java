package androidx.activity;

import a.m.d;
import a.m.e;
import a.m.g;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements e {

    /* renamed from: b  reason: collision with root package name */
    public static int f805b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f806c;
    public static Field d;
    public static Field e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f807a;

    @Override // a.m.e
    public void g(g gVar, d.a aVar) {
        if (aVar == d.a.ON_DESTROY) {
            if (f805b == 0) {
                try {
                    f805b = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    d = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    e = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    f806c = declaredField3;
                    declaredField3.setAccessible(true);
                    f805b = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f805b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f807a.getSystemService("input_method");
                try {
                    Object obj = f806c.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) d.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            e.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused3) {
                            } catch (ClassCastException unused4) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
