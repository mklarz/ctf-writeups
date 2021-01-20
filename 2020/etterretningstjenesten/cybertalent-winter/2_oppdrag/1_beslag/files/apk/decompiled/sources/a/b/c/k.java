package a.b.c;

import a.h.j.m;
import a.h.j.r;
import a.h.j.t;
import android.view.View;

public class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f31b;

    public class a extends t {
        public a() {
        }

        @Override // a.h.j.s
        public void a(View view) {
            k.this.f31b.p.setAlpha(1.0f);
            k.this.f31b.s.d(null);
            k.this.f31b.s = null;
        }

        @Override // a.h.j.t, a.h.j.s
        public void b(View view) {
            k.this.f31b.p.setVisibility(0);
        }
    }

    public k(h hVar) {
        this.f31b = hVar;
    }

    public void run() {
        h hVar = this.f31b;
        hVar.q.showAtLocation(hVar.p, 55, 0, 0);
        this.f31b.I();
        if (this.f31b.V()) {
            this.f31b.p.setAlpha(0.0f);
            h hVar2 = this.f31b;
            r a2 = m.a(hVar2.p);
            a2.a(1.0f);
            hVar2.s = a2;
            r rVar = this.f31b.s;
            a aVar = new a();
            View view = rVar.f526a.get();
            if (view != null) {
                rVar.e(view, aVar);
                return;
            }
            return;
        }
        this.f31b.p.setAlpha(1.0f);
        this.f31b.p.setVisibility(0);
    }
}
