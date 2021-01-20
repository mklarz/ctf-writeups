package a.o.b;

import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class m extends RecyclerView.k implements RecyclerView.o {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.p C;

    /* renamed from: a  reason: collision with root package name */
    public final int f700a;

    /* renamed from: b  reason: collision with root package name */
    public final int f701b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f702c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q = 0;
    public int r = 0;
    public RecyclerView s;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];
    public final ValueAnimator z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            m mVar = m.this;
            int i = mVar.A;
            if (i == 1) {
                mVar.z.cancel();
            } else if (i != 2) {
                return;
            }
            mVar.A = 3;
            ValueAnimator valueAnimator = mVar.z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            mVar.z.setDuration((long) 500);
            mVar.z.start();
        }
    }

    public class b extends RecyclerView.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void a(RecyclerView recyclerView, int i, int i2) {
            m mVar = m.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = mVar.s.computeVerticalScrollRange();
            int i3 = mVar.r;
            mVar.t = computeVerticalScrollRange - i3 > 0 && i3 >= mVar.f700a;
            int computeHorizontalScrollRange = mVar.s.computeHorizontalScrollRange();
            int i4 = mVar.q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= mVar.f700a;
            mVar.u = z;
            boolean z2 = mVar.t;
            if (z2 || z) {
                if (z2) {
                    float f = (float) i3;
                    mVar.l = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    mVar.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (mVar.u) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    mVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    mVar.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = mVar.v;
                if (i5 == 0 || i5 == 1) {
                    mVar.k(1);
                }
            } else if (mVar.v != 0) {
                mVar.k(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f705a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f705a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f705a) {
                this.f705a = false;
            } else if (((Float) m.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.k(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f702c.setAlpha(floatValue);
            m.this.d.setAlpha(floatValue);
            m.this.s.invalidate();
        }
    }

    public m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f702c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i2, drawable.getIntrinsicWidth());
        this.i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f700a = i3;
        this.f701b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.l lVar = recyclerView2.m;
                if (lVar != null) {
                    lVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.o.remove(this);
                if (recyclerView2.o.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z2);
                }
                recyclerView2.Q();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.s;
                recyclerView3.p.remove(this);
                if (recyclerView3.q == this) {
                    recyclerView3.q = null;
                }
                List<RecyclerView.p> list = this.s.g0;
                if (list != null) {
                    list.remove(bVar);
                }
                g();
            }
            this.s = recyclerView;
            recyclerView.h(this);
            this.s.p.add(this);
            RecyclerView recyclerView4 = this.s;
            if (recyclerView4.g0 == null) {
                recyclerView4.g0 = new ArrayList();
            }
            recyclerView4.g0.add(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 == 1) {
            boolean i3 = i(motionEvent.getX(), motionEvent.getY());
            boolean h2 = h(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (i3 || h2)) {
                if (h2) {
                    this.w = 1;
                    this.p = (float) ((int) motionEvent.getX());
                } else if (i3) {
                    this.w = 2;
                    this.m = (float) ((int) motionEvent.getY());
                }
                k(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean i2 = i(motionEvent.getX(), motionEvent.getY());
                boolean h2 = h(motionEvent.getX(), motionEvent.getY());
                if (i2 || h2) {
                    if (h2) {
                        this.w = 1;
                        this.p = (float) ((int) motionEvent.getX());
                    } else if (i2) {
                        this.w = 2;
                        this.m = (float) ((int) motionEvent.getY());
                    }
                    k(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.m = 0.0f;
                this.p = 0.0f;
                k(1);
                this.w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                l();
                if (this.w == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.y;
                    int i3 = this.f701b;
                    iArr[0] = i3;
                    iArr[1] = this.q - i3;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.o) - max) >= 2.0f) {
                        int j2 = j(this.p, max, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                        if (j2 != 0) {
                            this.s.scrollBy(j2, 0);
                        }
                        this.p = max;
                    }
                }
                if (this.w == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.x;
                    int i4 = this.f701b;
                    iArr2[0] = i4;
                    iArr2[1] = this.r - i4;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.l) - max2) >= 2.0f) {
                        int j3 = j(this.m, max2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                        if (j3 != 0) {
                            this.s.scrollBy(0, j3);
                        }
                        this.m = max2;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void f(Canvas canvas, RecyclerView recyclerView, RecyclerView.v vVar) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            k(0);
        } else if (this.A != 0) {
            if (this.t) {
                int i2 = this.q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.l;
                int i6 = this.k;
                int i7 = i5 - (i6 / 2);
                this.f702c.setBounds(0, 0, i3, i6);
                this.d.setBounds(0, 0, this.f, this.r);
                RecyclerView recyclerView2 = this.s;
                WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
                boolean z2 = true;
                if (recyclerView2.getLayoutDirection() != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.d.draw(canvas);
                    canvas.translate((float) this.e, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f702c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i4 = this.e;
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.d.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.f702c.draw(canvas);
                }
                canvas.translate((float) (-i4), (float) (-i7));
            }
            if (this.u) {
                int i8 = this.r;
                int i9 = this.i;
                int i10 = i8 - i9;
                int i11 = this.o;
                int i12 = this.n;
                int i13 = i11 - (i12 / 2);
                this.g.setBounds(0, 0, i12, i9);
                this.h.setBounds(0, 0, this.q, this.j);
                canvas.translate(0.0f, (float) i10);
                this.h.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.g.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    public final void g() {
        this.s.removeCallbacks(this.B);
    }

    public boolean h(float f2, float f3) {
        if (f3 >= ((float) (this.r - this.i))) {
            int i2 = this.o;
            int i3 = this.n;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) ((i3 / 2) + i2));
        }
    }

    public boolean i(float f2, float f3) {
        RecyclerView recyclerView = this.s;
        WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f2 > ((float) (this.e / 2))) {
                return false;
            }
        } else if (f2 < ((float) (this.q - this.e))) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final int j(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void k(int i2) {
        int i3;
        if (i2 == 2 && this.v != 2) {
            this.f702c.setState(D);
            g();
        }
        if (i2 == 0) {
            this.s.invalidate();
        } else {
            l();
        }
        if (this.v != 2 || i2 == 2) {
            if (i2 == 1) {
                i3 = 1500;
            }
            this.v = i2;
        }
        this.f702c.setState(E);
        i3 = 1200;
        g();
        this.s.postDelayed(this.B, (long) i3);
        this.v = i2;
    }

    public void l() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0);
        this.z.start();
    }
}
