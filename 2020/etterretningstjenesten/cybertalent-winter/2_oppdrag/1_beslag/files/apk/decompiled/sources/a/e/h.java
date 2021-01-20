package a.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f301a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f302b;

    /* renamed from: c  reason: collision with root package name */
    public int f303c;

    public h() {
        this.f301a = d.f280a;
        this.f302b = d.f282c;
        this.f303c = 0;
    }

    public h(int i) {
        if (i == 0) {
            this.f301a = d.f280a;
            this.f302b = d.f282c;
        } else {
            a(i);
        }
        this.f303c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (h.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.f302b = objArr;
                    f = (Object[]) objArr[0];
                    this.f301a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (h.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.f302b = objArr2;
                    d = (Object[]) objArr2[0];
                    this.f301a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.f301a = new int[i];
        this.f302b = new Object[(i << 1)];
    }

    public void b(int i) {
        int i2 = this.f303c;
        int[] iArr = this.f301a;
        if (iArr.length < i) {
            Object[] objArr = this.f302b;
            a(i);
            if (this.f303c > 0) {
                System.arraycopy(iArr, 0, this.f301a, 0, i2);
                System.arraycopy(objArr, 0, this.f302b, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f303c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f303c;
        if (i > 0) {
            int[] iArr = this.f301a;
            Object[] objArr = this.f302b;
            this.f301a = d.f280a;
            this.f302b = d.f282c;
            this.f303c = 0;
            c(iArr, objArr, i);
        }
        if (this.f303c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i) {
        int i2 = this.f303c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f301a, i2, i);
            if (a2 < 0 || obj.equals(this.f302b[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f301a[i3] == i) {
                if (obj.equals(this.f302b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a2 - 1;
            while (i4 >= 0 && this.f301a[i4] == i) {
                if (obj.equals(this.f302b[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f303c != hVar.f303c) {
                return false;
            }
            for (int i = 0; i < this.f303c; i++) {
                try {
                    K h = h(i);
                    V k = k(i);
                    Object obj2 = hVar.get(h);
                    if (k == null) {
                        if (obj2 != null || !hVar.containsKey(h)) {
                            return false;
                        }
                    } else if (!k.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f303c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f303c; i2++) {
                try {
                    K h2 = h(i2);
                    V k2 = k(i2);
                    Object obj3 = map.get(h2);
                    if (k2 == null) {
                        if (obj3 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!k2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i = this.f303c;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f301a, i, 0);
            if (a2 < 0 || this.f302b[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f301a[i2] == 0) {
                if (this.f302b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a2 - 1;
            while (i3 >= 0 && this.f301a[i3] == 0) {
                if (this.f302b[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i = this.f303c * 2;
        Object[] objArr = this.f302b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int e2 = e(obj);
        return e2 >= 0 ? (V) this.f302b[(e2 << 1) + 1] : v;
    }

    public K h(int i) {
        return (K) this.f302b[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f301a;
        Object[] objArr = this.f302b;
        int i = this.f303c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public V i(int i) {
        Object[] objArr = this.f302b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f303c;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.f301a, objArr, i3);
            this.f301a = d.f280a;
            this.f302b = d.f282c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f301a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f302b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f302b;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 == this.f303c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f301a, 0, i);
                        System.arraycopy(objArr, 0, this.f302b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f301a, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f302b, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f303c) {
            this.f303c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean isEmpty() {
        return this.f303c <= 0;
    }

    public V j(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f302b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V k(int i) {
        return (V) this.f302b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f303c;
        if (k == null) {
            i2 = f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = d(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f302b;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f301a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f302b;
            a(i6);
            if (i3 == this.f303c) {
                int[] iArr2 = this.f301a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f302b, 0, objArr2.length);
                }
                c(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f301a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f302b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f303c - i5) << 1);
        }
        int i8 = this.f303c;
        if (i3 == i8) {
            int[] iArr4 = this.f301a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f302b;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.f303c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        V k = k(e2);
        if (obj2 != k && (obj2 == null || !obj2.equals(k))) {
            return false;
        }
        i(e2);
        return true;
    }

    public V replace(K k, V v) {
        int e2 = e(k);
        if (e2 >= 0) {
            return j(e2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int e2 = e(k);
        if (e2 < 0) {
            return false;
        }
        V k2 = k(e2);
        if (k2 != v && (v == null || !v.equals(k2))) {
            return false;
        }
        j(e2, v2);
        return true;
    }

    public int size() {
        return this.f303c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f303c * 28);
        sb.append('{');
        for (int i = 0; i < this.f303c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K h = h(i);
            if (h != this) {
                sb.append((Object) h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k = k(i);
            if (k != this) {
                sb.append((Object) k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
