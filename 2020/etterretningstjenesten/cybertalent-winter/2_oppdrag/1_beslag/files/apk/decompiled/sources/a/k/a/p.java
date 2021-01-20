package a.k.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public final class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f604b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f605c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Fragment e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Object i;

    public p(Object obj, x xVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f604b = obj;
        this.f605c = xVar;
        this.d = view;
        this.e = fragment;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = obj2;
    }

    public void run() {
        Object obj = this.f604b;
        if (obj != null) {
            this.f605c.l(obj, this.d);
            this.g.addAll(s.h(this.f605c, this.f604b, this.e, this.f, this.d));
        }
        if (this.h != null) {
            if (this.i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.d);
                this.f605c.m(this.i, this.h, arrayList);
            }
            this.h.clear();
            this.h.add(this.d);
        }
    }
}
