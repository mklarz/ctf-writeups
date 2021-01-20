package a.q;

import a.h.b.d;
import a.q.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class z extends h {
    public static final String[] y = {"android:visibility:visibility", "android:visibility:parent"};
    public int x = 3;

    public static class a extends AnimatorListenerAdapter implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f791a;

        /* renamed from: b  reason: collision with root package name */
        public final int f792b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f793c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public a(View view, int i, boolean z) {
            this.f791a = view;
            this.f792b = i;
            this.f793c = (ViewGroup) view.getParent();
            this.d = z;
            f(true);
        }

        @Override // a.q.h.d
        public void a(h hVar) {
        }

        @Override // a.q.h.d
        public void b(h hVar) {
            e();
            hVar.v(this);
        }

        @Override // a.q.h.d
        public void c(h hVar) {
            f(false);
        }

        @Override // a.q.h.d
        public void d(h hVar) {
            f(true);
        }

        public final void e() {
            if (!this.f) {
                t.d(this.f791a, this.f792b);
                ViewGroup viewGroup = this.f793c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void f(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.f793c) != null) {
                this.e = z;
                d.x(viewGroup, z);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            e();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                t.d(this.f791a, this.f792b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                t.d(this.f791a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f794a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f795b;

        /* renamed from: c  reason: collision with root package name */
        public int f796c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public final void H(p pVar) {
        pVar.f776a.put("android:visibility:visibility", Integer.valueOf(pVar.f777b.getVisibility()));
        pVar.f776a.put("android:visibility:parent", pVar.f777b.getParent());
        int[] iArr = new int[2];
        pVar.f777b.getLocationOnScreen(iArr);
        pVar.f776a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f796c == 0) goto L_0x0093;
     */
    public final b I(p pVar, p pVar2) {
        b bVar = new b();
        bVar.f794a = false;
        bVar.f795b = false;
        if (pVar == null || !pVar.f776a.containsKey("android:visibility:visibility")) {
            bVar.f796c = -1;
            bVar.e = null;
        } else {
            bVar.f796c = ((Integer) pVar.f776a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) pVar.f776a.get("android:visibility:parent");
        }
        if (pVar2 == null || !pVar2.f776a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) pVar2.f776a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) pVar2.f776a.get("android:visibility:parent");
        }
        if (pVar != null && pVar2 != null) {
            int i = bVar.f796c;
            int i2 = bVar.d;
            if (i == i2 && bVar.e == bVar.f) {
                return bVar;
            }
            if (i != i2) {
                if (i != 0) {
                }
                bVar.f795b = false;
                bVar.f794a = true;
                return bVar;
            }
            if (bVar.f != null) {
            }
            bVar.f795b = false;
            bVar.f794a = true;
            return bVar;
        } else if (!(pVar == null && bVar.d == 0)) {
            if (pVar2 == null) {
            }
            return bVar;
        }
        bVar.f795b = true;
        bVar.f794a = true;
        return bVar;
    }

    public abstract Animator J(ViewGroup viewGroup, View view, p pVar, p pVar2);

    @Override // a.q.h
    public void d(p pVar) {
        H(pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    @Override // a.q.h
    public Animator k(ViewGroup viewGroup, p pVar, p pVar2) {
        View view;
        int id;
        Float f;
        b I = I(pVar, pVar2);
        Animator animator = null;
        if (I.f794a && !(I.e == null && I.f == null)) {
            if (!I.f795b) {
                int i = I.d;
                if ((this.x & 2) == 2) {
                    View view2 = pVar != null ? pVar.f777b : null;
                    View view3 = pVar2 != null ? pVar2.f777b : null;
                    if (view3 == null || view3.getParent() == null) {
                        if (view3 != null) {
                            view2 = view3;
                        } else {
                            if (view2 != null) {
                                if (view2.getParent() != null) {
                                    if (view2.getParent() instanceof View) {
                                        view = (View) view2.getParent();
                                        if (I(q(view, true), n(view, true)).f794a) {
                                            if (view.getParent() == null && (id = view.getId()) != -1) {
                                                viewGroup.findViewById(id);
                                            }
                                            view2 = null;
                                        }
                                    }
                                }
                            }
                            view2 = null;
                            view3 = null;
                            if (view2 == null && pVar != null) {
                                int[] iArr = (int[]) pVar.f776a.get("android:visibility:screenLocation");
                                int i2 = iArr[0];
                                int i3 = iArr[1];
                                int[] iArr2 = new int[2];
                                viewGroup.getLocationOnScreen(iArr2);
                                view2.offsetLeftAndRight((i2 - iArr2[0]) - view2.getLeft());
                                view2.offsetTopAndBottom((i3 - iArr2[1]) - view2.getTop());
                                r rVar = new r(viewGroup);
                                rVar.f782a.add(view2);
                                animator = J(viewGroup, view2, pVar, pVar2);
                                if (animator == null) {
                                    rVar.f782a.remove(view2);
                                } else {
                                    animator.addListener(new y(this, rVar, view2));
                                }
                            } else if (view3 != null) {
                                int visibility = view3.getVisibility();
                                t.d(view3, 0);
                                animator = J(viewGroup, view3, pVar, pVar2);
                                if (animator != null) {
                                    a aVar = new a(view3, i, true);
                                    animator.addListener(aVar);
                                    animator.addPauseListener(aVar);
                                    a(aVar);
                                } else {
                                    t.d(view3, visibility);
                                }
                            }
                        }
                        view3 = null;
                        if (view2 == null) {
                        }
                        if (view3 != null) {
                        }
                    } else if (i == 4 || view2 == view3) {
                        view2 = null;
                        if (view2 == null) {
                        }
                        if (view3 != null) {
                        }
                    } else {
                        view = (View) view2.getParent();
                    }
                    view2 = o.a(viewGroup, view2, view);
                    view3 = null;
                    if (view2 == null) {
                    }
                    if (view3 != null) {
                    }
                }
            } else if ((this.x & 1) != 1 || pVar2 == null) {
                return null;
            } else {
                if (pVar == null) {
                    View view4 = (View) pVar2.f777b.getParent();
                    if (I(n(view4, false), q(view4, false)).f794a) {
                        return null;
                    }
                }
                View view5 = pVar2.f777b;
                c cVar = (c) this;
                float f2 = 0.0f;
                float floatValue = (pVar == null || (f = (Float) pVar.f776a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
                if (floatValue != 1.0f) {
                    f2 = floatValue;
                }
                return cVar.K(view5, f2, 1.0f);
            }
        }
        return animator;
    }

    @Override // a.q.h
    public String[] p() {
        return y;
    }

    @Override // a.q.h
    public boolean r(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar != null && pVar2 != null && pVar2.f776a.containsKey("android:visibility:visibility") != pVar.f776a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b I = I(pVar, pVar2);
        if (I.f794a) {
            return I.f796c == 0 || I.d == 0;
        }
        return false;
    }
}
