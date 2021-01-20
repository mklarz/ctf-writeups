package a.b.c;

import a.h.d.b;
import a.h.j.k;
import a.h.j.m;
import a.h.j.r;
import a.h.j.v;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f29a;

    public i(h hVar) {
        this.f29a = hVar;
    }

    @Override // a.h.j.k
    public v a(View view, v vVar) {
        int d = vVar.d();
        int X = this.f29a.X(vVar, null);
        if (d != X) {
            int b2 = vVar.b();
            int c2 = vVar.c();
            int a2 = vVar.a();
            int i = Build.VERSION.SDK_INT;
            v.d cVar = i >= 30 ? new v.c(vVar) : i >= 29 ? new v.b(vVar) : new v.a(vVar);
            cVar.c(b.a(b2, X, c2, a2));
            vVar = cVar.a();
        }
        WeakHashMap<View, r> weakHashMap = m.f516a;
        WindowInsets f = vVar.f();
        if (f == null) {
            return vVar;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? v.h(onApplyWindowInsets, view) : vVar;
    }
}
