package a.f.b.i.l;

import a.f.b.i.d;
import a.f.b.i.e;
import b.a.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends m {
    public ArrayList<m> k = new ArrayList<>();
    public int l;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2 == 1) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    public c(d dVar, int i) {
        super(dVar);
        c cVar;
        m mVar;
        Iterator<m> it;
        int i2;
        this.f = i;
        d dVar2 = this.f368b;
        while (true) {
            d l2 = dVar2.l(this.f);
            if (l2 == null) {
                break;
            }
            dVar2 = l2;
        }
        this.f368b = dVar2;
        ArrayList<m> arrayList = this.k;
        int i3 = this.f;
        if (i3 == 0) {
            cVar = this;
            mVar = dVar2.d;
            arrayList.add(mVar);
            dVar2 = dVar2.k(cVar.f);
            if (dVar2 == null) {
                arrayList = cVar.k;
                int i4 = cVar.f;
                if (i4 != 0) {
                }
                mVar = dVar2.d;
                arrayList.add(mVar);
                dVar2 = dVar2.k(cVar.f);
                if (dVar2 == null) {
                    it = cVar.k.iterator();
                }
            }
            it = cVar.k.iterator();
            while (it.hasNext()) {
                m next = it.next();
                int i5 = cVar.f;
                if (i5 == 0) {
                    next.f368b.f343b = cVar;
                } else if (i5 == 1) {
                    next.f368b.f344c = cVar;
                }
            }
            if ((cVar.f != 0 && ((e) cVar.f368b.K).i0) && cVar.k.size() > 1) {
                ArrayList<m> arrayList2 = cVar.k;
                cVar.f368b = arrayList2.get(arrayList2.size() - 1).f368b;
            }
            if (cVar.f == 0) {
                i2 = cVar.f368b.Z;
            } else {
                i2 = cVar.f368b.a0;
            }
            cVar.l = i2;
        } else if (i3 == 1) {
            cVar = this;
            mVar = dVar2.e;
            arrayList.add(mVar);
            dVar2 = dVar2.k(cVar.f);
            if (dVar2 == null) {
            }
            it = cVar.k.iterator();
            while (it.hasNext()) {
            }
            ArrayList<m> arrayList22 = cVar.k;
            cVar.f368b = arrayList22.get(arrayList22.size() - 1).f368b;
            if (cVar.f == 0) {
            }
            cVar.l = i2;
        } else {
            cVar = this;
        }
        mVar = null;
        arrayList.add(mVar);
        dVar2 = dVar2.k(cVar.f);
        if (dVar2 == null) {
        }
        it = cVar.k.iterator();
        while (it.hasNext()) {
        }
        ArrayList<m> arrayList222 = cVar.k;
        cVar.f368b = arrayList222.get(arrayList222.size() - 1).f368b;
        if (cVar.f == 0) {
        }
        cVar.l = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dd  */
    @Override // a.f.b.i.l.m, a.f.b.i.l.d
    public void a(d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        d.a aVar;
        int i6;
        int i7;
        int i8;
        float f2;
        d.a aVar2;
        boolean z2;
        float f3;
        d.a aVar3;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        d.a aVar4 = d.a.MATCH_CONSTRAINT;
        f fVar = this.h;
        if (fVar.j) {
            f fVar2 = this.i;
            if (fVar2.j) {
                d dVar2 = this.f368b.K;
                boolean z4 = (dVar2 == null || !(dVar2 instanceof e)) ? false : ((e) dVar2).i0;
                int i14 = fVar2.g - fVar.g;
                int size = this.k.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    }
                    if (this.k.get(i15).f368b.X != 8) {
                        break;
                    }
                    i15++;
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (this.k.get(i17).f368b.X != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= 2) {
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i19 = 0;
                    i5 = 0;
                    i10 = 0;
                    i11 = 0;
                    f = 0.0f;
                    while (i19 < size) {
                        m mVar = this.k.get(i19);
                        d dVar3 = mVar.f368b;
                        if (dVar3.X != i2) {
                            i11++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += mVar.h.f;
                            }
                            g gVar = mVar.e;
                            int i20 = gVar.g;
                            boolean z5 = mVar.d != aVar4;
                            if (z5) {
                                int i21 = this.f;
                                i13 = i20;
                                if (i21 == 0 && !dVar3.d.e.j) {
                                    return;
                                }
                                if (i21 != 1 || dVar3.e.e.j) {
                                    z3 = z5;
                                } else {
                                    return;
                                }
                            } else {
                                i13 = i20;
                                z3 = z5;
                                if (mVar.f367a == 1 && i18 == 0) {
                                    i12 = gVar.m;
                                    i10++;
                                } else if (gVar.j) {
                                    i12 = i13;
                                }
                                z3 = true;
                                if (z3) {
                                    i10++;
                                    float f4 = dVar3.b0[this.f];
                                    if (f4 >= 0.0f) {
                                        f += f4;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -mVar.i.f;
                                }
                            }
                            i12 = i13;
                            if (z3) {
                            }
                            i5 += -mVar.i.f;
                        }
                        i19++;
                        i2 = 8;
                    }
                    if (i5 < i14 || i10 == 0) {
                        i3 = i10;
                        i4 = i11;
                    } else {
                        i18++;
                        i2 = 8;
                    }
                }
                i3 = i10;
                i4 = i11;
                int i22 = this.h.g;
                if (z4) {
                    i22 = this.i.g;
                }
                if (i5 > i14) {
                    int i23 = (int) ((((float) (i5 - i14)) / 2.0f) + 0.5f);
                    i22 = z4 ? i22 + i23 : i22 - i23;
                }
                if (i3 > 0) {
                    float f5 = (float) (i14 - i5);
                    int i24 = (int) ((f5 / ((float) i3)) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        m mVar2 = this.k.get(i25);
                        d dVar4 = mVar2.f368b;
                        if (dVar4.X != 8 && mVar2.d == aVar4) {
                            g gVar2 = mVar2.e;
                            if (!gVar2.j) {
                                if (f > 0.0f) {
                                    aVar3 = aVar4;
                                    i9 = (int) (((dVar4.b0[this.f] * f5) / f) + 0.5f);
                                } else {
                                    aVar3 = aVar4;
                                    i9 = i24;
                                }
                                if (this.f == 0) {
                                    int i27 = dVar4.n;
                                    f3 = f5;
                                    z2 = z4;
                                    int max = Math.max(dVar4.m, mVar2.f367a == 1 ? Math.min(i9, gVar2.m) : i9);
                                    if (i27 > 0) {
                                        max = Math.min(i27, max);
                                    }
                                    if (max != i9) {
                                        i26++;
                                        i9 = max;
                                    }
                                } else {
                                    z2 = z4;
                                    f3 = f5;
                                    int i28 = dVar4.q;
                                    int max2 = Math.max(dVar4.p, mVar2.f367a == 1 ? Math.min(i9, gVar2.m) : i9);
                                    if (i28 > 0) {
                                        max2 = Math.min(i28, max2);
                                    }
                                    if (max2 != i9) {
                                        i26++;
                                        i9 = max2;
                                    }
                                }
                                mVar2.e.c(i9);
                                i25++;
                                i24 = i24;
                                i5 = i5;
                                i22 = i22;
                                aVar4 = aVar3;
                                f5 = f3;
                                z4 = z2;
                            }
                        }
                        aVar3 = aVar4;
                        z2 = z4;
                        f3 = f5;
                        i25++;
                        i24 = i24;
                        i5 = i5;
                        i22 = i22;
                        aVar4 = aVar3;
                        f5 = f3;
                        z4 = z2;
                    }
                    aVar = aVar4;
                    z = z4;
                    i6 = i22;
                    if (i26 > 0) {
                        i3 -= i26;
                        int i29 = 0;
                        for (int i30 = 0; i30 < size; i30++) {
                            m mVar3 = this.k.get(i30);
                            if (mVar3.f368b.X != 8) {
                                if (i30 > 0 && i30 >= i15) {
                                    i29 += mVar3.h.f;
                                }
                                i29 += mVar3.e.g;
                                if (i30 < i16 && i30 < i) {
                                    i29 += -mVar3.i.f;
                                }
                            }
                        }
                        i5 = i29;
                    } else {
                        i5 = i5;
                    }
                    i7 = 2;
                    if (this.l == 2 && i26 == 0) {
                        i8 = 0;
                        this.l = 0;
                    } else {
                        i8 = 0;
                    }
                } else {
                    aVar = aVar4;
                    z = z4;
                    i6 = i22;
                    i8 = 0;
                    i7 = 2;
                }
                if (i5 > i14) {
                    this.l = i7;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.l = i7;
                }
                int i31 = this.l;
                if (i31 == 1) {
                    int i32 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i8;
                    if (i3 > 0) {
                        i32 = i8;
                    }
                    int i33 = i8;
                    int i34 = i6;
                    while (i33 < size) {
                        m mVar4 = this.k.get(z ? size - (i33 + 1) : i33);
                        if (mVar4.f368b.X == 8) {
                            mVar4.h.c(i34);
                            mVar4.i.c(i34);
                            aVar2 = aVar;
                        } else {
                            if (i33 > 0) {
                                i34 = z ? i34 - i32 : i34 + i32;
                            }
                            if (i33 > 0 && i33 >= i15) {
                                int i35 = mVar4.h.f;
                                i34 = z ? i34 - i35 : i34 + i35;
                            }
                            (z ? mVar4.i : mVar4.h).c(i34);
                            g gVar3 = mVar4.e;
                            int i36 = gVar3.g;
                            aVar2 = aVar;
                            if (mVar4.d == aVar2 && mVar4.f367a == 1) {
                                i36 = gVar3.m;
                            }
                            i34 = z ? i34 - i36 : i34 + i36;
                            (z ? mVar4.h : mVar4.i).c(i34);
                            mVar4.g = true;
                            if (i33 < i16 && i33 < i) {
                                int i37 = -mVar4.i.f;
                                i34 = z ? i34 - i37 : i34 + i37;
                            }
                        }
                        i33++;
                        aVar = aVar2;
                    }
                } else if (i31 == 0) {
                    int i38 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i38 = i8;
                    }
                    int i39 = i6;
                    for (int i40 = i8; i40 < size; i40++) {
                        m mVar5 = this.k.get(z ? size - (i40 + 1) : i40);
                        if (mVar5.f368b.X == 8) {
                            mVar5.h.c(i39);
                            mVar5.i.c(i39);
                        } else {
                            int i41 = z ? i39 - i38 : i39 + i38;
                            if (i40 > 0 && i40 >= i15) {
                                int i42 = mVar5.h.f;
                                i41 = z ? i41 - i42 : i41 + i42;
                            }
                            (z ? mVar5.i : mVar5.h).c(i41);
                            g gVar4 = mVar5.e;
                            int i43 = gVar4.g;
                            if (mVar5.d == aVar && mVar5.f367a == 1) {
                                i43 = Math.min(i43, gVar4.m);
                            }
                            i39 = z ? i41 - i43 : i41 + i43;
                            (z ? mVar5.h : mVar5.i).c(i39);
                            if (i40 < i16 && i40 < i) {
                                int i44 = -mVar5.i.f;
                                i39 = z ? i39 - i44 : i39 + i44;
                            }
                        }
                    }
                } else if (i31 == 2) {
                    if (this.f == 0) {
                        f2 = this.f368b.U;
                    } else {
                        f2 = this.f368b.V;
                    }
                    if (z) {
                        f2 = 1.0f - f2;
                    }
                    int i45 = (int) ((((float) (i14 - i5)) * f2) + 0.5f);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i8;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i8; i47 < size; i47++) {
                        m mVar6 = this.k.get(z ? size - (i47 + 1) : i47);
                        if (mVar6.f368b.X == 8) {
                            mVar6.h.c(i46);
                            mVar6.i.c(i46);
                        } else {
                            if (i47 > 0 && i47 >= i15) {
                                int i48 = mVar6.h.f;
                                i46 = z ? i46 - i48 : i46 + i48;
                            }
                            (z ? mVar6.i : mVar6.h).c(i46);
                            g gVar5 = mVar6.e;
                            int i49 = gVar5.g;
                            if (mVar6.d == aVar) {
                                if (mVar6.f367a == 1) {
                                    i49 = gVar5.m;
                                }
                            }
                            i46 = z ? i46 - i49 : i46 + i49;
                            (z ? mVar6.h : mVar6.i).c(i46);
                            if (i47 < i16 && i47 < i) {
                                int i50 = -mVar6.i.f;
                                i46 = z ? i46 - i50 : i46 + i50;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r1 != null) goto L_0x0078;
     */
    @Override // a.f.b.i.l.m
    public void d() {
        f i;
        int b2;
        Iterator<m> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size >= 1) {
            d dVar = this.k.get(0).f368b;
            d dVar2 = this.k.get(size - 1).f368b;
            if (this.f == 0) {
                a.f.b.i.c cVar = dVar.y;
                a.f.b.i.c cVar2 = dVar2.A;
                f i2 = i(cVar, 0);
                int b3 = cVar.b();
                d m = m();
                if (m != null) {
                    b3 = m.y.b();
                }
                if (i2 != null) {
                    f fVar = this.h;
                    fVar.l.add(i2);
                    fVar.f = b3;
                    i2.k.add(fVar);
                }
                i = i(cVar2, 0);
                b2 = cVar2.b();
                d n = n();
                if (n != null) {
                    b2 = n.A.b();
                }
            } else {
                a.f.b.i.c cVar3 = dVar.z;
                a.f.b.i.c cVar4 = dVar2.B;
                f i3 = i(cVar3, 1);
                int b4 = cVar3.b();
                d m2 = m();
                if (m2 != null) {
                    b4 = m2.z.b();
                }
                if (i3 != null) {
                    f fVar2 = this.h;
                    fVar2.l.add(i3);
                    fVar2.f = b4;
                    i3.k.add(fVar2);
                }
                i = i(cVar4, 1);
                b2 = cVar4.b();
                d n2 = n();
                if (n2 != null) {
                    b2 = n2.B.b();
                }
            }
            f fVar3 = this.i;
            fVar3.l.add(i);
            fVar3.f = -b2;
            i.k.add(fVar3);
            this.h.f358a = this;
            this.i.f358a = this;
        }
    }

    @Override // a.f.b.i.l.m
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // a.f.b.i.l.m
    public void f() {
        this.f369c = null;
        Iterator<m> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // a.f.b.i.l.m
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            m mVar = this.k.get(i);
            j = ((long) mVar.i.f) + mVar.j() + j + ((long) mVar.h.f);
        }
        return j;
    }

    @Override // a.f.b.i.l.m
    public boolean k() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).k()) {
                return false;
            }
        }
        return true;
    }

    public final d m() {
        for (int i = 0; i < this.k.size(); i++) {
            d dVar = this.k.get(i).f368b;
            if (dVar.X != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final d n() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            d dVar = this.k.get(size).f368b;
            if (dVar.X != 8) {
                return dVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder d = a.d("ChainRun ");
        d.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String sb = d.toString();
        Iterator<m> it = this.k.iterator();
        while (it.hasNext()) {
            String b2 = a.b(sb, "<");
            sb = a.b(b2 + it.next(), "> ");
        }
        return sb;
    }
}
