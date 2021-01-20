package a.q;

import a.e.e;
import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public abstract class h implements Cloneable {
    public static final int[] u = {2, 1, 3, 4};
    public static final e v = new a();
    public static ThreadLocal<a.e.a<Animator, b>> w = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public String f755a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f756b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f757c = -1;
    public TimeInterpolator d = null;
    public ArrayList<Integer> e = new ArrayList<>();
    public ArrayList<View> f = new ArrayList<>();
    public q g = new q();
    public q h = new q();
    public n i = null;
    public int[] j = u;
    public ArrayList<p> k;
    public ArrayList<p> l;
    public ArrayList<Animator> m = new ArrayList<>();
    public int n = 0;
    public boolean o = false;
    public boolean p = false;
    public ArrayList<d> q = null;
    public ArrayList<Animator> r = new ArrayList<>();
    public c s;
    public e t = v;

    public static class a extends e {
        @Override // a.q.e
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f758a;

        /* renamed from: b  reason: collision with root package name */
        public String f759b;

        /* renamed from: c  reason: collision with root package name */
        public p f760c;
        public b0 d;
        public h e;

        public b(View view, String str, h hVar, b0 b0Var, p pVar) {
            this.f758a = view;
            this.f759b = str;
            this.f760c = pVar;
            this.d = b0Var;
            this.e = hVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);

        void d(h hVar);
    }

    public static void c(q qVar, View view, p pVar) {
        qVar.f779a.put(view, pVar);
        int id = view.getId();
        if (id >= 0) {
            if (qVar.f780b.indexOfKey(id) >= 0) {
                qVar.f780b.put(id, null);
            } else {
                qVar.f780b.put(id, view);
            }
        }
        WeakHashMap<View, r> weakHashMap = m.f516a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (qVar.d.e(transitionName) >= 0) {
                qVar.d.put(transitionName, null);
            } else {
                qVar.d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e<View> eVar = qVar.f781c;
                if (eVar.f283a) {
                    eVar.c();
                }
                if (a.e.d.b(eVar.f284b, eVar.d, itemIdAtPosition) >= 0) {
                    View d2 = qVar.f781c.d(itemIdAtPosition);
                    if (d2 != null) {
                        d2.setHasTransientState(false);
                        qVar.f781c.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                qVar.f781c.f(itemIdAtPosition, view);
            }
        }
    }

    public static a.e.a<Animator, b> o() {
        a.e.a<Animator, b> aVar = w.get();
        if (aVar != null) {
            return aVar;
        }
        a.e.a<Animator, b> aVar2 = new a.e.a<>();
        w.set(aVar2);
        return aVar2;
    }

    public static boolean t(p pVar, p pVar2, String str) {
        Object obj = pVar.f776a.get(str);
        Object obj2 = pVar2.f776a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(c cVar) {
        this.s = cVar;
    }

    public h B(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public void C(e eVar) {
        if (eVar == null) {
            eVar = v;
        }
        this.t = eVar;
    }

    public void D(m mVar) {
    }

    public h E(long j2) {
        this.f756b = j2;
        return this;
    }

    public void F() {
        if (this.n == 0) {
            ArrayList<d> arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).a(this);
                }
            }
            this.p = false;
        }
        this.n++;
    }

    public String G(String str) {
        StringBuilder d2 = b.a.a.a.a.d(str);
        d2.append(getClass().getSimpleName());
        d2.append("@");
        d2.append(Integer.toHexString(hashCode()));
        d2.append(": ");
        String sb = d2.toString();
        if (this.f757c != -1) {
            sb = sb + "dur(" + this.f757c + ") ";
        }
        if (this.f756b != -1) {
            sb = sb + "dly(" + this.f756b + ") ";
        }
        if (this.d != null) {
            sb = sb + "interp(" + this.d + ") ";
        }
        if (this.e.size() <= 0 && this.f.size() <= 0) {
            return sb;
        }
        String b2 = b.a.a.a.a.b(sb, "tgts(");
        if (this.e.size() > 0) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (i2 > 0) {
                    b2 = b.a.a.a.a.b(b2, ", ");
                }
                StringBuilder d3 = b.a.a.a.a.d(b2);
                d3.append(this.e.get(i2));
                b2 = d3.toString();
            }
        }
        if (this.f.size() > 0) {
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                if (i3 > 0) {
                    b2 = b.a.a.a.a.b(b2, ", ");
                }
                StringBuilder d4 = b.a.a.a.a.d(b2);
                d4.append(this.f.get(i3));
                b2 = d4.toString();
            }
        }
        return b.a.a.a.a.b(b2, ")");
    }

    public h a(d dVar) {
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        this.q.add(dVar);
        return this;
    }

    public h b(View view) {
        this.f.add(view);
        return this;
    }

    public abstract void d(p pVar);

    public final void e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                p pVar = new p();
                pVar.f777b = view;
                if (z) {
                    g(pVar);
                } else {
                    d(pVar);
                }
                pVar.f778c.add(this);
                f(pVar);
                c(z ? this.g : this.h, view, pVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    public void f(p pVar) {
    }

    public abstract void g(p pVar);

    public void h(ViewGroup viewGroup, boolean z) {
        i(z);
        if (this.e.size() > 0 || this.f.size() > 0) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.e.get(i2).intValue());
                if (findViewById != null) {
                    p pVar = new p();
                    pVar.f777b = findViewById;
                    if (z) {
                        g(pVar);
                    } else {
                        d(pVar);
                    }
                    pVar.f778c.add(this);
                    f(pVar);
                    c(z ? this.g : this.h, findViewById, pVar);
                }
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                View view = this.f.get(i3);
                p pVar2 = new p();
                pVar2.f777b = view;
                if (z) {
                    g(pVar2);
                } else {
                    d(pVar2);
                }
                pVar2.f778c.add(this);
                f(pVar2);
                c(z ? this.g : this.h, view, pVar2);
            }
            return;
        }
        e(viewGroup, z);
    }

    public void i(boolean z) {
        q qVar;
        if (z) {
            this.g.f779a.clear();
            this.g.f780b.clear();
            qVar = this.g;
        } else {
            this.h.f779a.clear();
            this.h.f780b.clear();
            qVar = this.h;
        }
        qVar.f781c.a();
    }

    /* renamed from: j */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.r = new ArrayList<>();
            hVar.g = new q();
            hVar.h = new q();
            hVar.k = null;
            hVar.l = null;
            return hVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        int i2;
        Animator k2;
        Animator animator;
        p pVar;
        View view;
        p pVar2;
        Animator animator2;
        a.e.a<Animator, b> o2 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            p pVar3 = arrayList.get(i3);
            p pVar4 = arrayList2.get(i3);
            if (pVar3 != null && !pVar3.f778c.contains(this)) {
                pVar3 = null;
            }
            if (pVar4 != null && !pVar4.f778c.contains(this)) {
                pVar4 = null;
            }
            if (!(pVar3 == null && pVar4 == null)) {
                if ((pVar3 == null || pVar4 == null || r(pVar3, pVar4)) && (k2 = k(viewGroup, pVar3, pVar4)) != null) {
                    if (pVar4 != null) {
                        View view2 = pVar4.f777b;
                        String[] p2 = p();
                        if (view2 == null || p2 == null || p2.length <= 0) {
                            i2 = size;
                            animator2 = k2;
                            pVar2 = null;
                        } else {
                            pVar2 = new p();
                            pVar2.f777b = view2;
                            p orDefault = qVar2.f779a.getOrDefault(view2, null);
                            if (orDefault != null) {
                                int i4 = 0;
                                while (i4 < p2.length) {
                                    pVar2.f776a.put(p2[i4], orDefault.f776a.get(p2[i4]));
                                    i4++;
                                    k2 = k2;
                                    size = size;
                                    orDefault = orDefault;
                                }
                            }
                            i2 = size;
                            int i5 = o2.f303c;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = k2;
                                    break;
                                }
                                b bVar = o2.get(o2.h(i6));
                                if (bVar.f760c != null && bVar.f758a == view2 && bVar.f759b.equals(this.f755a) && bVar.f760c.equals(pVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        }
                        view = view2;
                        animator = animator2;
                        pVar = pVar2;
                    } else {
                        i2 = size;
                        view = pVar3.f777b;
                        animator = k2;
                        pVar = null;
                    }
                    if (animator != null) {
                        String str = this.f755a;
                        x xVar = t.f783a;
                        o2.put(animator, new b(view, str, this, new a0(viewGroup), pVar));
                        this.r.add(animator);
                    }
                    i3++;
                    size = i2;
                }
            }
            i2 = size;
            i3++;
            size = i2;
        }
        for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
            Animator animator3 = this.r.get(sparseIntArray.keyAt(i7));
            animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
        }
    }

    public void m() {
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).b(this);
                }
            }
            for (int i4 = 0; i4 < this.g.f781c.g(); i4++) {
                View h2 = this.g.f781c.h(i4);
                if (h2 != null) {
                    WeakHashMap<View, r> weakHashMap = m.f516a;
                    h2.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.h.f781c.g(); i5++) {
                View h3 = this.h.f781c.h(i5);
                if (h3 != null) {
                    WeakHashMap<View, r> weakHashMap2 = m.f516a;
                    h3.setHasTransientState(false);
                }
            }
            this.p = true;
        }
    }

    public p n(View view, boolean z) {
        n nVar = this.i;
        if (nVar != null) {
            return nVar.n(view, z);
        }
        ArrayList<p> arrayList = z ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            p pVar = arrayList.get(i3);
            if (pVar == null) {
                return null;
            }
            if (pVar.f777b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z ? this.l : this.k).get(i2);
    }

    public String[] p() {
        return null;
    }

    public p q(View view, boolean z) {
        n nVar = this.i;
        if (nVar != null) {
            return nVar.q(view, z);
        }
        return (z ? this.g : this.h).f779a.getOrDefault(view, null);
    }

    public boolean r(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return false;
        }
        String[] p2 = p();
        if (p2 != null) {
            for (String str : p2) {
                if (!t(pVar, pVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : pVar.f776a.keySet()) {
            if (t(pVar, pVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean s(View view) {
        return (this.e.size() == 0 && this.f.size() == 0) || this.e.contains(Integer.valueOf(view.getId())) || this.f.contains(view);
    }

    public String toString() {
        return G("");
    }

    public void u(View view) {
        if (!this.p) {
            a.e.a<Animator, b> o2 = o();
            int i2 = o2.f303c;
            x xVar = t.f783a;
            a0 a0Var = new a0(view);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                b k2 = o2.k(i3);
                if (k2.f758a != null && a0Var.equals(k2.d)) {
                    o2.h(i3).pause();
                }
            }
            ArrayList<d> arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((d) arrayList2.get(i4)).c(this);
                }
            }
            this.o = true;
        }
    }

    public h v(d dVar) {
        ArrayList<d> arrayList = this.q;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.q.size() == 0) {
            this.q = null;
        }
        return this;
    }

    public h w(View view) {
        this.f.remove(view);
        return this;
    }

    public void x(View view) {
        if (this.o) {
            if (!this.p) {
                a.e.a<Animator, b> o2 = o();
                int i2 = o2.f303c;
                x xVar = t.f783a;
                a0 a0Var = new a0(view);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b k2 = o2.k(i3);
                    if (k2.f758a != null && a0Var.equals(k2.d)) {
                        o2.h(i3).resume();
                    }
                }
                ArrayList<d> arrayList = this.q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.q.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).d(this);
                    }
                }
            }
            this.o = false;
        }
    }

    public void y() {
        F();
        a.e.a<Animator, b> o2 = o();
        Iterator<Animator> it = this.r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o2.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new i(this, o2));
                    long j2 = this.f757c;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f756b;
                    if (j3 >= 0) {
                        next.setStartDelay(j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new j(this));
                    next.start();
                }
            }
        }
        this.r.clear();
        m();
    }

    public h z(long j2) {
        this.f757c = j2;
        return this;
    }
}
