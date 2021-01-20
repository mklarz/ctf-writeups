package b.b.a.a.i;

import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import b.b.a.a.c.g;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

public class e {
    public static final int[] A = {16842910};
    public static final int[] B = new int[0];
    public static final TimeInterpolator v = b.b.a.a.c.a.f994b;
    public static final int[] w = {16842919, 16842910};
    public static final int[] x = {16843623, 16842908, 16842910};
    public static final int[] y = {16842908, 16842910};
    public static final int[] z = {16843623, 16842910};

    /* renamed from: a  reason: collision with root package name */
    public int f1043a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Animator f1044b;

    /* renamed from: c  reason: collision with root package name */
    public g f1045c;
    public g d;
    public g e;
    public g f;
    public final b.b.a.a.j.d g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l = 1.0f;
    public ArrayList<Animator.AnimatorListener> m;
    public ArrayList<Animator.AnimatorListener> n;
    public final b.b.a.a.j.f o;
    public final b.b.a.a.l.b p;
    public final Rect q = new Rect();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final Matrix t = new Matrix();
    public ViewTreeObserver.OnPreDrawListener u;

    public class a extends f {
        public a(e eVar) {
            super(null);
        }
    }

    public class b extends f {
        public b() {
            super(null);
        }
    }

    public class c extends f {
        public c() {
            super(null);
        }
    }

    public interface d {
    }

    /* renamed from: b.b.a.a.i.e$e  reason: collision with other inner class name */
    public class C0029e extends f {
        public C0029e() {
            super(null);
        }
    }

    public abstract class f extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public f(b bVar) {
        }

        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(e.this);
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Objects.requireNonNull(e.this);
            throw null;
        }
    }

    public e(b.b.a.a.j.f fVar, b.b.a.a.l.b bVar) {
        this.o = fVar;
        this.p = bVar;
        b.b.a.a.j.d dVar = new b.b.a.a.j.d();
        this.g = dVar;
        dVar.a(w, b(new c()));
        dVar.a(x, b(new b()));
        dVar.a(y, b(new b()));
        dVar.a(z, b(new b()));
        dVar.a(A, b(new C0029e()));
        dVar.a(B, b(new a(this)));
        this.h = fVar.getRotation();
    }

    public final AnimatorSet a(g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.o, View.ALPHA, f2);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.o, View.SCALE_X, f3);
        gVar.c("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.o, View.SCALE_Y, f3);
        gVar.c("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        this.t.reset();
        this.o.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.o, new b.b.a.a.c.e(), new b.b.a.a.c.f(), new Matrix(this.t));
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b.b.a.a.a.g(animatorSet, arrayList);
        return animatorSet;
    }

    public final ValueAnimator b(f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(v);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float c() {
        throw null;
    }

    public void d(Rect rect) {
        throw null;
    }

    public boolean e() {
        return this.o.getVisibility() != 0 ? this.f1043a == 2 : this.f1043a != 1;
    }

    public void f() {
        throw null;
    }

    public void g() {
        throw null;
    }

    public void h(int[] iArr) {
        throw null;
    }

    public void i(float f2, float f3, float f4) {
        throw null;
    }

    public void j(Rect rect) {
        throw null;
    }

    public boolean k() {
        throw null;
    }

    public final void l(float f2) {
        this.l = f2;
        Matrix matrix = this.t;
        matrix.reset();
        this.o.getDrawable();
        this.o.setImageMatrix(matrix);
    }

    public void m(ColorStateList colorStateList) {
        throw null;
    }

    public final boolean n() {
        b.b.a.a.j.f fVar = this.o;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        return fVar.isLaidOut() && !this.o.isInEditMode();
    }

    public final void o() {
        Rect rect = this.q;
        d(rect);
        j(rect);
        b.b.a.a.l.b bVar = this.p;
        int i2 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
