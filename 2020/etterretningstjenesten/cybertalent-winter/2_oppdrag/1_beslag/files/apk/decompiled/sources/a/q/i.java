package a.q;

import a.e.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f761a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f762b;

    public i(h hVar, a aVar) {
        this.f762b = hVar;
        this.f761a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f761a.remove(animator);
        this.f762b.m.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f762b.m.add(animator);
    }
}
