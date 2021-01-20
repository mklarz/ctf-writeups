package a.f.c;

import a.f.b.i.d;
import android.content.Context;
import android.util.AttributeSet;

public class a extends c {
    public int h;
    public int i;
    public a.f.b.i.a j;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // a.f.c.c
    public void e(AttributeSet attributeSet) {
        super.e(null);
        a.f.b.i.a aVar = new a.f.b.i.a();
        this.j = aVar;
        this.e = aVar;
        j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // a.f.c.c
    public void f(d dVar, boolean z) {
        int i2;
        int i3 = this.h;
        this.i = i3;
        if (z) {
            if (i3 != 5) {
            }
            i2 = 1;
            this.i = i2;
            if (!(dVar instanceof a.f.b.i.a)) {
                ((a.f.b.i.a) dVar).g0 = this.i;
                return;
            }
            return;
        } else if (i3 != 5) {
        }
        i2 = 0;
        this.i = i2;
        if (!(dVar instanceof a.f.b.i.a)) {
        }
    }

    public int getMargin() {
        return this.j.i0;
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.h0 = z;
    }

    public void setDpMargin(int i2) {
        this.j.i0 = (int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.j.i0 = i2;
    }

    public void setType(int i2) {
        this.h = i2;
    }
}
