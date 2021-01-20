package a.b.g;

import a.b.d.a.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import no.cybertalent.liberatortoolkit.R;

public class g extends CheckBox {

    /* renamed from: b  reason: collision with root package name */
    public final i f159b;

    /* renamed from: c  reason: collision with root package name */
    public final e f160c;
    public final y d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        u0.a(context);
        s0.a(this, getContext());
        i iVar = new i(this);
        this.f159b = iVar;
        iVar.b(attributeSet, R.attr.checkboxStyle);
        e eVar = new e(this);
        this.f160c = eVar;
        eVar.d(attributeSet, R.attr.checkboxStyle);
        y yVar = new y(this);
        this.d = yVar;
        yVar.e(attributeSet, R.attr.checkboxStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f160c;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.d;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f159b;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f160c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f160c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f159b;
        if (iVar != null) {
            return iVar.f168b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f159b;
        if (iVar != null) {
            return iVar.f169c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f160c;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f160c;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.a(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f159b;
        if (iVar == null) {
            return;
        }
        if (iVar.f) {
            iVar.f = false;
            return;
        }
        iVar.f = true;
        iVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f160c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f160c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f159b;
        if (iVar != null) {
            iVar.f168b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f159b;
        if (iVar != null) {
            iVar.f169c = mode;
            iVar.e = true;
            iVar.a();
        }
    }
}
