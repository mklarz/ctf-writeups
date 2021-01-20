package a.f.b.i.l;

import a.f.b.i.d;
import a.f.b.i.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f349a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f350b = new a();

    /* renamed from: c  reason: collision with root package name */
    public e f351c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d.a f352a;

        /* renamed from: b  reason: collision with root package name */
        public d.a f353b;

        /* renamed from: c  reason: collision with root package name */
        public int f354c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* renamed from: a.f.b.i.l.b$b  reason: collision with other inner class name */
    public interface AbstractC0008b {
    }

    public b(e eVar) {
        this.f351c = eVar;
    }

    public final boolean a(AbstractC0008b bVar, d dVar, boolean z) {
        d.a aVar = d.a.FIXED;
        this.f350b.f352a = dVar.j();
        this.f350b.f353b = dVar.n();
        this.f350b.f354c = dVar.o();
        this.f350b.d = dVar.i();
        a aVar2 = this.f350b;
        aVar2.i = false;
        aVar2.j = z;
        d.a aVar3 = aVar2.f352a;
        d.a aVar4 = d.a.MATCH_CONSTRAINT;
        boolean z2 = true;
        boolean z3 = aVar3 == aVar4;
        boolean z4 = aVar2.f353b == aVar4;
        boolean z5 = z3 && dVar.N > 0.0f;
        boolean z6 = z4 && dVar.N > 0.0f;
        if (z5 && dVar.l[0] == 4) {
            aVar2.f352a = aVar;
        }
        if (z6 && dVar.l[1] == 4) {
            aVar2.f353b = aVar;
        }
        ((ConstraintLayout.b) bVar).a(dVar, aVar2);
        dVar.B(this.f350b.e);
        dVar.w(this.f350b.f);
        a aVar5 = this.f350b;
        dVar.w = aVar5.h;
        int i = aVar5.g;
        dVar.R = i;
        if (i <= 0) {
            z2 = false;
        }
        dVar.w = z2;
        aVar5.j = false;
        return aVar5.i;
    }

    public final void b(e eVar, int i, int i2) {
        int i3 = eVar.S;
        int i4 = eVar.T;
        eVar.z(0);
        eVar.y(0);
        eVar.L = i;
        int i5 = eVar.S;
        if (i < i5) {
            eVar.L = i5;
        }
        eVar.M = i2;
        int i6 = eVar.T;
        if (i2 < i6) {
            eVar.M = i6;
        }
        eVar.z(i3);
        eVar.y(i4);
        this.f351c.E();
    }
}
