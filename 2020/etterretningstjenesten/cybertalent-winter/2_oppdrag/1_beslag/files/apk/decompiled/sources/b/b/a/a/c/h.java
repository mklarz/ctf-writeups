package b.b.a.a.c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public long f1005a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f1006b = 300;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f1007c = null;
    public int d = 0;
    public int e = 1;

    public h(long j, long j2) {
        this.f1005a = j;
        this.f1006b = j2;
    }

    public h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1005a = j;
        this.f1006b = j2;
        this.f1007c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f1005a);
        animator.setDuration(this.f1006b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f1007c;
        return timeInterpolator != null ? timeInterpolator : a.f993a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1005a == hVar.f1005a && this.f1006b == hVar.f1006b && this.d == hVar.d && this.e == hVar.e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f1005a;
        long j2 = this.f1006b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1005a + " duration: " + this.f1006b + " interpolator: " + b().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }
}
