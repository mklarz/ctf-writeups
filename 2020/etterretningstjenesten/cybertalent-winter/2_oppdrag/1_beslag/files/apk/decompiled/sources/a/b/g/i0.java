package a.b.g;

import a.b.b;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

public class i0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f170b;

    /* renamed from: c  reason: collision with root package name */
    public int f171c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public boolean i;
    public int[] j;
    public int[] k;
    public Drawable l;
    public int m;
    public int n;
    public int o;
    public int p;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f172a;

        /* renamed from: b  reason: collision with root package name */
        public int f173b;

        public a(int i, int i2) {
            super(i, i2);
            this.f173b = -1;
            this.f172a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f173b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.n);
            this.f172a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f173b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f173b = -1;
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int resourceId;
        this.f170b = true;
        this.f171c = -1;
        this.d = 0;
        this.f = 8388659;
        int[] iArr = b.m;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        m.f(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = obtainStyledAttributes.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.h = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f171c = obtainStyledAttributes.getInt(3, -1);
        this.i = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : a.b.d.a.a.a(context, resourceId));
        this.o = obtainStyledAttributes.getInt(8, 0);
        this.p = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i2) {
        this.l.setBounds(getPaddingLeft() + this.p, i2, (getWidth() - getPaddingRight()) - this.p, this.n + i2);
        this.l.draw(canvas);
    }

    public void g(Canvas canvas, int i2) {
        this.l.setBounds(i2, getPaddingTop() + this.p, this.m + i2, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        if (this.f171c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f171c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.d;
                if (this.e == 1 && (i2 = this.f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
                    }
                }
                return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f171c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f171c;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.f;
    }

    public int getOrientation() {
        return this.e;
    }

    public int getShowDividers() {
        return this.o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i2 = this.e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int k() {
        return 0;
    }

    public int l() {
        return 0;
    }

    public int m() {
        return 0;
    }

    public boolean n(int i2) {
        if (i2 == 0) {
            return (this.o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void o(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.l != null) {
            int i5 = 0;
            if (this.e == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !n(i5))) {
                        f(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.n);
                    }
                    i5++;
                }
                if (n(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.n : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b2 = b1.b(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !n(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    g(canvas, b2 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.m);
                }
                i5++;
            }
            if (n(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b2) {
                        i4 = childAt4.getLeft();
                        i3 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    } else {
                        i2 = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                        g(canvas, i2);
                    }
                } else if (b2) {
                    i2 = getPaddingLeft();
                    g(canvas, i2);
                } else {
                    i4 = getWidth();
                    i3 = getPaddingRight();
                }
                i2 = (i4 - i3) - this.m;
                g(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        int i19 = 5;
        if (this.e == 1) {
            int paddingLeft = getPaddingLeft();
            int i20 = i4 - i2;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            int paddingTop = i22 != 16 ? i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.g : getPaddingTop() + (((i5 - i3) - this.g) / 2);
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt == null) {
                    i15 = p() + paddingTop;
                } else if (childAt.getVisibility() != i18) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i25 = aVar.f173b;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    } else if (absoluteGravity != i19) {
                        i16 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        if (n(i24)) {
                            paddingTop += this.n;
                        }
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        int l2 = l() + i26;
                        childAt.layout(i16, l2, measuredWidth + i16, measuredHeight + l2);
                        i15 = m() + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i26;
                        i24 = k() + i24;
                    } else {
                        i17 = paddingRight - measuredWidth;
                    }
                    i16 = i17 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    if (n(i24)) {
                    }
                    int i262 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    int l22 = l() + i262;
                    childAt.layout(i16, l22, measuredWidth + i16, measuredHeight + l22);
                    i15 = m() + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i262;
                    i24 = k() + i24;
                } else {
                    i24++;
                    i18 = 8;
                    i19 = 5;
                }
                paddingTop = i15;
                i24++;
                i18 = 8;
                i19 = 5;
            }
            return;
        }
        boolean b2 = b1.b(this);
        int paddingTop2 = getPaddingTop();
        int i27 = i5 - i3;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z3 = this.f170b;
        int[] iArr = this.j;
        int[] iArr2 = this.k;
        WeakHashMap<View, r> weakHashMap2 = m.f516a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.g : getPaddingLeft() + (((i4 - i2) - this.g) / 2);
        if (b2) {
            i6 = virtualChildCount2 - 1;
            i8 = 0;
            i7 = -1;
        } else {
            i7 = 1;
            i8 = 0;
            i6 = 0;
        }
        while (i8 < virtualChildCount2) {
            int i31 = (i7 * i8) + i6;
            View childAt2 = getChildAt(i31);
            if (childAt2 == null) {
                paddingLeft2 = p() + paddingLeft2;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                a aVar2 = (a) childAt2.getLayoutParams();
                i9 = virtualChildCount2;
                if (z3) {
                    i10 = i30;
                    if (((ViewGroup.MarginLayoutParams) aVar2).height != -1) {
                        i11 = childAt2.getBaseline();
                        i12 = aVar2.f173b;
                        if (i12 < 0) {
                            i12 = i10;
                        }
                        i13 = i12 & 112;
                        z2 = z3;
                        if (i13 != 16) {
                            i14 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) aVar2).topMargin) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                        } else if (i13 == 48) {
                            i14 = ((ViewGroup.MarginLayoutParams) aVar2).topMargin + paddingTop2;
                            if (i11 != -1) {
                                i14 = (iArr[1] - i11) + i14;
                            }
                        } else if (i13 != 80) {
                            i14 = paddingTop2;
                        } else {
                            i14 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin;
                            if (i11 != -1) {
                                i14 -= iArr2[2] - (childAt2.getMeasuredHeight() - i11);
                            }
                        }
                        if (n(i31)) {
                            paddingLeft2 += this.m;
                        }
                        int i32 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                        int l3 = l() + i32;
                        childAt2.layout(l3, i14, measuredWidth2 + l3, measuredHeight2 + i14);
                        paddingLeft2 = i32 + m() + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                        i8 = k() + i8;
                        i8++;
                        virtualChildCount2 = i9;
                        i30 = i10;
                        z3 = z2;
                    }
                } else {
                    i10 = i30;
                }
                i11 = -1;
                i12 = aVar2.f173b;
                if (i12 < 0) {
                }
                i13 = i12 & 112;
                z2 = z3;
                if (i13 != 16) {
                }
                if (n(i31)) {
                }
                int i322 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                int l32 = l() + i322;
                childAt2.layout(l32, i14, measuredWidth2 + l32, measuredHeight2 + i14);
                paddingLeft2 = i322 + m() + measuredWidth2 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                i8 = k() + i8;
                i8++;
                virtualChildCount2 = i9;
                i30 = i10;
                z3 = z2;
            }
            i9 = virtualChildCount2;
            i10 = i30;
            z2 = z3;
            i8++;
            virtualChildCount2 = i9;
            i30 = i10;
            z3 = z2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c9, code lost:
        if (r13 < 0) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0760, code lost:
        if (r7 < 0) goto L_0x0762;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x08b5  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        char c2;
        int i11;
        int i12;
        int i13;
        float f3;
        int i14;
        int i15;
        int i16;
        boolean z;
        int baseline;
        int i17;
        int i18;
        char c3;
        boolean z2;
        boolean z3;
        int i19;
        int i20;
        int i21;
        boolean z4;
        a aVar;
        int i22;
        boolean z5;
        int i23;
        int i24;
        int baseline2;
        int i25;
        float f4;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z6;
        int i30;
        int i31;
        int i32;
        boolean z7;
        int i33;
        int i34;
        int i35;
        int i36;
        a aVar2;
        boolean z8;
        boolean z9;
        int i37;
        int i38;
        int i39 = -2;
        int i40 = Integer.MIN_VALUE;
        int i41 = 8;
        float f5 = 0.0f;
        int i42 = 1073741824;
        boolean z10 = true;
        if (this.e == 1) {
            this.g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i43 = this.f171c;
            boolean z11 = this.i;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            boolean z12 = false;
            int i49 = 0;
            boolean z13 = false;
            boolean z14 = true;
            float f6 = 0.0f;
            while (i44 < virtualChildCount) {
                View childAt = getChildAt(i44);
                if (childAt == null) {
                    this.g = p() + this.g;
                } else if (childAt.getVisibility() == i41) {
                    i44 += k();
                } else {
                    if (n(i44)) {
                        this.g += this.n;
                    }
                    a aVar3 = (a) childAt.getLayoutParams();
                    float f7 = aVar3.f172a;
                    f6 += f7;
                    if (mode2 == i42 && ((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f7 > f5) {
                        int i50 = this.g;
                        this.g = Math.max(i50, ((ViewGroup.MarginLayoutParams) aVar3).topMargin + i50 + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                        i33 = i43;
                        i32 = mode2;
                        i36 = mode;
                        i31 = virtualChildCount;
                        aVar2 = aVar3;
                        z8 = true;
                        z7 = true;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) aVar3).height != 0 || f7 <= f5) {
                            i37 = i40;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = i39;
                            i37 = 0;
                        }
                        if (f6 == f5) {
                            i38 = this.g;
                            i33 = i43;
                        } else {
                            i33 = i43;
                            i38 = 0;
                        }
                        i32 = mode2;
                        i36 = mode;
                        i31 = virtualChildCount;
                        aVar2 = aVar3;
                        z7 = true;
                        o(childAt, i2, 0, i3, i38);
                        if (i37 != i40) {
                            ((ViewGroup.MarginLayoutParams) aVar2).height = i37;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i51 = this.g;
                        this.g = Math.max(i51, m() + i51 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin);
                        if (z11) {
                            i46 = Math.max(measuredHeight, i46);
                        }
                        z8 = z12;
                    }
                    if (i33 >= 0 && i33 == i44 + 1) {
                        this.d = this.g;
                    }
                    if (i44 >= i33 || aVar2.f172a <= 0.0f) {
                        i35 = i36;
                        if (i35 == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar2).width != -1) {
                            z9 = false;
                        } else {
                            z9 = z7;
                            z13 = z9;
                        }
                        int i52 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i52;
                        i34 = Math.max(i48, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i49, childAt.getMeasuredState());
                        boolean z15 = (!z14 || ((ViewGroup.MarginLayoutParams) aVar2).width != -1) ? false : z7;
                        if (aVar2.f172a > 0.0f) {
                            if (!z9) {
                                i52 = measuredWidth;
                            }
                            i45 = Math.max(i45, i52);
                        } else {
                            if (!z9) {
                                i52 = measuredWidth;
                            }
                            i47 = Math.max(i47, i52);
                            i45 = i45;
                        }
                        i44 += k();
                        z12 = z8;
                        z14 = z15;
                        i49 = combineMeasuredStates;
                        i44++;
                        mode = i35;
                        i48 = i34;
                        i43 = i33;
                        z10 = z7;
                        mode2 = i32;
                        virtualChildCount = i31;
                        i39 = -2;
                        i40 = Integer.MIN_VALUE;
                        i41 = 8;
                        f5 = 0.0f;
                        i42 = 1073741824;
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i33 = i43;
                i32 = mode2;
                i35 = mode;
                i31 = virtualChildCount;
                z7 = z10;
                i34 = i48;
                i44++;
                mode = i35;
                i48 = i34;
                i43 = i33;
                z10 = z7;
                mode2 = i32;
                virtualChildCount = i31;
                i39 = -2;
                i40 = Integer.MIN_VALUE;
                i41 = 8;
                f5 = 0.0f;
                i42 = 1073741824;
            }
            int i53 = i47;
            int i54 = i48;
            int i55 = i49;
            if (this.g > 0 && n(virtualChildCount)) {
                this.g += this.n;
            }
            int i56 = mode2;
            if (z11 && (i56 == Integer.MIN_VALUE || i56 == 0)) {
                this.g = 0;
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt2 = getChildAt(i57);
                    if (childAt2 == null) {
                        this.g = p() + this.g;
                    } else if (childAt2.getVisibility() == 8) {
                        i57 += k();
                    } else {
                        a aVar4 = (a) childAt2.getLayoutParams();
                        int i58 = this.g;
                        this.g = Math.max(i58, m() + i58 + i46 + ((ViewGroup.MarginLayoutParams) aVar4).topMargin + ((ViewGroup.MarginLayoutParams) aVar4).bottomMargin);
                    }
                    i57++;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.g;
            this.g = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i59 = (16777215 & resolveSizeAndState) - this.g;
            if (z12 || (i59 != 0 && f6 > 0.0f)) {
                float f8 = this.h;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                this.g = 0;
                int i60 = 0;
                while (i60 < virtualChildCount) {
                    View childAt3 = getChildAt(i60);
                    if (childAt3.getVisibility() == 8) {
                        i27 = i56;
                    } else {
                        a aVar5 = (a) childAt3.getLayoutParams();
                        float f9 = aVar5.f172a;
                        if (f9 > 0.0f) {
                            int i61 = (int) ((((float) i59) * f9) / f6);
                            f6 -= f9;
                            int i62 = i59 - i61;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar5).leftMargin + ((ViewGroup.MarginLayoutParams) aVar5).rightMargin, ((ViewGroup.MarginLayoutParams) aVar5).width);
                            if (((ViewGroup.MarginLayoutParams) aVar5).height != 0 || i56 != 1073741824) {
                                i30 = childAt3.getMeasuredHeight() + i61;
                            } else if (i61 > 0) {
                                i30 = i61;
                                childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                                i55 = View.combineMeasuredStates(i55, childAt3.getMeasuredState() & -256);
                                i59 = i62;
                            }
                            i30 = 0;
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                            i55 = View.combineMeasuredStates(i55, childAt3.getMeasuredState() & -256);
                            i59 = i62;
                        }
                        int i63 = ((ViewGroup.MarginLayoutParams) aVar5).leftMargin + ((ViewGroup.MarginLayoutParams) aVar5).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i63;
                        i54 = Math.max(i54, measuredWidth2);
                        i27 = i56;
                        if (mode != 1073741824) {
                            i28 = i59;
                            i29 = -1;
                            if (((ViewGroup.MarginLayoutParams) aVar5).width == -1) {
                                z6 = z10;
                                if (!z6) {
                                    i63 = measuredWidth2;
                                }
                                i53 = Math.max(i53, i63);
                                boolean z16 = (z14 || ((ViewGroup.MarginLayoutParams) aVar5).width != i29) ? false : z10;
                                int i64 = this.g;
                                this.g = Math.max(i64, m() + childAt3.getMeasuredHeight() + i64 + ((ViewGroup.MarginLayoutParams) aVar5).topMargin + ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin);
                                z14 = z16;
                                i59 = i28;
                            }
                        } else {
                            i28 = i59;
                            i29 = -1;
                        }
                        z6 = false;
                        if (!z6) {
                        }
                        i53 = Math.max(i53, i63);
                        if (z14) {
                        }
                        int i642 = this.g;
                        this.g = Math.max(i642, m() + childAt3.getMeasuredHeight() + i642 + ((ViewGroup.MarginLayoutParams) aVar5).topMargin + ((ViewGroup.MarginLayoutParams) aVar5).bottomMargin);
                        z14 = z16;
                        i59 = i28;
                    }
                    i60++;
                    i56 = i27;
                }
                this.g = getPaddingBottom() + getPaddingTop() + this.g;
            } else {
                i53 = Math.max(i53, i45);
                if (z11 && i56 != 1073741824) {
                    for (int i65 = 0; i65 < virtualChildCount; i65++) {
                        View childAt4 = getChildAt(i65);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((a) childAt4.getLayoutParams()).f172a <= 0.0f)) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                        }
                    }
                }
            }
            if (z14 || mode == 1073741824) {
                i53 = i54;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i53, getSuggestedMinimumWidth()), i2, i55), resolveSizeAndState);
            if (z13) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i66 = 0; i66 < virtualChildCount; i66++) {
                    View childAt5 = getChildAt(i66);
                    if (childAt5.getVisibility() != 8) {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) aVar6).width == -1) {
                            int i67 = ((ViewGroup.MarginLayoutParams) aVar6).height;
                            ((ViewGroup.MarginLayoutParams) aVar6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                            ((ViewGroup.MarginLayoutParams) aVar6).height = i67;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (this.j == null || this.k == null) {
            this.j = new int[4];
            this.k = new int[4];
        }
        int[] iArr = this.j;
        int[] iArr2 = this.k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.f170b;
        boolean z18 = this.i;
        boolean z19 = mode3 == 1073741824;
        boolean z20 = true;
        int i68 = 0;
        float f10 = 0.0f;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int i73 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i70 < virtualChildCount2) {
            View childAt6 = getChildAt(i70);
            if (childAt6 == null) {
                this.g = p() + this.g;
                z3 = z18;
                z2 = z17;
            } else if (childAt6.getVisibility() == 8) {
                i70 += k();
                z2 = z17;
                i68 = i68;
                i69 = i69;
                z3 = z18;
            } else {
                if (n(i70)) {
                    this.g += this.m;
                }
                a aVar7 = (a) childAt6.getLayoutParams();
                float f11 = aVar7.f172a;
                float f12 = f10 + f11;
                if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar7).width == 0 && f11 > 0.0f) {
                    if (z19) {
                        i26 = i70;
                        this.g = ((ViewGroup.MarginLayoutParams) aVar7).leftMargin + ((ViewGroup.MarginLayoutParams) aVar7).rightMargin + this.g;
                    } else {
                        i26 = i70;
                        int i74 = this.g;
                        this.g = Math.max(i74, ((ViewGroup.MarginLayoutParams) aVar7).leftMargin + i74 + ((ViewGroup.MarginLayoutParams) aVar7).rightMargin);
                    }
                    if (z17) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                        aVar = aVar7;
                        i20 = i68;
                        i19 = i69;
                        i21 = i26;
                        z3 = z18;
                        z2 = z17;
                    } else {
                        aVar = aVar7;
                        i20 = i68;
                        i19 = i69;
                        i21 = i26;
                        i22 = 1073741824;
                        z3 = z18;
                        z2 = z17;
                        z4 = true;
                        if (mode4 == i22 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            z5 = true;
                            z22 = true;
                        } else {
                            z5 = false;
                        }
                        i23 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        int measuredHeight2 = childAt6.getMeasuredHeight() + i23;
                        int combineMeasuredStates2 = View.combineMeasuredStates(i72, childAt6.getMeasuredState());
                        if (z2 || (baseline2 = childAt6.getBaseline()) == -1) {
                            i24 = i23;
                        } else {
                            int i75 = aVar.f173b;
                            if (i75 < 0) {
                                i75 = this.f;
                            }
                            int i76 = (((i75 & 112) >> 4) & -2) >> 1;
                            i24 = i23;
                            iArr[i76] = Math.max(iArr[i76], baseline2);
                            iArr2[i76] = Math.max(iArr2[i76], measuredHeight2 - baseline2);
                        }
                        int max = Math.max(i73, measuredHeight2);
                        boolean z23 = !z20 && ((ViewGroup.MarginLayoutParams) aVar).height == -1;
                        if (aVar.f172a <= 0.0f) {
                            if (z5) {
                                measuredHeight2 = i24;
                            }
                            i68 = Math.max(i20, measuredHeight2);
                        } else {
                            if (z5) {
                                measuredHeight2 = i24;
                            }
                            i19 = Math.max(i19, measuredHeight2);
                            i68 = i20;
                        }
                        i70 = k() + i21;
                        i73 = max;
                        i72 = combineMeasuredStates2;
                        z21 = z4;
                        z20 = z23;
                        f10 = f12;
                        i69 = i19;
                    }
                } else {
                    if (((ViewGroup.MarginLayoutParams) aVar7).width == 0) {
                        f4 = 0.0f;
                        if (f11 > 0.0f) {
                            ((ViewGroup.MarginLayoutParams) aVar7).width = -2;
                            i25 = 0;
                            i20 = i68;
                            i19 = i69;
                            i21 = i70;
                            z3 = z18;
                            z2 = z17;
                            o(childAt6, i2, f12 != f4 ? this.g : 0, i3, 0);
                            if (i25 == Integer.MIN_VALUE) {
                                aVar = aVar7;
                                ((ViewGroup.MarginLayoutParams) aVar).width = i25;
                            } else {
                                aVar = aVar7;
                            }
                            int measuredWidth3 = childAt6.getMeasuredWidth();
                            int i77 = this.g;
                            if (!z19) {
                                this.g = m() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i77;
                            } else {
                                this.g = Math.max(i77, m() + i77 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                            }
                            if (z3) {
                                i71 = Math.max(measuredWidth3, i71);
                            }
                        }
                    } else {
                        f4 = 0.0f;
                    }
                    i25 = Integer.MIN_VALUE;
                    i20 = i68;
                    i19 = i69;
                    i21 = i70;
                    z3 = z18;
                    z2 = z17;
                    o(childAt6, i2, f12 != f4 ? this.g : 0, i3, 0);
                    if (i25 == Integer.MIN_VALUE) {
                    }
                    int measuredWidth32 = childAt6.getMeasuredWidth();
                    int i772 = this.g;
                    if (!z19) {
                    }
                    if (z3) {
                    }
                }
                z4 = z21;
                i22 = 1073741824;
                if (mode4 == i22) {
                }
                z5 = false;
                i23 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                int measuredHeight22 = childAt6.getMeasuredHeight() + i23;
                int combineMeasuredStates22 = View.combineMeasuredStates(i72, childAt6.getMeasuredState());
                if (z2) {
                }
                i24 = i23;
                int max2 = Math.max(i73, measuredHeight22);
                if (!z20) {
                }
                if (aVar.f172a <= 0.0f) {
                }
                i70 = k() + i21;
                i73 = max2;
                i72 = combineMeasuredStates22;
                z21 = z4;
                z20 = z23;
                f10 = f12;
                i69 = i19;
            }
            i70++;
            z18 = z3;
            z17 = z2;
        }
        int i78 = i69;
        if (this.g > 0 && n(virtualChildCount2)) {
            this.g += this.m;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c3 = 3;
            if (iArr[3] == -1) {
                i4 = i72;
                if (z18 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.g = 0;
                    i18 = 0;
                    while (i18 < virtualChildCount2) {
                        View childAt7 = getChildAt(i18);
                        if (childAt7 == null) {
                            this.g = p() + this.g;
                        } else if (childAt7.getVisibility() == 8) {
                            i18 += k();
                        } else {
                            a aVar8 = (a) childAt7.getLayoutParams();
                            int i79 = this.g;
                            this.g = z19 ? m() + ((ViewGroup.MarginLayoutParams) aVar8).leftMargin + i71 + ((ViewGroup.MarginLayoutParams) aVar8).rightMargin + i79 : Math.max(i79, m() + i79 + i71 + ((ViewGroup.MarginLayoutParams) aVar8).leftMargin + ((ViewGroup.MarginLayoutParams) aVar8).rightMargin);
                        }
                        i18++;
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.g;
                this.g = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
                i5 = (16777215 & resolveSizeAndState2) - this.g;
                if (!z21 || (i5 != 0 && f10 > 0.0f)) {
                    f2 = this.h;
                    if (f2 > 0.0f) {
                        f10 = f2;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.g = 0;
                    int i80 = i5;
                    i7 = i4;
                    int i81 = -1;
                    i10 = 0;
                    while (i10 < virtualChildCount2) {
                        View childAt8 = getChildAt(i10);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i12 = i80;
                            i11 = virtualChildCount2;
                        } else {
                            a aVar9 = (a) childAt8.getLayoutParams();
                            float f13 = aVar9.f172a;
                            if (f13 > 0.0f) {
                                i11 = virtualChildCount2;
                                int i82 = (int) ((((float) i80) * f13) / f10);
                                float f14 = f10 - f13;
                                int i83 = i80 - i82;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar9).topMargin + ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar9).height);
                                if (((ViewGroup.MarginLayoutParams) aVar9).width != 0 || mode3 != 1073741824) {
                                    i17 = childAt8.getMeasuredWidth() + i82;
                                } else if (i82 > 0) {
                                    i17 = i82;
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), childMeasureSpec2);
                                    i7 = View.combineMeasuredStates(i7, childAt8.getMeasuredState() & -16777216);
                                    f10 = f14;
                                    i13 = i83;
                                }
                                i17 = 0;
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), childMeasureSpec2);
                                i7 = View.combineMeasuredStates(i7, childAt8.getMeasuredState() & -16777216);
                                f10 = f14;
                                i13 = i83;
                            } else {
                                i13 = i80;
                                i11 = virtualChildCount2;
                            }
                            if (z19) {
                                f3 = f10;
                                i15 = m() + childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar9).leftMargin + ((ViewGroup.MarginLayoutParams) aVar9).rightMargin + this.g;
                                i14 = i13;
                            } else {
                                f3 = f10;
                                int i84 = this.g;
                                i14 = i13;
                                i15 = Math.max(i84, m() + childAt8.getMeasuredWidth() + i84 + ((ViewGroup.MarginLayoutParams) aVar9).leftMargin + ((ViewGroup.MarginLayoutParams) aVar9).rightMargin);
                            }
                            this.g = i15;
                            boolean z24 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar9).height == -1;
                            int i85 = ((ViewGroup.MarginLayoutParams) aVar9).topMargin + ((ViewGroup.MarginLayoutParams) aVar9).bottomMargin;
                            int measuredHeight3 = childAt8.getMeasuredHeight() + i85;
                            i81 = Math.max(i81, measuredHeight3);
                            if (!z24) {
                                i85 = measuredHeight3;
                            }
                            i78 = Math.max(i78, i85);
                            if (z20) {
                                i16 = -1;
                                if (((ViewGroup.MarginLayoutParams) aVar9).height == -1) {
                                    z = true;
                                    if (!z17 && (baseline = childAt8.getBaseline()) != i16) {
                                        int i86 = aVar9.f173b;
                                        if (i86 < 0) {
                                            i86 = this.f;
                                        }
                                        int i87 = (((i86 & 112) >> 4) & -2) >> 1;
                                        iArr[i87] = Math.max(iArr[i87], baseline);
                                        iArr2[i87] = Math.max(iArr2[i87], measuredHeight3 - baseline);
                                    }
                                    z20 = z;
                                    i12 = i14;
                                    f10 = f3;
                                }
                            } else {
                                i16 = -1;
                            }
                            z = false;
                            if (!z17) {
                            }
                            z20 = z;
                            i12 = i14;
                            f10 = f3;
                        }
                        i10++;
                        i80 = i12;
                        virtualChildCount2 = i11;
                    }
                    i8 = i3;
                    i6 = virtualChildCount2;
                    this.g = getPaddingRight() + getPaddingLeft() + this.g;
                    if (iArr[1] != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c2 = 3;
                        if (iArr[3] == -1) {
                            i73 = i81;
                        }
                    } else {
                        c2 = 3;
                    }
                    i9 = 0;
                    i73 = Math.max(i81, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                    if (z20 || mode4 == 1073741824) {
                        i78 = i73;
                    }
                    setMeasuredDimension((-16777216 & i7) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i8, i7 << 16));
                    if (z22) {
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        for (int i88 = i9; i88 < i6; i88++) {
                            View childAt9 = getChildAt(i88);
                            if (childAt9.getVisibility() != 8) {
                                a aVar10 = (a) childAt9.getLayoutParams();
                                if (((ViewGroup.MarginLayoutParams) aVar10).height == -1) {
                                    int i89 = ((ViewGroup.MarginLayoutParams) aVar10).width;
                                    ((ViewGroup.MarginLayoutParams) aVar10).width = childAt9.getMeasuredWidth();
                                    measureChildWithMargins(childAt9, i2, 0, makeMeasureSpec3, 0);
                                    ((ViewGroup.MarginLayoutParams) aVar10).width = i89;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                i78 = Math.max(i78, i68);
                if (z18 && mode3 != 1073741824) {
                    for (int i90 = 0; i90 < virtualChildCount2; i90++) {
                        View childAt10 = getChildAt(i90);
                        if (!(childAt10 == null || childAt10.getVisibility() == 8 || ((a) childAt10.getLayoutParams()).f172a <= 0.0f)) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(i71, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i8 = i3;
                i6 = virtualChildCount2;
                i7 = i4;
                i9 = 0;
                i78 = i73;
                setMeasuredDimension((-16777216 & i7) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i8, i7 << 16));
                if (z22) {
                }
            }
        } else {
            c3 = 3;
        }
        i4 = i72;
        i73 = Math.max(i73, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        this.g = 0;
        i18 = 0;
        while (i18 < virtualChildCount2) {
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.g;
        this.g = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        i5 = (16777215 & resolveSizeAndState22) - this.g;
        if (!z21) {
        }
        f2 = this.h;
        if (f2 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.g = 0;
        int i802 = i5;
        i7 = i4;
        int i812 = -1;
        i10 = 0;
        while (i10 < virtualChildCount2) {
        }
        i8 = i3;
        i6 = virtualChildCount2;
        this.g = getPaddingRight() + getPaddingLeft() + this.g;
        if (iArr[1] != -1) {
        }
        c2 = 3;
        i9 = 0;
        i73 = Math.max(i812, Math.max(iArr2[c2], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        i78 = i73;
        setMeasuredDimension((-16777216 & i7) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i8, i7 << 16));
        if (z22) {
        }
    }

    public int p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f170b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder d2 = b.a.a.a.a.d("base aligned child index out of range (0, ");
            d2.append(getChildCount());
            d2.append(")");
            throw new IllegalArgumentException(d2.toString());
        }
        this.f171c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.l) {
            this.l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.m = drawable.getIntrinsicWidth();
                this.n = drawable.getIntrinsicHeight();
            } else {
                this.m = 0;
                this.n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.p = i2;
    }

    public void setGravity(int i2) {
        if (this.f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f;
        if ((8388615 & i4) != i3) {
            this.f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i2) {
        if (this.e != i2) {
            this.e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.o) {
            requestLayout();
        }
        this.o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f;
        if ((i4 & 112) != i3) {
            this.f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
