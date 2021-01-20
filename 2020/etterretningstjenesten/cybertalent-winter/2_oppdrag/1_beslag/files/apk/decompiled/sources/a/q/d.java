package a.q;

import a.h.j.m;
import a.h.j.r;
import a.k.a.x;
import a.q.h;
import a.q.l;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class d extends x {

    public class a extends h.c {
        public a(d dVar, Rect rect) {
        }
    }

    public class b implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f750a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f751b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.f750a = view;
            this.f751b = arrayList;
        }

        @Override // a.q.h.d
        public void a(h hVar) {
        }

        @Override // a.q.h.d
        public void b(h hVar) {
            hVar.v(this);
            this.f750a.setVisibility(8);
            int size = this.f751b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f751b.get(i)).setVisibility(0);
            }
        }

        @Override // a.q.h.d
        public void c(h hVar) {
        }

        @Override // a.q.h.d
        public void d(h hVar) {
        }
    }

    public class c implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f752a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f753b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f754c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f752a = obj;
            this.f753b = arrayList;
            this.f754c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // a.q.h.d
        public void a(h hVar) {
            Object obj = this.f752a;
            if (obj != null) {
                d.this.m(obj, this.f753b, null);
            }
            Object obj2 = this.f754c;
            if (obj2 != null) {
                d.this.m(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                d.this.m(obj3, this.f, null);
            }
        }

        @Override // a.q.h.d
        public void b(h hVar) {
        }

        @Override // a.q.h.d
        public void c(h hVar) {
        }

        @Override // a.q.h.d
        public void d(h hVar) {
        }
    }

    /* renamed from: a.q.d$d  reason: collision with other inner class name */
    public class C0024d extends h.c {
        public C0024d(d dVar, Rect rect) {
        }
    }

    public static boolean u(h hVar) {
        return !x.j(hVar.e) || !x.j(null) || !x.j(null);
    }

    @Override // a.k.a.x
    public void a(Object obj, View view) {
        if (obj != null) {
            ((h) obj).b(view);
        }
    }

    @Override // a.k.a.x
    public void b(Object obj, ArrayList<View> arrayList) {
        h hVar = (h) obj;
        if (hVar != null) {
            int i = 0;
            if (hVar instanceof n) {
                n nVar = (n) hVar;
                int size = nVar.x.size();
                while (i < size) {
                    b(nVar.I(i), arrayList);
                    i++;
                }
            } else if (!u(hVar) && x.j(hVar.f)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    hVar.b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // a.k.a.x
    public void c(ViewGroup viewGroup, Object obj) {
        h hVar = (h) obj;
        if (!l.f766c.contains(viewGroup)) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (viewGroup.isLaidOut()) {
                l.f766c.add(viewGroup);
                h j = hVar.clone();
                ArrayList<h> orDefault = l.a().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<h> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().u(viewGroup);
                    }
                }
                if (j != null) {
                    j.h(viewGroup, true);
                }
                if (((g) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (j != null) {
                        l.a aVar = new l.a(j, viewGroup);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    @Override // a.k.a.x
    public boolean e(Object obj) {
        return obj instanceof h;
    }

    @Override // a.k.a.x
    public Object f(Object obj) {
        if (obj != null) {
            return ((h) obj).clone();
        }
        return null;
    }

    @Override // a.k.a.x
    public Object k(Object obj, Object obj2, Object obj3) {
        n nVar = new n();
        if (obj != null) {
            nVar.H((h) obj);
        }
        if (obj2 != null) {
            nVar.H((h) obj2);
        }
        if (obj3 != null) {
            nVar.H((h) obj3);
        }
        return nVar;
    }

    @Override // a.k.a.x
    public void l(Object obj, View view) {
        if (obj != null) {
            ((h) obj).w(view);
        }
    }

    @Override // a.k.a.x
    public void m(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        h hVar = (h) obj;
        int i = 0;
        if (hVar instanceof n) {
            n nVar = (n) hVar;
            int size = nVar.x.size();
            while (i < size) {
                m(nVar.I(i), arrayList, arrayList2);
                i++;
            }
        } else if (!u(hVar)) {
            ArrayList<View> arrayList3 = hVar.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    hVar.b(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        hVar.w(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // a.k.a.x
    public void n(Object obj, View view, ArrayList<View> arrayList) {
        ((h) obj).a(new b(this, view, arrayList));
    }

    @Override // a.k.a.x
    public void o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((h) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // a.k.a.x
    public void p(Object obj, Rect rect) {
        if (obj != null) {
            ((h) obj).A(new C0024d(this, rect));
        }
    }

    @Override // a.k.a.x
    public void q(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            i(view, rect);
            ((h) obj).A(new a(this, rect));
        }
    }

    @Override // a.k.a.x
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(nVar, arrayList);
    }

    @Override // a.k.a.x
    public void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.f.clear();
            nVar.f.addAll(arrayList2);
            m(nVar, arrayList, arrayList2);
        }
    }

    @Override // a.k.a.x
    public Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.H((h) obj);
        return nVar;
    }
}
