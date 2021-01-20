package com.google.android.material.bottomappbar;

import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.e.b;
import b.b.a.a.e.c;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int T = 0;
    public Animator O;
    public Animator P;
    public int Q;
    public boolean R;
    public boolean S;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public void B(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.B(bottomAppBar2);
            int i = BottomAppBar.T;
            FloatingActionButton x = bottomAppBar2.x();
            if (x != null) {
                x.f(this.d);
                x.clearAnimation();
                x.animate().translationY(((float) (-x.getPaddingBottom())) + ((float) (x.getMeasuredHeight() - this.d.height()))).setInterpolator(b.b.a.a.c.a.f994b).setDuration(175);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public void C(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.C(bottomAppBar2);
            int i = BottomAppBar.T;
            FloatingActionButton x = bottomAppBar2.x();
            if (x != null) {
                x.clearAnimation();
                x.animate().translationY(bottomAppBar2.getFabTranslationY()).setInterpolator(b.b.a.a.c.a.f995c).setDuration(225);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int] */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean j(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            Animator animator;
            BottomAppBar bottomAppBar2 = bottomAppBar;
            int i2 = BottomAppBar.T;
            FloatingActionButton x = bottomAppBar2.x();
            if (x == null) {
                Animator animator2 = bottomAppBar2.P;
                if ((animator2 != null && animator2.isRunning()) || ((animator = bottomAppBar2.O) != null && animator.isRunning())) {
                    coordinatorLayout.r(bottomAppBar2, i);
                    this.f1097a = bottomAppBar2.getMeasuredHeight();
                    return false;
                }
                BottomAppBar.v(bottomAppBar2);
                throw null;
            }
            ((CoordinatorLayout.f) x.getLayoutParams()).d = 17;
            x.k(null);
            x.l(null);
            x.d(null);
            x.e(null);
            this.d.set(0, 0, x.getMeasuredWidth(), x.getMeasuredHeight());
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (!bottomAppBar.getHideOnScroll()) {
                return false;
            }
            if (i2 == 0 ? v(coordinatorLayout, bottomAppBar, view2, view3, i) : false) {
                return true;
            }
            return false;
        }
    }

    public static class a extends a.j.a.a {
        public static final Parcelable.Creator<a> CREATOR = new C0033a();

        /* renamed from: c  reason: collision with root package name */
        public int f1109c;
        public boolean d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        public static class C0033a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new a[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1109c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f567a, i);
            parcel.writeInt(this.f1109c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) y(this.Q);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private float getFabTranslationY() {
        boolean z = this.S;
        FloatingActionButton x = x();
        if (x == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        x.f(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) x.getMeasuredHeight();
        }
        float height2 = (float) (x.getHeight() - rect.height());
        float height3 = (height / 2.0f) + (-getCradleVerticalOffset()) + ((float) (x.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) x.getPaddingBottom());
        float f = (float) (-getMeasuredHeight());
        if (!z) {
            height3 = paddingBottom;
        }
        return f + height3;
    }

    public static void v(BottomAppBar bottomAppBar) {
        bottomAppBar.getFabTranslationX();
        throw null;
    }

    public final void A(ActionMenuView actionMenuView, int i, boolean z) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        boolean z2 = getLayoutDirection() == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f5a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.Q;
    }

    public float getFabCradleMargin() {
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Animator animator = this.P;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.O;
        if (animator2 != null) {
            animator2.cancel();
        }
        getFabTranslationX();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f567a);
        this.Q = aVar.f1109c;
        this.S = aVar.d;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f1109c = this.Q;
        aVar.d = this.S;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            throw null;
        }
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        if (this.Q != i) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (isLaidOut()) {
                Animator animator = this.O;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (!this.S) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x(), "translationX", (float) y(i));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    this.O = animatorSet;
                    animatorSet.addListener(new b.b.a.a.e.a(this));
                    this.O.start();
                } else {
                    throw null;
                }
            }
        }
        boolean z = this.S;
        WeakHashMap<View, r> weakHashMap2 = m.f516a;
        if (isLaidOut()) {
            Animator animator2 = this.P;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if ((this.S || (z && z())) && (this.Q == 1 || i2 == 1)) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat3.addListener(new c(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(ofFloat3, ofFloat2);
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.P = animatorSet3;
            animatorSet3.addListener(new b(this));
            this.P.start();
        }
        this.Q = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            throw null;
        }
    }

    public void setFabDiameter(int i) {
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.R = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton x() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).e(this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    public final int y(int i) {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int i2 = 1;
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - 0;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    public final boolean z() {
        FloatingActionButton x = x();
        return x != null && x.i();
    }
}
