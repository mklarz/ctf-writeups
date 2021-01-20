package a.b.f.i;

import a.b.f.i.m;
import a.b.g.f0;
import a.b.g.l0;
import a.b.g.m0;
import a.h.j.r;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f91c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public final List<g> i = new ArrayList();
    public final List<C0003d> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public final l0 m = new c();
    public int n;
    public int o;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public m.a y;
    public ViewTreeObserver z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (d.this.a() && d.this.j.size() > 0 && !d.this.j.get(0).f97a.z) {
                View view = d.this.q;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0003d dVar : d.this.j) {
                    dVar.f97a.b();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements l0 {

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C0003d f95b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ MenuItem f96c;
            public final /* synthetic */ g d;

            public a(C0003d dVar, MenuItem menuItem, g gVar) {
                this.f95b = dVar;
                this.f96c = menuItem;
                this.d = gVar;
            }

            public void run() {
                C0003d dVar = this.f95b;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.f98b.c(false);
                    d.this.B = false;
                }
                if (this.f96c.isEnabled() && this.f96c.hasSubMenu()) {
                    this.d.r(this.f96c, 4);
                }
            }
        }

        public c() {
        }

        @Override // a.b.g.l0
        public void h(g gVar, MenuItem menuItem) {
            C0003d dVar = null;
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f98b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < d.this.j.size()) {
                    dVar = d.this.j.get(i2);
                }
                d.this.h.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // a.b.g.l0
        public void k(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: a.b.f.i.d$d  reason: collision with other inner class name */
    public static class C0003d {

        /* renamed from: a  reason: collision with root package name */
        public final m0 f97a;

        /* renamed from: b  reason: collision with root package name */
        public final g f98b;

        /* renamed from: c  reason: collision with root package name */
        public final int f99c;

        public C0003d(m0 m0Var, g gVar, int i) {
            this.f97a = m0Var;
            this.f98b = gVar;
            this.f99c = i;
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.n = 0;
        this.o = 0;
        this.f91c = context;
        this.p = view;
        this.e = i2;
        this.f = i3;
        this.g = z2;
        this.w = false;
        WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
        this.r = view.getLayoutDirection() != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // a.b.f.i.p
    public boolean a() {
        return this.j.size() > 0 && this.j.get(0).f97a.a();
    }

    @Override // a.b.f.i.p
    public void b() {
        if (!a()) {
            for (g gVar : this.i) {
                w(gVar);
            }
            this.i.clear();
            View view = this.p;
            this.q = view;
            if (view != null) {
                boolean z2 = this.z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.z = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    @Override // a.b.f.i.m
    public void c(g gVar, boolean z2) {
        int i2;
        int size = this.j.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (gVar == this.j.get(i3).f98b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < this.j.size()) {
                this.j.get(i4).f98b.c(false);
            }
            C0003d remove = this.j.remove(i3);
            remove.f98b.u(this);
            if (this.B) {
                remove.f97a.A.setExitTransition(null);
                remove.f97a.A.setAnimationStyle(0);
            }
            remove.f97a.dismiss();
            int size2 = this.j.size();
            if (size2 > 0) {
                i2 = this.j.get(size2 - 1).f99c;
            } else {
                View view = this.p;
                WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
                i2 = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            this.r = i2;
            if (size2 == 0) {
                dismiss();
                m.a aVar = this.y;
                if (aVar != null) {
                    aVar.c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (z2) {
                this.j.get(0).f98b.c(false);
            }
        }
    }

    @Override // a.b.f.i.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0003d[] dVarArr = (C0003d[]) this.j.toArray(new C0003d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0003d dVar = dVarArr[i2];
                if (dVar.f97a.a()) {
                    dVar.f97a.dismiss();
                }
            }
        }
    }

    @Override // a.b.f.i.m
    public void e(m.a aVar) {
        this.y = aVar;
    }

    @Override // a.b.f.i.p
    public ListView f() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<C0003d> list = this.j;
        return list.get(list.size() - 1).f97a.d;
    }

    @Override // a.b.f.i.m
    public boolean g(r rVar) {
        for (C0003d dVar : this.j) {
            if (rVar == dVar.f98b) {
                dVar.f97a.d.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.b(this, this.f91c);
        if (a()) {
            w(rVar);
        } else {
            this.i.add(rVar);
        }
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    @Override // a.b.f.i.m
    public boolean h() {
        return false;
    }

    @Override // a.b.f.i.m
    public void i(boolean z2) {
        for (C0003d dVar : this.j) {
            ListAdapter adapter = dVar.f97a.d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // a.b.f.i.k
    public void l(g gVar) {
        gVar.b(this, this.f91c);
        if (a()) {
            w(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // a.b.f.i.k
    public boolean m() {
        return false;
    }

    @Override // a.b.f.i.k
    public void o(View view) {
        if (this.p != view) {
            this.p = view;
            int i2 = this.n;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            this.o = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    public void onDismiss() {
        C0003d dVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.j.get(i2);
            if (!dVar.f97a.a()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f98b.c(false);
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
    public void p(boolean z2) {
        this.w = z2;
    }

    @Override // a.b.f.i.k
    public void q(int i2) {
        if (this.n != i2) {
            this.n = i2;
            View view = this.p;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            this.o = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // a.b.f.i.k
    public void r(int i2) {
        this.s = true;
        this.u = i2;
    }

    @Override // a.b.f.i.k
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // a.b.f.i.k
    public void t(boolean z2) {
        this.x = z2;
    }

    @Override // a.b.f.i.k
    public void u(int i2) {
        this.t = true;
        this.v = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0142, code lost:
        if (((r9.getWidth() + r10[0]) + r4) > r11.right) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0148, code lost:
        if ((r10[0] - r4) < 0) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0178  */
    public final void w(g gVar) {
        C0003d dVar;
        int i2;
        MenuItem menuItem;
        int i3;
        f fVar;
        int firstVisiblePosition;
        LayoutInflater from = LayoutInflater.from(this.f91c);
        f fVar2 = new f(gVar, from, this.g, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.w) {
            fVar2.d = true;
        } else if (a()) {
            fVar2.d = k.v(gVar);
        }
        View view = null;
        int n2 = k.n(fVar2, null, this.f91c, this.d);
        m0 m0Var = new m0(this.f91c, null, this.e, this.f);
        m0Var.D = this.m;
        m0Var.r = this;
        m0Var.A.setOnDismissListener(this);
        m0Var.q = this.p;
        m0Var.m = this.o;
        m0Var.s(true);
        m0Var.A.setInputMethodMode(2);
        m0Var.o(fVar2);
        m0Var.r(n2);
        m0Var.m = this.o;
        if (this.j.size() > 0) {
            List<C0003d> list = this.j;
            dVar = list.get(list.size() - 1);
            g gVar2 = dVar.f98b;
            int size = gVar2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = gVar2.getItem(i4);
                if (menuItem.hasSubMenu() && gVar == menuItem.getSubMenu()) {
                    break;
                }
                i4++;
            }
            if (menuItem != null) {
                f0 f0Var = dVar.f97a.d;
                ListAdapter adapter = f0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                    i3 = 0;
                }
                int count = fVar.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == fVar.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - f0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < f0Var.getChildCount()) {
                    view = f0Var.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    Method method = m0.E;
                    if (method != null) {
                        try {
                            method.invoke(m0Var.A, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    m0Var.A.setTouchModal(false);
                }
                m0Var.A.setEnterTransition(null);
                List<C0003d> list2 = this.j;
                f0 f0Var2 = list2.get(list2.size() - 1).f97a.d;
                int[] iArr = new int[2];
                f0Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.q.getWindowVisibleDisplayFrame(rect);
                if (this.r == 1) {
                }
                int i6 = 1;
                boolean z2 = i6 == 1;
                this.r = i6;
                m0Var.q = view;
                if ((this.o & 5) != 5) {
                    if (z2) {
                        n2 = view.getWidth();
                    }
                    i2 = 0 - n2;
                    m0Var.g = i2;
                    m0Var.l = true;
                    m0Var.k = true;
                    m0Var.m(0);
                } else if (!z2) {
                    n2 = view.getWidth();
                    i2 = 0 - n2;
                    m0Var.g = i2;
                    m0Var.l = true;
                    m0Var.k = true;
                    m0Var.m(0);
                }
                i2 = n2 + 0;
                m0Var.g = i2;
                m0Var.l = true;
                m0Var.k = true;
                m0Var.m(0);
            } else {
                if (this.s) {
                    m0Var.g = this.u;
                }
                if (this.t) {
                    m0Var.m(this.v);
                }
                Rect rect2 = this.f122b;
                m0Var.y = rect2 != null ? new Rect(rect2) : null;
            }
            this.j.add(new C0003d(m0Var, gVar, this.r));
            m0Var.b();
            f0 f0Var3 = m0Var.d;
            f0Var3.setOnKeyListener(this);
            if (dVar == null && this.x && gVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) f0Var3, false);
                frameLayout.setEnabled(false);
                ((TextView) frameLayout.findViewById(16908310)).setText(gVar.m);
                f0Var3.addHeaderView(frameLayout, null, false);
                m0Var.b();
                return;
            }
            return;
        }
        dVar = null;
        view = null;
        if (view == null) {
        }
        this.j.add(new C0003d(m0Var, gVar, this.r));
        m0Var.b();
        f0 f0Var32 = m0Var.d;
        f0Var32.setOnKeyListener(this);
        if (dVar == null) {
        }
    }
}
