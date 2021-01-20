package a.h.j;

import a.b.c.q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f526a;

    /* renamed from: b  reason: collision with root package name */
    public int f527b = -1;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f528a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f529b;

        public a(r rVar, s sVar, View view) {
            this.f528a = sVar;
            this.f529b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f528a.c(this.f529b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f528a.a(this.f529b);
        }

        public void onAnimationStart(Animator animator) {
            this.f528a.b(this.f529b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f530a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f531b;

        public b(r rVar, u uVar, View view) {
            this.f530a = uVar;
            this.f531b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) q.this.d.getParent()).invalidate();
        }
    }

    public r(View view) {
        this.f526a = new WeakReference<>(view);
    }

    public r a(float f) {
        View view = this.f526a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.f526a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public r c(long j) {
        View view = this.f526a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public r d(s sVar) {
        View view = this.f526a.get();
        if (view != null) {
            e(view, sVar);
        }
        return this;
    }

    public final void e(View view, s sVar) {
        if (sVar != null) {
            view.animate().setListener(new a(this, sVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public r f(u uVar) {
        View view = this.f526a.get();
        if (view != null) {
            b bVar = null;
            if (uVar != null) {
                bVar = new b(this, uVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public r g(float f) {
        View view = this.f526a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
