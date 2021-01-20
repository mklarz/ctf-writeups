package a.f.b;

public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f320a;

    /* renamed from: b  reason: collision with root package name */
    public int f321b;

    public e(int i) {
        if (i > 0) {
            this.f320a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f321b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f320a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f321b = i - 1;
        return t;
    }

    public boolean b(T t) {
        int i = this.f321b;
        Object[] objArr = this.f320a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f321b = i + 1;
        return true;
    }
}
