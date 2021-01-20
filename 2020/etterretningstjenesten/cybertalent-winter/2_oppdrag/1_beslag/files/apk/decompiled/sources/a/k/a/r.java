package a.k.a;

import a.e.a;
import a.k.a.s;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public final class r implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f608b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f609c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ s.a e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ Fragment i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Rect m;

    public r(x xVar, a aVar, Object obj, s.a aVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f608b = xVar;
        this.f609c = aVar;
        this.d = obj;
        this.e = aVar2;
        this.f = arrayList;
        this.g = view;
        this.h = fragment;
        this.i = fragment2;
        this.j = z;
        this.k = arrayList2;
        this.l = obj2;
        this.m = rect;
    }

    public void run() {
        a<String, View> e2 = s.e(this.f608b, this.f609c, this.d, this.e);
        if (e2 != null) {
            this.f.addAll(e2.values());
            this.f.add(this.g);
        }
        s.c(this.h, this.i, this.j, e2, false);
        Object obj = this.d;
        if (obj != null) {
            this.f608b.s(obj, this.k, this.f);
            View k2 = s.k(e2, this.e, this.l, this.j);
            if (k2 != null) {
                this.f608b.i(k2, this.m);
            }
        }
    }
}
