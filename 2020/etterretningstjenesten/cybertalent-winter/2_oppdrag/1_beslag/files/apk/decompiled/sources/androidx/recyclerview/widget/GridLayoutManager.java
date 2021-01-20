package androidx.recyclerview.widget;

import a.h.j.w.d;
import a.o.b.n;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Objects;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public c K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.m {
        public int e = -1;
        public int f = 0;

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f920a = new SparseIntArray();

        public int a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = RecyclerView.l.M(context, attributeSet, i, i2).f950b;
        if (i3 != this.F) {
            this.E = true;
            if (i3 >= 1) {
                this.F = i3;
                this.K.f920a.clear();
                E0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int A(RecyclerView.r rVar, RecyclerView.v vVar) {
        if (this.q == 1) {
            return this.F;
        }
        if (vVar.b() < 1) {
            return 0;
        }
        return B1(rVar, vVar, vVar.b() - 1) + 1;
    }

    public int A1(int i, int i2) {
        if (this.q != 1 || !k1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int B1(RecyclerView.r rVar, RecyclerView.v vVar, int i) {
        if (!vVar.f) {
            return this.K.a(i, this.F);
        }
        int c2 = rVar.c(i);
        if (c2 != -1) {
            return this.K.a(c2, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int C1(RecyclerView.r rVar, RecyclerView.v vVar, int i) {
        if (!vVar.f) {
            c cVar = this.K;
            int i2 = this.F;
            Objects.requireNonNull(cVar);
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c2 = rVar.c(i);
        if (c2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        c cVar2 = this.K;
        int i4 = this.F;
        Objects.requireNonNull(cVar2);
        return c2 % i4;
    }

    public final int D1(RecyclerView.r rVar, RecyclerView.v vVar, int i) {
        if (!vVar.f) {
            Objects.requireNonNull(this.K);
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (rVar.c(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        Objects.requireNonNull(this.K);
        return 1;
    }

    public final void E1(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f953b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int A1 = A1(bVar.e, bVar.f);
        if (this.q == 1) {
            i2 = RecyclerView.l.y(A1, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.l.y(this.s.l(), this.n, i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int y = RecyclerView.l.y(A1, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int y2 = RecyclerView.l.y(this.s.l(), this.m, i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = y;
            i2 = y2;
        }
        F1(view, i2, i3, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int F0(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        G1();
        z1();
        if (this.q == 1) {
            return 0;
        }
        return r1(i, rVar, vVar);
    }

    public final void F1(View view, int i, int i2, boolean z) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z ? O0(view, i, i2, mVar) : M0(view, i, i2, mVar)) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public int G0(int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        G1();
        z1();
        if (this.q == 0) {
            return 0;
        }
        return r1(i, rVar, vVar);
    }

    public final void G1() {
        int i;
        int i2;
        if (this.q == 1) {
            i2 = this.o - J();
            i = I();
        } else {
            i2 = this.p - H();
            i = K();
        }
        y1(i2 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void J0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.G == null) {
            super.J0(rect, i, i2);
        }
        int J2 = J() + I();
        int H2 = H() + K();
        if (this.q == 1) {
            i4 = RecyclerView.l.g(i2, rect.height() + H2, F());
            int[] iArr = this.G;
            i3 = RecyclerView.l.g(i, iArr[iArr.length - 1] + J2, G());
        } else {
            i3 = RecyclerView.l.g(i, rect.width() + J2, G());
            int[] iArr2 = this.G;
            i4 = RecyclerView.l.g(i2, iArr2[iArr2.length - 1] + H2, F());
        }
        this.f945b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int N(RecyclerView.r rVar, RecyclerView.v vVar) {
        if (this.q == 0) {
            return this.F;
        }
        if (vVar.b() < 1) {
            return 0;
        }
        return B1(rVar, vVar, vVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public boolean P0() {
        return this.A == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Q0(RecyclerView.v vVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        int i = this.F;
        for (int i2 = 0; i2 < this.F && cVar.b(vVar) && i > 0; i2++) {
            ((n.b) cVar2).a(cVar.d, Math.max(0, cVar.g));
            Objects.requireNonNull(this.K);
            i--;
            cVar.d += cVar.e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public View c0(View view, int i, RecyclerView.r rVar, RecyclerView.v vVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        View view2;
        View view3;
        boolean z;
        boolean z2;
        RecyclerView.r rVar2 = rVar;
        RecyclerView.v vVar2 = vVar;
        View r = r(view);
        View view4 = null;
        if (r == null) {
            return null;
        }
        b bVar = (b) r.getLayoutParams();
        int i6 = bVar.e;
        int i7 = bVar.f + i6;
        if (super.c0(view, i, rVar, vVar) == null) {
            return null;
        }
        if ((U0(i) == 1) != this.v) {
            i4 = x() - 1;
            i3 = -1;
            i2 = -1;
        } else {
            i3 = x();
            i2 = 1;
            i4 = 0;
        }
        boolean z3 = this.q == 1 && k1();
        int B1 = B1(rVar2, vVar2, i4);
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = i4;
        View view5 = null;
        while (i12 != i3) {
            int B12 = B1(rVar2, vVar2, i12);
            View w = w(i12);
            if (w == r) {
                break;
            }
            if (!w.hasFocusable() || B12 == B1) {
                b bVar2 = (b) w.getLayoutParams();
                int i13 = bVar2.e;
                view2 = r;
                int i14 = bVar2.f + i13;
                if (w.hasFocusable() && i13 == i6 && i14 == i7) {
                    return w;
                }
                if ((!w.hasFocusable() || view4 != null) && (w.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i14, i7) - Math.max(i13, i6);
                    if (w.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i5 = i10;
                        z2 = false;
                        if (T(w, false)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            z = true;
                            if (z) {
                                if (w.hasFocusable()) {
                                    int i15 = bVar2.e;
                                    i5 = Math.min(i14, i7) - Math.max(i13, i6);
                                    i9 = i15;
                                    view5 = view3;
                                    view4 = w;
                                } else {
                                    int i16 = bVar2.e;
                                    i11 = Math.min(i14, i7) - Math.max(i13, i6);
                                    i8 = i16;
                                    view5 = w;
                                }
                                i12 += i2;
                                rVar2 = rVar;
                                vVar2 = vVar;
                                i3 = i3;
                                r = view2;
                                i10 = i5;
                            }
                        }
                        z = z2;
                        if (z) {
                        }
                    }
                    i5 = i10;
                    z2 = false;
                    z = z2;
                    if (z) {
                    }
                } else {
                    view3 = view5;
                }
                i5 = i10;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = r;
                view3 = view5;
                i5 = i10;
            }
            view5 = view3;
            i12 += i2;
            rVar2 = rVar;
            vVar2 = vVar;
            i3 = i3;
            r = view2;
            i10 = i5;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View f1(RecyclerView.r rVar, RecyclerView.v vVar, int i, int i2, int i3) {
        V0();
        int k = this.s.k();
        int g = this.s.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View w = w(i);
            int L2 = L(w);
            if (L2 >= 0 && L2 < i3 && C1(rVar, vVar, L2) == 0) {
                if (((RecyclerView.m) w.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = w;
                    }
                } else if (this.s.e(w) < g && this.s.b(w) >= k) {
                    return w;
                } else {
                    if (view == null) {
                        view = w;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g0(RecyclerView.r rVar, RecyclerView.v vVar, View view, d dVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            f0(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int B1 = B1(rVar, vVar, bVar.a());
        if (this.q == 0) {
            int i5 = bVar.e;
            i3 = bVar.f;
            i = 1;
            int i6 = this.F;
            z2 = i6 > 1 && i3 == i6;
            z = false;
            i4 = i5;
            i2 = B1;
        } else {
            i3 = 1;
            i2 = bVar.e;
            i = bVar.f;
            int i7 = this.F;
            z2 = i7 > 1 && i == i7;
            z = false;
            i4 = B1;
        }
        dVar.g(d.b.a(i4, i3, i2, i, z2, z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i0(RecyclerView recyclerView, int i, int i2) {
        this.K.f920a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(RecyclerView recyclerView) {
        this.K.f920a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.K.f920a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView recyclerView, int i, int i2) {
        this.K.f920a.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX DEBUG: Multi-variable search result rejected for r12v7, resolved type: android.graphics.Rect */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void l1(RecyclerView.r rVar, RecyclerView.v vVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View c2;
        int j = this.s.j();
        ?? r5 = 0;
        Object[] objArr = j != 1073741824 ? 1 : null;
        int i11 = x() > 0 ? this.G[this.F] : 0;
        if (objArr != null) {
            G1();
        }
        boolean z = cVar.e == 1;
        int i12 = this.F;
        if (!z) {
            i12 = C1(rVar, vVar, cVar.d) + D1(rVar, vVar, cVar.d);
        }
        int i13 = 0;
        while (i13 < this.F && cVar.b(vVar) && i12 > 0) {
            int i14 = cVar.d;
            int D1 = D1(rVar, vVar, i14);
            if (D1 <= this.F) {
                i12 -= D1;
                if (i12 < 0 || (c2 = cVar.c(rVar)) == null) {
                    break;
                }
                this.H[i13] = c2;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + D1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
        }
        if (i13 == 0) {
            bVar.f925b = true;
            return;
        }
        float f = 0.0f;
        x1(rVar, vVar, i13, z);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.H[i15];
            if (cVar.j == null) {
                if (z) {
                    a(view);
                } else {
                    b(view, r5, r5);
                }
            } else if (z) {
                b(view, -1, true);
            } else {
                b(view, r5, true);
            }
            Rect rect = this.L;
            RecyclerView recyclerView = this.f945b;
            if (recyclerView == null) {
                int i17 = r5 == true ? 1 : 0;
                int i18 = r5 == true ? 1 : 0;
                int i19 = r5 == true ? 1 : 0;
                rect.set(i17, r5, r5, r5);
            } else {
                rect.set(recyclerView.L(view));
            }
            E1(view, j, r5);
            int c3 = this.s.c(view);
            if (c3 > i16) {
                i16 = c3;
            }
            float d = (((float) this.s.d(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f);
            if (d > f) {
                f = d;
            }
            i15++;
            r5 = 0;
        }
        if (objArr != null) {
            y1(Math.max(Math.round(f * ((float) this.F)), i11));
            i16 = 0;
            for (int i20 = 0; i20 < i13; i20++) {
                View view2 = this.H[i20];
                E1(view2, 1073741824, true);
                int c4 = this.s.c(view2);
                if (c4 > i16) {
                    i16 = c4;
                }
            }
        }
        for (int i21 = 0; i21 < i13; i21++) {
            View view3 = this.H[i21];
            if (this.s.c(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect2 = bVar2.f953b;
                int i22 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i23 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int A1 = A1(bVar2.e, bVar2.f);
                if (this.q == 1) {
                    i10 = RecyclerView.l.y(A1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i22, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i23, 1073741824);
                    i9 = RecyclerView.l.y(A1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i10 = makeMeasureSpec;
                }
                F1(view3, i10, i9, true);
            }
        }
        int i24 = 0;
        bVar.f924a = i16;
        if (this.q == 1) {
            if (cVar.f == -1) {
                i4 = cVar.f928b;
                i3 = i4 - i16;
            } else {
                int i25 = cVar.f928b;
                int i26 = i16 + i25;
                i3 = i25;
                i4 = i26;
            }
            i2 = 0;
            i = 0;
        } else {
            if (cVar.f == -1) {
                int i27 = cVar.f928b;
                i = i27;
                i2 = i27 - i16;
            } else {
                int i28 = cVar.f928b;
                i2 = i28;
                i = i16 + i28;
            }
            i4 = 0;
            i3 = 0;
        }
        while (i24 < i13) {
            View view4 = this.H[i24];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.q != 1) {
                i3 = this.G[bVar3.e] + K();
                i4 = this.s.d(view4) + i3;
            } else if (k1()) {
                i = I() + this.G[this.F - bVar3.e];
                i2 = i - this.s.d(view4);
            } else {
                int I2 = I() + this.G[bVar3.e];
                i8 = i4;
                i7 = i3;
                i6 = I2;
                i5 = this.s.d(view4) + I2;
                U(view4, i6, i7, i5, i8);
                if (!bVar3.c() || bVar3.b()) {
                    bVar.f926c = true;
                }
                bVar.d |= view4.hasFocusable();
                i24++;
                i4 = i8;
                i3 = i7;
                i2 = i6;
                i = i5;
            }
            i8 = i4;
            i7 = i3;
            i6 = i2;
            i5 = i;
            U(view4, i6, i7, i5, i8);
            if (!bVar3.c()) {
            }
            bVar.f926c = true;
            bVar.d |= view4.hasFocusable();
            i24++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void m1(RecyclerView.r rVar, RecyclerView.v vVar, LinearLayoutManager.a aVar, int i) {
        G1();
        if (vVar.b() > 0 && !vVar.f) {
            boolean z = i == 1;
            int C1 = C1(rVar, vVar, aVar.f922b);
            if (z) {
                while (C1 > 0) {
                    int i2 = aVar.f922b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f922b = i3;
                    C1 = C1(rVar, vVar, i3);
                }
            } else {
                int b2 = vVar.b() - 1;
                int i4 = aVar.f922b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int C12 = C1(rVar, vVar, i5);
                    if (C12 <= C1) {
                        break;
                    }
                    i4 = i5;
                    C1 = C12;
                }
                aVar.f922b = i4;
            }
        }
        z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void n0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.K.f920a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public void o0(RecyclerView.r rVar, RecyclerView.v vVar) {
        if (vVar.f) {
            int x = x();
            for (int i = 0; i < x; i++) {
                b bVar = (b) w(i).getLayoutParams();
                int a2 = bVar.a();
                this.I.put(a2, bVar.f);
                this.J.put(a2, bVar.e);
            }
        }
        super.o0(rVar, vVar);
        this.I.clear();
        this.J.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public void p0(RecyclerView.v vVar) {
        this.A = null;
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.B.d();
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.m t() {
        return this.q == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void t1(boolean z) {
        if (!z) {
            c(null);
            if (this.w) {
                this.w = false;
                E0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m u(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final void x1(RecyclerView.r rVar, RecyclerView.v vVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i2 = 1;
            i5 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.H[i3];
            b bVar = (b) view.getLayoutParams();
            int D1 = D1(rVar, vVar, L(view));
            bVar.f = D1;
            bVar.e = i4;
            i4 += D1;
            i3 += i2;
        }
    }

    public final void y1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void z1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }
}
