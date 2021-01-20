package a.b.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: a.b.c.a$a  reason: collision with other inner class name */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5a;

        public C0000a(int i, int i2) {
            super(i, i2);
            this.f5a = 0;
            this.f5a = 8388627;
        }

        public C0000a(C0000a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f5a = 0;
            this.f5a = aVar.f5a;
        }

        public C0000a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.b.f3b);
            this.f5a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5a = 0;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    public abstract void a(boolean z);

    public abstract Context b();

    public abstract void c(boolean z);
}
