package a.f.b.i.l;

import a.f.b.i.d;
import a.f.b.i.f;

public class h extends m {
    public h(d dVar) {
        super(dVar);
        dVar.d.f();
        dVar.e.f();
        this.f = ((f) dVar).i0;
    }

    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        f fVar = this.h;
        if (fVar.f360c && !fVar.j) {
            this.h.c((int) ((((float) fVar.l.get(0).g) * ((f) this.f368b).e0) + 0.5f));
        }
    }

    @Override // a.f.b.i.l.m
    public void d() {
        m mVar;
        d dVar = this.f368b;
        f fVar = (f) dVar;
        int i = fVar.f0;
        int i2 = fVar.g0;
        if (fVar.i0 == 1) {
            f fVar2 = this.h;
            if (i != -1) {
                fVar2.l.add(dVar.K.d.h);
                this.f368b.K.d.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                fVar2.l.add(dVar.K.d.i);
                this.f368b.K.d.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                fVar2.f359b = true;
                fVar2.l.add(dVar.K.d.i);
                this.f368b.K.d.i.k.add(this.h);
            }
            m(this.f368b.d.h);
            mVar = this.f368b.d;
        } else {
            f fVar3 = this.h;
            if (i != -1) {
                fVar3.l.add(dVar.K.e.h);
                this.f368b.K.e.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                fVar3.l.add(dVar.K.e.i);
                this.f368b.K.e.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                fVar3.f359b = true;
                fVar3.l.add(dVar.K.e.i);
                this.f368b.K.e.i.k.add(this.h);
            }
            m(this.f368b.e.h);
            mVar = this.f368b.e;
        }
        m(mVar.i);
    }

    @Override // a.f.b.i.l.m
    public void e() {
        d dVar = this.f368b;
        if (((f) dVar).i0 == 1) {
            dVar.P = this.h.g;
        } else {
            dVar.Q = this.h.g;
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
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
