package b.b.a.a.d;

import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import java.util.WeakHashMap;

public abstract class b<V extends View> extends d<V> {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f1011c;
    public OverScroller d;
    public boolean e;
    public int f = -1;
    public int g;
    public int h = -1;
    public VelocityTracker i;

    /* JADX WARN: Field signature parse error: c */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final CoordinatorLayout f1012b;

        /* renamed from: c  reason: collision with root package name */
        public final View f1013c;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f1012b = coordinatorLayout;
            this.f1013c = v;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: b.b.a.a.d.b */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f1013c != null && (overScroller = b.this.d) != null) {
                if (overScroller.computeScrollOffset()) {
                    b bVar = b.this;
                    bVar.G(this.f1012b, this.f1013c, bVar.d.getCurrY());
                    View view = this.f1013c;
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    view.postOnAnimation(this);
                    return;
                }
                b bVar2 = b.this;
                CoordinatorLayout coordinatorLayout = this.f1012b;
                View view2 = this.f1013c;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) bVar2;
                Objects.requireNonNull(baseBehavior);
                baseBehavior.N(coordinatorLayout, (AppBarLayout) view2);
            }
        }
    }

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract boolean D(V v);

    public abstract int E();

    public final int F(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return H(coordinatorLayout, v, E() - i2, i3, i4);
    }

    public int G(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return H(coordinatorLayout, v, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int H(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x008a;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.f;
                    if (!(i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.g) > this.h) {
                            this.e = true;
                            this.g = y;
                        }
                    }
                }
            }
            this.e = false;
            this.f = -1;
            VelocityTracker velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.i = null;
            }
        } else {
            this.e = false;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (D(v) && coordinatorLayout.p(v, x, y2)) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
            }
        }
        VelocityTracker velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 != 3) goto L_0x010a;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i2;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.i.computeCurrentVelocity(1000);
                    float yVelocity = this.i.getYVelocity(this.f);
                    AppBarLayout appBarLayout = (AppBarLayout) v;
                    int i3 = -appBarLayout.getTotalScrollRange();
                    Runnable runnable = this.f1011c;
                    if (runnable != null) {
                        v.removeCallbacks(runnable);
                        this.f1011c = null;
                    }
                    if (this.d == null) {
                        this.d = new OverScroller(v.getContext());
                    }
                    this.d.fling(0, A(), 0, Math.round(yVelocity), 0, 0, i3, 0);
                    if (this.d.computeScrollOffset()) {
                        a aVar = new a(coordinatorLayout, v);
                        this.f1011c = aVar;
                        WeakHashMap<View, r> weakHashMap = m.f516a;
                        v.postOnAnimation(aVar);
                    } else {
                        ((AppBarLayout.BaseBehavior) this).N(coordinatorLayout, appBarLayout);
                    }
                }
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                int i4 = this.g - y;
                if (!this.e && Math.abs(i4) > (i2 = this.h)) {
                    this.e = true;
                    i4 = i4 > 0 ? i4 - i2 : i4 + i2;
                }
                if (this.e) {
                    this.g = y;
                    F(coordinatorLayout, v, i4, -((AppBarLayout) v).getDownNestedScrollRange(), 0);
                }
            }
            this.e = false;
            this.f = -1;
            VelocityTracker velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.i = null;
            }
        } else {
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.p(v, (int) motionEvent.getX(), y2) || !D(v)) {
                return false;
            }
            this.g = y2;
            this.f = motionEvent.getPointerId(0);
            if (this.i == null) {
                this.i = VelocityTracker.obtain();
            }
        }
        VelocityTracker velocityTracker3 = this.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }
}
