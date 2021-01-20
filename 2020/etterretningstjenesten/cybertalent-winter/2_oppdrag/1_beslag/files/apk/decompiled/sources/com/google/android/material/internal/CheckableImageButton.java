package com.google.android.material.internal;

import a.b.g.l;
import a.h.j.m;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import b.b.a.a.j.a;
import no.cybertalent.liberatortoolkit.R;

public class CheckableImageButton extends l implements Checkable {
    public static final int[] e = {16842912};
    public boolean d;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        m.g(this, new a(this));
    }

    public boolean isChecked() {
        return this.d;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = e;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void setChecked(boolean z) {
        if (this.d != z) {
            this.d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.d);
    }
}
