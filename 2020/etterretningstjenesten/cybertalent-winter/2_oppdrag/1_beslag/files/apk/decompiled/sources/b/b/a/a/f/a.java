package b.b.a.a.f;

import a.b.g.f;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b.b.a.a.b;
import b.b.a.a.j.e;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class a extends f {
    public final c d;
    public int e;
    public PorterDuff.Mode f;
    public ColorStateList g;
    public Drawable h;
    public int i;
    public int j;
    public int k;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        Drawable drawable;
        int resourceId;
        int i2 = 0;
        TypedArray b2 = e.b(context, attributeSet, b.e, R.attr.materialButtonStyle, 2131689941, new int[0]);
        this.e = b2.getDimensionPixelSize(9, 0);
        this.f = b.b.a.a.a.f(b2.getInt(12, -1), PorterDuff.Mode.SRC_IN);
        this.g = b.b.a.a.a.d(getContext(), b2, 11);
        this.h = (!b2.hasValue(7) || (resourceId = b2.getResourceId(7, 0)) == 0 || (drawable = a.b.d.a.a.a(getContext(), resourceId)) == null) ? b2.getDrawable(7) : drawable;
        this.k = b2.getInteger(8, 1);
        this.i = b2.getDimensionPixelSize(10, 0);
        c cVar = new c(this);
        this.d = cVar;
        cVar.f1026b = b2.getDimensionPixelOffset(0, 0);
        cVar.f1027c = b2.getDimensionPixelOffset(1, 0);
        cVar.d = b2.getDimensionPixelOffset(2, 0);
        cVar.e = b2.getDimensionPixelOffset(3, 0);
        cVar.f = b2.getDimensionPixelSize(6, 0);
        cVar.g = b2.getDimensionPixelSize(15, 0);
        cVar.h = b.b.a.a.a.f(b2.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        cVar.i = b.b.a.a.a.d(cVar.f1025a.getContext(), b2, 4);
        cVar.j = b.b.a.a.a.d(cVar.f1025a.getContext(), b2, 14);
        cVar.k = b.b.a.a.a.d(cVar.f1025a.getContext(), b2, 13);
        cVar.l.setStyle(Paint.Style.STROKE);
        cVar.l.setStrokeWidth((float) cVar.g);
        Paint paint = cVar.l;
        ColorStateList colorStateList = cVar.j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(cVar.f1025a.getDrawableState(), 0) : i2);
        a aVar = cVar.f1025a;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int paddingStart = aVar.getPaddingStart();
        int paddingTop = cVar.f1025a.getPaddingTop();
        int paddingEnd = cVar.f1025a.getPaddingEnd();
        int paddingBottom = cVar.f1025a.getPaddingBottom();
        cVar.f1025a.setInternalBackground(cVar.a());
        cVar.f1025a.setPaddingRelative(paddingStart + cVar.f1026b, paddingTop + cVar.d, paddingEnd + cVar.f1027c, paddingBottom + cVar.e);
        b2.recycle();
        setCompoundDrawablePadding(this.e);
        b();
    }

    public final boolean a() {
        c cVar = this.d;
        return cVar != null && !cVar.r;
    }

    public final void b() {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.h = mutate;
            mutate.setTintList(this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                this.h.setTintMode(mode);
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.h.getIntrinsicWidth();
            }
            int i3 = this.i;
            if (i3 == 0) {
                i3 = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i4 = this.j;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        setCompoundDrawablesRelative(this.h, null, null, null);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.d.f;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.h;
    }

    public int getIconGravity() {
        return this.k;
    }

    public int getIconPadding() {
        return this.e;
    }

    public int getIconSize() {
        return this.i;
    }

    public ColorStateList getIconTint() {
        return this.g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.d.k;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.d.j;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.d.g;
        }
        return 0;
    }

    @Override // a.b.g.f
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.d.i;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // a.b.g.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.d.h;
        }
        return super.getSupportBackgroundTintMode();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // a.b.g.f
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.h != null && this.k == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i4 = this.i;
            if (i4 == 0) {
                i4 = this.h.getIntrinsicWidth();
            }
            int measuredWidth = getMeasuredWidth() - measureText;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            int paddingEnd = ((((measuredWidth - getPaddingEnd()) - i4) - this.e) - getPaddingStart()) / 2;
            boolean z = true;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                paddingEnd = -paddingEnd;
            }
            if (this.j != paddingEnd) {
                this.j = paddingEnd;
                b();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (a()) {
            GradientDrawable gradientDrawable = this.d.o;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    @Override // a.b.g.f
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                c cVar = this.d;
                cVar.r = true;
                cVar.f1025a.setSupportBackgroundTintList(cVar.i);
                cVar.f1025a.setSupportBackgroundTintMode(cVar.h);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // a.b.g.f
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? a.b.d.a.a.a(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i2) {
        if (a()) {
            c cVar = this.d;
            if (cVar.f != i2) {
                cVar.f = i2;
                GradientDrawable gradientDrawable = cVar.o;
                if (gradientDrawable != null && cVar.p != null && cVar.q != null) {
                    float f2 = ((float) i2) + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f2);
                    cVar.p.setCornerRadius(f2);
                    cVar.q.setCornerRadius(f2);
                }
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.h != drawable) {
            this.h = drawable;
            b();
        }
    }

    public void setIconGravity(int i2) {
        this.k = i2;
    }

    public void setIconPadding(int i2) {
        if (this.e != i2) {
            this.e = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? a.b.d.a.a.a(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.i != i2) {
            this.i = i2;
            b();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            b();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            b();
        }
    }

    public void setIconTintResource(int i2) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = a.b.d.a.a.f53a;
        setIconTint(context.getColorStateList(i2));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.d;
            if (cVar.k != colorStateList) {
                cVar.k = colorStateList;
                if (cVar.f1025a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) cVar.f1025a.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (a()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = a.b.d.a.a.f53a;
            setRippleColor(context.getColorStateList(i2));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.d;
            if (cVar.j != colorStateList) {
                cVar.j = colorStateList;
                Paint paint = cVar.l;
                int i2 = 0;
                if (colorStateList != null) {
                    i2 = colorStateList.getColorForState(cVar.f1025a.getDrawableState(), 0);
                }
                paint.setColor(i2);
                if (cVar.p != null) {
                    cVar.f1025a.setInternalBackground(cVar.a());
                }
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (a()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = a.b.d.a.a.f53a;
            setStrokeColor(context.getColorStateList(i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (a()) {
            c cVar = this.d;
            if (cVar.g != i2) {
                cVar.g = i2;
                cVar.l.setStrokeWidth((float) i2);
                if (cVar.p != null) {
                    cVar.f1025a.setInternalBackground(cVar.a());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // a.b.g.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.d;
            if (cVar.i != colorStateList) {
                cVar.i = colorStateList;
                cVar.b();
            }
        } else if (this.d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // a.b.g.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.d;
            if (cVar.h != mode) {
                cVar.h = mode;
                cVar.b();
            }
        } else if (this.d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
