package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.m.g;
import b.b.a.a.m.h;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import no.cybertalent.liberatortoolkit.R;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] l = {R.attr.snackbarButtonStyle};
    public final AccessibilityManager j;
    public boolean k;

    public static final class SnackbarLayout extends BaseTransientBottomBar.j {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f1134b;

        public a(View.OnClickListener onClickListener) {
            this.f1134b = onClickListener;
        }

        public void onClick(View view) {
            this.f1134b.onClick(view);
            Snackbar.this.c(1);
        }
    }

    public Snackbar(ViewGroup viewGroup, View view, g gVar) {
        super(viewGroup, view, gVar);
        this.j = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar i(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) view;
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(l);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroup, false);
            Snackbar snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f1124c.getChildAt(0)).getMessageView().setText(charSequence);
            snackbar.e = i;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void b() {
        c(3);
    }

    public int h() {
        if (!this.k || !this.j.isTouchExplorationEnabled()) {
            return this.e;
        }
        return -2;
    }

    public Snackbar j(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f1124c.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence)) {
            this.k = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        } else {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.k = false;
        }
        return this;
    }

    public void k() {
        h b2 = h.b();
        int h = h();
        h.b bVar = this.g;
        synchronized (b2.f1073a) {
            if (b2.c(bVar)) {
                h.c cVar = b2.f1075c;
                cVar.f1078b = h;
                b2.f1074b.removeCallbacksAndMessages(cVar);
                b2.g(b2.f1075c);
            } else {
                if (b2.d(bVar)) {
                    b2.d.f1078b = h;
                } else {
                    b2.d = new h.c(h, bVar);
                }
                h.c cVar2 = b2.f1075c;
                if (cVar2 == null || !b2.a(cVar2, 4)) {
                    b2.f1075c = null;
                    b2.h();
                }
            }
        }
    }
}
