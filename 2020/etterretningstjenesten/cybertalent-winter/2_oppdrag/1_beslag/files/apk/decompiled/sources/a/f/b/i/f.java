package a.f.b.i;

import a.f.b.b;
import a.f.b.d;
import a.f.b.g;
import a.f.b.i.c;
import a.f.b.i.d;

public class f extends d {
    public float e0 = -1.0f;
    public int f0 = -1;
    public int g0 = -1;
    public c h0 = this.z;
    public int i0;

    public f() {
        this.i0 = 0;
        this.H.clear();
        this.H.add(this.h0);
        int length = this.G.length;
        for (int i = 0; i < length; i++) {
            this.G[i] = this.h0;
        }
    }

    @Override // a.f.b.i.d
    public void D(d dVar) {
        if (this.K != null) {
            int o = dVar.o(this.h0);
            if (this.i0 == 1) {
                this.P = o;
                this.Q = 0;
                w(this.K.i());
                B(0);
                return;
            }
            this.P = 0;
            this.Q = o;
            B(this.K.o());
            w(0);
        }
    }

    public void E(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            this.H.clear();
            this.h0 = this.i0 == 1 ? this.y : this.z;
            this.H.add(this.h0);
            int length = this.G.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.G[i2] = this.h0;
            }
        }
    }

    @Override // a.f.b.i.d
    public void b(d dVar) {
        d.a aVar = d.a.WRAP_CONTENT;
        e eVar = (e) this.K;
        if (eVar != null) {
            c f = eVar.f(c.a.LEFT);
            c f2 = eVar.f(c.a.RIGHT);
            d dVar2 = this.K;
            boolean z = true;
            boolean z2 = dVar2 != null && dVar2.J[0] == aVar;
            if (this.i0 == 0) {
                f = eVar.f(c.a.TOP);
                f2 = eVar.f(c.a.BOTTOM);
                d dVar3 = this.K;
                if (dVar3 == null || dVar3.J[1] != aVar) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f0 != -1) {
                g l = dVar.l(this.h0);
                dVar.d(l, dVar.l(f), this.f0, 8);
                if (z2) {
                    dVar.f(dVar.l(f2), l, 0, 5);
                }
            } else if (this.g0 != -1) {
                g l2 = dVar.l(this.h0);
                g l3 = dVar.l(f2);
                dVar.d(l2, l3, -this.g0, 8);
                if (z2) {
                    dVar.f(l2, dVar.l(f), 0, 5);
                    dVar.f(l3, l2, 0, 5);
                }
            } else if (this.e0 != -1.0f) {
                g l4 = dVar.l(this.h0);
                g l5 = dVar.l(f2);
                float f3 = this.e0;
                b m = dVar.m();
                m.d.j(l4, -1.0f);
                m.d.j(l5, f3);
                dVar.c(m);
            }
        }
    }

    @Override // a.f.b.i.d
    public boolean c() {
        return true;
    }

    @Override // a.f.b.i.d
    public c f(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.i0 == 1) {
                    return this.h0;
                }
                break;
            case 2:
            case 4:
                if (this.i0 == 0) {
                    return this.h0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}
