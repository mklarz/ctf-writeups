package a.h.i;

public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f497a;

    /* renamed from: b  reason: collision with root package name */
    public int f498b;

    public b(int i) {
        if (i > 0) {
            this.f497a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f498b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f497a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f498b = i - 1;
        return t;
    }

    public boolean b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f498b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (this.f497a[i2] == t) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object[] objArr = this.f497a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f498b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
