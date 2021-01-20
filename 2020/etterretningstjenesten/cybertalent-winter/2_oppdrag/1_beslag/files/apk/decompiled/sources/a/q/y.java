package a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public class y extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f790b;

    public y(z zVar, s sVar, View view) {
        this.f789a = sVar;
        this.f790b = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f789a.a(this.f790b);
    }
}
