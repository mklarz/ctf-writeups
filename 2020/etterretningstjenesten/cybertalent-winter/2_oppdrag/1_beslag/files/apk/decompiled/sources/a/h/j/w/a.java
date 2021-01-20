package a.h.j.w;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f541a;

    /* renamed from: b  reason: collision with root package name */
    public final d f542b;

    /* renamed from: c  reason: collision with root package name */
    public final int f543c;

    public a(int i, d dVar, int i2) {
        this.f541a = i;
        this.f542b = dVar;
        this.f543c = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f541a);
        d dVar = this.f542b;
        dVar.f545a.performAction(this.f543c, bundle);
    }
}
