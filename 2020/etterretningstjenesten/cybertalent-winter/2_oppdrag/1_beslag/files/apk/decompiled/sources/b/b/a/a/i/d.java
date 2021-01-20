package b.b.a.a.i;

import android.view.ViewTreeObserver;

public class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f1042b;

    public d(e eVar) {
        this.f1042b = eVar;
    }

    public boolean onPreDraw() {
        e eVar = this.f1042b;
        float rotation = eVar.o.getRotation();
        if (eVar.h == rotation) {
            return true;
        }
        eVar.h = rotation;
        return true;
    }
}
