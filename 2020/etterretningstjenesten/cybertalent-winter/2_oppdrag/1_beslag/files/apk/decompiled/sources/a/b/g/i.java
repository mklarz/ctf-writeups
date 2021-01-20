package a.b.g;

import a.b.b;
import a.b.d.a.a;
import a.h.j.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f167a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f168b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f169c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.f167a = compoundButton;
    }

    public void a() {
        Drawable buttonDrawable = this.f167a.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.d) {
                mutate.setTintList(this.f168b);
            }
            if (this.e) {
                mutate.setTintMode(this.f169c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f167a.getDrawableState());
            }
            this.f167a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    public void b(AttributeSet attributeSet, int i) {
        int j;
        int j2;
        Context context = this.f167a.getContext();
        int[] iArr = b.l;
        x0 o = x0.o(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f167a;
        m.f(compoundButton, compoundButton.getContext(), iArr, attributeSet, o.f240b, i, 0);
        boolean z = true;
        try {
            if (o.m(1) && (j2 = o.j(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f167a;
                    compoundButton2.setButtonDrawable(a.a(compoundButton2.getContext(), j2));
                } catch (Resources.NotFoundException unused) {
                }
                if (!z && o.m(0) && (j = o.j(0, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f167a;
                    compoundButton3.setButtonDrawable(a.a(compoundButton3.getContext(), j));
                }
                if (o.m(2)) {
                    this.f167a.setButtonTintList(o.b(2));
                }
                if (o.m(3)) {
                    this.f167a.setButtonTintMode(e0.b(o.h(3, -1), null));
                }
            }
            z = false;
            CompoundButton compoundButton32 = this.f167a;
            compoundButton32.setButtonDrawable(a.a(compoundButton32.getContext(), j));
            if (o.m(2)) {
            }
            if (o.m(3)) {
            }
        } finally {
            o.f240b.recycle();
        }
    }
}
