package androidx.recyclerview.widget;

import a.h.j.w.d;
import a.o.b.n;
import a.o.b.o;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

public class StaggeredGridLayoutManager extends RecyclerView.l {
    public int A;
    public int B;
    public d C;
    public int D;
    public boolean E;
    public boolean F;
    public e G;
    public int H;
    public final Rect I;
    public final b J;
    public boolean K;
    public int[] L;
    public final Runnable M;
    public int q = -1;
    public f[] r;
    public s s;
    public s t;
    public int u;
    public int v;
    public final o w;
    public boolean x;
    public boolean y;
    public BitSet z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.Q0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f973a;

        /* renamed from: b  reason: collision with root package name */
        public int f974b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f975c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            b();
        }

        public void a() {
            this.f974b = this.f975c ? StaggeredGridLayoutManager.this.s.g() : StaggeredGridLayoutManager.this.s.k();
        }

        public void b() {
            this.f973a = -1;
            this.f974b = Integer.MIN_VALUE;
            this.f975c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.m {
        public f e;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f976a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f977b;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0027a();

            /* renamed from: a  reason: collision with root package name */
            public int f978a;

            /* renamed from: b  reason: collision with root package name */
            public int f979b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f980c;
            public boolean d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0027a implements Parcelable.Creator<a> {
                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f978a = parcel.readInt();
                this.f979b = parcel.readInt();
                this.d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f980c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder d2 = b.a.a.a.a.d("FullSpanItem{mPosition=");
                d2.append(this.f978a);
                d2.append(", mGapDir=");
                d2.append(this.f979b);
                d2.append(", mHasUnwantedGapAfter=");
                d2.append(this.d);
                d2.append(", mGapPerSpan=");
                d2.append(Arrays.toString(this.f980c));
                d2.append('}');
                return d2.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f978a);
                parcel.writeInt(this.f979b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.f980c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f980c);
            }
        }

        public void a() {
            int[] iArr = this.f976a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f977b = null;
        }

        public void b(int i) {
            int[] iArr = this.f976a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f976a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f976a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f976a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i) {
            List<a> list = this.f977b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f977b.get(size);
                if (aVar.f978a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        public int d(int i) {
            int i2;
            int[] iArr = this.f976a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.f977b != null) {
                a c2 = c(i);
                if (c2 != null) {
                    this.f977b.remove(c2);
                }
                int size = this.f977b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    } else if (this.f977b.get(i3).f978a >= i) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    this.f977b.remove(i3);
                    i2 = this.f977b.get(i3).f978a;
                    if (i2 != -1) {
                        int[] iArr2 = this.f976a;
                        Arrays.fill(iArr2, i, iArr2.length, -1);
                        return this.f976a.length;
                    }
                    int i4 = i2 + 1;
                    Arrays.fill(this.f976a, i, i4, -1);
                    return i4;
                }
            }
            i2 = -1;
            if (i2 != -1) {
            }
        }

        public void e(int i, int i2) {
            int[] iArr = this.f976a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                b(i3);
                int[] iArr2 = this.f976a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f976a, i, i3, -1);
                List<a> list = this.f977b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f977b.get(size);
                        int i4 = aVar.f978a;
                        if (i4 >= i) {
                            aVar.f978a = i4 + i2;
                        }
                    }
                }
            }
        }

        public void f(int i, int i2) {
            int[] iArr = this.f976a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                b(i3);
                int[] iArr2 = this.f976a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f976a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<a> list = this.f977b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f977b.get(size);
                        int i4 = aVar.f978a;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f977b.remove(size);
                            } else {
                                aVar.f978a = i4 - i2;
                            }
                        }
                    }
                }
            }
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f981a;

        /* renamed from: b  reason: collision with root package name */
        public int f982b;

        /* renamed from: c  reason: collision with root package name */
        public int f983c;
        public int[] d;
        public int e;
        public int[] f;
        public List<d.a> g;
        public boolean h;
        public boolean i;
        public boolean j;

        public static class a implements Parcelable.Creator<e> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f981a = parcel.readInt();
            this.f982b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f983c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1 ? true : z;
            this.g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f983c = eVar.f983c;
            this.f981a = eVar.f981a;
            this.f982b = eVar.f982b;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.g = eVar.g;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f981a);
            parcel.writeInt(this.f982b);
            parcel.writeInt(this.f983c);
            if (this.f983c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f984a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f985b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f986c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public void a(View view) {
            c j = j(view);
            j.e = this;
            this.f984a.add(view);
            this.f986c = Integer.MIN_VALUE;
            if (this.f984a.size() == 1) {
                this.f985b = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d = StaggeredGridLayoutManager.this.s.c(view) + this.d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.f984a;
            View view = arrayList.get(arrayList.size() - 1);
            c j = j(view);
            this.f986c = StaggeredGridLayoutManager.this.s.b(view);
            Objects.requireNonNull(j);
        }

        public void c() {
            View view = this.f984a.get(0);
            c j = j(view);
            this.f985b = StaggeredGridLayoutManager.this.s.e(view);
            Objects.requireNonNull(j);
        }

        public void d() {
            this.f984a.clear();
            this.f985b = Integer.MIN_VALUE;
            this.f986c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public int e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.x) {
                i2 = this.f984a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f984a.size();
            }
            return g(i2, i, true);
        }

        public int f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.x) {
                i2 = 0;
                i = this.f984a.size();
            } else {
                i2 = this.f984a.size() - 1;
                i = -1;
            }
            return g(i2, i, true);
        }

        public int g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.s.k();
            int g = StaggeredGridLayoutManager.this.s.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f984a.get(i);
                int e2 = StaggeredGridLayoutManager.this.s.e(view);
                int b2 = StaggeredGridLayoutManager.this.s.b(view);
                boolean z2 = false;
                boolean z3 = !z ? e2 < g : e2 <= g;
                if (!z ? b2 > k : b2 >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e2 < k || b2 > g)) {
                    return StaggeredGridLayoutManager.this.L(view);
                }
                i += i3;
            }
            return -1;
        }

        public int h(int i) {
            int i2 = this.f986c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f984a.size() == 0) {
                return i;
            }
            b();
            return this.f986c;
        }

        public View i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f984a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f984a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.x && staggeredGridLayoutManager.L(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.x && staggeredGridLayoutManager2.L(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f984a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f984a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.x && staggeredGridLayoutManager3.L(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.x && staggeredGridLayoutManager4.L(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i) {
            int i2 = this.f985b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f984a.size() == 0) {
                return i;
            }
            c();
            return this.f985b;
        }

        public void l() {
            int size = this.f984a.size();
            View remove = this.f984a.remove(size - 1);
            c j = j(remove);
            j.e = null;
            if (j.c() || j.b()) {
                this.d -= StaggeredGridLayoutManager.this.s.c(remove);
            }
            if (size == 1) {
                this.f985b = Integer.MIN_VALUE;
            }
            this.f986c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.f984a.remove(0);
            c j = j(remove);
            j.e = null;
            if (this.f984a.size() == 0) {
                this.f986c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d -= StaggeredGridLayoutManager.this.s.c(remove);
            }
            this.f985b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j = j(view);
            j.e = this;
            this.f984a.add(0, view);
            this.f985b = Integer.MIN_VALUE;
            if (this.f984a.size() == 1) {
                this.f986c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d = StaggeredGridLayoutManager.this.s.c(view) + this.d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.x = false;
        this.y = false;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.C = new d();
        this.D = 2;
        this.I = new Rect();
        this.J = new b();
        this.K = true;
        this.M = new a();
        RecyclerView.l.d M2 = RecyclerView.l.M(context, attributeSet, i, i2);
        int i3 = M2.f949a;
        if (i3 == 0 || i3 == 1) {
            c(null);
            if (i3 != this.u) {
                this.u = i3;
                s sVar = this.s;
                this.s = this.t;
                this.t = sVar;
                E0();
            }
            int i4 = M2.f950b;
            c(null);
            if (i4 != this.q) {
                this.C.a();
                E0();
                this.q = i4;
                this.z = new BitSet(this.q);
                this.r = new f[this.q];
                for (int i5 = 0; i5 < this.q; i5++) {
                    this.r[i5] = new f(i5);
                }
                E0();
            }
            boolean z2 = M2.f951c;
            c(null);
            e eVar = this.G;
            if (!(eVar == null || eVar.h == z2)) {
                eVar.h = z2;
            }
            this.x = z2;
            E0();
            this.w = new o();
            this.s = s.a(this, this.u);
            this.t = s.a(this, 1 - this.u);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int A(RecyclerView.r rVar, RecyclerView.v vVar) {
        return this.u == 1 ? this.q : super.A(rVar, vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int F0(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        return o1(i, rVar, vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int G0(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        return o1(i, rVar, vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void J0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int J2 = J() + I();
        int H2 = H() + K();
        if (this.u == 1) {
            i4 = RecyclerView.l.g(i2, rect.height() + H2, F());
            i3 = RecyclerView.l.g(i, (this.v * this.q) + J2, G());
        } else {
            i3 = RecyclerView.l.g(i, rect.width() + J2, G());
            i4 = RecyclerView.l.g(i2, (this.v * this.q) + H2, F());
        }
        this.f945b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int N(RecyclerView.r rVar, RecyclerView.v vVar) {
        return this.u == 0 ? this.q : super.N(rVar, vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean P0() {
        return this.G == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean Q() {
        return this.D != 0;
    }

    public boolean Q0() {
        int i;
        if (!(x() == 0 || this.D == 0 || !this.h)) {
            if (this.y) {
                i = a1();
                Z0();
            } else {
                i = Z0();
                a1();
            }
            if (i == 0 && e1() != null) {
                this.C.a();
                this.g = true;
                E0();
                return true;
            }
        }
        return false;
    }

    public final int R0(RecyclerView.v vVar) {
        if (x() == 0) {
            return 0;
        }
        return a.h.b.d.f(vVar, this.s, W0(!this.K), V0(!this.K), this, this.K);
    }

    public final int S0(RecyclerView.v vVar) {
        if (x() == 0) {
            return 0;
        }
        return a.h.b.d.g(vVar, this.s, W0(!this.K), V0(!this.K), this, this.K, this.y);
    }

    public final int T0(RecyclerView.v vVar) {
        if (x() == 0) {
            return 0;
        }
        return a.h.b.d.h(vVar, this.s, W0(!this.K), V0(!this.K), this, this.K);
    }

    public final int U0(RecyclerView.r rVar, o oVar, RecyclerView.v vVar) {
        int i;
        f fVar;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        boolean z5 = false;
        this.z.set(0, this.q, true);
        if (this.w.i) {
            i = oVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = oVar.e == 1 ? oVar.g + oVar.f717b : oVar.f - oVar.f717b;
        }
        q1(oVar.e, i);
        int g = this.y ? this.s.g() : this.s.k();
        Object[] objArr = null;
        while (true) {
            int i14 = oVar.f718c;
            if (((i14 < 0 || i14 >= vVar.b()) ? z5 : true) && (this.w.i || !this.z.isEmpty())) {
                View view = rVar.j(oVar.f718c, z5, Long.MAX_VALUE).f970b;
                oVar.f718c += oVar.d;
                c cVar = (c) view.getLayoutParams();
                int a2 = cVar.a();
                int[] iArr = this.C.f976a;
                int i15 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
                if (i15 == -1 ? true : z5) {
                    if (i1(oVar.e)) {
                        i13 = this.q - 1;
                        i12 = -1;
                        i11 = -1;
                    } else {
                        i12 = this.q;
                        int i16 = z5 ? 1 : 0;
                        Object[] objArr2 = z5 ? 1 : 0;
                        Object[] objArr3 = z5 ? 1 : 0;
                        i13 = i16;
                        i11 = 1;
                    }
                    f fVar2 = null;
                    if (oVar.e == 1) {
                        int k = this.s.k();
                        int i17 = Integer.MAX_VALUE;
                        while (i13 != i12) {
                            f fVar3 = this.r[i13];
                            int h = fVar3.h(k);
                            if (h < i17) {
                                fVar2 = fVar3;
                                i17 = h;
                            }
                            i13 += i11;
                        }
                    } else {
                        int g2 = this.s.g();
                        int i18 = Integer.MIN_VALUE;
                        while (i13 != i12) {
                            f fVar4 = this.r[i13];
                            int k2 = fVar4.k(g2);
                            if (k2 > i18) {
                                fVar2 = fVar4;
                                i18 = k2;
                            }
                            i13 += i11;
                        }
                    }
                    fVar = fVar2;
                    d dVar = this.C;
                    dVar.b(a2);
                    dVar.f976a[a2] = fVar.e;
                } else {
                    fVar = this.r[i15];
                }
                cVar.e = fVar;
                if (oVar.e == 1) {
                    z2 = false;
                    b(view, -1, false);
                } else {
                    z2 = false;
                    b(view, 0, false);
                }
                if (this.u == 1) {
                    int i19 = this.v;
                    int i20 = this.m;
                    int i21 = ((ViewGroup.MarginLayoutParams) cVar).width;
                    int i22 = z2 ? 1 : 0;
                    int i23 = z2 ? 1 : 0;
                    int i24 = z2 ? 1 : 0;
                    i3 = RecyclerView.l.y(i19, i20, i22, i21, z2);
                    i2 = RecyclerView.l.y(this.p, this.n, H() + K(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
                    z3 = false;
                } else {
                    i3 = RecyclerView.l.y(this.o, this.m, J() + I(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                    z3 = false;
                    i2 = RecyclerView.l.y(this.v, this.n, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                }
                g1(view, i3, i2, z3);
                if (oVar.e == 1) {
                    i5 = fVar.h(g);
                    i4 = this.s.c(view) + i5;
                } else {
                    i4 = fVar.k(g);
                    i5 = i4 - this.s.c(view);
                }
                int i25 = oVar.e;
                f fVar5 = cVar.e;
                if (i25 == 1) {
                    fVar5.a(view);
                } else {
                    fVar5.n(view);
                }
                if (!f1() || this.u != 1) {
                    i6 = this.t.k() + (fVar.e * this.v);
                    i7 = this.t.c(view) + i6;
                } else {
                    i7 = this.t.g() - (((this.q - 1) - fVar.e) * this.v);
                    i6 = i7 - this.t.c(view);
                }
                if (this.u == 1) {
                    i9 = i7;
                    i8 = i4;
                    i10 = i6;
                    i6 = i5;
                } else {
                    i8 = i7;
                    i9 = i4;
                    i10 = i5;
                }
                U(view, i10, i6, i9, i8);
                s1(fVar, this.w.e, i);
                k1(rVar, this.w);
                if (!this.w.h || !view.hasFocusable()) {
                    z4 = false;
                } else {
                    BitSet bitSet = this.z;
                    int i26 = fVar.e;
                    z4 = false;
                    bitSet.set(i26, false);
                }
                z5 = z4;
                objArr = 1;
            }
        }
        if (objArr == null) {
            k1(rVar, this.w);
        }
        int k3 = this.w.e == -1 ? this.s.k() - c1(this.s.k()) : b1(this.s.g()) - this.s.g();
        if (k3 > 0) {
            return Math.min(oVar.f717b, k3);
        }
        int i27 = z5 ? 1 : 0;
        int i28 = z5 ? 1 : 0;
        int i29 = z5 ? 1 : 0;
        return i27;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void V(int i) {
        super.V(i);
        for (int i2 = 0; i2 < this.q; i2++) {
            f fVar = this.r[i2];
            int i3 = fVar.f985b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f985b = i3 + i;
            }
            int i4 = fVar.f986c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f986c = i4 + i;
            }
        }
    }

    public View V0(boolean z2) {
        int k = this.s.k();
        int g = this.s.g();
        View view = null;
        for (int x2 = x() - 1; x2 >= 0; x2--) {
            View w2 = w(x2);
            int e2 = this.s.e(w2);
            int b2 = this.s.b(w2);
            if (b2 > k && e2 < g) {
                if (b2 <= g || !z2) {
                    return w2;
                }
                if (view == null) {
                    view = w2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void W(int i) {
        super.W(i);
        for (int i2 = 0; i2 < this.q; i2++) {
            f fVar = this.r[i2];
            int i3 = fVar.f985b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f985b = i3 + i;
            }
            int i4 = fVar.f986c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f986c = i4 + i;
            }
        }
    }

    public View W0(boolean z2) {
        int k = this.s.k();
        int g = this.s.g();
        int x2 = x();
        View view = null;
        for (int i = 0; i < x2; i++) {
            View w2 = w(i);
            int e2 = this.s.e(w2);
            if (this.s.b(w2) > k && e2 < g) {
                if (e2 >= k || !z2) {
                    return w2;
                }
                if (view == null) {
                    view = w2;
                }
            }
        }
        return view;
    }

    public final void X0(RecyclerView.r rVar, RecyclerView.v vVar, boolean z2) {
        int g;
        int b1 = b1(Integer.MIN_VALUE);
        if (b1 != Integer.MIN_VALUE && (g = this.s.g() - b1) > 0) {
            int i = g - (-o1(-g, rVar, vVar));
            if (z2 && i > 0) {
                this.s.p(i);
            }
        }
    }

    public final void Y0(RecyclerView.r rVar, RecyclerView.v vVar, boolean z2) {
        int k;
        int c1 = c1(Integer.MAX_VALUE);
        if (c1 != Integer.MAX_VALUE && (k = c1 - this.s.k()) > 0) {
            int o1 = k - o1(k, rVar, vVar);
            if (z2 && o1 > 0) {
                this.s.p(-o1);
            }
        }
    }

    public int Z0() {
        if (x() == 0) {
            return 0;
        }
        return L(w(0));
    }

    public int a1() {
        int x2 = x();
        if (x2 == 0) {
            return 0;
        }
        return L(w(x2 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b0(RecyclerView recyclerView, RecyclerView.r rVar) {
        a0();
        Runnable runnable = this.M;
        RecyclerView recyclerView2 = this.f945b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.q; i++) {
            this.r[i].d();
        }
        recyclerView.requestLayout();
    }

    public final int b1(int i) {
        int h = this.r[0].h(i);
        for (int i2 = 1; i2 < this.q; i2++) {
            int h2 = this.r[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void c(String str) {
        RecyclerView recyclerView;
        if (this.G == null && (recyclerView = this.f945b) != null) {
            recyclerView.i(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.u == 1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.u == 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (f1() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        if (f1() == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View c0(View view, int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        View r2;
        int i2;
        if (x() == 0 || (r2 = r(view)) == null) {
            return null;
        }
        n1();
        if (i == 1) {
            if (this.u != 1) {
            }
            i2 = -1;
            if (i2 == Integer.MIN_VALUE) {
            }
        } else if (i != 2) {
            if (i != 17) {
                if (i != 33) {
                    if (i == 66) {
                    }
                }
            }
            i2 = Integer.MIN_VALUE;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            c cVar = (c) r2.getLayoutParams();
            Objects.requireNonNull(cVar);
            f fVar = cVar.e;
            int a1 = i2 == 1 ? a1() : Z0();
            r1(a1, vVar);
            p1(i2);
            o oVar = this.w;
            oVar.f718c = oVar.d + a1;
            oVar.f717b = (int) (((float) this.s.l()) * 0.33333334f);
            o oVar2 = this.w;
            oVar2.h = true;
            oVar2.f716a = false;
            U0(rVar, oVar2, vVar);
            this.E = this.y;
            View i3 = fVar.i(a1, i2);
            if (!(i3 == null || i3 == r2)) {
                return i3;
            }
            if (i1(i2)) {
                for (int i4 = this.q - 1; i4 >= 0; i4--) {
                    View i5 = this.r[i4].i(a1, i2);
                    if (!(i5 == null || i5 == r2)) {
                        return i5;
                    }
                }
            } else {
                for (int i6 = 0; i6 < this.q; i6++) {
                    View i7 = this.r[i6].i(a1, i2);
                    if (!(i7 == null || i7 == r2)) {
                        return i7;
                    }
                }
            }
            boolean z2 = (this.x ^ true) == (i2 == -1);
            View s2 = s(z2 ? fVar.e() : fVar.f());
            if (!(s2 == null || s2 == r2)) {
                return s2;
            }
            if (i1(i2)) {
                for (int i8 = this.q - 1; i8 >= 0; i8--) {
                    if (i8 != fVar.e) {
                        f[] fVarArr = this.r;
                        View s3 = s(z2 ? fVarArr[i8].e() : fVarArr[i8].f());
                        if (!(s3 == null || s3 == r2)) {
                            return s3;
                        }
                    }
                }
            } else {
                for (int i9 = 0; i9 < this.q; i9++) {
                    f[] fVarArr2 = this.r;
                    View s4 = s(z2 ? fVarArr2[i9].e() : fVarArr2[i9].f());
                    if (!(s4 == null || s4 == r2)) {
                        return s4;
                    }
                }
            }
            return null;
        } else if (this.u != 1) {
        }
        i2 = 1;
        if (i2 == Integer.MIN_VALUE) {
        }
    }

    public final int c1(int i) {
        int k = this.r[0].k(i);
        for (int i2 = 1; i2 < this.q; i2++) {
            int k2 = this.r[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d() {
        return this.u == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.r rVar = this.f945b.f934c;
        e0(accessibilityEvent);
        if (x() > 0) {
            View W0 = W0(false);
            View V0 = V0(false);
            if (W0 != null && V0 != null) {
                int L2 = L(W0);
                int L3 = L(V0);
                if (L2 < L3) {
                    accessibilityEvent.setFromIndex(L2);
                    accessibilityEvent.setToIndex(L3);
                    return;
                }
                accessibilityEvent.setFromIndex(L3);
                accessibilityEvent.setToIndex(L2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    public final void d1(int i, int i2, int i3) {
        int i4;
        int i5;
        int a1 = this.y ? a1() : Z0();
        if (i3 != 8) {
            i5 = i + i2;
        } else if (i < i2) {
            i5 = i2 + 1;
        } else {
            i5 = i + 1;
            i4 = i2;
            this.C.d(i4);
            if (i3 != 1) {
                this.C.e(i, i2);
            } else if (i3 == 2) {
                this.C.f(i, i2);
            } else if (i3 == 8) {
                this.C.f(i, 1);
                this.C.e(i2, 1);
            }
            if (i5 <= a1) {
                if (i4 <= (this.y ? Z0() : a1())) {
                    E0();
                    return;
                }
                return;
            }
            return;
        }
        i4 = i;
        this.C.d(i4);
        if (i3 != 1) {
        }
        if (i5 <= a1) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.u == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0090 A[SYNTHETIC] */
    public View e1() {
        int i;
        boolean z2;
        View view;
        int x2 = x() - 1;
        BitSet bitSet = new BitSet(this.q);
        bitSet.set(0, this.q, true);
        int i2 = -1;
        char c2 = (this.u != 1 || !f1()) ? (char) 65535 : 1;
        if (this.y) {
            i = -1;
        } else {
            i = x2 + 1;
            x2 = 0;
        }
        if (x2 < i) {
            i2 = 1;
        }
        while (x2 != i) {
            View w2 = w(x2);
            c cVar = (c) w2.getLayoutParams();
            if (bitSet.get(cVar.e.e)) {
                f fVar = cVar.e;
                if (this.y) {
                    int i3 = fVar.f986c;
                    if (i3 == Integer.MIN_VALUE) {
                        fVar.b();
                        i3 = fVar.f986c;
                    }
                    if (i3 < this.s.g()) {
                        ArrayList<View> arrayList = fVar.f984a;
                        view = arrayList.get(arrayList.size() - 1);
                    }
                    z2 = false;
                    if (z2) {
                        return w2;
                    }
                    bitSet.clear(cVar.e.e);
                } else {
                    int i4 = fVar.f985b;
                    if (i4 == Integer.MIN_VALUE) {
                        fVar.c();
                        i4 = fVar.f985b;
                    }
                    if (i4 > this.s.k()) {
                        view = fVar.f984a.get(0);
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                Objects.requireNonNull(fVar.j(view));
                z2 = true;
                if (z2) {
                }
            }
            int i5 = x2 + i2;
            if (i5 != i) {
                View w3 = w(i5);
                if (this.y) {
                    int b2 = this.s.b(w2);
                    int b3 = this.s.b(w3);
                    if (b2 < b3) {
                        return w2;
                    }
                } else {
                    int e2 = this.s.e(w2);
                    int e3 = this.s.e(w3);
                    if (e2 > e3) {
                        return w2;
                    }
                }
                boolean z3 = true;
                if (!z3) {
                    continue;
                } else {
                    if ((cVar.e.e - ((c) w3.getLayoutParams()).e.e < 0) != (c2 < 0)) {
                        return w2;
                    }
                }
            }
            x2 += i2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    public boolean f1() {
        return E() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g0(RecyclerView.r rVar, RecyclerView.v vVar, View view, a.h.j.w.d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            f0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.u == 0) {
            f fVar = cVar.e;
            i4 = fVar == null ? -1 : fVar.e;
            i3 = 1;
            i2 = -1;
            i = -1;
        } else {
            f fVar2 = cVar.e;
            i2 = fVar2 == null ? -1 : fVar2.e;
            i = 1;
            i4 = -1;
            i3 = -1;
        }
        dVar.g(d.b.a(i4, i3, i2, i, false, false));
    }

    public final void g1(View view, int i, int i2, boolean z2) {
        Rect rect = this.I;
        RecyclerView recyclerView = this.f945b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect2 = this.I;
        int t1 = t1(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect3 = this.I;
        int t12 = t1(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect3.bottom);
        if (z2 ? O0(view, t1, t12, cVar) : M0(view, t1, t12, cVar)) {
            view.measure(t1, t12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h(int i, int i2, RecyclerView.v vVar, RecyclerView.l.c cVar) {
        int i3;
        int i4;
        if (this.u != 0) {
            i = i2;
        }
        if (!(x() == 0 || i == 0)) {
            j1(i, vVar);
            int[] iArr = this.L;
            if (iArr == null || iArr.length < this.q) {
                this.L = new int[this.q];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.q; i6++) {
                o oVar = this.w;
                if (oVar.d == -1) {
                    i4 = oVar.f;
                    i3 = this.r[i6].k(i4);
                } else {
                    i4 = this.r[i6].h(oVar.g);
                    i3 = this.w.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.L[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.L, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = this.w.f718c;
                if (i9 >= 0 && i9 < vVar.b()) {
                    ((n.b) cVar).a(this.w.f718c, this.L[i8]);
                    o oVar2 = this.w;
                    oVar2.f718c += oVar2.d;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018f, code lost:
        if ((r6 < Z0()) != r11.y) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0193, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x040c, code lost:
        if (Q0() != false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0181, code lost:
        if (r11.y != false) goto L_0x0193;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01c4  */
    public final void h1(RecyclerView.r rVar, RecyclerView.v vVar, boolean z2) {
        e eVar;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        b bVar = this.J;
        if (!(this.G == null && this.A == -1) && vVar.b() == 0) {
            y0(rVar);
            bVar.b();
            return;
        }
        boolean z5 = true;
        boolean z6 = (bVar.e && this.A == -1 && this.G == null) ? false : true;
        if (z6) {
            bVar.b();
            e eVar2 = this.G;
            if (eVar2 != null) {
                int i7 = eVar2.f983c;
                if (i7 > 0) {
                    if (i7 == this.q) {
                        for (int i8 = 0; i8 < this.q; i8++) {
                            this.r[i8].d();
                            e eVar3 = this.G;
                            int i9 = eVar3.d[i8];
                            if (i9 != Integer.MIN_VALUE) {
                                i9 += eVar3.i ? this.s.g() : this.s.k();
                            }
                            f fVar = this.r[i8];
                            fVar.f985b = i9;
                            fVar.f986c = i9;
                        }
                    } else {
                        eVar2.d = null;
                        eVar2.f983c = 0;
                        eVar2.e = 0;
                        eVar2.f = null;
                        eVar2.g = null;
                        eVar2.f981a = eVar2.f982b;
                    }
                }
                e eVar4 = this.G;
                this.F = eVar4.j;
                boolean z7 = eVar4.h;
                c(null);
                e eVar5 = this.G;
                if (!(eVar5 == null || eVar5.h == z7)) {
                    eVar5.h = z7;
                }
                this.x = z7;
                E0();
                n1();
                e eVar6 = this.G;
                int i10 = eVar6.f981a;
                if (i10 != -1) {
                    this.A = i10;
                    z4 = eVar6.i;
                } else {
                    z4 = this.y;
                }
                bVar.f975c = z4;
                if (eVar6.e > 1) {
                    d dVar = this.C;
                    dVar.f976a = eVar6.f;
                    dVar.f977b = eVar6.g;
                }
            } else {
                n1();
                bVar.f975c = this.y;
            }
            if (!vVar.f && (i2 = this.A) != -1) {
                if (i2 < 0 || i2 >= vVar.b()) {
                    this.A = -1;
                    this.B = Integer.MIN_VALUE;
                } else {
                    e eVar7 = this.G;
                    if (eVar7 == null || eVar7.f981a == -1 || eVar7.f983c < 1) {
                        View s2 = s(this.A);
                        if (s2 != null) {
                            bVar.f973a = this.y ? a1() : Z0();
                            if (this.B != Integer.MIN_VALUE) {
                                if (bVar.f975c) {
                                    i5 = this.s.g() - this.B;
                                    i6 = this.s.b(s2);
                                } else {
                                    i5 = this.s.k() + this.B;
                                    i6 = this.s.e(s2);
                                }
                                i3 = i5 - i6;
                            } else {
                                if (this.s.c(s2) > this.s.l()) {
                                    i4 = bVar.f975c ? this.s.g() : this.s.k();
                                } else {
                                    int e2 = this.s.e(s2) - this.s.k();
                                    if (e2 < 0) {
                                        i4 = -e2;
                                    } else {
                                        i3 = this.s.g() - this.s.b(s2);
                                        if (i3 >= 0) {
                                            bVar.f974b = Integer.MIN_VALUE;
                                        }
                                    }
                                }
                                bVar.f974b = i4;
                            }
                            bVar.f974b = i3;
                        } else {
                            int i11 = this.A;
                            bVar.f973a = i11;
                            int i12 = this.B;
                            if (i12 == Integer.MIN_VALUE) {
                                if (x() == 0) {
                                }
                                boolean z8 = true;
                                bVar.f975c = z8;
                                bVar.a();
                            } else {
                                bVar.f974b = bVar.f975c ? StaggeredGridLayoutManager.this.s.g() - i12 : StaggeredGridLayoutManager.this.s.k() + i12;
                            }
                            bVar.d = true;
                        }
                    } else {
                        bVar.f974b = Integer.MIN_VALUE;
                        bVar.f973a = this.A;
                    }
                    z3 = true;
                    if (!z3) {
                        boolean z9 = this.E;
                        int b2 = vVar.b();
                        if (!z9) {
                            int x2 = x();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= x2) {
                                    break;
                                }
                                int L2 = L(w(i13));
                                if (L2 >= 0 && L2 < b2) {
                                    i = L2;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            int x3 = x();
                            while (true) {
                                x3--;
                                if (x3 < 0) {
                                    break;
                                }
                                i = L(w(x3));
                                if (i >= 0 && i < b2) {
                                    break;
                                }
                            }
                            bVar.f973a = i;
                            bVar.f974b = Integer.MIN_VALUE;
                        }
                        i = 0;
                        bVar.f973a = i;
                        bVar.f974b = Integer.MIN_VALUE;
                    }
                    bVar.e = true;
                }
            }
            z3 = false;
            if (!z3) {
            }
            bVar.e = true;
        }
        if (this.G == null && this.A == -1 && !(bVar.f975c == this.E && f1() == this.F)) {
            this.C.a();
            bVar.d = true;
        }
        if (x() > 0 && ((eVar = this.G) == null || eVar.f983c < 1)) {
            if (bVar.d) {
                for (int i14 = 0; i14 < this.q; i14++) {
                    this.r[i14].d();
                    int i15 = bVar.f974b;
                    if (i15 != Integer.MIN_VALUE) {
                        f fVar2 = this.r[i14];
                        fVar2.f985b = i15;
                        fVar2.f986c = i15;
                    }
                }
            } else if (z6 || this.J.f == null) {
                for (int i16 = 0; i16 < this.q; i16++) {
                    f fVar3 = this.r[i16];
                    boolean z10 = this.y;
                    int i17 = bVar.f974b;
                    int h = z10 ? fVar3.h(Integer.MIN_VALUE) : fVar3.k(Integer.MIN_VALUE);
                    fVar3.d();
                    if (h != Integer.MIN_VALUE && ((!z10 || h >= StaggeredGridLayoutManager.this.s.g()) && (z10 || h <= StaggeredGridLayoutManager.this.s.k()))) {
                        if (i17 != Integer.MIN_VALUE) {
                            h += i17;
                        }
                        fVar3.f986c = h;
                        fVar3.f985b = h;
                    }
                }
                b bVar2 = this.J;
                f[] fVarArr = this.r;
                Objects.requireNonNull(bVar2);
                int length = fVarArr.length;
                int[] iArr = bVar2.f;
                if (iArr == null || iArr.length < length) {
                    bVar2.f = new int[StaggeredGridLayoutManager.this.r.length];
                }
                for (int i18 = 0; i18 < length; i18++) {
                    bVar2.f[i18] = fVarArr[i18].k(Integer.MIN_VALUE);
                }
            } else {
                for (int i19 = 0; i19 < this.q; i19++) {
                    f fVar4 = this.r[i19];
                    fVar4.d();
                    int i20 = this.J.f[i19];
                    fVar4.f985b = i20;
                    fVar4.f986c = i20;
                }
            }
        }
        p(rVar);
        this.w.f716a = false;
        int l = this.t.l();
        this.v = l / this.q;
        this.H = View.MeasureSpec.makeMeasureSpec(l, this.t.i());
        r1(bVar.f973a, vVar);
        if (bVar.f975c) {
            p1(-1);
            U0(rVar, this.w, vVar);
            p1(1);
        } else {
            p1(1);
            U0(rVar, this.w, vVar);
            p1(-1);
        }
        o oVar = this.w;
        oVar.f718c = bVar.f973a + oVar.d;
        U0(rVar, oVar, vVar);
        if (this.t.i() != 1073741824) {
            float f2 = 0.0f;
            int x4 = x();
            for (int i21 = 0; i21 < x4; i21++) {
                View w2 = w(i21);
                float c2 = (float) this.t.c(w2);
                if (c2 >= f2) {
                    Objects.requireNonNull((c) w2.getLayoutParams());
                    f2 = Math.max(f2, c2);
                }
            }
            int i22 = this.v;
            int round = Math.round(f2 * ((float) this.q));
            if (this.t.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.t.l());
            }
            this.v = round / this.q;
            this.H = View.MeasureSpec.makeMeasureSpec(round, this.t.i());
            if (this.v != i22) {
                for (int i23 = 0; i23 < x4; i23++) {
                    View w3 = w(i23);
                    c cVar = (c) w3.getLayoutParams();
                    Objects.requireNonNull(cVar);
                    if (!f1() || this.u != 1) {
                        int i24 = cVar.e.e;
                        int i25 = this.u;
                        int i26 = (this.v * i24) - (i24 * i22);
                        if (i25 == 1) {
                            w3.offsetLeftAndRight(i26);
                        } else {
                            w3.offsetTopAndBottom(i26);
                        }
                    } else {
                        int i27 = this.q;
                        int i28 = cVar.e.e;
                        w3.offsetLeftAndRight(((-((i27 - 1) - i28)) * this.v) - ((-((i27 - 1) - i28)) * i22));
                    }
                }
            }
        }
        if (x() > 0) {
            if (this.y) {
                X0(rVar, vVar, true);
                Y0(rVar, vVar, false);
            } else {
                Y0(rVar, vVar, true);
                X0(rVar, vVar, false);
            }
        }
        if (z2 && !vVar.f) {
            if ((this.D == 0 || x() <= 0 || e1() == null) ? false : true) {
                Runnable runnable = this.M;
                RecyclerView recyclerView = this.f945b;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
            }
        }
        z5 = false;
        if (vVar.f) {
            this.J.b();
        }
        this.E = bVar.f975c;
        this.F = f1();
        if (z5) {
            this.J.b();
            h1(rVar, vVar, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i0(RecyclerView recyclerView, int i, int i2) {
        d1(i, i2, 1);
    }

    public final boolean i1(int i) {
        if (this.u == 0) {
            return (i == -1) != this.y;
        }
        return ((i == -1) == this.y) == f1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int j(RecyclerView.v vVar) {
        return R0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(RecyclerView recyclerView) {
        this.C.a();
        E0();
    }

    public void j1(int i, RecyclerView.v vVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = a1();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = Z0();
        }
        this.w.f716a = true;
        r1(i3, vVar);
        p1(i2);
        o oVar = this.w;
        oVar.f718c = i3 + oVar.d;
        oVar.f717b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.v vVar) {
        return S0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k0(RecyclerView recyclerView, int i, int i2, int i3) {
        d1(i, i2, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.e == -1) goto L_0x0013;
     */
    public final void k1(RecyclerView.r rVar, o oVar) {
        int min;
        int min2;
        if (oVar.f716a && !oVar.i) {
            if (oVar.f717b != 0) {
                int i = 1;
                if (oVar.e == -1) {
                    int i2 = oVar.f;
                    int k = this.r[0].k(i2);
                    while (i < this.q) {
                        int k2 = this.r[i].k(i2);
                        if (k2 > k) {
                            k = k2;
                        }
                        i++;
                    }
                    int i3 = i2 - k;
                    if (i3 >= 0) {
                        min2 = oVar.g - Math.min(i3, oVar.f717b);
                        l1(rVar, min2);
                    }
                } else {
                    int i4 = oVar.g;
                    int h = this.r[0].h(i4);
                    while (i < this.q) {
                        int h2 = this.r[i].h(i4);
                        if (h2 < h) {
                            h = h2;
                        }
                        i++;
                    }
                    int i5 = h - oVar.g;
                    if (i5 >= 0) {
                        min = Math.min(i5, oVar.f717b) + oVar.f;
                        m1(rVar, min);
                        return;
                    }
                    min = oVar.f;
                    m1(rVar, min);
                    return;
                }
            }
            min2 = oVar.g;
            l1(rVar, min2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.v vVar) {
        return T0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView recyclerView, int i, int i2) {
        d1(i, i2, 2);
    }

    public final void l1(RecyclerView.r rVar, int i) {
        for (int x2 = x() - 1; x2 >= 0; x2--) {
            View w2 = w(x2);
            if (this.s.e(w2) >= i && this.s.o(w2) >= i) {
                c cVar = (c) w2.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.e.f984a.size() != 1) {
                    cVar.e.l();
                    A0(w2, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.v vVar) {
        return R0(vVar);
    }

    public final void m1(RecyclerView.r rVar, int i) {
        while (x() > 0) {
            View w2 = w(0);
            if (this.s.b(w2) <= i && this.s.n(w2) <= i) {
                c cVar = (c) w2.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.e.f984a.size() != 1) {
                    cVar.e.m();
                    A0(w2, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.v vVar) {
        return S0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void n0(RecyclerView recyclerView, int i, int i2, Object obj) {
        d1(i, i2, 4);
    }

    public final void n1() {
        this.y = (this.u == 1 || !f1()) ? this.x : !this.x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.v vVar) {
        return T0(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void o0(RecyclerView.r rVar, RecyclerView.v vVar) {
        h1(rVar, vVar, true);
    }

    public int o1(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        j1(i, vVar);
        int U0 = U0(rVar, this.w, vVar);
        if (this.w.f717b >= U0) {
            i = i < 0 ? -U0 : U0;
        }
        this.s.p(-i);
        this.E = this.y;
        o oVar = this.w;
        oVar.f717b = 0;
        k1(rVar, oVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void p0(RecyclerView.v vVar) {
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.G = null;
        this.J.b();
    }

    public final void p1(int i) {
        o oVar = this.w;
        oVar.e = i;
        int i2 = 1;
        if (this.y != (i == -1)) {
            i2 = -1;
        }
        oVar.d = i2;
    }

    public final void q1(int i, int i2) {
        for (int i3 = 0; i3 < this.q; i3++) {
            if (!this.r[i3].f984a.isEmpty()) {
                s1(this.r[i3], i, i2);
            }
        }
    }

    public final void r1(int i, RecyclerView.v vVar) {
        o oVar = this.w;
        boolean z2 = false;
        oVar.f717b = 0;
        oVar.f718c = i;
        RecyclerView recyclerView = this.f945b;
        if (recyclerView != null && recyclerView.h) {
            oVar.f = this.s.k() - 0;
            this.w.g = this.s.g() + 0;
        } else {
            oVar.g = this.s.f() + 0;
            this.w.f = 0;
        }
        o oVar2 = this.w;
        oVar2.h = false;
        oVar2.f716a = true;
        if (this.s.i() == 0 && this.s.f() == 0) {
            z2 = true;
        }
        oVar2.i = z2;
    }

    public final void s1(f fVar, int i, int i2) {
        int i3 = fVar.d;
        if (i == -1) {
            int i4 = fVar.f985b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.c();
                i4 = fVar.f985b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f986c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.b();
                i5 = fVar.f986c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.z.set(fVar.e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m t() {
        return this.u == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void t0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.G = (e) parcelable;
            E0();
        }
    }

    public final int t1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m u(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable u0() {
        int i;
        int i2;
        int[] iArr;
        e eVar = this.G;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.h = this.x;
        eVar2.i = this.E;
        eVar2.j = this.F;
        d dVar = this.C;
        if (dVar == null || (iArr = dVar.f976a) == null) {
            eVar2.e = 0;
        } else {
            eVar2.f = iArr;
            eVar2.e = iArr.length;
            eVar2.g = dVar.f977b;
        }
        int i3 = -1;
        if (x() > 0) {
            eVar2.f981a = this.E ? a1() : Z0();
            View V0 = this.y ? V0(true) : W0(true);
            if (V0 != null) {
                i3 = L(V0);
            }
            eVar2.f982b = i3;
            int i4 = this.q;
            eVar2.f983c = i4;
            eVar2.d = new int[i4];
            for (int i5 = 0; i5 < this.q; i5++) {
                if (this.E) {
                    i = this.r[i5].h(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.s.g();
                    } else {
                        eVar2.d[i5] = i;
                    }
                } else {
                    i = this.r[i5].k(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.s.k();
                    } else {
                        eVar2.d[i5] = i;
                    }
                }
                i -= i2;
                eVar2.d[i5] = i;
            }
        } else {
            eVar2.f981a = -1;
            eVar2.f982b = -1;
            eVar2.f983c = 0;
        }
        return eVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v0(int i) {
        if (i == 0) {
            Q0();
        }
    }
}
