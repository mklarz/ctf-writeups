package a.o.b;

import a.o.b.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class t implements b.AbstractC0021b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f723a;

    public t(RecyclerView recyclerView) {
        this.f723a = recyclerView;
    }

    public View a(int i) {
        return this.f723a.getChildAt(i);
    }

    public int b() {
        return this.f723a.getChildCount();
    }

    public void c(int i) {
        View childAt = this.f723a.getChildAt(i);
        if (childAt != null) {
            this.f723a.p(childAt);
            childAt.clearAnimation();
        }
        this.f723a.removeViewAt(i);
    }
}
