package a.e;

public class e<E> implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f283a = false;

    /* renamed from: b  reason: collision with root package name */
    public long[] f284b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f285c;
    public int d;

    public e() {
        int f = d.f(10);
        this.f284b = new long[f];
        this.f285c = new Object[f];
    }

    public void a() {
        int i = this.d;
        Object[] objArr = this.f285c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.f283a = false;
    }

    /* renamed from: b */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f284b = (long[]) this.f284b.clone();
            eVar.f285c = (Object[]) this.f285c.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i = this.d;
        long[] jArr = this.f284b;
        Object[] objArr = this.f285c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f283a = false;
        this.d = i2;
    }

    public E d(long j) {
        return e(j, null);
    }

    public E e(long j, E e2) {
        int b2 = d.b(this.f284b, this.d, j);
        if (b2 >= 0) {
            Object[] objArr = this.f285c;
            if (objArr[b2] != e) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public void f(long j, E e2) {
        int b2 = d.b(this.f284b, this.d, j);
        if (b2 >= 0) {
            this.f285c[b2] = e2;
            return;
        }
        int i = ~b2;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.f285c;
            if (objArr[i] == e) {
                this.f284b[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f283a && i2 >= this.f284b.length) {
            c();
            i = ~d.b(this.f284b, this.d, j);
        }
        int i3 = this.d;
        if (i3 >= this.f284b.length) {
            int f = d.f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f284b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f285c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f284b = jArr;
            this.f285c = objArr2;
        }
        int i4 = this.d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f284b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f285c;
            System.arraycopy(objArr4, i, objArr4, i5, this.d - i);
        }
        this.f284b[i] = j;
        this.f285c[i] = e2;
        this.d++;
    }

    public int g() {
        if (this.f283a) {
            c();
        }
        return this.d;
    }

    public E h(int i) {
        if (this.f283a) {
            c();
        }
        return (E) this.f285c[i];
    }

    public String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f283a) {
                c();
            }
            sb.append(this.f284b[i]);
            sb.append('=');
            E h = h(i);
            if (h != this) {
                sb.append((Object) h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
