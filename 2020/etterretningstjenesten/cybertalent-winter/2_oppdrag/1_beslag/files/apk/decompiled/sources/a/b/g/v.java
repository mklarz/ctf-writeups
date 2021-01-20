package a.b.g;

import a.b.f.i.p;
import a.b.g.w;
import android.annotation.SuppressLint;
import android.view.View;

public class v extends h0 {
    public final /* synthetic */ w.d k;
    public final /* synthetic */ w l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(w wVar, View view, w.d dVar) {
        super(view);
        this.l = wVar;
        this.k = dVar;
    }

    @Override // a.b.g.h0
    public p b() {
        return this.k;
    }

    @Override // a.b.g.h0
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.l.getInternalPopup().a()) {
            return true;
        }
        this.l.b();
        return true;
    }
}
