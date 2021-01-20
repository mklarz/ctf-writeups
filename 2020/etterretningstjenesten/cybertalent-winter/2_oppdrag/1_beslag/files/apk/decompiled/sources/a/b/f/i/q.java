package a.b.f.i;

import a.b.f.i.m;
import a.b.g.f0;
import a.b.g.m0;
import a.h.j.r;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: c  reason: collision with root package name */
    public final Context f127c;
    public final g d;
    public final f e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final m0 j;
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public m.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public int u = 0;
    public boolean v;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (q.this.a()) {
                q qVar = q.this;
                if (!qVar.j.z) {
                    View view = qVar.o;
                    if (view == null || !view.isShown()) {
                        q.this.dismiss();
                    } else {
                        q.this.j.b();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f127c = context;
        this.d = gVar;
        this.f = z;
        this.e = new f(gVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.h = i2;
        this.i = i3;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new m0(context, null, i2, i3);
        gVar.b(this, context);
    }

    @Override // a.b.f.i.p
    public boolean a() {
        return !this.r && this.j.a();
    }

    @Override // a.b.f.i.p
    public void b() {
        View view;
        boolean z = true;
        if (!a()) {
            if (this.r || (view = this.n) == null) {
                z = false;
            } else {
                this.o = view;
                this.j.A.setOnDismissListener(this);
                m0 m0Var = this.j;
                m0Var.r = this;
                m0Var.s(true);
                View view2 = this.o;
                boolean z2 = this.q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.q = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                view2.addOnAttachStateChangeListener(this.l);
                m0 m0Var2 = this.j;
                m0Var2.q = view2;
                m0Var2.m = this.u;
                if (!this.s) {
                    this.t = k.n(this.e, null, this.f127c, this.g);
                    this.s = true;
                }
                this.j.r(this.t);
                this.j.A.setInputMethodMode(2);
                m0 m0Var3 = this.j;
                Rect rect = this.f122b;
                Objects.requireNonNull(m0Var3);
                m0Var3.y = rect != null ? new Rect(rect) : null;
                this.j.b();
                f0 f0Var = this.j.d;
                f0Var.setOnKeyListener(this);
                if (this.v && this.d.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f127c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) f0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.d.m);
                    }
                    frameLayout.setEnabled(false);
                    f0Var.addHeaderView(frameLayout, null, false);
                }
                this.j.o(this.e);
                this.j.b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // a.b.f.i.m
    public void c(g gVar, boolean z) {
        if (gVar == this.d) {
            dismiss();
            m.a aVar = this.p;
            if (aVar != null) {
                aVar.c(gVar, z);
            }
        }
    }

    @Override // a.b.f.i.p
    public void dismiss() {
        if (a()) {
            this.j.dismiss();
        }
    }

    @Override // a.b.f.i.m
    public void e(m.a aVar) {
        this.p = aVar;
    }

    @Override // a.b.f.i.p
    public ListView f() {
        return this.j.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    @Override // a.b.f.i.m
    public boolean g(r rVar) {
        boolean z;
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f127c, rVar, this.o, this.f, this.h, this.i);
            lVar.d(this.p);
            boolean v2 = k.v(rVar);
            lVar.h = v2;
            k kVar = lVar.j;
            if (kVar != null) {
                kVar.p(v2);
            }
            lVar.k = this.m;
            this.m = null;
            this.d.c(false);
            m0 m0Var = this.j;
            int i2 = m0Var.g;
            int i3 = !m0Var.j ? 0 : m0Var.h;
            int i4 = this.u;
            View view = this.n;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.n.getWidth();
            }
            if (!lVar.b()) {
                if (lVar.f == null) {
                    z = false;
                    if (z) {
                        m.a aVar = this.p;
                        if (aVar != null) {
                            aVar.d(rVar);
                        }
                        return true;
                    }
                } else {
                    lVar.e(i2, i3, true, true);
                }
            }
            z = true;
            if (z) {
            }
        }
        return false;
    }

    @Override // a.b.f.i.m
    public boolean h() {
        return false;
    }

    @Override // a.b.f.i.m
    public void i(boolean z) {
        this.s = false;
        f fVar = this.e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.f.i.k
    public void l(g gVar) {
    }

    @Override // a.b.f.i.k
    public void o(View view) {
        this.n = view;
    }

    public void onDismiss() {
        this.r = true;
        this.d.c(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.b.f.i.k
    public void p(boolean z) {
        this.e.d = z;
    }

    @Override // a.b.f.i.k
    public void q(int i2) {
        this.u = i2;
    }

    @Override // a.b.f.i.k
    public void r(int i2) {
        this.j.g = i2;
    }

    @Override // a.b.f.i.k
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // a.b.f.i.k
    public void t(boolean z) {
        this.v = z;
    }

    @Override // a.b.f.i.k
    public void u(int i2) {
        m0 m0Var = this.j;
        m0Var.h = i2;
        m0Var.j = true;
    }
}
