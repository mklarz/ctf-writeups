package a.b.g;

import a.b.a;
import a.h.b.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class h extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f161c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    public final y f162b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        u0.a(context);
        s0.a(this, getContext());
        y yVar = new y(this);
        this.f162b = yVar;
        yVar.e(attributeSet, 16843720);
        yVar.b();
        x0 o = x0.o(getContext(), attributeSet, f161c, 16843720, 0);
        setCheckMarkDrawable(o.e(0));
        o.f240b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f162b;
        if (yVar != null) {
            yVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b.d.a.a.a(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d.z(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f162b;
        if (yVar != null) {
            yVar.f(context, i);
        }
    }
}
