package a.k.a;

import a.e.g;
import a.h.j.l;
import a.h.j.m;
import a.h.j.r;
import a.k.a.n;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f610a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final x f611b = new t();

    /* renamed from: c  reason: collision with root package name */
    public static final x f612c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f613a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f614b;

        /* renamed from: c  reason: collision with root package name */
        public a f615c;
        public Fragment d;
        public boolean e;
        public a f;
    }

    static {
        x xVar;
        try {
            xVar = (x) Class.forName("a.q.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            xVar = null;
        }
        f612c = xVar;
    }

    public static void a(ArrayList<View> arrayList, a.e.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.f303c - 1; i >= 0; i--) {
            View k = aVar.k(i);
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (collection.contains(k.getTransitionName())) {
                arrayList.add(k);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r10.k != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0068, code lost:
        if (r10.y != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007c, code lost:
        if (r10.y == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public static void b(a aVar, n.a aVar2, SparseArray<a> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        a aVar3;
        j jVar;
        boolean z6;
        Fragment fragment = aVar2.f601b;
        if (fragment != null && (i = fragment.w) != 0) {
            int i2 = z ? f610a[aVar2.f600a] : aVar2.f600a;
            boolean z7 = false;
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    z5 = false;
                                    z4 = false;
                                    z3 = false;
                                    a aVar4 = sparseArray.get(i);
                                    if (z7) {
                                        if (aVar4 == null) {
                                            a aVar5 = new a();
                                            sparseArray.put(i, aVar5);
                                            aVar4 = aVar5;
                                        }
                                        aVar4.f613a = fragment;
                                        aVar4.f614b = z;
                                        aVar4.f615c = aVar;
                                    }
                                    aVar3 = aVar4;
                                    if (!z2 && z5) {
                                        if (aVar3 != null && aVar3.d == fragment) {
                                            aVar3.d = null;
                                        }
                                        jVar = aVar.q;
                                        if (fragment.f902b < 1 && jVar.o >= 1 && !aVar.p) {
                                            jVar.T(fragment);
                                            jVar.W(fragment, 1, 0, 0, false);
                                        }
                                    }
                                    if (z3 && (aVar3 == null || aVar3.d == null)) {
                                        if (aVar3 == null) {
                                            a aVar6 = new a();
                                            sparseArray.put(i, aVar6);
                                            aVar3 = aVar6;
                                        }
                                        aVar3.d = fragment;
                                        aVar3.e = z;
                                        aVar3.f = aVar;
                                    }
                                    if (!z2 && z4 && aVar3 != null && aVar3.f613a == fragment) {
                                        aVar3.f613a = null;
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if (z2) {
                            if (fragment.J) {
                                if (!fragment.y) {
                                }
                            }
                            z6 = false;
                            z4 = false;
                            z3 = false;
                            z7 = z6;
                            z5 = true;
                            a aVar42 = sparseArray.get(i);
                            if (z7) {
                            }
                            aVar3 = aVar42;
                            aVar3.d = null;
                            jVar = aVar.q;
                            jVar.T(fragment);
                            jVar.W(fragment, 1, 0, 0, false);
                            if (aVar3 == null) {
                            }
                            aVar3.d = fragment;
                            aVar3.e = z;
                            aVar3.f = aVar;
                            if (!z2) {
                                return;
                            }
                            return;
                        } else {
                            z6 = fragment.y;
                            z4 = false;
                            z3 = false;
                            z7 = z6;
                            z5 = true;
                            a aVar422 = sparseArray.get(i);
                            if (z7) {
                            }
                            aVar3 = aVar422;
                            aVar3.d = null;
                            jVar = aVar.q;
                            jVar.T(fragment);
                            jVar.W(fragment, 1, 0, 0, false);
                            if (aVar3 == null) {
                            }
                            aVar3.d = fragment;
                            aVar3.e = z;
                            aVar3.f = aVar;
                            if (!z2) {
                            }
                        }
                    } else if (!z2) {
                        boolean z8 = false;
                        z3 = z8;
                        z5 = false;
                        z4 = true;
                        a aVar4222 = sparseArray.get(i);
                        if (z7) {
                        }
                        aVar3 = aVar4222;
                        aVar3.d = null;
                        jVar = aVar.q;
                        jVar.T(fragment);
                        jVar.W(fragment, 1, 0, 0, false);
                        if (aVar3 == null) {
                        }
                        aVar3.d = fragment;
                        aVar3.e = z;
                        aVar3.f = aVar;
                        if (!z2) {
                        }
                    } else {
                        boolean z82 = false;
                        z3 = z82;
                        z5 = false;
                        z4 = true;
                        a aVar42222 = sparseArray.get(i);
                        if (z7) {
                        }
                        aVar3 = aVar42222;
                        aVar3.d = null;
                        jVar = aVar.q;
                        jVar.T(fragment);
                        jVar.W(fragment, 1, 0, 0, false);
                        if (aVar3 == null) {
                        }
                        aVar3.d = fragment;
                        aVar3.e = z;
                        aVar3.f = aVar;
                        if (!z2) {
                        }
                    }
                }
                boolean z9 = fragment.k;
                if (!z2) {
                    if (z9) {
                    }
                }
                boolean z822 = false;
                z3 = z822;
                z5 = false;
                z4 = true;
                a aVar422222 = sparseArray.get(i);
                if (z7) {
                }
                aVar3 = aVar422222;
                aVar3.d = null;
                jVar = aVar.q;
                jVar.T(fragment);
                jVar.W(fragment, 1, 0, 0, false);
                if (aVar3 == null) {
                }
                aVar3.d = fragment;
                aVar3.e = z;
                aVar3.f = aVar;
                if (!z2) {
                }
            }
            if (z2) {
                z6 = fragment.I;
                z4 = false;
                z3 = false;
                z7 = z6;
                z5 = true;
                a aVar4222222 = sparseArray.get(i);
                if (z7) {
                }
                aVar3 = aVar4222222;
                aVar3.d = null;
                jVar = aVar.q;
                jVar.T(fragment);
                jVar.W(fragment, 1, 0, 0, false);
                if (aVar3 == null) {
                }
                aVar3.d = fragment;
                aVar3.e = z;
                aVar3.f = aVar;
                if (!z2) {
                }
            } else {
                if (!fragment.k) {
                }
                z6 = false;
                z4 = false;
                z3 = false;
                z7 = z6;
                z5 = true;
                a aVar42222222 = sparseArray.get(i);
                if (z7) {
                }
                aVar3 = aVar42222222;
                aVar3.d = null;
                jVar = aVar.q;
                jVar.T(fragment);
                jVar.W(fragment, 1, 0, 0, false);
                if (aVar3 == null) {
                }
                aVar3.d = fragment;
                aVar3.e = z;
                aVar3.f = aVar;
                if (!z2) {
                }
            }
        }
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z, a.e.a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.j();
        } else {
            fragment.j();
        }
    }

    public static boolean d(x xVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!xVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static a.e.a<String, View> e(x xVar, a.e.a<String, String> aVar, Object obj, a aVar2) {
        Objects.requireNonNull(aVar2.f613a);
        aVar.isEmpty();
        aVar.clear();
        return null;
    }

    public static a.e.a<String, View> f(x xVar, a.e.a<String, String> aVar, Object obj, a aVar2) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.d;
        a.e.a<String, View> aVar3 = new a.e.a<>();
        xVar.h(aVar3, fragment.A());
        a aVar4 = aVar2.f;
        if (aVar2.e) {
            fragment.j();
            arrayList = aVar4.o;
        } else {
            arrayList = aVar4.n;
        }
        g.k(aVar3, arrayList);
        g.k(aVar, aVar3.keySet());
        return aVar3;
    }

    public static x g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.k();
            Object p = fragment.p();
            if (p != null) {
                arrayList.add(p);
            }
            Object r = fragment.r();
            if (r != null) {
                arrayList.add(r);
            }
        }
        if (fragment2 != null) {
            fragment2.i();
            Object o = fragment2.o();
            if (o != null) {
                arrayList.add(o);
            }
            fragment2.q();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        x xVar = f611b;
        if (d(xVar, arrayList)) {
            return xVar;
        }
        x xVar2 = f612c;
        if (xVar2 != null && d(xVar2, arrayList)) {
            return xVar2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> h(x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        Objects.requireNonNull(fragment);
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        xVar.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object i(x xVar, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.o();
        } else {
            fragment.i();
        }
        return xVar.f(obj);
    }

    public static Object j(x xVar, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.p();
        } else {
            fragment.k();
        }
        return xVar.f(obj);
    }

    public static View k(a.e.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a aVar3 = aVar2.f615c;
        if (obj == null || aVar == null || (arrayList = aVar3.n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar3.n : aVar3.o).get(0));
    }

    public static Object l(x xVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (z) {
            obj = fragment2.r();
        } else {
            fragment.q();
            obj = null;
        }
        return xVar.t(xVar.f(obj));
    }

    public static void m(x xVar, Object obj, Object obj2, a.e.a<String, View> aVar, boolean z, a aVar2) {
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.o : aVar2.n).get(0));
            xVar.q(obj, view);
            if (obj2 != null) {
                xVar.q(obj2, view);
            }
        }
    }

    public static void n(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0433 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0210 A[ADDED_TO_REGION] */
    public static void o(j jVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        SparseArray sparseArray;
        int i3;
        int i4;
        int i5;
        int i6;
        Fragment fragment;
        Fragment fragment2;
        x g;
        ArrayList<View> arrayList3;
        Object obj;
        ArrayList<View> arrayList4;
        Fragment fragment3;
        Fragment fragment4;
        Object obj2;
        Object obj3;
        a.e.a aVar;
        Object k;
        Object obj4;
        Fragment fragment5;
        boolean z2;
        ArrayList<View> arrayList5;
        Fragment fragment6;
        Rect rect;
        Fragment fragment7;
        Fragment fragment8;
        x g2;
        ArrayList<View> arrayList6;
        a.e.a aVar2;
        Fragment fragment9;
        Object obj5;
        Object k2;
        a.e.a aVar3;
        Rect rect2;
        View view;
        j jVar2 = jVar;
        ArrayList<a> arrayList7 = arrayList;
        ArrayList<Boolean> arrayList8 = arrayList2;
        int i7 = i2;
        boolean z3 = z;
        if (jVar2.o >= 1) {
            SparseArray sparseArray2 = new SparseArray();
            for (int i8 = i; i8 < i7; i8++) {
                a aVar4 = arrayList7.get(i8);
                if (!arrayList8.get(i8).booleanValue()) {
                    int size = aVar4.f597a.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        b(aVar4, aVar4.f597a.get(i9), sparseArray2, false, z3);
                    }
                } else if (aVar4.q.q.c()) {
                    for (int size2 = aVar4.f597a.size() - 1; size2 >= 0; size2--) {
                        b(aVar4, aVar4.f597a.get(size2), sparseArray2, true, z3);
                    }
                }
            }
            if (sparseArray2.size() != 0) {
                View view2 = new View(jVar2.p.f579c);
                int size3 = sparseArray2.size();
                int i10 = 0;
                while (i10 < size3) {
                    int keyAt = sparseArray2.keyAt(i10);
                    a.e.a aVar5 = new a.e.a();
                    int i11 = i7 - 1;
                    while (i11 >= i) {
                        a aVar6 = arrayList7.get(i11);
                        if (aVar6.e(keyAt)) {
                            boolean booleanValue = arrayList8.get(i11).booleanValue();
                            ArrayList<String> arrayList9 = aVar6.n;
                            if (arrayList9 != null) {
                                ArrayList<String> arrayList10 = aVar6.n;
                                ArrayList<String> arrayList11 = aVar6.o;
                                if (!booleanValue) {
                                    arrayList11 = arrayList10;
                                    arrayList10 = arrayList11;
                                }
                                int i12 = 0;
                                for (int size4 = arrayList9.size(); i12 < size4; size4 = size4) {
                                    String str = arrayList11.get(i12);
                                    String str2 = arrayList10.get(i12);
                                    String str3 = (String) aVar5.remove(str2);
                                    if (str3 != null) {
                                        aVar5.put(str, str3);
                                    } else {
                                        aVar5.put(str, str2);
                                    }
                                    i12++;
                                }
                            }
                        }
                        i11--;
                        arrayList7 = arrayList;
                        arrayList8 = arrayList2;
                    }
                    a aVar7 = (a) sparseArray2.valueAt(i10);
                    if (z3) {
                        ViewGroup viewGroup = jVar2.q.c() ? (ViewGroup) jVar2.q.b(keyAt) : null;
                        if (viewGroup == null || (g2 = g((fragment8 = aVar7.d), (fragment7 = aVar7.f613a))) == null) {
                            sparseArray = sparseArray2;
                            i6 = i10;
                            i5 = size3;
                        } else {
                            boolean z4 = aVar7.f614b;
                            boolean z5 = aVar7.e;
                            ArrayList<View> arrayList12 = new ArrayList<>();
                            ArrayList<View> arrayList13 = new ArrayList<>();
                            Object i13 = i(g2, fragment7, z4);
                            Object j = j(g2, fragment8, z5);
                            sparseArray = sparseArray2;
                            Fragment fragment10 = aVar7.f613a;
                            Fragment fragment11 = aVar7.d;
                            i6 = i10;
                            if (fragment10 != null) {
                                i5 = size3;
                                fragment10.A().setVisibility(0);
                            } else {
                                i5 = size3;
                            }
                            if (fragment10 == null || fragment11 == null) {
                                arrayList6 = arrayList12;
                                fragment9 = fragment7;
                            } else {
                                boolean z6 = aVar7.f614b;
                                Object l = aVar5.isEmpty() ? null : l(g2, fragment10, fragment11, z6);
                                a.e.a<String, View> f = f(g2, aVar5, l, aVar7);
                                fragment9 = fragment7;
                                a.e.a<String, View> e = e(g2, aVar5, l, aVar7);
                                if (aVar5.isEmpty()) {
                                    if (f != null) {
                                        f.clear();
                                    }
                                    if (e != null) {
                                        e.clear();
                                    }
                                    obj5 = null;
                                } else {
                                    a(arrayList13, f, aVar5.keySet());
                                    a(arrayList12, e, aVar5.values());
                                    obj5 = l;
                                }
                                if (i13 == null && j == null && obj5 == null) {
                                    arrayList6 = arrayList12;
                                } else {
                                    aVar2 = aVar5;
                                    c(fragment10, fragment11, z6, f, true);
                                    if (obj5 != null) {
                                        arrayList12.add(view2);
                                        g2.r(obj5, view2, arrayList13);
                                        arrayList6 = arrayList12;
                                        m(g2, obj5, j, f, aVar7.e, aVar7.f);
                                        Rect rect3 = new Rect();
                                        View k3 = k(e, aVar7, i13, z6);
                                        if (k3 != null) {
                                            g2.p(i13, rect3);
                                        }
                                        rect2 = rect3;
                                        view = k3;
                                    } else {
                                        arrayList6 = arrayList12;
                                        view = null;
                                        rect2 = null;
                                    }
                                    l.a(viewGroup, new q(fragment10, fragment11, z6, e, view, g2, rect2));
                                    if (!(i13 == null && obj5 == null && j == null)) {
                                        ArrayList<View> h = h(g2, j, fragment8, arrayList13, view2);
                                        ArrayList<View> h2 = h(g2, i13, fragment9, arrayList6, view2);
                                        n(h2, 4);
                                        k2 = g2.k(j, i13, obj5);
                                        if (k2 != null) {
                                            if (fragment8 != null && j != null && fragment8.k && fragment8.y && fragment8.J) {
                                                fragment8.E(true);
                                                g2.n(j, null, h);
                                                l.a(fragment8.D, new o(h));
                                            }
                                            ArrayList arrayList14 = new ArrayList();
                                            int size5 = arrayList6.size();
                                            for (int i14 = 0; i14 < size5; i14++) {
                                                View view3 = arrayList6.get(i14);
                                                WeakHashMap<View, r> weakHashMap = m.f516a;
                                                arrayList14.add(view3.getTransitionName());
                                                view3.setTransitionName(null);
                                            }
                                            g2.o(k2, i13, h2, j, h, obj5, arrayList6);
                                            g2.c(viewGroup, k2);
                                            int size6 = arrayList6.size();
                                            ArrayList arrayList15 = new ArrayList();
                                            int i15 = 0;
                                            while (i15 < size6) {
                                                View view4 = arrayList13.get(i15);
                                                WeakHashMap<View, r> weakHashMap2 = m.f516a;
                                                String transitionName = view4.getTransitionName();
                                                arrayList15.add(transitionName);
                                                if (transitionName == null) {
                                                    aVar3 = aVar2;
                                                } else {
                                                    view4.setTransitionName(null);
                                                    aVar3 = aVar2;
                                                    String str4 = (String) aVar3.getOrDefault(transitionName, null);
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i16 >= size6) {
                                                            break;
                                                        } else if (str4.equals(arrayList14.get(i16))) {
                                                            arrayList6.get(i16).setTransitionName(transitionName);
                                                            break;
                                                        } else {
                                                            i16++;
                                                        }
                                                    }
                                                }
                                                i15++;
                                                aVar2 = aVar3;
                                            }
                                            l.a(viewGroup, new u(g2, size6, arrayList6, arrayList14, arrayList13, arrayList15));
                                            n(h2, 0);
                                            g2.s(obj5, arrayList13, arrayList6);
                                        }
                                    }
                                }
                            }
                            aVar2 = aVar5;
                            obj5 = null;
                            ArrayList<View> h3 = h(g2, j, fragment8, arrayList13, view2);
                            ArrayList<View> h22 = h(g2, i13, fragment9, arrayList6, view2);
                            n(h22, 4);
                            k2 = g2.k(j, i13, obj5);
                            if (k2 != null) {
                            }
                        }
                    } else {
                        sparseArray = sparseArray2;
                        i6 = i10;
                        i5 = size3;
                        ViewGroup viewGroup2 = jVar2.q.c() ? (ViewGroup) jVar2.q.b(keyAt) : null;
                        if (!(viewGroup2 == null || (g = g((fragment2 = aVar7.d), (fragment = aVar7.f613a))) == null)) {
                            boolean z7 = aVar7.f614b;
                            boolean z8 = aVar7.e;
                            Object i17 = i(g, fragment, z7);
                            Object j2 = j(g, fragment2, z8);
                            ArrayList<View> arrayList16 = new ArrayList<>();
                            ArrayList<View> arrayList17 = new ArrayList<>();
                            Fragment fragment12 = aVar7.f613a;
                            Fragment fragment13 = aVar7.d;
                            if (!(fragment12 == null || fragment13 == null)) {
                                boolean z9 = aVar7.f614b;
                                Object l2 = aVar5.isEmpty() ? null : l(g, fragment12, fragment13, z9);
                                a.e.a<String, View> f2 = f(g, aVar5, l2, aVar7);
                                if (aVar5.isEmpty()) {
                                    obj4 = null;
                                } else {
                                    arrayList16.addAll(f2.values());
                                    obj4 = l2;
                                }
                                if (!(i17 == null && j2 == null && obj4 == null)) {
                                    fragment4 = fragment;
                                    c(fragment12, fragment13, z9, f2, true);
                                    if (obj4 != null) {
                                        rect = new Rect();
                                        g.r(obj4, view2, arrayList16);
                                        fragment6 = fragment12;
                                        arrayList5 = arrayList17;
                                        z2 = z9;
                                        fragment5 = fragment13;
                                        m(g, obj4, j2, f2, aVar7.e, aVar7.f);
                                        if (i17 != null) {
                                            g.p(i17, rect);
                                        }
                                    } else {
                                        fragment6 = fragment12;
                                        arrayList5 = arrayList17;
                                        z2 = z9;
                                        fragment5 = fragment13;
                                        rect = null;
                                    }
                                    fragment3 = fragment2;
                                    obj2 = j2;
                                    aVar = aVar5;
                                    arrayList4 = arrayList16;
                                    i4 = i6;
                                    obj = null;
                                    arrayList3 = arrayList5;
                                    i3 = i5;
                                    l.a(viewGroup2, new r(g, aVar5, obj4, aVar7, arrayList5, view2, fragment6, fragment5, z2, arrayList4, i17, rect));
                                    obj3 = obj4;
                                    if (i17 != null && obj3 == null && obj2 == null) {
                                        i10 = i4 + 1;
                                        jVar2 = jVar;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        i7 = i2;
                                        z3 = z;
                                        size3 = i3;
                                        sparseArray2 = sparseArray;
                                    } else {
                                        ArrayList<View> h4 = h(g, obj2, fragment3, arrayList4, view2);
                                        if (h4 == null || h4.isEmpty()) {
                                            obj2 = obj;
                                        }
                                        g.a(i17, view2);
                                        k = g.k(obj2, i17, obj3);
                                        if (k == null) {
                                            ArrayList<View> arrayList18 = new ArrayList<>();
                                            g.o(k, i17, arrayList18, obj2, h4, obj3, arrayList3);
                                            l.a(viewGroup2, new p(i17, g, view2, fragment4, arrayList3, arrayList18, h4, obj2));
                                            l.a(viewGroup2, new v(g, arrayList3, aVar));
                                            g.c(viewGroup2, k);
                                            l.a(viewGroup2, new w(g, arrayList3, aVar));
                                        }
                                        i10 = i4 + 1;
                                        jVar2 = jVar;
                                        arrayList7 = arrayList;
                                        arrayList8 = arrayList2;
                                        i7 = i2;
                                        z3 = z;
                                        size3 = i3;
                                        sparseArray2 = sparseArray;
                                    }
                                }
                            }
                            fragment4 = fragment;
                            fragment3 = fragment2;
                            arrayList3 = arrayList17;
                            arrayList4 = arrayList16;
                            obj2 = j2;
                            aVar = aVar5;
                            i4 = i6;
                            i3 = i5;
                            obj = null;
                            obj3 = null;
                            if (i17 != null) {
                            }
                            ArrayList<View> h42 = h(g, obj2, fragment3, arrayList4, view2);
                            obj2 = obj;
                            g.a(i17, view2);
                            k = g.k(obj2, i17, obj3);
                            if (k == null) {
                            }
                            i10 = i4 + 1;
                            jVar2 = jVar;
                            arrayList7 = arrayList;
                            arrayList8 = arrayList2;
                            i7 = i2;
                            z3 = z;
                            size3 = i3;
                            sparseArray2 = sparseArray;
                        }
                    }
                    i4 = i6;
                    i3 = i5;
                    i10 = i4 + 1;
                    jVar2 = jVar;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                    i7 = i2;
                    z3 = z;
                    size3 = i3;
                    sparseArray2 = sparseArray;
                }
            }
        }
    }
}
