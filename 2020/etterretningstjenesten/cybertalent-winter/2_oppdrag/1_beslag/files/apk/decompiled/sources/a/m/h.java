package a.m;

import a.c.a.b.b;
import a.m.d;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class h extends d {

    /* renamed from: a  reason: collision with root package name */
    public a.c.a.b.a<f, a> f645a = new a.c.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    public d.b f646b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<g> f647c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<d.b> g = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d.b f648a;

        /* renamed from: b  reason: collision with root package name */
        public e f649b;

        public a(f fVar, d.b bVar) {
            e eVar;
            Map<Class, Integer> map = j.f650a;
            boolean z = fVar instanceof e;
            boolean z2 = fVar instanceof b;
            if (z && z2) {
                eVar = new FullLifecycleObserverAdapter((b) fVar, (e) fVar);
            } else if (z2) {
                eVar = new FullLifecycleObserverAdapter((b) fVar, null);
            } else if (z) {
                eVar = (e) fVar;
            } else {
                Class<?> cls = fVar.getClass();
                if (j.c(cls) == 2) {
                    List<Constructor<? extends c>> list = j.f651b.get(cls);
                    if (list.size() == 1) {
                        eVar = new SingleGeneratedAdapterObserver(j.a(list.get(0), fVar));
                    } else {
                        c[] cVarArr = new c[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            cVarArr[i] = j.a(list.get(i), fVar);
                        }
                        eVar = new CompositeGeneratedAdaptersObserver(cVarArr);
                    }
                } else {
                    eVar = new ReflectiveGenericLifecycleObserver(fVar);
                }
            }
            this.f649b = eVar;
            this.f648a = bVar;
        }

        public void a(g gVar, d.a aVar) {
            d.b c2 = h.c(aVar);
            this.f648a = h.e(this.f648a, c2);
            this.f649b.g(gVar, aVar);
            this.f648a = c2;
        }
    }

    public h(g gVar) {
        this.f647c = new WeakReference<>(gVar);
        this.f646b = d.b.INITIALIZED;
    }

    public static d.b c(d.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return d.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return d.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return d.b.STARTED;
        }
        return d.b.CREATED;
    }

    public static d.b e(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public static d.a i(d.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return d.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return d.a.ON_START;
        }
        if (ordinal == 3) {
            return d.a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // a.m.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f646b;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        a aVar = new a(fVar, bVar2);
        if (this.f645a.e(fVar, aVar) == null && (gVar = this.f647c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            d.b b2 = b(fVar);
            this.d++;
            while (aVar.f648a.compareTo((Enum) b2) < 0 && this.f645a.e.containsKey(fVar)) {
                this.g.add(aVar.f648a);
                aVar.a(gVar, i(aVar.f648a));
                g();
                b2 = b(fVar);
            }
            if (!z) {
                h();
            }
            this.d--;
        }
    }

    public final d.b b(f fVar) {
        a.c.a.b.a<f, a> aVar = this.f645a;
        d.b bVar = null;
        b.c<K, V> cVar = aVar.e.containsKey(fVar) ? aVar.e.get(fVar).d : null;
        d.b bVar2 = cVar != null ? cVar.f268b.f648a : null;
        if (!this.g.isEmpty()) {
            ArrayList<d.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return e(e(this.f646b, bVar2), bVar);
    }

    public void d(d.a aVar) {
        f(c(aVar));
    }

    public final void f(d.b bVar) {
        if (this.f646b != bVar) {
            this.f646b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            h();
            this.e = false;
        }
    }

    public final void g() {
        ArrayList<d.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: a.c.a.b.a<a.m.f, a.m.h$a> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: a.c.a.b.a<a.m.f, a.m.h$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        d.a aVar;
        d.b bVar;
        g gVar = this.f647c.get();
        if (gVar != null) {
            while (true) {
                a.c.a.b.a<f, a> aVar2 = this.f645a;
                boolean z = aVar2.d == 0 || (aVar2.f264a.f268b.f648a == (bVar = aVar2.f265b.f268b.f648a) && this.f646b == bVar);
                this.f = false;
                if (!z) {
                    if (this.f646b.compareTo((Enum) aVar2.f264a.f268b.f648a) < 0) {
                        a.c.a.b.a<f, a> aVar3 = this.f645a;
                        b.C0006b bVar2 = new b.C0006b(aVar3.f265b, aVar3.f264a);
                        aVar3.f266c.put(bVar2, Boolean.FALSE);
                        while (bVar2.hasNext() && !this.f) {
                            Map.Entry entry = (Map.Entry) bVar2.next();
                            a aVar4 = (a) entry.getValue();
                            while (aVar4.f648a.compareTo((Enum) this.f646b) > 0 && !this.f && this.f645a.contains(entry.getKey())) {
                                d.b bVar3 = aVar4.f648a;
                                int ordinal = bVar3.ordinal();
                                if (ordinal == 0) {
                                    throw new IllegalArgumentException();
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        aVar = d.a.ON_DESTROY;
                                    } else if (ordinal == 3) {
                                        aVar = d.a.ON_STOP;
                                    } else if (ordinal == 4) {
                                        aVar = d.a.ON_PAUSE;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected state value " + bVar3);
                                    }
                                    this.g.add(c(aVar));
                                    aVar4.a(gVar, aVar);
                                    g();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar = this.f645a.f265b;
                    if (!this.f && cVar != null && this.f646b.compareTo((Enum) cVar.f268b.f648a) > 0) {
                        b<K, V>.d b2 = this.f645a.b();
                        while (b2.hasNext() && !this.f) {
                            Map.Entry entry2 = (Map.Entry) b2.next();
                            a aVar5 = (a) entry2.getValue();
                            while (aVar5.f648a.compareTo((Enum) this.f646b) < 0 && !this.f && this.f645a.contains(entry2.getKey())) {
                                this.g.add(aVar5.f648a);
                                aVar5.a(gVar, i(aVar5.f648a));
                                g();
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
