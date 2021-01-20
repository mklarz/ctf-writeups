package a.b.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import no.cybertalent.liberatortoolkit.R;

public class t extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    public final u f220b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        s0.a(this, getContext());
        u uVar = new u(this);
        this.f220b = uVar;
        uVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f220b;
        Drawable drawable = uVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(uVar.d.getDrawableState())) {
            uVar.d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f220b.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f220b.d(canvas);
    }
}
