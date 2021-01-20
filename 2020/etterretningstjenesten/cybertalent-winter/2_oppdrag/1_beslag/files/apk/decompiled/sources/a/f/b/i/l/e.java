package a.f.b.i.l;

import a.f.b.i.c;
import a.f.b.i.d;
import a.f.b.i.f;
import a.f.b.i.h;
import a.f.b.i.l.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public a.f.b.i.e f355a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f356b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f357c = true;
    public a.f.b.i.e d;
    public ArrayList<m> e = new ArrayList<>();
    public b.AbstractC0008b f;
    public b.a g;
    public ArrayList<k> h;

    public e(a.f.b.i.e eVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.f355a = eVar;
        this.d = eVar;
    }

    public final void a(f fVar, int i, int i2, f fVar2, ArrayList<k> arrayList, k kVar) {
        m mVar = fVar.d;
        if (mVar.f369c == null) {
            a.f.b.i.e eVar = this.f355a;
            if (!(mVar == eVar.d || mVar == eVar.e)) {
                if (kVar == null) {
                    kVar = new k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f369c = kVar;
                kVar.f366b.add(mVar);
                for (d dVar : mVar.h.k) {
                    if (dVar instanceof f) {
                        a((f) dVar, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (d dVar2 : mVar.i.k) {
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof l)) {
                    for (d dVar3 : ((l) mVar).k.k) {
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (f fVar3 : mVar.h.l) {
                    a(fVar3, i, 0, fVar2, arrayList, kVar);
                }
                for (f fVar4 : mVar.i.l) {
                    a(fVar4, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof l)) {
                    for (f fVar5 : ((l) mVar).k.l) {
                        a(fVar5, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ec, code lost:
        if (r2[3].d != null) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r15.k == 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013c, code lost:
        if (r7[1].d != null) goto L_0x0163;
     */
    public final boolean b(a.f.b.i.e eVar) {
        g gVar;
        int i;
        int o;
        int i2;
        e eVar2;
        d dVar;
        d.a aVar;
        int o2;
        int i3;
        e eVar3;
        d dVar2;
        d.a aVar2;
        d.a aVar3;
        int i4;
        d.a aVar4;
        int i5;
        d.a aVar5;
        d.a aVar6 = d.a.MATCH_CONSTRAINT;
        d.a aVar7 = d.a.WRAP_CONTENT;
        d.a aVar8 = d.a.FIXED;
        Iterator<d> it = eVar.e0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            d.a[] aVarArr = next.J;
            d.a aVar9 = aVarArr[0];
            d.a aVar10 = aVarArr[1];
            if (next.X != 8) {
                float f2 = next.o;
                if (f2 < 1.0f && aVar9 == aVar6) {
                    next.j = 2;
                }
                float f3 = next.r;
                if (f3 < 1.0f && aVar10 == aVar6) {
                    next.k = 2;
                }
                if (next.N > 0.0f) {
                    if (aVar9 == aVar6 && (aVar10 == aVar7 || aVar10 == aVar8)) {
                        next.j = 3;
                    } else {
                        if (!(aVar10 == aVar6 && (aVar9 == aVar7 || aVar9 == aVar8))) {
                            if (aVar9 == aVar6 && aVar10 == aVar6) {
                                if (next.j == 0) {
                                    next.j = 3;
                                }
                            }
                        }
                        next.k = 3;
                    }
                }
                if (aVar9 == aVar6 && next.j == 1 && (next.y.d == null || next.A.d == null)) {
                    aVar9 = aVar7;
                }
                d.a aVar11 = (aVar10 == aVar6 && next.k == 1 && (next.z.d == null || next.B.d == null)) ? aVar7 : aVar10;
                j jVar = next.d;
                jVar.d = aVar9;
                int i6 = next.j;
                jVar.f367a = i6;
                l lVar = next.e;
                lVar.d = aVar11;
                int i7 = next.k;
                lVar.f367a = i7;
                d.a aVar12 = d.a.MATCH_PARENT;
                if ((aVar9 == aVar12 || aVar9 == aVar8 || aVar9 == aVar7) && (aVar11 == aVar12 || aVar11 == aVar8 || aVar11 == aVar7)) {
                    int o3 = next.o();
                    if (aVar9 == aVar12) {
                        i4 = (eVar.o() - next.y.e) - next.A.e;
                        aVar4 = aVar8;
                    } else {
                        aVar4 = aVar9;
                        i4 = o3;
                    }
                    int i8 = next.i();
                    if (aVar11 == aVar12) {
                        i5 = (eVar.i() - next.z.e) - next.B.e;
                        aVar5 = aVar8;
                    } else {
                        i5 = i8;
                        aVar5 = aVar11;
                    }
                    f(next, aVar4, i4, aVar5, i5);
                    next.d.e.c(next.o());
                    next.e.e.c(next.i());
                    next.f342a = true;
                } else {
                    if (aVar9 == aVar6 && (aVar11 == aVar7 || aVar11 == aVar8)) {
                        if (i6 == 3) {
                            if (aVar11 == aVar7) {
                                f(next, aVar7, 0, aVar7, 0);
                            }
                            i3 = next.i();
                            o2 = (int) ((((float) i3) * next.N) + 0.5f);
                            eVar3 = this;
                            dVar2 = next;
                            aVar2 = aVar8;
                            aVar3 = aVar8;
                        } else if (i6 == 1) {
                            f(next, aVar7, 0, aVar11, 0);
                            gVar = next.d.e;
                            i = next.o();
                            gVar.m = i;
                        } else if (i6 == 2) {
                            d.a[] aVarArr2 = eVar.J;
                            if (aVarArr2[0] == aVar8 || aVarArr2[0] == aVar12) {
                                o2 = (int) ((f2 * ((float) eVar.o())) + 0.5f);
                                i3 = next.i();
                                eVar3 = this;
                                dVar2 = next;
                                aVar2 = aVar8;
                                aVar3 = aVar11;
                            }
                        } else {
                            c[] cVarArr = next.G;
                            if (cVarArr[0].d != null) {
                            }
                            o = 0;
                            i2 = 0;
                            eVar2 = this;
                            dVar = next;
                            aVar9 = aVar7;
                            aVar = aVar11;
                            eVar2.f(dVar, aVar9, o, aVar, i2);
                            next.d.e.c(next.o());
                            next.e.e.c(next.i());
                            next.f342a = true;
                        }
                        eVar3.f(dVar2, aVar2, o2, aVar3, i3);
                        next.d.e.c(next.o());
                        next.e.e.c(next.i());
                    }
                    if (aVar11 == aVar6 && (aVar9 == aVar7 || aVar9 == aVar8)) {
                        if (i7 == 3) {
                            if (aVar9 == aVar7) {
                                f(next, aVar7, 0, aVar7, 0);
                            }
                            int o4 = next.o();
                            float f4 = next.N;
                            if (next.O == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(next, aVar8, o4, aVar8, (int) ((((float) o4) * f4) + 0.5f));
                            next.d.e.c(next.o());
                            next.e.e.c(next.i());
                            next.f342a = true;
                        } else if (i7 == 1) {
                            f(next, aVar9, 0, aVar7, 0);
                            gVar = next.e.e;
                            i = next.i();
                            gVar.m = i;
                        } else if (i7 == 2) {
                            d.a[] aVarArr3 = eVar.J;
                            if (aVarArr3[1] == aVar8 || aVarArr3[1] == aVar12) {
                                o = next.o();
                                i2 = (int) ((f3 * ((float) eVar.i())) + 0.5f);
                                eVar2 = this;
                                dVar = next;
                                aVar = aVar8;
                                eVar2.f(dVar, aVar9, o, aVar, i2);
                                next.d.e.c(next.o());
                                next.e.e.c(next.i());
                                next.f342a = true;
                            }
                        } else {
                            c[] cVarArr2 = next.G;
                            if (cVarArr2[2].d != null) {
                            }
                            o = 0;
                            i2 = 0;
                            eVar2 = this;
                            dVar = next;
                            aVar9 = aVar7;
                            aVar = aVar11;
                            eVar2.f(dVar, aVar9, o, aVar, i2);
                            next.d.e.c(next.o());
                            next.e.e.c(next.i());
                            next.f342a = true;
                        }
                    }
                    if (aVar9 == aVar6 && aVar11 == aVar6) {
                        if (i6 == 1 || i7 == 1) {
                            f(next, aVar7, 0, aVar7, 0);
                            next.d.e.m = next.o();
                            gVar = next.e.e;
                            i = next.i();
                            gVar.m = i;
                        } else if (i7 == 2 && i6 == 2) {
                            d.a[] aVarArr4 = eVar.J;
                            if ((aVarArr4[0] == aVar8 || aVarArr4[0] == aVar8) && (aVarArr4[1] == aVar8 || aVarArr4[1] == aVar8)) {
                                f(next, aVar8, (int) ((f2 * ((float) eVar.o())) + 0.5f), aVar8, (int) ((f3 * ((float) eVar.i())) + 0.5f));
                                next.d.e.c(next.o());
                                next.e.e.c(next.i());
                                next.f342a = true;
                            }
                        }
                    }
                }
            }
            next.f342a = true;
        }
        return false;
    }

    public void c() {
        m mVar;
        ArrayList<m> arrayList = this.e;
        arrayList.clear();
        this.d.d.f();
        this.d.e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        Iterator<d> it = this.d.e0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof f) {
                mVar = new h(next);
            } else {
                if (next.s()) {
                    if (next.f343b == null) {
                        next.f343b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f343b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.t()) {
                    if (next.f344c == null) {
                        next.f344c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f344c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof h) {
                    mVar = new i(next);
                }
            }
            arrayList.add(mVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f368b != this.d) {
                next2.d();
            }
        }
        this.h.clear();
        k.f364c = 0;
        e(this.f355a.d, 0, this.h);
        e(this.f355a.e, 1, this.h);
        this.f356b = false;
    }

    public final int d(a.f.b.i.e eVar, int i) {
        long j;
        long j2;
        e eVar2 = this;
        a.f.b.i.e eVar3 = eVar;
        int size = eVar2.h.size();
        long j3 = 0;
        int i2 = 0;
        long j4 = 0;
        while (i2 < size) {
            k kVar = eVar2.h.get(i2);
            m mVar = kVar.f365a;
            if (mVar instanceof c) {
                if (((c) mVar).f != i) {
                    j4 = Math.max(j4, j3);
                    i2++;
                    eVar2 = this;
                    eVar3 = eVar;
                    j3 = 0;
                }
            } else if (i == 0) {
                if (!(mVar instanceof j)) {
                    j4 = Math.max(j4, j3);
                    i2++;
                    eVar2 = this;
                    eVar3 = eVar;
                    j3 = 0;
                }
            } else if (!(mVar instanceof l)) {
                j4 = Math.max(j4, j3);
                i2++;
                eVar2 = this;
                eVar3 = eVar;
                j3 = 0;
            }
            f fVar = (i == 0 ? eVar3.d : eVar3.e).h;
            f fVar2 = (i == 0 ? eVar3.d : eVar3.e).i;
            boolean contains = mVar.h.l.contains(fVar);
            boolean contains2 = kVar.f365a.i.l.contains(fVar2);
            long j5 = kVar.f365a.j();
            if (!contains || !contains2) {
                m mVar2 = kVar.f365a;
                if (contains) {
                    f fVar3 = mVar2.h;
                    j2 = kVar.b(fVar3, (long) fVar3.f);
                    j = ((long) kVar.f365a.h.f) + j5;
                } else if (contains2) {
                    f fVar4 = mVar2.i;
                    long a2 = kVar.a(fVar4, (long) fVar4.f);
                    j = ((long) (-kVar.f365a.i.f)) + j5;
                    j2 = -a2;
                } else {
                    j3 = (mVar2.j() + ((long) mVar2.h.f)) - ((long) kVar.f365a.i.f);
                    j4 = Math.max(j4, j3);
                    i2++;
                    eVar2 = this;
                    eVar3 = eVar;
                    j3 = 0;
                }
                j3 = Math.max(j2, j);
                j4 = Math.max(j4, j3);
                i2++;
                eVar2 = this;
                eVar3 = eVar;
                j3 = 0;
            } else {
                long b2 = kVar.b(kVar.f365a.h, j3);
                long a3 = kVar.a(kVar.f365a.i, j3);
                long j6 = b2 - j5;
                m mVar3 = kVar.f365a;
                int i3 = mVar3.i.f;
                if (j6 >= ((long) (-i3))) {
                    j6 += (long) i3;
                }
                long j7 = (long) mVar3.h.f;
                long j8 = ((-a3) - j5) - j7;
                if (j8 >= j7) {
                    j8 -= j7;
                }
                d dVar = mVar3.f368b;
                Objects.requireNonNull(dVar);
                float f2 = i == 0 ? dVar.U : i == 1 ? dVar.V : -1.0f;
                float f3 = (float) (f2 > 0.0f ? (long) ((((float) j6) / (1.0f - f2)) + (((float) j8) / f2)) : 0);
                long j9 = ((long) ((f3 * f2) + 0.5f)) + j5 + ((long) (((1.0f - f2) * f3) + 0.5f));
                m mVar4 = kVar.f365a;
                j3 = (((long) mVar4.h.f) + j9) - ((long) mVar4.i.f);
                j4 = Math.max(j4, j3);
                i2++;
                eVar2 = this;
                eVar3 = eVar;
                j3 = 0;
            }
        }
        return (int) j4;
    }

    public final void e(m mVar, int i, ArrayList<k> arrayList) {
        for (d dVar : mVar.h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, mVar.i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).h, i, 0, mVar.i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, mVar.h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).i, i, 1, mVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((l) mVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(d dVar, d.a aVar, int i, d.a aVar2, int i2) {
        b.a aVar3 = this.g;
        aVar3.f352a = aVar;
        aVar3.f353b = aVar2;
        aVar3.f354c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) this.f).a(dVar, aVar3);
        dVar.B(this.g.e);
        dVar.w(this.g.f);
        b.a aVar4 = this.g;
        dVar.w = aVar4.h;
        int i3 = aVar4.g;
        dVar.R = i3;
        dVar.w = i3 > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r12 == r7) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        r0.c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r10 == r7) goto L_0x0073;
     */
    public void g() {
        g gVar;
        g gVar2;
        int o;
        d.a aVar = d.a.FIXED;
        d.a aVar2 = d.a.MATCH_CONSTRAINT;
        Iterator<d> it = this.f355a.e0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (!next.f342a) {
                d.a[] aVarArr = next.J;
                boolean z = false;
                d.a aVar3 = aVarArr[0];
                d.a aVar4 = aVarArr[1];
                int i = next.j;
                int i2 = next.k;
                d.a aVar5 = d.a.WRAP_CONTENT;
                boolean z2 = aVar3 == aVar5 || (aVar3 == aVar2 && i == 1);
                if (aVar4 == aVar5 || (aVar4 == aVar2 && i2 == 1)) {
                    z = true;
                }
                g gVar3 = next.d.e;
                boolean z3 = gVar3.j;
                g gVar4 = next.e.e;
                boolean z4 = gVar4.j;
                if (!z3 || !z4) {
                    if (!z3 || !z) {
                        if (z4 && z2) {
                            f(next, aVar5, gVar3.g, aVar, gVar4.g);
                            gVar2 = next.d.e;
                            o = next.o();
                        }
                        if (next.f342a && (gVar = next.e.l) != null) {
                            gVar.c(next.R);
                        }
                    } else {
                        f(next, aVar, gVar3.g, aVar5, gVar4.g);
                        gVar2 = next.e.e;
                        o = next.i();
                    }
                    gVar2.m = o;
                    gVar.c(next.R);
                } else {
                    f(next, aVar, gVar3.g, aVar, gVar4.g);
                }
                next.f342a = true;
                gVar.c(next.R);
            }
        }
    }
}
