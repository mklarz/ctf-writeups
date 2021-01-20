package androidx.recyclerview.widget;

import a.o.b.n;
import a.o.b.s;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

public class LinearLayoutManager extends RecyclerView.l {
    public d A = null;
    public final a B = new a();
    public final b C = new b();
    public int D = 2;
    public int q = 1;
    public c r;
    public s s;
    public boolean t;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = true;
    public int y = -1;
    public int z = Integer.MIN_VALUE;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f921a;

        /* renamed from: b  reason: collision with root package name */
        public int f922b;

        /* renamed from: c  reason: collision with root package name */
        public int f923c;
        public boolean d;
        public boolean e;

        public a() {
            d();
        }

        public void a() {
            this.f923c = this.d ? this.f921a.g() : this.f921a.k();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.f923c = this.f921a.m() + this.f921a.b(view);
            } else {
                this.f923c = this.f921a.e(view);
            }
            this.f922b = i;
        }

        public void c(View view, int i) {
            int i2;
            int m = this.f921a.m();
            if (m >= 0) {
                b(view, i);
                return;
            }
            this.f922b = i;
            if (this.d) {
                int g = (this.f921a.g() - m) - this.f921a.b(view);
                this.f923c = this.f921a.g() - g;
                if (g > 0) {
                    int c2 = this.f923c - this.f921a.c(view);
                    int k = this.f921a.k();
                    int min = c2 - (Math.min(this.f921a.e(view) - k, 0) + k);
                    if (min < 0) {
                        i2 = Math.min(g, -min) + this.f923c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e2 = this.f921a.e(view);
                int k2 = e2 - this.f921a.k();
                this.f923c = e2;
                if (k2 > 0) {
                    int g2 = (this.f921a.g() - Math.min(0, (this.f921a.g() - m) - this.f921a.b(view))) - (this.f921a.c(view) + e2);
                    if (g2 < 0) {
                        i2 = this.f923c - Math.min(k2, -g2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f923c = i2;
        }

        public void d() {
            this.f922b = -1;
            this.f923c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder d2 = b.a.a.a.a.d("AnchorInfo{mPosition=");
            d2.append(this.f922b);
            d2.append(", mCoordinate=");
            d2.append(this.f923c);
            d2.append(", mLayoutFromEnd=");
            d2.append(this.d);
            d2.append(", mValid=");
            d2.append(this.e);
            d2.append('}');
            return d2.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f924a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f925b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f926c;
        public boolean d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f927a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f928b;

        /* renamed from: c  reason: collision with root package name */
        public int f929c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h = 0;
        public int i;
        public List<RecyclerView.y> j = null;
        public boolean k;

        public void a(View view) {
            int i2;
            int a2;
            int size = this.j.size();
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < size; i4++) {
                View view3 = this.j.get(i4).f970b;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.c() && (a2 = (mVar.a() - this.d) * this.e) >= 0 && a2 < i3) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i3 = a2;
                }
            }
            if (view2 == null) {
                i2 = -1;
            } else {
                i2 = ((RecyclerView.m) view2.getLayoutParams()).a();
            }
            this.d = i2;
        }

        public boolean b(RecyclerView.v vVar) {
            int i2 = this.d;
            return i2 >= 0 && i2 < vVar.b();
        }

        public View c(RecyclerView.r rVar) {
            List<RecyclerView.y> list = this.j;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.j.get(i2).f970b;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.c() && this.d == mVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = rVar.j(this.d, false, Long.MAX_VALUE).f970b;
            this.d += this.e;
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f930a;

        /* renamed from: b  reason: collision with root package name */
        public int f931b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f932c;

        public static class a implements Parcelable.Creator<d> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f930a = parcel.readInt();
            this.f931b = parcel.readInt();
            this.f932c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f930a = dVar.f930a;
            this.f931b = dVar.f931b;
            this.f932c = dVar.f932c;
        }

        public boolean a() {
            return this.f930a >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f930a);
            parcel.writeInt(this.f931b);
            parcel.writeInt(this.f932c ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z2) {
        s1(i);
        c(null);
        if (z2 != this.u) {
            this.u = z2;
            E0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int F0(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        if (this.q == 1) {
            return 0;
        }
        return r1(i, rVar, vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int G0(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        if (this.q == 0) {
            return 0;
        }
        return r1(i, rVar, vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean N0() {
        boolean z2;
        if (this.n == 1073741824 || this.m == 1073741824) {
            return false;
        }
        int x2 = x();
        int i = 0;
        while (true) {
            if (i >= x2) {
                z2 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = w(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z2 = true;
                break;
            }
            i++;
        }
        return z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean P0() {
        return this.A == null && this.t == this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean Q() {
        return true;
    }

    public void Q0(RecyclerView.v vVar, c cVar, RecyclerView.l.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < vVar.b()) {
            ((n.b) cVar2).a(i, Math.max(0, cVar.g));
        }
    }

    public final int R0(RecyclerView.v vVar) {
        if (x() == 0) {
            return 0;
        }
        V0();
        return a.h.b.d.f(vVar, this.s, a1(!this.x, true), Z0(!this.x, true), this, this.x);
    }

    public final int S0(RecyclerView.v vVar) {
        if (x() == 0) {
            return 0;
        }
        V0();
        return a.h.b.d.g(vVar, this.s, a1(!this.x, true), Z0(!this.x, true), this, this.x, this.v);
    }

    public final int T0(RecyclerView.v vVar) {
        if (x() == 0) {
            return 0;
        }
        V0();
        return a.h.b.d.h(vVar, this.s, a1(!this.x, true), Z0(!this.x, true), this, this.x);
    }

    public int U0(int i) {
        if (i == 1) {
            return (this.q != 1 && k1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.q != 1 && k1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.q == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.q == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.q == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.q == 1 ? 1 : Integer.MIN_VALUE;
    }

    public void V0() {
        if (this.r == null) {
            this.r = new c();
        }
    }

    public int W0(RecyclerView.r rVar, c cVar, RecyclerView.v vVar, boolean z2) {
        int i = cVar.f929c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            n1(rVar, cVar);
        }
        int i3 = cVar.f929c + cVar.h;
        b bVar = this.C;
        while (true) {
            if ((!cVar.k && i3 <= 0) || !cVar.b(vVar)) {
                break;
            }
            bVar.f924a = 0;
            bVar.f925b = false;
            bVar.f926c = false;
            bVar.d = false;
            l1(rVar, vVar, cVar, bVar);
            if (!bVar.f925b) {
                int i4 = cVar.f928b;
                int i5 = bVar.f924a;
                cVar.f928b = (cVar.f * i5) + i4;
                if (!bVar.f926c || this.r.j != null || !vVar.f) {
                    cVar.f929c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.g = i7;
                    int i8 = cVar.f929c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    n1(rVar, cVar);
                }
                if (z2 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f929c;
    }

    public final View X0() {
        return d1(0, x());
    }

    public final View Y0(RecyclerView.r rVar, RecyclerView.v vVar) {
        return f1(rVar, vVar, 0, x(), vVar.b());
    }

    public final View Z0(boolean z2, boolean z3) {
        int x2;
        int i;
        if (this.v) {
            x2 = 0;
            i = x();
        } else {
            x2 = x() - 1;
            i = -1;
        }
        return e1(x2, i, z2, z3);
    }

    public final View a1(boolean z2, boolean z3) {
        int i;
        int x2;
        if (this.v) {
            i = x() - 1;
            x2 = -1;
        } else {
            i = 0;
            x2 = x();
        }
        return e1(i, x2, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b0(RecyclerView recyclerView, RecyclerView.r rVar) {
        a0();
    }

    public final View b1() {
        return d1(x() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void c(String str) {
        RecyclerView recyclerView;
        if (this.A == null && (recyclerView = this.f945b) != null) {
            recyclerView.i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View c0(View view, int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        int U0;
        View view2;
        q1();
        if (x() == 0 || (U0 = U0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        V0();
        V0();
        u1(U0, (int) (((float) this.s.l()) * 0.33333334f), false, vVar);
        c cVar = this.r;
        cVar.g = Integer.MIN_VALUE;
        cVar.f927a = false;
        W0(rVar, cVar, vVar, true);
        if (U0 == -1) {
            view2 = this.v ? b1() : X0();
        } else {
            view2 = this.v ? X0() : b1();
        }
        View j1 = U0 == -1 ? j1() : i1();
        if (!j1.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return j1;
    }

    public final View c1(RecyclerView.r rVar, RecyclerView.v vVar) {
        return f1(rVar, vVar, x() - 1, -1, vVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d() {
        return this.q == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.r rVar = this.f945b.f934c;
        e0(accessibilityEvent);
        if (x() > 0) {
            View e1 = e1(0, x(), false, true);
            int i = -1;
            accessibilityEvent.setFromIndex(e1 == null ? -1 : L(e1));
            View e12 = e1(x() - 1, -1, false, true);
            if (e12 != null) {
                i = L(e12);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    public View d1(int i, int i2) {
        int i3;
        int i4;
        V0();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return w(i);
        }
        if (this.s.e(w(i)) < this.s.k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.q == 0 ? this.e : this.f).a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.q == 1;
    }

    public View e1(int i, int i2, boolean z2, boolean z3) {
        V0();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return (this.q == 0 ? this.e : this.f).a(i, i2, i4, i3);
    }

    public View f1(RecyclerView.r rVar, RecyclerView.v vVar, int i, int i2, int i3) {
        V0();
        int k = this.s.k();
        int g = this.s.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View w2 = w(i);
            int L = L(w2);
            if (L >= 0 && L < i3) {
                if (((RecyclerView.m) w2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = w2;
                    }
                } else if (this.s.e(w2) < g && this.s.b(w2) >= k) {
                    return w2;
                } else {
                    if (view == null) {
                        view = w2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int g1(int i, RecyclerView.r rVar, RecyclerView.v vVar, boolean z2) {
        int g;
        int g2 = this.s.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -r1(-g2, rVar, vVar);
        int i3 = i + i2;
        if (!z2 || (g = this.s.g() - i3) <= 0) {
            return i2;
        }
        this.s.p(g);
        return g + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h(int i, int i2, RecyclerView.v vVar, RecyclerView.l.c cVar) {
        if (this.q != 0) {
            i = i2;
        }
        if (x() != 0 && i != 0) {
            V0();
            u1(i > 0 ? 1 : -1, Math.abs(i), true, vVar);
            Q0(vVar, this.r, cVar);
        }
    }

    public final int h1(int i, RecyclerView.r rVar, RecyclerView.v vVar, boolean z2) {
        int k;
        int k2 = i - this.s.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -r1(k2, rVar, vVar);
        int i3 = i + i2;
        if (!z2 || (k = i3 - this.s.k()) <= 0) {
            return i2;
        }
        this.s.p(-k);
        return i2 - k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i(int i, RecyclerView.l.c cVar) {
        boolean z2;
        int i2;
        d dVar = this.A;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            q1();
            z2 = this.v;
            i2 = this.y;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.A;
            z2 = dVar2.f932c;
            i2 = dVar2.f930a;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.D && i2 >= 0 && i2 < i; i4++) {
            ((n.b) cVar).a(i2, 0);
            i2 += i3;
        }
    }

    public final View i1() {
        return w(this.v ? 0 : x() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int j(RecyclerView.v vVar) {
        return R0(vVar);
    }

    public final View j1() {
        return w(this.v ? x() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.v vVar) {
        return S0(vVar);
    }

    public boolean k1() {
        return E() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.v vVar) {
        return T0(vVar);
    }

    public void l1(RecyclerView.r rVar, RecyclerView.v vVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View c2 = cVar.c(rVar);
        if (c2 == null) {
            bVar.f925b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) c2.getLayoutParams();
        if (cVar.j == null) {
            if (this.v == (cVar.f == -1)) {
                b(c2, -1, false);
            } else {
                b(c2, 0, false);
            }
        } else {
            if (this.v == (cVar.f == -1)) {
                b(c2, -1, true);
            } else {
                b(c2, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) c2.getLayoutParams();
        Rect L = this.f945b.L(c2);
        int y2 = RecyclerView.l.y(this.o, this.m, J() + I() + ((ViewGroup.MarginLayoutParams) mVar2).leftMargin + ((ViewGroup.MarginLayoutParams) mVar2).rightMargin + L.left + L.right + 0, ((ViewGroup.MarginLayoutParams) mVar2).width, d());
        int y3 = RecyclerView.l.y(this.p, this.n, H() + K() + ((ViewGroup.MarginLayoutParams) mVar2).topMargin + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin + L.top + L.bottom + 0, ((ViewGroup.MarginLayoutParams) mVar2).height, e());
        if (M0(c2, y2, y3, mVar2)) {
            c2.measure(y2, y3);
        }
        bVar.f924a = this.s.c(c2);
        if (this.q == 1) {
            if (k1()) {
                i5 = this.o - J();
                i4 = i5 - this.s.d(c2);
            } else {
                i4 = I();
                i5 = this.s.d(c2) + i4;
            }
            int i6 = cVar.f;
            int i7 = cVar.f928b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f924a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f924a + i7;
            }
        } else {
            int K = K();
            int d2 = this.s.d(c2) + K;
            int i8 = cVar.f;
            int i9 = cVar.f928b;
            if (i8 == -1) {
                i2 = i9;
                i3 = K;
                i = d2;
                i4 = i9 - bVar.f924a;
            } else {
                i3 = K;
                i2 = bVar.f924a + i9;
                i = d2;
                i4 = i9;
            }
        }
        U(c2, i4, i3, i2, i);
        if (mVar.c() || mVar.b()) {
            bVar.f926c = true;
        }
        bVar.d = c2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.v vVar) {
        return R0(vVar);
    }

    public void m1(RecyclerView.r rVar, RecyclerView.v vVar, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.v vVar) {
        return S0(vVar);
    }

    public final void n1(RecyclerView.r rVar, c cVar) {
        if (cVar.f927a && !cVar.k) {
            int i = cVar.f;
            int i2 = cVar.g;
            if (i == -1) {
                int x2 = x();
                if (i2 >= 0) {
                    int f = this.s.f() - i2;
                    if (this.v) {
                        for (int i3 = 0; i3 < x2; i3++) {
                            View w2 = w(i3);
                            if (this.s.e(w2) < f || this.s.o(w2) < f) {
                                o1(rVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = x2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View w3 = w(i5);
                        if (this.s.e(w3) < f || this.s.o(w3) < f) {
                            o1(rVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int x3 = x();
                if (this.v) {
                    int i6 = x3 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View w4 = w(i7);
                        if (this.s.b(w4) > i2 || this.s.n(w4) > i2) {
                            o1(rVar, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                for (int i8 = 0; i8 < x3; i8++) {
                    View w5 = w(i8);
                    if (this.s.b(w5) > i2 || this.s.n(w5) > i2) {
                        o1(rVar, 0, i8);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.v vVar) {
        return T0(vVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void o0(RecyclerView.r rVar, RecyclerView.v vVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View s2;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        View view;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!(this.A == null && this.y == -1) && vVar.b() == 0) {
            y0(rVar);
            return;
        }
        d dVar = this.A;
        if (dVar != null && dVar.a()) {
            this.y = this.A.f930a;
        }
        V0();
        this.r.f927a = false;
        q1();
        View D2 = D();
        a aVar = this.B;
        boolean z4 = true;
        if (!aVar.e || this.y != -1 || this.A != null) {
            aVar.d();
            a aVar2 = this.B;
            aVar2.d = this.v ^ this.w;
            if (!vVar.f && (i9 = this.y) != -1) {
                if (i9 < 0 || i9 >= vVar.b()) {
                    this.y = -1;
                    this.z = Integer.MIN_VALUE;
                } else {
                    aVar2.f922b = this.y;
                    d dVar2 = this.A;
                    if (dVar2 != null && dVar2.a()) {
                        boolean z5 = this.A.f932c;
                        aVar2.d = z5;
                        if (z5) {
                            i14 = this.s.g();
                            i13 = this.A.f931b;
                        } else {
                            i12 = this.s.k();
                            i11 = this.A.f931b;
                            i10 = i12 + i11;
                            aVar2.f923c = i10;
                            z2 = true;
                            if (!z2) {
                            }
                            this.B.e = true;
                        }
                    } else if (this.z == Integer.MIN_VALUE) {
                        View s3 = s(this.y);
                        if (s3 != null) {
                            if (this.s.c(s3) <= this.s.l()) {
                                if (this.s.e(s3) - this.s.k() < 0) {
                                    aVar2.f923c = this.s.k();
                                    aVar2.d = false;
                                } else if (this.s.g() - this.s.b(s3) < 0) {
                                    aVar2.f923c = this.s.g();
                                    aVar2.d = true;
                                } else {
                                    aVar2.f923c = aVar2.d ? this.s.m() + this.s.b(s3) : this.s.e(s3);
                                }
                                z2 = true;
                                if (!z2) {
                                    if (x() != 0) {
                                        View D3 = D();
                                        if (D3 != null) {
                                            RecyclerView.m mVar = (RecyclerView.m) D3.getLayoutParams();
                                            if (!mVar.c() && mVar.a() >= 0 && mVar.a() < vVar.b()) {
                                                aVar2.c(D3, L(D3));
                                                z3 = true;
                                                if (!z3) {
                                                    aVar2.a();
                                                    aVar2.f922b = this.w ? vVar.b() - 1 : 0;
                                                }
                                            }
                                        }
                                        if (this.t == this.w) {
                                            if (aVar2.d) {
                                                view = this.v ? Y0(rVar, vVar) : c1(rVar, vVar);
                                            } else {
                                                view = this.v ? c1(rVar, vVar) : Y0(rVar, vVar);
                                            }
                                            if (view != null) {
                                                aVar2.b(view, L(view));
                                                if (!vVar.f && P0()) {
                                                    if (this.s.e(view) >= this.s.g() || this.s.b(view) < this.s.k()) {
                                                        aVar2.f923c = aVar2.d ? this.s.g() : this.s.k();
                                                    }
                                                }
                                                z3 = true;
                                                if (!z3) {
                                                }
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                }
                                this.B.e = true;
                            }
                        } else if (x() > 0) {
                            aVar2.d = (this.y < L(w(0))) == this.v;
                        }
                        aVar2.a();
                        z2 = true;
                        if (!z2) {
                        }
                        this.B.e = true;
                    } else {
                        boolean z6 = this.v;
                        aVar2.d = z6;
                        if (z6) {
                            i14 = this.s.g();
                            i13 = this.z;
                        } else {
                            i12 = this.s.k();
                            i11 = this.z;
                            i10 = i12 + i11;
                            aVar2.f923c = i10;
                            z2 = true;
                            if (!z2) {
                            }
                            this.B.e = true;
                        }
                    }
                    i10 = i14 - i13;
                    aVar2.f923c = i10;
                    z2 = true;
                    if (!z2) {
                    }
                    this.B.e = true;
                }
            }
            z2 = false;
            if (!z2) {
            }
            this.B.e = true;
        } else if (D2 != null && (this.s.e(D2) >= this.s.g() || this.s.b(D2) <= this.s.k())) {
            this.B.c(D2, L(D2));
        }
        Objects.requireNonNull(vVar);
        int i15 = this.r.i;
        int k = this.s.k() + 0;
        int h = this.s.h() + 0;
        if (!(!vVar.f || (i6 = this.y) == -1 || this.z == Integer.MIN_VALUE || (s2 = s(i6)) == null)) {
            if (this.v) {
                i7 = this.s.g() - this.s.b(s2);
                i8 = this.z;
            } else {
                i8 = this.s.e(s2) - this.s.k();
                i7 = this.z;
            }
            int i16 = i7 - i8;
            if (i16 > 0) {
                k += i16;
            } else {
                h -= i16;
            }
        }
        a aVar3 = this.B;
        m1(rVar, vVar, aVar3, (!aVar3.d ? !this.v : this.v) ? 1 : -1);
        p(rVar);
        this.r.k = p1();
        Objects.requireNonNull(this.r);
        a aVar4 = this.B;
        if (aVar4.d) {
            w1(aVar4.f922b, aVar4.f923c);
            c cVar = this.r;
            cVar.h = k;
            W0(rVar, cVar, vVar, false);
            c cVar2 = this.r;
            i = cVar2.f928b;
            int i17 = cVar2.d;
            int i18 = cVar2.f929c;
            if (i18 > 0) {
                h += i18;
            }
            a aVar5 = this.B;
            v1(aVar5.f922b, aVar5.f923c);
            c cVar3 = this.r;
            cVar3.h = h;
            cVar3.d += cVar3.e;
            W0(rVar, cVar3, vVar, false);
            c cVar4 = this.r;
            i2 = cVar4.f928b;
            int i19 = cVar4.f929c;
            if (i19 > 0) {
                w1(i17, i);
                c cVar5 = this.r;
                cVar5.h = i19;
                W0(rVar, cVar5, vVar, false);
                i = this.r.f928b;
            }
        } else {
            v1(aVar4.f922b, aVar4.f923c);
            c cVar6 = this.r;
            cVar6.h = h;
            W0(rVar, cVar6, vVar, false);
            c cVar7 = this.r;
            int i20 = cVar7.f928b;
            int i21 = cVar7.d;
            int i22 = cVar7.f929c;
            if (i22 > 0) {
                k += i22;
            }
            a aVar6 = this.B;
            w1(aVar6.f922b, aVar6.f923c);
            c cVar8 = this.r;
            cVar8.h = k;
            cVar8.d += cVar8.e;
            W0(rVar, cVar8, vVar, false);
            c cVar9 = this.r;
            int i23 = cVar9.f928b;
            int i24 = cVar9.f929c;
            if (i24 > 0) {
                v1(i21, i20);
                c cVar10 = this.r;
                cVar10.h = i24;
                W0(rVar, cVar10, vVar, false);
                i = i23;
                i2 = this.r.f928b;
            } else {
                i = i23;
                i2 = i20;
            }
        }
        if (x() > 0) {
            if (this.v ^ this.w) {
                int g1 = g1(i2, rVar, vVar, true);
                i3 = i + g1;
                i4 = i2 + g1;
                i5 = h1(i3, rVar, vVar, false);
            } else {
                int h1 = h1(i, rVar, vVar, true);
                i3 = i + h1;
                i4 = i2 + h1;
                i5 = g1(i4, rVar, vVar, false);
            }
            i = i3 + i5;
            i2 = i4 + i5;
        }
        if (vVar.j && x() != 0 && !vVar.f && P0()) {
            List<RecyclerView.y> list = rVar.d;
            int size = list.size();
            int L = L(w(0));
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i25 < size) {
                RecyclerView.y yVar = list.get(i25);
                if (!yVar.l()) {
                    boolean z7 = (yVar.f() < L ? z4 : false) != this.v ? true : true;
                    int c2 = this.s.c(yVar.f970b);
                    if (z7) {
                        i26 += c2;
                    } else {
                        i27 += c2;
                    }
                }
                i25++;
                z4 = true;
            }
            this.r.j = list;
            if (i26 > 0) {
                w1(L(j1()), i);
                c cVar11 = this.r;
                cVar11.h = i26;
                cVar11.f929c = 0;
                cVar11.a(null);
                W0(rVar, this.r, vVar, false);
            }
            if (i27 > 0) {
                v1(L(i1()), i2);
                c cVar12 = this.r;
                cVar12.h = i27;
                cVar12.f929c = 0;
                cVar12.a(null);
                W0(rVar, this.r, vVar, false);
            }
            this.r.j = null;
        }
        if (!vVar.f) {
            s sVar = this.s;
            sVar.f721b = sVar.l();
        } else {
            this.B.d();
        }
        this.t = this.w;
    }

    public final void o1(RecyclerView.r rVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    B0(i3, rVar);
                }
                return;
            }
            while (i > i2) {
                B0(i, rVar);
                i--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void p0(RecyclerView.v vVar) {
        this.A = null;
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.B.d();
    }

    public boolean p1() {
        return this.s.i() == 0 && this.s.f() == 0;
    }

    public final void q1() {
        this.v = (this.q == 1 || !k1()) ? this.u : !this.u;
    }

    public int r1(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        this.r.f927a = true;
        V0();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        u1(i2, abs, true, vVar);
        c cVar = this.r;
        int W0 = W0(rVar, cVar, vVar, false) + cVar.g;
        if (W0 < 0) {
            return 0;
        }
        if (abs > W0) {
            i = i2 * W0;
        }
        this.s.p(-i);
        this.r.i = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View s(int i) {
        int x2 = x();
        if (x2 == 0) {
            return null;
        }
        int L = i - L(w(0));
        if (L >= 0 && L < x2) {
            View w2 = w(L);
            if (L(w2) == i) {
                return w2;
            }
        }
        return super.s(i);
    }

    public void s1(int i) {
        if (i == 0 || i == 1) {
            c(null);
            if (i != this.q || this.s == null) {
                s a2 = s.a(this, i);
                this.s = a2;
                this.B.f921a = a2;
                this.q = i;
                E0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m t() {
        return new RecyclerView.m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void t0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.A = (d) parcelable;
            E0();
        }
    }

    public void t1(boolean z2) {
        c(null);
        if (this.w != z2) {
            this.w = z2;
            E0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable u0() {
        d dVar = this.A;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (x() > 0) {
            V0();
            boolean z2 = this.t ^ this.v;
            dVar2.f932c = z2;
            if (z2) {
                View i1 = i1();
                dVar2.f931b = this.s.g() - this.s.b(i1);
                dVar2.f930a = L(i1);
            } else {
                View j1 = j1();
                dVar2.f930a = L(j1);
                dVar2.f931b = this.s.e(j1) - this.s.k();
            }
        } else {
            dVar2.f930a = -1;
        }
        return dVar2;
    }

    public final void u1(int i, int i2, boolean z2, RecyclerView.v vVar) {
        int i3;
        this.r.k = p1();
        c cVar = this.r;
        Objects.requireNonNull(vVar);
        cVar.h = 0;
        c cVar2 = this.r;
        cVar2.f = i;
        int i4 = -1;
        if (i == 1) {
            cVar2.h = this.s.h() + cVar2.h;
            View i1 = i1();
            c cVar3 = this.r;
            if (!this.v) {
                i4 = 1;
            }
            cVar3.e = i4;
            int L = L(i1);
            c cVar4 = this.r;
            cVar3.d = L + cVar4.e;
            cVar4.f928b = this.s.b(i1);
            i3 = this.s.b(i1) - this.s.g();
        } else {
            View j1 = j1();
            c cVar5 = this.r;
            cVar5.h = this.s.k() + cVar5.h;
            c cVar6 = this.r;
            if (this.v) {
                i4 = 1;
            }
            cVar6.e = i4;
            int L2 = L(j1);
            c cVar7 = this.r;
            cVar6.d = L2 + cVar7.e;
            cVar7.f928b = this.s.e(j1);
            i3 = (-this.s.e(j1)) + this.s.k();
        }
        c cVar8 = this.r;
        cVar8.f929c = i2;
        if (z2) {
            cVar8.f929c = i2 - i3;
        }
        cVar8.g = i3;
    }

    public final void v1(int i, int i2) {
        this.r.f929c = this.s.g() - i2;
        c cVar = this.r;
        cVar.e = this.v ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.f928b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void w1(int i, int i2) {
        this.r.f929c = i2 - this.s.k();
        c cVar = this.r;
        cVar.d = i;
        cVar.e = this.v ? 1 : -1;
        cVar.f = -1;
        cVar.f928b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.l.d M = RecyclerView.l.M(context, attributeSet, i, i2);
        s1(M.f949a);
        boolean z2 = M.f951c;
        c(null);
        if (z2 != this.u) {
            this.u = z2;
            E0();
        }
        t1(M.d);
    }
}
