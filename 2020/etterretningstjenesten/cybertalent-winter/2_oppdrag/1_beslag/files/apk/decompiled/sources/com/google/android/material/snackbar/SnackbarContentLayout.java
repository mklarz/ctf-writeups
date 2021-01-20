package com.google.android.material.snackbar;

import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b;
import b.b.a.a.m.g;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class SnackbarContentLayout extends LinearLayout implements g {

    /* renamed from: b  reason: collision with root package name */
    public TextView f1136b;

    /* renamed from: c  reason: collision with root package name */
    public Button f1137c;
    public int d;
    public int e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.g);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1136b.getPaddingTop() == i2 && this.f1136b.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f1136b;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1137c;
    }

    public TextView getMessageView() {
        return this.f1136b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1136b = (TextView) findViewById(R.id.snackbar_text);
        this.f1137c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (a(0, r0, r0) != false) goto L_0x0062;
     */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.d > 0 && getMeasuredWidth() > (i3 = this.d)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.f1136b.getLayout().getLineCount() > 1;
        if (!z2 || this.e <= 0 || this.f1137c.getMeasuredWidth() <= this.e) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        z = true;
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}
