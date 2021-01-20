package a.o.b;

import a.h.j.m;
import a.h.j.r;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0021b f665a;

    /* renamed from: b  reason: collision with root package name */
    public final a f666b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f667c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f668a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f669b;

        public void a(int i) {
            if (i >= 64) {
                a aVar = this.f669b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.f668a &= ~(1 << i);
        }

        public int b(int i) {
            long j;
            a aVar = this.f669b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f668a;
                }
                j = this.f668a & ((1 << i) - 1);
            } else {
                if (i >= 64) {
                    return Long.bitCount(this.f668a) + aVar.b(i - 64);
                }
                j = this.f668a & ((1 << i) - 1);
            }
            return Long.bitCount(j);
        }

        public final void c() {
            if (this.f669b == null) {
                this.f669b = new a();
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.f668a & (1 << i)) != 0;
            }
            c();
            return this.f669b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f669b.e(i - 64, z);
                return;
            }
            long j = this.f668a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f668a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.f669b != null) {
                c();
                this.f669b.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f669b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f668a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f668a = j3;
            long j4 = j - 1;
            this.f668a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f669b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f669b.f(0);
            }
            return z;
        }

        public void g() {
            this.f668a = 0;
            a aVar = this.f669b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i >= 64) {
                c();
                this.f669b.h(i - 64);
                return;
            }
            this.f668a |= 1 << i;
        }

        public String toString() {
            if (this.f669b == null) {
                return Long.toBinaryString(this.f668a);
            }
            return this.f669b.toString() + "xx" + Long.toBinaryString(this.f668a);
        }
    }

    /* renamed from: a.o.b.b$b  reason: collision with other inner class name */
    public interface AbstractC0021b {
    }

    public b(AbstractC0021b bVar) {
        this.f665a = bVar;
    }

    public void a(View view, int i, boolean z) {
        int b2 = i < 0 ? ((t) this.f665a).b() : f(i);
        this.f666b.e(b2, z);
        if (z) {
            i(view);
        }
        t tVar = (t) this.f665a;
        tVar.f723a.addView(view, b2);
        RecyclerView recyclerView = tVar.f723a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.J(view);
        recyclerView.S();
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b2 = i < 0 ? ((t) this.f665a).b() : f(i);
        this.f666b.e(b2, z);
        if (z) {
            i(view);
        }
        t tVar = (t) this.f665a;
        Objects.requireNonNull(tVar);
        RecyclerView.y J = RecyclerView.J(view);
        if (J != null) {
            if (J.n() || J.t()) {
                J.k &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(J);
                throw new IllegalArgumentException(b.a.a.a.a.a(tVar.f723a, sb));
            }
        }
        tVar.f723a.attachViewToParent(view, b2, layoutParams);
    }

    public void c(int i) {
        RecyclerView.y J;
        int f = f(i);
        this.f666b.f(f);
        t tVar = (t) this.f665a;
        View childAt = tVar.f723a.getChildAt(f);
        if (!(childAt == null || (J = RecyclerView.J(childAt)) == null)) {
            if (!J.n() || J.t()) {
                J.b(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(J);
                throw new IllegalArgumentException(b.a.a.a.a.a(tVar.f723a, sb));
            }
        }
        tVar.f723a.detachViewFromParent((RecyclerView) f);
    }

    public View d(int i) {
        return ((t) this.f665a).a(f(i));
    }

    public int e() {
        return ((t) this.f665a).b() - this.f667c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int b2 = ((t) this.f665a).b();
        int i2 = i;
        while (i2 < b2) {
            int b3 = i - (i2 - this.f666b.b(i2));
            if (b3 == 0) {
                while (this.f666b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b3;
        }
        return -1;
    }

    public View g(int i) {
        return ((t) this.f665a).f723a.getChildAt(i);
    }

    public int h() {
        return ((t) this.f665a).b();
    }

    public final void i(View view) {
        this.f667c.add(view);
        t tVar = (t) this.f665a;
        Objects.requireNonNull(tVar);
        RecyclerView.y J = RecyclerView.J(view);
        if (J != null) {
            RecyclerView recyclerView = tVar.f723a;
            int i = J.r;
            if (i == -1) {
                View view2 = J.f970b;
                WeakHashMap<View, r> weakHashMap = m.f516a;
                i = view2.getImportantForAccessibility();
            }
            J.q = i;
            recyclerView.i0(J, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((t) this.f665a).f723a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f666b.d(indexOfChild)) {
            return indexOfChild - this.f666b.b(indexOfChild);
        }
        return -1;
    }

    public boolean k(View view) {
        return this.f667c.contains(view);
    }

    public final boolean l(View view) {
        if (!this.f667c.remove(view)) {
            return false;
        }
        t tVar = (t) this.f665a;
        Objects.requireNonNull(tVar);
        RecyclerView.y J = RecyclerView.J(view);
        if (J == null) {
            return true;
        }
        tVar.f723a.i0(J, J.q);
        J.q = 0;
        return true;
    }

    public String toString() {
        return this.f666b.toString() + ", hidden list:" + this.f667c.size();
    }
}
