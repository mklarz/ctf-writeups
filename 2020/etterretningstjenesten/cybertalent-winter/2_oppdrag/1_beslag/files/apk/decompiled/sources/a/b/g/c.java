package a.b.g;

import a.b.f.i.g;
import a.b.f.i.i;
import a.b.f.i.k;
import a.b.f.i.l;
import a.b.f.i.m;
import a.b.f.i.n;
import a.b.f.i.p;
import a.b.f.i.r;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Objects;
import no.cybertalent.liberatortoolkit.R;

public class c extends a.b.f.i.b {
    public d j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public final SparseBooleanArray t = new SparseBooleanArray();
    public e u;
    public a v;
    public RunnableC0005c w;
    public b x;
    public final f y = new f();

    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!rVar.A.g()) {
                View view2 = c.this.j;
                this.f = view2 == null ? (View) c.this.i : view2;
            }
            d(c.this.y);
        }

        @Override // a.b.f.i.l
        public void c() {
            c cVar = c.this;
            cVar.v = null;
            Objects.requireNonNull(cVar);
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: a.b.g.c$c  reason: collision with other inner class name */
    public class RunnableC0005c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public e f143b;

        public RunnableC0005c(e eVar) {
            this.f143b = eVar;
        }

        public void run() {
            g.a aVar;
            g gVar = c.this.d;
            if (!(gVar == null || (aVar = gVar.e) == null)) {
                aVar.a(gVar);
            }
            View view = (View) c.this.i;
            if (!(view == null || view.getWindowToken() == null || !this.f143b.f())) {
                c.this.u = this.f143b;
            }
            c.this.w = null;
        }
    }

    public class d extends n implements ActionMenuView.a {

        public class a extends h0 {
            public a(View view, c cVar) {
                super(view);
            }

            @Override // a.b.g.h0
            public p b() {
                e eVar = c.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // a.b.g.h0
            public boolean c() {
                c.this.n();
                return true;
            }

            @Override // a.b.g.h0
            public boolean d() {
                c cVar = c.this;
                if (cVar.w != null) {
                    return false;
                }
                cVar.f();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setTooltipText(getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.g = 8388613;
            d(c.this.y);
        }

        @Override // a.b.f.i.l
        public void c() {
            g gVar = c.this.d;
            if (gVar != null) {
                gVar.c(true);
            }
            c.this.u = null;
            super.c();
        }
    }

    public class f implements m.a {
        public f() {
        }

        @Override // a.b.f.i.m.a
        public void c(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.k().c(false);
            }
            m.a aVar = c.this.f;
            if (aVar != null) {
                aVar.c(gVar, z);
            }
        }

        @Override // a.b.f.i.m.a
        public boolean d(g gVar) {
            c cVar = c.this;
            if (gVar == cVar.d) {
                return false;
            }
            int i = ((r) gVar).A.f111a;
            m.a aVar = cVar.f;
            if (aVar != null) {
                return aVar.d(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    public boolean a() {
        return f() | l();
    }

    public View b(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        View actionView = iVar.getActionView();
        int i = 0;
        if (actionView == null || iVar.f()) {
            if (view instanceof n.a) {
                aVar = (n.a) view;
            } else {
                aVar = (n.a) this.e.inflate(this.h, viewGroup, false);
            }
            aVar.d(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
            if (this.x == null) {
                this.x = new b();
            }
            actionMenuItemView.setPopupCallback(this.x);
            actionView = (View) aVar;
        }
        if (iVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // a.b.f.i.m
    public void c(g gVar, boolean z) {
        a();
        m.a aVar = this.f;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    public boolean f() {
        n nVar;
        RunnableC0005c cVar = this.w;
        if (cVar == null || (nVar = this.i) == null) {
            e eVar = this.u;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.j.dismiss();
            }
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.w = null;
        return true;
    }

    @Override // a.b.f.i.m
    public boolean g(r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (true) {
            g gVar = rVar2.z;
            if (gVar == this.d) {
                break;
            }
            rVar2 = (r) gVar;
        }
        i iVar = rVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        int i2 = rVar.A.f111a;
        int size = rVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        a aVar = new a(this.f87c, rVar, view);
        this.v = aVar;
        aVar.h = z;
        k kVar = aVar.j;
        if (kVar != null) {
            kVar.p(z);
        }
        if (this.v.f()) {
            m.a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.d(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    @Override // a.b.f.i.m
    public boolean h() {
        int i;
        ArrayList<i> arrayList;
        int i2;
        boolean z;
        g gVar = this.d;
        if (gVar != null) {
            arrayList = gVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.q;
        int i4 = this.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.i;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            i iVar = arrayList.get(i5);
            int i8 = iVar.y;
            if ((i8 & 2) == 2) {
                i7++;
            } else if ((i8 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.r && iVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.m && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            i iVar2 = arrayList.get(i10);
            int i12 = iVar2.y;
            if ((i12 & 2) == i2 ? z : false) {
                View b2 = b(iVar2, null, viewGroup);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = iVar2.f112b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                iVar2.k(z);
            } else if ((i12 & 1) == z ? z : false) {
                int i14 = iVar2.f112b;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = ((i9 > 0 || z3) && i4 > 0) ? z : false;
                if (z4) {
                    View b3 = b(iVar2, null, viewGroup);
                    b3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        i iVar3 = arrayList.get(i15);
                        if (iVar3.f112b == i14) {
                            if (iVar3.g()) {
                                i9++;
                            }
                            iVar3.k(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                iVar2.k(z4);
            } else {
                iVar2.k(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    @Override // a.b.f.i.m
    public void i(boolean z) {
        n nVar;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.i;
        ArrayList<i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            g gVar = this.d;
            if (gVar != null) {
                gVar.i();
                ArrayList<i> l2 = this.d.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = l2.get(i2);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View b2 = b(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            b2.setPressed(false);
                            b2.jumpDrawablesToCurrentState();
                        }
                        if (b2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b2);
                            }
                            ((ViewGroup) this.i).addView(b2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.j) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.i).requestLayout();
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<i> arrayList2 = gVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                a.h.j.b bVar = arrayList2.get(i3).A;
            }
        }
        g gVar3 = this.d;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.j;
        }
        if (this.m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        d dVar = this.j;
        if (z3) {
            if (dVar == null) {
                this.j = new d(this.f86b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                d dVar2 = this.j;
                ActionMenuView.c q2 = actionMenuView.h();
                q2.f837c = true;
                actionMenuView.addView(dVar2, q2);
            }
        } else if (dVar != null && dVar.getParent() == (nVar = this.i)) {
            ((ViewGroup) nVar).removeView(this.j);
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.m);
    }

    @Override // a.b.f.i.m
    public void j(Context context, g gVar) {
        this.f87c = context;
        LayoutInflater.from(context);
        this.d = gVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        int i = 2;
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.q = i;
        int i4 = this.o;
        if (this.m) {
            if (this.j == null) {
                d dVar = new d(this.f86b);
                this.j = dVar;
                if (this.l) {
                    dVar.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = i4;
        this.s = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean l() {
        a aVar = this.v;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.j.dismiss();
        return true;
    }

    public boolean m() {
        e eVar = this.u;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        g gVar;
        if (!this.m || m() || (gVar = this.d) == null || this.i == null || this.w != null) {
            return false;
        }
        gVar.i();
        if (gVar.j.isEmpty()) {
            return false;
        }
        RunnableC0005c cVar = new RunnableC0005c(new e(this.f87c, this.d, this.j, true));
        this.w = cVar;
        ((View) this.i).post(cVar);
        return true;
    }
}
