package b.b.a.a.f;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import b.b.a.a.k.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f1025a;

    /* renamed from: b  reason: collision with root package name */
    public int f1026b;

    /* renamed from: c  reason: collision with root package name */
    public int f1027c;
    public int d;
    public int e;
    public int f;
    public int g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public ColorStateList j;
    public ColorStateList k;
    public final Paint l = new Paint(1);
    public final Rect m = new Rect();
    public final RectF n = new RectF();
    public GradientDrawable o;
    public GradientDrawable p;
    public GradientDrawable q;
    public boolean r = false;

    public c(a aVar) {
        this.f1025a = aVar;
    }

    @TargetApi(21)
    public final Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.o = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f) + 1.0E-5f);
        this.o.setColor(-1);
        b();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.p = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f) + 1.0E-5f);
        this.p.setColor(0);
        this.p.setStroke(this.g, this.j);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{this.o, this.p}), this.f1026b, this.d, this.f1027c, this.e);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.q = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f) + 1.0E-5f);
        this.q.setColor(-1);
        return new b(a.a(this.k), insetDrawable, this.q);
    }

    public final void b() {
        GradientDrawable gradientDrawable = this.o;
        if (gradientDrawable != null) {
            gradientDrawable.setTintList(this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                this.o.setTintMode(mode);
            }
        }
    }
}
