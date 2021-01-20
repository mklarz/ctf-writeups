package b.b.a.a.j;

import a.h.j.w.d;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

public class a extends a.h.j.a {
    public final /* synthetic */ CheckableImageButton d;

    public a(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // a.h.j.a
    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f501a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    @Override // a.h.j.a
    public void b(View view, d dVar) {
        this.f501a.onInitializeAccessibilityNodeInfo(view, dVar.f545a);
        dVar.f545a.setCheckable(true);
        dVar.f545a.setChecked(this.d.isChecked());
    }
}
