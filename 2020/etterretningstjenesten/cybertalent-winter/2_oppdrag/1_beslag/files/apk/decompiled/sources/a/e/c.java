package a.e;

import a.e.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] e = new int[0];
    public static final Object[] f = new Object[0];
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f277a = e;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f278b = f;

    /* renamed from: c  reason: collision with root package name */
    public int f279c = 0;
    public g<E, E> d;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (j < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    i = objArr;
                    j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = i;
                if (objArr != null) {
                    this.f278b = objArr;
                    i = (Object[]) objArr[0];
                    this.f277a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = g;
                if (objArr2 != null) {
                    this.f278b = objArr2;
                    g = (Object[]) objArr2[0];
                    this.f277a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    h--;
                    return;
                }
            }
        }
        this.f277a = new int[i2];
        this.f278b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = e();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = d(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f279c;
        int[] iArr = this.f277a;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f278b;
            a(i6);
            int[] iArr2 = this.f277a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f278b, 0, objArr.length);
            }
            b(iArr, objArr, this.f279c);
        }
        int i7 = this.f279c;
        if (i4 < i7) {
            int[] iArr3 = this.f277a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f278b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f279c - i4);
        }
        this.f277a[i4] = i2;
        this.f278b[i4] = e2;
        this.f279c++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.e.c<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f279c;
        int[] iArr = this.f277a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f278b;
            a(size);
            int i2 = this.f279c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f277a, 0, i2);
                System.arraycopy(objArr, 0, this.f278b, 0, this.f279c);
            }
            b(iArr, objArr, this.f279c);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public int c(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    public void clear() {
        int i2 = this.f279c;
        if (i2 != 0) {
            b(this.f277a, this.f278b, i2);
            this.f277a = e;
            this.f278b = f;
            this.f279c = 0;
        }
    }

    public boolean contains(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(Object obj, int i2) {
        int i3 = this.f279c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f277a, i3, i2);
        if (a2 < 0 || obj.equals(this.f278b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f277a[i4] == i2) {
            if (obj.equals(this.f278b[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f277a[i5] == i2) {
            if (obj.equals(this.f278b[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final int e() {
        int i2 = this.f279c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f277a, i2, 0);
        if (a2 < 0 || this.f278b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f277a[i3] == 0) {
            if (this.f278b[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f277a[i4] == 0) {
            if (this.f278b[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f279c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f279c; i2++) {
                try {
                    if (!set.contains(this.f278b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i2) {
        Object[] objArr = this.f278b;
        E e2 = (E) objArr[i2];
        int i3 = this.f279c;
        if (i3 <= 1) {
            b(this.f277a, objArr, i3);
            this.f277a = e;
            this.f278b = f;
            this.f279c = 0;
        } else {
            int[] iArr = this.f277a;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f279c = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f278b;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f279c - i2);
                }
                this.f278b[this.f279c] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.f279c--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f277a, 0, i2);
                    System.arraycopy(objArr, 0, this.f278b, 0, i2);
                }
                int i7 = this.f279c;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f277a, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f278b, i2, this.f279c - i2);
                }
            }
        }
        return e2;
    }

    public int hashCode() {
        int[] iArr = this.f277a;
        int i2 = this.f279c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f279c <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.d == null) {
            this.d = new b(this);
        }
        g<E, E> gVar = this.d;
        if (gVar.f290b == null) {
            gVar.f290b = new g.c();
        }
        return gVar.f290b.iterator();
    }

    public boolean remove(Object obj) {
        int c2 = c(obj);
        if (c2 < 0) {
            return false;
        }
        f(c2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f279c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f278b[i2])) {
                f(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f279c;
    }

    public Object[] toArray() {
        int i2 = this.f279c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f278b, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f279c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f279c));
        }
        System.arraycopy(this.f278b, 0, tArr, 0, this.f279c);
        int length = tArr.length;
        int i2 = this.f279c;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f279c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f279c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f278b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
