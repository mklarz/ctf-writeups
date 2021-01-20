package a.b.g;

import a.h.b.d;
import a.h.d.c;
import a.h.d.i;
import a.h.h.a;
import a.h.k.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class z extends TextView implements b {

    /* renamed from: b  reason: collision with root package name */
    public final e f250b;

    /* renamed from: c  reason: collision with root package name */
    public final y f251c;
    public final x d;
    public Future<a> e;

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u0.a(context);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f250b = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f251c = yVar;
        yVar.e(attributeSet, i);
        yVar.b();
        this.d = new x(this);
    }

    public final void c() {
        Future<a> future = this.e;
        if (future != null) {
            try {
                this.e = null;
                a aVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    Objects.requireNonNull(aVar);
                    setText((CharSequence) null);
                    return;
                }
                d.o(this);
                Objects.requireNonNull(aVar);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f250b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f557a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f251c;
        if (yVar != null) {
            return Math.round(yVar.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f557a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f251c;
        if (yVar != null) {
            return Math.round(yVar.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f557a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f251c;
        if (yVar != null) {
            return Math.round(yVar.i.f137c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f557a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f251c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f557a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f251c;
        if (yVar != null) {
            return yVar.i.f135a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f250b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f250b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.f251c.h;
        if (v0Var != null) {
            return v0Var.f222a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f251c.h;
        if (v0Var != null) {
            return v0Var.f223b;
        }
        return null;
    }

    public CharSequence getText() {
        c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.d) == null) ? super.getTextClassifier() : xVar.a();
    }

    public a.C0012a getTextMetricsParamsCompat() {
        return d.o(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f251c;
        if (yVar != null && !b.f557a) {
            yVar.i.a();
        }
    }

    public void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f251c;
        if (yVar != null && !b.f557a && yVar.d()) {
            this.f251c.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f557a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.g(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f557a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.h(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f557a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.i(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f250b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f250b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a2 = i != 0 ? a.b.d.a.a.a(context, i) : null;
        Drawable a3 = i2 != 0 ? a.b.d.a.a.a(context, i2) : null;
        Drawable a4 = i3 != 0 ? a.b.d.a.a.a(context, i3) : null;
        if (i4 != 0) {
            drawable = a.b.d.a.a.a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a2, a3, a4, drawable);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a2 = i != 0 ? a.b.d.a.a.a(context, i) : null;
        Drawable a3 = i2 != 0 ? a.b.d.a.a.a(context, i2) : null;
        Drawable a4 = i3 != 0 ? a.b.d.a.a.a(context, i3) : null;
        if (i4 != 0) {
            drawable = a.b.d.a.a.a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(a2, a3, a4, drawable);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d.z(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            d.t(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            d.u(this, i);
        }
    }

    public void setLineHeight(int i) {
        d.v(this, i);
    }

    public void setPrecomputedText(a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(aVar);
            setText((CharSequence) null);
            return;
        }
        d.o(this);
        Objects.requireNonNull(aVar);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f250b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f250b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f251c.j(colorStateList);
        this.f251c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f251c.k(mode);
        this.f251c.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f238b = textClassifier;
        }
    }

    public void setTextFuture(Future<a> future) {
        this.e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0012a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f493b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f492a);
        setBreakStrategy(aVar.f494c);
        setHyphenationFrequency(aVar.d);
    }

    public void setTextSize(int i, float f) {
        boolean z = b.f557a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f251c;
        if (yVar != null && !z && !yVar.d()) {
            yVar.i.f(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            i iVar = c.f457a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f251c;
        if (yVar != null) {
            yVar.b();
        }
    }
}
