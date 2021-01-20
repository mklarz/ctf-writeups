package b.b.a.a.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import b.b.a.a.g.c;
import com.google.android.material.transformation.FabTransformationBehavior;

public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f1082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f1083b;

    public b(FabTransformationBehavior fabTransformationBehavior, c cVar, Drawable drawable) {
        this.f1082a = cVar;
        this.f1083b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1082a.setCircularRevealOverlayDrawable(null);
    }

    public void onAnimationStart(Animator animator) {
        this.f1082a.setCircularRevealOverlayDrawable(this.f1083b);
    }
}
