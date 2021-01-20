package a.b.f;

import a.b.f.a;
import a.b.f.i.j;
import a.b.f.i.o;
import a.e.h;
import a.h.e.a.b;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f62a;

    /* renamed from: b  reason: collision with root package name */
    public final a f63b;

    public static class a implements a.AbstractC0002a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f64a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f65b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f66c = new ArrayList<>();
        public final h<Menu, Menu> d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f65b = context;
            this.f64a = callback;
        }

        @Override // a.b.f.a.AbstractC0002a
        public boolean a(a aVar, Menu menu) {
            return this.f64a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // a.b.f.a.AbstractC0002a
        public void b(a aVar) {
            this.f64a.onDestroyActionMode(e(aVar));
        }

        @Override // a.b.f.a.AbstractC0002a
        public boolean c(a aVar, MenuItem menuItem) {
            return this.f64a.onActionItemClicked(e(aVar), new j(this.f65b, (b) menuItem));
        }

        @Override // a.b.f.a.AbstractC0002a
        public boolean d(a aVar, Menu menu) {
            return this.f64a.onCreateActionMode(e(aVar), f(menu));
        }

        public ActionMode e(a aVar) {
            int size = this.f66c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f66c.get(i);
                if (eVar != null && eVar.f63b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f65b, aVar);
            this.f66c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.f65b, (a.h.e.a.a) menu);
            this.d.put(menu, oVar);
            return oVar;
        }
    }

    public e(Context context, a aVar) {
        this.f62a = context;
        this.f63b = aVar;
    }

    public void finish() {
        this.f63b.c();
    }

    public View getCustomView() {
        return this.f63b.d();
    }

    public Menu getMenu() {
        return new o(this.f62a, (a.h.e.a.a) this.f63b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f63b.f();
    }

    public CharSequence getSubtitle() {
        return this.f63b.g();
    }

    public Object getTag() {
        return this.f63b.f57b;
    }

    public CharSequence getTitle() {
        return this.f63b.h();
    }

    public boolean getTitleOptionalHint() {
        return this.f63b.f58c;
    }

    public void invalidate() {
        this.f63b.i();
    }

    public boolean isTitleOptional() {
        return this.f63b.j();
    }

    public void setCustomView(View view) {
        this.f63b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f63b.l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f63b.m(charSequence);
    }

    public void setTag(Object obj) {
        this.f63b.f57b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f63b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f63b.o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f63b.p(z);
    }
}
