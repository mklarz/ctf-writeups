package b.b.a.a.o;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1081a;

    public a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f1081a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1081a.invalidate();
    }
}
