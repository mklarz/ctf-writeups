package a.b.g;

import a.b.b;
import a.b.d.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f192a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f193b;

    public m(ImageView imageView) {
        this.f192a = imageView;
    }

    public void a() {
        v0 v0Var;
        Drawable drawable = this.f192a.getDrawable();
        if (drawable != null) {
            int[] iArr = e0.f151a;
        }
        if (drawable != null && (v0Var = this.f193b) != null) {
            j.f(drawable, v0Var, this.f192a.getDrawableState());
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        int j;
        Context context = this.f192a.getContext();
        int[] iArr = b.f;
        x0 o = x0.o(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f192a;
        a.h.j.m.f(imageView, imageView.getContext(), iArr, attributeSet, o.f240b, i, 0);
        try {
            Drawable drawable = this.f192a.getDrawable();
            if (!(drawable != null || (j = o.j(1, -1)) == -1 || (drawable = a.a(this.f192a.getContext(), j)) == null)) {
                this.f192a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = e0.f151a;
            }
            if (o.m(2)) {
                this.f192a.setImageTintList(o.b(2));
            }
            if (o.m(3)) {
                this.f192a.setImageTintMode(e0.b(o.h(3, -1), null));
            }
            o.f240b.recycle();
        } catch (Throwable th) {
            o.f240b.recycle();
            throw th;
        }
    }

    public void c(int i) {
        if (i != 0) {
            Drawable a2 = a.a(this.f192a.getContext(), i);
            if (a2 != null) {
                int[] iArr = e0.f151a;
            }
            this.f192a.setImageDrawable(a2);
        } else {
            this.f192a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f193b == null) {
            this.f193b = new v0();
        }
        v0 v0Var = this.f193b;
        v0Var.f222a = colorStateList;
        v0Var.d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f193b == null) {
            this.f193b = new v0();
        }
        v0 v0Var = this.f193b;
        v0Var.f223b = mode;
        v0Var.f224c = true;
        a();
    }
}
