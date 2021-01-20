package a.h.j;

import a.h.j.m;
import android.view.View;

public class o extends m.b<CharSequence> {
    public o(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.h.j.m.b
    public CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
