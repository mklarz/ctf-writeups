package a.h.j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class v {

    /* renamed from: b  reason: collision with root package name */
    public static final v f532b = (Build.VERSION.SDK_INT >= 30 ? i.n : j.f539b);

    /* renamed from: a  reason: collision with root package name */
    public final j f533a;

    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public static Field f534c = null;
        public static boolean d = false;
        public static Constructor<WindowInsets> e = null;
        public static boolean f = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f535b;

        public a() {
            if (!d) {
                try {
                    f534c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                d = true;
            }
            Field field = f534c;
            WindowInsets windowInsets = null;
            if (field != null) {
                try {
                    WindowInsets windowInsets2 = (WindowInsets) field.get(null);
                    if (windowInsets2 != null) {
                        windowInsets = new WindowInsets(windowInsets2);
                        this.f535b = windowInsets;
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f) {
                try {
                    e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = e;
            if (constructor != null) {
                try {
                    windowInsets = constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            this.f535b = windowInsets;
        }

        public a(v vVar) {
            this.f535b = vVar.f();
        }

        @Override // a.h.j.v.d
        public v a() {
            return v.g(this.f535b);
        }

        @Override // a.h.j.v.d
        public void c(a.h.d.b bVar) {
            WindowInsets windowInsets = this.f535b;
            if (windowInsets != null) {
                this.f535b = windowInsets.replaceSystemWindowInsets(bVar.f454a, bVar.f455b, bVar.f456c, bVar.d);
            }
        }
    }

    public static class b extends d {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f536b;

        public b() {
            this.f536b = new WindowInsets.Builder();
        }

        public b(v vVar) {
            WindowInsets.Builder builder;
            if (vVar.f() == null) {
                builder = new WindowInsets.Builder();
            }
            this.f536b = builder;
        }

        @Override // a.h.j.v.d
        public v a() {
            return v.g(this.f536b.build());
        }

        @Override // a.h.j.v.d
        public void b(a.h.d.b bVar) {
            this.f536b.setStableInsets(bVar.b());
        }

        @Override // a.h.j.v.d
        public void c(a.h.d.b bVar) {
            this.f536b.setSystemWindowInsets(bVar.b());
        }
    }

    public static class c extends b {
        public c() {
        }

        public c(v vVar) {
            super(vVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final v f537a = new v((v) null);

        public v a() {
            throw null;
        }

        public void b(a.h.d.b bVar) {
        }

        public void c(a.h.d.b bVar) {
            throw null;
        }
    }

    public static class e extends j {
        public static boolean g = false;
        public static Method h;
        public static Class<?> i;
        public static Class<?> j;
        public static Field k;
        public static Field l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f538c;
        public a.h.d.b d = null;
        public v e;
        public a.h.d.b f;

        public e(v vVar, WindowInsets windowInsets) {
            super(vVar);
            this.f538c = windowInsets;
        }

        public static void l(Exception exc) {
            StringBuilder d2 = b.a.a.a.a.d("Failed to get visible insets. (Reflection error). ");
            d2.append(exc.getMessage());
            Log.e("WindowInsetsCompat", d2.toString(), exc);
        }

        @Override // a.h.j.v.j
        public void d(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!g) {
                    try {
                        h = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                        i = Class.forName("android.view.ViewRootImpl");
                        Class<?> cls = Class.forName("android.view.View$AttachInfo");
                        j = cls;
                        k = cls.getDeclaredField("mVisibleInsets");
                        l = i.getDeclaredField("mAttachInfo");
                        k.setAccessible(true);
                        l.setAccessible(true);
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException e2) {
                        l(e2);
                    }
                    g = true;
                }
                Method method = h;
                a.h.d.b bVar = null;
                if (!(method == null || j == null || k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        } else {
                            Rect rect = (Rect) k.get(l.get(invoke));
                            if (rect != null) {
                                bVar = a.h.d.b.a(rect.left, rect.top, rect.right, rect.bottom);
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException e3) {
                        l(e3);
                    }
                }
                if (bVar == null) {
                    bVar = a.h.d.b.e;
                }
                this.f = bVar;
                return;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // a.h.j.v.j
        public final a.h.d.b g() {
            if (this.d == null) {
                this.d = a.h.d.b.a(this.f538c.getSystemWindowInsetLeft(), this.f538c.getSystemWindowInsetTop(), this.f538c.getSystemWindowInsetRight(), this.f538c.getSystemWindowInsetBottom());
            }
            return this.d;
        }

        @Override // a.h.j.v.j
        public v h(int i2, int i3, int i4, int i5) {
            v g2 = v.g(this.f538c);
            int i6 = Build.VERSION.SDK_INT;
            d cVar = i6 >= 30 ? new c(g2) : i6 >= 29 ? new b(g2) : new a(g2);
            cVar.c(v.e(g(), i2, i3, i4, i5));
            cVar.b(v.e(f(), i2, i3, i4, i5));
            return cVar.a();
        }

        @Override // a.h.j.v.j
        public boolean j() {
            return this.f538c.isRound();
        }

        @Override // a.h.j.v.j
        public void k(v vVar) {
            this.e = vVar;
        }
    }

    public static class f extends e {
        public a.h.d.b m = null;

        public f(v vVar, WindowInsets windowInsets) {
            super(vVar, windowInsets);
        }

        @Override // a.h.j.v.j
        public v b() {
            return v.g(this.f538c.consumeStableInsets());
        }

        @Override // a.h.j.v.j
        public v c() {
            return v.g(this.f538c.consumeSystemWindowInsets());
        }

        @Override // a.h.j.v.j
        public final a.h.d.b f() {
            if (this.m == null) {
                this.m = a.h.d.b.a(this.f538c.getStableInsetLeft(), this.f538c.getStableInsetTop(), this.f538c.getStableInsetRight(), this.f538c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // a.h.j.v.j
        public boolean i() {
            return this.f538c.isConsumed();
        }
    }

    public static class g extends f {
        public g(v vVar, WindowInsets windowInsets) {
            super(vVar, windowInsets);
        }

        @Override // a.h.j.v.j
        public v a() {
            return v.g(this.f538c.consumeDisplayCutout());
        }

        @Override // a.h.j.v.j
        public c e() {
            DisplayCutout displayCutout = this.f538c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new c(displayCutout);
        }

        @Override // a.h.j.v.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return Objects.equals(this.f538c, ((g) obj).f538c);
        }

        @Override // a.h.j.v.j
        public int hashCode() {
            return this.f538c.hashCode();
        }
    }

    public static class h extends g {
        public h(v vVar, WindowInsets windowInsets) {
            super(vVar, windowInsets);
        }

        @Override // a.h.j.v.j, a.h.j.v.e
        public v h(int i, int i2, int i3, int i4) {
            return v.g(this.f538c.inset(i, i2, i3, i4));
        }
    }

    public static class i extends h {
        public static final v n = v.g(WindowInsets.CONSUMED);

        public i(v vVar, WindowInsets windowInsets) {
            super(vVar, windowInsets);
        }

        @Override // a.h.j.v.j, a.h.j.v.e
        public final void d(View view) {
        }
    }

    public static class j {

        /* renamed from: b  reason: collision with root package name */
        public static final v f539b;

        /* renamed from: a  reason: collision with root package name */
        public final v f540a;

        static {
            int i = Build.VERSION.SDK_INT;
            f539b = (i >= 30 ? new c() : i >= 29 ? new b() : new a()).a().f533a.a().f533a.b().f533a.c();
        }

        public j(v vVar) {
            this.f540a = vVar;
        }

        public v a() {
            return this.f540a;
        }

        public v b() {
            return this.f540a;
        }

        public v c() {
            return this.f540a;
        }

        public void d(View view) {
        }

        public c e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return j() == jVar.j() && i() == jVar.i() && Objects.equals(g(), jVar.g()) && Objects.equals(f(), jVar.f()) && Objects.equals(e(), jVar.e());
        }

        public a.h.d.b f() {
            return a.h.d.b.e;
        }

        public a.h.d.b g() {
            return a.h.d.b.e;
        }

        public v h(int i, int i2, int i3, int i4) {
            return f539b;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e());
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(v vVar) {
        }
    }

    public v(v vVar) {
        this.f533a = new j(this);
    }

    public v(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.f533a = i2 >= 30 ? new i(this, windowInsets) : i2 >= 29 ? new h(this, windowInsets) : i2 >= 28 ? new g(this, windowInsets) : new f(this, windowInsets);
    }

    public static a.h.d.b e(a.h.d.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f454a - i2);
        int max2 = Math.max(0, bVar.f455b - i3);
        int max3 = Math.max(0, bVar.f456c - i4);
        int max4 = Math.max(0, bVar.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : a.h.d.b.a(max, max2, max3, max4);
    }

    public static v g(WindowInsets windowInsets) {
        return h(windowInsets, null);
    }

    public static v h(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        v vVar = new v(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            vVar.f533a.k(m.e(view));
            vVar.f533a.d(view.getRootView());
        }
        return vVar;
    }

    @Deprecated
    public int a() {
        return this.f533a.g().d;
    }

    @Deprecated
    public int b() {
        return this.f533a.g().f454a;
    }

    @Deprecated
    public int c() {
        return this.f533a.g().f456c;
    }

    @Deprecated
    public int d() {
        return this.f533a.g().f455b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return Objects.equals(this.f533a, ((v) obj).f533a);
    }

    public WindowInsets f() {
        j jVar = this.f533a;
        if (jVar instanceof e) {
            return ((e) jVar).f538c;
        }
        return null;
    }

    public int hashCode() {
        j jVar = this.f533a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}
