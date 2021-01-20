package b.b.a.a.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public e f1015a;

    /* renamed from: b  reason: collision with root package name */
    public int f1016b = 0;

    public d() {
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int A() {
        e eVar = this.f1015a;
        if (eVar != null) {
            return eVar.d;
        }
        return 0;
    }

    public void B(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.r(v, i);
    }

    public boolean C(int i) {
        e eVar = this.f1015a;
        if (eVar == null) {
            this.f1016b = i;
            return false;
        } else if (eVar.d == i) {
            return false;
        } else {
            eVar.d = i;
            eVar.a();
            return true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, int i) {
        B(coordinatorLayout, v, i);
        if (this.f1015a == null) {
            this.f1015a = new e(v);
        }
        e eVar = this.f1015a;
        eVar.f1018b = eVar.f1017a.getTop();
        eVar.f1019c = eVar.f1017a.getLeft();
        eVar.a();
        int i2 = this.f1016b;
        if (i2 == 0) {
            return true;
        }
        e eVar2 = this.f1015a;
        if (eVar2.d != i2) {
            eVar2.d = i2;
            eVar2.a();
        }
        this.f1016b = 0;
        return true;
    }
}
