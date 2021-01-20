package a.f.b;

import a.f.b.b;
import java.util.Arrays;

public class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f308a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f309b;

    /* renamed from: c  reason: collision with root package name */
    public final c f310c;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public a(b bVar, c cVar) {
        this.f309b = bVar;
        this.f310c = cVar;
    }

    @Override // a.f.b.b.a
    public float a(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f308a) {
            if (i4 == i2) {
                return this.g[i3];
            }
            i3 = this.f[i3];
            i4++;
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public final float b(g gVar, boolean z) {
        int i2 = this.h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f308a) {
            if (this.e[i2] == gVar.f325b) {
                if (i2 == this.h) {
                    this.h = this.f[i2];
                } else {
                    int[] iArr = this.f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    gVar.b(this.f309b);
                }
                gVar.l--;
                this.f308a--;
                this.e[i2] = -1;
                if (this.j) {
                    this.i = i2;
                }
                return this.g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public void c(g gVar, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.h;
            if (i2 == -1) {
                this.h = 0;
                this.g[0] = f2;
                this.e[0] = gVar.f325b;
                this.f[0] = -1;
                gVar.l++;
                gVar.a(this.f309b);
                this.f308a++;
                if (!this.j) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f308a) {
                int[] iArr2 = this.e;
                int i6 = iArr2[i2];
                int i7 = gVar.f325b;
                if (i6 == i7) {
                    float[] fArr = this.g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.h) {
                            this.h = this.f[i2];
                        } else {
                            int[] iArr3 = this.f;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            gVar.b(this.f309b);
                        }
                        if (this.j) {
                            this.i = i2;
                        }
                        gVar.l--;
                        this.f308a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f[i2];
                i4++;
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr4 = this.e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.e;
            if (i8 >= iArr5.length && this.f308a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = gVar.f325b;
            this.g[i8] = f2;
            int[] iArr8 = this.f;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.h;
                this.h = i8;
            }
            gVar.l++;
            gVar.a(this.f309b);
            this.f308a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr9 = this.e;
            if (i12 >= iArr9.length) {
                this.j = true;
                this.i = iArr9.length - 1;
            }
        }
    }

    @Override // a.f.b.b.a
    public final void clear() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            g gVar = this.f310c.d[this.e[i2]];
            if (gVar != null) {
                gVar.b(this.f309b);
            }
            i2 = this.f[i2];
            i3++;
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f308a = 0;
    }

    @Override // a.f.b.b.a
    public g d(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f308a) {
            if (i4 == i2) {
                return this.f310c.d[this.e[i3]];
            }
            i3 = this.f[i3];
            i4++;
        }
        return null;
    }

    @Override // a.f.b.b.a
    public final float e(g gVar) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            if (this.e[i2] == gVar.f325b) {
                return this.g[i2];
            }
            i2 = this.f[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // a.f.b.b.a
    public float f(b bVar, boolean z) {
        float e2 = e(bVar.f311a);
        b(bVar.f311a, z);
        b.a aVar = bVar.d;
        int k = aVar.k();
        for (int i2 = 0; i2 < k; i2++) {
            g d2 = aVar.d(i2);
            c(d2, aVar.e(d2) * e2, z);
        }
        return e2;
    }

    @Override // a.f.b.b.a
    public boolean g(g gVar) {
        int i2 = this.h;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            if (this.e[i2] == gVar.f325b) {
                return true;
            }
            i2 = this.f[i2];
            i3++;
        }
        return false;
    }

    @Override // a.f.b.b.a
    public void h(float f2) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f[i2];
            i3++;
        }
    }

    @Override // a.f.b.b.a
    public void i() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f[i2];
            i3++;
        }
    }

    @Override // a.f.b.b.a
    public final void j(g gVar, float f2) {
        if (f2 == 0.0f) {
            b(gVar, true);
            return;
        }
        int i2 = this.h;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = gVar.f325b;
            this.f[0] = -1;
            gVar.l++;
            gVar.a(this.f309b);
            this.f308a++;
            if (!this.j) {
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f308a) {
            int[] iArr2 = this.e;
            int i6 = iArr2[i2];
            int i7 = gVar.f325b;
            if (i6 == i7) {
                this.g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f[i2];
            i4++;
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.e;
        if (i8 >= iArr4.length && this.f308a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.j = false;
            this.i = i8 - 1;
            this.g = Arrays.copyOf(this.g, i11);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i8] = gVar.f325b;
        this.g[i8] = f2;
        int[] iArr7 = this.f;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.h;
            this.h = i8;
        }
        gVar.l++;
        gVar.a(this.f309b);
        int i12 = this.f308a + 1;
        this.f308a = i12;
        if (!this.j) {
            this.i++;
        }
        int[] iArr8 = this.e;
        if (i12 >= iArr8.length) {
            this.j = true;
        }
        if (this.i >= iArr8.length) {
            this.j = true;
            this.i = iArr8.length - 1;
        }
    }

    @Override // a.f.b.b.a
    public int k() {
        return this.f308a;
    }

    public String toString() {
        int i2 = this.h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f308a) {
            StringBuilder d2 = b.a.a.a.a.d(b.a.a.a.a.b(str, " -> "));
            d2.append(this.g[i2]);
            d2.append(" : ");
            StringBuilder d3 = b.a.a.a.a.d(d2.toString());
            d3.append(this.f310c.d[this.e[i2]]);
            str = d3.toString();
            i2 = this.f[i2];
            i3++;
        }
        return str;
    }
}
