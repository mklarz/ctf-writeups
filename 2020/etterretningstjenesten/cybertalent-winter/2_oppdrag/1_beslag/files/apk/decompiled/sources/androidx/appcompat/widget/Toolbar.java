package androidx.appcompat.widget;

import a.b.c.a;
import a.b.f.i.i;
import a.b.f.i.m;
import a.b.f.i.r;
import a.b.g.b1;
import a.b.g.d0;
import a.b.g.l;
import a.b.g.n;
import a.b.g.p0;
import a.b.g.x0;
import a.b.g.z;
import a.b.g.z0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E = new ArrayList<>();
    public final ArrayList<View> F = new ArrayList<>();
    public final int[] G = new int[2];
    public f H;
    public final ActionMenuView.e I = new a();
    public z0 J;
    public a.b.g.c K;
    public d L;
    public boolean M;
    public final Runnable N = new b();

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f864b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f865c;
    public TextView d;
    public ImageButton e;
    public ImageView f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public p0 u;
    public int v;
    public int w;
    public int x = 8388627;
    public CharSequence y;
    public CharSequence z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.u();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            d dVar = Toolbar.this.L;
            i iVar = dVar == null ? null : dVar.f870c;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    public class d implements m {

        /* renamed from: b  reason: collision with root package name */
        public a.b.f.i.g f869b;

        /* renamed from: c  reason: collision with root package name */
        public i f870c;

        public d() {
        }

        @Override // a.b.f.i.m
        public void c(a.b.f.i.g gVar, boolean z) {
        }

        @Override // a.b.f.i.m
        public boolean d(a.b.f.i.g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.f870c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e h = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h.f5a = 8388611 | (toolbar4.o & 112);
                h.f871b = 2;
                toolbar4.j.setLayoutParams(h);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f871b == 2 || childAt == toolbar6.f864b)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            View view = Toolbar.this.j;
            if (view instanceof a.b.f.b) {
                ((a.b.f.b) view).a();
            }
            return true;
        }

        @Override // a.b.f.i.m
        public boolean g(r rVar) {
            return false;
        }

        @Override // a.b.f.i.m
        public boolean h() {
            return false;
        }

        @Override // a.b.f.i.m
        public void i(boolean z) {
            if (this.f870c != null) {
                a.b.f.i.g gVar = this.f869b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f869b.getItem(i) == this.f870c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    k(this.f869b, this.f870c);
                }
            }
        }

        @Override // a.b.f.i.m
        public void j(Context context, a.b.f.i.g gVar) {
            i iVar;
            a.b.f.i.g gVar2 = this.f869b;
            if (!(gVar2 == null || (iVar = this.f870c) == null)) {
                gVar2.d(iVar);
            }
            this.f869b = gVar;
        }

        @Override // a.b.f.i.m
        public boolean k(a.b.f.i.g gVar, i iVar) {
            View view = Toolbar.this.j;
            if (view instanceof a.b.f.b) {
                ((a.b.f.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.F.get(size));
                } else {
                    toolbar3.F.clear();
                    this.f870c = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
            }
        }
    }

    public static class e extends a.C0000a {

        /* renamed from: b  reason: collision with root package name */
        public int f871b = 0;

        public e(int i, int i2) {
            super(i, i2);
            this.f5a = 8388627;
        }

        public e(a.C0000a aVar) {
            super(aVar);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0000a) eVar);
            this.f871b = eVar.f871b;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends a.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f872c;
        public boolean d;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new g[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f872c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f567a, i);
            parcel.writeInt(this.f872c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int[] iArr = a.b.b.x;
        x0 o2 = x0.o(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        a.h.j.m.f(this, context, iArr, attributeSet, o2.f240b, R.attr.toolbarStyle, 0);
        this.m = o2.j(28, 0);
        this.n = o2.j(19, 0);
        this.x = o2.f240b.getInteger(0, this.x);
        this.o = o2.f240b.getInteger(2, 48);
        int c2 = o2.c(22, 0);
        c2 = o2.m(27) ? o2.c(27, c2) : c2;
        this.t = c2;
        this.s = c2;
        this.r = c2;
        this.q = c2;
        int c3 = o2.c(25, -1);
        if (c3 >= 0) {
            this.q = c3;
        }
        int c4 = o2.c(24, -1);
        if (c4 >= 0) {
            this.r = c4;
        }
        int c5 = o2.c(26, -1);
        if (c5 >= 0) {
            this.s = c5;
        }
        int c6 = o2.c(23, -1);
        if (c6 >= 0) {
            this.t = c6;
        }
        this.p = o2.d(13, -1);
        int c7 = o2.c(9, Integer.MIN_VALUE);
        int c8 = o2.c(5, Integer.MIN_VALUE);
        int d2 = o2.d(7, 0);
        int d3 = o2.d(8, 0);
        d();
        p0 p0Var = this.u;
        p0Var.h = false;
        if (d2 != Integer.MIN_VALUE) {
            p0Var.e = d2;
            p0Var.f201a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            p0Var.f = d3;
            p0Var.f202b = d3;
        }
        if (!(c7 == Integer.MIN_VALUE && c8 == Integer.MIN_VALUE)) {
            p0Var.a(c7, c8);
        }
        this.v = o2.c(10, Integer.MIN_VALUE);
        this.w = o2.c(6, Integer.MIN_VALUE);
        this.g = o2.e(4);
        this.h = o2.l(3);
        CharSequence l2 = o2.l(21);
        if (!TextUtils.isEmpty(l2)) {
            setTitle(l2);
        }
        CharSequence l3 = o2.l(18);
        if (!TextUtils.isEmpty(l3)) {
            setSubtitle(l3);
        }
        this.k = getContext();
        setPopupTheme(o2.j(17, 0));
        Drawable e2 = o2.e(16);
        if (e2 != null) {
            setNavigationIcon(e2);
        }
        CharSequence l4 = o2.l(15);
        if (!TextUtils.isEmpty(l4)) {
            setNavigationContentDescription(l4);
        }
        Drawable e3 = o2.e(11);
        if (e3 != null) {
            setLogo(e3);
        }
        CharSequence l5 = o2.l(12);
        if (!TextUtils.isEmpty(l5)) {
            setLogoDescription(l5);
        }
        if (o2.m(29)) {
            setTitleTextColor(o2.b(29));
        }
        if (o2.m(20)) {
            setSubtitleTextColor(o2.b(20));
        }
        if (o2.m(14)) {
            getMenuInflater().inflate(o2.j(14, 0), getMenu());
        }
        o2.f240b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new a.b.f.f(getContext());
    }

    public final void a(List<View> list, int i2) {
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f871b == 0 && t(childAt) && j(eVar.f5a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f871b == 0 && t(childAt2) && j(eVar2.f5a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e h2 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        h2.f871b = 1;
        if (!z2 || this.j == null) {
            addView(view, h2);
            return;
        }
        view.setLayoutParams(h2);
        this.F.add(view);
    }

    public void c() {
        if (this.i == null) {
            l lVar = new l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.i = lVar;
            lVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e h2 = generateDefaultLayoutParams();
            h2.f5a = 8388611 | (this.o & 112);
            h2.f871b = 2;
            this.i.setLayoutParams(h2);
            this.i.setOnClickListener(new c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.u == null) {
            this.u = new p0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f864b;
        if (actionMenuView.q == null) {
            a.b.f.i.g gVar = (a.b.f.i.g) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f864b.setExpandedActionViewsExclusive(true);
            gVar.b(this.L, this.k);
        }
    }

    public final void f() {
        if (this.f864b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f864b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f864b.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f864b;
            actionMenuView2.v = null;
            actionMenuView2.w = null;
            e h2 = generateDefaultLayoutParams();
            h2.f5a = 8388613 | (this.o & 112);
            this.f864b.setLayoutParams(h2);
            b(this.f864b, false);
        }
    }

    public final void g() {
        if (this.e == null) {
            this.e = new l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e h2 = generateDefaultLayoutParams();
            h2.f5a = 8388611 | (this.o & 112);
            this.e.setLayoutParams(h2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f201a : p0Var.f202b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f201a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f202b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f202b : p0Var.f201a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        a.b.f.i.g gVar;
        ActionMenuView actionMenuView = this.f864b;
        return actionMenuView != null && (gVar = actionMenuView.q) != null && gVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f864b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a.b.g.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f864b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.f865c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new z0(this, true);
        }
        return this.J;
    }

    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0000a ? new e((a.C0000a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i2) {
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.f5a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.x & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean o() {
        ActionMenuView actionMenuView = this.f864b;
        if (actionMenuView != null) {
            a.b.g.c cVar = actionMenuView.u;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0297 A[LOOP:0: B:106:0x0295->B:107:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9 A[LOOP:1: B:109:0x02b7->B:110:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02de A[LOOP:2: B:112:0x02dc->B:113:0x02de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0333 A[LOOP:3: B:120:0x0331->B:121:0x0333, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean t2;
        boolean t3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int size3;
        int i16;
        int i17;
        int size4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i5 - i3) : 0;
        if (t(this.e)) {
            ImageButton imageButton = this.e;
            if (z3) {
                i6 = q(imageButton, i26, iArr, min);
                i7 = paddingLeft;
                if (t(this.i)) {
                    ImageButton imageButton2 = this.i;
                    if (z3) {
                        i6 = q(imageButton2, i6, iArr, min);
                    } else {
                        i7 = p(imageButton2, i7, iArr, min);
                    }
                }
                if (t(this.f864b)) {
                    ActionMenuView actionMenuView = this.f864b;
                    if (z3) {
                        i7 = p(actionMenuView, i7, iArr, min);
                    } else {
                        i6 = q(actionMenuView, i6, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i26 - i6));
                int max = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i6, i26 - currentContentInsetRight);
                if (t(this.j)) {
                    View view = this.j;
                    if (z3) {
                        min2 = q(view, min2, iArr, min);
                    } else {
                        max = p(view, max, iArr, min);
                    }
                }
                if (t(this.f)) {
                    ImageView imageView = this.f;
                    if (z3) {
                        min2 = q(imageView, min2, iArr, min);
                    } else {
                        max = p(imageView, max, iArr, min);
                    }
                }
                t2 = t(this.f865c);
                t3 = t(this.d);
                if (!t2) {
                    e eVar = (e) this.f865c.getLayoutParams();
                    i8 = paddingRight;
                    i9 = this.f865c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + 0;
                } else {
                    i8 = paddingRight;
                    i9 = 0;
                }
                if (!t3) {
                    e eVar2 = (e) this.d.getLayoutParams();
                    i10 = width;
                    i9 += this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin;
                } else {
                    i10 = width;
                }
                if (!t2 || t3) {
                    TextView textView = !t2 ? this.f865c : this.d;
                    TextView textView2 = !t3 ? this.d : this.f865c;
                    e eVar3 = (e) textView.getLayoutParams();
                    e eVar4 = (e) textView2.getLayoutParams();
                    boolean z4 = (!t2 && this.f865c.getMeasuredWidth() > 0) || (t3 && this.d.getMeasuredWidth() > 0);
                    i19 = this.x & 112;
                    i12 = paddingLeft;
                    if (i19 != 48) {
                        i20 = max;
                        i11 = min;
                        i21 = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.s;
                    } else if (i19 != 80) {
                        int i27 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                        int i28 = ((ViewGroup.MarginLayoutParams) eVar3).topMargin;
                        i11 = min;
                        int i29 = this.s;
                        i20 = max;
                        if (i27 < i28 + i29) {
                            i27 = i28 + i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i9) - i27) - paddingTop;
                            int i31 = ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin;
                            int i32 = this.t;
                            if (i30 < i31 + i32) {
                                i27 = Math.max(0, i27 - ((((ViewGroup.MarginLayoutParams) eVar4).bottomMargin + i32) - i30));
                            }
                        }
                        i21 = paddingTop + i27;
                    } else {
                        i20 = max;
                        i11 = min;
                        i21 = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin) - this.t) - i9;
                    }
                    if (!z3) {
                        int i33 = (z4 ? this.q : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (t2) {
                            int measuredWidth = min2 - this.f865c.getMeasuredWidth();
                            int measuredHeight = this.f865c.getMeasuredHeight() + i21;
                            this.f865c.layout(measuredWidth, i21, min2, measuredHeight);
                            i24 = measuredWidth - this.r;
                            i21 = measuredHeight + ((ViewGroup.MarginLayoutParams) ((e) this.f865c.getLayoutParams())).bottomMargin;
                        } else {
                            i24 = min2;
                        }
                        if (t3) {
                            int i34 = i21 + ((ViewGroup.MarginLayoutParams) ((e) this.d.getLayoutParams())).topMargin;
                            this.d.layout(min2 - this.d.getMeasuredWidth(), i34, min2, this.d.getMeasuredHeight() + i34);
                            i25 = min2 - this.r;
                        } else {
                            i25 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i24, i25);
                        }
                        max = i20;
                    } else {
                        int i35 = (z4 ? this.q : 0) - iArr[0];
                        int max2 = Math.max(0, i35) + i20;
                        iArr[0] = Math.max(0, -i35);
                        if (t2) {
                            int measuredWidth2 = this.f865c.getMeasuredWidth() + max2;
                            int measuredHeight2 = this.f865c.getMeasuredHeight() + i21;
                            this.f865c.layout(max2, i21, measuredWidth2, measuredHeight2);
                            i22 = measuredWidth2 + this.r;
                            i21 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((e) this.f865c.getLayoutParams())).bottomMargin;
                        } else {
                            i22 = max2;
                        }
                        if (t3) {
                            int i36 = i21 + ((ViewGroup.MarginLayoutParams) ((e) this.d.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.d.getMeasuredWidth() + max2;
                            this.d.layout(max2, i36, measuredWidth3, this.d.getMeasuredHeight() + i36);
                            i23 = measuredWidth3 + this.r;
                        } else {
                            i23 = max2;
                        }
                        max = z4 ? Math.max(i22, i23) : max2;
                    }
                } else {
                    i12 = paddingLeft;
                    i11 = min;
                }
                a(this.E, 3);
                size = this.E.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = p(this.E.get(i14), i13, iArr, i11);
                }
                a(this.E, 5);
                size2 = this.E.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = q(this.E.get(i15), min2, iArr, i11);
                }
                a(this.E, 1);
                ArrayList<View> arrayList = this.E;
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i37;
                i16 = 0;
                int i40 = 0;
                while (i16 < size3) {
                    View view2 = arrayList.get(i16);
                    e eVar5 = (e) view2.getLayoutParams();
                    int i41 = ((ViewGroup.MarginLayoutParams) eVar5).leftMargin - i39;
                    int i42 = ((ViewGroup.MarginLayoutParams) eVar5).rightMargin - i38;
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, i42);
                    int max5 = Math.max(0, -i41);
                    int max6 = Math.max(0, -i42);
                    i40 += view2.getMeasuredWidth() + max3 + max4;
                    i16++;
                    i38 = max6;
                    i39 = max5;
                }
                i17 = ((((i10 - i12) - i8) / 2) + i12) - (i40 / 2);
                int i43 = i40 + i17;
                if (i17 >= i13) {
                    i13 = i43 > min2 ? i17 - (i43 - min2) : i17;
                }
                size4 = this.E.size();
                int i44 = i13;
                for (i18 = 0; i18 < size4; i18++) {
                    i44 = p(this.E.get(i18), i44, iArr, i11);
                }
                this.E.clear();
            }
            i7 = p(imageButton, paddingLeft, iArr, min);
        } else {
            i7 = paddingLeft;
        }
        i6 = i26;
        if (t(this.i)) {
        }
        if (t(this.f864b)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - i6));
        int max7 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i6, i26 - currentContentInsetRight2);
        if (t(this.j)) {
        }
        if (t(this.f)) {
        }
        t2 = t(this.f865c);
        t3 = t(this.d);
        if (!t2) {
        }
        if (!t3) {
        }
        if (!t2) {
        }
        if (!t2) {
        }
        if (!t3) {
        }
        e eVar32 = (e) textView.getLayoutParams();
        e eVar42 = (e) textView2.getLayoutParams();
        if (!t2) {
        }
        i19 = this.x & 112;
        i12 = paddingLeft;
        if (i19 != 48) {
        }
        if (!z3) {
        }
        a(this.E, 3);
        size = this.E.size();
        i13 = max7;
        while (i14 < size) {
        }
        a(this.E, 5);
        size2 = this.E.size();
        while (i15 < size2) {
        }
        a(this.E, 1);
        ArrayList<View> arrayList2 = this.E;
        int i372 = iArr[0];
        int i382 = iArr[1];
        size3 = arrayList2.size();
        int i392 = i372;
        i16 = 0;
        int i402 = 0;
        while (i16 < size3) {
        }
        i17 = ((((i10 - i12) - i8) / 2) + i12) - (i402 / 2);
        int i432 = i402 + i17;
        if (i17 >= i13) {
        }
        size4 = this.E.size();
        int i442 = i13;
        while (i18 < size4) {
        }
        this.E.clear();
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        boolean z2 = true;
        int i11 = 0;
        if (b1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (t(this.e)) {
            s(this.e, i2, 0, i3, 0, this.p);
            i6 = l(this.e) + this.e.getMeasuredWidth();
            i5 = Math.max(0, m(this.e) + this.e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (t(this.i)) {
            s(this.i, i2, 0, i3, 0, this.p);
            i6 = l(this.i) + this.i.getMeasuredWidth();
            i5 = Math.max(i5, m(this.i) + this.i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (t(this.f864b)) {
            s(this.f864b, i2, max, i3, 0, this.p);
            i7 = l(this.f864b) + this.f864b.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f864b) + this.f864b.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f864b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (t(this.j)) {
            max2 += r(this.j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.j) + this.j.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.j.getMeasuredState());
        }
        if (t(this.f)) {
            max2 += r(this.f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f) + this.f.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f871b == 0 && t(childAt)) {
                max2 += r(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, m(childAt) + childAt.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.s + this.t;
        int i14 = this.q + this.r;
        if (t(this.f865c)) {
            r(this.f865c, i2, max2 + i14, i3, i13, iArr);
            int l2 = l(this.f865c) + this.f865c.getMeasuredWidth();
            i8 = m(this.f865c) + this.f865c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.f865c.getMeasuredState());
            i9 = l2;
        } else {
            i8 = 0;
            i10 = i4;
            i9 = 0;
        }
        if (t(this.d)) {
            i9 = Math.max(i9, r(this.d, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 = m(this.d) + this.d.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.d.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.M) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f567a);
        ActionMenuView actionMenuView = this.f864b;
        a.b.f.i.g gVar2 = actionMenuView != null ? actionMenuView.q : null;
        int i2 = gVar.f872c;
        if (!(i2 == 0 || this.L == null || gVar2 == null || (findItem = gVar2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.d) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    public void onRtlPropertiesChanged(int i2) {
        int i3;
        super.onRtlPropertiesChanged(i2);
        d();
        p0 p0Var = this.u;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != p0Var.g) {
            p0Var.g = z2;
            if (!p0Var.h) {
                p0Var.f201a = p0Var.e;
            } else if (z2) {
                int i4 = p0Var.d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = p0Var.e;
                }
                p0Var.f201a = i4;
                i3 = p0Var.f203c;
            } else {
                int i5 = p0Var.f203c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = p0Var.e;
                }
                p0Var.f201a = i5;
                i3 = p0Var.d;
            }
            i3 = p0Var.f;
            p0Var.f202b = i3;
        }
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (!(dVar == null || (iVar = dVar.f870c) == null)) {
            gVar.f872c = iVar.f111a;
        }
        gVar.d = o();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int q(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(a.b.d.a.a.a(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.v) {
            this.v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(a.b.d.a.a.a(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f == null) {
                this.f = new n(getContext(), null, 0);
            }
            if (!n(this.f)) {
                b(this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && n(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f == null) {
            this.f = new n(getContext(), null, 0);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(a.b.d.a.a.a(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.e)) {
                b(this.e, true);
            }
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null && n(imageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f864b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                z zVar = new z(context, null);
                this.d = zVar;
                zVar.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            TextView textView = this.d;
            if (textView != null && n(textView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f865c == null) {
                Context context = getContext();
                z zVar = new z(context, null);
                this.f865c = zVar;
                zVar.setSingleLine();
                this.f865c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.m;
                if (i2 != 0) {
                    this.f865c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f865c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f865c)) {
                b(this.f865c, true);
            }
        } else {
            TextView textView = this.f865c;
            if (textView != null && n(textView)) {
                removeView(this.f865c);
                this.F.remove(this.f865c);
            }
        }
        TextView textView2 = this.f865c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f865c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean u() {
        ActionMenuView actionMenuView = this.f864b;
        if (actionMenuView != null) {
            a.b.g.c cVar = actionMenuView.u;
            if (cVar != null && cVar.n()) {
                return true;
            }
        }
        return false;
    }
}
