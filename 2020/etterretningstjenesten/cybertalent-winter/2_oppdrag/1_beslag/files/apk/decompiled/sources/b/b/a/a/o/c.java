package b.b.a.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.b.a.a.g.c;
import com.google.android.material.transformation.FabTransformationBehavior;

public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.g.c f1084a;

    public c(FabTransformationBehavior fabTransformationBehavior, b.b.a.a.g.c cVar) {
        this.f1084a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.f1084a.getRevealInfo();
        revealInfo.f1035c = Float.MAX_VALUE;
        this.f1084a.setRevealInfo(revealInfo);
    }
}
