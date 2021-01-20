package a.b.c;

import a.b.c.p;
import a.b.c.q;
import a.b.f.a;
import a.b.f.e;
import a.b.f.i.e;
import a.b.f.i.g;
import a.b.f.i.m;
import a.b.g.a1;
import a.b.g.b1;
import a.b.g.c0;
import a.b.g.d0;
import a.b.g.n0;
import a.b.g.x0;
import a.h.j.d;
import a.h.j.r;
import a.h.j.t;
import a.h.j.v;
import a.m.d;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class h extends g implements g.a, LayoutInflater.Factory2 {
    public static final a.e.h<String, Integer> Z = new a.e.h<>();
    public static final int[] a0 = {16842836};
    public static final boolean b0 = (!"robolectric".equals(Build.FINGERPRINT));
    public static final boolean c0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public i[] F;
    public i G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M = -100;
    public int N;
    public boolean O;
    public boolean P;
    public f Q;
    public f R;
    public boolean S;
    public int T;
    public final Runnable U = new a();
    public boolean V;
    public Rect W;
    public Rect X;
    public n Y;
    public final Object d;
    public final Context e;
    public Window f;
    public d g;
    public final f h;
    public a i;
    public MenuInflater j;
    public CharSequence k;
    public c0 l;
    public b m;
    public j n;
    public a.b.f.a o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public r s = null;
    public boolean t;
    public ViewGroup u;
    public TextView v;
    public View w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.T & 1) != 0) {
                hVar.H(0);
            }
            h hVar2 = h.this;
            if ((hVar2.T & 4096) != 0) {
                hVar2.H(108);
            }
            h hVar3 = h.this;
            hVar3.S = false;
            hVar3.T = 0;
        }
    }

    public final class b implements m.a {
        public b() {
        }

        @Override // a.b.f.i.m.a
        public void c(a.b.f.i.g gVar, boolean z) {
            h.this.D(gVar);
        }

        @Override // a.b.f.i.m.a
        public boolean d(a.b.f.i.g gVar) {
            Window.Callback O = h.this.O();
            if (O == null) {
                return true;
            }
            O.onMenuOpened(108, gVar);
            return true;
        }
    }

    public class c implements a.AbstractC0002a {

        /* renamed from: a  reason: collision with root package name */
        public a.AbstractC0002a f16a;

        public class a extends t {
            public a() {
            }

            @Override // a.h.j.s
            public void a(View view) {
                h.this.p.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.p.getParent() instanceof View) {
                    WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
                    ((View) h.this.p.getParent()).requestApplyInsets();
                }
                h.this.p.removeAllViews();
                h.this.s.d(null);
                h hVar2 = h.this;
                hVar2.s = null;
                ViewGroup viewGroup = hVar2.u;
                WeakHashMap<View, r> weakHashMap2 = a.h.j.m.f516a;
                viewGroup.requestApplyInsets();
            }
        }

        public c(a.AbstractC0002a aVar) {
            this.f16a = aVar;
        }

        @Override // a.b.f.a.AbstractC0002a
        public boolean a(a.b.f.a aVar, Menu menu) {
            ViewGroup viewGroup = h.this.u;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            viewGroup.requestApplyInsets();
            return this.f16a.a(aVar, menu);
        }

        @Override // a.b.f.a.AbstractC0002a
        public void b(a.b.f.a aVar) {
            this.f16a.b(aVar);
            h hVar = h.this;
            if (hVar.q != null) {
                hVar.f.getDecorView().removeCallbacks(h.this.r);
            }
            h hVar2 = h.this;
            if (hVar2.p != null) {
                hVar2.I();
                h hVar3 = h.this;
                r a2 = a.h.j.m.a(hVar3.p);
                a2.a(0.0f);
                hVar3.s = a2;
                r rVar = h.this.s;
                a aVar2 = new a();
                View view = rVar.f526a.get();
                if (view != null) {
                    rVar.e(view, aVar2);
                }
            }
            h hVar4 = h.this;
            f fVar = hVar4.h;
            if (fVar != null) {
                fVar.g(hVar4.o);
            }
            h hVar5 = h.this;
            hVar5.o = null;
            ViewGroup viewGroup = hVar5.u;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            viewGroup.requestApplyInsets();
        }

        @Override // a.b.f.a.AbstractC0002a
        public boolean c(a.b.f.a aVar, MenuItem menuItem) {
            return this.f16a.c(aVar, menuItem);
        }

        @Override // a.b.f.a.AbstractC0002a
        public boolean d(a.b.f.a aVar, Menu menu) {
            return this.f16a.d(aVar, menu);
        }
    }

    public class d extends a.b.f.h {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
        public final ActionMode a(ActionMode.Callback callback) {
            a.b.f.a aVar;
            a.b.f.a aVar2;
            f fVar;
            a.b.f.c cVar;
            f fVar2;
            e.a aVar3 = new e.a(h.this.e, callback);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            a.b.f.a aVar4 = hVar.o;
            if (aVar4 != null) {
                aVar4.c();
            }
            c cVar2 = new c(aVar3);
            hVar.P();
            a aVar5 = hVar.i;
            boolean z = true;
            if (aVar5 != null) {
                q qVar = (q) aVar5;
                q.d dVar = qVar.i;
                if (dVar != null) {
                    dVar.c();
                }
                qVar.f49c.setHideOnContentScrollEnabled(false);
                qVar.f.h();
                q.d dVar2 = new q.d(qVar.f.getContext(), cVar2);
                dVar2.e.z();
                try {
                    if (dVar2.f.d(dVar2, dVar2.e)) {
                        qVar.i = dVar2;
                        dVar2.i();
                        qVar.f.f(dVar2);
                        qVar.d(true);
                        qVar.f.sendAccessibilityEvent(32);
                    } else {
                        dVar2 = null;
                    }
                    hVar.o = dVar2;
                    if (!(dVar2 == null || (fVar2 = hVar.h) == null)) {
                        fVar2.c(dVar2);
                    }
                } finally {
                    dVar2.e.y();
                }
            }
            if (hVar.o == null) {
                hVar.I();
                a.b.f.a aVar6 = hVar.o;
                if (aVar6 != null) {
                    aVar6.c();
                }
                f fVar3 = hVar.h;
                if (fVar3 != null && !hVar.L) {
                    try {
                        aVar = fVar3.h(cVar2);
                    } catch (AbstractMethodError unused) {
                    }
                    if (aVar == null) {
                        hVar.o = aVar;
                    } else {
                        if (hVar.p == null) {
                            if (hVar.C) {
                                TypedValue typedValue = new TypedValue();
                                Resources.Theme theme = hVar.e.getTheme();
                                theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    Resources.Theme newTheme = hVar.e.getResources().newTheme();
                                    newTheme.setTo(theme);
                                    newTheme.applyStyle(typedValue.resourceId, true);
                                    a.b.f.c cVar3 = new a.b.f.c(hVar.e, 0);
                                    cVar3.getTheme().setTo(newTheme);
                                    cVar = cVar3;
                                } else {
                                    cVar = hVar.e;
                                }
                                hVar.p = new ActionBarContextView(cVar, null);
                                PopupWindow popupWindow = new PopupWindow(cVar, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                                hVar.q = popupWindow;
                                popupWindow.setWindowLayoutType(2);
                                hVar.q.setContentView(hVar.p);
                                hVar.q.setWidth(-1);
                                cVar.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                                hVar.p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, cVar.getResources().getDisplayMetrics()));
                                hVar.q.setHeight(-2);
                                hVar.r = new k(hVar);
                            } else {
                                ViewStubCompat viewStubCompat = (ViewStubCompat) hVar.u.findViewById(R.id.action_mode_bar_stub);
                                if (viewStubCompat != null) {
                                    hVar.P();
                                    a aVar7 = hVar.i;
                                    Context b2 = aVar7 != null ? aVar7.b() : null;
                                    if (b2 == null) {
                                        b2 = hVar.e;
                                    }
                                    viewStubCompat.setLayoutInflater(LayoutInflater.from(b2));
                                    hVar.p = (ActionBarContextView) viewStubCompat.a();
                                }
                            }
                        }
                        if (hVar.p != null) {
                            hVar.I();
                            hVar.p.h();
                            Context context = hVar.p.getContext();
                            ActionBarContextView actionBarContextView = hVar.p;
                            if (hVar.q != null) {
                                z = false;
                            }
                            a.b.f.d dVar3 = new a.b.f.d(context, actionBarContextView, cVar2, z);
                            if (cVar2.d(dVar3, dVar3.i)) {
                                dVar3.i();
                                hVar.p.f(dVar3);
                                hVar.o = dVar3;
                                if (hVar.V()) {
                                    hVar.p.setAlpha(0.0f);
                                    r a2 = a.h.j.m.a(hVar.p);
                                    a2.a(1.0f);
                                    hVar.s = a2;
                                    l lVar = new l(hVar);
                                    View view = a2.f526a.get();
                                    if (view != null) {
                                        a2.e(view, lVar);
                                    }
                                } else {
                                    hVar.p.setAlpha(1.0f);
                                    hVar.p.setVisibility(0);
                                    hVar.p.sendAccessibilityEvent(32);
                                    if (hVar.p.getParent() instanceof View) {
                                        WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
                                        ((View) hVar.p.getParent()).requestApplyInsets();
                                    }
                                }
                                if (hVar.q != null) {
                                    hVar.f.getDecorView().post(hVar.r);
                                }
                            } else {
                                hVar.o = null;
                            }
                        }
                    }
                    aVar2 = hVar.o;
                    if (!(aVar2 == null || (fVar = hVar.h) == null)) {
                        fVar.c(aVar2);
                    }
                    hVar.o = hVar.o;
                }
                aVar = null;
                if (aVar == null) {
                }
                aVar2 = hVar.o;
                fVar.c(aVar2);
                hVar.o = hVar.o;
            }
            a.b.f.a aVar8 = hVar.o;
            if (aVar8 != null) {
                return aVar3.e(aVar8);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.G(keyEvent) || this.f82b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            if (r3 != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            if (r7 != false) goto L_0x006b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            boolean z2;
            a.b.f.i.g gVar;
            if (!this.f82b.dispatchKeyShortcutEvent(keyEvent)) {
                h hVar = h.this;
                int keyCode = keyEvent.getKeyCode();
                hVar.P();
                a aVar = hVar.i;
                if (aVar != null) {
                    q.d dVar = ((q) aVar).i;
                    if (dVar == null || (gVar = dVar.e) == null) {
                        z2 = false;
                    } else {
                        gVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                        z2 = gVar.performShortcut(keyCode, keyEvent, 0);
                    }
                }
                i iVar = hVar.G;
                if (iVar == null || !hVar.T(iVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                    if (hVar.G == null) {
                        i N = hVar.N(0);
                        hVar.U(N, keyEvent);
                        boolean T = hVar.T(N, keyEvent.getKeyCode(), keyEvent, 1);
                        N.k = false;
                    }
                    z = false;
                    if (!z) {
                        return false;
                    }
                } else {
                    i iVar2 = hVar.G;
                    if (iVar2 != null) {
                        iVar2.l = true;
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
            return true;
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof a.b.f.i.g)) {
                return this.f82b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.f82b.onMenuOpened(i, menu);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            if (i == 108) {
                hVar.P();
                a aVar = hVar.i;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.f82b.onPanelClosed(i, menu);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            if (i == 108) {
                hVar.P();
                a aVar = hVar.i;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i == 0) {
                i N = hVar.N(i);
                if (N.m) {
                    hVar.E(N, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            a.b.f.i.g gVar = menu instanceof a.b.f.i.g ? (a.b.f.i.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.x = true;
            }
            boolean onPreparePanel = this.f82b.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.x = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            a.b.f.i.g gVar = h.this.N(0).h;
            if (gVar != null) {
                this.f82b.onProvideKeyboardShortcuts(list, gVar, i);
            } else {
                this.f82b.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Objects.requireNonNull(h.this);
            if (i != 0) {
                return this.f82b.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    public class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f20c;

        public e(Context context) {
            super();
            this.f20c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // a.b.c.h.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // a.b.c.h.f
        public int c() {
            return this.f20c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // a.b.c.h.f
        public void d() {
            h.this.z();
        }
    }

    public abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f21a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                f.this.d();
            }
        }

        public f() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f21a;
            if (broadcastReceiver != null) {
                try {
                    h.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f21a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.f21a == null) {
                    this.f21a = new a();
                }
                h.this.e.registerReceiver(this.f21a, b2);
            }
        }
    }

    public class g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final p f24c;

        public g(p pVar) {
            super();
            this.f24c = pVar;
        }

        @Override // a.b.c.h.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        @Override // a.b.c.h.f
        public int c() {
            boolean z;
            long j;
            p pVar = this.f24c;
            p.a aVar = pVar.f44c;
            if (!(aVar.f46b > System.currentTimeMillis())) {
                Location location = null;
                Location a2 = a.h.b.d.d(pVar.f42a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? pVar.a("network") : null;
                if (a.h.b.d.d(pVar.f42a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = pVar.a("gps");
                }
                if (location == null || a2 == null ? location != null : location.getTime() > a2.getTime()) {
                    a2 = location;
                }
                if (a2 != null) {
                    p.a aVar2 = pVar.f44c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (o.d == null) {
                        o.d = new o();
                    }
                    o oVar = o.d;
                    oVar.a(currentTimeMillis - 86400000, a2.getLatitude(), a2.getLongitude());
                    oVar.a(currentTimeMillis, a2.getLatitude(), a2.getLongitude());
                    boolean z2 = oVar.f41c == 1;
                    long j2 = oVar.f40b;
                    long j3 = oVar.f39a;
                    oVar.a(currentTimeMillis + 86400000, a2.getLatitude(), a2.getLongitude());
                    long j4 = oVar.f40b;
                    if (j2 == -1 || j3 == -1) {
                        j = currentTimeMillis + 43200000;
                    } else {
                        j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                    }
                    aVar2.f45a = z2;
                    aVar2.f46b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                    if (!z) {
                        return 2;
                    }
                    return 1;
                }
            }
            z = aVar.f45a;
            if (!z) {
            }
        }

        @Override // a.b.c.h.f
        public void d() {
            h.this.z();
        }
    }

    /* renamed from: a.b.c.h$h  reason: collision with other inner class name */
    public class C0001h extends ContentFrameLayout {
        public C0001h(Context context) {
            super(context, null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    h hVar = h.this;
                    hVar.E(hVar.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.b.d.a.a.a(getContext(), i));
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public int f25a;

        /* renamed from: b  reason: collision with root package name */
        public int f26b;

        /* renamed from: c  reason: collision with root package name */
        public int f27c;
        public int d;
        public ViewGroup e;
        public View f;
        public View g;
        public a.b.f.i.g h;
        public a.b.f.i.e i;
        public Context j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public i(int i2) {
            this.f25a = i2;
        }

        public void a(a.b.f.i.g gVar) {
            a.b.f.i.e eVar;
            a.b.f.i.g gVar2 = this.h;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.u(this.i);
                }
                this.h = gVar;
                if (gVar != null && (eVar = this.i) != null) {
                    gVar.b(eVar, gVar.f106a);
                }
            }
        }
    }

    public final class j implements m.a {
        public j() {
        }

        @Override // a.b.f.i.m.a
        public void c(a.b.f.i.g gVar, boolean z) {
            a.b.f.i.g k = gVar.k();
            boolean z2 = k != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = k;
            }
            i L = hVar.L(gVar);
            if (L == null) {
                return;
            }
            if (z2) {
                h.this.C(L.f25a, L, k);
                h.this.E(L, true);
                return;
            }
            h.this.E(L, z);
        }

        @Override // a.b.f.i.m.a
        public boolean d(a.b.f.i.g gVar) {
            Window.Callback O;
            if (gVar != gVar.k()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.z || (O = hVar.O()) == null || h.this.L) {
                return true;
            }
            O.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    public h(Context context, Window window, f fVar, Object obj) {
        a.e.h<String, Integer> hVar;
        Integer orDefault;
        e eVar;
        this.e = context;
        this.h = fVar;
        this.d = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof e)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        eVar = (e) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (eVar != null) {
                this.M = eVar.o().f();
            }
        }
        if (this.M == -100 && (orDefault = (hVar = Z).getOrDefault(this.d.getClass().getName(), null)) != null) {
            this.M = orDefault.intValue();
            hVar.remove(this.d.getClass().getName());
        }
        if (window != null) {
            B(window);
        }
        a.b.g.j.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0108, code lost:
        if (r1 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010d, code lost:
        if (r11.K != false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014a  */
    public final boolean A(boolean z2) {
        boolean z3;
        boolean z4;
        Activity activity;
        boolean z5 = false;
        if (this.L) {
            return false;
        }
        int i2 = this.M;
        if (i2 == -100) {
            i2 = -100;
        }
        int R2 = R(this.e, i2);
        int i3 = Build.VERSION.SDK_INT;
        Configuration F2 = F(this.e, R2, null);
        boolean z6 = true;
        if (!this.P && (this.d instanceof Activity)) {
            PackageManager packageManager = this.e.getPackageManager();
            if (packageManager == null) {
                z3 = false;
                int i4 = this.e.getResources().getConfiguration().uiMode & 48;
                int i5 = F2.uiMode & 48;
                if (i4 != i5 && z2 && !z3 && this.I && (b0 || this.J)) {
                    Object obj = this.d;
                    if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                        activity = (Activity) this.d;
                        int i6 = a.h.b.a.f423b;
                        if (i3 >= 28 || !a.h.b.b.b(activity)) {
                            activity.recreate();
                        }
                        z4 = true;
                        if (!z4 || i4 == i5) {
                            z6 = z4;
                        } else {
                            Resources resources = this.e.getResources();
                            Configuration configuration = new Configuration(resources.getConfiguration());
                            configuration.uiMode = i5 | (resources.getConfiguration().uiMode & -49);
                            resources.updateConfiguration(configuration, null);
                            int i7 = this.N;
                            if (i7 != 0) {
                                this.e.setTheme(i7);
                                this.e.getTheme().applyStyle(this.N, true);
                            }
                            if (z3) {
                                Object obj2 = this.d;
                                if (obj2 instanceof Activity) {
                                    Activity activity2 = (Activity) obj2;
                                    if (activity2 instanceof a.m.g) {
                                        if (((a.m.h) ((a.m.g) activity2).a()).f646b.compareTo((Enum) d.b.STARTED) >= 0) {
                                            z5 = true;
                                        }
                                    }
                                    activity2.onConfigurationChanged(configuration);
                                }
                            }
                        }
                        if (z6) {
                            Object obj3 = this.d;
                            if (obj3 instanceof e) {
                                ((e) obj3).r();
                            }
                        }
                        if (i2 == 0) {
                            M(this.e).e();
                        } else {
                            f fVar = this.Q;
                            if (fVar != null) {
                                fVar.a();
                            }
                        }
                        if (i2 == 3) {
                            Context context = this.e;
                            if (this.R == null) {
                                this.R = new e(context);
                            }
                            this.R.e();
                        } else {
                            f fVar2 = this.R;
                            if (fVar2 != null) {
                                fVar2.a();
                            }
                        }
                        return z6;
                    }
                }
                z4 = false;
                if (!z4) {
                }
                z6 = z4;
                if (z6) {
                }
                if (i2 == 0) {
                }
                if (i2 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.e, this.d.getClass()), i3 >= 29 ? 269221888 : 786432);
                this.O = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.O = false;
            }
        }
        this.P = true;
        z3 = this.O;
        int i42 = this.e.getResources().getConfiguration().uiMode & 48;
        int i52 = F2.uiMode & 48;
        Object obj4 = this.d;
        activity = (Activity) this.d;
        int i62 = a.h.b.a.f423b;
        activity.recreate();
        z4 = true;
        if (!z4) {
        }
        z6 = z4;
        if (z6) {
        }
        if (i2 == 0) {
        }
        if (i2 == 3) {
        }
        return z6;
    }

    public final void B(Window window) {
        if (this.f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof d)) {
                d dVar = new d(callback);
                this.g = dVar;
                window.setCallback(dVar);
                x0 n2 = x0.n(this.e, null, a0);
                Drawable f2 = n2.f(0);
                if (f2 != null) {
                    window.setBackgroundDrawable(f2);
                }
                n2.f240b.recycle();
                this.f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void C(int i2, i iVar, Menu menu) {
        if (menu == null && iVar != null) {
            menu = iVar.h;
        }
        if ((iVar == null || iVar.m) && !this.L) {
            this.g.f82b.onPanelClosed(i2, menu);
        }
    }

    public void D(a.b.f.i.g gVar) {
        if (!this.E) {
            this.E = true;
            this.l.j();
            Window.Callback O2 = O();
            if (O2 != null && !this.L) {
                O2.onPanelClosed(108, gVar);
            }
            this.E = false;
        }
    }

    public void E(i iVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || iVar.f25a != 0 || (c0Var = this.l) == null || !c0Var.e()) {
            WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
            if (!(windowManager == null || !iVar.m || (viewGroup = iVar.e) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    C(iVar.f25a, iVar, null);
                }
            }
            iVar.k = false;
            iVar.l = false;
            iVar.m = false;
            iVar.f = null;
            iVar.o = true;
            if (this.G == iVar) {
                this.G = null;
                return;
            }
            return;
        }
        D(iVar.h);
    }

    public final Configuration F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0123, code lost:
        if (r7 != false) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    public boolean G(KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        View decorView;
        Object obj = this.d;
        boolean z6 = true;
        if (((obj instanceof d.a) || (obj instanceof m)) && (decorView = this.f.getDecorView()) != null && a.h.j.d.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.g.f82b.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z6 = false;
                }
                this.H = z6;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                i N2 = N(0);
                if (N2.m) {
                    return true;
                }
                U(N2, keyEvent);
                return true;
            }
        } else if (keyCode == 4) {
            boolean z7 = this.H;
            this.H = false;
            i N3 = N(0);
            if (!N3.m) {
                a.b.f.a aVar = this.o;
                if (aVar != null) {
                    aVar.c();
                } else {
                    P();
                    a aVar2 = this.i;
                    if (aVar2 != null) {
                        q qVar = (q) aVar2;
                        d0 d0Var = qVar.e;
                        if (d0Var == null || !d0Var.m()) {
                            z3 = false;
                        } else {
                            qVar.e.collapseActionView();
                            z3 = true;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return true;
                    }
                }
                z2 = true;
                if (z2) {
                }
            } else if (z7) {
                return true;
            } else {
                E(N3, true);
                return true;
            }
        } else if (keyCode == 82) {
            if (this.o != null) {
                return true;
            }
            i N4 = N(0);
            c0 c0Var = this.l;
            if (c0Var == null || !c0Var.f() || ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                boolean z8 = N4.m;
                if (z8 || N4.l) {
                    E(N4, true);
                    z4 = z8;
                    if (z4) {
                        return true;
                    }
                    AudioManager audioManager = (AudioManager) this.e.getApplicationContext().getSystemService("audio");
                    if (audioManager != null) {
                        audioManager.playSoundEffect(0);
                        return true;
                    }
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    return true;
                } else if (N4.k) {
                    if (N4.p) {
                        N4.k = false;
                        z5 = U(N4, keyEvent);
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        S(N4, keyEvent);
                        z4 = true;
                        if (z4) {
                        }
                    }
                }
            } else {
                if (this.l.e()) {
                    z4 = this.l.g();
                } else if (!this.L && U(N4, keyEvent)) {
                    z4 = this.l.a();
                }
                if (z4) {
                }
            }
            z4 = false;
            if (z4) {
            }
        }
        return false;
    }

    public void H(int i2) {
        i N2 = N(i2);
        if (N2.h != null) {
            Bundle bundle = new Bundle();
            N2.h.w(bundle);
            if (bundle.size() > 0) {
                N2.q = bundle;
            }
            N2.h.z();
            N2.h.clear();
        }
        N2.p = true;
        N2.o = true;
        if ((i2 == 108 || i2 == 0) && this.l != null) {
            i N3 = N(0);
            N3.k = false;
            U(N3, null);
        }
    }

    public void I() {
        r rVar = this.s;
        if (rVar != null) {
            rVar.b();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        int[] iArr = a.b.b.j;
        if (!this.t) {
            TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(115)) {
                if (obtainStyledAttributes.getBoolean(124, false)) {
                    t(1);
                } else if (obtainStyledAttributes.getBoolean(115, false)) {
                    t(108);
                }
                if (obtainStyledAttributes.getBoolean(116, false)) {
                    t(109);
                }
                if (obtainStyledAttributes.getBoolean(117, false)) {
                    t(10);
                }
                this.C = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                K();
                this.f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.e);
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(this.B ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.C) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.A = false;
                    this.z = false;
                } else if (this.z) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.b.f.c(this.e, typedValue.resourceId) : this.e).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    c0 c0Var = (c0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.l = c0Var;
                    c0Var.setWindowCallback(O());
                    if (this.A) {
                        this.l.h(109);
                    }
                    if (this.x) {
                        this.l.h(2);
                    }
                    if (this.y) {
                        this.l.h(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    a.h.j.m.h(viewGroup, new i(this));
                    if (this.l == null) {
                        this.v = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = b1.f141a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new j(this));
                    this.u = viewGroup;
                    Object obj = this.d;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.k;
                    if (!TextUtils.isEmpty(title)) {
                        c0 c0Var2 = this.l;
                        if (c0Var2 != null) {
                            c0Var2.setWindowTitle(title);
                        } else {
                            a aVar = this.i;
                            if (aVar != null) {
                                ((q) aVar).e.setWindowTitle(title);
                            } else {
                                TextView textView = this.v;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.u.findViewById(16908290);
                    View decorView = this.f.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.e.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(118)) {
                        obtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(119)) {
                        obtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.t = true;
                    i N2 = N(0);
                    if (!this.L && N2.h == null) {
                        Q(108);
                        return;
                    }
                    return;
                }
                StringBuilder d2 = b.a.a.a.a.d("AppCompat does not support the current theme features: { windowActionBar: ");
                d2.append(this.z);
                d2.append(", windowActionBarOverlay: ");
                d2.append(this.A);
                d2.append(", android:windowIsFloating: ");
                d2.append(this.C);
                d2.append(", windowActionModeOverlay: ");
                d2.append(this.B);
                d2.append(", windowNoTitle: ");
                d2.append(this.D);
                d2.append(" }");
                throw new IllegalArgumentException(d2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void K() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public i L(Menu menu) {
        i[] iVarArr = this.F;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.h == menu) {
                return iVar;
            }
        }
        return null;
    }

    public final f M(Context context) {
        if (this.Q == null) {
            if (p.d == null) {
                Context applicationContext = context.getApplicationContext();
                p.d = new p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Q = new g(p.d);
        }
        return this.Q;
    }

    public i N(int i2) {
        i[] iVarArr = this.F;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[(i2 + 1)];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.F = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i2);
        iVarArr[i2] = iVar2;
        return iVar2;
    }

    public final Window.Callback O() {
        return this.f.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    public final void P() {
        a aVar;
        q qVar;
        J();
        if (this.z && this.i == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                qVar = new q((Activity) this.d, this.A);
            } else {
                if (obj instanceof Dialog) {
                    qVar = new q((Dialog) this.d);
                }
                aVar = this.i;
                if (aVar == null) {
                    aVar.c(this.V);
                    return;
                }
                return;
            }
            this.i = qVar;
            aVar = this.i;
            if (aVar == null) {
            }
        }
    }

    public final void Q(int i2) {
        this.T = (1 << i2) | this.T;
        if (!this.S) {
            View decorView = this.f.getDecorView();
            Runnable runnable = this.U;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            decorView.postOnAnimation(runnable);
            this.S = true;
        }
    }

    public int R(Context context, int i2) {
        f M2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.R == null) {
                            this.R = new e(context);
                        }
                        M2 = this.R;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                M2 = M(context);
            }
            return M2.c();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        if (r15 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    public final void S(i iVar, KeyEvent keyEvent) {
        int i2;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        if (!iVar.m && !this.L) {
            if (iVar.f25a == 0) {
                if ((this.e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback O2 = O();
            if (O2 == null || O2.onMenuOpened(iVar.f25a, iVar.h)) {
                WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
                if (windowManager != null && U(iVar, keyEvent)) {
                    ViewGroup viewGroup = iVar.e;
                    if (viewGroup == null || iVar.o) {
                        if (viewGroup == null) {
                            P();
                            a aVar = this.i;
                            Context b2 = aVar != null ? aVar.b() : null;
                            if (b2 == null) {
                                b2 = this.e;
                            }
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme newTheme = b2.getResources().newTheme();
                            newTheme.setTo(b2.getTheme());
                            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                            int i3 = typedValue.resourceId;
                            if (i3 != 0) {
                                newTheme.applyStyle(i3, true);
                            }
                            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                            int i4 = typedValue.resourceId;
                            if (i4 == 0) {
                                i4 = 2131689782;
                            }
                            newTheme.applyStyle(i4, true);
                            a.b.f.c cVar = new a.b.f.c(b2, 0);
                            cVar.getTheme().setTo(newTheme);
                            iVar.j = cVar;
                            TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(a.b.b.j);
                            iVar.f26b = obtainStyledAttributes.getResourceId(84, 0);
                            iVar.d = obtainStyledAttributes.getResourceId(1, 0);
                            obtainStyledAttributes.recycle();
                            iVar.e = new C0001h(iVar.j);
                            iVar.f27c = 81;
                        } else if (iVar.o && viewGroup.getChildCount() > 0) {
                            iVar.e.removeAllViews();
                        }
                        View view = iVar.g;
                        if (view != null) {
                            iVar.f = view;
                        } else {
                            if (iVar.h != null) {
                                if (this.n == null) {
                                    this.n = new j();
                                }
                                j jVar = this.n;
                                if (iVar.i == null) {
                                    a.b.f.i.e eVar = new a.b.f.i.e(iVar.j, R.layout.abc_list_menu_item_layout);
                                    iVar.i = eVar;
                                    eVar.f = jVar;
                                    a.b.f.i.g gVar = iVar.h;
                                    gVar.b(eVar, gVar.f106a);
                                }
                                a.b.f.i.e eVar2 = iVar.i;
                                ViewGroup viewGroup2 = iVar.e;
                                if (eVar2.e == null) {
                                    eVar2.e = (ExpandedMenuView) eVar2.f101c.inflate(R.layout.abc_expanded_menu_layout, viewGroup2, false);
                                    if (eVar2.g == null) {
                                        eVar2.g = new e.a();
                                    }
                                    eVar2.e.setAdapter((ListAdapter) eVar2.g);
                                    eVar2.e.setOnItemClickListener(eVar2);
                                }
                                ExpandedMenuView expandedMenuView = eVar2.e;
                                iVar.f = expandedMenuView;
                            }
                            z2 = false;
                            if (z2) {
                                if (iVar.f != null && (iVar.g != null || ((e.a) iVar.i.a()).getCount() > 0)) {
                                    ViewGroup.LayoutParams layoutParams2 = iVar.f.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                                    }
                                    iVar.e.setBackgroundResource(iVar.f26b);
                                    ViewParent parent = iVar.f.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup) parent).removeView(iVar.f);
                                    }
                                    iVar.e.addView(iVar.f, layoutParams2);
                                    if (!iVar.f.hasFocus()) {
                                        iVar.f.requestFocus();
                                    }
                                }
                            }
                            iVar.o = true;
                            return;
                        }
                        z2 = true;
                        if (z2) {
                        }
                        iVar.o = true;
                        return;
                    }
                    View view2 = iVar.g;
                    if (!(view2 == null || (layoutParams = view2.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i2 = -1;
                        iVar.l = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                        layoutParams3.gravity = iVar.f27c;
                        layoutParams3.windowAnimations = iVar.d;
                        windowManager.addView(iVar.e, layoutParams3);
                        iVar.m = true;
                        return;
                    }
                    i2 = -2;
                    iVar.l = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams32.gravity = iVar.f27c;
                    layoutParams32.windowAnimations = iVar.d;
                    windowManager.addView(iVar.e, layoutParams32);
                    iVar.m = true;
                    return;
                }
                return;
            }
            E(iVar, true);
        }
    }

    public final boolean T(i iVar, int i2, KeyEvent keyEvent, int i3) {
        a.b.f.i.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.k || U(iVar, keyEvent)) && (gVar = iVar.h) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.l == null) {
            E(iVar, true);
        }
        return z2;
    }

    public final boolean U(i iVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        Resources.Theme theme;
        c0 c0Var4;
        if (this.L) {
            return false;
        }
        if (iVar.k) {
            return true;
        }
        i iVar2 = this.G;
        if (!(iVar2 == null || iVar2 == iVar)) {
            E(iVar2, false);
        }
        Window.Callback O2 = O();
        if (O2 != null) {
            iVar.g = O2.onCreatePanelView(iVar.f25a);
        }
        int i2 = iVar.f25a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var4 = this.l) != null) {
            c0Var4.d();
        }
        if (iVar.g == null) {
            a.b.f.i.g gVar = iVar.h;
            if (gVar == null || iVar.p) {
                if (gVar == null) {
                    Context context = this.e;
                    int i3 = iVar.f25a;
                    if ((i3 == 0 || i3 == 108) && this.l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            a.b.f.c cVar = new a.b.f.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    a.b.f.i.g gVar2 = new a.b.f.i.g(context);
                    gVar2.e = this;
                    iVar.a(gVar2);
                    if (iVar.h == null) {
                        return false;
                    }
                }
                if (z2 && (c0Var3 = this.l) != null) {
                    if (this.m == null) {
                        this.m = new b();
                    }
                    c0Var3.b(iVar.h, this.m);
                }
                iVar.h.z();
                if (!O2.onCreatePanelMenu(iVar.f25a, iVar.h)) {
                    iVar.a(null);
                    if (z2 && (c0Var2 = this.l) != null) {
                        c0Var2.b(null, this.m);
                    }
                    return false;
                }
                iVar.p = false;
            }
            iVar.h.z();
            Bundle bundle = iVar.q;
            if (bundle != null) {
                iVar.h.v(bundle);
                iVar.q = null;
            }
            if (!O2.onPreparePanel(0, iVar.g, iVar.h)) {
                if (z2 && (c0Var = this.l) != null) {
                    c0Var.b(null, this.m);
                }
                iVar.h.y();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            iVar.n = z3;
            iVar.h.setQwertyMode(z3);
            iVar.h.y();
        }
        iVar.k = true;
        iVar.l = false;
        this.G = iVar;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        if (this.t && (viewGroup = this.u) != null) {
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int X(v vVar, Rect rect) {
        boolean z2;
        boolean z3;
        int i2;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int d2 = vVar.d();
        ActionBarContextView actionBarContextView = this.p;
        int i4 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z4 = true;
            if (this.p.isShown()) {
                if (this.W == null) {
                    this.W = new Rect();
                    this.X = new Rect();
                }
                Rect rect2 = this.W;
                Rect rect3 = this.X;
                rect2.set(vVar.b(), vVar.d(), vVar.c(), vVar.a());
                b1.a(this.u, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                v e2 = a.h.j.m.e(this.u);
                int b2 = e2 == null ? 0 : e2.b();
                int c2 = e2 == null ? 0 : e2.c();
                if (marginLayoutParams2.topMargin == i5 && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == i7) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i5;
                    marginLayoutParams2.leftMargin = i6;
                    marginLayoutParams2.rightMargin = i7;
                    z3 = true;
                }
                if (i5 <= 0 || this.w != null) {
                    View view = this.w;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i3 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == b2 && marginLayoutParams.rightMargin == c2))) {
                        marginLayoutParams.height = i3;
                        marginLayoutParams.leftMargin = b2;
                        marginLayoutParams.rightMargin = c2;
                        this.w.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.e);
                    this.w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    this.u.addView(this.w, -1, layoutParams);
                }
                View view3 = this.w;
                z2 = view3 != null;
                if (z2 && view3.getVisibility() != 0) {
                    View view4 = this.w;
                    WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
                    if ((view4.getWindowSystemUiVisibility() & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        context = this.e;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.e;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = a.h.c.a.f439a;
                    view4.setBackgroundColor(context.getColor(i2));
                }
                if (!this.B && z2) {
                    d2 = 0;
                }
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z2 = false;
            } else {
                z4 = false;
                z2 = false;
            }
            if (z4) {
                this.p.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.w;
        if (view5 != null) {
            if (z2) {
                i4 = 0;
            }
            view5.setVisibility(i4);
        }
        return d2;
    }

    @Override // a.b.f.i.g.a
    public void a(a.b.f.i.g gVar) {
        c0 c0Var = this.l;
        if (c0Var == null || !c0Var.f() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.l.c())) {
            i N2 = N(0);
            N2.o = true;
            E(N2, false);
            S(N2, null);
            return;
        }
        Window.Callback O2 = O();
        if (this.l.e()) {
            this.l.g();
            if (!this.L) {
                O2.onPanelClosed(108, N(0).h);
            }
        } else if (O2 != null && !this.L) {
            if (this.S && (1 & this.T) != 0) {
                this.f.getDecorView().removeCallbacks(this.U);
                this.U.run();
            }
            i N3 = N(0);
            a.b.f.i.g gVar2 = N3.h;
            if (gVar2 != null && !N3.p && O2.onPreparePanel(0, N3.g, gVar2)) {
                O2.onMenuOpened(108, N3.h);
                this.l.a();
            }
        }
    }

    @Override // a.b.f.i.g.a
    public boolean b(a.b.f.i.g gVar, MenuItem menuItem) {
        i L2;
        Window.Callback O2 = O();
        if (O2 == null || this.L || (L2 = L(gVar.k())) == null) {
            return false;
        }
        return O2.onMenuItemSelected(L2.f25a, menuItem);
    }

    @Override // a.b.c.g
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.u.findViewById(16908290)).addView(view, layoutParams);
        this.g.f82b.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x017b  */
    @Override // a.b.c.g
    public Context d(Context context) {
        Configuration configuration;
        boolean z2;
        this.I = true;
        int i2 = this.M;
        if (i2 == -100) {
            i2 = -100;
        }
        int R2 = R(context, i2);
        if (c0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(F(context, R2, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof a.b.f.c) {
            try {
                ((a.b.f.c) context).a(F(context, R2, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!b0) {
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (!(configuration3 == null || configuration2.diff(configuration3) == 0)) {
                    float f2 = configuration2.fontScale;
                    float f3 = configuration3.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration2.mcc;
                    int i4 = configuration3.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration2.mnc;
                    int i6 = configuration3.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    LocaleList locales = configuration2.getLocales();
                    LocaleList locales2 = configuration3.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration3.locale;
                    }
                    int i7 = configuration2.touchscreen;
                    int i8 = configuration3.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration2.keyboard;
                    int i10 = configuration3.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration2.keyboardHidden;
                    int i12 = configuration3.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration2.navigation;
                    int i14 = configuration3.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration2.navigationHidden;
                    int i16 = configuration3.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration2.orientation;
                    int i18 = configuration3.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration2.screenLayout & 15;
                    int i20 = configuration3.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration2.screenLayout & 192;
                    int i22 = configuration3.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration2.screenLayout & 48;
                    int i24 = configuration3.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration2.screenLayout & 768;
                    int i26 = configuration3.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration2.colorMode & 3;
                    int i28 = configuration3.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration2.colorMode & 12;
                    int i30 = configuration3.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration2.uiMode & 15;
                    int i32 = configuration3.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration2.uiMode & 48;
                    int i34 = configuration3.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration2.screenWidthDp;
                    int i36 = configuration3.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration2.screenHeightDp;
                    int i38 = configuration3.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration2.smallestScreenWidthDp;
                    int i40 = configuration3.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration2.densityDpi;
                    int i42 = configuration3.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration F2 = F(context, R2, configuration);
            a.b.f.c cVar = new a.b.f.c(context, 2131689794);
            cVar.a(F2);
            try {
                if (context.getTheme() != null) {
                    z2 = true;
                    if (z2) {
                        Resources.Theme theme = cVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            theme.rebase();
                        } else {
                            synchronized (a.h.c.b.f.f451a) {
                                if (!a.h.c.b.f.f453c) {
                                    try {
                                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                        a.h.c.b.f.f452b = declaredMethod;
                                        declaredMethod.setAccessible(true);
                                    } catch (NoSuchMethodException e2) {
                                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                    }
                                    a.h.c.b.f.f453c = true;
                                }
                                Method method = a.h.c.b.f.f452b;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, new Object[0]);
                                    } catch (IllegalAccessException | InvocationTargetException e3) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                        a.h.c.b.f.f452b = null;
                                    }
                                }
                            }
                        }
                    }
                    return cVar;
                }
            } catch (NullPointerException unused3) {
            }
            z2 = false;
            if (z2) {
            }
            return cVar;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("Application failed to obtain resources from itself", e4);
        }
    }

    @Override // a.b.c.g
    public <T extends View> T e(int i2) {
        J();
        return (T) this.f.findViewById(i2);
    }

    @Override // a.b.c.g
    public int f() {
        return this.M;
    }

    @Override // a.b.c.g
    public MenuInflater g() {
        if (this.j == null) {
            P();
            a aVar = this.i;
            this.j = new a.b.f.f(aVar != null ? aVar.b() : this.e);
        }
        return this.j;
    }

    @Override // a.b.c.g
    public a h() {
        P();
        return this.i;
    }

    @Override // a.b.c.g
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // a.b.c.g
    public void j() {
        P();
        a aVar = this.i;
        Q(0);
    }

    @Override // a.b.c.g
    public void k(Configuration configuration) {
        if (this.z && this.t) {
            P();
            a aVar = this.i;
            if (aVar != null) {
                q qVar = (q) aVar;
                qVar.f(qVar.f47a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        a.b.g.j a2 = a.b.g.j.a();
        Context context = this.e;
        synchronized (a2) {
            n0 n0Var = a2.f176a;
            synchronized (n0Var) {
                a.e.e<WeakReference<Drawable.ConstantState>> eVar = n0Var.d.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        A(false);
    }

    @Override // a.b.c.g
    public void l(Bundle bundle) {
        this.I = true;
        A(false);
        K();
        Object obj = this.d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = a.h.b.d.m(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.i;
                if (aVar == null) {
                    this.V = true;
                } else {
                    aVar.c(true);
                }
            }
            synchronized (g.f13c) {
                g.s(this);
                g.f12b.add(new WeakReference<>(this));
            }
        }
        this.J = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // a.b.c.g
    public void m() {
        a aVar;
        f fVar;
        f fVar2;
        a.e.h<String, Integer> hVar = Z;
        if (this.d instanceof Activity) {
            synchronized (g.f13c) {
                g.s(this);
            }
        }
        if (this.S) {
            this.f.getDecorView().removeCallbacks(this.U);
        }
        this.K = false;
        this.L = true;
        if (this.M != -100) {
            Object obj = this.d;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                hVar.put(this.d.getClass().getName(), Integer.valueOf(this.M));
                aVar = this.i;
                if (aVar != null) {
                    Objects.requireNonNull(aVar);
                }
                fVar = this.Q;
                if (fVar != null) {
                    fVar.a();
                }
                fVar2 = this.R;
                if (fVar2 == null) {
                    fVar2.a();
                    return;
                }
                return;
            }
        }
        hVar.remove(this.d.getClass().getName());
        aVar = this.i;
        if (aVar != null) {
        }
        fVar = this.Q;
        if (fVar != null) {
        }
        fVar2 = this.R;
        if (fVar2 == null) {
        }
    }

    @Override // a.b.c.g
    public void n(Bundle bundle) {
        J();
    }

    @Override // a.b.c.g
    public void o() {
        P();
        a aVar = this.i;
        if (aVar != null) {
            ((q) aVar).u = true;
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        n nVar;
        if (this.Y == null) {
            String string = this.e.obtainStyledAttributes(a.b.b.j).getString(114);
            if (string == null) {
                nVar = new n();
            } else {
                try {
                    this.Y = (n) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    nVar = new n();
                }
            }
            this.Y = nVar;
        }
        n nVar2 = this.Y;
        int i2 = a1.f138a;
        return nVar2.createView(view, str, context, attributeSet, false, false, true, false);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // a.b.c.g
    public void p(Bundle bundle) {
    }

    @Override // a.b.c.g
    public void q() {
        this.K = true;
        z();
    }

    @Override // a.b.c.g
    public void r() {
        this.K = false;
        P();
        a aVar = this.i;
        if (aVar != null) {
            q qVar = (q) aVar;
            qVar.u = false;
            a.b.f.g gVar = qVar.t;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // a.b.c.g
    public boolean t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.D && i2 == 108) {
            return false;
        }
        if (this.z && i2 == 1) {
            this.z = false;
        }
        if (i2 == 1) {
            W();
            this.D = true;
            return true;
        } else if (i2 == 2) {
            W();
            this.x = true;
            return true;
        } else if (i2 == 5) {
            W();
            this.y = true;
            return true;
        } else if (i2 == 10) {
            W();
            this.B = true;
            return true;
        } else if (i2 == 108) {
            W();
            this.z = true;
            return true;
        } else if (i2 != 109) {
            return this.f.requestFeature(i2);
        } else {
            W();
            this.A = true;
            return true;
        }
    }

    @Override // a.b.c.g
    public void u(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.f82b.onContentChanged();
    }

    @Override // a.b.c.g
    public void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.f82b.onContentChanged();
    }

    @Override // a.b.c.g
    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.f82b.onContentChanged();
    }

    @Override // a.b.c.g
    public void x(int i2) {
        this.N = i2;
    }

    @Override // a.b.c.g
    public final void y(CharSequence charSequence) {
        this.k = charSequence;
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.i;
        if (aVar != null) {
            ((q) aVar).e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean z() {
        return A(true);
    }
}
