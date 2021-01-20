package a.b.f.i;

import a.e.h;
import a.h.e.a.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f88a;

    /* renamed from: b  reason: collision with root package name */
    public h<b, MenuItem> f89b;

    /* renamed from: c  reason: collision with root package name */
    public h<a.h.e.a.c, SubMenu> f90c;

    public c(Context context) {
        this.f88a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f89b == null) {
            this.f89b = new h<>();
        }
        MenuItem orDefault = this.f89b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.f88a, bVar);
        this.f89b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.h.e.a.c)) {
            return subMenu;
        }
        a.h.e.a.c cVar = (a.h.e.a.c) subMenu;
        if (this.f90c == null) {
            this.f90c = new h<>();
        }
        SubMenu subMenu2 = this.f90c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f88a, cVar);
        this.f90c.put(cVar, sVar);
        return sVar;
    }
}
