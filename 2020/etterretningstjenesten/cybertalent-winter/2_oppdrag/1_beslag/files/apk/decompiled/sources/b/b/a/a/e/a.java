package b.b.a.a.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f1020a;

    public a(BottomAppBar bottomAppBar) {
        this.f1020a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1020a.O = null;
    }
}
