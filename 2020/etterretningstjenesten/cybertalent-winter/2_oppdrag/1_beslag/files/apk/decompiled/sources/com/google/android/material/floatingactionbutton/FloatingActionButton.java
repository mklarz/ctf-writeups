package com.google.android.material.floatingactionbutton;

import a.b.g.j;
import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.c.g;
import b.b.a.a.i.c;
import b.b.a.a.i.d;
import b.b.a.a.i.e;
import b.b.a.a.j.f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends f implements b.b.a.a.h.a {

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f1117c;
    public PorterDuff.Mode d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public ColorStateList g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public e l;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f1118a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1119b;

        public BaseBehavior() {
            this.f1119b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f992c);
            this.f1119b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public boolean A(FloatingActionButton floatingActionButton, Rect rect) {
            Objects.requireNonNull(floatingActionButton);
            floatingActionButton.getLeft();
            throw null;
        }

        public final boolean B(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f1119b && fVar.f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!B(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1118a == null) {
                this.f1118a = new Rect();
            }
            Rect rect = this.f1118a;
            ThreadLocal<Matrix> threadLocal = b.b.a.a.j.b.f1050a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            ThreadLocal<Matrix> threadLocal2 = b.b.a.a.j.b.f1050a;
            Matrix matrix = threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            b.b.a.a.j.b.a(coordinatorLayout, appBarLayout, matrix);
            ThreadLocal<RectF> threadLocal3 = b.b.a.a.j.b.f1051b;
            RectF rectF = threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean D(View view, FloatingActionButton floatingActionButton) {
            if (!B(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return A((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void f(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                C(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f888a instanceof BottomSheetBehavior : false) {
                    D(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d = coordinatorLayout.d(floatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = d.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f888a instanceof BottomSheetBehavior : false) && D(view2, floatingActionButton)) {
                        break;
                    }
                } else if (C(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    public class b implements b.b.a.a.l.b {
        public b() {
        }
    }

    private e getImpl() {
        if (this.l == null) {
            this.l = new b.b.a.a.i.f(this, new b());
        }
        return this.l;
    }

    @Override // b.b.a.a.h.a
    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.n == null) {
            impl.n = new ArrayList<>();
        }
        impl.n.add(null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().h(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.m == null) {
            impl.m = new ArrayList<>();
        }
        impl.m.add(null);
    }

    @Deprecated
    public boolean f(Rect rect) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public final int g(int i2) {
        int i3 = this.i;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f1117c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.d;
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().j;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().k;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().d;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.g;
    }

    public g getShowMotionSpec() {
        return getImpl().f1045c;
    }

    public int getSize() {
        return this.h;
    }

    public int getSizeDimension() {
        return g(this.h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    public void h(a aVar, boolean z) {
        e impl = getImpl();
        boolean z2 = false;
        if (impl.o.getVisibility() != 0 ? impl.f1043a != 2 : impl.f1043a == 1) {
            z2 = true;
        }
        if (!z2) {
            Animator animator = impl.f1044b;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.n()) {
                g gVar = impl.d;
                if (gVar == null) {
                    if (impl.f == null) {
                        impl.f = g.a(impl.o.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    gVar = impl.f;
                }
                AnimatorSet a2 = impl.a(gVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new b.b.a.a.i.b(impl, z, null));
                ArrayList<Animator.AnimatorListener> arrayList = impl.n;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.o.b(z ? 8 : 4, z);
        }
    }

    public boolean i() {
        return getImpl().e();
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(j.c(colorForState, mode));
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().f();
    }

    public void k(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().n;
        if (arrayList != null) {
            arrayList.remove((Object) null);
        }
    }

    public void l(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().m;
        if (arrayList != null) {
            arrayList.remove((Object) null);
        }
    }

    public void m(a aVar, boolean z) {
        e impl = getImpl();
        if (!impl.e()) {
            Animator animator = impl.f1044b;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.n()) {
                if (impl.o.getVisibility() != 0) {
                    impl.o.setAlpha(0.0f);
                    impl.o.setScaleY(0.0f);
                    impl.o.setScaleX(0.0f);
                    impl.l(0.0f);
                }
                g gVar = impl.f1045c;
                if (gVar == null) {
                    if (impl.e == null) {
                        impl.e = g.a(impl.o.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    gVar = impl.e;
                }
                AnimatorSet a2 = impl.a(gVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new c(impl, z, null));
                ArrayList<Animator.AnimatorListener> arrayList = impl.m;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.o.b(0, z);
            impl.o.setAlpha(1.0f);
            impl.o.setScaleY(1.0f);
            impl.o.setScaleX(1.0f);
            impl.l(1.0f);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e impl = getImpl();
        if (impl.k()) {
            if (impl.u == null) {
                impl.u = new d(impl);
            }
            impl.o.getViewTreeObserver().addOnPreDrawListener(impl.u);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e impl = getImpl();
        if (impl.u != null) {
            impl.o.getViewTreeObserver().removeOnPreDrawListener(impl.u);
            impl.u = null;
        }
    }

    public void onMeasure(int i2, int i3) {
        this.j = (getSizeDimension() + 0) / 2;
        getImpl().o();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b.b.a.a.n.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b.b.a.a.n.a aVar = (b.b.a.a.n.a) parcelable;
        super.onRestoreInstanceState(aVar.f567a);
        aVar.f1080c.getOrDefault("expandableWidgetHelper", null);
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            a.j.a.a aVar = a.j.a.a.f566b;
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1117c != colorStateList) {
            this.f1117c = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f2) {
        e impl = getImpl();
        if (impl.i != f2) {
            impl.i = f2;
            impl.i(f2, impl.j, impl.k);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        e impl = getImpl();
        if (impl.j != f2) {
            impl.j = f2;
            impl.i(impl.i, f2, impl.k);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        e impl = getImpl();
        if (impl.k != f2) {
            impl.k = f2;
            impl.i(impl.i, impl.j, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 >= 0) {
            this.i = i2;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().d = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.a(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e impl = getImpl();
        impl.l(impl.l);
    }

    public void setImageResource(int i2) {
        throw null;
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            getImpl().m(this.g);
        }
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f1045c = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.i = 0;
        if (i2 != this.h) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            j();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().g();
        }
    }
}
