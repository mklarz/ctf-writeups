package a.h.j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f509a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f510b;

    /* renamed from: c  reason: collision with root package name */
    public final View f511c;
    public boolean d;
    public int[] e;

    public g(View view) {
        this.f511c = view;
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return f3.onNestedFling(this.f511c, f, f2, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f, float f2) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return f3.onNestedPreFling(this.f511c, f, f2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent f;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (f = f(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f511c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f511c;
            if (f instanceof h) {
                ((h) f).n(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                try {
                    f.onNestedPreScroll(view, i, i2, iArr3);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e2);
                }
            }
            if (iArr2 != null) {
                this.f511c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public boolean d(int i, int i2, int i3, int i4, int[] iArr) {
        return e(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (f = f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f511c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f511c;
        if (f instanceof i) {
            ((i) f).k(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (f instanceof h) {
                ((h) f).l(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    f.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.f511c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i == 0) {
            return this.f509a;
        }
        if (i != 1) {
            return null;
        }
        return this.f510b;
    }

    public boolean g(int i) {
        return f(i) != null;
    }

    public boolean h(int i, int i2) {
        boolean z;
        if (f(i2) != null) {
            return true;
        }
        if (this.d) {
            View view = this.f511c;
            for (ViewParent parent = this.f511c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f511c;
                boolean z2 = parent instanceof h;
                if (z2) {
                    z = ((h) parent).o(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f509a = parent;
                    } else if (i2 == 1) {
                        this.f510b = parent;
                    }
                    View view3 = this.f511c;
                    if (z2) {
                        ((h) parent).i(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void i(int i) {
        ViewParent f = f(i);
        if (f != null) {
            View view = this.f511c;
            if (f instanceof h) {
                ((h) f).m(view, i);
            } else if (i == 0) {
                try {
                    f.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f509a = null;
            } else if (i == 1) {
                this.f510b = null;
            }
        }
    }
}
