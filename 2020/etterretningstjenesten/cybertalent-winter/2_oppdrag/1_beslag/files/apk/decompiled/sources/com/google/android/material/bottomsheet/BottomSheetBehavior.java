package com.google.android.material.bottomsheet;

import a.h.b.d;
import a.h.j.m;
import a.h.j.r;
import a.j.b.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1110a = true;

    /* renamed from: b  reason: collision with root package name */
    public float f1111b;

    /* renamed from: c  reason: collision with root package name */
    public int f1112c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l = 4;
    public a.j.b.a m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public WeakReference<V> r;
    public WeakReference<View> s;
    public VelocityTracker t;
    public int u;
    public int v;
    public boolean w;
    public Map<View, Integer> x;
    public final a.c y = new a();

    public class a extends a.c {
        public a() {
        }

        @Override // a.j.b.a.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // a.j.b.a.c
        public int b(View view, int i, int i2) {
            int C = BottomSheetBehavior.this.C();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return d.e(i, C, bottomSheetBehavior.j ? bottomSheetBehavior.q : bottomSheetBehavior.i);
        }

        @Override // a.j.b.a.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.j ? bottomSheetBehavior.q : bottomSheetBehavior.i;
        }

        @Override // a.j.b.a.c
        public void f(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.E(1);
            }
        }

        @Override // a.j.b.a.c
        public void g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.r.get();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
            if (r7 < java.lang.Math.abs(r7 - r8.i)) goto L_0x008a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
            if (java.lang.Math.abs(r7 - r0) < java.lang.Math.abs(r7 - r5.f1113a.i)) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
            if (r7 > r8) goto L_0x00a1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
        @Override // a.j.b.a.c
        public void h(View view, float f, float f2) {
            int i;
            int i2;
            BottomSheetBehavior bottomSheetBehavior;
            int i3 = 4;
            if (f2 < 0.0f) {
                bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f1110a) {
                    int top = view.getTop();
                    i2 = BottomSheetBehavior.this.h;
                }
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (!bottomSheetBehavior2.j || !bottomSheetBehavior2.F(view, f2) || (view.getTop() <= BottomSheetBehavior.this.i && Math.abs(f) >= Math.abs(f2))) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        if (!bottomSheetBehavior3.f1110a) {
                            int i4 = bottomSheetBehavior3.h;
                            if (top2 < i4) {
                            }
                            i2 = BottomSheetBehavior.this.h;
                            i3 = 6;
                            i = i2;
                            if (!BottomSheetBehavior.this.m.t(view.getLeft(), i)) {
                                BottomSheetBehavior.this.E(2);
                                c cVar = new c(view, i3);
                                WeakHashMap<View, r> weakHashMap = m.f516a;
                                view.postOnAnimation(cVar);
                                return;
                            }
                            BottomSheetBehavior.this.E(i3);
                            return;
                        } else if (Math.abs(top2 - bottomSheetBehavior3.g) < Math.abs(top2 - BottomSheetBehavior.this.i)) {
                            bottomSheetBehavior = BottomSheetBehavior.this;
                        }
                    }
                    i = BottomSheetBehavior.this.i;
                    if (!BottomSheetBehavior.this.m.t(view.getLeft(), i)) {
                    }
                } else {
                    i = BottomSheetBehavior.this.q;
                    i3 = 5;
                    if (!BottomSheetBehavior.this.m.t(view.getLeft(), i)) {
                    }
                }
            }
            i = bottomSheetBehavior.g;
            i3 = 3;
            if (!BottomSheetBehavior.this.m.t(view.getLeft(), i)) {
            }
        }

        @Override // a.j.b.a.c
        public boolean i(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.l;
            if (i2 == 1 || bottomSheetBehavior.w) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.u == i && (view2 = bottomSheetBehavior.s.get()) != null && view2.canScrollVertically(-1)) {
                return false;
            }
            WeakReference<V> weakReference = BottomSheetBehavior.this.r;
            return weakReference != null && weakReference.get() == view;
        }
    }

    public static class b extends a.j.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f1114c;

        public static class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new b[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1114c = parcel.readInt();
        }

        public b(Parcelable parcelable, int i) {
            super(parcelable);
            this.f1114c = i;
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f567a, i);
            parcel.writeInt(this.f1114c);
        }
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f1115b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1116c;

        public c(View view, int i) {
            this.f1115b = view;
            this.f1116c = i;
        }

        public void run() {
            a.j.b.a aVar = BottomSheetBehavior.this.m;
            if (aVar == null || !aVar.i(true)) {
                BottomSheetBehavior.this.E(this.f1116c);
                return;
            }
            View view = this.f1115b;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            view.postOnAnimation(this);
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f991b);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            D(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            D(i2);
        }
        this.j = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        if (this.f1110a != z) {
            this.f1110a = z;
            if (this.r != null) {
                A();
            }
            E((!this.f1110a || this.l != 6) ? this.l : 3);
        }
        this.k = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f1111b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        this.i = this.f1110a ? Math.max(this.q - this.f, this.g) : this.q - this.f;
    }

    public View B(View view) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View B = B(viewGroup.getChildAt(i2));
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    public final int C() {
        if (this.f1110a) {
            return this.g;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void D(int i2) {
        WeakReference<V> weakReference;
        V v2;
        boolean z = true;
        if (i2 == -1) {
            if (!this.d) {
                this.d = true;
                if (!z && this.l == 4 && (weakReference = this.r) != null && (v2 = weakReference.get()) != null) {
                    v2.requestLayout();
                    return;
                }
                return;
            }
        } else if (this.d || this.f1112c != i2) {
            this.d = false;
            this.f1112c = Math.max(0, i2);
            this.i = this.q - i2;
            if (!z) {
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
    }

    public void E(int i2) {
        boolean z;
        if (this.l != i2) {
            this.l = i2;
            if (i2 == 6 || i2 == 3) {
                z = true;
            } else {
                if (i2 == 5 || i2 == 4) {
                    z = false;
                }
                this.r.get();
            }
            G(z);
            this.r.get();
        }
    }

    public boolean F(View view, float f2) {
        if (this.k) {
            return true;
        }
        if (view.getTop() < this.i) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.i)) / ((float) this.f1112c) > 0.5f;
    }

    public final void G(boolean z) {
        int i2;
        WeakReference<V> weakReference = this.r;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.x == null) {
                        this.x = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.r.get()) {
                        Map<View, Integer> map = this.x;
                        if (z) {
                            map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            i2 = 4;
                        } else if (map != null && map.containsKey(childAt)) {
                            i2 = this.x.get(childAt).intValue();
                        }
                        WeakHashMap<View, r> weakHashMap = m.f516a;
                        childAt.setImportantForAccessibility(i2);
                    }
                }
                if (!z) {
                    this.x = null;
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        a.j.b.a aVar;
        if (!v2.isShown()) {
            this.n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.u = -1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.v = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.s;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && coordinatorLayout.p(view2, x2, this.v)) {
                this.u = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.w = true;
            }
            this.n = this.u == -1 && !coordinatorLayout.p(v2, x2, this.v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.w = false;
            this.u = -1;
            if (this.n) {
                this.n = false;
                return false;
            }
        }
        if (!this.n && (aVar = this.m) != null && aVar.u(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.s;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.n && this.l != 1 && !coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.m != null && Math.abs(((float) this.v) - motionEvent.getY()) > ((float) this.m.f569b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        int i3;
        int i4;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (coordinatorLayout.getFitsSystemWindows() && !v2.getFitsSystemWindows()) {
            v2.setFitsSystemWindows(true);
        }
        int top = v2.getTop();
        coordinatorLayout.r(v2, i2);
        this.q = coordinatorLayout.getHeight();
        if (this.d) {
            if (this.e == 0) {
                this.e = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            i3 = Math.max(this.e, this.q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i3 = this.f1112c;
        }
        this.f = i3;
        this.g = Math.max(0, this.q - v2.getHeight());
        this.h = this.q / 2;
        A();
        int i5 = this.l;
        if (i5 == 3) {
            i4 = C();
        } else if (i5 == 6) {
            i4 = this.h;
        } else if (this.j && i5 == 5) {
            i4 = this.q;
        } else if (i5 == 4) {
            i4 = this.i;
        } else {
            if (i5 == 1 || i5 == 2) {
                v2.offsetTopAndBottom(top - v2.getTop());
            }
            if (this.m == null) {
                this.m = new a.j.b.a(coordinatorLayout.getContext(), coordinatorLayout, this.y);
            }
            this.r = new WeakReference<>(v2);
            this.s = new WeakReference<>(B(v2));
            return true;
        }
        v2.offsetTopAndBottom(i4);
        if (this.m == null) {
        }
        this.r = new WeakReference<>(v2);
        this.s = new WeakReference<>(B(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        return view == this.s.get() && this.l != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1 && view == this.s.get()) {
            int top = v2.getTop();
            int i6 = top - i3;
            if (i3 <= 0) {
                if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i7 = this.i;
                    if (i6 <= i7 || this.j) {
                        iArr[1] = i3;
                    } else {
                        iArr[1] = top - i7;
                        WeakHashMap<View, r> weakHashMap = m.f516a;
                        v2.offsetTopAndBottom(-iArr[1]);
                        i5 = 4;
                        E(i5);
                    }
                }
                v2.getTop();
                this.r.get();
                this.o = i3;
                this.p = true;
            } else if (i6 < C()) {
                iArr[1] = top - C();
                WeakHashMap<View, r> weakHashMap2 = m.f516a;
                v2.offsetTopAndBottom(-iArr[1]);
                i5 = 3;
                E(i5);
                v2.getTop();
                this.r.get();
                this.o = i3;
                this.p = true;
            } else {
                iArr[1] = i3;
            }
            int i8 = -i3;
            WeakHashMap<View, r> weakHashMap3 = m.f516a;
            v2.offsetTopAndBottom(i8);
            E(1);
            v2.getTop();
            this.r.get();
            this.o = i3;
            this.p = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        int i2 = ((b) parcelable).f1114c;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.l = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable u(CoordinatorLayout coordinatorLayout, V v2) {
        return new b(View.BaseSavedState.EMPTY_STATE, this.l);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean w(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.o = 0;
        this.p = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.i)) goto L_0x008c;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        float f2;
        int i4 = 3;
        if (v2.getTop() == C()) {
            E(3);
        } else if (view == this.s.get() && this.p) {
            if (this.o > 0) {
                i3 = C();
            } else {
                if (this.j) {
                    VelocityTracker velocityTracker = this.t;
                    if (velocityTracker == null) {
                        f2 = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f1111b);
                        f2 = this.t.getYVelocity(this.u);
                    }
                    if (F(v2, f2)) {
                        i3 = this.q;
                        i4 = 5;
                    }
                }
                if (this.o == 0) {
                    int top = v2.getTop();
                    if (!this.f1110a) {
                        int i5 = this.h;
                        if (top < i5) {
                            if (top < Math.abs(top - this.i)) {
                                i3 = 0;
                            }
                        }
                        i3 = this.h;
                        i4 = 6;
                    } else if (Math.abs(top - this.g) < Math.abs(top - this.i)) {
                        i3 = this.g;
                    }
                }
                i3 = this.i;
                i4 = 4;
            }
            a.j.b.a aVar = this.m;
            int left = v2.getLeft();
            aVar.r = v2;
            aVar.f570c = -1;
            boolean l2 = aVar.l(left, i3, 0, 0);
            if (!l2 && aVar.f568a == 0 && aVar.r != null) {
                aVar.r = null;
            }
            if (l2) {
                E(2);
                c cVar = new c(v2, i4);
                WeakHashMap<View, r> weakHashMap = m.f516a;
                v2.postOnAnimation(cVar);
            } else {
                E(i4);
            }
            this.p = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.l == 1 && actionMasked == 0) {
            return true;
        }
        a.j.b.a aVar = this.m;
        if (aVar != null) {
            aVar.n(motionEvent);
        }
        if (actionMasked == 0) {
            this.u = -1;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.n) {
            float abs = Math.abs(((float) this.v) - motionEvent.getY());
            a.j.b.a aVar2 = this.m;
            if (abs > ((float) aVar2.f569b)) {
                aVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.n;
    }
}
