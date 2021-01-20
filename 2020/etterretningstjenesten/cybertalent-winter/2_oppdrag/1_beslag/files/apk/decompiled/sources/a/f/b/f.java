package a.f.b;

import a.f.b.b;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class f extends b {
    public int f = 128;
    public g[] g = new g[128];
    public g[] h = new g[128];
    public int i = 0;
    public b j = new b(this);

    public class a implements Comparator<g> {
        public a(f fVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(g gVar, g gVar2) {
            return gVar.f325b - gVar2.f325b;
        }
    }

    public class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public g f322a;

        public b(f fVar) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f322a.f325b - ((g) obj).f325b;
        }

        public String toString() {
            String str = "[ ";
            if (this.f322a != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder d = b.a.a.a.a.d(str);
                    d.append(this.f322a.h[i]);
                    d.append(" ");
                    str = d.toString();
                }
            }
            return str + "] " + this.f322a;
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    @Override // a.f.b.d.a, a.f.b.b
    public void a(g gVar) {
        this.j.f322a = gVar;
        Arrays.fill(gVar.h, 0.0f);
        gVar.h[gVar.d] = 1.0f;
        m(gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r8 < r7) goto L_0x0057;
     */
    @Override // a.f.b.d.a, a.f.b.b
    public g b(d dVar, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.i; i3++) {
            g[] gVarArr = this.g;
            g gVar = gVarArr[i3];
            if (!zArr[gVar.f325b]) {
                b bVar = this.j;
                bVar.f322a = gVar;
                int i4 = 8;
                boolean z = true;
                if (i2 == -1) {
                    Objects.requireNonNull(bVar);
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = bVar.f322a.h[i4];
                        if (f2 > 0.0f) {
                            break;
                        } else if (f2 < 0.0f) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    if (!z) {
                    }
                } else {
                    g gVar2 = gVarArr[i2];
                    Objects.requireNonNull(bVar);
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f3 = gVar2.h[i4];
                        float f4 = bVar.f322a.h[i4];
                        if (f4 == f3) {
                            i4--;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.g[i2];
    }

    @Override // a.f.b.d.a, a.f.b.b
    public void clear() {
        this.i = 0;
        this.f312b = 0.0f;
    }

    @Override // a.f.b.b
    public void l(b bVar, boolean z) {
        g gVar = bVar.f311a;
        if (gVar != null) {
            b.a aVar = bVar.d;
            int k = aVar.k();
            for (int i2 = 0; i2 < k; i2++) {
                g d = aVar.d(i2);
                float a2 = aVar.a(i2);
                b bVar2 = this.j;
                bVar2.f322a = d;
                boolean z2 = true;
                if (d.f324a) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = bVar2.f322a.h;
                        fArr[i3] = (gVar.h[i3] * a2) + fArr[i3];
                        if (Math.abs(fArr[i3]) < 1.0E-4f) {
                            bVar2.f322a.h[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        f.this.n(bVar2.f322a);
                    }
                    z2 = false;
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = gVar.h[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * a2;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            bVar2.f322a.h[i4] = f3;
                        } else {
                            bVar2.f322a.h[i4] = 0.0f;
                        }
                    }
                }
                if (z2) {
                    m(d);
                }
                this.f312b = (bVar.f312b * a2) + this.f312b;
            }
            n(gVar);
        }
    }

    public final void m(g gVar) {
        int i2;
        int i3 = this.i + 1;
        g[] gVarArr = this.g;
        if (i3 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.g = gVarArr2;
            this.h = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.g;
        int i4 = this.i;
        gVarArr3[i4] = gVar;
        int i5 = i4 + 1;
        this.i = i5;
        if (i5 > 1 && gVarArr3[i5 - 1].f325b > gVar.f325b) {
            int i6 = 0;
            while (true) {
                i2 = this.i;
                if (i6 >= i2) {
                    break;
                }
                this.h[i6] = this.g[i6];
                i6++;
            }
            Arrays.sort(this.h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.i; i7++) {
                this.g[i7] = this.h[i7];
            }
        }
        gVar.f324a = true;
        gVar.a(this);
    }

    public final void n(g gVar) {
        int i2 = 0;
        while (i2 < this.i) {
            if (this.g[i2] == gVar) {
                while (true) {
                    int i3 = this.i;
                    if (i2 < i3 - 1) {
                        g[] gVarArr = this.g;
                        int i4 = i2 + 1;
                        gVarArr[i2] = gVarArr[i4];
                        i2 = i4;
                    } else {
                        this.i = i3 - 1;
                        gVar.f324a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // a.f.b.b
    public String toString() {
        String str = "" + " goal -> (" + this.f312b + ") : ";
        for (int i2 = 0; i2 < this.i; i2++) {
            this.j.f322a = this.g[i2];
            StringBuilder d = b.a.a.a.a.d(str);
            d.append(this.j);
            d.append(" ");
            str = d.toString();
        }
        return str;
    }
}
