package a.b.g;

import a.b.b;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f148a;

    /* renamed from: b  reason: collision with root package name */
    public final j f149b;

    /* renamed from: c  reason: collision with root package name */
    public int f150c = -1;
    public v0 d;
    public v0 e;
    public v0 f;

    public e(View view) {
        this.f148a = view;
        this.f149b = j.a();
    }

    public void a() {
        Drawable background = this.f148a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new v0();
                }
                v0 v0Var = this.f;
                v0Var.f222a = null;
                v0Var.d = false;
                v0Var.f223b = null;
                v0Var.f224c = false;
                View view = this.f148a;
                WeakHashMap<View, r> weakHashMap = m.f516a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    v0Var.d = true;
                    v0Var.f222a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.f148a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    v0Var.f224c = true;
                    v0Var.f223b = backgroundTintMode;
                }
                if (v0Var.d || v0Var.f224c) {
                    j.f(background, v0Var, this.f148a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.e;
            if (v0Var2 != null) {
                j.f(background, v0Var2, this.f148a.getDrawableState());
                return;
            }
            v0 v0Var3 = this.d;
            if (v0Var3 != null) {
                j.f(background, v0Var3, this.f148a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f222a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f223b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        Context context = this.f148a.getContext();
        int[] iArr = b.z;
        x0 o = x0.o(context, attributeSet, iArr, i, 0);
        View view = this.f148a;
        m.f(view, view.getContext(), iArr, attributeSet, o.f240b, i, 0);
        try {
            if (o.m(0)) {
                this.f150c = o.j(0, -1);
                ColorStateList d2 = this.f149b.d(this.f148a.getContext(), this.f150c);
                if (d2 != null) {
                    g(d2);
                }
            }
            if (o.m(1)) {
                this.f148a.setBackgroundTintList(o.b(1));
            }
            if (o.m(2)) {
                this.f148a.setBackgroundTintMode(e0.b(o.h(2, -1), null));
            }
            o.f240b.recycle();
        } catch (Throwable th) {
            o.f240b.recycle();
            throw th;
        }
    }

    public void e() {
        this.f150c = -1;
        g(null);
        a();
    }

    public void f(int i) {
        this.f150c = i;
        j jVar = this.f149b;
        g(jVar != null ? jVar.d(this.f148a.getContext(), i) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new v0();
            }
            v0 v0Var = this.d;
            v0Var.f222a = colorStateList;
            v0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f222a = colorStateList;
        v0Var.d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f223b = mode;
        v0Var.f224c = true;
        a();
    }
}
