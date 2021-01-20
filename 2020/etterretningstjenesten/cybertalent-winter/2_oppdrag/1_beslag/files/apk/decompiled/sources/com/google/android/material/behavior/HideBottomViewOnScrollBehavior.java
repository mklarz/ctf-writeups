package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f1097a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1098b = 2;

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimator f1099c;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1099c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f1099c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    public void B(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1099c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f1098b = 1;
        A(v, this.f1097a, 175, b.b.a.a.c.a.f994b);
    }

    public void C(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1099c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f1098b = 2;
        A(v, 0, 225, b.b.a.a.c.a.f995c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f1097a = v.getMeasuredHeight();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1098b;
        if (i5 != 1 && i2 > 0) {
            B(v);
        } else if (i5 != 2 && i2 < 0) {
            C(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
