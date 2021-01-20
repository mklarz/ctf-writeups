package b.b.a.a.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.b.a.a.i.e;
import b.b.a.a.j.f;

public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1037b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.d f1038c;
    public final /* synthetic */ e d;

    public b(e eVar, boolean z, e.d dVar) {
        this.d = eVar;
        this.f1037b = z;
        this.f1038c = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1036a = true;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.d;
        eVar.f1043a = 0;
        eVar.f1044b = null;
        if (!this.f1036a) {
            f fVar = eVar.o;
            boolean z = this.f1037b;
            fVar.b(z ? 8 : 4, z);
            e.d dVar = this.f1038c;
            if (dVar != null) {
                a aVar = (a) dVar;
                throw null;
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.d.o.b(0, this.f1037b);
        e eVar = this.d;
        eVar.f1043a = 1;
        eVar.f1044b = animator;
        this.f1036a = false;
    }
}
