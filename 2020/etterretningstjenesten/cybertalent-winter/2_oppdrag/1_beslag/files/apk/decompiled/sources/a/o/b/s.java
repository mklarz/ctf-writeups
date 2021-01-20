package a.o.b;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.l f720a;

    /* renamed from: b  reason: collision with root package name */
    public int f721b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f722c = new Rect();

    public s(RecyclerView.l lVar, q qVar) {
        this.f720a = lVar;
    }

    public static s a(RecyclerView.l lVar, int i) {
        if (i == 0) {
            return new q(lVar);
        }
        if (i == 1) {
            return new r(lVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f721b) {
            return 0;
        }
        return l() - this.f721b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
