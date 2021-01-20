package b.b.a.a.d;

import a.h.b.d;
import a.h.j.m;
import a.h.j.r;
import a.h.j.v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

public abstract class c extends d<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1014c = new Rect();
    public final Rect d = new Rect();
    public int e = 0;
    public int f;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // b.b.a.a.d.d
    public void B(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout E = ((AppBarLayout.ScrollingViewBehavior) this).E(coordinatorLayout.d(view));
        if (E != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f1014c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, E.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((E.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            v lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.d;
            int i3 = fVar.f890c;
            if (i3 == 0) {
                i3 = 8388659;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int D = D(E);
            view.layout(rect2.left, rect2.top - D, rect2.right, rect2.bottom - D);
            i2 = rect2.top - E.getBottom();
        } else {
            coordinatorLayout.r(view, i);
            i2 = 0;
        }
        this.e = i2;
    }

    public final int D(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f888a;
            int E = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).E() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + E > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (((float) E) / ((float) i));
            }
        }
        int i2 = this.f;
        return d.e((int) (f2 * ((float) i2)), 0, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout E;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (E = ((AppBarLayout.ScrollingViewBehavior) this).E(coordinatorLayout.d(view))) == null) {
            return false;
        }
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (E.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
            if (view.getFitsSystemWindows()) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.s(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - E.getMeasuredHeight()) + E.getTotalScrollRange(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
