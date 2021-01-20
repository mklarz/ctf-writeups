package a.b.c;

import a.h.j.m;
import a.h.j.r;
import a.h.j.t;
import android.view.View;
import java.util.WeakHashMap;

public class l extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f33a;

    public l(h hVar) {
        this.f33a = hVar;
    }

    @Override // a.h.j.s
    public void a(View view) {
        this.f33a.p.setAlpha(1.0f);
        this.f33a.s.d(null);
        this.f33a.s = null;
    }

    @Override // a.h.j.t, a.h.j.s
    public void b(View view) {
        this.f33a.p.setVisibility(0);
        this.f33a.p.sendAccessibilityEvent(32);
        if (this.f33a.p.getParent() instanceof View) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            ((View) this.f33a.p.getParent()).requestApplyInsets();
        }
    }
}
