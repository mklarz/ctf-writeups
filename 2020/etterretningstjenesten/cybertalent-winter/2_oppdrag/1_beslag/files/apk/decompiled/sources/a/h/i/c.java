package a.h.i;

public class c<T> extends b<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f499c = new Object();

    public c(int i) {
        super(i);
    }

    @Override // a.h.i.b
    public T a() {
        T t;
        synchronized (this.f499c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // a.h.i.b
    public boolean b(T t) {
        boolean b2;
        synchronized (this.f499c) {
            b2 = super.b(t);
        }
        return b2;
    }
}
