package com.google.android.material.snackbar;

import a.h.j.k;
import a.h.j.m;
import a.h.j.r;
import a.h.j.v;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.m.h;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final Handler h = new Handler(Looper.getMainLooper(), new a());
    public static final int[] i = {R.attr.snackbarStyle};

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1122a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1123b;

    /* renamed from: c  reason: collision with root package name */
    public final j f1124c;
    public final b.b.a.a.m.g d;
    public int e;
    public final AccessibilityManager f;
    public final h.b g = new d();

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final g i = new g(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean A(View view) {
            Objects.requireNonNull(this.i);
            return view instanceof j;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            g gVar = this.i;
            Objects.requireNonNull(gVar);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.b.a.a.m.h.b().f(gVar.f1130a);
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.b.a.a.m.h.b().e(gVar.f1130a);
            }
            return super.i(coordinatorLayout, view, motionEvent);
        }
    }

    public static class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                if (baseTransientBottomBar.f1124c.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f1124c.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                        Behavior behavior = new Behavior();
                        g gVar = behavior.i;
                        Objects.requireNonNull(gVar);
                        gVar.f1130a = baseTransientBottomBar.g;
                        behavior.f1102b = new b.b.a.a.m.c(baseTransientBottomBar);
                        fVar.b(behavior);
                        fVar.g = 80;
                    }
                    baseTransientBottomBar.f1122a.addView(baseTransientBottomBar.f1124c);
                }
                baseTransientBottomBar.f1124c.setOnAttachStateChangeListener(new b.b.a.a.m.e(baseTransientBottomBar));
                j jVar = baseTransientBottomBar.f1124c;
                WeakHashMap<View, r> weakHashMap = m.f516a;
                if (!jVar.isLaidOut()) {
                    baseTransientBottomBar.f1124c.setOnLayoutChangeListener(new b.b.a.a.m.f(baseTransientBottomBar));
                } else if (baseTransientBottomBar.g()) {
                    baseTransientBottomBar.a();
                } else {
                    baseTransientBottomBar.f();
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                if (!baseTransientBottomBar2.g() || baseTransientBottomBar2.f1124c.getVisibility() != 0) {
                    baseTransientBottomBar2.e(i2);
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar2.d());
                    valueAnimator.setInterpolator(b.b.a.a.c.a.f993a);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new b.b.a.a.m.a(baseTransientBottomBar2, i2));
                    valueAnimator.addUpdateListener(new b.b.a.a.m.b(baseTransientBottomBar2));
                    valueAnimator.start();
                }
                return true;
            }
        }
    }

    public class b implements k {
        public b(BaseTransientBottomBar baseTransientBottomBar) {
        }

        @Override // a.h.j.k
        public v a(View view, v vVar) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), vVar.a());
            return vVar;
        }
    }

    public class c extends a.h.j.a {
        public c() {
        }

        @Override // a.h.j.a
        public void b(View view, a.h.j.w.d dVar) {
            this.f501a.onInitializeAccessibilityNodeInfo(view, dVar.f545a);
            dVar.f545a.addAction(1048576);
            dVar.f545a.setDismissable(true);
        }

        @Override // a.h.j.a
        public boolean c(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.c(view, i, bundle);
            }
            BaseTransientBottomBar.this.b();
            return true;
        }
    }

    public class d implements h.b {
        public d() {
        }

        @Override // b.b.a.a.m.h.b
        public void a(int i) {
            Handler handler = BaseTransientBottomBar.h;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // b.b.a.a.m.h.b
        public void b() {
            Handler handler = BaseTransientBottomBar.h;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.f();
        }

        public void onAnimationStart(Animator animator) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) BaseTransientBottomBar.this.d;
            snackbarContentLayout.f1136b.setAlpha(0.0f);
            long j = (long) 180;
            long j2 = (long) 70;
            snackbarContentLayout.f1136b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            if (snackbarContentLayout.f1137c.getVisibility() == 0) {
                snackbarContentLayout.f1137c.setAlpha(0.0f);
                snackbarContentLayout.f1137c.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
            }
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f1127a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1128b;

        public f(int i) {
            this.f1128b = i;
            this.f1127a = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Handler handler = BaseTransientBottomBar.h;
            BaseTransientBottomBar.this.f1124c.setTranslationY((float) intValue);
            this.f1127a = intValue;
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public h.b f1130a;

        public g(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f = SwipeDismissBehavior.B(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.g = SwipeDismissBehavior.B(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.d = 0;
        }
    }

    public interface h {
    }

    public interface i {
    }

    public static class j extends FrameLayout {

        /* renamed from: b  reason: collision with root package name */
        public final AccessibilityManager f1131b;

        /* renamed from: c  reason: collision with root package name */
        public final a.h.j.w.b f1132c;
        public i d;
        public h e;

        public class a implements a.h.j.w.b {
            public a() {
            }
        }

        public j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.g);
            if (obtainStyledAttributes.hasValue(1)) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                setElevation((float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            }
            obtainStyledAttributes.recycle();
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            this.f1131b = accessibilityManager;
            a aVar = new a();
            this.f1132c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(new a.h.j.w.c(aVar));
            setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
        }

        /* access modifiers changed from: private */
        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            h hVar = this.e;
            if (hVar != null) {
                Objects.requireNonNull((b.b.a.a.m.e) hVar);
            }
            WeakHashMap<View, r> weakHashMap = m.f516a;
            requestApplyInsets();
        }

        public void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            h hVar = this.e;
            if (hVar != null) {
                b.b.a.a.m.e eVar = (b.b.a.a.m.e) hVar;
                BaseTransientBottomBar baseTransientBottomBar = eVar.f1071a;
                Objects.requireNonNull(baseTransientBottomBar);
                b.b.a.a.m.h b2 = b.b.a.a.m.h.b();
                h.b bVar = baseTransientBottomBar.g;
                synchronized (b2.f1073a) {
                    if (!b2.c(bVar)) {
                        if (!b2.d(bVar)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    BaseTransientBottomBar.h.post(new b.b.a.a.m.d(eVar));
                }
            }
            AccessibilityManager accessibilityManager = this.f1131b;
            a.h.j.w.b bVar2 = this.f1132c;
            if (bVar2 != null) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new a.h.j.w.c(bVar2));
            }
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            i iVar = this.d;
            if (iVar != null) {
                b.b.a.a.m.f fVar = (b.b.a.a.m.f) iVar;
                fVar.f1072a.f1124c.setOnLayoutChangeListener(null);
                boolean g = fVar.f1072a.g();
                BaseTransientBottomBar baseTransientBottomBar = fVar.f1072a;
                if (g) {
                    baseTransientBottomBar.a();
                } else {
                    baseTransientBottomBar.f();
                }
            }
        }

        public void setOnAttachStateChangeListener(h hVar) {
            this.e = hVar;
        }

        public void setOnLayoutChangeListener(i iVar) {
            this.d = iVar;
        }
    }

    public BaseTransientBottomBar(ViewGroup viewGroup, View view, b.b.a.a.m.g gVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (gVar != null) {
            this.f1122a = viewGroup;
            this.d = gVar;
            Context context = viewGroup.getContext();
            this.f1123b = context;
            b.b.a.a.j.e.a(context, b.b.a.a.j.e.f1058a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            j jVar = (j) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.f1124c = jVar;
            jVar.addView(view);
            WeakHashMap<View, r> weakHashMap = m.f516a;
            jVar.setAccessibilityLiveRegion(1);
            jVar.setImportantForAccessibility(1);
            jVar.setFitsSystemWindows(true);
            m.h(jVar, new b(this));
            m.g(jVar, new c());
            this.f = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void a() {
        int d2 = d();
        this.f1124c.setTranslationY((float) d2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(d2, 0);
        valueAnimator.setInterpolator(b.b.a.a.c.a.f993a);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new e());
        valueAnimator.addUpdateListener(new f(d2));
        valueAnimator.start();
    }

    public void b() {
        c(3);
    }

    public void c(int i2) {
        h.c cVar;
        b.b.a.a.m.h b2 = b.b.a.a.m.h.b();
        h.b bVar = this.g;
        synchronized (b2.f1073a) {
            if (b2.c(bVar)) {
                cVar = b2.f1075c;
            } else if (b2.d(bVar)) {
                cVar = b2.d;
            }
            b2.a(cVar, i2);
        }
    }

    public final int d() {
        int height = this.f1124c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f1124c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public void e(int i2) {
        b.b.a.a.m.h b2 = b.b.a.a.m.h.b();
        h.b bVar = this.g;
        synchronized (b2.f1073a) {
            if (b2.c(bVar)) {
                b2.f1075c = null;
                if (b2.d != null) {
                    b2.h();
                }
            }
        }
        ViewParent parent = this.f1124c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1124c);
        }
    }

    public void f() {
        b.b.a.a.m.h b2 = b.b.a.a.m.h.b();
        h.b bVar = this.g;
        synchronized (b2.f1073a) {
            if (b2.c(bVar)) {
                b2.g(b2.f1075c);
            }
        }
    }

    public boolean g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }
}
