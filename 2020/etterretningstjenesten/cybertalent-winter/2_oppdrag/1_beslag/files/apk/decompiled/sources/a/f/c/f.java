package a.f.c;

import a.f.c.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;

public class f extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public e f407b;

    public static class a extends ConstraintLayout.a {
        public float m0;
        public boolean n0;
        public float o0;
        public float p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;

        public a(int i, int i2) {
            super(i, i2);
            this.m0 = 1.0f;
            this.n0 = false;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 1.0f;
            this.t0 = 1.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m0 = 1.0f;
            this.n0 = false;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 1.0f;
            this.t0 = 1.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f412c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.m0 = obtainStyledAttributes.getFloat(index, this.m0);
                } else if (index == 28) {
                    this.o0 = obtainStyledAttributes.getFloat(index, this.o0);
                    this.n0 = true;
                } else if (index == 23) {
                    this.q0 = obtainStyledAttributes.getFloat(index, this.q0);
                } else if (index == 24) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == 22) {
                    this.p0 = obtainStyledAttributes.getFloat(index, this.p0);
                } else if (index == 20) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == 21) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == 16) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 17) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == 18) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 19) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 27) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                }
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public e getConstraintSet() {
        if (this.f407b == null) {
            this.f407b = new e();
        }
        e eVar = this.f407b;
        Objects.requireNonNull(eVar);
        int childCount = getChildCount();
        eVar.f391c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!eVar.f390b || id != -1) {
                if (!eVar.f391c.containsKey(Integer.valueOf(id))) {
                    eVar.f391c.put(Integer.valueOf(id), new e.a());
                }
                e.a aVar2 = eVar.f391c.get(Integer.valueOf(id));
                if (childAt instanceof c) {
                    c cVar = (c) childAt;
                    aVar2.c(id, aVar);
                    if (cVar instanceof a) {
                        e.b bVar = aVar2.d;
                        bVar.d0 = 1;
                        a aVar3 = (a) cVar;
                        bVar.b0 = aVar3.getType();
                        aVar2.d.e0 = aVar3.getReferencedIds();
                        aVar2.d.c0 = aVar3.getMargin();
                    }
                }
                aVar2.c(id, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f407b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
