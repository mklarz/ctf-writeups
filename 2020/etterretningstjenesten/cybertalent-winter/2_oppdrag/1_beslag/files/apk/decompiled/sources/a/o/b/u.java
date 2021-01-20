package a.o.b;

import a.o.b.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class u implements a.AbstractC0020a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f724a;

    public u(RecyclerView recyclerView) {
        this.f724a = recyclerView;
    }

    public void a(a.b bVar) {
        int i = bVar.f662a;
        if (i == 1) {
            RecyclerView recyclerView = this.f724a;
            recyclerView.m.i0(recyclerView, bVar.f663b, bVar.d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f724a;
            recyclerView2.m.l0(recyclerView2, bVar.f663b, bVar.d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f724a;
            recyclerView3.m.n0(recyclerView3, bVar.f663b, bVar.d, bVar.f664c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f724a;
            recyclerView4.m.k0(recyclerView4, bVar.f663b, bVar.d, 1);
        }
    }

    public RecyclerView.y b(int i) {
        RecyclerView recyclerView = this.f724a;
        int h = recyclerView.f.h();
        int i2 = 0;
        RecyclerView.y yVar = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            RecyclerView.y J = RecyclerView.J(recyclerView.f.g(i2));
            if (J != null && !J.l() && J.d == i) {
                if (!recyclerView.f.k(J.f970b)) {
                    yVar = J;
                    break;
                }
                yVar = J;
            }
            i2++;
        }
        if (yVar != null && !this.f724a.f.k(yVar.f970b)) {
            return yVar;
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f724a;
        int h = recyclerView.f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f.g(i6);
            RecyclerView.y J = RecyclerView.J(g);
            if (J != null && !J.t() && (i4 = J.d) >= i && i4 < i5) {
                J.b(2);
                J.a(obj);
                ((RecyclerView.m) g.getLayoutParams()).f954c = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f934c;
        int size = rVar.f962c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.y yVar = rVar.f962c.get(size);
                if (yVar != null && (i3 = yVar.d) >= i && i3 < i5) {
                    yVar.b(2);
                    rVar.f(size);
                }
            } else {
                this.f724a.i0 = true;
                return;
            }
        }
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f724a;
        int h = recyclerView.f.h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.y J = RecyclerView.J(recyclerView.f.g(i3));
            if (J != null && !J.t() && J.d >= i) {
                J.p(i2, false);
                recyclerView.e0.e = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f934c;
        int size = rVar.f962c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.y yVar = rVar.f962c.get(i4);
            if (yVar != null && yVar.d >= i) {
                yVar.p(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f724a.h0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f724a;
        int h = recyclerView.f.h();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            RecyclerView.y J = RecyclerView.J(recyclerView.f.g(i11));
            if (J != null && (i9 = J.d) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    J.p(i2 - i, false);
                } else {
                    J.p(i3, false);
                }
                recyclerView.e0.e = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f934c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = rVar.f962c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.y yVar = rVar.f962c.get(i12);
            if (yVar != null && (i8 = yVar.d) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    yVar.p(i2 - i, false);
                } else {
                    yVar.p(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f724a.h0 = true;
    }
}
