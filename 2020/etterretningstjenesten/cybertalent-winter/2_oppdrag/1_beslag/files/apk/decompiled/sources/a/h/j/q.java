package a.h.j;

import a.h.j.m;
import android.view.View;

public class q extends m.b<Boolean> {
    public q(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.h.j.m.b
    public Boolean a(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }
}
