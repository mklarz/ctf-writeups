package androidx.lifecycle;

import a.m.c;
import a.m.d;
import a.m.e;
import a.m.g;
import a.m.k;

public class CompositeGeneratedAdaptersObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f908a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f908a = cVarArr;
    }

    @Override // a.m.e
    public void g(g gVar, d.a aVar) {
        k kVar = new k();
        for (c cVar : this.f908a) {
            cVar.a(gVar, aVar, false, kVar);
        }
        for (c cVar2 : this.f908a) {
            cVar2.a(gVar, aVar, true, kVar);
        }
    }
}
