package a.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f264a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f265b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f266c = new WeakHashMap<>();
    public int d = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f269c;
        }
    }

    /* renamed from: a.c.a.b.b$b  reason: collision with other inner class name */
    public static class C0006b<K, V> extends e<K, V> {
        public C0006b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f269c;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f267a;

        /* renamed from: b  reason: collision with root package name */
        public final V f268b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f269c;
        public c<K, V> d;

        public c(K k, V v) {
            this.f267a = k;
            this.f268b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f267a.equals(cVar.f267a) && this.f268b.equals(cVar.f268b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f267a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f268b;
        }

        public int hashCode() {
            return this.f267a.hashCode() ^ this.f268b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f267a) + "=" + ((Object) this.f268b);
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f270a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f271b = true;

        public d() {
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f270a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.f270a = cVar3;
                this.f271b = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f271b) {
                return b.this.f264a != null;
            }
            c<K, V> cVar = this.f270a;
            return (cVar == null || cVar.f269c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f271b) {
                this.f271b = false;
                cVar = b.this.f264a;
            } else {
                c<K, V> cVar2 = this.f270a;
                cVar = cVar2 != null ? cVar2.f269c : null;
            }
            this.f270a = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f273a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f274b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f273a = cVar2;
            this.f274b = cVar;
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f273a == cVar && cVar == this.f274b) {
                this.f274b = null;
                this.f273a = null;
            }
            c<K, V> cVar3 = this.f273a;
            if (cVar3 == cVar) {
                this.f273a = b(cVar3);
            }
            c<K, V> cVar4 = this.f274b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f273a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f274b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f274b != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f274b;
            c<K, V> cVar2 = this.f273a;
            this.f274b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f264a;
        while (cVar != null && !cVar.f267a.equals(k)) {
            cVar = cVar.f269c;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f266c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.f265b;
        if (cVar2 == null) {
            this.f264a = cVar;
        } else {
            cVar2.f269c = cVar;
            cVar.d = cVar2;
        }
        this.f265b = cVar;
        return cVar;
    }

    public V d(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.d--;
        if (!this.f266c.isEmpty()) {
            for (f<K, V> fVar : this.f266c.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.d;
        c<K, V> cVar2 = a2.f269c;
        if (cVar != null) {
            cVar.f269c = cVar2;
        } else {
            this.f264a = cVar2;
        }
        c<K, V> cVar3 = a2.f269c;
        if (cVar3 != null) {
            cVar3.d = cVar;
        } else {
            this.f265b = cVar;
        }
        a2.f269c = null;
        a2.d = null;
        return a2.f268b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((a.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.d != bVar.d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f264a, this.f265b);
        this.f266c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder d2 = b.a.a.a.a.d("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                d2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    d2.append(", ");
                }
            } else {
                d2.append("]");
                return d2.toString();
            }
        }
    }
}
