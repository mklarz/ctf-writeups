package b.b.a.a.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.b.a.a.i.e;

public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.d f1040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f1041c;

    public c(e eVar, boolean z, e.d dVar) {
        this.f1041c = eVar;
        this.f1039a = z;
        this.f1040b = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.f1041c;
        eVar.f1043a = 0;
        eVar.f1044b = null;
        e.d dVar = this.f1040b;
        if (dVar != null) {
            a aVar = (a) dVar;
            throw null;
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f1041c.o.b(0, this.f1039a);
        e eVar = this.f1041c;
        eVar.f1043a = 2;
        eVar.f1044b = animator;
    }
}
