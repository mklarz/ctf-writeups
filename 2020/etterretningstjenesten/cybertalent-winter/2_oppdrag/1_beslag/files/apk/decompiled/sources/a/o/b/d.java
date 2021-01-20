package a.o.b;

import a.o.b.k;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f672b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f673c;

    public d(k kVar, ArrayList arrayList) {
        this.f673c = kVar;
        this.f672b = arrayList;
    }

    public void run() {
        Iterator it = this.f672b.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f673c;
            Objects.requireNonNull(kVar);
            RecyclerView.y yVar = aVar.f691a;
            View view = null;
            View view2 = yVar == null ? null : yVar.f970b;
            RecyclerView.y yVar2 = aVar.f692b;
            if (yVar2 != null) {
                view = yVar2.f970b;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f);
                kVar.r.add(aVar.f691a);
                duration.translationX((float) (aVar.e - aVar.f693c));
                duration.translationY((float) (aVar.f - aVar.d));
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                kVar.r.add(aVar.f692b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view)).start();
            }
        }
        this.f672b.clear();
        this.f673c.n.remove(this.f672b);
    }
}
