package a.f.b;

import java.util.Arrays;

public class g {
    public static int m = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f324a;

    /* renamed from: b  reason: collision with root package name */
    public int f325b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f326c = -1;
    public int d = 0;
    public float e;
    public boolean f = false;
    public float[] g = new float[9];
    public float[] h = new float[9];
    public a i;
    public b[] j = new b[16];
    public int k = 0;
    public int l = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.i = aVar;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.k;
            if (i2 >= i3) {
                b[] bVarArr = this.j;
                if (i3 >= bVarArr.length) {
                    this.j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.j;
                int i4 = this.k;
                bVarArr2[i4] = bVar;
                this.k = i4 + 1;
                return;
            } else if (this.j[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.k;
        int i3 = 0;
        while (i3 < i2) {
            if (this.j[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.j;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.k--;
                return;
            }
            i3++;
        }
    }

    public void c() {
        this.i = a.UNKNOWN;
        this.d = 0;
        this.f325b = -1;
        this.f326c = -1;
        this.e = 0.0f;
        this.f = false;
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3] = null;
        }
        this.k = 0;
        this.l = 0;
        this.f324a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public void d(d dVar, float f2) {
        this.e = f2;
        this.f = true;
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3].k(this, false);
        }
        this.k = 0;
    }

    public final void e(b bVar) {
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3].l(bVar, false);
        }
        this.k = 0;
    }

    public String toString() {
        StringBuilder d2 = b.a.a.a.a.d("");
        d2.append(this.f325b);
        return d2.toString();
    }
}
