package a.e;

import a.e.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> h;

    /* renamed from: a.e.a$a  reason: collision with other inner class name */
    public class C0007a extends g<K, V> {
        public C0007a() {
        }

        @Override // a.e.g
        public void a() {
            a.this.clear();
        }

        @Override // a.e.g
        public Object b(int i, int i2) {
            return a.this.f302b[(i << 1) + i2];
        }

        @Override // a.e.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // a.e.g
        public int d() {
            return a.this.f303c;
        }

        @Override // a.e.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // a.e.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // a.e.g
        public void g(K k, V v) {
            a.this.put(k, v);
        }

        @Override // a.e.g
        public void h(int i) {
            a.this.i(i);
        }

        @Override // a.e.g
        public V i(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = a.this.f302b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    public a() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.e.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(h hVar) {
        if (hVar != null) {
            int i = hVar.f303c;
            b(this.f303c + i);
            if (this.f303c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(hVar.h(i2), hVar.k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(hVar.f301a, 0, this.f301a, 0, i);
                System.arraycopy(hVar.f302b, 0, this.f302b, 0, i << 1);
                this.f303c = i;
            }
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> l = l();
        if (l.f289a == null) {
            l.f289a = new g.b();
        }
        return l.f289a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> l = l();
        if (l.f290b == null) {
            l.f290b = new g.c();
        }
        return l.f290b;
    }

    public final g<K, V> l() {
        if (this.h == null) {
            this.h = new C0007a();
        }
        return this.h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.e.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f303c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> l = l();
        if (l.f291c == null) {
            l.f291c = new g.e();
        }
        return l.f291c;
    }
}
