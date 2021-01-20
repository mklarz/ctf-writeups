package b.b.a.a.g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f1028a;

    public a(c cVar) {
        this.f1028a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1028a.a();
    }

    public void onAnimationStart(Animator animator) {
        this.f1028a.b();
    }
}
