package a.e;

public class i<E> implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f304a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f305b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f306c;
    public int d;

    public i() {
        this(10);
    }

    public i(int i) {
        this.f304a = false;
        if (i == 0) {
            this.f305b = d.f280a;
            this.f306c = d.f282c;
            return;
        }
        int e2 = d.e(i);
        this.f305b = new int[e2];
        this.f306c = new Object[e2];
    }

    public void a(int i, E e2) {
        int i2 = this.d;
        if (i2 == 0 || i > this.f305b[i2 - 1]) {
            if (this.f304a && i2 >= this.f305b.length) {
                c();
            }
            int i3 = this.d;
            if (i3 >= this.f305b.length) {
                int e3 = d.e(i3 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f305b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f306c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f305b = iArr;
                this.f306c = objArr;
            }
            this.f305b[i3] = i;
            this.f306c[i3] = e2;
            this.d = i3 + 1;
            return;
        }
        g(i, e2);
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f305b = (int[]) this.f305b.clone();
            iVar.f306c = (Object[]) this.f306c.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i = this.d;
        int[] iArr = this.f305b;
        Object[] objArr = this.f306c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f304a = false;
        this.d = i2;
    }

    public E d(int i) {
        return e(i, null);
    }

    public E e(int i, E e2) {
        int a2 = d.a(this.f305b, this.d, i);
        if (a2 >= 0) {
            Object[] objArr = this.f306c;
            if (objArr[a2] != e) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int f(int i) {
        if (this.f304a) {
            c();
        }
        return this.f305b[i];
    }

    public void g(int i, E e2) {
        int a2 = d.a(this.f305b, this.d, i);
        if (a2 >= 0) {
            this.f306c[a2] = e2;
            return;
        }
        int i2 = ~a2;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.f306c;
            if (objArr[i2] == e) {
                this.f305b[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f304a && i3 >= this.f305b.length) {
            c();
            i2 = ~d.a(this.f305b, this.d, i);
        }
        int i4 = this.d;
        if (i4 >= this.f305b.length) {
            int e3 = d.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f305b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f306c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f305b = iArr;
            this.f306c = objArr2;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f305b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f306c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.d - i2);
        }
        this.f305b[i2] = i;
        this.f306c[i2] = e2;
        this.d++;
    }

    public void h(int i) {
        Object[] objArr;
        Object obj;
        int a2 = d.a(this.f305b, this.d, i);
        if (a2 >= 0 && (objArr = this.f306c)[a2] != (obj = e)) {
            objArr[a2] = obj;
            this.f304a = true;
        }
    }

    public int i() {
        if (this.f304a) {
            c();
        }
        return this.d;
    }

    public E j(int i) {
        if (this.f304a) {
            c();
        }
        return (E) this.f306c[i];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(f(i));
            sb.append('=');
            E j = j(i);
            if (j != this) {
                sb.append((Object) j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
