package a.o.b;

import a.h.j.w.d;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

public class v extends a.h.j.a {
    public final RecyclerView d;
    public final a.h.j.a e = new a(this);

    public static class a extends a.h.j.a {
        public final v d;

        public a(v vVar) {
            this.d = vVar;
        }

        @Override // a.h.j.a
        public void b(View view, d dVar) {
            this.f501a.onInitializeAccessibilityNodeInfo(view, dVar.f545a);
            if (!this.d.d() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().f0(view, dVar);
            }
        }

        @Override // a.h.j.a
        public boolean c(View view, int i, Bundle bundle) {
            if (super.c(view, i, bundle)) {
                return true;
            }
            if (this.d.d() || this.d.d.getLayoutManager() == null) {
                return false;
            }
            RecyclerView.l layoutManager = this.d.d.getLayoutManager();
            RecyclerView.r rVar = layoutManager.f945b.f934c;
            return layoutManager.x0();
        }
    }

    public v(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // a.h.j.a
    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f501a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !d()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().d0(accessibilityEvent);
            }
        }
    }

    @Override // a.h.j.a
    public void b(View view, d dVar) {
        this.f501a.onInitializeAccessibilityNodeInfo(view, dVar.f545a);
        dVar.f545a.setClassName(RecyclerView.class.getName());
        if (!d() && this.d.getLayoutManager() != null) {
            RecyclerView.l layoutManager = this.d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f945b;
            RecyclerView.r rVar = recyclerView.f934c;
            RecyclerView.v vVar = recyclerView.e0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f945b.canScrollHorizontally(-1)) {
                dVar.f545a.addAction(8192);
                dVar.f545a.setScrollable(true);
            }
            if (layoutManager.f945b.canScrollVertically(1) || layoutManager.f945b.canScrollHorizontally(1)) {
                dVar.f545a.addAction(4096);
                dVar.f545a.setScrollable(true);
            }
            dVar.f545a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.N(rVar, vVar), layoutManager.A(rVar, vVar), layoutManager.R(), layoutManager.O()));
        }
    }

    @Override // a.h.j.a
    public boolean c(View view, int i, Bundle bundle) {
        if (super.c(view, i, bundle)) {
            return true;
        }
        if (d() || this.d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = this.d.getLayoutManager();
        RecyclerView.r rVar = layoutManager.f945b.f934c;
        return layoutManager.w0(i);
    }

    public boolean d() {
        return this.d.N();
    }
}
