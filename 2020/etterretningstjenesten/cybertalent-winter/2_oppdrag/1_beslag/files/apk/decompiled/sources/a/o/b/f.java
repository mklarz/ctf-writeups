package a.o.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.y f676a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f677b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f678c;
    public final /* synthetic */ k d;

    public f(k kVar, RecyclerView.y yVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f676a = yVar;
        this.f677b = viewPropertyAnimator;
        this.f678c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f677b.setListener(null);
        this.f678c.setAlpha(1.0f);
        this.d.c(this.f676a);
        this.d.q.remove(this.f676a);
        this.d.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.d);
    }
}
