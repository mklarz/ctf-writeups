package a.b.f;

import a.b.f.a;
import a.b.f.i.g;
import a.b.g.c;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class d extends a implements g.a {
    public Context d;
    public ActionBarContextView e;
    public a.AbstractC0002a f;
    public WeakReference<View> g;
    public boolean h;
    public g i;

    public d(Context context, ActionBarContextView actionBarContextView, a.AbstractC0002a aVar, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.l = 1;
        this.i = gVar;
        gVar.e = this;
    }

    @Override // a.b.f.i.g.a
    public void a(g gVar) {
        i();
        c cVar = this.e.e;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // a.b.f.i.g.a
    public boolean b(g gVar, MenuItem menuItem) {
        return this.f.c(this, menuItem);
    }

    @Override // a.b.f.a
    public void c() {
        if (!this.h) {
            this.h = true;
            this.e.sendAccessibilityEvent(32);
            this.f.b(this);
        }
    }

    @Override // a.b.f.a
    public View d() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.f.a
    public Menu e() {
        return this.i;
    }

    @Override // a.b.f.a
    public MenuInflater f() {
        return new f(this.e.getContext());
    }

    @Override // a.b.f.a
    public CharSequence g() {
        return this.e.getSubtitle();
    }

    @Override // a.b.f.a
    public CharSequence h() {
        return this.e.getTitle();
    }

    @Override // a.b.f.a
    public void i() {
        this.f.a(this, this.i);
    }

    @Override // a.b.f.a
    public boolean j() {
        return this.e.s;
    }

    @Override // a.b.f.a
    public void k(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.f.a
    public void l(int i2) {
        this.e.setSubtitle(this.d.getString(i2));
    }

    @Override // a.b.f.a
    public void m(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // a.b.f.a
    public void n(int i2) {
        this.e.setTitle(this.d.getString(i2));
    }

    @Override // a.b.f.a
    public void o(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // a.b.f.a
    public void p(boolean z) {
        this.f58c = z;
        this.e.setTitleOptional(z);
    }
}
