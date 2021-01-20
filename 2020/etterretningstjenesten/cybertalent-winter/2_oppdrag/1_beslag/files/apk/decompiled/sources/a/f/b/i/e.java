package a.f.b.i;

import a.b.a;
import a.f.b.d;
import a.f.b.i.d;
import a.f.b.i.l.b;
import a.f.b.i.l.c;
import a.f.b.i.l.g;
import a.f.b.i.l.m;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class e extends k {
    public b f0 = new b(this);
    public a.f.b.i.l.e g0 = new a.f.b.i.l.e(this);
    public b.AbstractC0008b h0 = null;
    public boolean i0 = false;
    public d j0 = new d();
    public int k0;
    public int l0;
    public int m0 = 0;
    public int n0 = 0;
    public b[] o0 = new b[4];
    public b[] p0 = new b[4];
    public int q0 = 263;
    public boolean r0 = false;
    public boolean s0 = false;

    @Override // a.f.b.i.d
    public void C(boolean z, boolean z2) {
        super.C(z, z2);
        int size = this.e0.size();
        for (int i = 0; i < size; i++) {
            this.e0.get(i).C(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f1  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // a.f.b.i.k
    public void E() {
        Object[] objArr;
        int size;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean[] zArr;
        boolean z5;
        int max;
        int max2;
        ?? r2;
        boolean z6;
        Exception e;
        boolean z7;
        boolean z8;
        boolean[] zArr2 = i.f348a;
        d.a aVar = d.a.WRAP_CONTENT;
        d.a aVar2 = d.a.FIXED;
        this.P = 0;
        this.Q = 0;
        int max3 = Math.max(0, o());
        int max4 = Math.max(0, i());
        this.r0 = false;
        this.s0 = false;
        int i2 = this.q0;
        if (((i2 & 64) == 64 ? 1 : null) == null) {
            if (((i2 & 128) == 128 ? 1 : null) == null) {
                objArr = null;
                a.f.b.d dVar = this.j0;
                Objects.requireNonNull(dVar);
                dVar.f = false;
                if (!(i2 == 0 || objArr == null)) {
                    dVar.f = true;
                }
                d.a[] aVarArr = this.J;
                d.a aVar3 = aVarArr[1];
                d.a aVar4 = aVarArr[0];
                ArrayList<d> arrayList = this.e0;
                Object[] objArr2 = (j() != aVar || n() == aVar) ? 1 : null;
                this.m0 = 0;
                this.n0 = 0;
                size = this.e0.size();
                for (i = 0; i < size; i++) {
                    d dVar2 = this.e0.get(i);
                    if (dVar2 instanceof k) {
                        ((k) dVar2).E();
                    }
                }
                int i3 = 0;
                z = false;
                z2 = true;
                while (z2) {
                    int i4 = i3 + 1;
                    try {
                        this.j0.t();
                        this.m0 = 0;
                        this.n0 = 0;
                        e(this.j0);
                        int i5 = 0;
                        while (i5 < size) {
                            z7 = z2;
                            try {
                                this.e0.get(i5).e(this.j0);
                                i5++;
                                z2 = z7;
                            } catch (Exception e2) {
                                e = e2;
                                z6 = z7;
                                e.printStackTrace();
                                PrintStream printStream = System.out;
                                z4 = z6;
                                StringBuilder sb = new StringBuilder();
                                z3 = z;
                                sb.append("EXCEPTION : ");
                                sb.append(e);
                                printStream.println(sb.toString());
                                if (z4) {
                                }
                                if (objArr2 != null) {
                                }
                                zArr = zArr2;
                                z = z3;
                                z5 = false;
                                max = Math.max(this.S, o());
                                if (max > o()) {
                                }
                                max2 = Math.max(this.T, i());
                                if (max2 > i()) {
                                }
                                if (!z) {
                                }
                                z2 = z5;
                                i3 = i4;
                                zArr2 = zArr;
                            }
                        }
                        G(this.j0);
                        try {
                            a.f.b.d dVar3 = this.j0;
                            Objects.requireNonNull(dVar3);
                            if (dVar3.f) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= dVar3.i) {
                                        z8 = true;
                                        break;
                                    } else if (!dVar3.e[i6].e) {
                                        z8 = false;
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                if (z8) {
                                    dVar3.j();
                                    z3 = z;
                                    z4 = true;
                                    if (z4) {
                                        a.f.b.d dVar4 = this.j0;
                                        zArr2[2] = false;
                                        D(dVar4);
                                        int size2 = this.e0.size();
                                        for (int i7 = 0; i7 < size2; i7++) {
                                            this.e0.get(i7).D(dVar4);
                                        }
                                    } else {
                                        D(this.j0);
                                        for (int i8 = 0; i8 < size; i8++) {
                                            this.e0.get(i8).D(this.j0);
                                        }
                                    }
                                    if (objArr2 != null || i4 >= 8 || !zArr2[2]) {
                                        zArr = zArr2;
                                        z = z3;
                                        z5 = false;
                                    } else {
                                        int i9 = 0;
                                        int i10 = 0;
                                        int i11 = 0;
                                        while (i9 < size) {
                                            d dVar5 = this.e0.get(i9);
                                            i10 = Math.max(i10, dVar5.o() + dVar5.P);
                                            i11 = Math.max(i11, dVar5.i() + dVar5.Q);
                                            i9++;
                                            zArr2 = zArr2;
                                        }
                                        zArr = zArr2;
                                        int max5 = Math.max(this.S, i10);
                                        int max6 = Math.max(this.T, i11);
                                        if (aVar4 != aVar || o() >= max5) {
                                            z = z3;
                                            z5 = false;
                                        } else {
                                            B(max5);
                                            this.J[0] = aVar;
                                            z5 = true;
                                            z = true;
                                        }
                                        if (aVar3 == aVar && i() < max6) {
                                            w(max6);
                                            this.J[1] = aVar;
                                            z5 = true;
                                            z = true;
                                        }
                                    }
                                    max = Math.max(this.S, o());
                                    if (max > o()) {
                                        B(max);
                                        this.J[0] = aVar2;
                                        z5 = true;
                                        z = true;
                                    }
                                    max2 = Math.max(this.T, i());
                                    if (max2 > i()) {
                                        w(max2);
                                        r2 = 1;
                                        this.J[1] = aVar2;
                                        z5 = true;
                                        z = true;
                                    } else {
                                        r2 = 1;
                                    }
                                    if (!z) {
                                        if (this.J[0] == aVar && max3 > 0 && o() > max3) {
                                            this.r0 = r2;
                                            this.J[0] = aVar2;
                                            B(max3);
                                            boolean z9 = r2 == true ? 1 : 0;
                                            Object[] objArr3 = r2 == true ? 1 : 0;
                                            Object[] objArr4 = r2 == true ? 1 : 0;
                                            z5 = z9;
                                            z = z5;
                                        }
                                        d.a[] aVarArr2 = this.J;
                                        char c2 = r2 == true ? 1 : 0;
                                        char c3 = r2 == true ? 1 : 0;
                                        char c4 = r2 == true ? 1 : 0;
                                        if (aVarArr2[c2] == aVar && max4 > 0 && i() > max4) {
                                            this.s0 = r2;
                                            this.J[r2] = aVar2;
                                            w(max4);
                                            z2 = true;
                                            z = true;
                                            i3 = i4;
                                            zArr2 = zArr;
                                        }
                                    }
                                    z2 = z5;
                                    i3 = i4;
                                    zArr2 = zArr;
                                }
                            }
                            dVar3.q(dVar3.f318b);
                            z3 = z;
                            z4 = true;
                        } catch (Exception e3) {
                            e = e3;
                            z6 = true;
                            e.printStackTrace();
                            PrintStream printStream2 = System.out;
                            z4 = z6;
                            StringBuilder sb2 = new StringBuilder();
                            z3 = z;
                            sb2.append("EXCEPTION : ");
                            sb2.append(e);
                            printStream2.println(sb2.toString());
                            if (z4) {
                            }
                            if (objArr2 != null) {
                            }
                            zArr = zArr2;
                            z = z3;
                            z5 = false;
                            max = Math.max(this.S, o());
                            if (max > o()) {
                            }
                            max2 = Math.max(this.T, i());
                            if (max2 > i()) {
                            }
                            if (!z) {
                            }
                            z2 = z5;
                            i3 = i4;
                            zArr2 = zArr;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        z7 = z2;
                        z6 = z7;
                        e.printStackTrace();
                        PrintStream printStream22 = System.out;
                        z4 = z6;
                        StringBuilder sb22 = new StringBuilder();
                        z3 = z;
                        sb22.append("EXCEPTION : ");
                        sb22.append(e);
                        printStream22.println(sb22.toString());
                        if (z4) {
                        }
                        if (objArr2 != null) {
                        }
                        zArr = zArr2;
                        z = z3;
                        z5 = false;
                        max = Math.max(this.S, o());
                        if (max > o()) {
                        }
                        max2 = Math.max(this.T, i());
                        if (max2 > i()) {
                        }
                        if (!z) {
                        }
                        z2 = z5;
                        i3 = i4;
                        zArr2 = zArr;
                    }
                    if (z4) {
                    }
                    if (objArr2 != null) {
                    }
                    zArr = zArr2;
                    z = z3;
                    z5 = false;
                    max = Math.max(this.S, o());
                    if (max > o()) {
                    }
                    max2 = Math.max(this.T, i());
                    if (max2 > i()) {
                    }
                    if (!z) {
                    }
                    z2 = z5;
                    i3 = i4;
                    zArr2 = zArr;
                }
                this.e0 = arrayList;
                if (z) {
                    d.a[] aVarArr3 = this.J;
                    aVarArr3[0] = aVar4;
                    aVarArr3[1] = aVar3;
                }
                v(this.j0.k);
            }
        }
        objArr = 1;
        a.f.b.d dVar6 = this.j0;
        Objects.requireNonNull(dVar6);
        dVar6.f = false;
        dVar6.f = true;
        d.a[] aVarArr4 = this.J;
        d.a aVar32 = aVarArr4[1];
        d.a aVar42 = aVarArr4[0];
        ArrayList<d> arrayList2 = this.e0;
        if (j() != aVar) {
        }
        this.m0 = 0;
        this.n0 = 0;
        size = this.e0.size();
        while (i < size) {
        }
        int i32 = 0;
        z = false;
        z2 = true;
        while (z2) {
        }
        this.e0 = arrayList2;
        if (z) {
        }
        v(this.j0.k);
    }

    public void F(d dVar, int i) {
        if (i == 0) {
            int i2 = this.m0 + 1;
            b[] bVarArr = this.p0;
            if (i2 >= bVarArr.length) {
                this.p0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.p0;
            int i3 = this.m0;
            bVarArr2[i3] = new b(dVar, 0, this.i0);
            this.m0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.n0 + 1;
            b[] bVarArr3 = this.o0;
            if (i4 >= bVarArr3.length) {
                this.o0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.o0;
            int i5 = this.n0;
            bVarArr4[i5] = new b(dVar, 1, this.i0);
            this.n0 = i5 + 1;
        }
    }

    public boolean G(a.f.b.d dVar) {
        d.a aVar = d.a.FIXED;
        d.a aVar2 = d.a.WRAP_CONTENT;
        b(dVar);
        int size = this.e0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.e0.get(i);
            boolean[] zArr = dVar2.I;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar3 = this.e0.get(i2);
                if (dVar3 instanceof a) {
                    a aVar3 = (a) dVar3;
                    for (int i3 = 0; i3 < aVar3.f0; i3++) {
                        d dVar4 = aVar3.e0[i3];
                        int i4 = aVar3.g0;
                        if (i4 == 0 || i4 == 1) {
                            dVar4.I[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            dVar4.I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            d dVar5 = this.e0.get(i5);
            Objects.requireNonNull(dVar5);
            if ((dVar5 instanceof j) || (dVar5 instanceof f)) {
                dVar5.b(dVar);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            d dVar6 = this.e0.get(i6);
            if (dVar6 instanceof e) {
                d.a[] aVarArr = dVar6.J;
                d.a aVar4 = aVarArr[0];
                d.a aVar5 = aVarArr[1];
                if (aVar4 == aVar2) {
                    aVarArr[0] = aVar;
                }
                if (aVar5 == aVar2) {
                    aVarArr[1] = aVar;
                }
                dVar6.b(dVar);
                if (aVar4 == aVar2) {
                    dVar6.x(aVar4);
                }
                if (aVar5 == aVar2) {
                    dVar6.A(aVar5);
                }
            } else {
                d.a aVar6 = d.a.MATCH_PARENT;
                dVar6.h = -1;
                dVar6.i = -1;
                if (this.J[0] != aVar2 && dVar6.J[0] == aVar6) {
                    int i7 = dVar6.y.e;
                    int o = o() - dVar6.A.e;
                    c cVar = dVar6.y;
                    cVar.g = dVar.l(cVar);
                    c cVar2 = dVar6.A;
                    cVar2.g = dVar.l(cVar2);
                    dVar.e(dVar6.y.g, i7);
                    dVar.e(dVar6.A.g, o);
                    dVar6.h = 2;
                    dVar6.P = i7;
                    int i8 = o - i7;
                    dVar6.L = i8;
                    int i9 = dVar6.S;
                    if (i8 < i9) {
                        dVar6.L = i9;
                    }
                }
                if (this.J[1] != aVar2 && dVar6.J[1] == aVar6) {
                    int i10 = dVar6.z.e;
                    int i11 = i() - dVar6.B.e;
                    c cVar3 = dVar6.z;
                    cVar3.g = dVar.l(cVar3);
                    c cVar4 = dVar6.B;
                    cVar4.g = dVar.l(cVar4);
                    dVar.e(dVar6.z.g, i10);
                    dVar.e(dVar6.B.g, i11);
                    if (dVar6.R > 0 || dVar6.X == 8) {
                        c cVar5 = dVar6.C;
                        cVar5.g = dVar.l(cVar5);
                        dVar.e(dVar6.C.g, dVar6.R + i10);
                    }
                    dVar6.i = 2;
                    dVar6.Q = i10;
                    int i12 = i11 - i10;
                    dVar6.M = i12;
                    int i13 = dVar6.T;
                    if (i12 < i13) {
                        dVar6.M = i13;
                    }
                }
                if (!((dVar6 instanceof j) || (dVar6 instanceof f))) {
                    dVar6.b(dVar);
                }
            }
        }
        if (this.m0 > 0) {
            a.a(this, dVar, 0);
        }
        if (this.n0 > 0) {
            a.a(this, dVar, 1);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012c A[EDGE_INSN: B:76:0x012c->B:61:0x012c ?: BREAK  , SYNTHETIC] */
    public boolean H(boolean z, int i) {
        boolean z2;
        Iterator<m> it;
        Iterator<m> it2;
        int i2;
        g gVar;
        int i3;
        g gVar2;
        a.f.b.i.l.e eVar = this.g0;
        d.a aVar = d.a.MATCH_PARENT;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        d.a h = eVar.f355a.h(0);
        d.a h2 = eVar.f355a.h(1);
        int p = eVar.f355a.p();
        int q = eVar.f355a.q();
        if (z4 && (h == aVar2 || h2 == aVar2)) {
            Iterator<m> it3 = eVar.e.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                m next = it3.next();
                if (next.f == i && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && h == aVar2) {
                    e eVar2 = eVar.f355a;
                    eVar2.J[0] = aVar3;
                    eVar2.B(eVar.d(eVar2, 0));
                    e eVar3 = eVar.f355a;
                    gVar2 = eVar3.d.e;
                    i3 = eVar3.o();
                }
            } else if (z4 && h2 == aVar2) {
                e eVar4 = eVar.f355a;
                eVar4.J[1] = aVar3;
                eVar4.w(eVar.d(eVar4, 1));
                e eVar5 = eVar.f355a;
                gVar2 = eVar5.e.e;
                i3 = eVar5.i();
            }
            gVar2.c(i3);
        }
        e eVar6 = eVar.f355a;
        d.a[] aVarArr = eVar6.J;
        if (i == 0) {
            if (aVarArr[0] == aVar3 || aVarArr[0] == aVar) {
                int o = eVar6.o() + p;
                eVar.f355a.d.i.c(o);
                gVar = eVar.f355a.d.e;
                i2 = o - p;
                gVar.c(i2);
                z2 = true;
                eVar.g();
                it = eVar.e.iterator();
                while (it.hasNext()) {
                    m next2 = it.next();
                    if (next2.f == i && (next2.f368b != eVar.f355a || next2.g)) {
                        next2.e();
                    }
                }
                it2 = eVar.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    m next3 = it2.next();
                    if (next3.f == i && ((z2 || next3.f368b != eVar.f355a) && (!next3.h.j || !next3.i.j || (!(next3 instanceof c) && !next3.e.j)))) {
                        z3 = false;
                    }
                }
                z3 = false;
                eVar.f355a.x(h);
                eVar.f355a.A(h2);
                return z3;
            }
        } else if (aVarArr[1] == aVar3 || aVarArr[1] == aVar) {
            int i4 = eVar6.i() + q;
            eVar.f355a.e.i.c(i4);
            gVar = eVar.f355a.e.e;
            i2 = i4 - q;
            gVar.c(i2);
            z2 = true;
            eVar.g();
            it = eVar.e.iterator();
            while (it.hasNext()) {
            }
            it2 = eVar.e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                }
            }
            z3 = false;
            eVar.f355a.x(h);
            eVar.f355a.A(h2);
            return z3;
        }
        z2 = false;
        eVar.g();
        it = eVar.e.iterator();
        while (it.hasNext()) {
        }
        it2 = eVar.e.iterator();
        while (true) {
            if (!it2.hasNext()) {
            }
        }
        z3 = false;
        eVar.f355a.x(h);
        eVar.f355a.A(h2);
        return z3;
    }

    public void I() {
        this.g0.f356b = true;
    }

    public void J(int i) {
        this.q0 = i;
        a.f.b.d.p = i.a(i, 256);
    }

    @Override // a.f.b.i.d, a.f.b.i.k
    public void u() {
        this.j0.t();
        this.k0 = 0;
        this.l0 = 0;
        super.u();
    }
}
