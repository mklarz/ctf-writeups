package a.k.a;

import a.h.j.m;
import a.h.j.r;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

public class w implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f627b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f628c;

    public w(x xVar, ArrayList arrayList, Map map) {
        this.f627b = arrayList;
        this.f628c = map;
    }

    public void run() {
        int size = this.f627b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f627b.get(i);
            WeakHashMap<View, r> weakHashMap = m.f516a;
            view.setTransitionName((String) this.f628c.get(view.getTransitionName()));
        }
    }
}
