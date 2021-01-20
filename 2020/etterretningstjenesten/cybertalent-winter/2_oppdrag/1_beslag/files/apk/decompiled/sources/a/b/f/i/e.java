package a.b.f.i;

import a.b.c.d;
import a.b.f.i.m;
import a.b.f.i.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;
import java.util.Objects;
import no.cybertalent.liberatortoolkit.R;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f100b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f101c;
    public g d;
    public ExpandedMenuView e;
    public m.a f;
    public a g;

    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f102b = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.d;
            i iVar = gVar.v;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == iVar) {
                        this.f102b = i;
                        return;
                    }
                }
            }
            this.f102b = -1;
        }

        /* renamed from: b */
        public i getItem(int i) {
            g gVar = e.this.d;
            gVar.i();
            ArrayList<i> arrayList = gVar.j;
            Objects.requireNonNull(e.this);
            int i2 = i + 0;
            int i3 = this.f102b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public int getCount() {
            g gVar = e.this.d;
            gVar.i();
            int size = gVar.j.size();
            Objects.requireNonNull(e.this);
            int i = size + 0;
            return this.f102b < 0 ? i : i - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f101c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i) {
        this.f100b = context;
        this.f101c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.g == null) {
            this.g = new a();
        }
        return this.g;
    }

    @Override // a.b.f.i.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.f;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // a.b.f.i.m
    public boolean d(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.f.i.m
    public void e(m.a aVar) {
        this.f = aVar;
    }

    @Override // a.b.f.i.m
    public boolean g(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        d.a aVar = new d.a(rVar.f106a);
        e eVar = new e(aVar.f10a.f821a, R.layout.abc_list_menu_item_layout);
        hVar.d = eVar;
        eVar.f = hVar;
        g gVar = hVar.f109b;
        gVar.b(eVar, gVar.f106a);
        ListAdapter a2 = hVar.d.a();
        AlertController.b bVar = aVar.f10a;
        bVar.h = a2;
        bVar.i = hVar;
        View view = rVar.o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f823c = rVar.n;
            bVar.d = rVar.m;
        }
        bVar.g = hVar;
        d a3 = aVar.a();
        hVar.f110c = a3;
        a3.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.f110c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f110c.show();
        m.a aVar2 = this.f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(rVar);
        return true;
    }

    @Override // a.b.f.i.m
    public boolean h() {
        return false;
    }

    @Override // a.b.f.i.m
    public void i(boolean z) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.f.i.m
    public void j(Context context, g gVar) {
        if (this.f100b != null) {
            this.f100b = context;
            if (this.f101c == null) {
                this.f101c = LayoutInflater.from(context);
            }
        }
        this.d = gVar;
        a aVar = this.g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.f.i.m
    public boolean k(g gVar, i iVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.s(this.g.getItem(i), this, 0);
    }
}
