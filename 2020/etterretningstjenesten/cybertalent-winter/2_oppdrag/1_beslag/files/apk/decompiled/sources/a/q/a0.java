package a.q;

import android.view.View;
import android.view.WindowId;

public class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f740a;

    public a0(View view) {
        this.f740a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).f740a.equals(this.f740a);
    }

    public int hashCode() {
        return this.f740a.hashCode();
    }
}
