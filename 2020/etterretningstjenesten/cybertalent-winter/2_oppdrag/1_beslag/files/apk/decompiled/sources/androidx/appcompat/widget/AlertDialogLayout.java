package androidx.appcompat.widget;

import a.b.g.i0;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class AlertDialogLayout extends i0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int q(View view) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return q(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    @Override // a.b.g.i0
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & 8388615;
        int paddingTop = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                i0.a aVar = (i0.a) childAt.getLayoutParams();
                int i11 = aVar.f173b;
                if (i11 < 0) {
                    i11 = i9;
                }
                WeakHashMap<View, r> weakHashMap = m.f516a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                } else if (absoluteGravity != 5) {
                    i5 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    if (n(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    childAt.layout(i5, i12, measuredWidth + i5, measuredHeight2 + i12);
                    paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i12;
                } else {
                    i6 = paddingRight - measuredWidth;
                }
                i5 = i6 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                if (n(i10)) {
                }
                int i122 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                childAt.layout(i5, i122, measuredWidth + i5, measuredHeight2 + i122);
                paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i122;
            }
        }
    }

    @Override // a.b.g.i0
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        int i7 = 0;
        while (true) {
            if (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i7++;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i, 0);
                    paddingBottom += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i, 0);
                    i5 = q(view2);
                    i4 = view2.getMeasuredHeight() - i5;
                    paddingBottom += i5;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    i6 = view3.getMeasuredHeight();
                    paddingBottom += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i8 = size - paddingBottom;
                if (view2 != null) {
                    int i9 = paddingBottom - i5;
                    int min = Math.min(i8, i4);
                    if (min > 0) {
                        i8 -= min;
                        i5 += min;
                    }
                    view2.measure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    paddingBottom = i9 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i8 > 0) {
                    view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
                    paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2.getVisibility() != 8) {
                        i10 = Math.max(i10, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt3 = getChildAt(i12);
                        if (childAt3.getVisibility() != 8) {
                            i0.a aVar = (i0.a) childAt3.getLayoutParams();
                            if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                                int i13 = ((ViewGroup.MarginLayoutParams) aVar).height;
                                ((ViewGroup.MarginLayoutParams) aVar).height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                ((ViewGroup.MarginLayoutParams) aVar).height = i13;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
