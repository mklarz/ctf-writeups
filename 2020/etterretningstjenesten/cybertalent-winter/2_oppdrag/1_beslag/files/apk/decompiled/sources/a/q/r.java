package a.q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

public class r implements s {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f782a;

    public r(ViewGroup viewGroup) {
        this.f782a = viewGroup.getOverlay();
    }

    @Override // a.q.s
    public void a(View view) {
        this.f782a.remove(view);
    }
}
