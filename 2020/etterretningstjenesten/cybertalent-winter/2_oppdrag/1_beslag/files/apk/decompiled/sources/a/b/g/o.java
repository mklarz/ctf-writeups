package a.b.g;

import a.b.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import no.cybertalent.liberatortoolkit.R;

public class o extends MultiAutoCompleteTextView {
    public static final int[] d = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f199b;

    /* renamed from: c  reason: collision with root package name */
    public final y f200c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        u0.a(context);
        s0.a(this, getContext());
        x0 o = x0.o(getContext(), attributeSet, d, R.attr.autoCompleteTextViewStyle, 0);
        if (o.m(0)) {
            setDropDownBackgroundDrawable(o.e(0));
        }
        o.f240b.recycle();
        e eVar = new e(this);
        this.f199b = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        y yVar = new y(this);
        this.f200c = yVar;
        yVar.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        yVar.b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f199b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f200c;
        if (yVar != null) {
            yVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f199b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f199b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f199b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f199b;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b.d.a.a.a(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f199b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f199b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f200c;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }
}
