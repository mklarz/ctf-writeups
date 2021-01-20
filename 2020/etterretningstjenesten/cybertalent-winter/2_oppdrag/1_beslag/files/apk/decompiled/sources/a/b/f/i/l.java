package a.b.f.i;

import a.b.f.i.m;
import a.h.j.r;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f123a;

    /* renamed from: b  reason: collision with root package name */
    public final g f124b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f125c;
    public final int d;
    public final int e;
    public View f;
    public int g = 8388611;
    public boolean h;
    public m.a i;
    public k j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f123a = context;
        this.f124b = gVar;
        this.f = view;
        this.f125c = z;
        this.d = i2;
        this.e = i3;
    }

    public k a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.f123a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k dVar = Math.min(point.x, point.y) >= this.f123a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new d(this.f123a, this.f, this.d, this.e, this.f125c) : new q(this.f123a, this.f124b, this.f, this.d, this.e, this.f125c);
            dVar.l(this.f124b);
            dVar.s(this.l);
            dVar.o(this.f);
            dVar.e(this.i);
            dVar.p(this.h);
            dVar.q(this.g);
            this.j = dVar;
        }
        return this.j;
    }

    public boolean b() {
        k kVar = this.j;
        return kVar != null && kVar.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.e(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z, boolean z2) {
        k a2 = a();
        a2.t(z2);
        if (z) {
            int i4 = this.g;
            View view = this.f;
            WeakHashMap<View, r> weakHashMap = a.h.j.m.f516a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f.getWidth();
            }
            a2.r(i2);
            a2.u(i3);
            int i5 = (int) ((this.f123a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f122b = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.b();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
