package androidx.recyclerview.widget;

import a.h.j.w.d;
import a.o.b.a;
import a.o.b.b;
import a.o.b.k;
import a.o.b.n;
import a.o.b.x;
import a.o.b.y;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import c.a.a.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class RecyclerView extends ViewGroup implements a.h.j.e {
    public static final int[] w0 = {16843830};
    public static final int[] x0 = {16842987};
    public static final Class<?>[] y0;
    public static final Interpolator z0 = new b();
    public final AccessibilityManager A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public h F;
    public EdgeEffect G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public i K;
    public int L;
    public int M;
    public VelocityTracker N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public final int U;
    public float V;
    public float W;
    public boolean a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f933b;
    public final x b0;

    /* renamed from: c  reason: collision with root package name */
    public final r f934c;
    public a.o.b.n c0;
    public u d;
    public n.b d0;
    public a.o.b.a e;
    public final v e0;
    public a.o.b.b f;
    public p f0;
    public final a.o.b.y g;
    public List<p> g0;
    public boolean h;
    public boolean h0;
    public final Rect i;
    public boolean i0;
    public final Rect j;
    public i.b j0;
    public final RectF k;
    public boolean k0;
    public d l;
    public a.o.b.v l0;
    public l m;
    public g m0;
    public s n;
    public final int[] n0;
    public final ArrayList<k> o;
    public a.h.j.g o0;
    public final ArrayList<o> p;
    public final int[] p0;
    public o q;
    public final int[] q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final List<y> t0;
    public boolean u;
    public Runnable u0;
    public int v;
    public final y.b v0;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = RecyclerView.this.K;
            if (iVar != null) {
                a.o.b.k kVar = (a.o.b.k) iVar;
                boolean z = !kVar.h.isEmpty();
                boolean z2 = !kVar.j.isEmpty();
                boolean z3 = !kVar.k.isEmpty();
                boolean z4 = !kVar.i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<y> it = kVar.h.iterator();
                    while (it.hasNext()) {
                        y next = it.next();
                        View view = next.f970b;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.q.add(next);
                        animate.setDuration(kVar.d).alpha(0.0f).setListener(new a.o.b.f(kVar, next, animate, view)).start();
                    }
                    kVar.h.clear();
                    if (z2) {
                        ArrayList<k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(kVar.j);
                        kVar.m.add(arrayList);
                        kVar.j.clear();
                        a.o.b.c cVar = new a.o.b.c(kVar, arrayList);
                        if (z) {
                            View view2 = arrayList.get(0).f694a.f970b;
                            long j = kVar.d;
                            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                            view2.postOnAnimationDelayed(cVar, j);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList<k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(kVar.k);
                        kVar.n.add(arrayList2);
                        kVar.k.clear();
                        a.o.b.d dVar = new a.o.b.d(kVar, arrayList2);
                        if (z) {
                            View view3 = arrayList2.get(0).f691a.f970b;
                            long j2 = kVar.d;
                            WeakHashMap<View, a.h.j.r> weakHashMap2 = a.h.j.m.f516a;
                            view3.postOnAnimationDelayed(dVar, j2);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList<y> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(kVar.i);
                        kVar.l.add(arrayList3);
                        kVar.i.clear();
                        a.o.b.e eVar = new a.o.b.e(kVar, arrayList3);
                        if (z || z2 || z3) {
                            long j3 = 0;
                            long j4 = z ? kVar.d : 0;
                            long j5 = z2 ? kVar.e : 0;
                            if (z3) {
                                j3 = kVar.f;
                            }
                            View view4 = arrayList3.get(0).f970b;
                            WeakHashMap<View, a.h.j.r> weakHashMap3 = a.h.j.m.f516a;
                            view4.postOnAnimationDelayed(eVar, Math.max(j5, j3) + j4);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.k0 = false;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c implements y.b {
        public c() {
        }

        public void a(y yVar, i.c cVar, i.c cVar2) {
            boolean z;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            yVar.s(false);
            a.o.b.w wVar = (a.o.b.w) recyclerView.K;
            Objects.requireNonNull(wVar);
            if (cVar == null || ((i = cVar.f941a) == (i2 = cVar2.f941a) && cVar.f942b == cVar2.f942b)) {
                a.o.b.k kVar = (a.o.b.k) wVar;
                kVar.n(yVar);
                yVar.f970b.setAlpha(0.0f);
                kVar.i.add(yVar);
                z = true;
            } else {
                z = wVar.i(yVar, i, cVar.f942b, i2, cVar2.f942b);
            }
            if (z) {
                recyclerView.Z();
            }
        }

        public void b(y yVar, i.c cVar, i.c cVar2) {
            boolean z;
            RecyclerView.this.f934c.k(yVar);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.g(yVar);
            yVar.s(false);
            a.o.b.w wVar = (a.o.b.w) recyclerView.K;
            Objects.requireNonNull(wVar);
            int i = cVar.f941a;
            int i2 = cVar.f942b;
            View view = yVar.f970b;
            int left = cVar2 == null ? view.getLeft() : cVar2.f941a;
            int top = cVar2 == null ? view.getTop() : cVar2.f942b;
            if (yVar.l() || (i == left && i2 == top)) {
                a.o.b.k kVar = (a.o.b.k) wVar;
                kVar.n(yVar);
                kVar.h.add(yVar);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = wVar.i(yVar, i, i2, left, top);
            }
            if (z) {
                recyclerView.Z();
            }
        }
    }

    public static abstract class d<VH extends y> {

        /* renamed from: a  reason: collision with root package name */
        public final e f937a = new e();

        public abstract int a();
    }

    public static class e extends Observable<f> {
        public void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((f) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class f {
        public void a() {
        }
    }

    public interface g {
        int a(int i, int i2);
    }

    public static class h {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f938a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f939b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f940c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f941a;

            /* renamed from: b  reason: collision with root package name */
            public int f942b;
        }

        public static int b(y yVar) {
            int i = yVar.k & 14;
            if (yVar.j()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = yVar.e;
            int e2 = yVar.e();
            return (i2 == -1 || e2 == -1 || i2 == e2) ? i : i | 2048;
        }

        public abstract boolean a(y yVar, y yVar2, c cVar, c cVar2);

        public final void c(y yVar) {
            b bVar = this.f938a;
            if (bVar != null) {
                j jVar = (j) bVar;
                Objects.requireNonNull(jVar);
                boolean z = true;
                yVar.s(true);
                if (yVar.i != null && yVar.j == null) {
                    yVar.i = null;
                }
                yVar.j = null;
                if (!((yVar.k & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = yVar.f970b;
                    recyclerView.k0();
                    a.o.b.b bVar2 = recyclerView.f;
                    int indexOfChild = ((a.o.b.t) bVar2.f665a).f723a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.l(view);
                    } else if (bVar2.f666b.d(indexOfChild)) {
                        bVar2.f666b.f(indexOfChild);
                        bVar2.l(view);
                        ((a.o.b.t) bVar2.f665a).c(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        y J = RecyclerView.J(view);
                        recyclerView.f934c.k(J);
                        recyclerView.f934c.h(J);
                    }
                    recyclerView.m0(!z);
                    if (!z && yVar.n()) {
                        RecyclerView.this.removeDetachedView(yVar.f970b, false);
                    }
                }
            }
        }

        public final void d() {
            int size = this.f939b.size();
            for (int i = 0; i < size; i++) {
                this.f939b.get(i).a();
            }
            this.f939b.clear();
        }

        public abstract void e(y yVar);

        public abstract void f();

        public abstract boolean g();

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$y;ILjava/util/List<Ljava/lang/Object;>;)Landroidx/recyclerview/widget/RecyclerView$i$c; */
        public c h(y yVar) {
            c cVar = new c();
            View view = yVar.f970b;
            cVar.f941a = view.getLeft();
            cVar.f942b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    public class j implements i.b {
        public j() {
        }
    }

    public static abstract class k {
        public void d(Rect rect, View view, RecyclerView recyclerView, v vVar) {
            ((m) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView, v vVar) {
        }

        public void f(Canvas canvas, RecyclerView recyclerView, v vVar) {
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public a.o.b.b f944a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f945b;

        /* renamed from: c  reason: collision with root package name */
        public final x.b f946c;
        public final x.b d;
        public a.o.b.x e;
        public a.o.b.x f;
        public boolean g = false;
        public boolean h = false;
        public boolean i = true;
        public boolean j = true;
        public int k;
        public boolean l;
        public int m;
        public int n;
        public int o;
        public int p;

        public class a implements x.b {
            public a() {
            }

            @Override // a.o.b.x.b
            public int a() {
                l lVar = l.this;
                return lVar.o - lVar.J();
            }

            @Override // a.o.b.x.b
            public int b() {
                return l.this.I();
            }

            @Override // a.o.b.x.b
            public int c(View view) {
                Objects.requireNonNull(l.this);
                return view.getRight() + ((m) view.getLayoutParams()).f953b.right + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).rightMargin;
            }

            @Override // a.o.b.x.b
            public int d(View view) {
                Objects.requireNonNull(l.this);
                return (view.getLeft() - ((m) view.getLayoutParams()).f953b.left) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).leftMargin;
            }

            @Override // a.o.b.x.b
            public View e(int i) {
                return l.this.w(i);
            }
        }

        public class b implements x.b {
            public b() {
            }

            @Override // a.o.b.x.b
            public int a() {
                l lVar = l.this;
                return lVar.p - lVar.H();
            }

            @Override // a.o.b.x.b
            public int b() {
                return l.this.K();
            }

            @Override // a.o.b.x.b
            public int c(View view) {
                Objects.requireNonNull(l.this);
                return view.getBottom() + ((m) view.getLayoutParams()).f953b.bottom + ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).bottomMargin;
            }

            @Override // a.o.b.x.b
            public int d(View view) {
                Objects.requireNonNull(l.this);
                return (view.getTop() - ((m) view.getLayoutParams()).f953b.top) - ((ViewGroup.MarginLayoutParams) ((m) view.getLayoutParams())).topMargin;
            }

            @Override // a.o.b.x.b
            public View e(int i) {
                return l.this.w(i);
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f949a;

            /* renamed from: b  reason: collision with root package name */
            public int f950b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f951c;
            public boolean d;
        }

        public l() {
            a aVar = new a();
            this.f946c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new a.o.b.x(aVar);
            this.f = new a.o.b.x(bVar);
        }

        public static d M(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.a.f658a, i2, i3);
            dVar.f949a = obtainStyledAttributes.getInt(0, 1);
            dVar.f950b = obtainStyledAttributes.getInt(9, 1);
            dVar.f951c = obtainStyledAttributes.getBoolean(8, false);
            dVar.d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean S(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public static int g(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        public static int y(int i2, int i3, int i4, int i5, boolean z) {
            int max = Math.max(0, i2 - i4);
            if (z) {
                if (i5 < 0) {
                    if (i5 == -1) {
                        if (i3 != Integer.MIN_VALUE) {
                            if (i3 != 0) {
                            }
                        }
                        i5 = max;
                        return View.MeasureSpec.makeMeasureSpec(i5, i3);
                    }
                    i3 = 0;
                    i5 = 0;
                    return View.MeasureSpec.makeMeasureSpec(i5, i3);
                }
            } else if (i5 < 0) {
                if (i5 != -1) {
                    if (i5 == -2) {
                        if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                            i5 = max;
                            i3 = Integer.MIN_VALUE;
                        } else {
                            i5 = max;
                            i3 = 0;
                        }
                        return View.MeasureSpec.makeMeasureSpec(i5, i3);
                    }
                    i3 = 0;
                    i5 = 0;
                    return View.MeasureSpec.makeMeasureSpec(i5, i3);
                }
                i5 = max;
                return View.MeasureSpec.makeMeasureSpec(i5, i3);
            }
            i3 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }

        public int A(r rVar, v vVar) {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView == null || recyclerView.l == null || !d()) {
                return 1;
            }
            return this.f945b.l.a();
        }

        public void A0(View view, r rVar) {
            a.o.b.b bVar = this.f944a;
            int indexOfChild = ((a.o.b.t) bVar.f665a).f723a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f666b.f(indexOfChild)) {
                    bVar.l(view);
                }
                ((a.o.b.t) bVar.f665a).c(indexOfChild);
            }
            rVar.g(view);
        }

        public int B(View view) {
            Rect rect = ((m) view.getLayoutParams()).f953b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void B0(int i2, r rVar) {
            View w = w(i2);
            C0(i2);
            rVar.g(w);
        }

        public int C(View view) {
            Rect rect = ((m) view.getLayoutParams()).f953b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void C0(int i2) {
            a.o.b.b bVar;
            int f2;
            View a2;
            if (w(i2) != null && (a2 = ((a.o.b.t) bVar.f665a).a((f2 = (bVar = this.f944a).f(i2)))) != null) {
                if (bVar.f666b.f(f2)) {
                    bVar.l(a2);
                }
                ((a.o.b.t) bVar.f665a).c(f2);
            }
        }

        public View D() {
            View focusedChild;
            RecyclerView recyclerView = this.f945b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f944a.f667c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            if (r12 == false) goto L_0x004e;
         */
        public boolean D0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            boolean z3;
            int[] z4 = z(view, rect);
            int i2 = z4[0];
            int i3 = z4[1];
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild != null) {
                    int I = I();
                    int K = K();
                    int J = this.o - J();
                    int H = this.p - H();
                    Rect rect2 = this.f945b.i;
                    RecyclerView.K(focusedChild, rect2);
                    if (rect2.left - i2 < J && rect2.right - i2 > I && rect2.top - i3 < H && rect2.bottom - i3 > K) {
                        z3 = true;
                    }
                }
                z3 = false;
            }
            if (!(i2 == 0 && i3 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i2, i3);
                } else {
                    recyclerView.j0(i2, i3);
                }
                return true;
            }
            return false;
        }

        public int E() {
            RecyclerView recyclerView = this.f945b;
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            return recyclerView.getLayoutDirection();
        }

        public void E0() {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int F() {
            RecyclerView recyclerView = this.f945b;
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            return recyclerView.getMinimumHeight();
        }

        public int F0(int i2, r rVar, v vVar) {
            return 0;
        }

        public int G() {
            RecyclerView recyclerView = this.f945b;
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            return recyclerView.getMinimumWidth();
        }

        public int G0(int i2, r rVar, v vVar) {
            return 0;
        }

        public int H() {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void H0(RecyclerView recyclerView) {
            I0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int I() {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void I0(int i2, int i3) {
            this.o = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.m = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.w0;
            }
            this.p = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.w0;
            }
        }

        public int J() {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void J0(Rect rect, int i2, int i3) {
            int J = J() + I() + rect.width();
            int H = H() + K() + rect.height();
            this.f945b.setMeasuredDimension(g(i2, J, G()), g(i3, H, F()));
        }

        public int K() {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void K0(int i2, int i3) {
            int x = x();
            if (x == 0) {
                this.f945b.o(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < x; i8++) {
                View w = w(i8);
                Rect rect = this.f945b.i;
                RecyclerView.K(w, rect);
                int i9 = rect.left;
                if (i9 < i5) {
                    i5 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i6) {
                    i6 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.f945b.i.set(i5, i6, i4, i7);
            J0(this.f945b.i, i2, i3);
        }

        public int L(View view) {
            return ((m) view.getLayoutParams()).a();
        }

        public void L0(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.f945b = null;
                this.f944a = null;
                i2 = 0;
                this.o = 0;
            } else {
                this.f945b = recyclerView;
                this.f944a = recyclerView.f;
                this.o = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.p = i2;
            this.m = 1073741824;
            this.n = 1073741824;
        }

        public boolean M0(View view, int i2, int i3, m mVar) {
            return view.isLayoutRequested() || !this.i || !S(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) mVar).width) || !S(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) mVar).height);
        }

        public int N(r rVar, v vVar) {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView == null || recyclerView.l == null || !e()) {
                return 1;
            }
            return this.f945b.l.a();
        }

        public boolean N0() {
            return false;
        }

        public int O() {
            return 0;
        }

        public boolean O0(View view, int i2, int i3, m mVar) {
            return !this.i || !S(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) mVar).width) || !S(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) mVar).height);
        }

        public void P(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((m) view.getLayoutParams()).f953b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f945b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f945b.k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean P0() {
            return false;
        }

        public boolean Q() {
            return false;
        }

        public boolean R() {
            return false;
        }

        public boolean T(View view, boolean z) {
            boolean z2 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z2 : !z2;
        }

        public void U(View view, int i2, int i3, int i4, int i5) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f953b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) mVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) mVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) mVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
        }

        public void V(int i2) {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                int e2 = recyclerView.f.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f.d(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public void W(int i2) {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                int e2 = recyclerView.f.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f.d(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public void X() {
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList<Landroid/view/View;>;II)Z */
        public boolean Y() {
            return false;
        }

        public void Z() {
        }

        public void a(View view) {
            b(view, -1, false);
        }

        @Deprecated
        public void a0() {
        }

        public final void b(View view, int i2, boolean z) {
            y J = RecyclerView.J(view);
            if (z || J.l()) {
                this.f945b.g.a(J);
            } else {
                this.f945b.g.f(J);
            }
            m mVar = (m) view.getLayoutParams();
            if (J.u() || J.m()) {
                if (J.m()) {
                    J.o.k(J);
                } else {
                    J.d();
                }
                this.f944a.b(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f945b) {
                int j2 = this.f944a.j(view);
                if (i2 == -1) {
                    i2 = this.f944a.e();
                }
                if (j2 == -1) {
                    StringBuilder d2 = b.a.a.a.a.d("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    d2.append(this.f945b.indexOfChild(view));
                    throw new IllegalStateException(b.a.a.a.a.a(this.f945b, d2));
                } else if (j2 != i2) {
                    l lVar = this.f945b.m;
                    View w = lVar.w(j2);
                    if (w != null) {
                        lVar.w(j2);
                        lVar.q(j2);
                        m mVar2 = (m) w.getLayoutParams();
                        y J2 = RecyclerView.J(w);
                        if (J2.l()) {
                            lVar.f945b.g.a(J2);
                        } else {
                            lVar.f945b.g.f(J2);
                        }
                        lVar.f944a.b(w, i2, mVar2, J2.l());
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j2 + lVar.f945b.toString());
                    }
                }
            } else {
                this.f944a.a(view, i2, false);
                mVar.f954c = true;
            }
            if (mVar.d) {
                J.f970b.invalidate();
                mVar.d = false;
            }
        }

        public void b0(RecyclerView recyclerView, r rVar) {
            a0();
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public View c0(View view, int i2, r rVar, v vVar) {
            return null;
        }

        public boolean d() {
            return false;
        }

        public void d0(AccessibilityEvent accessibilityEvent) {
            r rVar = this.f945b.f934c;
            e0(accessibilityEvent);
        }

        public boolean e() {
            return false;
        }

        public void e0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f945b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f945b.canScrollVertically(-1) && !this.f945b.canScrollHorizontally(-1) && !this.f945b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                d dVar = this.f945b.l;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.a());
                }
            }
        }

        public boolean f(m mVar) {
            return mVar != null;
        }

        public void f0(View view, a.h.j.w.d dVar) {
            y J = RecyclerView.J(view);
            if (J != null && !J.l() && !this.f944a.k(J.f970b)) {
                RecyclerView recyclerView = this.f945b;
                g0(recyclerView.f934c, recyclerView.e0, view, dVar);
            }
        }

        public void g0(r rVar, v vVar, View view, a.h.j.w.d dVar) {
            int i2 = 0;
            int L = e() ? L(view) : 0;
            if (d()) {
                i2 = L(view);
            }
            dVar.g(d.b.a(L, 1, i2, 1, false, false));
        }

        public void h(int i2, int i3, v vVar, c cVar) {
        }

        public View h0() {
            return null;
        }

        public void i(int i2, c cVar) {
        }

        public void i0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int j(v vVar) {
            return 0;
        }

        public void j0(RecyclerView recyclerView) {
        }

        public int k(v vVar) {
            return 0;
        }

        public void k0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public int l(v vVar) {
            return 0;
        }

        public void l0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int m(v vVar) {
            return 0;
        }

        public void m0() {
        }

        public int n(v vVar) {
            return 0;
        }

        public void n0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            m0();
        }

        public int o(v vVar) {
            return 0;
        }

        public void o0(r rVar, v vVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void p(r rVar) {
            for (int x = x() - 1; x >= 0; x--) {
                View w = w(x);
                y J = RecyclerView.J(w);
                if (!J.t()) {
                    if (!J.j() || J.l()) {
                        w(x);
                        q(x);
                        rVar.i(w);
                        this.f945b.g.f(J);
                    } else {
                        Objects.requireNonNull(this.f945b.l);
                        C0(x);
                        rVar.h(J);
                    }
                }
            }
        }

        public void p0(v vVar) {
        }

        public final void q(int i2) {
            this.f944a.c(i2);
        }

        public void q0(int i2, int i3) {
            this.f945b.o(i2, i3);
        }

        public View r(View view) {
            View C;
            RecyclerView recyclerView = this.f945b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f944a.f667c.contains(C)) {
                return null;
            }
            return C;
        }

        @Deprecated
        public boolean r0(RecyclerView recyclerView) {
            return recyclerView.P();
        }

        public View s(int i2) {
            int x = x();
            for (int i3 = 0; i3 < x; i3++) {
                View w = w(i3);
                y J = RecyclerView.J(w);
                if (J != null && J.f() == i2 && !J.t() && (this.f945b.e0.f || !J.l())) {
                    return w;
                }
            }
            return null;
        }

        public boolean s0(RecyclerView recyclerView, View view, View view2) {
            return r0(recyclerView);
        }

        public abstract m t();

        public void t0(Parcelable parcelable) {
        }

        public m u(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public Parcelable u0() {
            return null;
        }

        public m v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public void v0(int i2) {
        }

        public View w(int i2) {
            a.o.b.b bVar = this.f944a;
            if (bVar == null) {
                return null;
            }
            return ((a.o.b.t) bVar.f665a).a(bVar.f(i2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[ADDED_TO_REGION] */
        public boolean w0(int i2) {
            int i3;
            int i4;
            RecyclerView recyclerView = this.f945b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 != 8192) {
                    i3 = 0;
                    i4 = 0;
                } else {
                    i4 = recyclerView.canScrollVertically(-1) ? -((this.p - K()) - H()) : 0;
                    if (this.f945b.canScrollHorizontally(-1)) {
                        i3 = -((this.o - I()) - J());
                    }
                }
                if (i4 != 0 && i3 == 0) {
                    return false;
                }
                this.f945b.j0(i3, i4);
                return true;
            }
            i4 = recyclerView.canScrollVertically(1) ? (this.p - K()) - H() : 0;
            if (this.f945b.canScrollHorizontally(1)) {
                i3 = (this.o - I()) - J();
                if (i4 != 0) {
                }
                this.f945b.j0(i3, i4);
                return true;
            }
            i3 = 0;
            if (i4 != 0) {
            }
            this.f945b.j0(i3, i4);
            return true;
        }

        public int x() {
            a.o.b.b bVar = this.f944a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public boolean x0() {
            return false;
        }

        public void y0(r rVar) {
            for (int x = x() - 1; x >= 0; x--) {
                if (!RecyclerView.J(w(x)).t()) {
                    B0(x, rVar);
                }
            }
        }

        public final int[] z(View view, Rect rect) {
            int[] iArr = new int[2];
            int I = I();
            int K = K();
            int J = this.o - J();
            int H = this.p - H();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - I;
            int min = Math.min(0, i2);
            int i3 = top - K;
            int min2 = Math.min(0, i3);
            int i4 = width - J;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - H);
            if (E() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void z0(r rVar) {
            int size = rVar.f960a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = rVar.f960a.get(i2).f970b;
                y J = RecyclerView.J(view);
                if (!J.t()) {
                    J.s(false);
                    if (J.n()) {
                        this.f945b.removeDetachedView(view, false);
                    }
                    i iVar = this.f945b.K;
                    if (iVar != null) {
                        iVar.e(J);
                    }
                    J.s(true);
                    y J2 = RecyclerView.J(view);
                    J2.o = null;
                    J2.p = false;
                    J2.d();
                    rVar.h(J2);
                }
            }
            rVar.f960a.clear();
            ArrayList<y> arrayList = rVar.f961b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f945b.invalidate();
            }
        }
    }

    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public y f952a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f953b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f954c = true;
        public boolean d = false;

        public m(int i, int i2) {
            super(i, i2);
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public m(m mVar) {
            super((ViewGroup.LayoutParams) mVar);
        }

        public int a() {
            return this.f952a.f();
        }

        public boolean b() {
            return this.f952a.o();
        }

        public boolean c() {
            return this.f952a.l();
        }
    }

    public static abstract class n {
    }

    public interface o {
        void a(boolean z);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class p {
        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class q {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f955a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f956b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<y> f957a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f958b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f959c = 0;
            public long d = 0;
        }

        public final a a(int i) {
            a aVar = this.f955a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f955a.put(i, aVar2);
            return aVar2;
        }

        public long b(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    public final class r {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<y> f960a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<y> f961b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<y> f962c = new ArrayList<>();
        public final List<y> d;
        public int e;
        public int f;
        public q g;

        public r() {
            ArrayList<y> arrayList = new ArrayList<>();
            this.f960a = arrayList;
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void a(y yVar, boolean z) {
            RecyclerView.k(yVar);
            if (yVar.h(16384)) {
                yVar.r(0, 16384);
                a.h.j.m.g(yVar.f970b, null);
            }
            if (z) {
                s sVar = RecyclerView.this.n;
                if (sVar != null) {
                    sVar.a(yVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                d dVar = recyclerView.l;
                if (recyclerView.e0 != null) {
                    recyclerView.g.g(yVar);
                }
            }
            yVar.s = null;
            q d2 = d();
            Objects.requireNonNull(d2);
            int i = yVar.g;
            ArrayList<y> arrayList = d2.a(i).f957a;
            if (d2.f955a.get(i).f958b > arrayList.size()) {
                yVar.q();
                arrayList.add(yVar);
            }
        }

        public void b() {
            this.f960a.clear();
            e();
        }

        public int c(int i) {
            if (i < 0 || i >= RecyclerView.this.e0.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State ");
                sb.append("item count is ");
                sb.append(RecyclerView.this.e0.b());
                throw new IndexOutOfBoundsException(b.a.a.a.a.a(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.e0.f) {
                return i;
            }
            return recyclerView.e.f(i, 0);
        }

        public q d() {
            if (this.g == null) {
                this.g = new q();
            }
            return this.g;
        }

        public void e() {
            for (int size = this.f962c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f962c.clear();
            int[] iArr = RecyclerView.w0;
            n.b bVar = RecyclerView.this.d0;
            int[] iArr2 = bVar.f712c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.d = 0;
        }

        public void f(int i) {
            a(this.f962c.get(i), true);
            this.f962c.remove(i);
        }

        public void g(View view) {
            y J = RecyclerView.J(view);
            if (J.n()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (J.m()) {
                J.o.k(J);
            } else if (J.u()) {
                J.d();
            }
            h(J);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
        public void h(y yVar) {
            boolean z;
            d dVar;
            boolean z2;
            boolean z3;
            boolean z4 = false;
            if (yVar.m() || yVar.f970b.getParent() != null) {
                StringBuilder d2 = b.a.a.a.a.d("Scrapped or attached views may not be recycled. isScrap:");
                d2.append(yVar.m());
                d2.append(" isAttached:");
                if (yVar.f970b.getParent() != null) {
                    z4 = true;
                }
                d2.append(z4);
                throw new IllegalArgumentException(b.a.a.a.a.a(RecyclerView.this, d2));
            } else if (yVar.n()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(yVar);
                throw new IllegalArgumentException(b.a.a.a.a.a(RecyclerView.this, sb));
            } else if (!yVar.t()) {
                if ((yVar.k & 16) == 0) {
                    View view = yVar.f970b;
                    WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                    if (view.hasTransientState()) {
                        z = true;
                        dVar = RecyclerView.this.l;
                        if (dVar != null && z) {
                            Objects.requireNonNull(dVar);
                        }
                        if (!yVar.k()) {
                            if (this.f <= 0 || yVar.h(526)) {
                                z3 = false;
                            } else {
                                int size = this.f962c.size();
                                if (size >= this.f && size > 0) {
                                    f(0);
                                    size--;
                                }
                                int[] iArr = RecyclerView.w0;
                                if (size > 0 && !RecyclerView.this.d0.c(yVar.d)) {
                                    do {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                    } while (RecyclerView.this.d0.c(this.f962c.get(size).d));
                                    size++;
                                }
                                this.f962c.add(size, yVar);
                                z3 = true;
                            }
                            if (!z3) {
                                a(yVar, true);
                                z4 = true;
                            }
                            z2 = z4;
                            z4 = z3;
                        } else {
                            z2 = false;
                        }
                        RecyclerView.this.g.g(yVar);
                        if (!z4 && !z2 && z) {
                            yVar.s = null;
                            return;
                        }
                        return;
                    }
                }
                z = false;
                dVar = RecyclerView.this.l;
                Objects.requireNonNull(dVar);
                if (!yVar.k()) {
                }
                RecyclerView.this.g.g(yVar);
                if (!z4) {
                }
            } else {
                throw new IllegalArgumentException(b.a.a.a.a.a(RecyclerView.this, b.a.a.a.a.d("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        public void i(View view) {
            ArrayList<y> arrayList;
            boolean z;
            boolean z2;
            y J = RecyclerView.J(view);
            if (!J.h(12) && J.o()) {
                i iVar = RecyclerView.this.K;
                if (iVar != null) {
                    a.o.b.k kVar = (a.o.b.k) iVar;
                    if (J.g().isEmpty()) {
                        if (!(!kVar.g || J.j())) {
                            z2 = false;
                            if (!z2) {
                                z = false;
                                if (!z) {
                                    if (this.f961b == null) {
                                        this.f961b = new ArrayList<>();
                                    }
                                    J.o = this;
                                    J.p = true;
                                    arrayList = this.f961b;
                                    arrayList.add(J);
                                    return;
                                }
                            }
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                }
                z = true;
                if (!z) {
                }
            }
            if (!J.j() || J.l()) {
                J.o = this;
                J.p = false;
                arrayList = this.f960a;
                arrayList.add(J);
                return;
            }
            Objects.requireNonNull(RecyclerView.this.l);
            throw new IllegalArgumentException(b.a.a.a.a.a(RecyclerView.this, b.a.a.a.a.d("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0362, code lost:
            if (r8.j() == false) goto L_0x0393;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0391, code lost:
            if ((r9 == 0 || r9 + r11 < r18) == false) goto L_0x0393;
         */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0201  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0329  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x0353  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x037a  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x03e7  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0416  */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x0444  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x044f  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x0456  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
        public y j(int i, boolean z, long j) {
            y yVar;
            boolean z2;
            boolean z3;
            ViewGroup.LayoutParams layoutParams;
            m mVar;
            ViewGroup.LayoutParams layoutParams2;
            List<Object> list;
            ViewGroup.LayoutParams layoutParams3;
            AccessibilityManager accessibilityManager;
            View view;
            boolean z4;
            y yVar2;
            int size;
            if (i < 0 || i >= RecyclerView.this.e0.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid item position ");
                sb.append(i);
                sb.append("(");
                sb.append(i);
                sb.append("). Item count:");
                sb.append(RecyclerView.this.e0.b());
                throw new IndexOutOfBoundsException(b.a.a.a.a.a(RecyclerView.this, sb));
            }
            boolean z5 = false;
            if (RecyclerView.this.e0.f) {
                ArrayList<y> arrayList = this.f961b;
                if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                    for (int i2 = 0; i2 < size; i2++) {
                        yVar = this.f961b.get(i2);
                        if (!yVar.u() && yVar.f() == i) {
                            yVar.b(32);
                            break;
                        }
                    }
                    Objects.requireNonNull(RecyclerView.this.l);
                }
                yVar = null;
                if (yVar != null) {
                    z2 = true;
                    if (yVar == null) {
                        int size2 = this.f960a.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                if (!z) {
                                    a.o.b.b bVar = RecyclerView.this.f;
                                    int size3 = bVar.f667c.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size3) {
                                            view = null;
                                            break;
                                        }
                                        view = bVar.f667c.get(i4);
                                        Objects.requireNonNull((a.o.b.t) bVar.f665a);
                                        y J = RecyclerView.J(view);
                                        if (!(J.f() != i || J.j() || J.l())) {
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (view != null) {
                                        y J2 = RecyclerView.J(view);
                                        a.o.b.b bVar2 = RecyclerView.this.f;
                                        int indexOfChild = ((a.o.b.t) bVar2.f665a).f723a.indexOfChild(view);
                                        if (indexOfChild < 0) {
                                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                                        } else if (bVar2.f666b.d(indexOfChild)) {
                                            bVar2.f666b.a(indexOfChild);
                                            bVar2.l(view);
                                            int j2 = RecyclerView.this.f.j(view);
                                            if (j2 != -1) {
                                                RecyclerView.this.f.c(j2);
                                                i(view);
                                                J2.b(8224);
                                                yVar = J2;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("layout index should not be -1 after unhiding a view:");
                                                sb2.append(J2);
                                                throw new IllegalStateException(b.a.a.a.a.a(RecyclerView.this, sb2));
                                            }
                                        } else {
                                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                        }
                                    }
                                }
                                int size4 = this.f962c.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size4) {
                                        yVar = null;
                                        break;
                                    }
                                    y yVar3 = this.f962c.get(i5);
                                    if (yVar3.j() || yVar3.f() != i) {
                                        i5++;
                                    } else {
                                        if (!z) {
                                            this.f962c.remove(i5);
                                        }
                                        yVar = yVar3;
                                    }
                                }
                            } else {
                                yVar2 = this.f960a.get(i3);
                                if (yVar2.u() || yVar2.f() != i || yVar2.j() || (!RecyclerView.this.e0.f && yVar2.l())) {
                                    i3++;
                                }
                            }
                        }
                        yVar2.b(32);
                        yVar = yVar2;
                        if (yVar != null) {
                            if (yVar.l()) {
                                z4 = RecyclerView.this.e0.f;
                            } else {
                                int i6 = yVar.d;
                                if (i6 < 0 || i6 >= RecyclerView.this.l.a()) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Inconsistency detected. Invalid view holder adapter position");
                                    sb3.append(yVar);
                                    throw new IndexOutOfBoundsException(b.a.a.a.a.a(RecyclerView.this, sb3));
                                }
                                RecyclerView recyclerView = RecyclerView.this;
                                if (!recyclerView.e0.f) {
                                    Objects.requireNonNull(recyclerView.l);
                                    if (yVar.g != 0) {
                                        z4 = false;
                                    }
                                }
                                Objects.requireNonNull(RecyclerView.this.l);
                                z4 = true;
                            }
                            if (!z4) {
                                if (!z) {
                                    yVar.b(4);
                                    if (yVar.m()) {
                                        RecyclerView.this.removeDetachedView(yVar.f970b, false);
                                        yVar.o.k(yVar);
                                    } else if (yVar.u()) {
                                        yVar.d();
                                    }
                                    h(yVar);
                                }
                                yVar = null;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    if (yVar == null) {
                        int f2 = RecyclerView.this.e.f(i, 0);
                        if (f2 < 0 || f2 >= RecyclerView.this.l.a()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Inconsistency detected. Invalid item position ");
                            sb4.append(i);
                            sb4.append("(offset:");
                            sb4.append(f2);
                            sb4.append(").");
                            sb4.append("state:");
                            sb4.append(RecyclerView.this.e0.b());
                            throw new IndexOutOfBoundsException(b.a.a.a.a.a(RecyclerView.this, sb4));
                        }
                        Objects.requireNonNull(RecyclerView.this.l);
                        Objects.requireNonNull(RecyclerView.this.l);
                        if (yVar == null) {
                            q.a aVar = d().f955a.get(0);
                            if (aVar == null || aVar.f957a.isEmpty()) {
                                yVar = null;
                            } else {
                                ArrayList<y> arrayList2 = aVar.f957a;
                                yVar = arrayList2.remove(arrayList2.size() - 1);
                            }
                            if (yVar != null) {
                                yVar.q();
                                int[] iArr = RecyclerView.w0;
                            }
                        }
                        if (yVar == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j3 = this.g.a(0).f959c;
                                if (!(j3 == 0 || j3 + nanoTime < j)) {
                                    return null;
                                }
                            }
                            RecyclerView recyclerView2 = RecyclerView.this;
                            d dVar = recyclerView2.l;
                            Objects.requireNonNull(dVar);
                            try {
                                int i7 = a.h.f.a.f462a;
                                Trace.beginSection("RV CreateView");
                                c.a.a.a aVar2 = (c.a.a.a) dVar;
                                View inflate = aVar2.f1086c.inflate(R.layout.filelist_row, (ViewGroup) recyclerView2, false);
                                a.b bVar3 = new a.b(inflate);
                                if (inflate.getParent() == null) {
                                    bVar3.g = 0;
                                    Trace.endSection();
                                    int[] iArr2 = RecyclerView.w0;
                                    RecyclerView E = RecyclerView.E(bVar3.f970b);
                                    if (E != null) {
                                        bVar3.f971c = new WeakReference<>(E);
                                    }
                                    long nanoTime2 = RecyclerView.this.getNanoTime();
                                    q qVar = this.g;
                                    long j4 = nanoTime2 - nanoTime;
                                    q.a a2 = qVar.a(0);
                                    a2.f959c = qVar.b(a2.f959c, j4);
                                    yVar = bVar3;
                                } else {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                            } catch (Throwable th) {
                                int i8 = a.h.f.a.f462a;
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                    if (z2 && !RecyclerView.this.e0.f && yVar.h(8192)) {
                        yVar.r(0, 8192);
                        if (RecyclerView.this.e0.i) {
                            i.b(yVar);
                            i iVar = RecyclerView.this.K;
                            yVar.g();
                            RecyclerView.this.c0(yVar, iVar.h(yVar));
                        }
                    }
                    if (RecyclerView.this.e0.f || !yVar.i()) {
                        if (yVar.i()) {
                            if (!((yVar.k & 2) != 0)) {
                            }
                        }
                        int f3 = RecyclerView.this.e.f(i, 0);
                        RecyclerView recyclerView3 = RecyclerView.this;
                        yVar.s = recyclerView3;
                        int i9 = yVar.g;
                        long nanoTime3 = recyclerView3.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j5 = this.g.a(i9).d;
                        }
                        d dVar2 = RecyclerView.this.l;
                        Objects.requireNonNull(dVar2);
                        yVar.d = f3;
                        yVar.r(1, 519);
                        int i10 = a.h.f.a.f462a;
                        Trace.beginSection("RV OnBindView");
                        yVar.g();
                        yVar.u.setText(b.b.a.a.a.a(((c.a.a.a) dVar2).f1085b.get(f3).getName().replace("_", " ")));
                        list = yVar.l;
                        if (list != null) {
                            list.clear();
                        }
                        yVar.k &= -1025;
                        layoutParams3 = yVar.f970b.getLayoutParams();
                        if (layoutParams3 instanceof m) {
                            ((m) layoutParams3).f954c = true;
                        }
                        Trace.endSection();
                        long nanoTime4 = RecyclerView.this.getNanoTime();
                        q qVar2 = this.g;
                        q.a a3 = qVar2.a(yVar.g);
                        a3.d = qVar2.b(a3.d, nanoTime4 - nanoTime3);
                        accessibilityManager = RecyclerView.this.A;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            View view2 = yVar.f970b;
                            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                            if (view2.getImportantForAccessibility() == 0) {
                                view2.setImportantForAccessibility(1);
                            }
                            if (!(a.h.j.m.c(view2) != null)) {
                                yVar.b(16384);
                                a.h.j.m.g(view2, RecyclerView.this.l0.e);
                            }
                        }
                        if (RecyclerView.this.e0.f) {
                            yVar.h = i;
                        }
                        z3 = true;
                        layoutParams = yVar.f970b.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams2 = RecyclerView.this.generateDefaultLayoutParams();
                        } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                            layoutParams2 = RecyclerView.this.generateLayoutParams(layoutParams);
                        } else {
                            mVar = (m) layoutParams;
                            mVar.f952a = yVar;
                            if (z2 && z3) {
                                z5 = true;
                            }
                            mVar.d = z5;
                            return yVar;
                        }
                        mVar = (m) layoutParams2;
                        yVar.f970b.setLayoutParams(mVar);
                        mVar.f952a = yVar;
                        z5 = true;
                        mVar.d = z5;
                        return yVar;
                    }
                    yVar.h = i;
                    z3 = false;
                    layoutParams = yVar.f970b.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    mVar = (m) layoutParams2;
                    yVar.f970b.setLayoutParams(mVar);
                    mVar.f952a = yVar;
                    z5 = true;
                    mVar.d = z5;
                    return yVar;
                }
            } else {
                yVar = null;
            }
            z2 = false;
            if (yVar == null) {
            }
            if (yVar == null) {
            }
            yVar.r(0, 8192);
            if (RecyclerView.this.e0.i) {
            }
            if (RecyclerView.this.e0.f) {
            }
            if (yVar.i()) {
            }
            int f32 = RecyclerView.this.e.f(i, 0);
            RecyclerView recyclerView32 = RecyclerView.this;
            yVar.s = recyclerView32;
            int i92 = yVar.g;
            long nanoTime32 = recyclerView32.getNanoTime();
            if (j != Long.MAX_VALUE) {
            }
            d dVar22 = RecyclerView.this.l;
            Objects.requireNonNull(dVar22);
            yVar.d = f32;
            yVar.r(1, 519);
            int i102 = a.h.f.a.f462a;
            Trace.beginSection("RV OnBindView");
            yVar.g();
            yVar.u.setText(b.b.a.a.a.a(((c.a.a.a) dVar22).f1085b.get(f32).getName().replace("_", " ")));
            list = yVar.l;
            if (list != null) {
            }
            yVar.k &= -1025;
            layoutParams3 = yVar.f970b.getLayoutParams();
            if (layoutParams3 instanceof m) {
            }
            Trace.endSection();
            long nanoTime42 = RecyclerView.this.getNanoTime();
            q qVar22 = this.g;
            q.a a32 = qVar22.a(yVar.g);
            a32.d = qVar22.b(a32.d, nanoTime42 - nanoTime32);
            accessibilityManager = RecyclerView.this.A;
            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
            }
            if (RecyclerView.this.e0.f) {
            }
            z3 = true;
            layoutParams = yVar.f970b.getLayoutParams();
            if (layoutParams == null) {
            }
            mVar = (m) layoutParams2;
            yVar.f970b.setLayoutParams(mVar);
            mVar.f952a = yVar;
            z5 = true;
            mVar.d = z5;
            return yVar;
        }

        public void k(y yVar) {
            (yVar.p ? this.f961b : this.f960a).remove(yVar);
            yVar.o = null;
            yVar.p = false;
            yVar.d();
        }

        public void l() {
            l lVar = RecyclerView.this.m;
            this.f = this.e + (lVar != null ? lVar.k : 0);
            for (int size = this.f962c.size() - 1; size >= 0 && this.f962c.size() > this.f; size--) {
                f(size);
            }
        }
    }

    public interface s {
        void a(y yVar);
    }

    public class t extends f {
        public t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void a() {
            RecyclerView.this.i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.e0.e = true;
            recyclerView.b0(true);
            if (!RecyclerView.this.e.g()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    public static class u extends a.j.a.a {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f964c;

        public static class a implements Parcelable.ClassLoaderCreator<u> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new u(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new u[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public u createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new u(parcel, classLoader);
            }
        }

        public u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f964c = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public u(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f567a, i);
            parcel.writeParcelable(this.f964c, 0);
        }
    }

    public static class v {

        /* renamed from: a  reason: collision with root package name */
        public int f965a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f966b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f967c = 1;
        public int d = 0;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public int k;
        public long l;
        public int m;

        public void a(int i2) {
            if ((this.f967c & i2) == 0) {
                StringBuilder d2 = b.a.a.a.a.d("Layout state should be one of ");
                d2.append(Integer.toBinaryString(i2));
                d2.append(" but it is ");
                d2.append(Integer.toBinaryString(this.f967c));
                throw new IllegalStateException(d2.toString());
            }
        }

        public int b() {
            return this.f ? this.f965a - this.f966b : this.d;
        }

        public String toString() {
            return "State{mTargetPosition=" + -1 + ", mData=" + ((Object) null) + ", mItemCount=" + this.d + ", mIsMeasuring=" + this.h + ", mPreviousLayoutItemCount=" + this.f965a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f966b + ", mStructureChanged=" + this.e + ", mInPreLayout=" + this.f + ", mRunSimpleAnimations=" + this.i + ", mRunPredictiveAnimations=" + this.j + '}';
        }
    }

    public static abstract class w {
    }

    public class x implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public int f968b;

        /* renamed from: c  reason: collision with root package name */
        public int f969c;
        public OverScroller d;
        public Interpolator e;
        public boolean f = false;
        public boolean g = false;

        public x() {
            Interpolator interpolator = RecyclerView.z0;
            this.e = interpolator;
            this.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f) {
                this.g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            recyclerView.postOnAnimation(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
            if (r7 > 0) goto L_0x00bf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.m == null) {
                recyclerView.removeCallbacks(this);
                this.d.abortAnimation();
                return;
            }
            boolean z = false;
            this.g = false;
            this.f = true;
            recyclerView.n();
            OverScroller overScroller = this.d;
            Objects.requireNonNull(RecyclerView.this.m);
            if (overScroller.computeScrollOffset()) {
                int[] iArr = RecyclerView.this.q0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f968b;
                int i7 = currY - this.f969c;
                this.f968b = currX;
                this.f969c = currY;
                if (RecyclerView.this.t(i6, i7, iArr, null, 1)) {
                    i6 -= iArr[0];
                    i7 -= iArr[1];
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                if (recyclerView2.l != null) {
                    recyclerView2.h0(i6, i7, recyclerView2.s0);
                    int[] iArr2 = RecyclerView.this.s0;
                    i3 = iArr2[0];
                    i4 = iArr2[1];
                    i2 = i6 - i3;
                    i = i7 - i4;
                } else {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i6, i7);
                }
                if (!RecyclerView.this.u(i3, i4, i2, i, null, 1) && !(i2 == 0 && i == 0)) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i2 != currX) {
                        if (i2 < 0) {
                            i5 = -currVelocity;
                        } else if (i2 > 0) {
                            i5 = currVelocity;
                        }
                        if (i != currY) {
                            if (i < 0) {
                                currVelocity = -currVelocity;
                            }
                            if (RecyclerView.this.getOverScrollMode() != 2) {
                                RecyclerView recyclerView3 = RecyclerView.this;
                                Objects.requireNonNull(recyclerView3);
                                if (i5 < 0) {
                                    recyclerView3.x();
                                    recyclerView3.G.onAbsorb(-i5);
                                } else if (i5 > 0) {
                                    recyclerView3.y();
                                    recyclerView3.I.onAbsorb(i5);
                                }
                                if (currVelocity < 0) {
                                    recyclerView3.z();
                                    recyclerView3.H.onAbsorb(-currVelocity);
                                } else if (currVelocity > 0) {
                                    recyclerView3.w();
                                    recyclerView3.J.onAbsorb(currVelocity);
                                }
                                if (!(i5 == 0 && currVelocity == 0)) {
                                    WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                                    recyclerView3.postInvalidateOnAnimation();
                                }
                            }
                            if ((i5 != 0 || i2 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i == currY || overScroller.getFinalY() == 0)) {
                                overScroller.abortAnimation();
                            }
                        }
                        currVelocity = 0;
                        if (RecyclerView.this.getOverScrollMode() != 2) {
                        }
                        overScroller.abortAnimation();
                    }
                    i5 = 0;
                    if (i != currY) {
                    }
                    currVelocity = 0;
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                    }
                    overScroller.abortAnimation();
                }
                if (!(i3 == 0 && i4 == 0)) {
                    RecyclerView.this.v(i3, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = (i6 == 0 && i7 == 0) || (i6 != 0 && RecyclerView.this.m.d() && i3 == i6) || (i7 != 0 && RecyclerView.this.m.e() && i4 == i7);
                if (overScroller.isFinished() || (!z2 && !RecyclerView.this.M(1))) {
                    z = false;
                    RecyclerView.this.setScrollState(0);
                    int[] iArr3 = RecyclerView.w0;
                    n.b bVar = RecyclerView.this.d0;
                    int[] iArr4 = bVar.f712c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    bVar.d = 0;
                    RecyclerView.this.a(1);
                } else {
                    a();
                    RecyclerView recyclerView4 = RecyclerView.this;
                    a.o.b.n nVar = recyclerView4.c0;
                    if (nVar != null) {
                        nVar.a(recyclerView4, i6, i7);
                    }
                    z = false;
                }
            }
            this.f = z;
            if (this.g) {
                a();
            }
        }
    }

    public static abstract class y {
        public static final List<Object> t = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public final View f970b;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<RecyclerView> f971c;
        public int d = -1;
        public int e = -1;
        public long f = -1;
        public int g = -1;
        public int h = -1;
        public y i = null;
        public y j = null;
        public int k;
        public List<Object> l = null;
        public List<Object> m = null;
        public int n = 0;
        public r o = null;
        public boolean p = false;
        public int q = 0;
        public int r = -1;
        public RecyclerView s;

        public y(View view) {
            if (view != null) {
                this.f970b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.k) == 0) {
                if (this.l == null) {
                    ArrayList arrayList = new ArrayList();
                    this.l = arrayList;
                    this.m = Collections.unmodifiableList(arrayList);
                }
                this.l.add(obj);
            }
        }

        public void b(int i2) {
            this.k = i2 | this.k;
        }

        public void c() {
            this.e = -1;
            this.h = -1;
        }

        public void d() {
            this.k &= -33;
        }

        public final int e() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.G(this);
        }

        public final int f() {
            int i2 = this.h;
            return i2 == -1 ? this.d : i2;
        }

        public List<Object> g() {
            if ((this.k & 1024) != 0) {
                return t;
            }
            List<Object> list = this.l;
            return (list == null || list.size() == 0) ? t : this.m;
        }

        public boolean h(int i2) {
            return (i2 & this.k) != 0;
        }

        public boolean i() {
            return (this.k & 1) != 0;
        }

        public boolean j() {
            return (this.k & 4) != 0;
        }

        public final boolean k() {
            if ((this.k & 16) == 0) {
                View view = this.f970b;
                WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean l() {
            return (this.k & 8) != 0;
        }

        public boolean m() {
            return this.o != null;
        }

        public boolean n() {
            return (this.k & 256) != 0;
        }

        public boolean o() {
            return (this.k & 2) != 0;
        }

        public void p(int i2, boolean z) {
            if (this.e == -1) {
                this.e = this.d;
            }
            if (this.h == -1) {
                this.h = this.d;
            }
            if (z) {
                this.h += i2;
            }
            this.d += i2;
            if (this.f970b.getLayoutParams() != null) {
                ((m) this.f970b.getLayoutParams()).f954c = true;
            }
        }

        public void q() {
            this.k = 0;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.h = -1;
            this.n = 0;
            this.i = null;
            this.j = null;
            List<Object> list = this.l;
            if (list != null) {
                list.clear();
            }
            this.k &= -1025;
            this.q = 0;
            this.r = -1;
            RecyclerView.k(this);
        }

        public void r(int i2, int i3) {
            this.k = (i2 & i3) | (this.k & (~i3));
        }

        public final void s(boolean z) {
            int i2;
            int i3 = this.n;
            int i4 = z ? i3 - 1 : i3 + 1;
            this.n = i4;
            if (i4 < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i4 == 1) {
                i2 = this.k | 16;
            } else if (z && i4 == 0) {
                i2 = this.k & -17;
            } else {
                return;
            }
            this.k = i2;
        }

        public boolean t() {
            return (this.k & 128) != 0;
        }

        public String toString() {
            StringBuilder d2 = b.a.a.a.a.d("ViewHolder{");
            d2.append(Integer.toHexString(hashCode()));
            d2.append(" position=");
            d2.append(this.d);
            d2.append(" id=");
            d2.append(this.f);
            d2.append(", oldPos=");
            d2.append(this.e);
            d2.append(", pLpos:");
            d2.append(this.h);
            StringBuilder sb = new StringBuilder(d2.toString());
            if (m()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (j()) {
                sb.append(" invalid");
            }
            if (!i()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.k & 2) != 0) {
                sb.append(" update");
            }
            if (l()) {
                sb.append(" removed");
            }
            if (t()) {
                sb.append(" ignored");
            }
            if (n()) {
                sb.append(" tmpDetached");
            }
            if (!k()) {
                StringBuilder d3 = b.a.a.a.a.d(" not recyclable(");
                d3.append(this.n);
                d3.append(")");
                sb.append(d3.toString());
            }
            if ((this.k & 512) == 0 && !j()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.f970b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.k & 32) != 0;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        y0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        char c2;
        TypedArray typedArray;
        StringBuilder sb;
        Constructor<? extends U> constructor;
        this.f933b = new t();
        this.f934c = new r();
        this.g = new a.o.b.y();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new RectF();
        this.o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.v = 0;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.F = new h();
        this.K = new a.o.b.k();
        this.L = 0;
        this.M = -1;
        this.V = Float.MIN_VALUE;
        this.W = Float.MIN_VALUE;
        boolean z2 = true;
        this.a0 = true;
        this.b0 = new x();
        this.d0 = new n.b();
        this.e0 = new v();
        this.h0 = false;
        this.i0 = false;
        this.j0 = new j();
        this.k0 = false;
        this.n0 = new int[2];
        this.p0 = new int[2];
        this.q0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new ArrayList();
        this.u0 = new a();
        this.v0 = new c();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0, i2, 0);
            this.h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.S = viewConfiguration.getScaledTouchSlop();
        this.V = viewConfiguration.getScaledHorizontalScrollFactor();
        this.W = viewConfiguration.getScaledVerticalScrollFactor();
        this.T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.K.f938a = this.j0;
        this.e = new a.o.b.a(new a.o.b.u(this));
        this.f = new a.o.b.b(new a.o.b.t(this));
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        if (getImportantForAutofill() == 0) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a.o.b.v(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.o.a.f658a, i2, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(2, false);
            this.t = z3;
            int i3 = 4;
            if (z3) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException(b.a.a.a.a.a(this, b.a.a.a.a.d("Trying to set fast scroller without both required drawables.")));
                }
                Resources resources = getContext().getResources();
                c2 = 3;
                typedArray = obtainStyledAttributes2;
                new a.o.b.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
                i3 = 4;
            } else {
                c2 = 3;
                typedArray = obtainStyledAttributes2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(trim);
                        trim = sb.toString();
                    } else if (!trim.contains(".")) {
                        sb = new StringBuilder();
                        sb.append(RecyclerView.class.getPackage().getName());
                        sb.append('.');
                        sb.append(trim);
                        trim = sb.toString();
                    }
                    try {
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(trim).asSubclass(l.class);
                        Object[] objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(y0);
                            Object[] objArr2 = new Object[i3];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[2] = Integer.valueOf(i2);
                            objArr2[c2] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((l) constructor.newInstance(objArr));
                    } catch (ClassNotFoundException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                    } catch (InvocationTargetException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                    } catch (InstantiationException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                    } catch (ClassCastException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e8);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, w0, i2, 0);
            z2 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView E2 = E(viewGroup.getChildAt(i2));
            if (E2 != null) {
                return E2;
            }
        }
        return null;
    }

    public static y J(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f952a;
    }

    public static void K(View view, Rect rect) {
        m mVar = (m) view.getLayoutParams();
        Rect rect2 = mVar.f953b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin);
    }

    private a.h.j.g getScrollingChildHelper() {
        if (this.o0 == null) {
            this.o0 = new a.h.j.g(this);
        }
        return this.o0;
    }

    public static void k(y yVar) {
        WeakReference<RecyclerView> weakReference = yVar.f971c;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                View view = (View) viewParent;
                while (true) {
                    if (view == null) {
                        yVar.f971c = null;
                        return;
                    } else if (view != yVar.f970b) {
                        viewParent = view.getParent();
                        if (!(viewParent instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public String A() {
        StringBuilder d2 = b.a.a.a.a.d(" ");
        d2.append(super.toString());
        d2.append(", adapter:");
        d2.append(this.l);
        d2.append(", layout:");
        d2.append(this.m);
        d2.append(", context:");
        d2.append(getContext());
        return d2.toString();
    }

    public final void B(v vVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.b0.d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(vVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(vVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public View C(View view) {
        ViewParent parent;
        while (true) {
            parent = view.getParent();
            if (parent != null && parent != this && (parent instanceof View)) {
                view = (View) parent;
            } else if (parent != this) {
                return view;
            } else {
                return null;
            }
        }
        if (parent != this) {
        }
    }

    public final void D(int[] iArr) {
        int e2 = this.f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            y J2 = J(this.f.d(i4));
            if (!J2.t()) {
                int f2 = J2.f();
                if (f2 < i2) {
                    i2 = f2;
                }
                if (f2 > i3) {
                    i3 = f2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public y F(int i2) {
        y yVar = null;
        if (this.B) {
            return null;
        }
        int h2 = this.f.h();
        for (int i3 = 0; i3 < h2; i3++) {
            y J2 = J(this.f.g(i3));
            if (J2 != null && !J2.l() && G(J2) == i2) {
                if (!this.f.k(J2.f970b)) {
                    return J2;
                }
                yVar = J2;
            }
        }
        return yVar;
    }

    public int G(y yVar) {
        if (!yVar.h(524) && yVar.i()) {
            a.o.b.a aVar = this.e;
            int i2 = yVar.d;
            int size = aVar.f660b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.f660b.get(i3);
                int i4 = bVar.f662a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.f663b;
                        if (i5 <= i2) {
                            int i6 = bVar.d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.f663b;
                        if (i7 == i2) {
                            i2 = bVar.d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.f663b <= i2) {
                    i2 += bVar.d;
                }
            }
            return i2;
        }
        return -1;
    }

    public long H(y yVar) {
        Objects.requireNonNull(this.l);
        return (long) yVar.d;
    }

    public y I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public Rect L(View view) {
        m mVar = (m) view.getLayoutParams();
        if (!mVar.f954c) {
            return mVar.f953b;
        }
        if (this.e0.f && (mVar.b() || mVar.f952a.j())) {
            return mVar.f953b;
        }
        Rect rect = mVar.f953b;
        rect.set(0, 0, 0, 0);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.set(0, 0, 0, 0);
            this.o.get(i2).d(this.i, view, this, this.e0);
            int i3 = rect.left;
            Rect rect2 = this.i;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f954c = false;
        return rect;
    }

    public boolean M(int i2) {
        return getScrollingChildHelper().f(i2) != null;
    }

    public boolean N() {
        return !this.u || this.B || this.e.g();
    }

    public void O() {
        this.J = null;
        this.H = null;
        this.I = null;
        this.G = null;
    }

    public boolean P() {
        return this.D > 0;
    }

    public void Q() {
        int h2 = this.f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((m) this.f.g(i2).getLayoutParams()).f954c = true;
        }
        r rVar = this.f934c;
        int size = rVar.f962c.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) rVar.f962c.get(i3).f970b.getLayoutParams();
            if (mVar != null) {
                mVar.f954c = true;
            }
        }
    }

    public void R(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f.h();
        for (int i5 = 0; i5 < h2; i5++) {
            y J2 = J(this.f.g(i5));
            if (J2 != null && !J2.t()) {
                int i6 = J2.d;
                if (i6 >= i4) {
                    J2.p(-i3, z2);
                } else if (i6 >= i2) {
                    J2.b(8);
                    J2.p(-i3, z2);
                    J2.d = i2 - 1;
                }
                this.e0.e = true;
            }
        }
        r rVar = this.f934c;
        int size = rVar.f962c.size();
        while (true) {
            size--;
            if (size >= 0) {
                y yVar = rVar.f962c.get(size);
                if (yVar != null) {
                    int i7 = yVar.d;
                    if (i7 >= i4) {
                        yVar.p(-i3, z2);
                    } else if (i7 >= i2) {
                        yVar.b(8);
                        rVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void S() {
    }

    public void T() {
    }

    public void U() {
        this.D++;
    }

    public void V(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.D - 1;
        this.D = i3;
        if (i3 < 1) {
            this.D = 0;
            if (z2) {
                int i4 = this.z;
                this.z = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.A;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z3 = false;
                    }
                    if (z3) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.t0.size() - 1; size >= 0; size--) {
                    y yVar = this.t0.get(size);
                    if (yVar.f970b.getParent() == this && !yVar.t() && (i2 = yVar.r) != -1) {
                        View view = yVar.f970b;
                        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                        view.setImportantForAccessibility(i2);
                        yVar.r = -1;
                    }
                }
                this.t0.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.M = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.Q = x2;
            this.O = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.R = y2;
            this.P = y2;
        }
    }

    public void X() {
    }

    public void Y() {
    }

    public void Z() {
        if (!this.k0 && this.r) {
            Runnable runnable = this.u0;
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            postOnAnimation(runnable);
            this.k0 = true;
        }
    }

    @Override // a.h.j.e
    public void a(int i2) {
        getScrollingChildHelper().i(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        if ((r6.K == null && r6.m.P0()) == false) goto L_0x0084;
     */
    public final void a0() {
        boolean z2;
        boolean z3;
        if (this.B) {
            a.o.b.a aVar = this.e;
            aVar.l(aVar.f660b);
            aVar.l(aVar.f661c);
            if (this.C) {
                this.m.j0(this);
            }
        }
        boolean z4 = true;
        if (this.K != null && this.m.P0()) {
            this.e.j();
        } else {
            this.e.c();
        }
        boolean z5 = this.h0 || this.i0;
        v vVar = this.e0;
        if (this.u && this.K != null && ((z3 = this.B) || z5 || this.m.g)) {
            if (z3) {
                Objects.requireNonNull(this.l);
            } else {
                z2 = true;
                vVar.i = z2;
                v vVar2 = this.e0;
                if (vVar2.i && z5 && !this.B) {
                }
                z4 = false;
                vVar2.j = z4;
                return;
            }
        }
        z2 = false;
        vVar.i = z2;
        v vVar22 = this.e0;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        l lVar = this.m;
        if (lVar == null || !lVar.Y()) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void b0(boolean z2) {
        this.C = z2 | this.C;
        this.B = true;
        int h2 = this.f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            y J2 = J(this.f.g(i2));
            if (J2 != null && !J2.t()) {
                J2.b(6);
            }
        }
        Q();
        r rVar = this.f934c;
        int size = rVar.f962c.size();
        for (int i3 = 0; i3 < size; i3++) {
            y yVar = rVar.f962c.get(i3);
            if (yVar != null) {
                yVar.b(6);
                yVar.a(null);
            }
        }
        d dVar = RecyclerView.this.l;
        rVar.e();
    }

    public void c0(y yVar, i.c cVar) {
        yVar.r(0, 8192);
        if (this.e0.g && yVar.o() && !yVar.l() && !yVar.t()) {
            Objects.requireNonNull(this.l);
            this.g.f731b.f((long) yVar.d, yVar);
        }
        this.g.c(yVar, cVar);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.m.f((m) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        l lVar = this.m;
        if (lVar != null && lVar.d()) {
            return this.m.j(this.e0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        l lVar = this.m;
        if (lVar != null && lVar.d()) {
            return this.m.k(this.e0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        l lVar = this.m;
        if (lVar != null && lVar.d()) {
            return this.m.l(this.e0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        l lVar = this.m;
        if (lVar != null && lVar.e()) {
            return this.m.m(this.e0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        l lVar = this.m;
        if (lVar != null && lVar.e()) {
            return this.m.n(this.e0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        l lVar = this.m;
        if (lVar != null && lVar.e()) {
            return this.m.o(this.e0);
        }
        return 0;
    }

    public void d0() {
        i iVar = this.K;
        if (iVar != null) {
            iVar.f();
        }
        l lVar = this.m;
        if (lVar != null) {
            lVar.y0(this.f934c);
            this.m.z0(this.f934c);
        }
        this.f934c.b();
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.o.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.o.get(i2).f(canvas, this, this.e0);
        }
        EdgeEffect edgeEffect = this.G;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.G;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.H;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.I;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.I;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.J;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                f3 = (float) (getPaddingRight() + (-getWidth()));
                f2 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f3 = (float) (-getWidth());
                f2 = (float) (-getHeight());
            }
            canvas.translate(f3, f2);
            EdgeEffect edgeEffect8 = this.J;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.K == null || this.o.size() <= 0 || !this.K.g()) {
            z4 = z2;
        }
        if (z4) {
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f954c) {
                Rect rect = mVar.f953b;
                Rect rect2 = this.i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        }
        this.m.D0(this, view, this.i, !this.u, view2 == null);
    }

    public final void f0() {
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        a(0);
        EdgeEffect edgeEffect = this.G;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.J;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.J.isFinished();
        }
        if (z2) {
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0168, code lost:
        if (r3 > 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0182, code lost:
        if (r6 > 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0185, code lost:
        if (r3 < 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0188, code lost:
        if (r6 < 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0190, code lost:
        if ((r6 * r2) < 0) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0198, code lost:
        if ((r6 * r2) > 0) goto L_0x019b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
    public View focusSearch(View view, int i2) {
        View view2;
        int i3;
        char c2;
        boolean z2;
        View h02 = this.m.h0();
        if (h02 != null) {
            return h02;
        }
        boolean z3 = true;
        boolean z4 = this.l != null && this.m != null && !P() && !this.x;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                n();
                if (C(view) == null) {
                    return null;
                }
                k0();
                view2 = this.m.c0(view, i2, this.f934c, this.e0);
                m0(false);
            }
        } else {
            if (this.m.e()) {
                if (instance.findNextFocus(this, view, i2 == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.m.d()) {
                        z2 = instance.findNextFocus(this, view, !((this.m.E() != 1) ^ (i2 != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        n();
                        if (C(view) == null) {
                            return null;
                        }
                        k0();
                        this.m.c0(view, i2, this.f934c, this.e0);
                        m0(false);
                    }
                    view2 = instance.findNextFocus(this, view, i2);
                }
            }
            z2 = false;
            if (instance.findNextFocus(this, view, !((this.m.E() != 1) ^ (i2 != 2)) ? 66 : 17) != null) {
            }
            if (z2) {
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!(view2 == null || view2 == this)) {
                if (C(view2) == null) {
                    z3 = false;
                } else if (!(view == null || C(view) == null)) {
                    this.i.set(0, 0, view.getWidth(), view.getHeight());
                    this.j.set(0, 0, view2.getWidth(), view2.getHeight());
                    offsetDescendantRectToMyCoords(view, this.i);
                    offsetDescendantRectToMyCoords(view2, this.j);
                    int i4 = this.m.E() == 1 ? -1 : 1;
                    Rect rect = this.i;
                    int i5 = rect.left;
                    Rect rect2 = this.j;
                    int i6 = rect2.left;
                    if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
                        i3 = 1;
                    } else {
                        int i7 = rect.right;
                        int i8 = rect2.right;
                        i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
                    }
                    int i9 = rect.top;
                    int i10 = rect2.top;
                    if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                        c2 = 1;
                    } else {
                        int i11 = rect.bottom;
                        int i12 = rect2.bottom;
                        c2 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? (char) 65535 : 0;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 17) {
                                if (i2 != 33) {
                                    if (i2 != 66) {
                                        if (i2 != 130) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Invalid direction: ");
                                            sb.append(i2);
                                            throw new IllegalArgumentException(b.a.a.a.a.a(this, sb));
                                        }
                                    }
                                }
                            }
                        } else if (c2 <= 0) {
                            if (c2 == 0) {
                            }
                        }
                    } else if (c2 >= 0) {
                        if (c2 == 0) {
                        }
                    }
                }
                return !z3 ? view2 : super.focusSearch(view, i2);
            }
            z3 = false;
            if (!z3) {
            }
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            e0(view2, null);
            return view;
        }
    }

    public final void g(y yVar) {
        View view = yVar.f970b;
        boolean z2 = view.getParent() == this;
        this.f934c.k(I(view));
        if (yVar.n()) {
            this.f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        a.o.b.b bVar = this.f;
        if (!z2) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((a.o.b.t) bVar.f665a).f723a.indexOfChild(view);
        if (indexOfChild >= 0) {
            bVar.f666b.h(indexOfChild);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
    public boolean g0(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        float f2;
        EdgeEffect edgeEffect;
        float f3;
        n();
        if (this.l != null) {
            h0(i2, i3, this.s0);
            int[] iArr = this.s0;
            int i8 = iArr[0];
            int i9 = iArr[1];
            i6 = i9;
            i5 = i8;
            i4 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.o.isEmpty()) {
            invalidate();
        }
        if (u(i5, i6, i4, i7, this.p0, 0)) {
            int i10 = this.Q;
            int[] iArr2 = this.p0;
            this.Q = i10 - iArr2[0];
            this.R -= iArr2[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.r0;
            int i11 = iArr3[0];
            int[] iArr4 = this.p0;
            iArr3[0] = i11 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    float x2 = motionEvent.getX();
                    float f4 = (float) i4;
                    float y2 = motionEvent.getY();
                    float f5 = (float) i7;
                    if (f4 < 0.0f) {
                        x();
                        edgeEffect = this.G;
                        f2 = (-f4) / ((float) getWidth());
                        f3 = 1.0f - (y2 / ((float) getHeight()));
                    } else if (f4 > 0.0f) {
                        y();
                        edgeEffect = this.I;
                        f2 = f4 / ((float) getWidth());
                        f3 = y2 / ((float) getHeight());
                    } else {
                        z2 = false;
                        if (f5 >= 0.0f) {
                            z();
                            this.H.onPull((-f5) / ((float) getHeight()), x2 / ((float) getWidth()));
                        } else {
                            if (f5 > 0.0f) {
                                w();
                                this.J.onPull(f5 / ((float) getHeight()), 1.0f - (x2 / ((float) getWidth())));
                            }
                            if (!(!z2 && f4 == 0.0f && f5 == 0.0f)) {
                                WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
                                postInvalidateOnAnimation();
                            }
                        }
                        z2 = true;
                        WeakHashMap<View, a.h.j.r> weakHashMap2 = a.h.j.m.f516a;
                        postInvalidateOnAnimation();
                    }
                    edgeEffect.onPull(f2, f3);
                    z2 = true;
                    if (f5 >= 0.0f) {
                    }
                    z2 = true;
                    WeakHashMap<View, a.h.j.r> weakHashMap22 = a.h.j.m.f516a;
                    postInvalidateOnAnimation();
                }
            }
            m(i2, i3);
        }
        if (!(i5 == 0 && i6 == 0)) {
            v(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i5 == 0 && i6 == 0) ? false : true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.m;
        if (lVar != null) {
            return lVar.t();
        }
        throw new IllegalStateException(b.a.a.a.a.a(this, b.a.a.a.a.d("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.m;
        if (lVar != null) {
            return lVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(b.a.a.a.a.a(this, b.a.a.a.a.d("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.m;
        if (lVar != null) {
            return lVar.v(layoutParams);
        }
        throw new IllegalStateException(b.a.a.a.a.a(this, b.a.a.a.a.d("RecyclerView has no LayoutManager")));
    }

    public d getAdapter() {
        return this.l;
    }

    public int getBaseline() {
        l lVar = this.m;
        if (lVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(lVar);
        return -1;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        g gVar = this.m0;
        return gVar == null ? super.getChildDrawingOrder(i2, i3) : gVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.h;
    }

    public a.o.b.v getCompatAccessibilityDelegate() {
        return this.l0;
    }

    public h getEdgeEffectFactory() {
        return this.F;
    }

    public i getItemAnimator() {
        return this.K;
    }

    public int getItemDecorationCount() {
        return this.o.size();
    }

    public l getLayoutManager() {
        return this.m;
    }

    public int getMaxFlingVelocity() {
        return this.U;
    }

    public int getMinFlingVelocity() {
        return this.T;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public n getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.a0;
    }

    public q getRecycledViewPool() {
        return this.f934c.d();
    }

    public int getScrollState() {
        return this.L;
    }

    public void h(k kVar) {
        l lVar = this.m;
        if (lVar != null) {
            lVar.c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(kVar);
        Q();
        requestLayout();
    }

    public void h0(int i2, int i3, int[] iArr) {
        y yVar;
        k0();
        U();
        int i4 = a.h.f.a.f462a;
        Trace.beginSection("RV Scroll");
        B(this.e0);
        int F0 = i2 != 0 ? this.m.F0(i2, this.f934c, this.e0) : 0;
        int G0 = i3 != 0 ? this.m.G0(i3, this.f934c, this.e0) : 0;
        Trace.endSection();
        int e2 = this.f.e();
        for (int i5 = 0; i5 < e2; i5++) {
            View d2 = this.f.d(i5);
            y I2 = I(d2);
            if (!(I2 == null || (yVar = I2.j) == null)) {
                View view = yVar.f970b;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        m0(false);
        if (iArr != null) {
            iArr[0] = F0;
            iArr[1] = G0;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public void i(String str) {
        if (P()) {
            if (str == null) {
                throw new IllegalStateException(b.a.a.a.a.a(this, b.a.a.a.a.d("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.E > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(b.a.a.a.a.a(this, b.a.a.a.a.d(""))));
        }
    }

    public boolean i0(y yVar, int i2) {
        if (P()) {
            yVar.r = i2;
            this.t0.add(yVar);
            return false;
        }
        View view = yVar.f970b;
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        view.setImportantForAccessibility(i2);
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.r;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j() {
        f0();
        setScrollState(0);
    }

    public void j0(int i2, int i3) {
        int i4;
        l lVar = this.m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.x) {
            int i5 = !lVar.d() ? 0 : i2;
            int i6 = !this.m.e() ? 0 : i3;
            if (i5 != 0 || i6 != 0) {
                x xVar = this.b0;
                Objects.requireNonNull(xVar);
                int abs = Math.abs(i5);
                int abs2 = Math.abs(i6);
                boolean z2 = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i6 * i6) + (i5 * i5)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
                int i7 = width / 2;
                float f2 = (float) width;
                float f3 = (float) i7;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z2) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
                }
                int min = Math.min(i4, 2000);
                Interpolator interpolator = z0;
                if (xVar.e != interpolator) {
                    xVar.e = interpolator;
                    xVar.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
                }
                RecyclerView.this.setScrollState(2);
                xVar.f969c = 0;
                xVar.f968b = 0;
                xVar.d.startScroll(0, 0, i5, i6, min);
                xVar.a();
            }
        }
    }

    public void k0() {
        int i2 = this.v + 1;
        this.v = i2;
        if (i2 == 1 && !this.x) {
            this.w = false;
        }
    }

    public void l() {
        int h2 = this.f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            y J2 = J(this.f.g(i2));
            if (!J2.t()) {
                J2.c();
            }
        }
        r rVar = this.f934c;
        int size = rVar.f962c.size();
        for (int i3 = 0; i3 < size; i3++) {
            rVar.f962c.get(i3).c();
        }
        int size2 = rVar.f960a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            rVar.f960a.get(i4).c();
        }
        ArrayList<y> arrayList = rVar.f961b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                rVar.f961b.get(i5).c();
            }
        }
    }

    public boolean l0(int i2, int i3) {
        return getScrollingChildHelper().h(i2, i3);
    }

    public void m(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.G;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.G.onRelease();
            z2 = this.G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.I.onRelease();
            z2 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.H.onRelease();
            z2 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.J;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.J.onRelease();
            z2 |= this.J.isFinished();
        }
        if (z2) {
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            postInvalidateOnAnimation();
        }
    }

    public void m0(boolean z2) {
        if (this.v < 1) {
            this.v = 1;
        }
        if (!z2 && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (z2 && this.w && !this.x && this.m != null && this.l != null) {
                q();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public void n() {
        if (!this.u || this.B) {
            int i2 = a.h.f.a.f462a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
        } else if (this.e.g()) {
            Objects.requireNonNull(this.e);
            if (this.e.g()) {
                int i3 = a.h.f.a.f462a;
                Trace.beginSection("RV FullInvalidate");
                q();
                Trace.endSection();
            }
        }
    }

    public void n0() {
        setScrollState(0);
        x xVar = this.b0;
        RecyclerView.this.removeCallbacks(xVar);
        xVar.d.abortAnimation();
    }

    public void o(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
        setMeasuredDimension(l.g(i2, paddingRight, getMinimumWidth()), l.g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = 0;
        this.r = true;
        this.u = this.u && !isLayoutRequested();
        l lVar = this.m;
        if (lVar != null) {
            lVar.h = true;
            lVar.Z();
        }
        this.k0 = false;
        ThreadLocal<a.o.b.n> threadLocal = a.o.b.n.f;
        a.o.b.n nVar = threadLocal.get();
        this.c0 = nVar;
        if (nVar == null) {
            this.c0 = new a.o.b.n();
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            Display display = getDisplay();
            float f2 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            a.o.b.n nVar2 = this.c0;
            nVar2.d = (long) (1.0E9f / f2);
            threadLocal.set(nVar2);
        }
        this.c0.f708b.add(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.K;
        if (iVar != null) {
            iVar.f();
        }
        n0();
        this.r = false;
        l lVar = this.m;
        if (lVar != null) {
            r rVar = this.f934c;
            lVar.h = false;
            lVar.b0(this, rVar);
        }
        this.t0.clear();
        removeCallbacks(this.u0);
        Objects.requireNonNull(this.g);
        do {
        } while (y.a.d.a() != null);
        a.o.b.n nVar = this.c0;
        if (nVar != null) {
            nVar.f708b.remove(this);
            this.c0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.o.get(i2).e(canvas, this, this.e0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.m != null && !this.x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.m.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        g0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.m.e()) {
                        f3 = -axisValue;
                    } else if (this.m.d()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        g0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
                    }
                }
                f3 = 0.0f;
                f2 = 0.0f;
                g0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
            }
            f2 = 0.0f;
            g0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x00e2 */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        Object[] objArr2;
        if (this.x) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.q = null;
        }
        int size = this.p.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                objArr = null;
                break;
            }
            o oVar = this.p.get(i2);
            if (oVar.b(this, motionEvent) && action != 3) {
                this.q = oVar;
                objArr = 1;
                break;
            }
            i2++;
        }
        if (objArr != null) {
            j();
            return true;
        }
        l lVar = this.m;
        if (lVar == null) {
            return false;
        }
        boolean d2 = lVar.d();
        boolean e2 = this.m.e();
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.y) {
                this.y = false;
            }
            this.M = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.Q = x2;
            this.O = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.R = y2;
            this.P = y2;
            if (this.L == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.r0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e2) {
                boolean z2 = d2 ? 1 : 0;
                char c2 = d2 ? 1 : 0;
                d2 = z2 | true;
            }
            int i3 = d2 ? 1 : 0;
            int i4 = d2 ? 1 : 0;
            int i5 = d2 ? 1 : 0;
            l0(i3, 0);
        } else if (actionMasked == 1) {
            this.N.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.M);
            if (findPointerIndex < 0) {
                StringBuilder d3 = b.a.a.a.a.d("Error processing scroll; pointer index for id ");
                d3.append(this.M);
                d3.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", d3.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.L != 1) {
                int i6 = x3 - this.O;
                int i7 = y3 - this.P;
                if (!d2 || Math.abs(i6) <= this.S) {
                    objArr2 = null;
                } else {
                    this.Q = x3;
                    objArr2 = 1;
                }
                if (e2 && Math.abs(i7) > this.S) {
                    this.R = y3;
                    objArr2 = 1;
                }
                if (objArr2 != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.M = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.Q = x4;
            this.O = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.R = y4;
            this.P = y4;
        } else if (actionMasked == 6) {
            W(motionEvent);
        }
        return this.L == 1;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = a.h.f.a.f462a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.u = true;
    }

    public void onMeasure(int i2, int i3) {
        l lVar = this.m;
        if (lVar == null) {
            o(i2, i3);
            return;
        }
        boolean z2 = false;
        if (lVar.Q()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.m.q0(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.l != null) {
                if (this.e0.f967c == 1) {
                    r();
                }
                this.m.I0(i2, i3);
                this.e0.h = true;
                s();
                this.m.K0(i2, i3);
                if (this.m.N0()) {
                    this.m.I0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.e0.h = true;
                    s();
                    this.m.K0(i2, i3);
                }
            }
        } else if (this.s) {
            this.m.q0(i2, i3);
        } else {
            v vVar = this.e0;
            if (vVar.j) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            d dVar = this.l;
            if (dVar != null) {
                vVar.d = dVar.a();
            } else {
                vVar.d = 0;
            }
            k0();
            this.m.q0(i2, i3);
            m0(false);
            this.e0.f = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u uVar = (u) parcelable;
        this.d = uVar;
        super.onRestoreInstanceState(uVar.f567a);
        l lVar = this.m;
        if (lVar != null && (parcelable2 = this.d.f964c) != null) {
            lVar.t0(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        u uVar = new u(super.onSaveInstanceState());
        u uVar2 = this.d;
        if (uVar2 != null) {
            uVar.f964c = uVar2.f964c;
        } else {
            l lVar = this.m;
            uVar.f964c = lVar != null ? lVar.u0() : null;
        }
        return uVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            O();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0140 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r2 != 1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0247, code lost:
        if (r1 != null) goto L_0x024c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i2;
        int i3;
        o oVar;
        boolean z2 = false;
        if (this.x || this.y) {
            return false;
        }
        int action = motionEvent.getAction();
        o oVar2 = this.q;
        if (oVar2 != null) {
            oVar = null;
            if (action == 0) {
                this.q = null;
            } else {
                oVar2.c(this, motionEvent);
                if (action != 3) {
                }
                this.q = oVar;
                objArr = 1;
                if (objArr == null) {
                    j();
                    return true;
                }
                l lVar = this.m;
                if (lVar == null) {
                    return false;
                }
                boolean d2 = lVar.d();
                boolean e2 = this.m.e();
                if (this.N == null) {
                    this.N = VelocityTracker.obtain();
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.r0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                int[] iArr2 = this.r0;
                obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
                if (actionMasked == 0) {
                    this.M = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.Q = x2;
                    this.O = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.R = y2;
                    this.P = y2;
                    if (e2) {
                        boolean z3 = d2 ? 1 : 0;
                        char c2 = d2 ? 1 : 0;
                        d2 = z3 | true;
                    }
                    int i4 = d2 ? 1 : 0;
                    int i5 = d2 ? 1 : 0;
                    int i6 = d2 ? 1 : 0;
                    l0(i4, 0);
                } else if (actionMasked == 1) {
                    this.N.addMovement(obtain);
                    this.N.computeCurrentVelocity(1000, (float) this.U);
                    float f2 = d2 ? -this.N.getXVelocity(this.M) : 0.0f;
                    float f3 = e2 ? -this.N.getYVelocity(this.M) : 0.0f;
                    if (!(f2 == 0.0f && f3 == 0.0f)) {
                        int i7 = (int) f2;
                        int i8 = (int) f3;
                        l lVar2 = this.m;
                        if (lVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.x) {
                            boolean d3 = lVar2.d();
                            boolean e3 = this.m.e();
                            if (!d3 || Math.abs(i7) < this.T) {
                                i7 = 0;
                            }
                            if (!e3 || Math.abs(i8) < this.T) {
                                i8 = 0;
                            }
                            if (!(i7 == 0 && i8 == 0)) {
                                float f4 = (float) i7;
                                float f5 = (float) i8;
                                if (!dispatchNestedPreFling(f4, f5)) {
                                    boolean z4 = d3 || e3;
                                    dispatchNestedFling(f4, f5, z4);
                                    if (z4) {
                                        if (e3) {
                                            boolean z5 = d3 ? 1 : 0;
                                            char c3 = d3 ? 1 : 0;
                                            d3 = z5 | true;
                                        }
                                        int i9 = d3 ? 1 : 0;
                                        int i10 = d3 ? 1 : 0;
                                        int i11 = d3 ? 1 : 0;
                                        l0(i9, 1);
                                        int i12 = this.U;
                                        int max = Math.max(-i12, Math.min(i7, i12));
                                        int i13 = this.U;
                                        int max2 = Math.max(-i13, Math.min(i8, i13));
                                        x xVar = this.b0;
                                        RecyclerView.this.setScrollState(2);
                                        xVar.f969c = 0;
                                        xVar.f968b = 0;
                                        xVar.d.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        xVar.a();
                                        objArr2 = 1;
                                    }
                                }
                            }
                        }
                        objArr2 = null;
                    }
                    setScrollState(0);
                    f0();
                    z2 = true;
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.M);
                    if (findPointerIndex < 0) {
                        StringBuilder d4 = b.a.a.a.a.d("Error processing scroll; pointer index for id ");
                        d4.append(this.M);
                        d4.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", d4.toString());
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i14 = this.Q - x3;
                    int i15 = this.R - y3;
                    if (getScrollingChildHelper().c(i14, i15, this.q0, this.p0, 0)) {
                        int[] iArr3 = this.q0;
                        i14 -= iArr3[0];
                        i15 -= iArr3[1];
                        int[] iArr4 = this.p0;
                        obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                        int[] iArr5 = this.r0;
                        int i16 = iArr5[0];
                        int[] iArr6 = this.p0;
                        iArr5[0] = i16 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (this.L != 1) {
                        if (!d2 || Math.abs(i14) <= (i3 = this.S)) {
                            objArr3 = null;
                        } else {
                            i14 = i14 > 0 ? i14 - i3 : i14 + i3;
                            objArr3 = 1;
                        }
                        if (e2 && Math.abs(i15) > (i2 = this.S)) {
                            i15 = i15 > 0 ? i15 - i2 : i15 + i2;
                            objArr3 = 1;
                        }
                        if (objArr3 != null) {
                            setScrollState(1);
                        }
                    }
                    if (this.L == 1) {
                        int[] iArr7 = this.p0;
                        this.Q = x3 - iArr7[0];
                        this.R = y3 - iArr7[1];
                        if (g0(d2 ? i14 : 0, e2 ? i15 : 0, obtain)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        a.o.b.n nVar = this.c0;
                        if (!(nVar == null || (i14 == 0 && i15 == 0))) {
                            nVar.a(this, i14, i15);
                        }
                    }
                } else if (actionMasked == 3) {
                    j();
                } else if (actionMasked == 5) {
                    this.M = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.Q = x4;
                    this.O = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.R = y4;
                    this.P = y4;
                } else if (actionMasked == 6) {
                    W(motionEvent);
                }
                if (!z2) {
                    this.N.addMovement(obtain);
                }
                obtain.recycle();
                return true;
            }
        }
        if (action != 0) {
            int size = this.p.size();
            for (int i17 = 0; i17 < size; i17++) {
                oVar = this.p.get(i17);
                if (oVar.b(this, motionEvent)) {
                    this.q = oVar;
                    objArr = 1;
                    break;
                }
            }
        }
        objArr = null;
        if (objArr == null) {
        }
    }

    public void p(View view) {
        y J2 = J(view);
        T();
        d dVar = this.l;
        if (dVar != null && J2 != null) {
            Objects.requireNonNull(dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d5, code lost:
        if (r15.f.k(getFocusedChild()) == false) goto L_0x0348;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0258  */
    public void q() {
        String str;
        v vVar;
        ArrayList<y> arrayList;
        l lVar;
        View view;
        View findViewById;
        y F2;
        i.c cVar;
        i.c cVar2;
        boolean z2;
        if (this.l == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.m == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            v vVar2 = this.e0;
            int i2 = 0;
            vVar2.h = false;
            boolean z3 = true;
            if (vVar2.f967c == 1) {
                r();
            } else {
                a.o.b.a aVar = this.e;
                if (!(!aVar.f661c.isEmpty() && !aVar.f660b.isEmpty()) && this.m.o == getWidth() && this.m.p == getHeight()) {
                    this.m.H0(this);
                    int i3 = 4;
                    this.e0.a(4);
                    k0();
                    U();
                    vVar = this.e0;
                    vVar.f967c = 1;
                    if (vVar.i) {
                        int e2 = this.f.e() - 1;
                        while (e2 >= 0) {
                            y J2 = J(this.f.d(e2));
                            if (!J2.t()) {
                                Objects.requireNonNull(this.l);
                                long j2 = (long) J2.d;
                                Objects.requireNonNull(this.K);
                                i.c cVar3 = new i.c();
                                View view2 = J2.f970b;
                                cVar3.f941a = view2.getLeft();
                                cVar3.f942b = view2.getTop();
                                view2.getRight();
                                view2.getBottom();
                                y e3 = this.g.f731b.e(j2, null);
                                if (e3 != null && !e3.t()) {
                                    boolean d2 = this.g.d(e3);
                                    boolean d3 = this.g.d(J2);
                                    if (!d2 || e3 != J2) {
                                        i.c e4 = this.g.e(e3, i3);
                                        this.g.b(J2, cVar3);
                                        i.c e5 = this.g.e(J2, 8);
                                        if (e4 == null) {
                                            int e6 = this.f.e();
                                            for (int i4 = 0; i4 < e6; i4++) {
                                                y J3 = J(this.f.d(i4));
                                                if (J3 != J2 && H(J3) == j2) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                                    sb.append(J3);
                                                    sb.append(" \n View Holder 2:");
                                                    sb.append(J2);
                                                    throw new IllegalStateException(b.a.a.a.a.a(this, sb));
                                                }
                                            }
                                            Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e3 + " cannot be found but it is necessary for " + J2 + A());
                                        } else {
                                            e3.s(false);
                                            if (d2) {
                                                g(e3);
                                            }
                                            if (e3 != J2) {
                                                if (d3) {
                                                    g(J2);
                                                }
                                                e3.i = J2;
                                                g(e3);
                                                this.f934c.k(e3);
                                                J2.s(false);
                                                J2.j = e3;
                                            }
                                            if (this.K.a(e3, J2, e4, e5)) {
                                                Z();
                                            }
                                        }
                                    }
                                }
                                this.g.b(J2, cVar3);
                            }
                            e2--;
                            i3 = 4;
                        }
                        a.o.b.y yVar = this.g;
                        y.b bVar = this.v0;
                        int i5 = yVar.f730a.f303c;
                        while (true) {
                            i5--;
                            if (i5 < 0) {
                                break;
                            }
                            y h2 = yVar.f730a.h(i5);
                            y.a i6 = yVar.f730a.i(i5);
                            int i7 = i6.f732a;
                            if ((i7 & 3) != 3) {
                                if ((i7 & 1) != 0) {
                                    cVar2 = i6.f733b;
                                    if (cVar2 != null) {
                                        cVar = i6.f734c;
                                    }
                                } else {
                                    if ((i7 & 14) != 14) {
                                        if ((i7 & 12) == 12) {
                                            i.c cVar4 = i6.f733b;
                                            i.c cVar5 = i6.f734c;
                                            c cVar6 = (c) bVar;
                                            Objects.requireNonNull(cVar6);
                                            h2.s(false);
                                            RecyclerView recyclerView = RecyclerView.this;
                                            boolean z4 = recyclerView.B;
                                            i iVar = recyclerView.K;
                                            if (!z4) {
                                                a.o.b.w wVar = (a.o.b.w) iVar;
                                                Objects.requireNonNull(wVar);
                                                int i8 = cVar4.f941a;
                                                int i9 = cVar5.f941a;
                                                if (i8 == i9 && cVar4.f942b == cVar5.f942b) {
                                                    wVar.c(h2);
                                                    z2 = false;
                                                } else {
                                                    z2 = wVar.i(h2, i8, cVar4.f942b, i9, cVar5.f942b);
                                                }
                                                if (!z2) {
                                                }
                                            } else if (!iVar.a(h2, h2, cVar4, cVar5)) {
                                            }
                                            RecyclerView.this.Z();
                                        } else if ((i7 & 4) != 0) {
                                            cVar2 = i6.f733b;
                                            cVar = null;
                                        } else if ((i7 & 8) == 0) {
                                        }
                                        y.a.b(i6);
                                    }
                                    ((c) bVar).a(h2, i6.f733b, i6.f734c);
                                    y.a.b(i6);
                                }
                                ((c) bVar).b(h2, cVar2, cVar);
                                y.a.b(i6);
                            }
                            RecyclerView recyclerView2 = RecyclerView.this;
                            recyclerView2.m.A0(h2.f970b, recyclerView2.f934c);
                            y.a.b(i6);
                        }
                    }
                    this.m.z0(this.f934c);
                    v vVar3 = this.e0;
                    vVar3.f965a = vVar3.d;
                    this.B = false;
                    this.C = false;
                    vVar3.i = false;
                    vVar3.j = false;
                    this.m.g = false;
                    arrayList = this.f934c.f961b;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    lVar = this.m;
                    if (lVar.l) {
                        lVar.k = 0;
                        lVar.l = false;
                        this.f934c.l();
                    }
                    this.m.p0(this.e0);
                    V(true);
                    m0(false);
                    a.o.b.y yVar2 = this.g;
                    yVar2.f730a.clear();
                    yVar2.f731b.a();
                    int[] iArr = this.n0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    D(iArr);
                    int[] iArr2 = this.n0;
                    if (iArr2[0] == i10 && iArr2[1] == i11) {
                        z3 = false;
                    }
                    if (z3) {
                        v(0, 0);
                    }
                    if (this.a0 && this.l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                        if (!isFocused()) {
                        }
                        if (this.e0.l != -1) {
                            Objects.requireNonNull(this.l);
                        }
                        if (this.f.e() > 0) {
                            v vVar4 = this.e0;
                            int i12 = vVar4.k;
                            if (i12 != -1) {
                                i2 = i12;
                            }
                            int b2 = vVar4.b();
                            int i13 = i2;
                            while (true) {
                                if (i13 >= b2) {
                                    break;
                                }
                                y F3 = F(i13);
                                if (F3 == null) {
                                    break;
                                } else if (F3.f970b.hasFocusable()) {
                                    view = F3.f970b;
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            int min = Math.min(b2, i2);
                            while (true) {
                                min--;
                                if (min >= 0 && (F2 = F(min)) != null) {
                                    if (F2.f970b.hasFocusable()) {
                                        view = F2.f970b;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        view = null;
                        if (view != null) {
                            int i14 = this.e0.m;
                            if (!(((long) i14) == -1 || (findViewById = view.findViewById(i14)) == null || !findViewById.isFocusable())) {
                                view = findViewById;
                            }
                            view.requestFocus();
                        }
                    }
                    v vVar5 = this.e0;
                    vVar5.l = -1;
                    vVar5.k = -1;
                    vVar5.m = -1;
                    return;
                }
            }
            this.m.H0(this);
            s();
            int i32 = 4;
            this.e0.a(4);
            k0();
            U();
            vVar = this.e0;
            vVar.f967c = 1;
            if (vVar.i) {
            }
            this.m.z0(this.f934c);
            v vVar32 = this.e0;
            vVar32.f965a = vVar32.d;
            this.B = false;
            this.C = false;
            vVar32.i = false;
            vVar32.j = false;
            this.m.g = false;
            arrayList = this.f934c.f961b;
            if (arrayList != null) {
            }
            lVar = this.m;
            if (lVar.l) {
            }
            this.m.p0(this.e0);
            V(true);
            m0(false);
            a.o.b.y yVar22 = this.g;
            yVar22.f730a.clear();
            yVar22.f731b.a();
            int[] iArr3 = this.n0;
            int i102 = iArr3[0];
            int i112 = iArr3[1];
            D(iArr3);
            int[] iArr22 = this.n0;
            z3 = false;
            if (z3) {
            }
            if (!isFocused()) {
            }
            if (this.e0.l != -1) {
            }
            if (this.f.e() > 0) {
            }
            view = null;
            if (view != null) {
            }
            v vVar52 = this.e0;
            vVar52.l = -1;
            vVar52.k = -1;
            vVar52.m = -1;
            return;
        }
        Log.e("RecyclerView", str);
    }

    public final void r() {
        int id;
        View C2;
        this.e0.a(1);
        B(this.e0);
        this.e0.h = false;
        k0();
        a.o.b.y yVar = this.g;
        yVar.f730a.clear();
        yVar.f731b.a();
        U();
        a0();
        View focusedChild = (!this.a0 || !hasFocus() || this.l == null) ? null : getFocusedChild();
        y I2 = (focusedChild == null || (C2 = C(focusedChild)) == null) ? null : I(C2);
        if (I2 == null) {
            v vVar = this.e0;
            vVar.l = -1;
            vVar.k = -1;
            vVar.m = -1;
        } else {
            v vVar2 = this.e0;
            Objects.requireNonNull(this.l);
            vVar2.l = -1;
            this.e0.k = this.B ? -1 : I2.l() ? I2.e : I2.e();
            v vVar3 = this.e0;
            View view = I2.f970b;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        vVar3.m = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            vVar3.m = id;
        }
        v vVar4 = this.e0;
        vVar4.g = vVar4.i && this.i0;
        this.i0 = false;
        this.h0 = false;
        vVar4.f = vVar4.j;
        vVar4.d = this.l.a();
        D(this.n0);
        if (this.e0.i) {
            int e2 = this.f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                y J2 = J(this.f.d(i2));
                if (!J2.t()) {
                    if (J2.j()) {
                        Objects.requireNonNull(this.l);
                    } else {
                        i iVar = this.K;
                        i.b(J2);
                        J2.g();
                        this.g.c(J2, iVar.h(J2));
                        if (this.e0.g && J2.o() && !J2.l() && !J2.t() && !J2.j()) {
                            Objects.requireNonNull(this.l);
                            this.g.f731b.f((long) J2.d, J2);
                        }
                    }
                }
            }
        }
        if (this.e0.j) {
            int h2 = this.f.h();
            for (int i3 = 0; i3 < h2; i3++) {
                y J3 = J(this.f.g(i3));
                if (!J3.t() && J3.e == -1) {
                    J3.e = J3.d;
                }
            }
            v vVar5 = this.e0;
            boolean z2 = vVar5.e;
            vVar5.e = false;
            this.m.o0(this.f934c, vVar5);
            this.e0.e = z2;
            for (int i4 = 0; i4 < this.f.e(); i4++) {
                y J4 = J(this.f.d(i4));
                if (!J4.t()) {
                    y.a orDefault = this.g.f730a.getOrDefault(J4, null);
                    if (!((orDefault == null || (orDefault.f732a & 4) == 0) ? false : true)) {
                        i.b(J4);
                        boolean h3 = J4.h(8192);
                        i iVar2 = this.K;
                        J4.g();
                        i.c h4 = iVar2.h(J4);
                        if (h3) {
                            c0(J4, h4);
                        } else {
                            a.o.b.y yVar2 = this.g;
                            y.a orDefault2 = yVar2.f730a.getOrDefault(J4, null);
                            if (orDefault2 == null) {
                                orDefault2 = y.a.a();
                                yVar2.f730a.put(J4, orDefault2);
                            }
                            orDefault2.f732a |= 2;
                            orDefault2.f733b = h4;
                        }
                    }
                }
            }
        }
        l();
        V(true);
        m0(false);
        this.e0.f967c = 2;
    }

    public void removeDetachedView(View view, boolean z2) {
        y J2 = J(view);
        if (J2 != null) {
            if (J2.n()) {
                J2.k &= -257;
            } else if (!J2.t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(J2);
                throw new IllegalArgumentException(b.a.a.a.a.a(this, sb));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.m.s0(this, view, view2) && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.m.D0(this, view, rect, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        k0();
        U();
        this.e0.a(6);
        this.e.c();
        this.e0.d = this.l.a();
        v vVar = this.e0;
        vVar.f966b = 0;
        vVar.f = false;
        this.m.o0(this.f934c, vVar);
        v vVar2 = this.e0;
        vVar2.e = false;
        this.d = null;
        vVar2.i = vVar2.i && this.K != null;
        vVar2.f967c = 4;
        V(true);
        m0(false);
    }

    public void scrollBy(int i2, int i3) {
        l lVar = this.m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.x) {
            boolean d2 = lVar.d();
            boolean e2 = this.m.e();
            if (d2 || e2) {
                if (!d2) {
                    i2 = 0;
                }
                if (!e2) {
                    i3 = 0;
                }
                g0(i2, i3, null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (P()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i2 = contentChangeTypes;
            }
            this.z |= i2;
            i2 = 1;
        }
        if (i2 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(a.o.b.v vVar) {
        this.l0 = vVar;
        a.h.j.m.g(this, vVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.l;
        if (dVar2 != null) {
            dVar2.f937a.unregisterObserver(this.f933b);
            Objects.requireNonNull(this.l);
        }
        d0();
        a.o.b.a aVar = this.e;
        aVar.l(aVar.f660b);
        aVar.l(aVar.f661c);
        d dVar3 = this.l;
        this.l = dVar;
        if (dVar != null) {
            dVar.f937a.registerObserver(this.f933b);
        }
        l lVar = this.m;
        if (lVar != null) {
            lVar.X();
        }
        r rVar = this.f934c;
        d dVar4 = this.l;
        rVar.b();
        q d2 = rVar.d();
        Objects.requireNonNull(d2);
        if (dVar3 != null) {
            d2.f956b--;
        }
        if (d2.f956b == 0) {
            for (int i2 = 0; i2 < d2.f955a.size(); i2++) {
                d2.f955a.valueAt(i2).f957a.clear();
            }
        }
        if (dVar4 != null) {
            d2.f956b++;
        }
        this.e0.e = true;
        b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar != this.m0) {
            this.m0 = gVar;
            setChildrenDrawingOrderEnabled(gVar != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            O();
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        Objects.requireNonNull(hVar);
        this.F = hVar;
        O();
    }

    public void setHasFixedSize(boolean z2) {
        this.s = z2;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.K;
        if (iVar2 != null) {
            iVar2.f();
            this.K.f938a = null;
        }
        this.K = iVar;
        if (iVar != null) {
            iVar.f938a = this.j0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        r rVar = this.f934c;
        rVar.e = i2;
        rVar.l();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.x) {
            i("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.x = false;
                if (!(!this.w || this.m == null || this.l == null)) {
                    requestLayout();
                }
                this.w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.x = true;
            this.y = true;
            n0();
        }
    }

    public void setLayoutManager(l lVar) {
        if (lVar != this.m) {
            n0();
            if (this.m != null) {
                i iVar = this.K;
                if (iVar != null) {
                    iVar.f();
                }
                this.m.y0(this.f934c);
                this.m.z0(this.f934c);
                this.f934c.b();
                if (this.r) {
                    l lVar2 = this.m;
                    r rVar = this.f934c;
                    lVar2.h = false;
                    lVar2.b0(this, rVar);
                }
                this.m.L0(null);
                this.m = null;
            } else {
                this.f934c.b();
            }
            a.o.b.b bVar = this.f;
            b.a aVar = bVar.f666b;
            aVar.f668a = 0;
            b.a aVar2 = aVar.f669b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = bVar.f667c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                a.o.b.t tVar = (a.o.b.t) bVar.f665a;
                Objects.requireNonNull(tVar);
                y J2 = J(bVar.f667c.get(size));
                if (J2 != null) {
                    tVar.f723a.i0(J2, J2.q);
                    J2.q = 0;
                }
                bVar.f667c.remove(size);
            }
            a.o.b.t tVar2 = (a.o.b.t) bVar.f665a;
            int b2 = tVar2.b();
            for (int i2 = 0; i2 < b2; i2++) {
                View a2 = tVar2.a(i2);
                tVar2.f723a.p(a2);
                a2.clearAnimation();
            }
            tVar2.f723a.removeAllViews();
            this.m = lVar;
            if (lVar != null) {
                if (lVar.f945b == null) {
                    lVar.L0(this);
                    if (this.r) {
                        l lVar3 = this.m;
                        lVar3.h = true;
                        lVar3.Z();
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(b.a.a.a.a.a(lVar.f945b, sb));
                }
            }
            this.f934c.l();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        a.h.j.g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            View view = scrollingChildHelper.f511c;
            WeakHashMap<View, a.h.j.r> weakHashMap = a.h.j.m.f516a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(n nVar) {
    }

    @Deprecated
    public void setOnScrollListener(p pVar) {
        this.f0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.a0 = z2;
    }

    public void setRecycledViewPool(q qVar) {
        r rVar = this.f934c;
        q qVar2 = rVar.g;
        if (qVar2 != null) {
            qVar2.f956b--;
        }
        rVar.g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.g.f956b++;
        }
    }

    public void setRecyclerListener(s sVar) {
        this.n = sVar;
    }

    public void setScrollState(int i2) {
        if (i2 != this.L) {
            this.L = i2;
            if (i2 != 2) {
                x xVar = this.b0;
                RecyclerView.this.removeCallbacks(xVar);
                xVar.d.abortAnimation();
            }
            l lVar = this.m;
            if (lVar != null) {
                lVar.v0(i2);
            }
            X();
            List<p> list = this.g0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        Objects.requireNonNull(this.g0.get(size));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.S = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.S = i3;
    }

    public void setViewCacheExtension(w wVar) {
        Objects.requireNonNull(this.f934c);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public boolean t(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, null, i4);
    }

    public boolean u(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, null);
    }

    public void v(int i2, int i3) {
        this.E++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        Y();
        p pVar = this.f0;
        if (pVar != null) {
            pVar.a(this, i2, i3);
        }
        List<p> list = this.g0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.g0.get(size).a(this, i2, i3);
            }
        }
        this.E--;
    }

    public void w() {
        int i2;
        int i3;
        if (this.J == null) {
            EdgeEffect a2 = this.F.a(this);
            this.J = a2;
            if (this.h) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    public void x() {
        int i2;
        int i3;
        if (this.G == null) {
            EdgeEffect a2 = this.F.a(this);
            this.G = a2;
            if (this.h) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void y() {
        int i2;
        int i3;
        if (this.I == null) {
            EdgeEffect a2 = this.F.a(this);
            this.I = a2;
            if (this.h) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void z() {
        int i2;
        int i3;
        if (this.H == null) {
            EdgeEffect a2 = this.F.a(this);
            this.H = a2;
            if (this.h) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }
}
