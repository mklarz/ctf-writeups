package com.google.android.material.appbar;

import a.h.b.d;
import a.h.j.e;
import a.h.j.f;
import a.h.j.m;
import a.h.j.r;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.d.b;
import b.b.a.a.d.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public int f1092b;

    /* renamed from: c  reason: collision with root package name */
    public int f1093c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int[] j;

    public static class BaseBehavior<T extends AppBarLayout> extends b<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public int m = -1;
        public boolean n;
        public float o;
        public WeakReference<View> p;

        public static class a extends a.j.a.a {
            public static final Parcelable.Creator<a> CREATOR = new C0032a();

            /* renamed from: c  reason: collision with root package name */
            public int f1094c;
            public float d;
            public boolean e;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public static class C0032a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new a[i];
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1094c = parcel.readInt();
                this.d = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // a.j.a.a
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f567a, i);
                parcel.writeInt(this.f1094c);
                parcel.writeFloat(this.d);
                parcel.writeByte(this.e ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean J(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // b.b.a.a.d.b
        public boolean D(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.p;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
        }

        @Override // b.b.a.a.d.b
        public int E() {
            return A() + this.j;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
        @Override // b.b.a.a.d.b
        public int H(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            ArrayList<T> orDefault;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int E = E();
            if (i2 == 0 || E < i2 || E > i3) {
                this.j = 0;
                return 0;
            }
            int e = d.e(i, i2, i3);
            if (E == e) {
                return 0;
            }
            if (appBarLayout.e) {
                int abs = Math.abs(e);
                int childCount = appBarLayout.getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount) {
                        break;
                    }
                    View childAt = appBarLayout.getChildAt(i6);
                    a aVar = (a) childAt.getLayoutParams();
                    Interpolator interpolator = aVar.f1096b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i6++;
                    } else if (interpolator != null) {
                        int i7 = aVar.f1095a;
                        if ((i7 & 1) != 0) {
                            i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0;
                            if ((i7 & 2) != 0) {
                                WeakHashMap<View, r> weakHashMap = m.f516a;
                                i5 -= childAt.getMinimumHeight();
                            }
                        } else {
                            i5 = 0;
                        }
                        WeakHashMap<View, r> weakHashMap2 = m.f516a;
                        if (childAt.getFitsSystemWindows()) {
                            i5 -= appBarLayout.getTopInset();
                        }
                        if (i5 > 0) {
                            float f = (float) i5;
                            i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f) * f)) * Integer.signum(e);
                        }
                    }
                }
                boolean C = C(i4);
                int i8 = E - e;
                this.j = e - i4;
                if (!C && appBarLayout.e && (orDefault = coordinatorLayout.f885c.f416b.getOrDefault(appBarLayout, null)) != null && !orDefault.isEmpty()) {
                    for (int i9 = 0; i9 < orDefault.size(); i9++) {
                        T t = orDefault.get(i9);
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) t.getLayoutParams()).f888a;
                        if (cVar != null) {
                            cVar.g(coordinatorLayout, t, appBarLayout);
                        }
                    }
                }
                A();
                P(coordinatorLayout, appBarLayout, e, e >= E ? -1 : 1, false);
                return i8;
            }
            i4 = e;
            boolean C2 = C(i4);
            int i82 = E - e;
            this.j = e - i4;
            while (i9 < orDefault.size()) {
            }
            A();
            P(coordinatorLayout, appBarLayout, e, e >= E ? -1 : 1, false);
            return i82;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(E() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            int E = E();
            if (E == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(b.b.a.a.c.a.d);
                this.l.addUpdateListener(new b.b.a.a.d.a(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration((long) Math.min(round, 600));
            this.l.setIntValues(E, i);
            this.l.start();
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;II[II)V */
        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.google.android.material.appbar.AppBarLayout */
        /* JADX WARN: Multi-variable type inference failed */
        public void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr, int i2) {
            int i3;
            int i4;
            if (i != 0) {
                if (i < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                if (i4 != i3) {
                    iArr[1] = F(coordinatorLayout, appBarLayout, i, i4, i3);
                    O(i, appBarLayout, view, i2);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;IIIII)V */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.google.android.material.appbar.AppBarLayout */
        /* JADX WARN: Multi-variable type inference failed */
        public void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
            if (i < 0) {
                F(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
                O(i, appBarLayout, view, i2);
            }
            if (appBarLayout.i) {
                appBarLayout.c(view.getScrollY() > 0);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TT;Landroid/view/View;Landroid/view/View;II)Z */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L_0x002b;
         */
        public boolean M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = true;
            if ((i & 2) != 0) {
                if (!appBarLayout.i) {
                }
                if (z && (valueAnimator = this.l) != null) {
                    valueAnimator.cancel();
                }
                this.p = null;
                this.k = i2;
                return z;
            }
            z = false;
            valueAnimator.cancel();
            this.p = null;
            this.k = i2;
            return z;
        }

        public final void N(CoordinatorLayout coordinatorLayout, T t) {
            int E = E();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if (J(aVar.f1095a, 32)) {
                    top -= ((LinearLayout.LayoutParams) aVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) aVar).bottomMargin;
                }
                int i2 = -E;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i3 = aVar2.f1095a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (J(i3, 2)) {
                        WeakHashMap<View, r> weakHashMap = m.f516a;
                        i5 += childAt2.getMinimumHeight();
                    } else if (J(i3, 5)) {
                        WeakHashMap<View, r> weakHashMap2 = m.f516a;
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (E < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (J(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) aVar2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    }
                    if (E < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    I(coordinatorLayout, t, d.e(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void O(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int E = E();
                if ((i < 0 && E == 0) || (i > 0 && E == (-t.getDownNestedScrollRange()))) {
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    if (view instanceof e) {
                        ((e) view).a(1);
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
        public final void P(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View view;
            View view2;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                view = null;
                if (i3 >= childCount) {
                    view2 = null;
                    break;
                }
                view2 = t.getChildAt(i3);
                if (abs >= view2.getTop() && abs <= view2.getBottom()) {
                    break;
                }
                i3++;
            }
            if (view2 != null) {
                int i4 = ((a) view2.getLayoutParams()).f1095a;
                if ((i4 & 1) != 0) {
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    int minimumHeight = view2.getMinimumHeight();
                    if (i2 <= 0 || (i4 & 12) == 0 ? !((i4 & 2) == 0 || (-i) < (view2.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (view2.getBottom() - minimumHeight) - t.getTopInset()) {
                        z2 = true;
                        if (t.i) {
                            int childCount2 = coordinatorLayout.getChildCount();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= childCount2) {
                                    break;
                                }
                                View childAt = coordinatorLayout.getChildAt(i5);
                                if (childAt instanceof f) {
                                    view = childAt;
                                    break;
                                }
                                i5++;
                            }
                            if (view != null) {
                                z2 = view.getScrollY() > 0;
                            }
                        }
                        boolean c2 = t.c(z2);
                        if (!z) {
                            if (c2) {
                                List<View> e = coordinatorLayout.e(t);
                                int size = e.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size) {
                                        break;
                                    }
                                    CoordinatorLayout.c cVar = ((CoordinatorLayout.f) e.get(i6).getLayoutParams()).f888a;
                                    if (!(cVar instanceof ScrollingViewBehavior)) {
                                        i6++;
                                    } else if (((ScrollingViewBehavior) cVar).f != 0) {
                                        z3 = true;
                                    }
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        t.jumpDrawablesToCurrentState();
                    }
                }
                z2 = false;
                if (t.i) {
                }
                boolean c22 = t.c(z2);
                if (!z) {
                }
                t.jumpDrawablesToCurrentState();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.b.a.a.d.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.j(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i3 = this.m;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.n) {
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    i2 = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.o) + i4;
                }
                G(coordinatorLayout, appBarLayout, i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        I(coordinatorLayout, appBarLayout, i5, 0.0f);
                    } else {
                        G(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        I(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        G(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f = 0;
            this.m = -1;
            C(d.e(A(), -appBarLayout.getTotalScrollRange(), 0));
            P(coordinatorLayout, appBarLayout, A(), 0, true);
            A();
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            K(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr, i3);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i4, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void t(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                a aVar = (a) parcelable;
                this.m = aVar.f1094c;
                this.o = aVar.d;
                this.n = aVar.e;
                return;
            }
            this.m = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable u(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int A = A();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + A;
                if (childAt.getTop() + A <= 0 && bottom >= 0) {
                    a aVar = new a(absSavedState);
                    aVar.f1094c = i;
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z = true;
                    }
                    aVar.e = z;
                    aVar.d = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean w(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return M(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void y(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                N(coordinatorLayout, appBarLayout);
            }
            this.p = new WeakReference<>(view2);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public AppBarLayout E(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f888a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j) + this.e) - D(view2);
                WeakHashMap<View, r> weakHashMap = m.f516a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.i) {
                    appBarLayout.c(view.getScrollY() > 0);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout E = E(coordinatorLayout.d(view));
            if (E != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1014c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    E.b(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    public static class a extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1095a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f1096b;

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f990a);
            this.f1095a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f1096b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public void b(boolean z, boolean z2) {
        int i2 = z ? 1 : 2;
        int i3 = 0;
        if (z2) {
            i3 = 4;
        }
        this.f = i2 | i3 | 8;
        requestLayout();
    }

    public boolean c(boolean z) {
        if (this.h == z) {
            return false;
        }
        this.h = z;
        refreshDrawableState();
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int i3 = this.f1093c;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.f1095a;
            if ((i5 & 5) == 5) {
                int i6 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + i4;
                if ((i5 & 8) != 0) {
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    i4 = childAt.getMinimumHeight() + i6;
                } else {
                    if ((i5 & 2) != 0) {
                        WeakHashMap<View, r> weakHashMap2 = m.f516a;
                        i2 = childAt.getMinimumHeight();
                    } else {
                        i2 = getTopInset();
                    }
                    i4 = (measuredHeight - i2) + i6;
                }
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f1093c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + childAt.getMeasuredHeight();
            int i5 = aVar.f1095a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                i4 -= getTopInset() + childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f1092b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.f1095a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                i4 -= childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.f1092b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public int[] onCreateDrawableState(int i2) {
        if (this.j == null) {
            this.j = new int[4];
        }
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.g;
        iArr[0] = z ? R.attr.state_liftable : -2130903580;
        iArr[1] = (!z || !this.h) ? -2130903581 : R.attr.state_lifted;
        iArr[2] = z ? R.attr.state_collapsible : -2130903579;
        iArr[3] = (!z || !this.h) ? -2130903578 : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r3 != false) goto L_0x0055;
     */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        super.onLayout(z, i2, i3, i4, i5);
        this.f1092b = -1;
        this.f1093c = -1;
        this.d = -1;
        boolean z3 = false;
        this.e = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((a) getChildAt(i6).getLayoutParams()).f1096b != null) {
                this.e = true;
                break;
            } else {
                i6++;
            }
        }
        if (!this.i) {
            int childCount2 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount2) {
                    z2 = false;
                    break;
                }
                int i8 = ((a) getChildAt(i7).getLayoutParams()).f1095a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i7++;
            }
        }
        z3 = true;
        if (this.g != z3) {
            this.g = z3;
            refreshDrawableState();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f1092b = -1;
        this.f1093c = -1;
        this.d = -1;
    }

    public void setExpanded(boolean z) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        b(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130903581}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m4generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m5generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
