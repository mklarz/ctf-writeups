package a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f763a;

    public j(h hVar) {
        this.f763a = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f763a.m();
        animator.removeListener(this);
    }
}
