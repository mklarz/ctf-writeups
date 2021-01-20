package a.b.g;

import a.h.k.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import no.cybertalent.liberatortoolkit.R;

public class f0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f155b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public int f156c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g;
    public Field h;
    public a i;
    public boolean j;
    public boolean k;
    public boolean l;
    public c m;
    public b n;

    public static class a extends a.b.e.a.a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f157c = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        @Override // a.b.e.a.a
        public void draw(Canvas canvas) {
            if (this.f157c) {
                this.f56b.draw(canvas);
            }
        }

        @Override // a.b.e.a.a
        public void setHotspot(float f, float f2) {
            if (this.f157c) {
                this.f56b.setHotspot(f, f2);
            }
        }

        @Override // a.b.e.a.a
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f157c) {
                this.f56b.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // a.b.e.a.a
        public boolean setState(int[] iArr) {
            if (this.f157c) {
                return this.f56b.setState(iArr);
            }
            return false;
        }

        @Override // a.b.e.a.a
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f157c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            f0 f0Var = f0.this;
            f0Var.n = null;
            f0Var.drawableStateChanged();
        }
    }

    public f0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.f157c = z;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i5 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i5;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    public boolean b(MotionEvent motionEvent, int i2) {
        boolean z;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                z = true;
                z2 = false;
                if (!z || z2) {
                    this.l = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt = getChildAt(this.g - getFirstVisiblePosition());
                    if (childAt != null) {
                        childAt.setPressed(false);
                    }
                }
                if (!z) {
                    if (this.m == null) {
                        this.m = new c(this);
                    }
                    c cVar = this.m;
                    boolean z3 = cVar.q;
                    cVar.q = true;
                    cVar.onTouch(this, motionEvent);
                } else {
                    c cVar2 = this.m;
                    if (cVar2 != null) {
                        if (cVar2.q) {
                            cVar2.d();
                        }
                        cVar2.q = false;
                    }
                }
                return z;
            }
            z = false;
            z2 = false;
            this.l = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.g - getFirstVisiblePosition());
            if (childAt != null) {
            }
            if (!z) {
            }
            return z;
        } else {
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = (float) x;
                float f3 = (float) y;
                this.l = true;
                drawableHotspotChanged(f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.g;
                if (!(i3 == -1 || (childAt2 = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt2 == childAt3 || !childAt2.isPressed())) {
                    childAt2.setPressed(false);
                }
                this.g = pointToPosition;
                childAt3.drawableHotspotChanged(f2 - ((float) childAt3.getLeft()), f3 - ((float) childAt3.getTop()));
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || pointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f155b;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f156c;
                rect.top -= this.d;
                rect.right += this.e;
                rect.bottom += this.f;
                try {
                    boolean z5 = this.h.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        this.h.set(this, Boolean.valueOf(!z5));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (z4) {
                    Rect rect2 = this.f155b;
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (!(selector2 == null || pointToPosition == -1)) {
                    selector2.setHotspot(f2, f3);
                }
                setSelectorEnabled(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = false;
                z = true;
            }
            this.l = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.g - getFirstVisiblePosition());
            if (childAt != null) {
            }
            if (!z) {
            }
            return z;
        }
        z = false;
        z2 = false;
        this.l = false;
        setPressed(false);
        drawableStateChanged();
        childAt = getChildAt(this.g - getFirstVisiblePosition());
        if (childAt != null) {
        }
        if (!z) {
        }
        return z;
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f155b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f155b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.k && this.j) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            b bVar = new b();
            this.n = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.n;
        if (bVar != null) {
            f0 f0Var = f0.this;
            f0Var.n = null;
            f0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f156c = rect.left;
        this.d = rect.top;
        this.e = rect.right;
        this.f = rect.bottom;
    }
}
