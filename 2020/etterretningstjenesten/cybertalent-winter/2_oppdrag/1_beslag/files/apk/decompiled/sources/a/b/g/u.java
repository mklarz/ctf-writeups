package a.b.g;

import a.b.b;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;

public class u extends q {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f = null;
    public PorterDuff.Mode g = null;
    public boolean h = false;
    public boolean i = false;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    @Override // a.b.g.q
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.d.getContext();
        int[] iArr = b.g;
        x0 o = x0.o(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.d;
        m.f(seekBar, seekBar.getContext(), iArr, attributeSet, o.f240b, i2, 0);
        Drawable f2 = o.f(0);
        if (f2 != null) {
            this.d.setThumb(f2);
        }
        Drawable e2 = o.e(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = e2;
        if (e2 != null) {
            e2.setCallback(this.d);
            SeekBar seekBar2 = this.d;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            e2.setLayoutDirection(seekBar2.getLayoutDirection());
            if (e2.isStateful()) {
                e2.setState(this.d.getDrawableState());
            }
            c();
        }
        this.d.invalidate();
        if (o.m(3)) {
            this.g = e0.b(o.h(3, -1), this.g);
            this.i = true;
        }
        if (o.m(2)) {
            this.f = o.b(2);
            this.h = true;
        }
        o.f240b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable mutate = drawable.mutate();
            this.e = mutate;
            if (this.h) {
                mutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.d.getPaddingLeft(), (float) (this.d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
