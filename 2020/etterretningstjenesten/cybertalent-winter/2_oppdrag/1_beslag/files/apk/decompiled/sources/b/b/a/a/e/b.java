package b.b.a.a.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f1021a;

    public b(BottomAppBar bottomAppBar) {
        this.f1021a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1021a.P = null;
    }
}
