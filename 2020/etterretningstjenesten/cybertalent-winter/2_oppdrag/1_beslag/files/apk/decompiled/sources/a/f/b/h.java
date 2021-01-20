package a.f.b;

import a.f.b.b;
import b.a.a.a.a;
import java.util.Arrays;

public class h implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f330a = 16;

    /* renamed from: b  reason: collision with root package name */
    public int[] f331b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f332c = new int[16];
    public int[] d = new int[16];
    public float[] e = new float[16];
    public int[] f = new int[16];
    public int[] g = new int[16];
    public int h = 0;
    public int i = -1;
    public final b j;
    public final c k;

    public h(b bVar, c cVar) {
        this.j = bVar;
        this.k = cVar;
        clear();
    }

    @Override // a.f.b.b.a
    public float a(int i2) {
        int i3 = this.h;
        int i4 = this.i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.e[i4];
            }
            i4 = this.g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public float b(g gVar, boolean z) {
        int[] iArr;
        int n = n(gVar);
        if (n == -1) {
            return 0.0f;
        }
        int i2 = gVar.f325b;
        int i3 = i2 % 16;
        int[] iArr2 = this.f331b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.d[i4] == i2) {
                int[] iArr3 = this.f332c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f332c;
                    if (iArr[i4] == -1 || this.d[iArr[i4]] == i2) {
                        int i5 = iArr[i4];
                    } else {
                        i4 = iArr[i4];
                    }
                }
                int i52 = iArr[i4];
                if (i52 != -1 && this.d[i52] == i2) {
                    iArr[i4] = iArr[i52];
                    iArr[i52] = -1;
                }
            }
        }
        float f2 = this.e[n];
        if (this.i == n) {
            this.i = this.g[n];
        }
        this.d[n] = -1;
        int[] iArr4 = this.f;
        if (iArr4[n] != -1) {
            int[] iArr5 = this.g;
            iArr5[iArr4[n]] = iArr5[n];
        }
        int[] iArr6 = this.g;
        if (iArr6[n] != -1) {
            iArr4[iArr6[n]] = iArr4[n];
        }
        this.h--;
        gVar.l--;
        if (z) {
            gVar.b(this.j);
        }
        return f2;
    }

    @Override // a.f.b.b.a
    public void c(g gVar, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int n = n(gVar);
            if (n == -1) {
                j(gVar, f2);
                return;
            }
            float[] fArr = this.e;
            fArr[n] = fArr[n] + f2;
            if (fArr[n] > -0.001f && fArr[n] < 0.001f) {
                fArr[n] = 0.0f;
                b(gVar, z);
            }
        }
    }

    @Override // a.f.b.b.a
    public void clear() {
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            g d2 = d(i3);
            if (d2 != null) {
                d2.b(this.j);
            }
        }
        for (int i4 = 0; i4 < this.f330a; i4++) {
            this.d[i4] = -1;
            this.f332c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f331b[i5] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    @Override // a.f.b.b.a
    public g d(int i2) {
        int i3 = this.h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.k.d[this.d[i4]];
            }
            i4 = this.g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a.f.b.b.a
    public float e(g gVar) {
        int n = n(gVar);
        if (n != -1) {
            return this.e[n];
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public float f(b bVar, boolean z) {
        float e2 = e(bVar.f311a);
        b(bVar.f311a, z);
        h hVar = (h) bVar.d;
        int i2 = hVar.h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = hVar.d;
            if (iArr[i4] != -1) {
                c(this.k.d[iArr[i4]], hVar.e[i4] * e2, z);
                i3++;
            }
            i4++;
        }
        return e2;
    }

    @Override // a.f.b.b.a
    public boolean g(g gVar) {
        return n(gVar) != -1;
    }

    @Override // a.f.b.b.a
    public void h(float f2) {
        int i2 = this.h;
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // a.f.b.b.a
    public void i() {
        int i2 = this.h;
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.e;
            fArr[i3] = fArr[i3] * -1.0f;
            i3 = this.g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // a.f.b.b.a
    public void j(g gVar, float f2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = 0;
            if (this.h == 0) {
                m(0, gVar, f2);
                l(gVar, 0);
                this.i = 0;
                return;
            }
            int n = n(gVar);
            if (n != -1) {
                this.e[n] = f2;
                return;
            }
            int i3 = this.h + 1;
            int i4 = this.f330a;
            if (i3 >= i4) {
                int i5 = i4 * 2;
                this.d = Arrays.copyOf(this.d, i5);
                this.e = Arrays.copyOf(this.e, i5);
                this.f = Arrays.copyOf(this.f, i5);
                this.g = Arrays.copyOf(this.g, i5);
                this.f332c = Arrays.copyOf(this.f332c, i5);
                for (int i6 = this.f330a; i6 < i5; i6++) {
                    this.d[i6] = -1;
                    this.f332c[i6] = -1;
                }
                this.f330a = i5;
            }
            int i7 = this.h;
            int i8 = this.i;
            int i9 = -1;
            for (int i10 = 0; i10 < i7; i10++) {
                int[] iArr = this.d;
                int i11 = iArr[i8];
                int i12 = gVar.f325b;
                if (i11 == i12) {
                    this.e[i8] = f2;
                    return;
                }
                if (iArr[i8] < i12) {
                    i9 = i8;
                }
                i8 = this.g[i8];
                if (i8 == -1) {
                    break;
                }
            }
            while (true) {
                if (i2 >= this.f330a) {
                    i2 = -1;
                    break;
                } else if (this.d[i2] == -1) {
                    break;
                } else {
                    i2++;
                }
            }
            m(i2, gVar, f2);
            int[] iArr2 = this.f;
            if (i9 != -1) {
                iArr2[i2] = i9;
                int[] iArr3 = this.g;
                iArr3[i2] = iArr3[i9];
                iArr3[i9] = i2;
            } else {
                iArr2[i2] = -1;
                if (this.h > 0) {
                    this.g[i2] = this.i;
                    this.i = i2;
                } else {
                    this.g[i2] = -1;
                }
            }
            int[] iArr4 = this.g;
            if (iArr4[i2] != -1) {
                this.f[iArr4[i2]] = i2;
            }
            l(gVar, i2);
            return;
        }
        b(gVar, true);
    }

    @Override // a.f.b.b.a
    public int k() {
        return this.h;
    }

    public final void l(g gVar, int i2) {
        int[] iArr;
        int i3 = gVar.f325b % 16;
        int[] iArr2 = this.f331b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f332c;
                if (iArr[i4] == -1) {
                    break;
                }
                i4 = iArr[i4];
            }
            iArr[i4] = i2;
        }
        this.f332c[i2] = -1;
    }

    public final void m(int i2, g gVar, float f2) {
        this.d[i2] = gVar.f325b;
        this.e[i2] = f2;
        this.f[i2] = -1;
        this.g[i2] = -1;
        gVar.a(this.j);
        gVar.l++;
        this.h++;
    }

    public int n(g gVar) {
        int[] iArr;
        if (this.h == 0) {
            return -1;
        }
        int i2 = gVar.f325b;
        int i3 = this.f331b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.d[i3] == i2) {
            return i3;
        }
        while (true) {
            iArr = this.f332c;
            if (iArr[i3] != -1 && this.d[iArr[i3]] != i2) {
                i3 = iArr[i3];
            }
        }
        if (iArr[i3] != -1 && this.d[iArr[i3]] == i2) {
            return iArr[i3];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            g d2 = d(i3);
            if (d2 != null) {
                String str3 = str2 + d2 + " = " + a(i3) + " ";
                int n = n(d2);
                String b2 = a.b(str3, "[p: ");
                if (this.f[n] != -1) {
                    sb = a.d(b2);
                    sb.append(this.k.d[this.d[this.f[n]]]);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b2);
                    sb2.append("none");
                    sb = sb2;
                }
                String b3 = a.b(sb.toString(), ", n: ");
                if (this.g[n] != -1) {
                    StringBuilder d3 = a.d(b3);
                    d3.append(this.k.d[this.d[this.g[n]]]);
                    str = d3.toString();
                } else {
                    str = a.b(b3, "none");
                }
                str2 = a.b(str, "]");
            }
        }
        return a.b(str2, " }");
    }
}
