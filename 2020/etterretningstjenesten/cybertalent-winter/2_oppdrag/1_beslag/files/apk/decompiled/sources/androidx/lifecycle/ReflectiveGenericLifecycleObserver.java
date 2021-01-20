package androidx.lifecycle;

import a.m.a;
import a.m.d;
import a.m.e;
import a.m.g;

public class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f917a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0018a f918b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f917a = obj;
        this.f918b = a.f635c.b(obj.getClass());
    }

    @Override // a.m.e
    public void g(g gVar, d.a aVar) {
        a.C0018a aVar2 = this.f918b;
        Object obj = this.f917a;
        a.C0018a.a(aVar2.f638a.get(aVar), gVar, aVar, obj);
        a.C0018a.a(aVar2.f638a.get(d.a.ON_ANY), gVar, aVar, obj);
    }
}
