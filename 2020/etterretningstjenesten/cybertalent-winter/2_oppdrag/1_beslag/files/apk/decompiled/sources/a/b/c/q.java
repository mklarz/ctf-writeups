package a.b.c;

import a.b.c.a;
import a.b.f.a;
import a.b.f.f;
import a.b.f.g;
import a.b.f.i.g;
import a.b.g.d0;
import a.h.j.m;
import a.h.j.r;
import a.h.j.s;
import a.h.j.t;
import a.h.j.u;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class q extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new DecelerateInterpolator();
    public static final Interpolator z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f47a;

    /* renamed from: b  reason: collision with root package name */
    public Context f48b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f49c;
    public ActionBarContainer d;
    public d0 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public a.b.f.a j;
    public a.AbstractC0002a k;
    public boolean l;
    public ArrayList<a.b> m = new ArrayList<>();
    public boolean n;
    public int o = 0;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public boolean s = true;
    public g t;
    public boolean u;
    public boolean v;
    public final s w = new a();
    public final s x = new b();
    public final u y = new c();

    public class a extends t {
        public a() {
        }

        @Override // a.h.j.s
        public void a(View view) {
            View view2;
            q qVar = q.this;
            if (qVar.p && (view2 = qVar.g) != null) {
                view2.setTranslationY(0.0f);
                q.this.d.setTranslationY(0.0f);
            }
            q.this.d.setVisibility(8);
            q.this.d.setTransitioning(false);
            q qVar2 = q.this;
            qVar2.t = null;
            a.AbstractC0002a aVar = qVar2.k;
            if (aVar != null) {
                aVar.b(qVar2.j);
                qVar2.j = null;
                qVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = q.this.f49c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    public class b extends t {
        public b() {
        }

        @Override // a.h.j.s
        public void a(View view) {
            q qVar = q.this;
            qVar.t = null;
            qVar.d.requestLayout();
        }
    }

    public class c implements u {
        public c() {
        }
    }

    public class d extends a.b.f.a implements g.a {
        public final Context d;
        public final a.b.f.i.g e;
        public a.AbstractC0002a f;
        public WeakReference<View> g;

        public d(Context context, a.AbstractC0002a aVar) {
            this.d = context;
            this.f = aVar;
            a.b.f.i.g gVar = new a.b.f.i.g(context);
            gVar.l = 1;
            this.e = gVar;
            gVar.e = this;
        }

        @Override // a.b.f.i.g.a
        public void a(a.b.f.i.g gVar) {
            if (this.f != null) {
                i();
                a.b.g.c cVar = q.this.f.e;
                if (cVar != null) {
                    cVar.n();
                }
            }
        }

        @Override // a.b.f.i.g.a
        public boolean b(a.b.f.i.g gVar, MenuItem menuItem) {
            a.AbstractC0002a aVar = this.f;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // a.b.f.a
        public void c() {
            q qVar = q.this;
            if (qVar.i == this) {
                if (!(!qVar.q)) {
                    qVar.j = this;
                    qVar.k = this.f;
                } else {
                    this.f.b(this);
                }
                this.f = null;
                q.this.d(false);
                ActionBarContextView actionBarContextView = q.this.f;
                if (actionBarContextView.l == null) {
                    actionBarContextView.h();
                }
                q.this.e.p().sendAccessibilityEvent(32);
                q qVar2 = q.this;
                qVar2.f49c.setHideOnContentScrollEnabled(qVar2.v);
                q.this.i = null;
            }
        }

        @Override // a.b.f.a
        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.b.f.a
        public Menu e() {
            return this.e;
        }

        @Override // a.b.f.a
        public MenuInflater f() {
            return new f(this.d);
        }

        @Override // a.b.f.a
        public CharSequence g() {
            return q.this.f.getSubtitle();
        }

        @Override // a.b.f.a
        public CharSequence h() {
            return q.this.f.getTitle();
        }

        @Override // a.b.f.a
        public void i() {
            if (q.this.i == this) {
                this.e.z();
                try {
                    this.f.a(this, this.e);
                } finally {
                    this.e.y();
                }
            }
        }

        @Override // a.b.f.a
        public boolean j() {
            return q.this.f.s;
        }

        @Override // a.b.f.a
        public void k(View view) {
            q.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // a.b.f.a
        public void l(int i) {
            q.this.f.setSubtitle(q.this.f47a.getResources().getString(i));
        }

        @Override // a.b.f.a
        public void m(CharSequence charSequence) {
            q.this.f.setSubtitle(charSequence);
        }

        @Override // a.b.f.a
        public void n(int i) {
            q.this.f.setTitle(q.this.f47a.getResources().getString(i));
        }

        @Override // a.b.f.a
        public void o(CharSequence charSequence) {
            q.this.f.setTitle(charSequence);
        }

        @Override // a.b.f.a
        public void p(boolean z) {
            this.f58c = z;
            q.this.f.setTitleOptional(z);
        }
    }

    public q(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (!z2) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public q(Dialog dialog) {
        new ArrayList();
        e(dialog.getWindow().getDecorView());
    }

    @Override // a.b.c.a
    public void a(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            int size = this.m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.m.get(i2).a(z2);
            }
        }
    }

    @Override // a.b.c.a
    public Context b() {
        if (this.f48b == null) {
            TypedValue typedValue = new TypedValue();
            this.f47a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f48b = new ContextThemeWrapper(this.f47a, i2);
            } else {
                this.f48b = this.f47a;
            }
        }
        return this.f48b;
    }

    @Override // a.b.c.a
    public void c(boolean z2) {
        if (!this.h) {
            int i2 = z2 ? 4 : 0;
            int j2 = this.e.j();
            this.h = true;
            this.e.u((i2 & 4) | (j2 & -5));
        }
    }

    public void d(boolean z2) {
        r rVar;
        r rVar2;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f49c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f49c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (actionBarContainer.isLaidOut()) {
            if (z2) {
                rVar = this.e.i(4, 100);
                rVar2 = this.f.e(0, 200);
            } else {
                rVar2 = this.e.i(0, 200);
                rVar = this.f.e(8, 100);
            }
            a.b.f.g gVar = new a.b.f.g();
            gVar.f76a.add(rVar);
            View view = rVar.f526a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = rVar2.f526a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.f76a.add(rVar2);
            gVar.b();
        } else if (z2) {
            this.e.k(4);
            this.f.setVisibility(0);
        } else {
            this.e.k(0);
            this.f.setVisibility(8);
        }
    }

    public final void e(View view) {
        d0 d0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f49c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof d0) {
            d0Var = (d0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            d0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder d2 = b.a.a.a.a.d("Can't make a decor toolbar out of ");
            d2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(d2.toString());
        }
        this.e = d0Var;
        this.f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.d = actionBarContainer;
        d0 d0Var2 = this.e;
        if (d0Var2 == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(q.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f47a = d0Var2.t();
        boolean z2 = (this.e.j() & 4) != 0;
        if (z2) {
            this.h = true;
        }
        Context context = this.f47a;
        this.e.q((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f47a.obtainStyledAttributes(null, a.b.b.f2a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f49c;
            if (actionBarOverlayLayout2.i) {
                this.v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            actionBarContainer2.setElevation((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void f(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.o(null);
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.o(null);
        }
        boolean z3 = true;
        boolean z4 = this.e.v() == 2;
        this.e.s(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f49c;
        if (this.n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void g(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.r || !this.q) {
            if (!this.s) {
                this.s = true;
                a.b.f.g gVar = this.t;
                if (gVar != null) {
                    gVar.a();
                }
                this.d.setVisibility(0);
                if (this.o != 0 || (!this.u && !z2)) {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.p && (view2 = this.g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.x.a(null);
                } else {
                    this.d.setTranslationY(0.0f);
                    float f2 = (float) (-this.d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.d.setTranslationY(f2);
                    a.b.f.g gVar2 = new a.b.f.g();
                    r a2 = m.a(this.d);
                    a2.g(0.0f);
                    a2.f(this.y);
                    if (!gVar2.e) {
                        gVar2.f76a.add(a2);
                    }
                    if (this.p && (view3 = this.g) != null) {
                        view3.setTranslationY(f2);
                        r a3 = m.a(this.g);
                        a3.g(0.0f);
                        if (!gVar2.e) {
                            gVar2.f76a.add(a3);
                        }
                    }
                    Interpolator interpolator = A;
                    boolean z3 = gVar2.e;
                    if (!z3) {
                        gVar2.f78c = interpolator;
                    }
                    if (!z3) {
                        gVar2.f77b = 250;
                    }
                    s sVar = this.x;
                    if (!z3) {
                        gVar2.d = sVar;
                    }
                    this.t = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f49c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (this.s) {
            this.s = false;
            a.b.f.g gVar3 = this.t;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.o != 0 || (!this.u && !z2)) {
                this.w.a(null);
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            a.b.f.g gVar4 = new a.b.f.g();
            float f3 = (float) (-this.d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            r a4 = m.a(this.d);
            a4.g(f3);
            a4.f(this.y);
            if (!gVar4.e) {
                gVar4.f76a.add(a4);
            }
            if (this.p && (view = this.g) != null) {
                r a5 = m.a(view);
                a5.g(f3);
                if (!gVar4.e) {
                    gVar4.f76a.add(a5);
                }
            }
            Interpolator interpolator2 = z;
            boolean z4 = gVar4.e;
            if (!z4) {
                gVar4.f78c = interpolator2;
            }
            if (!z4) {
                gVar4.f77b = 250;
            }
            s sVar2 = this.w;
            if (!z4) {
                gVar4.d = sVar2;
            }
            this.t = gVar4;
            gVar4.b();
        }
    }
}
