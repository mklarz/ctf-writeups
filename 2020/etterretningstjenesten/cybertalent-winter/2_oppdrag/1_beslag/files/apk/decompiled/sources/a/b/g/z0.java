package a.b.g;

import a.b.b;
import a.b.f.i.g;
import a.b.f.i.i;
import a.b.f.i.m;
import a.h.j.r;
import a.h.j.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.Objects;
import no.cybertalent.liberatortoolkit.R;

public class z0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f252a;

    /* renamed from: b  reason: collision with root package name */
    public int f253b;

    /* renamed from: c  reason: collision with root package name */
    public View f254c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o = 0;
    public Drawable p;

    public class a extends t {

        /* renamed from: a  reason: collision with root package name */
        public boolean f255a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f256b;

        public a(int i) {
            this.f256b = i;
        }

        @Override // a.h.j.s
        public void a(View view) {
            if (!this.f255a) {
                z0.this.f252a.setVisibility(this.f256b);
            }
        }

        @Override // a.h.j.t, a.h.j.s
        public void b(View view) {
            z0.this.f252a.setVisibility(0);
        }

        @Override // a.h.j.t, a.h.j.s
        public void c(View view) {
            this.f255a = true;
        }
    }

    public z0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f252a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        String str = null;
        x0 o2 = x0.o(toolbar.getContext(), null, b.f2a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.p = o2.e(15);
        if (z) {
            CharSequence l2 = o2.l(27);
            if (!TextUtils.isEmpty(l2)) {
                this.h = true;
                this.i = l2;
                if ((this.f253b & 8) != 0) {
                    this.f252a.setTitle(l2);
                }
            }
            CharSequence l3 = o2.l(25);
            if (!TextUtils.isEmpty(l3)) {
                this.j = l3;
                if ((this.f253b & 8) != 0) {
                    this.f252a.setSubtitle(l3);
                }
            }
            Drawable e2 = o2.e(20);
            if (e2 != null) {
                this.f = e2;
                y();
            }
            Drawable e3 = o2.e(17);
            if (e3 != null) {
                this.e = e3;
                y();
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                x();
            }
            u(o2.h(10, 0));
            int j2 = o2.j(9, 0);
            if (j2 != 0) {
                View inflate = LayoutInflater.from(this.f252a.getContext()).inflate(j2, (ViewGroup) this.f252a, false);
                View view = this.d;
                if (!(view == null || (this.f253b & 16) == 0)) {
                    this.f252a.removeView(view);
                }
                this.d = inflate;
                if (!(inflate == null || (this.f253b & 16) == 0)) {
                    this.f252a.addView(inflate);
                }
                u(this.f253b | 16);
            }
            int i3 = o2.i(13, 0);
            if (i3 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f252a.getLayoutParams();
                layoutParams.height = i3;
                this.f252a.setLayoutParams(layoutParams);
            }
            int c2 = o2.c(7, -1);
            int c3 = o2.c(3, -1);
            if (c2 >= 0 || c3 >= 0) {
                Toolbar toolbar2 = this.f252a;
                int max = Math.max(c2, 0);
                int max2 = Math.max(c3, 0);
                toolbar2.d();
                toolbar2.u.a(max, max2);
            }
            int j3 = o2.j(28, 0);
            if (j3 != 0) {
                Toolbar toolbar3 = this.f252a;
                Context context = toolbar3.getContext();
                toolbar3.m = j3;
                TextView textView = toolbar3.f865c;
                if (textView != null) {
                    textView.setTextAppearance(context, j3);
                }
            }
            int j4 = o2.j(26, 0);
            if (j4 != 0) {
                Toolbar toolbar4 = this.f252a;
                Context context2 = toolbar4.getContext();
                toolbar4.n = j4;
                TextView textView2 = toolbar4.d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, j4);
                }
            }
            int j5 = o2.j(22, 0);
            if (j5 != 0) {
                this.f252a.setPopupTheme(j5);
            }
        } else {
            if (this.f252a.getNavigationIcon() != null) {
                this.p = this.f252a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f253b = i2;
        }
        o2.f240b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f252a.getNavigationContentDescription())) {
                int i4 = this.o;
                this.k = i4 != 0 ? t().getString(i4) : str;
                w();
            }
        }
        this.k = this.f252a.getNavigationContentDescription();
        this.f252a.setNavigationOnClickListener(new y0(this));
    }

    @Override // a.b.g.d0
    public boolean a() {
        return this.f252a.u();
    }

    @Override // a.b.g.d0
    public void b(Menu menu, m.a aVar) {
        i iVar;
        if (this.n == null) {
            c cVar = new c(this.f252a.getContext());
            this.n = cVar;
            Objects.requireNonNull(cVar);
        }
        c cVar2 = this.n;
        cVar2.f = aVar;
        Toolbar toolbar = this.f252a;
        g gVar = (g) menu;
        if (gVar != null || toolbar.f864b != null) {
            toolbar.f();
            g gVar2 = toolbar.f864b.q;
            if (gVar2 != gVar) {
                if (gVar2 != null) {
                    gVar2.u(toolbar.K);
                    gVar2.u(toolbar.L);
                }
                if (toolbar.L == null) {
                    toolbar.L = new Toolbar.d();
                }
                cVar2.r = true;
                if (gVar != null) {
                    gVar.b(cVar2, toolbar.k);
                    gVar.b(toolbar.L, toolbar.k);
                } else {
                    cVar2.j(toolbar.k, null);
                    Toolbar.d dVar = toolbar.L;
                    g gVar3 = dVar.f869b;
                    if (!(gVar3 == null || (iVar = dVar.f870c) == null)) {
                        gVar3.d(iVar);
                    }
                    dVar.f869b = null;
                    cVar2.i(true);
                    toolbar.L.i(true);
                }
                toolbar.f864b.setPopupTheme(toolbar.l);
                toolbar.f864b.setPresenter(cVar2);
                toolbar.K = cVar2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // a.b.g.d0
    public boolean c() {
        boolean z;
        ActionMenuView actionMenuView = this.f252a.f864b;
        if (actionMenuView != null) {
            c cVar = actionMenuView.u;
            if (cVar != null) {
                if (cVar.w != null || cVar.m()) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    @Override // a.b.g.d0
    public void collapseActionView() {
        Toolbar.d dVar = this.f252a.L;
        i iVar = dVar == null ? null : dVar.f870c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // a.b.g.d0
    public void d() {
        this.m = true;
    }

    @Override // a.b.g.d0
    public boolean e() {
        return this.f252a.o();
    }

    @Override // a.b.g.d0
    public boolean f() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f252a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f864b) != null && actionMenuView.t;
    }

    @Override // a.b.g.d0
    public boolean g() {
        ActionMenuView actionMenuView = this.f252a.f864b;
        if (actionMenuView != null) {
            c cVar = actionMenuView.u;
            if (cVar != null && cVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // a.b.g.d0
    public CharSequence getTitle() {
        return this.f252a.getTitle();
    }

    @Override // a.b.g.d0
    public void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f252a.f864b;
        if (actionMenuView != null && (cVar = actionMenuView.u) != null) {
            cVar.a();
        }
    }

    @Override // a.b.g.d0
    public r i(int i2, long j2) {
        r a2 = a.h.j.m.a(this.f252a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.c(j2);
        a aVar = new a(i2);
        View view = a2.f526a.get();
        if (view != null) {
            a2.e(view, aVar);
        }
        return a2;
    }

    @Override // a.b.g.d0
    public int j() {
        return this.f253b;
    }

    @Override // a.b.g.d0
    public void k(int i2) {
        this.f252a.setVisibility(i2);
    }

    @Override // a.b.g.d0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.g.d0
    public boolean m() {
        Toolbar.d dVar = this.f252a.L;
        return (dVar == null || dVar.f870c == null) ? false : true;
    }

    @Override // a.b.g.d0
    public void n(int i2) {
        this.f = i2 != 0 ? a.b.d.a.a.a(t(), i2) : null;
        y();
    }

    @Override // a.b.g.d0
    public void o(q0 q0Var) {
        Toolbar toolbar;
        View view = this.f254c;
        if (view != null && view.getParent() == (toolbar = this.f252a)) {
            toolbar.removeView(this.f254c);
        }
        this.f254c = null;
    }

    @Override // a.b.g.d0
    public ViewGroup p() {
        return this.f252a;
    }

    @Override // a.b.g.d0
    public void q(boolean z) {
    }

    @Override // a.b.g.d0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.g.d0
    public void s(boolean z) {
        this.f252a.setCollapsible(z);
    }

    @Override // a.b.g.d0
    public void setIcon(int i2) {
        this.e = i2 != 0 ? a.b.d.a.a.a(t(), i2) : null;
        y();
    }

    @Override // a.b.g.d0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        y();
    }

    @Override // a.b.g.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // a.b.g.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            this.i = charSequence;
            if ((this.f253b & 8) != 0) {
                this.f252a.setTitle(charSequence);
            }
        }
    }

    @Override // a.b.g.d0
    public Context t() {
        return this.f252a.getContext();
    }

    @Override // a.b.g.d0
    public void u(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f253b ^ i2;
        this.f253b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i3 & 3) != 0) {
                y();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f252a.setTitle(this.i);
                    toolbar = this.f252a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f252a.setTitle((CharSequence) null);
                    toolbar = this.f252a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.f252a.addView(view);
                } else {
                    this.f252a.removeView(view);
                }
            }
        }
    }

    @Override // a.b.g.d0
    public int v() {
        return 0;
    }

    public final void w() {
        if ((this.f253b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.f252a.setNavigationContentDescription(this.o);
        } else {
            this.f252a.setNavigationContentDescription(this.k);
        }
    }

    public final void x() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f253b & 4) != 0) {
            toolbar = this.f252a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.f252a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i2 = this.f253b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.f252a.setLogo(drawable);
    }
}
