package a.f.c;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

public abstract class l extends c {
    public boolean h;
    public boolean i;

    @Override // a.f.c.c
    public void e(AttributeSet attributeSet) {
        super.e(null);
    }

    public void k() {
    }

    @Override // a.f.c.c
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.h || this.i) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f380c; i2++) {
                View d = constraintLayout.d(this.f379b[i2]);
                if (d != null) {
                    if (this.h) {
                        d.setVisibility(visibility);
                    }
                    if (this.i && elevation > 0.0f) {
                        d.setTranslationZ(d.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        c();
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}
