package a.b.c;

import a.b.f.a;
import a.e.c;
import a.h.j.d;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import no.cybertalent.liberatortoolkit.R;

public class m extends Dialog implements f {

    /* renamed from: b  reason: collision with root package name */
    public g f34b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f35c;

    public class a implements d.a {
        public a() {
        }

        @Override // a.h.j.d.a
        public boolean i(KeyEvent keyEvent) {
            return m.this.b(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public m(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.f35c = new a();
        g a2 = a();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        a2.x(i);
        a2.l(null);
    }

    public g a() {
        if (this.f34b == null) {
            c<WeakReference<g>> cVar = g.f12b;
            this.f34b = new h(getContext(), getWindow(), this, this);
        }
        return this.f34b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.b.c.f
    public void c(a.b.f.a aVar) {
    }

    public void dismiss() {
        super.dismiss();
        a().m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d.b(this.f35c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().e(i);
    }

    @Override // a.b.c.f
    public void g(a.b.f.a aVar) {
    }

    @Override // a.b.c.f
    public a.b.f.a h(a.AbstractC0002a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        a().j();
    }

    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    public void onStop() {
        super.onStop();
        a().r();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().u(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().y(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}
