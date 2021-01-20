package a.q;

import a.q.h;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class n extends h {
    public boolean A = false;
    public int B = 0;
    public ArrayList<h> x = new ArrayList<>();
    public boolean y = true;
    public int z;

    public class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f771a;

        public a(n nVar, h hVar) {
            this.f771a = hVar;
        }

        @Override // a.q.h.d
        public void b(h hVar) {
            this.f771a.y();
            hVar.v(this);
        }
    }

    public static class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public n f772a;

        public b(n nVar) {
            this.f772a = nVar;
        }

        @Override // a.q.h.d, a.q.k
        public void a(h hVar) {
            n nVar = this.f772a;
            if (!nVar.A) {
                nVar.F();
                this.f772a.A = true;
            }
        }

        @Override // a.q.h.d
        public void b(h hVar) {
            n nVar = this.f772a;
            int i = nVar.z - 1;
            nVar.z = i;
            if (i == 0) {
                nVar.A = false;
                nVar.m();
            }
            hVar.v(this);
        }
    }

    @Override // a.q.h
    public void A(h.c cVar) {
        this.s = cVar;
        this.B |= 8;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).A(cVar);
        }
    }

    @Override // a.q.h
    public h B(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList<h> arrayList = this.x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.x.get(i).B(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
        return this;
    }

    @Override // a.q.h
    public void C(e eVar) {
        this.t = eVar == null ? h.v : eVar;
        this.B |= 4;
        for (int i = 0; i < this.x.size(); i++) {
            this.x.get(i).C(eVar);
        }
    }

    @Override // a.q.h
    public void D(m mVar) {
        this.B |= 2;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).D(mVar);
        }
    }

    @Override // a.q.h
    public h E(long j) {
        this.f756b = j;
        return this;
    }

    @Override // a.q.h
    public String G(String str) {
        String G = super.G(str);
        for (int i = 0; i < this.x.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(this.x.get(i).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public n H(h hVar) {
        this.x.add(hVar);
        hVar.i = this;
        long j = this.f757c;
        if (j >= 0) {
            hVar.z(j);
        }
        if ((this.B & 1) != 0) {
            hVar.B(this.d);
        }
        if ((this.B & 2) != 0) {
            hVar.D(null);
        }
        if ((this.B & 4) != 0) {
            hVar.C(this.t);
        }
        if ((this.B & 8) != 0) {
            hVar.A(this.s);
        }
        return this;
    }

    public h I(int i) {
        if (i < 0 || i >= this.x.size()) {
            return null;
        }
        return this.x.get(i);
    }

    public n J(int i) {
        if (i == 0) {
            this.y = true;
        } else if (i == 1) {
            this.y = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // a.q.h
    public h a(h.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // a.q.h
    public h b(View view) {
        for (int i = 0; i < this.x.size(); i++) {
            this.x.get(i).b(view);
        }
        this.f.add(view);
        return this;
    }

    @Override // a.q.h
    public void d(p pVar) {
        if (s(pVar.f777b)) {
            Iterator<h> it = this.x.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(pVar.f777b)) {
                    next.d(pVar);
                    pVar.f778c.add(next);
                }
            }
        }
    }

    @Override // a.q.h
    public void f(p pVar) {
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).f(pVar);
        }
    }

    @Override // a.q.h
    public void g(p pVar) {
        if (s(pVar.f777b)) {
            Iterator<h> it = this.x.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(pVar.f777b)) {
                    next.g(pVar);
                    pVar.f778c.add(next);
                }
            }
        }
    }

    @Override // a.q.h
    /* renamed from: j */
    public h clone() {
        n nVar = (n) super.clone();
        nVar.x = new ArrayList<>();
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            nVar.H(this.x.get(i).clone());
        }
        return nVar;
    }

    @Override // a.q.h
    public void l(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j = this.f756b;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.x.get(i);
            if (j > 0 && (this.y || i == 0)) {
                long j2 = hVar.f756b;
                if (j2 > 0) {
                    hVar.E(j2 + j);
                } else {
                    hVar.E(j);
                }
            }
            hVar.l(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    @Override // a.q.h
    public void u(View view) {
        super.u(view);
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).u(view);
        }
    }

    @Override // a.q.h
    public h v(h.d dVar) {
        super.v(dVar);
        return this;
    }

    @Override // a.q.h
    public h w(View view) {
        for (int i = 0; i < this.x.size(); i++) {
            this.x.get(i).w(view);
        }
        this.f.remove(view);
        return this;
    }

    @Override // a.q.h
    public void x(View view) {
        super.x(view);
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).x(view);
        }
    }

    @Override // a.q.h
    public void y() {
        if (this.x.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<h> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.z = this.x.size();
        if (!this.y) {
            for (int i = 1; i < this.x.size(); i++) {
                this.x.get(i - 1).a(new a(this, this.x.get(i)));
            }
            h hVar = this.x.get(0);
            if (hVar != null) {
                hVar.y();
                return;
            }
            return;
        }
        Iterator<h> it2 = this.x.iterator();
        while (it2.hasNext()) {
            it2.next().y();
        }
    }

    @Override // a.q.h
    public h z(long j) {
        this.f757c = j;
        if (j >= 0) {
            int size = this.x.size();
            for (int i = 0; i < size; i++) {
                this.x.get(i).z(j);
            }
        }
        return this;
    }
}
