package a.k.a;

import a.h.j.m;
import a.h.j.r;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f625b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f626c;

    public v(x xVar, ArrayList arrayList, Map map) {
        this.f625b = arrayList;
        this.f626c = map;
    }

    public void run() {
        String str;
        int size = this.f625b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f625b.get(i);
            WeakHashMap<View, r> weakHashMap = m.f516a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f626c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
