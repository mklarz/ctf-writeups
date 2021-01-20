package a.f.b.i.l;

import a.f.b.i.a;
import a.f.b.i.d;
import a.f.b.i.l.f;

public class i extends m {
    public i(d dVar) {
        super(dVar);
    }

    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        a aVar = (a) this.f368b;
        int i = aVar.g0;
        int i2 = 0;
        int i3 = -1;
        for (f fVar : this.h.l) {
            int i4 = fVar.g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.h.c(i3 + aVar.i0);
        } else {
            this.h.c(i2 + aVar.i0);
        }
    }

    @Override // a.f.b.i.l.m
    public void d() {
        m mVar;
        d dVar = this.f368b;
        if (dVar instanceof a) {
            f fVar = this.h;
            fVar.f359b = true;
            a aVar = (a) dVar;
            int i = aVar.g0;
            boolean z = aVar.h0;
            int i2 = 0;
            if (i == 0) {
                fVar.e = f.a.LEFT;
                while (i2 < aVar.f0) {
                    d dVar2 = aVar.e0[i2];
                    if (z || dVar2.X != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.k.add(this.h);
                        this.h.l.add(fVar2);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    fVar.e = f.a.TOP;
                    while (i2 < aVar.f0) {
                        d dVar3 = aVar.e0[i2];
                        if (z || dVar3.X != 8) {
                            f fVar3 = dVar3.e.h;
                            fVar3.k.add(this.h);
                            this.h.l.add(fVar3);
                        }
                        i2++;
                    }
                } else if (i == 3) {
                    fVar.e = f.a.BOTTOM;
                    while (i2 < aVar.f0) {
                        d dVar4 = aVar.e0[i2];
                        if (z || dVar4.X != 8) {
                            f fVar4 = dVar4.e.i;
                            fVar4.k.add(this.h);
                            this.h.l.add(fVar4);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                m(this.f368b.e.h);
                mVar = this.f368b.e;
                m(mVar.i);
            } else {
                fVar.e = f.a.RIGHT;
                while (i2 < aVar.f0) {
                    d dVar5 = aVar.e0[i2];
                    if (z || dVar5.X != 8) {
                        f fVar5 = dVar5.d.i;
                        fVar5.k.add(this.h);
                        this.h.l.add(fVar5);
                    }
                    i2++;
                }
            }
            m(this.f368b.d.h);
            mVar = this.f368b.d;
            m(mVar.i);
        }
    }

    @Override // a.f.b.i.l.m
    public void e() {
        d dVar = this.f368b;
        if (dVar instanceof a) {
            int i = ((a) dVar).g0;
            if (i == 0 || i == 1) {
                dVar.P = this.h.g;
            } else {
                dVar.Q = this.h.g;
            }
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f369c = null;
        this.h.b();
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }
}
