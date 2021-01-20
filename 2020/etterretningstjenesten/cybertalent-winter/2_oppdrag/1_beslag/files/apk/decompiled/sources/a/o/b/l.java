package a.o.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class l extends RecyclerView.k {
    public static final int[] d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public Drawable f697a;

    /* renamed from: b  reason: collision with root package name */
    public int f698b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f699c = new Rect();

    public l(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f697a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f698b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.v vVar) {
        Drawable drawable = this.f697a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f698b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.v vVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null && this.f697a != null) {
            int i5 = 0;
            if (this.f698b == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.K(childAt, this.f699c);
                    int round = Math.round(childAt.getTranslationY()) + this.f699c.bottom;
                    this.f697a.setBounds(i3, round - this.f697a.getIntrinsicHeight(), i4, round);
                    this.f697a.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                RecyclerView.l layoutManager = recyclerView.getLayoutManager();
                Rect rect = this.f699c;
                Objects.requireNonNull(layoutManager);
                RecyclerView.K(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX()) + this.f699c.right;
                this.f697a.setBounds(round2 - this.f697a.getIntrinsicWidth(), i, round2, i2);
                this.f697a.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }
}
