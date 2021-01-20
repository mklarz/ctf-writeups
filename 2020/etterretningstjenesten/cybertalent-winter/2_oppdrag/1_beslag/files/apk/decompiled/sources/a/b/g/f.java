package a.b.g;

import a.h.b.d;
import a.h.k.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class f extends Button implements b {

    /* renamed from: b  reason: collision with root package name */
    public final e f153b;

    /* renamed from: c  reason: collision with root package name */
    public final y f154c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u0.a(context);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f153b = eVar;
        eVar.d(attributeSet, i);
        y yVar = new y(this);
        this.f154c = yVar;
        yVar.e(attributeSet, i);
        yVar.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f153b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f154c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f557a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f154c;
        if (yVar != null) {
            return Math.round(yVar.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f557a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f154c;
        if (yVar != null) {
            return Math.round(yVar.i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f557a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f154c;
        if (yVar != null) {
            return Math.round(yVar.i.f137c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f557a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f154c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f557a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f154c;
        if (yVar != null) {
            return yVar.i.f135a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f153b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f153b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.f154c.h;
        if (v0Var != null) {
            return v0Var.f222a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f154c.h;
        if (v0Var != null) {
            return v0Var.f223b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f154c;
        if (yVar != null && !b.f557a) {
            yVar.i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f154c;
        if (yVar != null && !b.f557a && yVar.d()) {
            this.f154c.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f557a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f154c;
        if (yVar != null) {
            yVar.g(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f557a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f154c;
        if (yVar != null) {
            yVar.h(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f557a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f154c;
        if (yVar != null) {
            yVar.i(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f153b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f153b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d.z(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f154c;
        if (yVar != null) {
            yVar.f242a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f153b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f153b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f154c.j(colorStateList);
        this.f154c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f154c.k(mode);
        this.f154c.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f154c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z = b.f557a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f154c;
        if (yVar != null && !z && !yVar.d()) {
            yVar.i.f(i, f);
        }
    }
}
