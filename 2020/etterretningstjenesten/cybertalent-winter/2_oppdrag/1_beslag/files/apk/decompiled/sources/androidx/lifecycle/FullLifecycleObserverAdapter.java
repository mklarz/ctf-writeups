package androidx.lifecycle;

import a.m.b;
import a.m.d;
import a.m.e;
import a.m.g;

public class FullLifecycleObserverAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    public final b f909a;

    /* renamed from: b  reason: collision with root package name */
    public final e f910b;

    public FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f909a = bVar;
        this.f910b = eVar;
    }

    @Override // a.m.e
    public void g(g gVar, d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f909a.e(gVar);
                break;
            case 1:
                this.f909a.f(gVar);
                break;
            case 2:
                this.f909a.a(gVar);
                break;
            case 3:
                this.f909a.b(gVar);
                break;
            case 4:
                this.f909a.d(gVar);
                break;
            case 5:
                this.f909a.c(gVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f910b;
        if (eVar != null) {
            eVar.g(gVar, aVar);
        }
    }
}
