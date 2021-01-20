package a.h.j.w;

import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final b f544a;

    public c(b bVar) {
        this.f544a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f544a.equals(((c) obj).f544a);
    }

    public int hashCode() {
        return this.f544a.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z) {
        BaseTransientBottomBar.j.this.setClickableOrFocusableBasedOnAccessibility(z);
    }
}
