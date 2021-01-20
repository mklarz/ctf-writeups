package a.f.b.i;

import a.f.b.b;
import a.f.b.g;
import a.f.b.i.c;
import a.f.b.i.l.c;
import a.f.b.i.l.f;
import a.f.b.i.l.j;
import a.f.b.i.l.l;
import java.util.ArrayList;

public class d {
    public c A;
    public c B;
    public c C;
    public c D;
    public c E;
    public c F;
    public c[] G;
    public ArrayList<c> H;
    public boolean[] I;
    public a[] J;
    public d K;
    public int L;
    public int M;
    public float N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public Object W;
    public int X;
    public String Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f342a = false;
    public int a0;

    /* renamed from: b  reason: collision with root package name */
    public c f343b;
    public float[] b0;

    /* renamed from: c  reason: collision with root package name */
    public c f344c;
    public d[] c0;
    public j d = new j(this);
    public d[] d0;
    public l e = new l(this);
    public boolean[] f = {true, true};
    public int[] g = {0, 0, 0, 0};
    public int h = -1;
    public int i = -1;
    public int j = 0;
    public int k = 0;
    public int[] l = new int[2];
    public int m = 0;
    public int n = 0;
    public float o = 1.0f;
    public int p = 0;
    public int q = 0;
    public float r = 1.0f;
    public int s = -1;
    public float t = 1.0f;
    public int[] u = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float v = 0.0f;
    public boolean w = false;
    public boolean x;
    public c y;
    public c z;

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        c cVar = new c(this, c.a.LEFT);
        this.y = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.z = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.A = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.B = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.C = cVar5;
        this.D = new c(this, c.a.CENTER_X);
        this.E = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.F = cVar6;
        this.G = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.H = arrayList;
        this.I = new boolean[2];
        a aVar = a.FIXED;
        this.J = new a[]{aVar, aVar};
        this.K = null;
        this.L = 0;
        this.M = 0;
        this.N = 0.0f;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        this.X = 0;
        this.Y = null;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = new float[]{-1.0f, -1.0f};
        this.c0 = new d[]{null, null};
        this.d0 = new d[]{null, null};
        arrayList.add(this.y);
        this.H.add(this.z);
        this.H.add(this.A);
        this.H.add(this.B);
        this.H.add(this.D);
        this.H.add(this.E);
        this.H.add(this.F);
        this.H.add(this.C);
    }

    public void A(a aVar) {
        this.J[1] = aVar;
    }

    public void B(int i2) {
        this.L = i2;
        int i3 = this.S;
        if (i2 < i3) {
            this.L = i3;
        }
    }

    public void C(boolean z2, boolean z3) {
        int i2;
        int i3;
        a aVar = a.FIXED;
        j jVar = this.d;
        boolean z4 = z2 & jVar.g;
        l lVar = this.e;
        boolean z5 = z3 & lVar.g;
        int i4 = jVar.h.g;
        int i5 = lVar.h.g;
        int i6 = jVar.i.g;
        int i7 = lVar.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.P = i4;
        }
        if (z5) {
            this.Q = i5;
        }
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        if (z4) {
            if (this.J[0] == aVar && i9 < (i3 = this.L)) {
                i9 = i3;
            }
            this.L = i9;
            int i11 = this.S;
            if (i9 < i11) {
                this.L = i11;
            }
        }
        if (z5) {
            if (this.J[1] == aVar && i10 < (i2 = this.M)) {
                i10 = i2;
            }
            this.M = i10;
            int i12 = this.T;
            if (i10 < i12) {
                this.M = i12;
            }
        }
    }

    public void D(a.f.b.d dVar) {
        int i2;
        int i3;
        int o2 = dVar.o(this.y);
        int o3 = dVar.o(this.z);
        int o4 = dVar.o(this.A);
        int o5 = dVar.o(this.B);
        j jVar = this.d;
        f fVar = jVar.h;
        if (fVar.j) {
            f fVar2 = jVar.i;
            if (fVar2.j) {
                o2 = fVar.g;
                o4 = fVar2.g;
            }
        }
        l lVar = this.e;
        f fVar3 = lVar.h;
        if (fVar3.j) {
            f fVar4 = lVar.i;
            if (fVar4.j) {
                o3 = fVar3.g;
                o5 = fVar4.g;
            }
        }
        int i4 = o5 - o3;
        if (o4 - o2 < 0 || i4 < 0 || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE || o5 == Integer.MIN_VALUE || o5 == Integer.MAX_VALUE) {
            o5 = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        int i5 = o4 - o2;
        int i6 = o5 - o3;
        this.P = o2;
        this.Q = o3;
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        a[] aVarArr = this.J;
        a aVar = aVarArr[0];
        a aVar2 = a.FIXED;
        if (aVar == aVar2 && i5 < (i3 = this.L)) {
            i5 = i3;
        }
        if (aVarArr[1] == aVar2 && i6 < (i2 = this.M)) {
            i6 = i2;
        }
        this.L = i5;
        this.M = i6;
        int i7 = this.T;
        if (i6 < i7) {
            this.M = i7;
        }
        int i8 = this.S;
        if (i5 < i8) {
            this.L = i8;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    public void b(a.f.b.d dVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        int i4;
        boolean z6;
        g gVar;
        char c2;
        int i5;
        boolean z7;
        a aVar;
        g gVar2;
        g gVar3;
        g gVar4;
        g gVar5;
        g gVar6;
        f fVar;
        int i6;
        a.f.b.d dVar2;
        g gVar7;
        g gVar8;
        int i7;
        int i8;
        int i9;
        g gVar9;
        g gVar10;
        g gVar11;
        d dVar3;
        g gVar12;
        g gVar13;
        g gVar14;
        g gVar15;
        a.f.b.d dVar4;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        d dVar5 = this;
        a aVar2 = a.WRAP_CONTENT;
        g l2 = dVar.l(dVar5.y);
        g l3 = dVar.l(dVar5.A);
        g l4 = dVar.l(dVar5.z);
        g l5 = dVar.l(dVar5.B);
        g l6 = dVar.l(dVar5.C);
        j jVar = dVar5.d;
        f fVar2 = jVar.h;
        if (fVar2.j && jVar.i.j) {
            l lVar = dVar5.e;
            if (lVar.h.j && lVar.i.j) {
                dVar.e(l2, fVar2.g);
                dVar.e(l3, dVar5.d.i.g);
                dVar.e(l4, dVar5.e.h.g);
                dVar.e(l5, dVar5.e.i.g);
                dVar.e(l6, dVar5.e.k.g);
                d dVar6 = dVar5.K;
                if (dVar6 != null) {
                    boolean z11 = dVar6 != null && dVar6.J[0] == aVar2;
                    boolean z12 = dVar6 != null && dVar6.J[1] == aVar2;
                    if (z11 && dVar5.f[0] && !s()) {
                        dVar.f(dVar.l(dVar5.K.A), l3, 0, 8);
                    }
                    if (z12 && dVar5.f[1] && !t()) {
                        dVar.f(dVar.l(dVar5.K.B), l5, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        d dVar7 = dVar5.K;
        if (dVar7 != null) {
            boolean z13 = dVar7 != null && dVar7.J[0] == aVar2;
            boolean z14 = dVar7 != null && dVar7.J[1] == aVar2;
            if (dVar5.r(0)) {
                ((e) dVar5.K).F(dVar5, 0);
                z9 = true;
            } else {
                z9 = s();
            }
            if (dVar5.r(1)) {
                ((e) dVar5.K).F(dVar5, 1);
                z10 = true;
            } else {
                z10 = t();
            }
            if (!z9 && z13 && dVar5.X != 8 && dVar5.y.d == null && dVar5.A.d == null) {
                dVar.f(dVar.l(dVar5.K.A), l3, 0, 1);
            }
            if (!z10 && z14 && dVar5.X != 8 && dVar5.z.d == null && dVar5.B.d == null && dVar5.C == null) {
                dVar.f(dVar.l(dVar5.K.B), l5, 0, 1);
            }
            z5 = z14;
            z4 = z13;
            z2 = z9;
            z3 = z10;
        } else {
            z5 = false;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        int i15 = dVar5.L;
        int i16 = dVar5.S;
        if (i15 >= i16) {
            i16 = i15;
        }
        int i17 = dVar5.M;
        int i18 = dVar5.T;
        if (i17 >= i18) {
            i18 = i17;
        }
        a[] aVarArr = dVar5.J;
        a aVar3 = aVarArr[0];
        a aVar4 = a.MATCH_CONSTRAINT;
        boolean z15 = aVar3 != aVar4;
        boolean z16 = aVarArr[1] != aVar4;
        int i19 = dVar5.O;
        dVar5.s = i19;
        float f2 = dVar5.N;
        dVar5.t = f2;
        int i20 = dVar5.j;
        int i21 = dVar5.k;
        if (f2 > 0.0f) {
            gVar = l3;
            if (dVar5.X != 8) {
                if (aVarArr[0] == aVar4 && i20 == 0) {
                    i20 = 3;
                }
                if (aVarArr[1] == aVar4 && i21 == 0) {
                    i11 = 0;
                    i21 = 3;
                } else {
                    i11 = 0;
                }
                if (aVarArr[i11] != aVar4) {
                    i12 = i11;
                } else if (aVarArr[1] == aVar4 && i20 == 3 && i21 == 3) {
                    if (i19 == -1) {
                        if (z15 && !z16) {
                            dVar5.s = 0;
                        } else if (!z15 && z16) {
                            dVar5.s = 1;
                            if (i19 == -1) {
                                dVar5.t = 1.0f / f2;
                            }
                        }
                    }
                    if (dVar5.s != 0 || (dVar5.z.d() && dVar5.B.d())) {
                        if (dVar5.s == 1 && (!dVar5.y.d() || !dVar5.A.d())) {
                            i14 = 0;
                        }
                        if (dVar5.s == -1 && (!dVar5.z.d() || !dVar5.B.d() || !dVar5.y.d() || !dVar5.A.d())) {
                            if (!dVar5.z.d() && dVar5.B.d()) {
                                i13 = 0;
                            } else if (dVar5.y.d() && dVar5.A.d()) {
                                dVar5.t = 1.0f / dVar5.t;
                                i13 = 1;
                            }
                            dVar5.s = i13;
                        }
                        if (dVar5.s == -1) {
                            int i22 = dVar5.m;
                            if (i22 > 0 && dVar5.p == 0) {
                                dVar5.s = 0;
                            } else if (i22 == 0 && dVar5.p > 0) {
                                dVar5.t = 1.0f / dVar5.t;
                                dVar5.s = 1;
                            }
                        }
                        c2 = 0;
                        i2 = i20;
                        i3 = i21;
                        i5 = i16;
                        i4 = i18;
                        z6 = true;
                        int[] iArr = dVar5.l;
                        iArr[c2] = i2;
                        iArr[1] = i3;
                        if (z6) {
                            int i23 = dVar5.s;
                            if (i23 == 0 || i23 == -1) {
                                z7 = true;
                                boolean z17 = dVar5.J[0] != aVar2 && (dVar5 instanceof e);
                                int i24 = !z17 ? 0 : i5;
                                boolean z18 = !dVar5.F.d();
                                boolean[] zArr = dVar5.I;
                                boolean z19 = zArr[0];
                                boolean z20 = zArr[1];
                                g gVar16 = null;
                                if (dVar5.h == 2) {
                                    j jVar2 = dVar5.d;
                                    f fVar3 = jVar2.h;
                                    if (!fVar3.j || !jVar2.i.j) {
                                        d dVar8 = dVar5.K;
                                        g l7 = dVar8 != null ? dVar.l(dVar8.A) : null;
                                        d dVar9 = dVar5.K;
                                        gVar6 = l6;
                                        gVar5 = l5;
                                        gVar4 = l4;
                                        gVar3 = gVar;
                                        gVar2 = l2;
                                        aVar = aVar2;
                                        d(dVar, true, z4, z5, dVar5.f[0], dVar9 != null ? dVar.l(dVar9.y) : null, l7, dVar5.J[0], z17, dVar5.y, dVar5.A, dVar5.P, i24, dVar5.S, dVar5.u[0], dVar5.U, z7, z2, z3, z19, i2, i3, dVar5.m, dVar5.n, dVar5.o, z18);
                                    } else {
                                        dVar.e(l2, fVar3.g);
                                        dVar.e(gVar, dVar5.d.i.g);
                                        if (dVar5.K != null && z4 && dVar5.f[0] && !s()) {
                                            dVar.f(dVar.l(dVar5.K.A), gVar, 0, 8);
                                        }
                                        gVar2 = l2;
                                        aVar = aVar2;
                                        gVar3 = gVar;
                                        gVar6 = l6;
                                        gVar5 = l5;
                                        gVar4 = l4;
                                        l lVar2 = dVar5.e;
                                        fVar = lVar2.h;
                                        if (fVar.j || !lVar2.i.j) {
                                            dVar2 = dVar;
                                            gVar9 = gVar6;
                                            gVar8 = gVar5;
                                            gVar7 = gVar4;
                                            i9 = 8;
                                            i8 = 0;
                                            i7 = 1;
                                            i6 = 1;
                                        } else {
                                            dVar2 = dVar;
                                            gVar7 = gVar4;
                                            dVar2.e(gVar7, fVar.g);
                                            gVar8 = gVar5;
                                            dVar2.e(gVar8, dVar5.e.i.g);
                                            gVar9 = gVar6;
                                            dVar2.e(gVar9, dVar5.e.k.g);
                                            d dVar10 = dVar5.K;
                                            if (dVar10 == null || z3 || !z5) {
                                                i9 = 8;
                                                i8 = 0;
                                                i7 = 1;
                                            } else {
                                                i7 = 1;
                                                if (dVar5.f[1]) {
                                                    i9 = 8;
                                                    i8 = 0;
                                                    dVar2.f(dVar2.l(dVar10.B), gVar8, 0, 8);
                                                } else {
                                                    i9 = 8;
                                                    i8 = 0;
                                                }
                                            }
                                            i6 = i8;
                                        }
                                        if ((dVar5.i == 2 ? i8 : i6) != 0) {
                                            boolean z21 = (dVar5.J[i7] != aVar || !(dVar5 instanceof e)) ? i8 : i7;
                                            if (z21) {
                                                i4 = i8;
                                            }
                                            boolean z22 = (!z6 || !((i10 = dVar5.s) == i7 || i10 == -1)) ? i8 : i7;
                                            d dVar11 = dVar5.K;
                                            g l8 = dVar11 != null ? dVar2.l(dVar11.B) : null;
                                            d dVar12 = dVar5.K;
                                            if (dVar12 != null) {
                                                gVar16 = dVar2.l(dVar12.z);
                                            }
                                            int i25 = dVar5.R;
                                            if (i25 > 0 || dVar5.X == i9) {
                                                dVar2.d(gVar9, gVar7, i25, i9);
                                                c cVar = dVar5.C.d;
                                                if (cVar != null) {
                                                    dVar2.d(gVar9, dVar2.l(cVar), i8, i9);
                                                    if (z5) {
                                                        dVar2.f(l8, dVar2.l(dVar5.B), i8, 5);
                                                    }
                                                    z8 = i8;
                                                    gVar11 = gVar8;
                                                    gVar10 = gVar7;
                                                    d(dVar, false, z5, z4, dVar5.f[i7], gVar16, l8, dVar5.J[i7], z21, dVar5.z, dVar5.B, dVar5.Q, i4, dVar5.T, dVar5.u[i7], dVar5.V, z22, z3, z2, z20, i3, i2, dVar5.p, dVar5.q, dVar5.r, z8);
                                                } else if (dVar5.X == i9) {
                                                    dVar2.d(gVar9, gVar7, i8, i9);
                                                }
                                            }
                                            z8 = z18;
                                            gVar11 = gVar8;
                                            gVar10 = gVar7;
                                            d(dVar, false, z5, z4, dVar5.f[i7], gVar16, l8, dVar5.J[i7], z21, dVar5.z, dVar5.B, dVar5.Q, i4, dVar5.T, dVar5.u[i7], dVar5.V, z22, z3, z2, z20, i3, i2, dVar5.p, dVar5.q, dVar5.r, z8);
                                        } else {
                                            gVar11 = gVar8;
                                            gVar10 = gVar7;
                                        }
                                        if (z6) {
                                            int i26 = 8;
                                            dVar3 = this;
                                            int i27 = dVar3.s;
                                            float f3 = dVar3.t;
                                            if (i27 == 1) {
                                                dVar4 = dVar;
                                                gVar15 = gVar11;
                                                gVar14 = gVar10;
                                                gVar13 = gVar3;
                                                gVar12 = gVar2;
                                            } else {
                                                i26 = 8;
                                                dVar4 = dVar;
                                                gVar15 = gVar3;
                                                gVar14 = gVar2;
                                                gVar13 = gVar11;
                                                gVar12 = gVar10;
                                            }
                                            dVar4.h(gVar15, gVar14, gVar13, gVar12, f3, i26);
                                        } else {
                                            dVar3 = this;
                                        }
                                        if (dVar3.F.d()) {
                                            d dVar13 = dVar3.F.d.f337b;
                                            int b2 = dVar3.F.b();
                                            c.a aVar5 = c.a.LEFT;
                                            g l9 = dVar.l(dVar3.f(aVar5));
                                            c.a aVar6 = c.a.TOP;
                                            g l10 = dVar.l(dVar3.f(aVar6));
                                            c.a aVar7 = c.a.RIGHT;
                                            g l11 = dVar.l(dVar3.f(aVar7));
                                            c.a aVar8 = c.a.BOTTOM;
                                            g l12 = dVar.l(dVar3.f(aVar8));
                                            g l13 = dVar.l(dVar13.f(aVar5));
                                            g l14 = dVar.l(dVar13.f(aVar6));
                                            g l15 = dVar.l(dVar13.f(aVar7));
                                            g l16 = dVar.l(dVar13.f(aVar8));
                                            b m2 = dVar.m();
                                            double radians = (double) ((float) Math.toRadians((double) (dVar3.v + 90.0f)));
                                            double d2 = (double) b2;
                                            m2.g(l10, l12, l14, l16, (float) (Math.sin(radians) * d2));
                                            dVar.c(m2);
                                            b m3 = dVar.m();
                                            m3.g(l9, l11, l13, l15, (float) (Math.cos(radians) * d2));
                                            dVar.c(m3);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    gVar2 = l2;
                                    aVar = aVar2;
                                    gVar6 = l6;
                                    gVar5 = l5;
                                    gVar4 = l4;
                                    gVar3 = gVar;
                                }
                                dVar5 = this;
                                l lVar22 = dVar5.e;
                                fVar = lVar22.h;
                                if (fVar.j) {
                                }
                                dVar2 = dVar;
                                gVar9 = gVar6;
                                gVar8 = gVar5;
                                gVar7 = gVar4;
                                i9 = 8;
                                i8 = 0;
                                i7 = 1;
                                i6 = 1;
                                if ((dVar5.i == 2 ? i8 : i6) != 0) {
                                }
                                if (z6) {
                                }
                                if (dVar3.F.d()) {
                                }
                            }
                        }
                        z7 = false;
                        if (dVar5.J[0] != aVar2) {
                        }
                        if (!z17) {
                        }
                        boolean z182 = !dVar5.F.d();
                        boolean[] zArr2 = dVar5.I;
                        boolean z192 = zArr2[0];
                        boolean z202 = zArr2[1];
                        g gVar162 = null;
                        if (dVar5.h == 2) {
                        }
                        dVar5 = this;
                        l lVar222 = dVar5.e;
                        fVar = lVar222.h;
                        if (fVar.j) {
                        }
                        dVar2 = dVar;
                        gVar9 = gVar6;
                        gVar8 = gVar5;
                        gVar7 = gVar4;
                        i9 = 8;
                        i8 = 0;
                        i7 = 1;
                        i6 = 1;
                        if ((dVar5.i == 2 ? i8 : i6) != 0) {
                        }
                        if (z6) {
                        }
                        if (dVar3.F.d()) {
                        }
                    } else {
                        i14 = 1;
                    }
                    dVar5.s = i14;
                    if (!dVar5.z.d()) {
                    }
                    dVar5.t = 1.0f / dVar5.t;
                    i13 = 1;
                    dVar5.s = i13;
                    if (dVar5.s == -1) {
                    }
                    c2 = 0;
                    i2 = i20;
                    i3 = i21;
                    i5 = i16;
                    i4 = i18;
                    z6 = true;
                    int[] iArr2 = dVar5.l;
                    iArr2[c2] = i2;
                    iArr2[1] = i3;
                    if (z6) {
                    }
                    z7 = false;
                    if (dVar5.J[0] != aVar2) {
                    }
                    if (!z17) {
                    }
                    boolean z1822 = !dVar5.F.d();
                    boolean[] zArr22 = dVar5.I;
                    boolean z1922 = zArr22[0];
                    boolean z2022 = zArr22[1];
                    g gVar1622 = null;
                    if (dVar5.h == 2) {
                    }
                    dVar5 = this;
                    l lVar2222 = dVar5.e;
                    fVar = lVar2222.h;
                    if (fVar.j) {
                    }
                    dVar2 = dVar;
                    gVar9 = gVar6;
                    gVar8 = gVar5;
                    gVar7 = gVar4;
                    i9 = 8;
                    i8 = 0;
                    i7 = 1;
                    i6 = 1;
                    if ((dVar5.i == 2 ? i8 : i6) != 0) {
                    }
                    if (z6) {
                    }
                    if (dVar3.F.d()) {
                    }
                } else {
                    i12 = 0;
                }
                if (aVarArr[i12] == aVar4 && i20 == 3) {
                    dVar5.s = i12;
                    int i28 = (int) (f2 * ((float) i17));
                    if (aVarArr[1] != aVar4) {
                        i3 = i21;
                        i2 = 4;
                        i4 = i18;
                        c2 = 0;
                        z6 = false;
                    } else {
                        i2 = i20;
                        z6 = true;
                        i3 = i21;
                        i4 = i18;
                        c2 = 0;
                    }
                    i5 = i28;
                    int[] iArr22 = dVar5.l;
                    iArr22[c2] = i2;
                    iArr22[1] = i3;
                    if (z6) {
                    }
                    z7 = false;
                    if (dVar5.J[0] != aVar2) {
                    }
                    if (!z17) {
                    }
                    boolean z18222 = !dVar5.F.d();
                    boolean[] zArr222 = dVar5.I;
                    boolean z19222 = zArr222[0];
                    boolean z20222 = zArr222[1];
                    g gVar16222 = null;
                    if (dVar5.h == 2) {
                    }
                    dVar5 = this;
                    l lVar22222 = dVar5.e;
                    fVar = lVar22222.h;
                    if (fVar.j) {
                    }
                    dVar2 = dVar;
                    gVar9 = gVar6;
                    gVar8 = gVar5;
                    gVar7 = gVar4;
                    i9 = 8;
                    i8 = 0;
                    i7 = 1;
                    i6 = 1;
                    if ((dVar5.i == 2 ? i8 : i6) != 0) {
                    }
                    if (z6) {
                    }
                    if (dVar3.F.d()) {
                    }
                } else {
                    if (aVarArr[1] == aVar4 && i21 == 3) {
                        dVar5.s = 1;
                        if (i19 == -1) {
                            dVar5.t = 1.0f / f2;
                        }
                        int i29 = (int) (dVar5.t * ((float) i15));
                        c2 = 0;
                        i2 = i20;
                        if (aVarArr[0] != aVar4) {
                            i4 = i29;
                            z6 = false;
                            i5 = i16;
                            i3 = 4;
                            int[] iArr222 = dVar5.l;
                            iArr222[c2] = i2;
                            iArr222[1] = i3;
                            if (z6) {
                            }
                            z7 = false;
                            if (dVar5.J[0] != aVar2) {
                            }
                            if (!z17) {
                            }
                            boolean z182222 = !dVar5.F.d();
                            boolean[] zArr2222 = dVar5.I;
                            boolean z192222 = zArr2222[0];
                            boolean z202222 = zArr2222[1];
                            g gVar162222 = null;
                            if (dVar5.h == 2) {
                            }
                            dVar5 = this;
                            l lVar222222 = dVar5.e;
                            fVar = lVar222222.h;
                            if (fVar.j) {
                            }
                            dVar2 = dVar;
                            gVar9 = gVar6;
                            gVar8 = gVar5;
                            gVar7 = gVar4;
                            i9 = 8;
                            i8 = 0;
                            i7 = 1;
                            i6 = 1;
                            if ((dVar5.i == 2 ? i8 : i6) != 0) {
                            }
                            if (z6) {
                            }
                            if (dVar3.F.d()) {
                            }
                        } else {
                            i3 = i21;
                            i4 = i29;
                            i5 = i16;
                            z6 = true;
                            int[] iArr2222 = dVar5.l;
                            iArr2222[c2] = i2;
                            iArr2222[1] = i3;
                            if (z6) {
                            }
                            z7 = false;
                            if (dVar5.J[0] != aVar2) {
                            }
                            if (!z17) {
                            }
                            boolean z1822222 = !dVar5.F.d();
                            boolean[] zArr22222 = dVar5.I;
                            boolean z1922222 = zArr22222[0];
                            boolean z2022222 = zArr22222[1];
                            g gVar1622222 = null;
                            if (dVar5.h == 2) {
                            }
                            dVar5 = this;
                            l lVar2222222 = dVar5.e;
                            fVar = lVar2222222.h;
                            if (fVar.j) {
                            }
                            dVar2 = dVar;
                            gVar9 = gVar6;
                            gVar8 = gVar5;
                            gVar7 = gVar4;
                            i9 = 8;
                            i8 = 0;
                            i7 = 1;
                            i6 = 1;
                            if ((dVar5.i == 2 ? i8 : i6) != 0) {
                            }
                            if (z6) {
                            }
                            if (dVar3.F.d()) {
                            }
                        }
                    }
                    c2 = 0;
                    i2 = i20;
                    i3 = i21;
                    i5 = i16;
                    i4 = i18;
                    z6 = true;
                    int[] iArr22222 = dVar5.l;
                    iArr22222[c2] = i2;
                    iArr22222[1] = i3;
                    if (z6) {
                    }
                    z7 = false;
                    if (dVar5.J[0] != aVar2) {
                    }
                    if (!z17) {
                    }
                    boolean z18222222 = !dVar5.F.d();
                    boolean[] zArr222222 = dVar5.I;
                    boolean z19222222 = zArr222222[0];
                    boolean z20222222 = zArr222222[1];
                    g gVar16222222 = null;
                    if (dVar5.h == 2) {
                    }
                    dVar5 = this;
                    l lVar22222222 = dVar5.e;
                    fVar = lVar22222222.h;
                    if (fVar.j) {
                    }
                    dVar2 = dVar;
                    gVar9 = gVar6;
                    gVar8 = gVar5;
                    gVar7 = gVar4;
                    i9 = 8;
                    i8 = 0;
                    i7 = 1;
                    i6 = 1;
                    if ((dVar5.i == 2 ? i8 : i6) != 0) {
                    }
                    if (z6) {
                    }
                    if (dVar3.F.d()) {
                    }
                }
            }
        } else {
            gVar = l3;
        }
        c2 = 0;
        i2 = i20;
        i3 = i21;
        z6 = false;
        i5 = i16;
        i4 = i18;
        int[] iArr222222 = dVar5.l;
        iArr222222[c2] = i2;
        iArr222222[1] = i3;
        if (z6) {
        }
        z7 = false;
        if (dVar5.J[0] != aVar2) {
        }
        if (!z17) {
        }
        boolean z182222222 = !dVar5.F.d();
        boolean[] zArr2222222 = dVar5.I;
        boolean z192222222 = zArr2222222[0];
        boolean z202222222 = zArr2222222[1];
        g gVar162222222 = null;
        if (dVar5.h == 2) {
        }
        dVar5 = this;
        l lVar222222222 = dVar5.e;
        fVar = lVar222222222.h;
        if (fVar.j) {
        }
        dVar2 = dVar;
        gVar9 = gVar6;
        gVar8 = gVar5;
        gVar7 = gVar4;
        i9 = 8;
        i8 = 0;
        i7 = 1;
        i6 = 1;
        if ((dVar5.i == 2 ? i8 : i6) != 0) {
        }
        if (z6) {
        }
        if (dVar3.F.d()) {
        }
    }

    public boolean c() {
        return this.X != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x039d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:288:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:292:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174  */
    public final void d(a.f.b.d dVar, boolean z2, boolean z3, boolean z4, boolean z5, g gVar, g gVar2, a aVar, boolean z6, c cVar, c cVar2, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f3, boolean z11) {
        int i10;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        char c2;
        boolean z16;
        int i14;
        g gVar3;
        int i15;
        g gVar4;
        int i16;
        g gVar5;
        g gVar6;
        int i17;
        c cVar3;
        a[] aVarArr;
        a aVar2;
        boolean z17;
        int i18;
        g gVar7;
        g gVar8;
        int i19;
        g gVar9;
        g gVar10;
        int i20;
        boolean z18;
        int i21;
        int i22;
        boolean z19;
        int i23;
        boolean z20;
        boolean z21;
        boolean z22;
        int i24;
        g gVar11;
        int i25;
        boolean z23;
        d dVar2;
        int i26;
        g gVar12;
        g gVar13;
        g gVar14;
        d dVar3;
        d dVar4;
        boolean z24;
        int i27;
        int i28;
        int i29;
        d dVar5;
        int i30;
        boolean z25;
        int i31;
        boolean z26;
        int i32;
        int i33;
        boolean z27;
        int i34;
        boolean z28;
        int i35;
        g gVar15;
        g gVar16;
        int i36 = i8;
        int i37 = i9;
        c.a aVar3 = c.a.BOTTOM;
        g l2 = dVar.l(cVar);
        g l3 = dVar.l(cVar2);
        g l4 = dVar.l(cVar.d);
        g l5 = dVar.l(cVar2.d);
        boolean d2 = cVar.d();
        boolean d3 = cVar2.d();
        boolean d4 = this.F.d();
        if (d3) {
            i10 = (d2 ? 1 : 0) + 1;
        } else {
            i10 = d2 ? 1 : 0;
        }
        if (d4) {
            i10++;
        }
        int i38 = z7 ? 3 : i6;
        int ordinal = aVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal == 2) {
            if (i38 != 4) {
                z12 = true;
                z13 = z12;
                if (this.X != 8) {
                    i11 = 0;
                    z13 = false;
                } else {
                    i11 = i3;
                }
                if (!z11) {
                    if (!d2 && !d3 && !d4) {
                        dVar.e(l2, i2);
                    } else if (d2 && !d3) {
                        z14 = d4;
                        i12 = 8;
                        dVar.d(l2, l4, cVar.b(), 8);
                    }
                    z14 = d4;
                    i12 = 8;
                } else {
                    z14 = d4;
                    i12 = 8;
                }
                if (z13) {
                    if (z6) {
                        dVar.d(l3, l2, 0, 3);
                        if (i4 > 0) {
                            dVar.f(l3, l2, i4, i12);
                        }
                        if (i5 < Integer.MAX_VALUE) {
                            dVar.g(l3, l2, i5, i12);
                        }
                    } else {
                        dVar.d(l3, l2, i11, i12);
                    }
                    c2 = 3;
                } else {
                    c2 = 3;
                    if (i10 == 2 || z7 || !(i38 == 1 || i38 == 0)) {
                        if (i36 == -2) {
                            i36 = i11;
                        }
                        if (i37 == -2) {
                            i37 = i11;
                        }
                        if (i11 > 0 && i38 != 1) {
                            i11 = 0;
                        }
                        if (i36 > 0) {
                            dVar.f(l3, l2, i36, 8);
                            i11 = Math.max(i11, i36);
                        }
                        if (i37 > 0) {
                            if (!z3 || i38 != 1) {
                                i35 = 8;
                                dVar.g(l3, l2, i37, 8);
                            } else {
                                i35 = 8;
                            }
                            i11 = Math.min(i11, i37);
                        } else {
                            i35 = 8;
                        }
                        if (i38 == 1) {
                            if (z3) {
                                dVar.d(l3, l2, i11, i35);
                            } else {
                                dVar.d(l3, l2, i11, 5);
                                dVar.g(l3, l2, i11, i35);
                            }
                        } else if (i38 == 2) {
                            c.a aVar4 = cVar.f338c;
                            c.a aVar5 = c.a.TOP;
                            if (aVar4 == aVar5 || aVar4 == aVar3) {
                                g l6 = dVar.l(this.K.f(aVar5));
                                gVar16 = dVar.l(this.K.f(aVar3));
                                gVar15 = l6;
                            } else {
                                gVar15 = dVar.l(this.K.f(c.a.LEFT));
                                gVar16 = dVar.l(this.K.f(c.a.RIGHT));
                            }
                            b m2 = dVar.m();
                            m2.d(l3, l2, gVar16, gVar15, f3);
                            dVar.c(m2);
                        } else {
                            i13 = i36;
                            z15 = true;
                            if (z11) {
                                gVar4 = gVar2;
                                i17 = i10;
                                gVar5 = l3;
                                gVar3 = l2;
                                z16 = z15;
                                i16 = 0;
                                i14 = 1;
                                gVar6 = gVar;
                                i15 = 2;
                            } else if (z8) {
                                gVar4 = gVar2;
                                i17 = i10;
                                gVar5 = l3;
                                gVar3 = l2;
                                z16 = z15;
                                i16 = 0;
                                i15 = 2;
                                i14 = 1;
                                gVar6 = gVar;
                            } else {
                                if ((!d2 && !d3 && !z14) || (d2 && !d3)) {
                                    gVar10 = l5;
                                } else if (d2 || !d3) {
                                    gVar10 = l5;
                                    i20 = 0;
                                    if (d2 && d3) {
                                        d dVar6 = cVar.d.f337b;
                                        d dVar7 = cVar2.d.f337b;
                                        d dVar8 = this.K;
                                        int i39 = 6;
                                        if (z13) {
                                            if (i38 == 0) {
                                                if (i37 == 0 && i13 == 0) {
                                                    z28 = false;
                                                    z19 = true;
                                                    i22 = 8;
                                                    i21 = 8;
                                                } else {
                                                    z28 = true;
                                                    z19 = false;
                                                    i22 = 5;
                                                    i21 = 5;
                                                }
                                                if ((dVar6 instanceof a) || (dVar7 instanceof a)) {
                                                    i21 = 4;
                                                }
                                                z21 = z28;
                                                i23 = 6;
                                                z20 = true;
                                                z18 = false;
                                            } else if (i38 == 1) {
                                                i31 = 8;
                                                z20 = true;
                                                z25 = true;
                                                z18 = true;
                                                i22 = i31;
                                                z21 = z25;
                                                i23 = 6;
                                                z19 = false;
                                                i21 = 4;
                                            } else if (i38 == 3) {
                                                if (this.s == -1) {
                                                    i23 = z9 ? z3 ? 5 : 4 : 8;
                                                    i33 = 5;
                                                    z20 = true;
                                                    i32 = 8;
                                                } else if (z7) {
                                                    if (i7 != 2) {
                                                        z20 = true;
                                                        if (i7 != 1) {
                                                            z27 = false;
                                                            if (z27) {
                                                                i33 = 5;
                                                                i34 = 8;
                                                            } else {
                                                                i33 = 4;
                                                                i34 = 5;
                                                            }
                                                            i32 = i34;
                                                            i23 = 6;
                                                        }
                                                    } else {
                                                        z20 = true;
                                                    }
                                                    z27 = z20;
                                                    if (z27) {
                                                    }
                                                    i32 = i34;
                                                    i23 = 6;
                                                } else {
                                                    z20 = true;
                                                    if (i37 > 0) {
                                                        i33 = 5;
                                                    } else if (i37 != 0 || i13 != 0) {
                                                        i33 = 4;
                                                    } else if (!z9) {
                                                        i33 = 8;
                                                    } else {
                                                        i32 = (dVar6 == dVar8 || dVar7 == dVar8) ? 5 : 4;
                                                        i23 = 6;
                                                        i33 = 4;
                                                    }
                                                    i23 = 6;
                                                    i32 = 5;
                                                }
                                                i21 = i33;
                                                z21 = z20;
                                                z18 = z21;
                                                i22 = i32;
                                                z19 = z18;
                                            } else {
                                                z20 = true;
                                                z26 = false;
                                                z25 = false;
                                            }
                                            if (z18 || l4 != gVar10 || dVar6 == dVar8) {
                                                z22 = z20;
                                            } else {
                                                z22 = false;
                                                z18 = false;
                                            }
                                            if (!z21) {
                                                z17 = z15;
                                                dVar4 = dVar6;
                                                i25 = i38;
                                                i24 = i13;
                                                dVar3 = dVar7;
                                                gVar11 = gVar10;
                                                z23 = true;
                                                i26 = 4;
                                                gVar12 = l4;
                                                gVar13 = l3;
                                                dVar2 = dVar8;
                                                gVar14 = l2;
                                                dVar.b(l2, l4, cVar.b(), f2, gVar10, l3, cVar2.b(), this.X == 8 ? 4 : i23);
                                            } else {
                                                z23 = z20;
                                                gVar11 = gVar10;
                                                gVar12 = l4;
                                                z17 = z15;
                                                i24 = i13;
                                                dVar2 = dVar8;
                                                i25 = i38;
                                                i26 = 4;
                                                dVar4 = dVar6;
                                                dVar3 = dVar7;
                                                gVar13 = l3;
                                                gVar14 = l2;
                                            }
                                            if (this.X == 8) {
                                                gVar8 = gVar11;
                                                if (z18) {
                                                    int i40 = (!z3 || gVar12 == gVar8 || z13 || (!(dVar4 instanceof a) && !(dVar3 instanceof a))) ? i22 : 6;
                                                    dVar.f(gVar14, gVar12, cVar.b(), i40);
                                                    dVar.g(gVar13, gVar8, -cVar2.b(), i40);
                                                    i22 = i40;
                                                }
                                                if (!z3 || !z10 || (dVar4 instanceof a) || (dVar3 instanceof a)) {
                                                    i28 = i22;
                                                    i27 = i21;
                                                    z24 = z22;
                                                } else {
                                                    i28 = 6;
                                                    i27 = 6;
                                                    z24 = z23;
                                                }
                                                if (z24) {
                                                    if (!z19 || (z9 && !z4)) {
                                                        dVar5 = dVar2;
                                                    } else {
                                                        dVar5 = dVar2;
                                                        if (!(dVar4 == dVar5 || dVar3 == dVar5)) {
                                                            i39 = i27;
                                                        }
                                                        if ((dVar4 instanceof f) || (dVar3 instanceof f)) {
                                                            i39 = 5;
                                                        }
                                                        if ((dVar4 instanceof a) || (dVar3 instanceof a)) {
                                                            i39 = 5;
                                                        }
                                                        i27 = Math.max(z9 ? 5 : i39, i27);
                                                    }
                                                    if (z3) {
                                                        i30 = (!z7 || z9 || !(dVar4 == dVar5 || dVar3 == dVar5)) ? Math.min(i28, i27) : i26;
                                                    } else {
                                                        i30 = i27;
                                                    }
                                                    dVar.d(gVar14, gVar12, cVar.b(), i30);
                                                    dVar.d(gVar13, gVar8, -cVar2.b(), i30);
                                                }
                                                if (z3) {
                                                    gVar7 = gVar13;
                                                    int b2 = gVar == gVar12 ? cVar.b() : 0;
                                                    if (gVar12 != gVar) {
                                                        dVar.f(gVar14, gVar, b2, 5);
                                                    }
                                                } else {
                                                    gVar7 = gVar13;
                                                }
                                                if (!z3 || !z13 || i4 != 0 || i24 != 0) {
                                                    i18 = 0;
                                                    if (!z3 && z17) {
                                                        if (cVar2.d != null) {
                                                            i19 = cVar2.b();
                                                            gVar9 = gVar2;
                                                        } else {
                                                            gVar9 = gVar2;
                                                            i19 = i18;
                                                        }
                                                        if (gVar8 != gVar9) {
                                                            dVar.f(gVar9, gVar7, i19, 5);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (!z13 || i25 != 3) {
                                                    i18 = 0;
                                                    i29 = 5;
                                                } else {
                                                    i29 = 8;
                                                    i18 = 0;
                                                }
                                                dVar.f(gVar7, gVar14, i18, i29);
                                                if (!z3) {
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        z20 = true;
                                        z26 = true;
                                        z25 = true;
                                        z18 = z26;
                                        i31 = 5;
                                        i22 = i31;
                                        z21 = z25;
                                        i23 = 6;
                                        z19 = false;
                                        i21 = 4;
                                        if (z18) {
                                        }
                                        z22 = z20;
                                        if (!z21) {
                                        }
                                        if (this.X == 8) {
                                        }
                                    }
                                    i18 = i20;
                                    gVar8 = gVar10;
                                    gVar7 = l3;
                                    z17 = z15;
                                    if (!z3) {
                                    }
                                } else {
                                    gVar10 = l5;
                                    dVar.d(l3, gVar10, -cVar2.b(), 8);
                                    if (z3) {
                                        i20 = 0;
                                        dVar.f(l2, gVar, 0, 5);
                                        i18 = i20;
                                        gVar8 = gVar10;
                                        gVar7 = l3;
                                        z17 = z15;
                                        if (!z3) {
                                        }
                                    }
                                }
                                i20 = 0;
                                i18 = i20;
                                gVar8 = gVar10;
                                gVar7 = l3;
                                z17 = z15;
                                if (!z3) {
                                }
                            }
                            if (i17 < i15 && z3 && z16) {
                                dVar.f(gVar3, gVar6, i16, 8);
                                int i41 = (z2 || this.C.d == null) ? i14 : i16;
                                if (!z2 && (cVar3 = this.C.d) != null) {
                                    d dVar9 = cVar3.f337b;
                                    i41 = (dVar9.N != 0.0f && (aVarArr = dVar9.J)[i16] == (aVar2 = a.MATCH_CONSTRAINT) && aVarArr[i14] == aVar2) ? i14 : i16;
                                }
                                if (i41 != 0) {
                                    dVar.f(gVar4, gVar5, i16, 8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        int max = Math.max(i36, i11);
                        if (i37 > 0) {
                            max = Math.min(i37, max);
                        }
                        dVar.d(l3, l2, max, 8);
                    }
                    z15 = z5;
                    i13 = i36;
                    z13 = false;
                    if (z11) {
                    }
                    if (i17 < i15) {
                        return;
                    }
                    return;
                }
                z15 = z5;
                i13 = i36;
                if (z11) {
                }
                if (i17 < i15) {
                }
            }
        }
        z12 = false;
        z13 = z12;
        if (this.X != 8) {
        }
        if (!z11) {
        }
        if (z13) {
        }
        z15 = z5;
        i13 = i36;
        if (z11) {
        }
        if (i17 < i15) {
        }
    }

    public void e(a.f.b.d dVar) {
        dVar.l(this.y);
        dVar.l(this.z);
        dVar.l(this.A);
        dVar.l(this.B);
        if (this.R > 0) {
            dVar.l(this.C);
        }
    }

    public c f(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.y;
            case 2:
                return this.z;
            case 3:
                return this.A;
            case 4:
                return this.B;
            case 5:
                return this.C;
            case 6:
                return this.F;
            case 7:
                return this.D;
            case 8:
                return this.E;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int g() {
        return q() + this.M;
    }

    public a h(int i2) {
        if (i2 == 0) {
            return j();
        }
        if (i2 == 1) {
            return n();
        }
        return null;
    }

    public int i() {
        if (this.X == 8) {
            return 0;
        }
        return this.M;
    }

    public a j() {
        return this.J[0];
    }

    public d k(int i2) {
        c cVar;
        c cVar2;
        if (i2 == 0) {
            c cVar3 = this.A;
            c cVar4 = cVar3.d;
            if (cVar4 == null || cVar4.d != cVar3) {
                return null;
            }
            return cVar4.f337b;
        } else if (i2 == 1 && (cVar2 = (cVar = this.B).d) != null && cVar2.d == cVar) {
            return cVar2.f337b;
        } else {
            return null;
        }
    }

    public d l(int i2) {
        c cVar;
        c cVar2;
        if (i2 == 0) {
            c cVar3 = this.y;
            c cVar4 = cVar3.d;
            if (cVar4 == null || cVar4.d != cVar3) {
                return null;
            }
            return cVar4.f337b;
        } else if (i2 == 1 && (cVar2 = (cVar = this.z).d) != null && cVar2.d == cVar) {
            return cVar2.f337b;
        } else {
            return null;
        }
    }

    public int m() {
        return p() + this.L;
    }

    public a n() {
        return this.J[1];
    }

    public int o() {
        if (this.X == 8) {
            return 0;
        }
        return this.L;
    }

    public int p() {
        d dVar = this.K;
        return (dVar == null || !(dVar instanceof e)) ? this.P : ((e) dVar).k0 + this.P;
    }

    public int q() {
        d dVar = this.K;
        return (dVar == null || !(dVar instanceof e)) ? this.Q : ((e) dVar).l0 + this.Q;
    }

    public final boolean r(int i2) {
        int i3 = i2 * 2;
        c[] cVarArr = this.G;
        if (!(cVarArr[i3].d == null || cVarArr[i3].d.d == cVarArr[i3])) {
            int i4 = i3 + 1;
            return cVarArr[i4].d != null && cVarArr[i4].d.d == cVarArr[i4];
        }
    }

    public boolean s() {
        c cVar = this.y;
        c cVar2 = cVar.d;
        if (cVar2 != null && cVar2.d == cVar) {
            return true;
        }
        c cVar3 = this.A;
        c cVar4 = cVar3.d;
        return cVar4 != null && cVar4.d == cVar3;
    }

    public boolean t() {
        c cVar = this.z;
        c cVar2 = cVar.d;
        if (cVar2 != null && cVar2.d == cVar) {
            return true;
        }
        c cVar3 = this.B;
        c cVar4 = cVar3.d;
        return cVar4 != null && cVar4.d == cVar3;
    }

    public String toString() {
        String str = "";
        StringBuilder d2 = b.a.a.a.a.d(str);
        if (this.Y != null) {
            StringBuilder d3 = b.a.a.a.a.d("id: ");
            d3.append(this.Y);
            d3.append(" ");
            str = d3.toString();
        }
        d2.append(str);
        d2.append("(");
        d2.append(this.P);
        d2.append(", ");
        d2.append(this.Q);
        d2.append(") - (");
        d2.append(this.L);
        d2.append(" x ");
        d2.append(this.M);
        d2.append(")");
        return d2.toString();
    }

    public void u() {
        this.y.e();
        this.z.e();
        this.A.e();
        this.B.e();
        this.C.e();
        this.D.e();
        this.E.e();
        this.F.e();
        this.K = null;
        this.v = 0.0f;
        this.L = 0;
        this.M = 0;
        this.N = 0.0f;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        a[] aVarArr = this.J;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.W = null;
        this.X = 0;
        this.Z = 0;
        this.a0 = 0;
        float[] fArr = this.b0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.h = -1;
        this.i = -1;
        int[] iArr = this.u;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.j = 0;
        this.k = 0;
        this.o = 1.0f;
        this.r = 1.0f;
        this.n = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.m = 0;
        this.p = 0;
        this.s = -1;
        this.t = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.I;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void v(a.f.b.c cVar) {
        this.y.f();
        this.z.f();
        this.A.f();
        this.B.f();
        this.C.f();
        this.F.f();
        this.D.f();
        this.E.f();
    }

    public void w(int i2) {
        this.M = i2;
        int i3 = this.T;
        if (i2 < i3) {
            this.M = i3;
        }
    }

    public void x(a aVar) {
        this.J[0] = aVar;
    }

    public void y(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.T = i2;
    }

    public void z(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.S = i2;
    }
}
