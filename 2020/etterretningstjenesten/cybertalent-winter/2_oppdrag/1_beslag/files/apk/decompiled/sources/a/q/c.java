package a.q;

import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

public class c extends z {

    public class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f747a;

        public a(c cVar, View view) {
            this.f747a = view;
        }

        @Override // a.q.h.d
        public void b(h hVar) {
            t.c(this.f747a, 1.0f);
            hVar.v(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f748a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f749b = false;

        public b(View view) {
            this.f748a = view;
        }

        public void onAnimationEnd(Animator animator) {
            t.c(this.f748a, 1.0f);
            if (this.f749b) {
                this.f748a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f748a;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (view.hasOverlappingRendering() && this.f748a.getLayerType() == 0) {
                this.f749b = true;
                this.f748a.setLayerType(2, null);
            }
        }
    }

    public c(int i) {
        if ((i & -4) == 0) {
            this.x = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.q.z
    public Animator J(ViewGroup viewGroup, View view, p pVar, p pVar2) {
        Float f;
        x xVar = t.f783a;
        return K(view, (pVar == null || (f = (Float) pVar.f776a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
    }

    public final Animator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        t.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.d, f2);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // a.q.h
    public void g(p pVar) {
        H(pVar);
        pVar.f776a.put("android:fade:transitionAlpha", Float.valueOf(t.a(pVar.f777b)));
    }
}
