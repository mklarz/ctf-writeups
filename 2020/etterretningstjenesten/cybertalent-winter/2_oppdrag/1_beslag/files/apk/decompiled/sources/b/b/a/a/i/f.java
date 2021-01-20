package b.b.a.a.i;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import b.b.a.a.l.a;
import b.b.a.a.l.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class f extends e {
    public InsetDrawable C;

    public f(b.b.a.a.j.f fVar, b bVar) {
        super(fVar, bVar);
    }

    @Override // b.b.a.a.i.e
    public float c() {
        return this.o.getElevation();
    }

    @Override // b.b.a.a.i.e
    public void d(Rect rect) {
        b bVar = this.p;
        if (FloatingActionButton.this.k) {
            FloatingActionButton.this.getSizeDimension();
            float elevation = this.o.getElevation() + this.k;
            int i = a.d;
            int ceil = (int) Math.ceil((double) elevation);
            int ceil2 = (int) Math.ceil((double) (elevation * 1.5f));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // b.b.a.a.i.e
    public void f() {
    }

    @Override // b.b.a.a.i.e
    public void g() {
        o();
        throw null;
    }

    @Override // b.b.a.a.i.e
    public void h(int[] iArr) {
    }

    @Override // b.b.a.a.i.e
    public void i(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(e.w, p(f, f3));
        stateListAnimator.addState(e.x, p(f, f2));
        stateListAnimator.addState(e.y, p(f, f2));
        stateListAnimator.addState(e.z, p(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.o, "elevation", f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(e.v);
        stateListAnimator.addState(e.A, animatorSet);
        stateListAnimator.addState(e.B, p(0.0f, 0.0f));
        this.o.setStateListAnimator(stateListAnimator);
        if (FloatingActionButton.this.k) {
            o();
            throw null;
        }
    }

    @Override // b.b.a.a.i.e
    public void j(Rect rect) {
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        if (floatingActionButton.k) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            this.C = insetDrawable;
            f.super.setBackgroundDrawable(insetDrawable);
            return;
        }
        f.super.setBackgroundDrawable(null);
    }

    @Override // b.b.a.a.i.e
    public boolean k() {
        return false;
    }

    @Override // b.b.a.a.i.e
    public void m(ColorStateList colorStateList) {
    }

    public final Animator p(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(e.v);
        return animatorSet;
    }
}
