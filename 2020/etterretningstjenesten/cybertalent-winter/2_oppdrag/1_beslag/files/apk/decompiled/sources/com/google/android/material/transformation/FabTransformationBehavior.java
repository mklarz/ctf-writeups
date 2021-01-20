package com.google.android.material.transformation;

import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.c.d;
import b.b.a.a.c.g;
import b.b.a.a.c.h;
import b.b.a.a.c.i;
import b.b.a.a.g.c;
import b.b.a.a.o.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1143c;
    public final RectF d;
    public final RectF e;
    public final int[] f;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f1144a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1145b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1146c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f1144a = z;
            this.f1145b = view;
            this.f1146c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1144a) {
                this.f1145b.setVisibility(4);
                this.f1146c.setAlpha(1.0f);
                this.f1146c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f1144a) {
                this.f1145b.setVisibility(0);
                this.f1146c.setAlpha(0.0f);
                this.f1146c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f1147a;

        /* renamed from: b  reason: collision with root package name */
        public i f1148b;
    }

    public FabTransformationBehavior() {
        this.f1143c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1143c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet C(View view, View view2, boolean z, boolean z2) {
        b bVar;
        ArrayList arrayList;
        c cVar;
        ArrayList arrayList2;
        h hVar;
        Animator animator;
        ObjectAnimator objectAnimator;
        b L = L(view2.getContext(), z);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        J(view, view2, z, z2, L, arrayList3);
        RectF rectF = this.d;
        K(view, view2, z, z2, L, arrayList3, rectF);
        float width = rectF.width();
        float height = rectF.height();
        boolean z3 = view2 instanceof c;
        if (z3 && (view instanceof ImageView)) {
            c cVar2 = (c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, d.f998b, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, d.f998b, 255);
                }
                objectAnimator.addUpdateListener(new b.b.a.a.o.a(this, view2));
                L.f1147a.c("iconFade").a(objectAnimator);
                arrayList3.add(objectAnimator);
                arrayList4.add(new b.b.a.a.o.b(this, cVar2, drawable));
            }
        }
        if (!z3) {
            bVar = L;
            arrayList = arrayList4;
        } else {
            c cVar3 = (c) view2;
            i iVar = L.f1148b;
            RectF rectF2 = this.d;
            RectF rectF3 = this.e;
            G(view, rectF2);
            G(view2, rectF3);
            rectF3.offset(-D(view, view2, iVar), 0.0f);
            float centerX = rectF2.centerX() - rectF3.left;
            i iVar2 = L.f1148b;
            RectF rectF4 = this.d;
            RectF rectF5 = this.e;
            G(view, rectF4);
            G(view2, rectF5);
            rectF5.offset(0.0f, -E(view, view2, iVar2));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).f(this.f1143c);
            float width2 = ((float) this.f1143c.width()) / 2.0f;
            h c2 = L.f1147a.c("expansion");
            if (z) {
                if (!z2) {
                    cVar3.setRevealInfo(new c.e(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = cVar3.getRevealInfo().f1035c;
                }
                float c3 = b.b.a.a.a.c(centerX, centerY, 0.0f, 0.0f);
                float c4 = b.b.a.a.a.c(centerX, centerY, width, 0.0f);
                float c5 = b.b.a.a.a.c(centerX, centerY, width, height);
                float c6 = b.b.a.a.a.c(centerX, centerY, 0.0f, height);
                if (c3 > c4 && c3 > c5 && c3 > c6) {
                    c5 = c3;
                } else if (c4 > c5 && c4 > c6) {
                    c5 = c4;
                } else if (c5 <= c6) {
                    c5 = c6;
                }
                animator = b.b.a.a.a.b(cVar3, centerX, centerY, c5);
                animator.addListener(new b.b.a.a.o.c(this, cVar3));
                hVar = c2;
                long j = hVar.f1005a;
                int i = (int) centerX;
                int i2 = (int) centerY;
                if (j > 0) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, width2, width2);
                    createCircularReveal.setStartDelay(0);
                    createCircularReveal.setDuration(j);
                    arrayList3.add(createCircularReveal);
                }
                cVar = cVar3;
                bVar = L;
                arrayList2 = arrayList4;
            } else {
                h hVar2 = c2;
                float f2 = cVar3.getRevealInfo().f1035c;
                Animator b2 = b.b.a.a.a.b(cVar3, centerX, centerY, width2);
                long j2 = hVar2.f1005a;
                int i3 = (int) centerX;
                int i4 = (int) centerY;
                if (j2 > 0) {
                    Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, f2, f2);
                    createCircularReveal2.setStartDelay(0);
                    createCircularReveal2.setDuration(j2);
                    arrayList3.add(createCircularReveal2);
                }
                long j3 = hVar2.f1005a;
                long j4 = hVar2.f1006b;
                g gVar = L.f1147a;
                int i5 = gVar.f1004a.f303c;
                arrayList2 = arrayList4;
                bVar = L;
                int i6 = 0;
                long j5 = 0;
                while (i6 < i5) {
                    h k = gVar.f1004a.k(i6);
                    j5 = Math.max(j5, k.f1005a + k.f1006b);
                    i6++;
                    i5 = i5;
                    hVar2 = hVar2;
                    gVar = gVar;
                    cVar3 = cVar3;
                    i3 = i3;
                }
                cVar = cVar3;
                long j6 = j3 + j4;
                if (j6 < j5) {
                    Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, width2, width2);
                    createCircularReveal3.setStartDelay(j6);
                    createCircularReveal3.setDuration(j5 - j6);
                    arrayList3.add(createCircularReveal3);
                }
                animator = b2;
                hVar = hVar2;
            }
            hVar.a(animator);
            arrayList3.add(animator);
            arrayList = arrayList2;
            arrayList.add(new b.b.a.a.g.a(cVar));
        }
        I(view, view2, z, z2, bVar, arrayList3);
        H(view2, z, z2, bVar, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        b.b.a.a.a.g(animatorSet, arrayList3);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i7));
        }
        return animatorSet;
    }

    public final float D(View view, View view2, i iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        G(view, rectF);
        G(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float E(View view, View view2, i iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        G(view, rectF);
        G(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float F(b bVar, h hVar, float f2, float f3) {
        long j = hVar.f1005a;
        long j2 = hVar.f1006b;
        h c2 = bVar.f1147a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c2.f1005a + c2.f1006b) + 17) - j)) / ((float) j2));
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f993a;
        return ((f3 - f2) * interpolation) + f2;
    }

    public final void G(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    public final void H(View view, boolean z, boolean z2, b bVar, List list) {
        ViewGroup viewGroup;
        ObjectAnimator objectAnimator;
        if (view instanceof ViewGroup) {
            boolean z3 = view instanceof c;
            View findViewById = view.findViewById(R.id.mtrl_child_content_container);
            if (findViewById != null) {
                viewGroup = M(findViewById);
            } else {
                if ((view instanceof e) || (view instanceof b.b.a.a.o.d)) {
                    view = ((ViewGroup) view).getChildAt(0);
                }
                viewGroup = M(view);
            }
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        b.b.a.a.c.c.f997a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(viewGroup, b.b.a.a.c.c.f997a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(viewGroup, b.b.a.a.c.c.f997a, 0.0f);
                }
                bVar.f1147a.c("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    public final void I(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof c) {
            c cVar = (c) view2;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(colorForState);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f1032a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f1032a, colorForState);
            }
            objectAnimator.setEvaluator(b.b.a.a.c.b.f996a);
            bVar.f1147a.c("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;)V */
    @TargetApi(21)
    public final void J(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator objectAnimator;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -elevation);
        }
        bVar.f1147a.c("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List<Landroid/animation/Animator;>;Ljava/util/List<Landroid/animation/Animator$AnimatorListener;>;Landroid/graphics/RectF;)V */
    public final void K(View view, View view2, boolean z, boolean z2, b bVar, List list, RectF rectF) {
        String str;
        g gVar;
        h hVar;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        int i;
        float D = D(view, view2, bVar.f1148b);
        float E = E(view, view2, bVar.f1148b);
        if (D == 0.0f || E == 0.0f) {
            hVar = bVar.f1147a.c("translationXLinear");
            gVar = bVar.f1147a;
            str = "translationYLinear";
        } else if ((!z || E >= 0.0f) && (z || i <= 0)) {
            hVar = bVar.f1147a.c("translationXCurveDownwards");
            gVar = bVar.f1147a;
            str = "translationYCurveDownwards";
        } else {
            hVar = bVar.f1147a.c("translationXCurveUpwards");
            gVar = bVar.f1147a;
            str = "translationYCurveUpwards";
        }
        h c2 = gVar.c(str);
        if (z) {
            if (!z2) {
                view2.setTranslationX(-D);
                view2.setTranslationY(-E);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float F = F(bVar, hVar, -D, 0.0f);
            float F2 = F(bVar, c2, -E, 0.0f);
            Rect rect = this.f1143c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.d;
            rectF2.set(rect);
            RectF rectF3 = this.e;
            G(view2, rectF3);
            rectF3.offset(F, F2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -D);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -E);
        }
        hVar.a(objectAnimator2);
        c2.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    public abstract b L(Context context, boolean z);

    public final ViewGroup M(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }
}
