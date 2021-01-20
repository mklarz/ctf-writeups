package a.f.b.i.l;

import a.f.b.i.c;
import a.f.b.i.d;

public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f367a;

    /* renamed from: b  reason: collision with root package name */
    public d f368b;

    /* renamed from: c  reason: collision with root package name */
    public k f369c;
    public d.a d;
    public g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    public a j = a.NONE;

    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public m(d dVar) {
        this.f368b = dVar;
    }

    @Override // a.f.b.i.l.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i2) {
        fVar.l.add(fVar2);
        fVar.f = i2;
        fVar2.k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i2;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            d dVar = this.f368b;
            int i5 = dVar.n;
            i4 = Math.max(dVar.m, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            d dVar2 = this.f368b;
            int i6 = dVar2.q;
            i4 = Math.max(dVar2.p, i2);
            if (i6 > 0) {
                i4 = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public final f h(c cVar) {
        m mVar;
        m mVar2;
        c cVar2 = cVar.d;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f337b;
        int ordinal = cVar2.f338c.ordinal();
        if (ordinal == 1) {
            mVar = dVar.d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                mVar2 = dVar.d;
            } else if (ordinal == 4) {
                mVar2 = dVar.e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return dVar.e.k;
            }
            return mVar2.i;
        } else {
            mVar = dVar.e;
        }
        return mVar.h;
    }

    public final f i(c cVar, int i2) {
        c cVar2 = cVar.d;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f337b;
        m mVar = i2 == 0 ? dVar.d : dVar.e;
        int ordinal = cVar2.f338c.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return mVar.h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return mVar.i;
        }
        return null;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.j) {
            return (long) gVar.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r14.f367a == 3) goto L_0x00b3;
     */
    public void l(c cVar, c cVar2, int i2) {
        float f2;
        d.a aVar;
        int i3;
        int i4;
        f h2 = h(cVar);
        f h3 = h(cVar2);
        if (h2.j && h3.j) {
            int b2 = cVar.b() + h2.g;
            int b3 = h3.g - cVar2.b();
            int i5 = b3 - b2;
            g gVar = this.e;
            if (!gVar.j && this.d == (aVar = d.a.MATCH_CONSTRAINT)) {
                int i6 = this.f367a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        int g2 = g(gVar.m, i2);
                        g gVar2 = this.e;
                        i3 = Math.min(g2, i5);
                        gVar = gVar2;
                    } else if (i6 == 2) {
                        d dVar = this.f368b;
                        d dVar2 = dVar.K;
                        if (dVar2 != null) {
                            g gVar3 = (i2 == 0 ? dVar2.d : dVar2.e).e;
                            if (gVar3.j) {
                                i4 = (int) ((((float) gVar3.g) * (i2 == 0 ? dVar.o : dVar.r)) + 0.5f);
                            }
                        }
                    } else if (i6 == 3) {
                        d dVar3 = this.f368b;
                        m mVar = dVar3.d;
                        if (mVar.d == aVar && mVar.f367a == 3) {
                            l lVar = dVar3.e;
                            if (lVar.d == aVar) {
                            }
                        }
                        if (i2 == 0) {
                            mVar = dVar3.e;
                        }
                        g gVar4 = mVar.e;
                        if (gVar4.j) {
                            float f3 = dVar3.N;
                            i3 = i2 == 1 ? (int) ((((float) gVar4.g) / f3) + 0.5f) : (int) ((f3 * ((float) gVar4.g)) + 0.5f);
                        }
                    }
                    gVar.c(i3);
                } else {
                    i4 = i5;
                }
                i3 = g(i4, i2);
                gVar.c(i3);
            }
            g gVar5 = this.e;
            if (gVar5.j) {
                int i7 = gVar5.g;
                if (i7 == i5) {
                    this.h.c(b2);
                    this.i.c(b3);
                    return;
                }
                if (i2 == 0) {
                    f2 = this.f368b.U;
                } else {
                    f2 = this.f368b.V;
                }
                if (h2 == h3) {
                    b2 = h2.g;
                    b3 = h3.g;
                    f2 = 0.5f;
                }
                this.h.c((int) ((((float) ((b3 - b2) - i7)) * f2) + ((float) b2) + 0.5f));
                this.i.c(this.h.g + this.e.g);
            }
        }
    }
}
