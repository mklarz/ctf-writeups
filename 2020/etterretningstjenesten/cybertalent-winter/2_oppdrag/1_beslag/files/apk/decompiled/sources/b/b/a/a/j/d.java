package b.b.a.a.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f1052a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f1053b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f1054c = null;
    public final Animator.AnimatorListener d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            if (dVar.f1054c == animator) {
                dVar.f1054c = null;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1056a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f1057b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f1056a = iArr;
            this.f1057b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f1052a.add(bVar);
    }
}
