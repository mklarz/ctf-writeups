package a.f.b.i.l;

import a.f.b.i.c;
import a.f.b.i.d;
import a.f.b.i.g;
import a.f.b.i.l.f;
import a.f.b.i.l.m;
import b.a.a.a.a;
import java.util.List;

public class l extends m {
    public f k;
    public g l = null;

    public l(d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.k = fVar;
        this.h.e = f.a.TOP;
        this.i.e = f.a.BOTTOM;
        fVar.e = f.a.BASELINE;
        this.f = 1;
    }

    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        int ordinal = this.j.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal != 3) {
            g gVar = this.e;
            if (gVar.f360c && !gVar.j && this.d == aVar) {
                d dVar2 = this.f368b;
                int i2 = dVar2.k;
                if (i2 == 2) {
                    d dVar3 = dVar2.K;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.e.e;
                        if (gVar2.j) {
                            f2 = dVar2.r;
                            f3 = (float) gVar2.g;
                        }
                    }
                } else if (i2 == 3) {
                    g gVar3 = dVar2.d.e;
                    if (gVar3.j) {
                        int i3 = dVar2.O;
                        if (i3 != -1) {
                            if (i3 == 0) {
                                f3 = (float) gVar3.g;
                                f2 = dVar2.N;
                            } else if (i3 != 1) {
                                i = 0;
                                gVar.c(i);
                            }
                        }
                        f = ((float) gVar3.g) / dVar2.N;
                        i = (int) (f + 0.5f);
                        gVar.c(i);
                    }
                }
                f = f3 * f2;
                i = (int) (f + 0.5f);
                gVar.c(i);
            }
            f fVar = this.h;
            if (fVar.f360c) {
                f fVar2 = this.i;
                if (fVar2.f360c) {
                    if (!fVar.j || !fVar2.j || !this.e.j) {
                        if (!this.e.j && this.d == aVar) {
                            d dVar4 = this.f368b;
                            if (dVar4.j == 0 && !dVar4.t()) {
                                int i4 = this.h.l.get(0).g;
                                f fVar3 = this.h;
                                int i5 = i4 + fVar3.f;
                                int i6 = this.i.l.get(0).g + this.i.f;
                                fVar3.c(i5);
                                this.i.c(i6);
                                this.e.c(i6 - i5);
                                return;
                            }
                        }
                        if (!this.e.j && this.d == aVar && this.f367a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                            g gVar4 = this.e;
                            int i8 = gVar4.m;
                            if (i7 < i8) {
                                gVar4.c(i7);
                            } else {
                                gVar4.c(i8);
                            }
                        }
                        if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            f fVar4 = this.h.l.get(0);
                            f fVar5 = this.i.l.get(0);
                            int i9 = fVar4.g;
                            f fVar6 = this.h;
                            int i10 = fVar6.f + i9;
                            int i11 = fVar5.g;
                            int i12 = this.i.f + i11;
                            float f4 = this.f368b.V;
                            if (fVar4 == fVar5) {
                                f4 = 0.5f;
                            } else {
                                i9 = i10;
                                i11 = i12;
                            }
                            fVar6.c((int) ((((float) ((i11 - i9) - this.e.g)) * f4) + ((float) i9) + 0.5f));
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
        d dVar5 = this.f368b;
        l(dVar5.z, dVar5.B, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x031c, code lost:
        if (r10.f368b.w != false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0378, code lost:
        if (r0.d == r2) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b1, code lost:
        if (r10.f368b.w != false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x041f, code lost:
        if (r0.d == r2) goto L_0x0421;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    @Override // a.f.b.i.l.m
    public void d() {
        j jVar;
        d dVar;
        f fVar;
        f fVar2;
        g gVar;
        List<d> list;
        d dVar2;
        f fVar3;
        f fVar4;
        d dVar3;
        d dVar4;
        d.a aVar = d.a.MATCH_PARENT;
        d.a aVar2 = d.a.FIXED;
        d.a aVar3 = d.a.MATCH_CONSTRAINT;
        d dVar5 = this.f368b;
        if (dVar5.f342a) {
            this.e.c(dVar5.i());
        }
        if (!this.e.j) {
            this.d = this.f368b.n();
            if (this.f368b.w) {
                this.l = new a(this);
            }
            d.a aVar4 = this.d;
            if (aVar4 != aVar3) {
                if (aVar4 == aVar && (dVar4 = this.f368b.K) != null && dVar4.n() == aVar2) {
                    int i = (dVar4.i() - this.f368b.z.b()) - this.f368b.B.b();
                    b(this.h, dVar4.e.h, this.f368b.z.b());
                    b(this.i, dVar4.e.i, -this.f368b.B.b());
                    this.e.c(i);
                    return;
                } else if (this.d == aVar2) {
                    this.e.c(this.f368b.i());
                }
            }
        } else if (this.d == aVar && (dVar3 = this.f368b.K) != null && dVar3.n() == aVar2) {
            b(this.h, dVar3.e.h, this.f368b.z.b());
            b(this.i, dVar3.e.i, -this.f368b.B.b());
            return;
        }
        g gVar2 = this.e;
        boolean z = gVar2.j;
        if (z) {
            d dVar6 = this.f368b;
            if (dVar6.f342a) {
                c[] cVarArr = dVar6.G;
                if (cVarArr[2].d != null && cVarArr[3].d != null) {
                    if (dVar6.t()) {
                        this.h.f = this.f368b.G[2].b();
                        this.i.f = -this.f368b.G[3].b();
                    } else {
                        f h = h(this.f368b.G[2]);
                        if (h != null) {
                            f fVar5 = this.h;
                            int b2 = this.f368b.G[2].b();
                            fVar5.l.add(h);
                            fVar5.f = b2;
                            h.k.add(fVar5);
                        }
                        f h2 = h(this.f368b.G[3]);
                        if (h2 != null) {
                            f fVar6 = this.i;
                            fVar6.l.add(h2);
                            fVar6.f = -this.f368b.G[3].b();
                            h2.k.add(fVar6);
                        }
                        this.h.f359b = true;
                        this.i.f359b = true;
                    }
                    dVar2 = this.f368b;
                    if (dVar2.w) {
                        fVar3 = this.k;
                        fVar4 = this.h;
                    } else {
                        return;
                    }
                } else if (cVarArr[2].d != null) {
                    f h3 = h(cVarArr[2]);
                    if (h3 != null) {
                        f fVar7 = this.h;
                        int b3 = this.f368b.G[2].b();
                        fVar7.l.add(h3);
                        fVar7.f = b3;
                        h3.k.add(fVar7);
                        b(this.i, this.h, this.e.g);
                        dVar2 = this.f368b;
                        if (dVar2.w) {
                            fVar3 = this.k;
                            fVar4 = this.h;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (cVarArr[3].d != null) {
                    f h4 = h(cVarArr[3]);
                    if (h4 != null) {
                        f fVar8 = this.i;
                        fVar8.l.add(h4);
                        fVar8.f = -this.f368b.G[3].b();
                        h4.k.add(fVar8);
                        b(this.h, this.i, -this.e.g);
                    }
                    dVar2 = this.f368b;
                    if (dVar2.w) {
                        fVar3 = this.k;
                        fVar4 = this.h;
                    } else {
                        return;
                    }
                } else if (cVarArr[4].d != null) {
                    f h5 = h(cVarArr[4]);
                    if (h5 != null) {
                        f fVar9 = this.k;
                        fVar9.l.add(h5);
                        fVar9.f = 0;
                        h5.k.add(fVar9);
                        b(this.h, this.k, -this.f368b.R);
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if (!(dVar6 instanceof g) && dVar6.K != null && dVar6.f(c.a.CENTER).d == null) {
                    d dVar7 = this.f368b;
                    b(this.h, dVar7.K.e.h, dVar7.q());
                    b(this.i, this.h, this.e.g);
                    dVar2 = this.f368b;
                    if (dVar2.w) {
                        fVar3 = this.k;
                        fVar4 = this.h;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                b(fVar3, fVar4, dVar2.R);
                return;
            }
        }
        if (z || this.d != aVar3) {
            gVar2.k.add(this);
            if (gVar2.j) {
                a(this);
            }
        } else {
            d dVar8 = this.f368b;
            int i2 = dVar8.k;
            if (i2 == 2) {
                d dVar9 = dVar8.K;
                if (dVar9 != null) {
                    g gVar3 = dVar9.e.e;
                    gVar2.l.add(gVar3);
                    list = gVar3.k;
                }
            } else if (i2 == 3 && !dVar8.t()) {
                d dVar10 = this.f368b;
                if (dVar10.j != 3) {
                    g gVar4 = dVar10.d.e;
                    this.e.l.add(gVar4);
                    list = gVar4.k;
                }
            }
            list.add(this.e);
            g gVar5 = this.e;
            gVar5.f359b = true;
            gVar5.k.add(this.h);
            this.e.k.add(this.i);
        }
        d dVar11 = this.f368b;
        c[] cVarArr2 = dVar11.G;
        if (cVarArr2[2].d == null || cVarArr2[3].d == null) {
            if (cVarArr2[2].d != null) {
                f h6 = h(cVarArr2[2]);
                if (h6 != null) {
                    f fVar10 = this.h;
                    int b4 = this.f368b.G[2].b();
                    fVar10.l.add(h6);
                    fVar10.f = b4;
                    h6.k.add(fVar10);
                    c(this.i, this.h, 1, this.e);
                    if (this.f368b.w) {
                        c(this.k, this.h, 1, this.l);
                    }
                    if (this.d == aVar3) {
                        d dVar12 = this.f368b;
                        if (dVar12.N > 0.0f) {
                            jVar = dVar12.d;
                        }
                    }
                }
                if (this.e.l.size() != 0) {
                    this.e.f360c = true;
                    return;
                }
                return;
            }
            if (cVarArr2[3].d != null) {
                f h7 = h(cVarArr2[3]);
                if (h7 != null) {
                    f fVar11 = this.i;
                    fVar11.l.add(h7);
                    fVar11.f = -this.f368b.G[3].b();
                    h7.k.add(fVar11);
                    c(this.h, this.i, -1, this.e);
                }
            } else if (cVarArr2[4].d != null) {
                f h8 = h(cVarArr2[4]);
                if (h8 != null) {
                    f fVar12 = this.k;
                    fVar12.l.add(h8);
                    fVar12.f = 0;
                    h8.k.add(fVar12);
                    c(this.h, this.k, -1, this.l);
                    fVar = this.i;
                    fVar2 = this.h;
                    gVar = this.e;
                    c(fVar, fVar2, 1, gVar);
                }
            } else if (!(dVar11 instanceof g) && (dVar = dVar11.K) != null) {
                b(this.h, dVar.e.h, dVar11.q());
                c(this.i, this.h, 1, this.e);
                if (this.f368b.w) {
                    c(this.k, this.h, 1, this.l);
                }
                if (this.d == aVar3) {
                    d dVar13 = this.f368b;
                    if (dVar13.N > 0.0f) {
                        jVar = dVar13.d;
                    }
                }
            }
            if (this.e.l.size() != 0) {
            }
            jVar.e.k.add(this.e);
            this.e.l.add(this.f368b.d.e);
            this.e.f358a = this;
            if (this.e.l.size() != 0) {
            }
        } else if (dVar11.t()) {
            this.h.f = this.f368b.G[2].b();
            this.i.f = -this.f368b.G[3].b();
        } else {
            f h9 = h(this.f368b.G[2]);
            f h10 = h(this.f368b.G[3]);
            h9.k.add(this);
            if (h9.j) {
                a(this);
            }
            h10.k.add(this);
            if (h10.j) {
                a(this);
            }
            this.j = m.a.CENTER;
        }
        fVar = this.k;
        fVar2 = this.h;
        gVar = this.l;
        c(fVar, fVar2, 1, gVar);
        if (this.e.l.size() != 0) {
        }
    }

    @Override // a.f.b.i.l.m
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f368b.Q = fVar.g;
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f369c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.e.b();
        this.g = false;
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        return this.d != d.a.MATCH_CONSTRAINT || this.f368b.k == 0;
    }

    public void m() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder d = a.d("VerticalRun ");
        d.append(this.f368b.Y);
        return d.toString();
    }
}
