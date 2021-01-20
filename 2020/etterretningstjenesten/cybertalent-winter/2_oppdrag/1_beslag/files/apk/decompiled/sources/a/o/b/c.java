package a.o.b;

import a.o.b.k;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f670b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f671c;

    public c(k kVar, ArrayList arrayList) {
        this.f671c = kVar;
        this.f670b = arrayList;
    }

    public void run() {
        Iterator it = this.f670b.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f671c;
            RecyclerView.y yVar = bVar.f694a;
            int i = bVar.f695b;
            int i2 = bVar.f696c;
            int i3 = bVar.d;
            int i4 = bVar.e;
            Objects.requireNonNull(kVar);
            View view = yVar.f970b;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.p.add(yVar);
            animate.setDuration(kVar.e).setListener(new h(kVar, yVar, i5, view, i6, animate)).start();
        }
        this.f670b.clear();
        this.f671c.m.remove(this.f670b);
    }
}
