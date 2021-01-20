package a.o.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.y f682a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f683b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f684c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ k f;

    public h(k kVar, RecyclerView.y yVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = kVar;
        this.f682a = yVar;
        this.f683b = i;
        this.f684c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f683b != 0) {
            this.f684c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.f684c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.c(this.f682a);
        this.f.p.remove(this.f682a);
        this.f.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f);
    }
}
