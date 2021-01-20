package a.b.g;

import a.b.f.i.a;
import android.view.View;
import android.view.Window;

public class y0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final a f248b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z0 f249c;

    public y0(z0 z0Var) {
        this.f249c = z0Var;
        this.f248b = new a(z0Var.f252a.getContext(), 0, 16908332, 0, z0Var.i);
    }

    public void onClick(View view) {
        z0 z0Var = this.f249c;
        Window.Callback callback = z0Var.l;
        if (callback != null && z0Var.m) {
            callback.onMenuItemSelected(0, this.f248b);
        }
    }
}
