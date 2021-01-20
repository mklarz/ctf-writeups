package a.k.a;

import a.h.j.m;
import a.h.j.r;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f623b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f624c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public u(x xVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f623b = i;
        this.f624c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f623b; i++) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            ((View) this.f624c.get(i)).setTransitionName((String) this.d.get(i));
            ((View) this.e.get(i)).setTransitionName((String) this.f.get(i));
        }
    }
}
