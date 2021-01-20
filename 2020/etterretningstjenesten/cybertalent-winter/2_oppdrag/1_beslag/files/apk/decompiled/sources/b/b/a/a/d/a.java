package b.b.a.a.d;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1009b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f1010c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f1010c = baseBehavior;
        this.f1008a = coordinatorLayout;
        this.f1009b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1010c.G(this.f1008a, this.f1009b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
