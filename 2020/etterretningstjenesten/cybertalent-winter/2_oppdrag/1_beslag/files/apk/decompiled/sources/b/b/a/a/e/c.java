package b.b.a.a.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f1023b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1024c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BottomAppBar e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.f1023b = actionMenuView;
        this.f1024c = i;
        this.d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1022a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f1022a) {
            BottomAppBar bottomAppBar = this.e;
            ActionMenuView actionMenuView = this.f1023b;
            int i = this.f1024c;
            boolean z = this.d;
            int i2 = BottomAppBar.T;
            bottomAppBar.A(actionMenuView, i, z);
        }
    }
}
