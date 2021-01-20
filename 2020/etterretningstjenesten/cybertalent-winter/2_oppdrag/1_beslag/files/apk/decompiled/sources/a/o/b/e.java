package a.o.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f674b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f675c;

    public e(k kVar, ArrayList arrayList) {
        this.f675c = kVar;
        this.f674b = arrayList;
    }

    public void run() {
        Iterator it = this.f674b.iterator();
        while (it.hasNext()) {
            RecyclerView.y yVar = (RecyclerView.y) it.next();
            k kVar = this.f675c;
            Objects.requireNonNull(kVar);
            View view = yVar.f970b;
            ViewPropertyAnimator animate = view.animate();
            kVar.o.add(yVar);
            animate.alpha(1.0f).setDuration(kVar.f940c).setListener(new g(kVar, yVar, view, animate)).start();
        }
        this.f674b.clear();
        this.f675c.l.remove(this.f674b);
    }
}
