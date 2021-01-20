package a.h.j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f514b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f515c;
    public final Runnable d;

    public l(View view, Runnable runnable) {
        this.f514b = view;
        this.f515c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static l a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        l lVar = new l(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(lVar);
        view.addOnAttachStateChangeListener(lVar);
        return lVar;
    }

    public void b() {
        (this.f515c.isAlive() ? this.f515c : this.f514b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f514b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f515c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
