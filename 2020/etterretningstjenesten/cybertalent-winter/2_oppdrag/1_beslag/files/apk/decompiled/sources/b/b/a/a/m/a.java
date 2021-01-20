package b.b.a.a.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f1066b;

    public a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f1066b = baseTransientBottomBar;
        this.f1065a = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1066b.e(this.f1065a);
    }

    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f1066b.d;
        snackbarContentLayout.f1136b.setAlpha(1.0f);
        long j = (long) 180;
        long j2 = (long) 0;
        snackbarContentLayout.f1136b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.f1137c.getVisibility() == 0) {
            snackbarContentLayout.f1137c.setAlpha(1.0f);
            snackbarContentLayout.f1137c.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
