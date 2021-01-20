package a.o.b;

import a.o.b.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f685a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f686b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f687c;
    public final /* synthetic */ k d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f685a = aVar;
        this.f686b = viewPropertyAnimator;
        this.f687c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f686b.setListener(null);
        this.f687c.setAlpha(1.0f);
        this.f687c.setTranslationX(0.0f);
        this.f687c.setTranslationY(0.0f);
        this.d.c(this.f685a.f691a);
        this.d.r.remove(this.f685a.f691a);
        this.d.k();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.d;
        RecyclerView.y yVar = this.f685a.f691a;
        Objects.requireNonNull(kVar);
    }
}
