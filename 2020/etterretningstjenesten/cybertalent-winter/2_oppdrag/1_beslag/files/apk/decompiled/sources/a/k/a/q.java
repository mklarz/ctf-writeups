package a.k.a;

import a.e.a;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f606b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f607c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a e;
    public final /* synthetic */ View f;
    public final /* synthetic */ x g;
    public final /* synthetic */ Rect h;

    public q(Fragment fragment, Fragment fragment2, boolean z, a aVar, View view, x xVar, Rect rect) {
        this.f606b = fragment;
        this.f607c = fragment2;
        this.d = z;
        this.e = aVar;
        this.f = view;
        this.g = xVar;
        this.h = rect;
    }

    public void run() {
        s.c(this.f606b, this.f607c, this.d, this.e, false);
        View view = this.f;
        if (view != null) {
            this.g.i(view, this.h);
        }
    }
}
