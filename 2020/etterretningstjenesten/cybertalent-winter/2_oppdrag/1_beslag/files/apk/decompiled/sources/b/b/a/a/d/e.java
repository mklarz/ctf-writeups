package b.b.a.a.d;

import a.h.j.m;
import a.h.j.r;
import android.view.View;
import java.util.WeakHashMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f1017a;

    /* renamed from: b  reason: collision with root package name */
    public int f1018b;

    /* renamed from: c  reason: collision with root package name */
    public int f1019c;
    public int d;
    public int e;

    public e(View view) {
        this.f1017a = view;
    }

    public final void a() {
        View view = this.f1017a;
        int top = this.d - (view.getTop() - this.f1018b);
        WeakHashMap<View, r> weakHashMap = m.f516a;
        view.offsetTopAndBottom(top);
        View view2 = this.f1017a;
        view2.offsetLeftAndRight(this.e - (view2.getLeft() - this.f1019c));
    }
}
