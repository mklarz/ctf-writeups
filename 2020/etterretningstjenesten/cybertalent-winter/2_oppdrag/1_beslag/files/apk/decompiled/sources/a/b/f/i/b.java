package a.b.f.i;

import a.b.f.i.m;
import android.content.Context;
import android.view.LayoutInflater;

public abstract class b implements m {

    /* renamed from: b  reason: collision with root package name */
    public Context f86b;

    /* renamed from: c  reason: collision with root package name */
    public Context f87c;
    public g d;
    public LayoutInflater e;
    public m.a f;
    public int g;
    public int h;
    public n i;

    public b(Context context, int i2, int i3) {
        this.f86b = context;
        this.e = LayoutInflater.from(context);
        this.g = i2;
        this.h = i3;
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
    public boolean k(g gVar, i iVar) {
        return false;
    }
}
