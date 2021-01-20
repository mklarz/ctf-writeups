package com.google.android.material.behavior;

import a.h.j.m;
import a.h.j.r;
import a.j.b.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.m.h;
import java.util.Objects;
import java.util.WeakHashMap;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public a.j.b.a f1101a;

    /* renamed from: b  reason: collision with root package name */
    public b f1102b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1103c;
    public int d = 2;
    public float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final a.c h = new a();

    public class a extends a.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1104a;

        /* renamed from: b  reason: collision with root package name */
        public int f1105b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            if (r5 != false) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r5 != false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
            r5 = r2.f1104a;
            r3 = r3.getWidth() + r5;
         */
        @Override // a.j.b.a.c
        public int a(View view, int i, int i2) {
            int i3;
            int i4;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            boolean z = view.getLayoutDirection() == 1;
            int i5 = SwipeDismissBehavior.this.d;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f1104a - view.getWidth();
                    i4 = view.getWidth() + this.f1104a;
                    return Math.min(Math.max(i3, i), i4);
                }
            }
            i3 = this.f1104a - view.getWidth();
            i4 = this.f1104a;
            return Math.min(Math.max(i3, i), i4);
        }

        @Override // a.j.b.a.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // a.j.b.a.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // a.j.b.a.c
        public void e(View view, int i) {
            this.f1105b = i;
            this.f1104a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.j.b.a.c
        public void f(int i) {
            b bVar = SwipeDismissBehavior.this.f1102b;
            if (bVar != null) {
                b.b.a.a.m.c cVar = (b.b.a.a.m.c) bVar;
                Objects.requireNonNull(cVar);
                if (i == 0) {
                    h.b().f(cVar.f1069a.g);
                } else if (i == 1 || i == 2) {
                    h.b().e(cVar.f1069a.g);
                }
            }
        }

        @Override // a.j.b.a.c
        public void g(View view, int i, int i2, int i3, int i4) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f) + ((float) this.f1104a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.g) + ((float) this.f1104a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.B(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f1104a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f1106c.e)) goto L_0x0054;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
        @Override // a.j.b.a.c
        public void h(View view, float f, float f2) {
            boolean z;
            int i;
            b bVar;
            this.f1105b = -1;
            int width = view.getWidth();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            boolean z2 = true;
            if (i2 != 0) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                boolean z3 = view.getLayoutDirection() == 1;
                int i3 = SwipeDismissBehavior.this.d;
                if (i3 != 2) {
                    if (i3 == 0) {
                        z = false;
                        if (z) {
                            int left = view.getLeft();
                            int i4 = this.f1104a;
                            i = left < i4 ? i4 - width : i4 + width;
                        } else {
                            i = this.f1104a;
                            z2 = false;
                        }
                        if (SwipeDismissBehavior.this.f1101a.t(i, view.getTop())) {
                            c cVar = new c(view, z2);
                            WeakHashMap<View, r> weakHashMap2 = m.f516a;
                            view.postOnAnimation(cVar);
                            return;
                        } else if (z2 && (bVar = SwipeDismissBehavior.this.f1102b) != null) {
                            view.setVisibility(8);
                            ((b.b.a.a.m.c) bVar).f1069a.c(0);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                        if (SwipeDismissBehavior.this.f1101a.t(i, view.getTop())) {
                        }
                    }
                }
            }
            z = true;
            if (z) {
            }
            if (SwipeDismissBehavior.this.f1101a.t(i, view.getTop())) {
            }
        }

        @Override // a.j.b.a.c
        public boolean i(View view, int i) {
            return this.f1105b == -1 && SwipeDismissBehavior.this.A(view);
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f1107b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1108c;

        public c(View view, boolean z) {
            this.f1107b = view;
            this.f1108c = z;
        }

        public void run() {
            b bVar;
            a.j.b.a aVar = SwipeDismissBehavior.this.f1101a;
            if (aVar != null && aVar.i(true)) {
                View view = this.f1107b;
                WeakHashMap<View, r> weakHashMap = m.f516a;
                view.postOnAnimation(this);
            } else if (this.f1108c && (bVar = SwipeDismissBehavior.this.f1102b) != null) {
                this.f1107b.setVisibility(8);
                ((b.b.a.a.m.c) bVar).f1069a.c(0);
            }
        }
    }

    public static float B(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public boolean A(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1103c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1103c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1103c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f1101a == null) {
            this.f1101a = new a.j.b.a(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return this.f1101a.u(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.j.b.a aVar = this.f1101a;
        if (aVar == null) {
            return false;
        }
        aVar.n(motionEvent);
        return true;
    }
}
