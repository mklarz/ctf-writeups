package a.e;

import java.util.Map;

public class b extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    @Override // a.e.g
    public void a() {
        this.d.clear();
    }

    @Override // a.e.g
    public Object b(int i, int i2) {
        return this.d.f278b[i];
    }

    @Override // a.e.g
    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // a.e.g
    public int d() {
        return this.d.f279c;
    }

    @Override // a.e.g
    public int e(Object obj) {
        return this.d.c(obj);
    }

    @Override // a.e.g
    public int f(Object obj) {
        return this.d.c(obj);
    }

    @Override // a.e.g
    public void g(E e, E e2) {
        this.d.add(e);
    }

    @Override // a.e.g
    public void h(int i) {
        this.d.f(i);
    }

    @Override // a.e.g
    public E i(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }
}
