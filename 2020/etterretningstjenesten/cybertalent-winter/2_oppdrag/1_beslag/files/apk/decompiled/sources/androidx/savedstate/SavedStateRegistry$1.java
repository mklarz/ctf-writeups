package androidx.savedstate;

import a.m.d;
import a.m.e;
import a.m.g;
import a.p.a;
import java.util.Objects;

public class SavedStateRegistry$1 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f988a;

    public SavedStateRegistry$1(a aVar) {
        this.f988a = aVar;
    }

    @Override // a.m.e
    public void g(g gVar, d.a aVar) {
        if (aVar == d.a.ON_START || aVar == d.a.ON_STOP) {
            Objects.requireNonNull(this.f988a);
        }
    }
}
