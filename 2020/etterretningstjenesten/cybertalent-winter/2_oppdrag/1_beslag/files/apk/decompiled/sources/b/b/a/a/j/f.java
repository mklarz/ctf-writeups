package b.b.a.a.j;

import android.widget.ImageButton;

public class f extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public int f1060b;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f1060b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f1060b;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f1060b = i;
    }
}
