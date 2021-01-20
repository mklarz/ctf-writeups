package a.o.b;

import a.o.b.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f688a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f689b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f690c;
    public final /* synthetic */ k d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f688a = aVar;
        this.f689b = viewPropertyAnimator;
        this.f690c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f689b.setListener(null);
        this.f690c.setAlpha(1.0f);
        this.f690c.setTranslationX(0.0f);
        this.f690c.setTranslationY(0.0f);
        this.d.c(this.f688a.f692b);
        this.d.r.remove(this.f688a.f692b);
        this.d.k();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.d;
        RecyclerView.y yVar = this.f688a.f692b;
        Objects.requireNonNull(kVar);
    }
}
