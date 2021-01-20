package a.f.b.i.l;

import a.f.b.i.c;
import a.f.b.i.d;
import a.f.b.i.g;
import a.f.b.i.l.f;
import a.f.b.i.l.m;
import b.a.a.a.a;
import java.util.List;

public class j extends m {
    public static int[] k = new int[2];

    public j(d dVar) {
        super(dVar);
        this.h.e = f.a.LEFT;
        this.i.e = f.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0264, code lost:
        if (r7 != 1) goto L_0x02b1;
     */
    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2;
        float f4;
        int i3;
        int i4;
        float f5;
        int i5;
        float f6;
        f fVar;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        int[] iArr = k;
        int ordinal = this.j.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal != 3) {
            g gVar = this.e;
            if (!gVar.j && this.d == aVar) {
                d dVar2 = this.f368b;
                int i6 = dVar2.j;
                if (i6 == 2) {
                    d dVar3 = dVar2.K;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.d.e;
                        if (gVar2.j) {
                            f2 = dVar2.o;
                            f3 = (float) gVar2.g;
                        }
                    }
                } else if (i6 == 3) {
                    int i7 = dVar2.k;
                    if (i7 == 0 || i7 == 3) {
                        l lVar = dVar2.e;
                        f fVar2 = lVar.h;
                        f fVar3 = lVar.i;
                        boolean z = dVar2.y.d != null;
                        boolean z2 = dVar2.z.d != null;
                        boolean z3 = dVar2.A.d != null;
                        boolean z4 = dVar2.B.d != null;
                        int i8 = dVar2.O;
                        if (z && z2 && z3 && z4) {
                            float f7 = dVar2.N;
                            if (!fVar2.j || !fVar3.j) {
                                f fVar4 = this.h;
                                if (fVar4.j) {
                                    f fVar5 = this.i;
                                    if (fVar5.j) {
                                        if (fVar2.f360c && fVar3.f360c) {
                                            f6 = f7;
                                            i5 = i8;
                                            m(iArr, fVar4.g + fVar4.f, fVar5.g - fVar5.f, fVar2.l.get(0).g + fVar2.f, fVar3.l.get(0).g - fVar3.f, f7, i8);
                                            this.e.c(iArr[0]);
                                            this.f368b.e.e.c(iArr[1]);
                                            fVar = this.h;
                                            if (fVar.f360c && this.i.f360c && fVar2.f360c && fVar3.f360c) {
                                                m(iArr, fVar.l.get(0).g + this.h.f, this.i.l.get(0).g - this.i.f, fVar2.l.get(0).g + fVar2.f, fVar3.l.get(0).g - fVar3.f, f6, i5);
                                                this.e.c(iArr[0]);
                                                gVar = this.f368b.e.e;
                                                i = iArr[1];
                                                gVar.c(i);
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                f6 = f7;
                                i5 = i8;
                                fVar = this.h;
                                if (fVar.f360c) {
                                    return;
                                }
                                return;
                            }
                            f fVar6 = this.h;
                            if (fVar6.f360c && this.i.f360c) {
                                m(iArr, fVar6.l.get(0).g + this.h.f, this.i.l.get(0).g - this.i.f, fVar2.g + fVar2.f, fVar3.g - fVar3.f, f7, i8);
                                this.e.c(iArr[0]);
                                this.f368b.e.e.c(iArr[1]);
                                return;
                            }
                            return;
                        } else if (z && z3) {
                            f fVar7 = this.h;
                            if (fVar7.f360c && this.i.f360c) {
                                float f8 = dVar2.N;
                                int i9 = fVar7.l.get(0).g + this.h.f;
                                int i10 = this.i.l.get(0).g - this.i.f;
                                if (i8 == -1 || i8 == 0) {
                                    i4 = g(i10 - i9, 0);
                                    int i11 = (int) ((((float) i4) * f8) + 0.5f);
                                    i3 = g(i11, 1);
                                    if (i11 != i3) {
                                        f5 = ((float) i3) / f8;
                                    }
                                    this.e.c(i4);
                                    this.f368b.e.e.c(i3);
                                } else if (i8 == 1) {
                                    i4 = g(i10 - i9, 0);
                                    int i12 = (int) ((((float) i4) / f8) + 0.5f);
                                    i3 = g(i12, 1);
                                    if (i12 != i3) {
                                        f5 = ((float) i3) * f8;
                                    }
                                    this.e.c(i4);
                                    this.f368b.e.e.c(i3);
                                }
                                i4 = (int) (f5 + 0.5f);
                                this.e.c(i4);
                                this.f368b.e.e.c(i3);
                            } else {
                                return;
                            }
                        } else if (z2 && z4) {
                            if (fVar2.f360c && fVar3.f360c) {
                                float f9 = dVar2.N;
                                int i13 = fVar2.l.get(0).g + fVar2.f;
                                int i14 = fVar3.l.get(0).g - fVar3.f;
                                if (i8 != -1) {
                                    if (i8 == 0) {
                                        i = g(i14 - i13, 1);
                                        int i15 = (int) ((((float) i) * f9) + 0.5f);
                                        i2 = g(i15, 0);
                                        if (i15 != i2) {
                                            f4 = ((float) i2) / f9;
                                            i = (int) (f4 + 0.5f);
                                        }
                                        this.e.c(i2);
                                        gVar = this.f368b.e.e;
                                        gVar.c(i);
                                    }
                                }
                                i = g(i14 - i13, 1);
                                int i16 = (int) ((((float) i) / f9) + 0.5f);
                                i2 = g(i16, 0);
                                if (i16 != i2) {
                                    f4 = ((float) i2) * f9;
                                    i = (int) (f4 + 0.5f);
                                }
                                this.e.c(i2);
                                gVar = this.f368b.e.e;
                                gVar.c(i);
                            } else {
                                return;
                            }
                        }
                    } else {
                        int i17 = dVar2.O;
                        if (i17 != -1) {
                            if (i17 == 0) {
                                f = ((float) dVar2.e.e.g) / dVar2.N;
                                i = (int) (f + 0.5f);
                                gVar.c(i);
                            } else if (i17 != 1) {
                                i = 0;
                                gVar.c(i);
                            }
                        }
                        f3 = (float) dVar2.e.e.g;
                        f2 = dVar2.N;
                    }
                }
                f = f3 * f2;
                i = (int) (f + 0.5f);
                gVar.c(i);
            }
            f fVar8 = this.h;
            if (fVar8.f360c) {
                f fVar9 = this.i;
                if (fVar9.f360c) {
                    if (!fVar8.j || !fVar9.j || !this.e.j) {
                        if (!this.e.j && this.d == aVar) {
                            d dVar4 = this.f368b;
                            if (dVar4.j == 0 && !dVar4.s()) {
                                int i18 = this.h.l.get(0).g;
                                f fVar10 = this.h;
                                int i19 = i18 + fVar10.f;
                                int i20 = this.i.l.get(0).g + this.i.f;
                                fVar10.c(i19);
                                this.i.c(i20);
                                this.e.c(i20 - i19);
                                return;
                            }
                        }
                        if (!this.e.j && this.d == aVar && this.f367a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            int min = Math.min((this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f), this.e.m);
                            d dVar5 = this.f368b;
                            int i21 = dVar5.n;
                            int max = Math.max(dVar5.m, min);
                            if (i21 > 0) {
                                max = Math.min(i21, max);
                            }
                            this.e.c(max);
                        }
                        if (this.e.j) {
                            f fVar11 = this.h.l.get(0);
                            f fVar12 = this.i.l.get(0);
                            int i22 = fVar11.g;
                            f fVar13 = this.h;
                            int i23 = fVar13.f + i22;
                            int i24 = fVar12.g;
                            int i25 = this.i.f + i24;
                            float f10 = this.f368b.U;
                            if (fVar11 == fVar12) {
                                f10 = 0.5f;
                            } else {
                                i22 = i23;
                                i24 = i25;
                            }
                            fVar13.c((int) ((((float) ((i24 - i22) - this.e.g)) * f10) + ((float) i22) + 0.5f));
                            this.i.c(this.h.g + this.e.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar6 = this.f368b;
        l(dVar6.y, dVar6.A, 0);
    }

    @Override // a.f.b.i.l.m
    public void d() {
        c cVar;
        f fVar;
        d dVar;
        d dVar2;
        List<d> list;
        f fVar2;
        int i;
        f fVar3;
        f fVar4;
        d dVar3;
        d dVar4;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        d.a aVar2 = d.a.MATCH_PARENT;
        d.a aVar3 = d.a.FIXED;
        d dVar5 = this.f368b;
        if (dVar5.f342a) {
            this.e.c(dVar5.o());
        }
        if (!this.e.j) {
            d.a j = this.f368b.j();
            this.d = j;
            if (j != aVar) {
                if (j == aVar2 && (((dVar4 = this.f368b.K) != null && dVar4.j() == aVar3) || dVar4.j() == aVar2)) {
                    int o = (dVar4.o() - this.f368b.y.b()) - this.f368b.A.b();
                    b(this.h, dVar4.d.h, this.f368b.y.b());
                    b(this.i, dVar4.d.i, -this.f368b.A.b());
                    this.e.c(o);
                    return;
                } else if (this.d == aVar3) {
                    this.e.c(this.f368b.o());
                }
            }
        } else if (this.d == aVar2 && (((dVar3 = this.f368b.K) != null && dVar3.j() == aVar3) || dVar3.j() == aVar2)) {
            b(this.h, dVar3.d.h, this.f368b.y.b());
            b(this.i, dVar3.d.i, -this.f368b.A.b());
            return;
        }
        g gVar = this.e;
        if (gVar.j) {
            d dVar6 = this.f368b;
            if (dVar6.f342a) {
                c[] cVarArr = dVar6.G;
                if (cVarArr[0].d == null || cVarArr[1].d == null) {
                    if (cVarArr[0].d != null) {
                        f h = h(cVarArr[0]);
                        if (h != null) {
                            f fVar5 = this.h;
                            int b2 = this.f368b.G[0].b();
                            fVar5.l.add(h);
                            fVar5.f = b2;
                            h.k.add(fVar5);
                        } else {
                            return;
                        }
                    } else if (cVarArr[1].d != null) {
                        f h2 = h(cVarArr[1]);
                        if (h2 != null) {
                            f fVar6 = this.i;
                            fVar6.l.add(h2);
                            fVar6.f = -this.f368b.G[1].b();
                            h2.k.add(fVar6);
                            fVar4 = this.h;
                            fVar3 = this.i;
                            i = -this.e.g;
                            b(fVar4, fVar3, i);
                            return;
                        }
                        return;
                    } else if (!(dVar6 instanceof g) && dVar6.K != null && dVar6.f(c.a.CENTER).d == null) {
                        d dVar7 = this.f368b;
                        b(this.h, dVar7.K.d.h, dVar7.p());
                    } else {
                        return;
                    }
                    fVar4 = this.i;
                    fVar3 = this.h;
                    i = this.e.g;
                    b(fVar4, fVar3, i);
                    return;
                } else if (dVar6.s()) {
                    this.h.f = this.f368b.G[0].b();
                    fVar = this.i;
                    cVar = this.f368b.G[1];
                    fVar.f = -cVar.b();
                } else {
                    f h3 = h(this.f368b.G[0]);
                    if (h3 != null) {
                        f fVar7 = this.h;
                        int b3 = this.f368b.G[0].b();
                        fVar7.l.add(h3);
                        fVar7.f = b3;
                        h3.k.add(fVar7);
                    }
                    f h4 = h(this.f368b.G[1]);
                    if (h4 != null) {
                        f fVar8 = this.i;
                        fVar8.l.add(h4);
                        fVar8.f = -this.f368b.G[1].b();
                        h4.k.add(fVar8);
                    }
                    this.h.f359b = true;
                    this.i.f359b = true;
                    return;
                }
            }
        }
        if (this.d == aVar) {
            d dVar8 = this.f368b;
            int i2 = dVar8.j;
            if (i2 == 2) {
                d dVar9 = dVar8.K;
                if (dVar9 != null) {
                    g gVar2 = dVar9.e.e;
                    gVar.l.add(gVar2);
                    gVar2.k.add(this.e);
                    g gVar3 = this.e;
                    gVar3.f359b = true;
                    gVar3.k.add(this.h);
                    list = this.e.k;
                    dVar2 = this.i;
                }
            } else if (i2 == 3) {
                if (dVar8.k == 3) {
                    this.h.f358a = this;
                    this.i.f358a = this;
                    l lVar = dVar8.e;
                    lVar.h.f358a = this;
                    lVar.i.f358a = this;
                    gVar.f358a = this;
                    if (dVar8.t()) {
                        this.e.l.add(this.f368b.e.e);
                        this.f368b.e.e.k.add(this.e);
                        l lVar2 = this.f368b.e;
                        lVar2.e.f358a = this;
                        this.e.l.add(lVar2.h);
                        this.e.l.add(this.f368b.e.i);
                        this.f368b.e.h.k.add(this.e);
                        list = this.f368b.e.i.k;
                        dVar2 = this.e;
                    } else if (this.f368b.s()) {
                        this.f368b.e.e.l.add(this.e);
                        list = this.e.k;
                        dVar2 = this.f368b.e.e;
                    } else {
                        fVar2 = this.f368b.e.e;
                    }
                } else {
                    g gVar4 = dVar8.e.e;
                    gVar.l.add(gVar4);
                    gVar4.k.add(this.e);
                    this.f368b.e.h.k.add(this.e);
                    this.f368b.e.i.k.add(this.e);
                    g gVar5 = this.e;
                    gVar5.f359b = true;
                    gVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    fVar2 = this.i;
                }
                list = fVar2.l;
                dVar2 = this.e;
            }
            list.add(dVar2);
        }
        d dVar10 = this.f368b;
        c[] cVarArr2 = dVar10.G;
        if (cVarArr2[0].d == null || cVarArr2[1].d == null) {
            if (cVarArr2[0].d != null) {
                f h5 = h(cVarArr2[0]);
                if (h5 != null) {
                    f fVar9 = this.h;
                    int b4 = this.f368b.G[0].b();
                    fVar9.l.add(h5);
                    fVar9.f = b4;
                    h5.k.add(fVar9);
                } else {
                    return;
                }
            } else if (cVarArr2[1].d != null) {
                f h6 = h(cVarArr2[1]);
                if (h6 != null) {
                    f fVar10 = this.i;
                    fVar10.l.add(h6);
                    fVar10.f = -this.f368b.G[1].b();
                    h6.k.add(fVar10);
                    c(this.h, this.i, -1, this.e);
                    return;
                }
                return;
            } else if (!(dVar10 instanceof g) && (dVar = dVar10.K) != null) {
                b(this.h, dVar.d.h, dVar10.p());
            } else {
                return;
            }
            c(this.i, this.h, 1, this.e);
        } else if (dVar10.s()) {
            this.h.f = this.f368b.G[0].b();
            fVar = this.i;
            cVar = this.f368b.G[1];
            fVar.f = -cVar.b();
        } else {
            f h7 = h(this.f368b.G[0]);
            f h8 = h(this.f368b.G[1]);
            h7.k.add(this);
            if (h7.j) {
                a(this);
            }
            h8.k.add(this);
            if (h8.j) {
                a(this);
            }
            this.j = m.a.CENTER;
        }
    }

    @Override // a.f.b.i.l.m
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f368b.P = fVar.g;
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f369c = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        return this.d != d.a.MATCH_CONSTRAINT || this.f368b.j == 0;
    }

    public final void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder d = a.d("HorizontalRun ");
        d.append(this.f368b.Y);
        return d.toString();
    }
}
