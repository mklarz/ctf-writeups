package a.o.b;

import a.e.e;
import androidx.recyclerview.widget.RecyclerView;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final a.e.a<RecyclerView.y, a> f730a = new a.e.a<>();

    /* renamed from: b  reason: collision with root package name */
    public final e<RecyclerView.y> f731b = new e<>();

    public static class a {
        public static a.h.i.b<a> d = new a.h.i.b<>(20);

        /* renamed from: a  reason: collision with root package name */
        public int f732a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f733b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f734c;

        public static a a() {
            a a2 = d.a();
            return a2 == null ? new a() : a2;
        }

        public static void b(a aVar) {
            aVar.f732a = 0;
            aVar.f733b = null;
            aVar.f734c = null;
            d.b(aVar);
        }
    }

    public interface b {
    }

    public void a(RecyclerView.y yVar) {
        a orDefault = this.f730a.getOrDefault(yVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f730a.put(yVar, orDefault);
        }
        orDefault.f732a |= 1;
    }

    public void b(RecyclerView.y yVar, RecyclerView.i.c cVar) {
        a orDefault = this.f730a.getOrDefault(yVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f730a.put(yVar, orDefault);
        }
        orDefault.f734c = cVar;
        orDefault.f732a |= 8;
    }

    public void c(RecyclerView.y yVar, RecyclerView.i.c cVar) {
        a orDefault = this.f730a.getOrDefault(yVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f730a.put(yVar, orDefault);
        }
        orDefault.f733b = cVar;
        orDefault.f732a |= 4;
    }

    public boolean d(RecyclerView.y yVar) {
        a orDefault = this.f730a.getOrDefault(yVar, null);
        return (orDefault == null || (orDefault.f732a & 1) == 0) ? false : true;
    }

    public final RecyclerView.i.c e(RecyclerView.y yVar, int i) {
        a k;
        RecyclerView.i.c cVar;
        int e = this.f730a.e(yVar);
        if (e >= 0 && (k = this.f730a.k(e)) != null) {
            int i2 = k.f732a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                k.f732a = i3;
                if (i == 4) {
                    cVar = k.f733b;
                } else if (i == 8) {
                    cVar = k.f734c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f730a.i(e);
                    a.b(k);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.y yVar) {
        a orDefault = this.f730a.getOrDefault(yVar, null);
        if (orDefault != null) {
            orDefault.f732a &= -2;
        }
    }

    public void g(RecyclerView.y yVar) {
        int g = this.f731b.g() - 1;
        while (true) {
            if (g < 0) {
                break;
            } else if (yVar == this.f731b.h(g)) {
                e<RecyclerView.y> eVar = this.f731b;
                Object[] objArr = eVar.f285c;
                Object obj = objArr[g];
                Object obj2 = e.e;
                if (obj != obj2) {
                    objArr[g] = obj2;
                    eVar.f283a = true;
                }
            } else {
                g--;
            }
        }
        a remove = this.f730a.remove(yVar);
        if (remove != null) {
            a.b(remove);
        }
    }
}
