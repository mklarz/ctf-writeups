package a.o.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.y f679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f680b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f681c;
    public final /* synthetic */ k d;

    public g(k kVar, RecyclerView.y yVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = kVar;
        this.f679a = yVar;
        this.f680b = view;
        this.f681c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f680b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f681c.setListener(null);
        this.d.c(this.f679a);
        this.d.o.remove(this.f679a);
        this.d.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.d);
    }
}
