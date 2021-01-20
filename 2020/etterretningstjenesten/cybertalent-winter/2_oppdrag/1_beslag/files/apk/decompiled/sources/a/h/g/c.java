package a.h.g;

import a.h.g.e;
import a.h.g.f;
import android.os.Handler;

public class c implements f.c<e.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.h.c.b.e f469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Handler f470b;

    public c(a.h.c.b.e eVar, Handler handler) {
        this.f469a = eVar;
        this.f470b = handler;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.h.g.f.c
    public void a(e.d dVar) {
        a.h.c.b.e eVar;
        int i;
        e.d dVar2 = dVar;
        if (dVar2 == null) {
            eVar = this.f469a;
            i = 1;
        } else {
            i = dVar2.f481b;
            if (i == 0) {
                this.f469a.b(dVar2.f480a, this.f470b);
                return;
            }
            eVar = this.f469a;
        }
        eVar.a(i, this.f470b);
    }
}
