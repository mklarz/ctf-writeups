package a.f.b.i;

import a.f.b.b;
import a.f.b.d;
import a.f.b.g;
import a.f.b.i.d;

public class a extends h {
    public int g0 = 0;
    public boolean h0 = true;
    public int i0 = 0;

    @Override // a.f.b.i.d
    public void b(d dVar) {
        Object[] objArr;
        boolean z;
        c cVar;
        g gVar;
        int i;
        int i2;
        int i3;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        c[] cVarArr = this.G;
        cVarArr[0] = this.y;
        cVarArr[2] = this.z;
        cVarArr[1] = this.A;
        cVarArr[3] = this.B;
        int i4 = 0;
        while (true) {
            objArr = this.G;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].g = dVar.l(objArr[i4]);
            i4++;
        }
        int i5 = this.g0;
        if (i5 >= 0 && i5 < 4) {
            c cVar2 = objArr[i5];
            int i6 = 0;
            while (true) {
                if (i6 >= this.f0) {
                    z = false;
                    break;
                }
                d dVar2 = this.e0[i6];
                if ((this.h0 || dVar2.c()) && ((((i2 = this.g0) == 0 || i2 == 1) && dVar2.j() == aVar && dVar2.y.d != null && dVar2.A.d != null) || (((i3 = this.g0) == 2 || i3 == 3) && dVar2.n() == aVar && dVar2.z.d != null && dVar2.B.d != null))) {
                    z = true;
                } else {
                    i6++;
                }
            }
            z = true;
            boolean z2 = this.y.c() || this.A.c();
            boolean z3 = this.z.c() || this.B.c();
            boolean z4 = !z && (((i = this.g0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))));
            int i7 = 5;
            if (!z4) {
                i7 = 4;
            }
            for (int i8 = 0; i8 < this.f0; i8++) {
                d dVar3 = this.e0[i8];
                if (this.h0 || dVar3.c()) {
                    g l = dVar.l(dVar3.G[this.g0]);
                    c[] cVarArr2 = dVar3.G;
                    int i9 = this.g0;
                    cVarArr2[i9].g = l;
                    int i10 = (cVarArr2[i9].d == null || cVarArr2[i9].d.f337b != this) ? 0 : cVarArr2[i9].e + 0;
                    if (i9 == 0 || i9 == 2) {
                        b m = dVar.m();
                        g n = dVar.n();
                        n.d = 0;
                        m.f(cVar2.g, l, n, this.i0 - i10);
                        dVar.c(m);
                    } else {
                        b m2 = dVar.m();
                        g n2 = dVar.n();
                        n2.d = 0;
                        m2.e(cVar2.g, l, n2, this.i0 + i10);
                        dVar.c(m2);
                    }
                    dVar.d(cVar2.g, l, this.i0 + i10, i7);
                }
            }
            int i11 = this.g0;
            if (i11 == 0) {
                dVar.d(this.A.g, this.y.g, 0, 8);
                dVar.d(this.y.g, this.K.A.g, 0, 4);
                gVar = this.y.g;
                cVar = this.K.y;
            } else if (i11 == 1) {
                dVar.d(this.y.g, this.A.g, 0, 8);
                dVar.d(this.y.g, this.K.y.g, 0, 4);
                gVar = this.y.g;
                cVar = this.K.A;
            } else if (i11 == 2) {
                dVar.d(this.B.g, this.z.g, 0, 8);
                dVar.d(this.z.g, this.K.B.g, 0, 4);
                gVar = this.z.g;
                cVar = this.K.z;
            } else if (i11 == 3) {
                dVar.d(this.z.g, this.B.g, 0, 8);
                dVar.d(this.z.g, this.K.z.g, 0, 4);
                gVar = this.z.g;
                cVar = this.K.B;
            } else {
                return;
            }
            dVar.d(gVar, cVar.g, 0, 0);
        }
    }

    @Override // a.f.b.i.d
    public boolean c() {
        return true;
    }

    @Override // a.f.b.i.d
    public String toString() {
        StringBuilder d = b.a.a.a.a.d("[Barrier] ");
        d.append(this.Y);
        d.append(" {");
        String sb = d.toString();
        for (int i = 0; i < this.f0; i++) {
            d dVar = this.e0[i];
            if (i > 0) {
                sb = b.a.a.a.a.b(sb, ", ");
            }
            StringBuilder d2 = b.a.a.a.a.d(sb);
            d2.append(dVar.Y);
            sb = d2.toString();
        }
        return b.a.a.a.a.b(sb, "}");
    }
}
