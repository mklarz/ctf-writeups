package com.google.android.material.transformation;

import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f1138a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1139b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f1140c;
        public final /* synthetic */ b.b.a.a.h.a d;

        public a(View view, int i, b.b.a.a.h.a aVar) {
            this.f1139b = view;
            this.f1140c = i;
            this.d = aVar;
        }

        public boolean onPreDraw() {
            this.f1139b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f1138a == this.f1140c) {
                b.b.a.a.h.a aVar = this.d;
                expandableBehavior.B((View) aVar, this.f1139b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean A(boolean z) {
        if (!z) {
            return this.f1138a == 1;
        }
        int i = this.f1138a;
        return i == 0 || i == 2;
    }

    public abstract boolean B(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.b.a.a.h.a aVar = (b.b.a.a.h.a) view2;
        if (!A(aVar.a())) {
            return false;
        }
        this.f1138a = aVar.a() ? 1 : 2;
        return B((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, View view, int i) {
        b.b.a.a.h.a aVar;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (!view.isLaidOut()) {
            List<View> d = coordinatorLayout.d(view);
            int size = d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = d.get(i2);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (b.b.a.a.h.a) view2;
                    break;
                }
                i2++;
            }
            if (aVar != null && A(aVar.a())) {
                int i3 = aVar.a() ? 1 : 2;
                this.f1138a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, aVar));
            }
        }
        return false;
    }
}
