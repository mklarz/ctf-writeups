package a.f.b;

import a.f.b.b;
import a.f.b.g;
import a.f.b.i.c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class d {
    public static int o = 1000;
    public static boolean p = true;
    public static long q;
    public static long r;

    /* renamed from: a  reason: collision with root package name */
    public int f317a;

    /* renamed from: b  reason: collision with root package name */
    public a f318b;

    /* renamed from: c  reason: collision with root package name */
    public int f319c;
    public int d;
    public b[] e;
    public boolean f;
    public boolean[] g;
    public int h;
    public int i;
    public int j;
    public final c k;
    public g[] l;
    public int m;
    public a n;

    public interface a {
        void a(g gVar);

        g b(d dVar, boolean[] zArr);

        void clear();
    }

    public class b extends b {
        public b(d dVar, c cVar) {
            this.d = new h(this, cVar);
        }
    }

    public d() {
        this.f317a = 0;
        this.f319c = 32;
        this.d = 32;
        this.e = null;
        this.f = false;
        this.g = new boolean[32];
        this.h = 1;
        this.i = 0;
        this.j = 32;
        this.l = new g[o];
        this.m = 0;
        this.e = new b[32];
        s();
        c cVar = new c();
        this.k = cVar;
        this.f318b = new f(cVar);
        this.n = p ? new b(this, cVar) : new b(cVar);
    }

    public final g a(g.a aVar, String str) {
        g a2 = this.k.f316c.a();
        if (a2 == null) {
            a2 = new g(aVar);
        } else {
            a2.c();
        }
        a2.i = aVar;
        int i2 = this.m;
        int i3 = o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            o = i4;
            this.l = (g[]) Arrays.copyOf(this.l, i4);
        }
        g[] gVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        gVarArr[i5] = a2;
        return a2;
    }

    public void b(g gVar, g gVar2, int i2, float f2, g gVar3, g gVar4, int i3, int i4) {
        float f3;
        int i5;
        b m2 = m();
        if (gVar2 == gVar3) {
            m2.d.j(gVar, 1.0f);
            m2.d.j(gVar4, 1.0f);
            m2.d.j(gVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                m2.d.j(gVar, 1.0f);
                m2.d.j(gVar2, -1.0f);
                m2.d.j(gVar3, -1.0f);
                m2.d.j(gVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    i5 = (-i2) + i3;
                }
            } else if (f2 <= 0.0f) {
                m2.d.j(gVar, -1.0f);
                m2.d.j(gVar2, 1.0f);
                f3 = (float) i2;
                m2.f312b = f3;
            } else if (f2 >= 1.0f) {
                m2.d.j(gVar4, -1.0f);
                m2.d.j(gVar3, 1.0f);
                i5 = -i3;
            } else {
                float f4 = 1.0f - f2;
                m2.d.j(gVar, f4 * 1.0f);
                m2.d.j(gVar2, f4 * -1.0f);
                m2.d.j(gVar3, -1.0f * f2);
                m2.d.j(gVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    m2.f312b = (((float) i3) * f2) + (((float) (-i2)) * f4);
                }
            }
            f3 = (float) i5;
            m2.f312b = f3;
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    public void c(b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        g i2;
        g.a aVar = g.a.UNRESTRICTED;
        boolean z4 = true;
        if (this.i + 1 >= this.j || this.h + 1 >= this.d) {
            p();
        }
        if (!bVar.e) {
            if (this.e.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int k2 = bVar.d.k();
                    for (int i3 = 0; i3 < k2; i3++) {
                        g d2 = bVar.d.d(i3);
                        if (d2.f326c != -1 || d2.f) {
                            bVar.f313c.add(d2);
                        }
                    }
                    if (bVar.f313c.size() > 0) {
                        Iterator<g> it = bVar.f313c.iterator();
                        while (it.hasNext()) {
                            g next = it.next();
                            if (next.f) {
                                bVar.k(next, true);
                            } else {
                                bVar.l(this.e[next.f326c], true);
                            }
                        }
                        bVar.f313c.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            if (!(bVar.f311a == null && bVar.f312b == 0.0f && bVar.d.k() == 0)) {
                float f2 = bVar.f312b;
                if (f2 < 0.0f) {
                    bVar.f312b = f2 * -1.0f;
                    bVar.d.i();
                }
                int k3 = bVar.d.k();
                float f3 = 0.0f;
                float f4 = 0.0f;
                g gVar = null;
                g gVar2 = null;
                boolean z6 = false;
                boolean z7 = false;
                for (int i4 = 0; i4 < k3; i4++) {
                    float a2 = bVar.d.a(i4);
                    g d3 = bVar.d.d(i4);
                    if (d3.i == aVar) {
                        if (gVar == null || f3 > a2) {
                            z6 = bVar.h(d3);
                        } else if (!z6 && bVar.h(d3)) {
                            z6 = true;
                        }
                        f3 = a2;
                        gVar = d3;
                    } else if (gVar == null && a2 < 0.0f) {
                        if (gVar2 == null || f4 > a2) {
                            z7 = bVar.h(d3);
                        } else if (!z7 && bVar.h(d3)) {
                            z7 = true;
                        }
                        f4 = a2;
                        gVar2 = d3;
                    }
                }
                if (gVar == null) {
                    gVar = gVar2;
                }
                if (gVar == null) {
                    z2 = true;
                } else {
                    bVar.j(gVar);
                    z2 = false;
                }
                if (bVar.d.k() == 0) {
                    bVar.e = true;
                }
                if (z2) {
                    if (this.h + 1 >= this.d) {
                        p();
                    }
                    g a3 = a(g.a.SLACK, null);
                    int i5 = this.f317a + 1;
                    this.f317a = i5;
                    this.h++;
                    a3.f325b = i5;
                    this.k.d[i5] = a3;
                    bVar.f311a = a3;
                    i(bVar);
                    b bVar2 = (b) this.n;
                    Objects.requireNonNull(bVar2);
                    bVar2.f311a = null;
                    bVar2.d.clear();
                    for (int i6 = 0; i6 < bVar.d.k(); i6++) {
                        bVar2.d.c(bVar.d.d(i6), bVar.d.a(i6), true);
                    }
                    r(this.n);
                    if (a3.f326c == -1) {
                        if (bVar.f311a == a3 && (i2 = bVar.i(null, a3)) != null) {
                            bVar.j(i2);
                        }
                        if (!bVar.e) {
                            bVar.f311a.e(bVar);
                        }
                        this.i--;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                g gVar3 = bVar.f311a;
                if (gVar3 == null || (gVar3.i != aVar && bVar.f312b < 0.0f)) {
                    z4 = false;
                }
                if (z4) {
                    z = z3;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            z = false;
        }
        if (!z) {
            i(bVar);
        }
    }

    public b d(g gVar, g gVar2, int i2, int i3) {
        if (i3 == 8 && gVar2.f && gVar.f326c == -1) {
            gVar.d(this, gVar2.e + ((float) i2));
            return null;
        }
        b m2 = m();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            m2.f312b = (float) i2;
        }
        if (!z) {
            m2.d.j(gVar, -1.0f);
            m2.d.j(gVar2, 1.0f);
        } else {
            m2.d.j(gVar, 1.0f);
            m2.d.j(gVar2, -1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(g gVar, int i2) {
        b bVar;
        b.a aVar;
        float f2;
        int i3 = gVar.f326c;
        if (i3 == -1) {
            gVar.d(this, (float) i2);
            return;
        }
        if (i3 != -1) {
            b bVar2 = this.e[i3];
            if (!bVar2.e) {
                if (bVar2.d.k() == 0) {
                    bVar2.e = true;
                } else {
                    bVar = m();
                    if (i2 < 0) {
                        bVar.f312b = (float) (i2 * -1);
                        aVar = bVar.d;
                        f2 = 1.0f;
                    } else {
                        bVar.f312b = (float) i2;
                        aVar = bVar.d;
                        f2 = -1.0f;
                    }
                    aVar.j(gVar, f2);
                }
            }
            bVar2.f312b = (float) i2;
            return;
        }
        bVar = m();
        bVar.f311a = gVar;
        float f3 = (float) i2;
        gVar.e = f3;
        bVar.f312b = f3;
        bVar.e = true;
        c(bVar);
    }

    public void f(g gVar, g gVar2, int i2, int i3) {
        b m2 = m();
        g n2 = n();
        n2.d = 0;
        m2.e(gVar, gVar2, n2, i2);
        if (i3 != 8) {
            m2.d.j(k(i3, null), (float) ((int) (m2.d.e(n2) * -1.0f)));
        }
        c(m2);
    }

    public void g(g gVar, g gVar2, int i2, int i3) {
        b m2 = m();
        g n2 = n();
        n2.d = 0;
        m2.f(gVar, gVar2, n2, i2);
        if (i3 != 8) {
            m2.d.j(k(i3, null), (float) ((int) (m2.d.e(n2) * -1.0f)));
        }
        c(m2);
    }

    public void h(g gVar, g gVar2, g gVar3, g gVar4, float f2, int i2) {
        b m2 = m();
        m2.d(gVar, gVar2, gVar3, gVar4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(b bVar) {
        e<b> eVar;
        b bVar2;
        if (p) {
            b[] bVarArr = this.e;
            int i2 = this.i;
            if (bVarArr[i2] != null) {
                eVar = this.k.f314a;
                bVar2 = bVarArr[i2];
            }
            b[] bVarArr2 = this.e;
            int i3 = this.i;
            bVarArr2[i3] = bVar;
            g gVar = bVar.f311a;
            gVar.f326c = i3;
            this.i = i3 + 1;
            gVar.e(bVar);
        }
        b[] bVarArr3 = this.e;
        int i4 = this.i;
        if (bVarArr3[i4] != null) {
            eVar = this.k.f315b;
            bVar2 = bVarArr3[i4];
        }
        b[] bVarArr22 = this.e;
        int i32 = this.i;
        bVarArr22[i32] = bVar;
        g gVar2 = bVar.f311a;
        gVar2.f326c = i32;
        this.i = i32 + 1;
        gVar2.e(bVar);
        eVar.b(bVar2);
        b[] bVarArr222 = this.e;
        int i322 = this.i;
        bVarArr222[i322] = bVar;
        g gVar22 = bVar.f311a;
        gVar22.f326c = i322;
        this.i = i322 + 1;
        gVar22.e(bVar);
    }

    public final void j() {
        for (int i2 = 0; i2 < this.i; i2++) {
            b bVar = this.e[i2];
            bVar.f311a.e = bVar.f312b;
        }
    }

    public g k(int i2, String str) {
        if (this.h + 1 >= this.d) {
            p();
        }
        g a2 = a(g.a.ERROR, str);
        int i3 = this.f317a + 1;
        this.f317a = i3;
        this.h++;
        a2.f325b = i3;
        a2.d = i2;
        this.k.d[i3] = a2;
        this.f318b.a(a2);
        return a2;
    }

    public g l(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.d) {
            p();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            gVar = cVar.g;
            if (gVar == null) {
                cVar.f();
                gVar = cVar.g;
            }
            int i2 = gVar.f325b;
            if (i2 == -1 || i2 > this.f317a || this.k.d[i2] == null) {
                if (i2 != -1) {
                    gVar.c();
                }
                int i3 = this.f317a + 1;
                this.f317a = i3;
                this.h++;
                gVar.f325b = i3;
                gVar.i = g.a.UNRESTRICTED;
                this.k.d[i3] = gVar;
            }
        }
        return gVar;
    }

    public b m() {
        b bVar;
        if (p) {
            bVar = this.k.f314a.a();
            if (bVar == null) {
                bVar = new b(this, this.k);
                r++;
                g.m++;
                return bVar;
            }
        } else {
            bVar = this.k.f315b.a();
            if (bVar == null) {
                bVar = new b(this.k);
                q++;
                g.m++;
                return bVar;
            }
        }
        bVar.f311a = null;
        bVar.d.clear();
        bVar.f312b = 0.0f;
        bVar.e = false;
        g.m++;
        return bVar;
    }

    public g n() {
        if (this.h + 1 >= this.d) {
            p();
        }
        g a2 = a(g.a.SLACK, null);
        int i2 = this.f317a + 1;
        this.f317a = i2;
        this.h++;
        a2.f325b = i2;
        this.k.d[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        g gVar = ((c) obj).g;
        if (gVar != null) {
            return (int) (gVar.e + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.f319c * 2;
        this.f319c = i2;
        this.e = (b[]) Arrays.copyOf(this.e, i2);
        c cVar = this.k;
        cVar.d = (g[]) Arrays.copyOf(cVar.d, this.f319c);
        int i3 = this.f319c;
        this.g = new boolean[i3];
        this.d = i3;
        this.j = i3;
    }

    public void q(a aVar) {
        float f2;
        int i2;
        boolean z;
        g.a aVar2 = g.a.UNRESTRICTED;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.i) {
                z = false;
                break;
            }
            b[] bVarArr = this.e;
            if (bVarArr[i3].f311a.i != aVar2 && bVarArr[i3].f312b < 0.0f) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                int i8 = 0;
                while (i7 < this.i) {
                    b bVar = this.e[i7];
                    if (bVar.f311a.i != aVar2 && !bVar.e && bVar.f312b < f2) {
                        int i9 = i2;
                        while (i9 < this.h) {
                            g gVar = this.k.d[i9];
                            float e2 = bVar.d.e(gVar);
                            if (e2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = gVar.g[i10] / e2;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i8 = i10;
                                        f3 = f4;
                                        i5 = i7;
                                        i6 = i9;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i7++;
                    f2 = 0.0f;
                    i2 = 1;
                }
                if (i5 != -1) {
                    b bVar2 = this.e[i5];
                    bVar2.f311a.f326c = -1;
                    bVar2.j(this.k.d[i6]);
                    g gVar2 = bVar2.f311a;
                    gVar2.f326c = i5;
                    gVar2.e(bVar2);
                } else {
                    z2 = true;
                }
                if (i4 > this.h / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        r(aVar);
        j();
    }

    public final int r(a aVar) {
        for (int i2 = 0; i2 < this.h; i2++) {
            this.g[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            i3++;
            if (i3 >= this.h * 2) {
                return i3;
            }
            g gVar = ((b) aVar).f311a;
            if (gVar != null) {
                this.g[gVar.f325b] = true;
            }
            g b2 = aVar.b(this, this.g);
            if (b2 != null) {
                boolean[] zArr = this.g;
                int i4 = b2.f325b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.i; i6++) {
                    b bVar = this.e[i6];
                    if (bVar.f311a.i != g.a.UNRESTRICTED && !bVar.e && bVar.d.g(b2)) {
                        float e2 = bVar.d.e(b2);
                        if (e2 < 0.0f) {
                            float f3 = (-bVar.f312b) / e2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.e[i5];
                    bVar2.f311a.f326c = -1;
                    bVar2.j(b2);
                    g gVar2 = bVar2.f311a;
                    gVar2.f326c = i5;
                    gVar2.e(bVar2);
                }
            } else {
                z = true;
            }
        }
        return i3;
    }

    public final void s() {
        int i2 = 0;
        if (p) {
            while (true) {
                b[] bVarArr = this.e;
                if (i2 < bVarArr.length) {
                    b bVar = bVarArr[i2];
                    if (bVar != null) {
                        this.k.f314a.b(bVar);
                    }
                    this.e[i2] = null;
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                b[] bVarArr2 = this.e;
                if (i2 < bVarArr2.length) {
                    b bVar2 = bVarArr2[i2];
                    if (bVar2 != null) {
                        this.k.f315b.b(bVar2);
                    }
                    this.e[i2] = null;
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void t() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.k;
            g[] gVarArr = cVar.d;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.c();
            }
            i2++;
        }
        e<g> eVar = cVar.f316c;
        g[] gVarArr2 = this.l;
        int i3 = this.m;
        Objects.requireNonNull(eVar);
        if (i3 > gVarArr2.length) {
            i3 = gVarArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            g gVar2 = gVarArr2[i4];
            int i5 = eVar.f321b;
            Object[] objArr = eVar.f320a;
            if (i5 < objArr.length) {
                objArr[i5] = gVar2;
                eVar.f321b = i5 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(this.k.d, (Object) null);
        this.f317a = 0;
        this.f318b.clear();
        this.h = 1;
        for (int i6 = 0; i6 < this.i; i6++) {
            Objects.requireNonNull(this.e[i6]);
        }
        s();
        this.i = 0;
        this.n = p ? new b(this, this.k) : new b(this.k);
    }
}
