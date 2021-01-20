package a.q;

import a.e.e;
import a.q.h;
import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static h f764a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<a.e.a<ViewGroup, ArrayList<h>>>> f765b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f766c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public h f767b;

        /* renamed from: c  reason: collision with root package name */
        public ViewGroup f768c;

        /* renamed from: a.q.l$a$a  reason: collision with other inner class name */
        public class C0025a extends k {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a.e.a f769a;

            public C0025a(a.e.a aVar) {
                this.f769a = aVar;
            }

            @Override // a.q.h.d
            public void b(h hVar) {
                ((ArrayList) this.f769a.get(a.this.f768c)).remove(hVar);
            }
        }

        public a(h hVar, ViewGroup viewGroup) {
            this.f767b = hVar;
            this.f768c = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0249  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x01f6 A[EDGE_INSN: B:135:0x01f6->B:93:0x01f6 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01fb  */
        public boolean onPreDraw() {
            ArrayList arrayList;
            int i;
            h hVar;
            q qVar;
            a.e.a aVar;
            a.e.a aVar2;
            int i2;
            int[] iArr;
            int i3;
            int i4;
            int i5;
            h.b orDefault;
            q qVar2;
            p pVar;
            View view;
            View view2;
            View view3;
            q qVar3;
            this.f768c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f768c.removeOnAttachStateChangeListener(this);
            int i6 = 1;
            if (!l.f766c.remove(this.f768c)) {
                return true;
            }
            a.e.a<ViewGroup, ArrayList<h>> a2 = l.a();
            ArrayList<h> arrayList2 = a2.get(this.f768c);
            boolean z = false;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                a2.put(this.f768c, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList = new ArrayList(arrayList2);
                arrayList2.add(this.f767b);
                this.f767b.a(new C0025a(a2));
                i = 0;
                this.f767b.h(this.f768c, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).x(this.f768c);
                    }
                }
                hVar = this.f767b;
                ViewGroup viewGroup = this.f768c;
                Objects.requireNonNull(hVar);
                hVar.k = new ArrayList<>();
                hVar.l = new ArrayList<>();
                qVar = hVar.g;
                q qVar4 = hVar.h;
                aVar = new a.e.a(qVar.f779a);
                aVar2 = new a.e.a(qVar4.f779a);
                i2 = 0;
                while (true) {
                    iArr = hVar.j;
                    if (i2 < iArr.length) {
                        break;
                    }
                    int i7 = iArr[i2];
                    if (i7 == i6) {
                        qVar2 = qVar;
                        int i8 = aVar.f303c;
                        while (true) {
                            i8--;
                            if (i8 < 0) {
                                break;
                            }
                            View view4 = (View) aVar.h(i8);
                            if (!(view4 == null || !hVar.s(view4) || (pVar = (p) aVar2.remove(view4)) == null || (view = pVar.f777b) == null || !hVar.s(view))) {
                                hVar.k.add((p) aVar.i(i8));
                                hVar.l.add(pVar);
                            }
                        }
                    } else if (i7 == 2) {
                        qVar2 = qVar;
                        a.e.a<String, View> aVar3 = qVar2.d;
                        a.e.a<String, View> aVar4 = qVar4.d;
                        int i9 = aVar3.f303c;
                        for (int i10 = 0; i10 < i9; i10++) {
                            View k = aVar3.k(i10);
                            if (k != null && hVar.s(k) && (view2 = aVar4.get(aVar3.h(i10))) != null && hVar.s(view2)) {
                                p pVar2 = (p) aVar.getOrDefault(k, null);
                                p pVar3 = (p) aVar2.getOrDefault(view2, null);
                                if (!(pVar2 == null || pVar3 == null)) {
                                    hVar.k.add(pVar2);
                                    hVar.l.add(pVar3);
                                    aVar.remove(k);
                                    aVar2.remove(view2);
                                }
                            }
                        }
                    } else if (i7 != 3) {
                        if (i7 == 4) {
                            e<View> eVar = qVar.f781c;
                            e<View> eVar2 = qVar4.f781c;
                            int g = eVar.g();
                            int i11 = i;
                            while (i11 < g) {
                                View h = eVar.h(i11);
                                if (h == null || !hVar.s(h)) {
                                    qVar3 = qVar;
                                } else {
                                    if (eVar.f283a) {
                                        eVar.c();
                                    }
                                    qVar3 = qVar;
                                    View d = eVar2.d(eVar.f284b[i11]);
                                    if (d != null && hVar.s(d)) {
                                        p pVar4 = (p) aVar.getOrDefault(h, z);
                                        p pVar5 = (p) aVar2.getOrDefault(d, z);
                                        if (!(pVar4 == null || pVar5 == null)) {
                                            hVar.k.add(pVar4);
                                            hVar.l.add(pVar5);
                                            aVar.remove(h);
                                            aVar2.remove(d);
                                        }
                                    }
                                }
                                i11++;
                                qVar = qVar3;
                                z = false;
                            }
                        }
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        SparseArray<View> sparseArray = qVar2.f780b;
                        SparseArray<View> sparseArray2 = qVar4.f780b;
                        int size = sparseArray.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            View valueAt = sparseArray.valueAt(i12);
                            if (valueAt != null && hVar.s(valueAt) && (view3 = sparseArray2.get(sparseArray.keyAt(i12))) != null && hVar.s(view3)) {
                                p pVar6 = (p) aVar.getOrDefault(valueAt, null);
                                p pVar7 = (p) aVar2.getOrDefault(view3, null);
                                if (!(pVar6 == null || pVar7 == null)) {
                                    hVar.k.add(pVar6);
                                    hVar.l.add(pVar7);
                                    aVar.remove(valueAt);
                                    aVar2.remove(view3);
                                }
                            }
                        }
                    }
                    i2++;
                    qVar = qVar2;
                    i6 = 1;
                    z = false;
                    i = 0;
                }
                for (i3 = 0; i3 < aVar.f303c; i3++) {
                    p pVar8 = (p) aVar.k(i3);
                    if (hVar.s(pVar8.f777b)) {
                        hVar.k.add(pVar8);
                        hVar.l.add(null);
                    }
                }
                for (i4 = 0; i4 < aVar2.f303c; i4++) {
                    p pVar9 = (p) aVar2.k(i4);
                    if (hVar.s(pVar9.f777b)) {
                        hVar.l.add(pVar9);
                        hVar.k.add(null);
                    }
                }
                a.e.a<Animator, h.b> o = h.o();
                int i13 = o.f303c;
                x xVar = t.f783a;
                a0 a0Var = new a0(viewGroup);
                for (i5 = i13 - 1; i5 >= 0; i5--) {
                    Animator h2 = o.h(i5);
                    if (!(h2 == null || (orDefault = o.getOrDefault(h2, null)) == null || orDefault.f758a == null || !a0Var.equals(orDefault.d))) {
                        p pVar10 = orDefault.f760c;
                        View view5 = orDefault.f758a;
                        p q = hVar.q(view5, true);
                        p n = hVar.n(view5, true);
                        if (!(q == null && n == null) && orDefault.e.r(pVar10, n)) {
                            if (h2.isRunning() || h2.isStarted()) {
                                h2.cancel();
                            } else {
                                o.remove(h2);
                            }
                        }
                    }
                }
                hVar.l(viewGroup, hVar.g, hVar.h, hVar.k, hVar.l);
                hVar.y();
                return true;
            }
            arrayList = null;
            arrayList2.add(this.f767b);
            this.f767b.a(new C0025a(a2));
            i = 0;
            this.f767b.h(this.f768c, false);
            if (arrayList != null) {
            }
            hVar = this.f767b;
            ViewGroup viewGroup2 = this.f768c;
            Objects.requireNonNull(hVar);
            hVar.k = new ArrayList<>();
            hVar.l = new ArrayList<>();
            qVar = hVar.g;
            q qVar42 = hVar.h;
            aVar = new a.e.a(qVar.f779a);
            aVar2 = new a.e.a(qVar42.f779a);
            i2 = 0;
            while (true) {
                iArr = hVar.j;
                if (i2 < iArr.length) {
                }
                i2++;
                qVar = qVar2;
                i6 = 1;
                z = false;
                i = 0;
            }
            while (i3 < aVar.f303c) {
            }
            while (i4 < aVar2.f303c) {
            }
            a.e.a<Animator, h.b> o2 = h.o();
            int i132 = o2.f303c;
            x xVar2 = t.f783a;
            a0 a0Var2 = new a0(viewGroup2);
            while (i5 >= 0) {
            }
            hVar.l(viewGroup2, hVar.g, hVar.h, hVar.k, hVar.l);
            hVar.y();
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f768c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f768c.removeOnAttachStateChangeListener(this);
            l.f766c.remove(this.f768c);
            ArrayList<h> arrayList = l.a().get(this.f768c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<h> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().x(this.f768c);
                }
            }
            this.f767b.i(true);
        }
    }

    public static a.e.a<ViewGroup, ArrayList<h>> a() {
        a.e.a<ViewGroup, ArrayList<h>> aVar;
        WeakReference<a.e.a<ViewGroup, ArrayList<h>>> weakReference = f765b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        a.e.a<ViewGroup, ArrayList<h>> aVar2 = new a.e.a<>();
        f765b.set(new WeakReference<>(aVar2));
        return aVar2;
    }
}
