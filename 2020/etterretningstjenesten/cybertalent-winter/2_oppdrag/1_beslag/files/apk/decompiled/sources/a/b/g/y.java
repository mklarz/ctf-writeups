package a.b.g;

import a.b.b;
import a.h.b.d;
import a.h.c.b.e;
import a.h.j.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f242a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f243b;

    /* renamed from: c  reason: collision with root package name */
    public v0 f244c;
    public v0 d;
    public v0 e;
    public v0 f;
    public v0 g;
    public v0 h;
    public final a0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f245a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f246b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f247c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f245a = i;
            this.f246b = i2;
            this.f247c = weakReference;
        }

        @Override // a.h.c.b.e
        public void c(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f245a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f246b & 2) != 0);
            }
            y yVar = y.this;
            WeakReference weakReference = this.f247c;
            if (yVar.m) {
                yVar.l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, yVar.j);
                }
            }
        }
    }

    public y(TextView textView) {
        this.f242a = textView;
        this.i = new a0(textView);
    }

    public static v0 c(Context context, j jVar, int i2) {
        ColorStateList d2 = jVar.d(context, i2);
        if (d2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.d = true;
        v0Var.f222a = d2;
        return v0Var;
    }

    public final void a(Drawable drawable, v0 v0Var) {
        if (drawable != null && v0Var != null) {
            j.f(drawable, v0Var, this.f242a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.f243b == null && this.f244c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.f242a.getCompoundDrawables();
            a(compoundDrawables[0], this.f243b);
            a(compoundDrawables[1], this.f244c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.f242a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public boolean d() {
        a0 a0Var = this.i;
        return a0Var.i() && a0Var.f135a != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x037f, code lost:
        if (r4 != null) goto L_0x0386;
     */
    @SuppressLint({"NewApi"})
    public void e(AttributeSet attributeSet, int i2) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        int[] iArr = b.i;
        int[] iArr2 = b.w;
        Context context = this.f242a.getContext();
        j a2 = j.a();
        int[] iArr3 = b.h;
        int i7 = 0;
        x0 o = x0.o(context, attributeSet, iArr3, i2, 0);
        TextView textView = this.f242a;
        m.f(textView, textView.getContext(), iArr3, attributeSet, o.f240b, i2, 0);
        int j2 = o.j(0, -1);
        if (o.m(3)) {
            this.f243b = c(context, a2, o.j(3, 0));
        }
        if (o.m(1)) {
            this.f244c = c(context, a2, o.j(1, 0));
        }
        if (o.m(4)) {
            this.d = c(context, a2, o.j(4, 0));
        }
        if (o.m(2)) {
            this.e = c(context, a2, o.j(2, 0));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (o.m(5)) {
            this.f = c(context, a2, o.j(5, 0));
        }
        if (o.m(6)) {
            this.g = c(context, a2, o.j(6, 0));
        }
        o.f240b.recycle();
        boolean z3 = this.f242a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (j2 != -1) {
            x0 x0Var = new x0(context, context.obtainStyledAttributes(j2, iArr2));
            if (z3 || !x0Var.m(14)) {
                z2 = false;
                z = false;
            } else {
                z2 = x0Var.a(14, false);
                z = true;
            }
            l(context, x0Var);
            if (x0Var.m(15)) {
                str2 = x0Var.k(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = x0Var.m(i6) ? x0Var.k(i6) : null;
            x0Var.f240b.recycle();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        x0 x0Var2 = new x0(context, context.obtainStyledAttributes(attributeSet, iArr2, i2, 0));
        if (z3 || !x0Var2.m(14)) {
            i3 = 15;
        } else {
            z2 = x0Var2.a(14, false);
            i3 = 15;
            z = true;
        }
        if (x0Var2.m(i3)) {
            str2 = x0Var2.k(i3);
        }
        if (x0Var2.m(13)) {
            str = x0Var2.k(13);
        }
        if (i8 >= 28 && x0Var2.m(0) && x0Var2.d(0, -1) == 0) {
            this.f242a.setTextSize(0, 0.0f);
        }
        l(context, x0Var2);
        x0Var2.f240b.recycle();
        if (!z3 && z) {
            this.f242a.setAllCaps(z2);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f242a.setTypeface(typeface, this.j);
            } else {
                this.f242a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f242a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            this.f242a.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        a0 a0Var = this.i;
        TypedArray obtainStyledAttributes = a0Var.j.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TextView textView2 = a0Var.i;
        m.f(textView2, textView2.getContext(), iArr, attributeSet, obtainStyledAttributes, i2, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            a0Var.f135a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (!obtainStyledAttributes.hasValue(3) || (resourceId2 = obtainStyledAttributes.getResourceId(3, 0)) <= 0) {
            i4 = -1;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                while (true) {
                    i4 = -1;
                    if (i7 >= length) {
                        break;
                    }
                    iArr4[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                    i7++;
                }
                a0Var.f = a0Var.b(iArr4);
                a0Var.h();
            } else {
                i4 = -1;
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!a0Var.i()) {
            a0Var.f135a = 0;
        } else if (a0Var.f135a == 1) {
            if (!a0Var.g) {
                DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a0Var.j(dimension2, dimension3, dimension);
            }
            a0Var.g();
        }
        if (a.h.k.b.f557a) {
            a0 a0Var2 = this.i;
            if (a0Var2.f135a != 0) {
                int[] iArr5 = a0Var2.f;
                if (iArr5.length > 0) {
                    if (((float) this.f242a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f242a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.i.d), Math.round(this.i.e), Math.round(this.i.f137c), 0);
                    } else {
                        this.f242a.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                    }
                }
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId3 = obtainStyledAttributes2.getResourceId(8, i4);
        Drawable b2 = resourceId3 != i4 ? a2.b(context, resourceId3) : null;
        int resourceId4 = obtainStyledAttributes2.getResourceId(13, i4);
        Drawable b3 = resourceId4 != i4 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes2.getResourceId(9, i4);
        Drawable b4 = resourceId5 != i4 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes2.getResourceId(6, i4);
        Drawable b5 = resourceId6 != i4 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes2.getResourceId(10, i4);
        Drawable b6 = resourceId7 != i4 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes2.getResourceId(7, i4);
        Drawable b7 = resourceId8 != i4 ? a2.b(context, resourceId8) : null;
        if (b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative = this.f242a.getCompoundDrawablesRelative();
            TextView textView3 = this.f242a;
            if (b6 == null) {
                b6 = compoundDrawablesRelative[0];
            }
            if (b3 == null) {
                b3 = compoundDrawablesRelative[1];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[2];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(b6, b3, b7, b5);
        } else if (!(b2 == null && b3 == null && b4 == null && b5 == null)) {
            Drawable[] compoundDrawablesRelative2 = this.f242a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f242a.getCompoundDrawables();
                TextView textView4 = this.f242a;
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[2];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b5);
            } else {
                TextView textView5 = this.f242a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (b3 == null) {
                    b3 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b3, drawable2, b5);
            }
        }
        if (obtainStyledAttributes2.hasValue(11)) {
            if (obtainStyledAttributes2.hasValue(11) && (resourceId = obtainStyledAttributes2.getResourceId(11, 0)) != 0) {
                ThreadLocal<TypedValue> threadLocal = a.b.d.a.a.f53a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes2.getColorStateList(11);
            TextView textView6 = this.f242a;
            Objects.requireNonNull(textView6);
            textView6.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes2.hasValue(12)) {
            PorterDuff.Mode b8 = e0.b(obtainStyledAttributes2.getInt(12, i4), null);
            TextView textView7 = this.f242a;
            Objects.requireNonNull(textView7);
            textView7.setCompoundDrawableTintMode(b8);
        }
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(14, i4);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(17, i4);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(18, i4);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != i4) {
            d.t(this.f242a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i4) {
            d.u(this.f242a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i4) {
            d.v(this.f242a, dimensionPixelSize3);
        }
    }

    public void f(Context context, int i2) {
        String k2;
        x0 x0Var = new x0(context, context.obtainStyledAttributes(i2, b.w));
        if (x0Var.m(14)) {
            this.f242a.setAllCaps(x0Var.a(14, false));
        }
        if (x0Var.m(0) && x0Var.d(0, -1) == 0) {
            this.f242a.setTextSize(0, 0.0f);
        }
        l(context, x0Var);
        if (x0Var.m(13) && (k2 = x0Var.k(13)) != null) {
            this.f242a.setFontVariationSettings(k2);
        }
        x0Var.f240b.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f242a.setTypeface(typeface, this.j);
        }
    }

    public void g(int i2, int i3, int i4, int i5) {
        a0 a0Var = this.i;
        if (a0Var.i()) {
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void h(int[] iArr, int i2) {
        a0 a0Var = this.i;
        if (a0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                a0Var.f = a0Var.b(iArr2);
                if (!a0Var.h()) {
                    StringBuilder d2 = b.a.a.a.a.d("None of the preset sizes is valid: ");
                    d2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(d2.toString());
                }
            } else {
                a0Var.g = false;
            }
            if (a0Var.g()) {
                a0Var.a();
            }
        }
    }

    public void i(int i2) {
        a0 a0Var = this.i;
        if (!a0Var.i()) {
            return;
        }
        if (i2 == 0) {
            a0Var.f135a = 0;
            a0Var.d = -1.0f;
            a0Var.e = -1.0f;
            a0Var.f137c = -1.0f;
            a0Var.f = new int[0];
            a0Var.f136b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (a0Var.g()) {
                a0Var.a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    public void j(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.f222a = colorStateList;
        v0Var.d = colorStateList != null;
        this.f243b = v0Var;
        this.f244c = v0Var;
        this.d = v0Var;
        this.e = v0Var;
        this.f = v0Var;
        this.g = v0Var;
    }

    public void k(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.f223b = mode;
        v0Var.f224c = mode != null;
        this.f243b = v0Var;
        this.f244c = v0Var;
        this.d = v0Var;
        this.e = v0Var;
        this.f = v0Var;
        this.g = v0Var;
    }

    public final void l(Context context, x0 x0Var) {
        String k2;
        Typeface typeface;
        Typeface typeface2;
        int i2 = Build.VERSION.SDK_INT;
        this.j = x0Var.h(2, this.j);
        boolean z = false;
        if (i2 >= 28) {
            int h2 = x0Var.h(11, -1);
            this.k = h2;
            if (h2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i3 = 10;
        if (x0Var.m(10) || x0Var.m(12)) {
            this.l = null;
            if (x0Var.m(12)) {
                i3 = 12;
            }
            int i4 = this.k;
            int i5 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface g2 = x0Var.g(i3, this.j, new a(i4, i5, new WeakReference(this.f242a)));
                    if (g2 != null) {
                        if (i2 >= 28 && this.k != -1) {
                            g2 = Typeface.create(Typeface.create(g2, 0), this.k, (this.j & 2) != 0);
                        }
                        this.l = g2;
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (k2 = x0Var.k(i3)) != null) {
                if (i2 < 28 || this.k == -1) {
                    typeface = Typeface.create(k2, this.j);
                } else {
                    Typeface create = Typeface.create(k2, 0);
                    int i6 = this.k;
                    if ((this.j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i6, z);
                }
                this.l = typeface;
            }
        } else if (x0Var.m(1)) {
            this.m = false;
            int h3 = x0Var.h(1, 1);
            if (h3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (h3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (h3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.l = typeface2;
        }
    }
}
