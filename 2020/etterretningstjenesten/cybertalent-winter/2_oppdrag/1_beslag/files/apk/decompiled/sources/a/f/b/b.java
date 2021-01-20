package a.f.b;

import a.f.b.d;
import a.f.b.g;
import java.util.ArrayList;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public g f311a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f312b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<g> f313c = new ArrayList<>();
    public a d;
    public boolean e = false;

    public interface a {
        float a(int i);

        float b(g gVar, boolean z);

        void c(g gVar, float f, boolean z);

        void clear();

        g d(int i);

        float e(g gVar);

        float f(b bVar, boolean z);

        boolean g(g gVar);

        void h(float f);

        void i();

        void j(g gVar, float f);

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    @Override // a.f.b.d.a
    public void a(g gVar) {
        float f;
        int i = gVar.d;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.d.j(gVar, f);
        }
        f = 1.0f;
        this.d.j(gVar, f);
    }

    @Override // a.f.b.d.a
    public g b(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    public b c(d dVar, int i) {
        this.d.j(dVar.k(i, "ep"), 1.0f);
        this.d.j(dVar.k(i, "em"), -1.0f);
        return this;
    }

    @Override // a.f.b.d.a
    public void clear() {
        this.d.clear();
        this.f311a = null;
        this.f312b = 0.0f;
    }

    public b d(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.d.j(gVar, -1.0f);
        this.d.j(gVar2, 1.0f);
        this.d.j(gVar3, f);
        this.d.j(gVar4, -f);
        return this;
    }

    public b e(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f312b = (float) i;
        }
        if (!z) {
            this.d.j(gVar, -1.0f);
            this.d.j(gVar2, 1.0f);
            this.d.j(gVar3, 1.0f);
        } else {
            this.d.j(gVar, 1.0f);
            this.d.j(gVar2, -1.0f);
            this.d.j(gVar3, -1.0f);
        }
        return this;
    }

    public b f(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f312b = (float) i;
        }
        if (!z) {
            this.d.j(gVar, -1.0f);
            this.d.j(gVar2, 1.0f);
            this.d.j(gVar3, -1.0f);
        } else {
            this.d.j(gVar, 1.0f);
            this.d.j(gVar2, -1.0f);
            this.d.j(gVar3, 1.0f);
        }
        return this;
    }

    public b g(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.d.j(gVar3, 0.5f);
        this.d.j(gVar4, 0.5f);
        this.d.j(gVar, -0.5f);
        this.d.j(gVar2, -0.5f);
        this.f312b = -f;
        return this;
    }

    public final boolean h(g gVar) {
        return gVar.l <= 1;
    }

    public final g i(boolean[] zArr, g gVar) {
        g.a aVar;
        int k = this.d.k();
        g gVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < k; i++) {
            float a2 = this.d.a(i);
            if (a2 < 0.0f) {
                g d2 = this.d.d(i);
                if ((zArr == null || !zArr[d2.f325b]) && d2 != gVar && (((aVar = d2.i) == g.a.SLACK || aVar == g.a.ERROR) && a2 < f)) {
                    f = a2;
                    gVar2 = d2;
                }
            }
        }
        return gVar2;
    }

    public void j(g gVar) {
        g gVar2 = this.f311a;
        if (gVar2 != null) {
            this.d.j(gVar2, -1.0f);
            this.f311a = null;
        }
        float b2 = this.d.b(gVar, true) * -1.0f;
        this.f311a = gVar;
        if (b2 != 1.0f) {
            this.f312b /= b2;
            this.d.h(b2);
        }
    }

    public void k(g gVar, boolean z) {
        if (gVar.f) {
            float e2 = this.d.e(gVar);
            this.f312b = (gVar.e * e2) + this.f312b;
            this.d.b(gVar, z);
            if (z) {
                gVar.b(this);
            }
        }
    }

    public void l(b bVar, boolean z) {
        float f = this.d.f(bVar, z);
        this.f312b = (bVar.f312b * f) + this.f312b;
        if (z) {
            bVar.f311a.b(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    public String toString() {
        String str;
        boolean z;
        float a2;
        int i;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        if (this.f311a == null) {
            str = "0";
        } else {
            StringBuilder d2 = b.a.a.a.a.d("");
            d2.append(this.f311a);
            str = d2.toString();
        }
        String b2 = b.a.a.a.a.b(str, " = ");
        if (this.f312b != 0.0f) {
            StringBuilder d3 = b.a.a.a.a.d(b2);
            d3.append(this.f312b);
            b2 = d3.toString();
            z = true;
        } else {
            z = false;
        }
        int k = this.d.k();
        for (int i2 = 0; i2 < k; i2++) {
            g d4 = this.d.d(i2);
            if (!(d4 == null || (a2 = this.d.a(i2)) == 0.0f)) {
                String gVar = d4.toString();
                if (!z) {
                    if (a2 < 0.0f) {
                        sb2 = b.a.a.a.a.d(b2);
                        str2 = "- ";
                    }
                    if (a2 == 1.0f) {
                        sb = new StringBuilder();
                    } else {
                        sb = new StringBuilder();
                        sb.append(b2);
                        sb.append(a2);
                        b2 = " ";
                    }
                    sb.append(b2);
                    sb.append(gVar);
                    b2 = sb.toString();
                    z = true;
                } else {
                    sb2 = b.a.a.a.a.d(b2);
                    if (i > 0) {
                        sb2.append(" + ");
                        b2 = sb2.toString();
                        if (a2 == 1.0f) {
                        }
                        sb.append(b2);
                        sb.append(gVar);
                        b2 = sb.toString();
                        z = true;
                    } else {
                        str2 = " - ";
                    }
                }
                sb2.append(str2);
                b2 = sb2.toString();
                a2 *= -1.0f;
                if (a2 == 1.0f) {
                }
                sb.append(b2);
                sb.append(gVar);
                b2 = sb.toString();
                z = true;
            }
        }
        return !z ? b.a.a.a.a.b(b2, "0.0") : b2;
    }
}
