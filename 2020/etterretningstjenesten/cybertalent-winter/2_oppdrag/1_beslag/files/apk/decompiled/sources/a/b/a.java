package a.b;

import a.b.g.c1;
import a.f.b.d;
import a.f.b.g;
import a.f.b.i.b;
import a.f.b.i.c;
import a.f.b.i.d;
import a.f.b.i.e;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;

public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02c0, code lost:
        if (r3[r16].d.f337b == r9) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r4[r2].d.f337b == r5) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05fb  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x072c  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0732  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0735  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x074a  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x05d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014d  */
    public static void a(e eVar, d dVar, int i) {
        int i2;
        b[] bVarArr;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        a.f.b.i.d dVar2;
        int i6;
        a.f.b.i.d dVar3;
        a.f.b.i.d dVar4;
        c cVar;
        int i7;
        c cVar2;
        g gVar;
        g gVar2;
        int i8;
        a.f.b.i.d dVar5;
        c cVar3;
        c cVar4;
        c cVar5;
        int i9;
        int i10;
        a.f.b.i.d dVar6;
        int i11;
        int i12;
        a.f.b.i.d dVar7;
        a.f.b.i.d dVar8;
        g gVar3;
        g gVar4;
        c cVar6;
        c cVar7;
        a.f.b.i.d dVar9;
        a.f.b.i.d dVar10;
        int b2;
        c cVar8;
        g gVar5;
        c cVar9;
        g gVar6;
        int i13;
        c cVar10;
        int size;
        int i14;
        ArrayList<a.f.b.i.d> arrayList;
        int i15;
        float f;
        d.a aVar;
        g gVar7;
        int i16;
        int i17;
        g gVar8;
        a.f.b.i.d dVar11;
        int i18;
        boolean z6;
        b[] bVarArr2;
        a.f.b.i.d dVar12;
        a.f.b.i.d dVar13;
        int i19;
        boolean z7;
        boolean z8;
        boolean z9;
        int i20;
        boolean z10;
        c cVar11;
        a.f.b.i.d dVar14;
        e eVar2 = eVar;
        d.a aVar2 = d.a.MATCH_CONSTRAINT;
        int i21 = 2;
        if (i == 0) {
            i3 = eVar2.m0;
            bVarArr = eVar2.p0;
            i2 = 0;
        } else {
            i3 = eVar2.n0;
            bVarArr = eVar2.o0;
            i2 = 2;
        }
        int i22 = 0;
        while (i22 < i3) {
            b bVar = bVarArr[i22];
            g gVar9 = null;
            int i23 = 8;
            int i24 = 1;
            if (!bVar.t) {
                int i25 = bVar.o * i21;
                a.f.b.i.d dVar15 = bVar.f333a;
                a.f.b.i.d dVar16 = dVar15;
                boolean z11 = false;
                while (!z11) {
                    bVar.i += i24;
                    a.f.b.i.d[] dVarArr = dVar15.d0;
                    int i26 = bVar.o;
                    dVarArr[i26] = null;
                    dVar15.c0[i26] = null;
                    if (dVar15.X != i23) {
                        bVar.l += i24;
                        if (dVar15.h(i26) != aVar2) {
                            int i27 = bVar.m;
                            int i28 = bVar.o;
                            bVar.m = i27 + (i28 == 0 ? dVar15.o() : i28 == i24 ? dVar15.i() : 0);
                        }
                        int b3 = dVar15.G[i25].b() + bVar.m;
                        bVar.m = b3;
                        int i29 = i25 + 1;
                        bVar.m = dVar15.G[i29].b() + b3;
                        int b4 = dVar15.G[i25].b() + bVar.n;
                        bVar.n = b4;
                        bVar.n = dVar15.G[i29].b() + b4;
                        if (bVar.f334b == null) {
                            bVar.f334b = dVar15;
                        }
                        bVar.d = dVar15;
                        d.a[] aVarArr = dVar15.J;
                        int i30 = bVar.o;
                        if (aVarArr[i30] == aVar2) {
                            int[] iArr = dVar15.l;
                            if (iArr[i30] == 0 || iArr[i30] == 3 || iArr[i30] == 2) {
                                bVar.j++;
                                float[] fArr = dVar15.b0;
                                float f2 = fArr[i30];
                                if (f2 > 0.0f) {
                                    z10 = z11;
                                    bVar.k += fArr[i30];
                                } else {
                                    z10 = z11;
                                }
                                if (dVar15.X != 8 && aVarArr[i30] == aVar2 && (iArr[i30] == 0 || iArr[i30] == 3)) {
                                    if (f2 < 0.0f) {
                                        bVar.q = true;
                                    } else {
                                        bVar.r = true;
                                    }
                                    if (bVar.h == null) {
                                        bVar.h = new ArrayList<>();
                                    }
                                    bVar.h.add(dVar15);
                                }
                                if (bVar.f == null) {
                                    bVar.f = dVar15;
                                }
                                a.f.b.i.d dVar17 = bVar.g;
                                if (dVar17 != null) {
                                    dVar17.c0[bVar.o] = dVar15;
                                }
                                bVar.g = dVar15;
                            } else {
                                z10 = z11;
                            }
                            int i31 = bVar.o;
                            if (dVar16 != dVar15) {
                                dVar16.d0[bVar.o] = dVar15;
                            }
                            cVar11 = dVar15.G[i25 + 1].d;
                            if (cVar11 != null) {
                                dVar14 = cVar11.f337b;
                                c[] cVarArr = dVar14.G;
                                if (cVarArr[i25].d != null) {
                                }
                            }
                            dVar14 = null;
                            if (dVar14 == null) {
                                z11 = z10;
                            } else {
                                dVar14 = dVar15;
                                z11 = true;
                            }
                            dVar16 = dVar15;
                            i24 = 1;
                            i23 = 8;
                            dVar15 = dVar14;
                        }
                    }
                    z10 = z11;
                    if (dVar16 != dVar15) {
                    }
                    cVar11 = dVar15.G[i25 + 1].d;
                    if (cVar11 != null) {
                    }
                    dVar14 = null;
                    if (dVar14 == null) {
                    }
                    dVar16 = dVar15;
                    i24 = 1;
                    i23 = 8;
                    dVar15 = dVar14;
                }
                a.f.b.i.d dVar18 = bVar.f334b;
                if (dVar18 != null) {
                    bVar.m -= dVar18.G[i25].b();
                }
                a.f.b.i.d dVar19 = bVar.d;
                if (dVar19 != null) {
                    bVar.m -= dVar19.G[i25 + 1].b();
                }
                bVar.f335c = dVar15;
                if (bVar.o != 0 || !bVar.p) {
                    bVar.e = bVar.f333a;
                } else {
                    bVar.e = dVar15;
                }
                bVar.s = bVar.r && bVar.q;
                z = true;
            } else {
                z = true;
            }
            bVar.t = z;
            a.f.b.i.d dVar20 = bVar.f333a;
            a.f.b.i.d dVar21 = bVar.f335c;
            a.f.b.i.d dVar22 = bVar.f334b;
            a.f.b.i.d dVar23 = bVar.d;
            a.f.b.i.d dVar24 = bVar.e;
            float f3 = bVar.k;
            boolean z12 = eVar2.J[i] == d.a.WRAP_CONTENT;
            if (i == 0) {
                int i32 = dVar24.Z;
                boolean z13 = i32 == 0;
                if (i32 == 1) {
                    z7 = true;
                    i4 = i22;
                    i20 = 2;
                } else {
                    i4 = i22;
                    i20 = 2;
                    z7 = false;
                }
                if (i32 == i20) {
                    z9 = z13;
                } else {
                    z8 = z13;
                    z2 = z7;
                    z3 = z8;
                    z4 = false;
                    a.f.b.i.d dVar25 = dVar20;
                    z5 = false;
                    while (!z5) {
                        c cVar12 = dVar25.G[i2];
                        int i33 = z4 ? 1 : 4;
                        int b5 = cVar12.b();
                        if (dVar25.J[i] == aVar2 && dVar25.l[i] == 0) {
                            i18 = i3;
                            z6 = true;
                        } else {
                            i18 = i3;
                            z6 = false;
                        }
                        c cVar13 = cVar12.d;
                        if (!(cVar13 == null || dVar25 == dVar20)) {
                            b5 = cVar13.b() + b5;
                        }
                        if (!z4 || dVar25 == dVar20 || dVar25 == dVar22) {
                            bVarArr2 = bVarArr;
                        } else {
                            bVarArr2 = bVarArr;
                            i33 = 5;
                        }
                        c cVar14 = cVar12.d;
                        if (cVar14 != null) {
                            if (dVar25 == dVar22) {
                                dVar12 = dVar20;
                                dVar.f(cVar12.g, cVar14.g, b5, 6);
                            } else {
                                dVar12 = dVar20;
                                dVar.f(cVar12.g, cVar14.g, b5, 8);
                            }
                            dVar.d(cVar12.g, cVar12.d.g, b5, (!z6 || z4) ? i33 : 5);
                        } else {
                            dVar12 = dVar20;
                        }
                        if (z12) {
                            if (dVar25.X == 8 || dVar25.J[i] != aVar2) {
                                i19 = 0;
                            } else {
                                c[] cVarArr2 = dVar25.G;
                                i19 = 0;
                                dVar.f(cVarArr2[i2 + 1].g, cVarArr2[i2].g, 0, 5);
                            }
                            dVar.f(dVar25.G[i2].g, eVar2.G[i2].g, i19, 8);
                        }
                        c cVar15 = dVar25.G[i2 + 1].d;
                        if (cVar15 != null) {
                            dVar13 = cVar15.f337b;
                            c[] cVarArr3 = dVar13.G;
                            if (cVarArr3[i2].d != null) {
                            }
                        }
                        dVar13 = null;
                        if (dVar13 != null) {
                            dVar25 = dVar13;
                            z5 = z5;
                        } else {
                            z5 = true;
                        }
                        bVarArr = bVarArr2;
                        i3 = i18;
                        dVar24 = dVar24;
                        dVar20 = dVar12;
                    }
                    if (dVar23 != null) {
                        int i34 = i2 + 1;
                        if (dVar21.G[i34].d != null) {
                            c cVar16 = dVar23.G[i34];
                            if ((dVar23.J[i] == aVar2 && dVar23.l[i] == 0) && !z4) {
                                c cVar17 = cVar16.d;
                                if (cVar17.f337b == eVar2) {
                                    dVar.d(cVar16.g, cVar17.g, -cVar16.b(), 5);
                                    dVar.g(cVar16.g, dVar21.G[i34].d.g, -cVar16.b(), 6);
                                    if (z12) {
                                        int i35 = i2 + 1;
                                        g gVar10 = eVar2.G[i35].g;
                                        c[] cVarArr4 = dVar21.G;
                                        dVar.f(gVar10, cVarArr4[i35].g, cVarArr4[i35].b(), 8);
                                    }
                                    ArrayList<a.f.b.i.d> arrayList2 = bVar.h;
                                    if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                        float f4 = (bVar.q || bVar.s) ? f3 : (float) bVar.j;
                                        a.f.b.i.d dVar26 = null;
                                        float f5 = 0.0f;
                                        i14 = 0;
                                        while (i14 < size) {
                                            a.f.b.i.d dVar27 = arrayList2.get(i14);
                                            float f6 = dVar27.b0[i];
                                            if (f6 < 0.0f) {
                                                if (bVar.s) {
                                                    c[] cVarArr5 = dVar27.G;
                                                    g gVar11 = cVarArr5[i2 + 1].g;
                                                    gVar8 = cVarArr5[i2].g;
                                                    aVar = aVar2;
                                                    gVar7 = gVar11;
                                                    i17 = 0;
                                                    i16 = 4;
                                                    dVar.d(gVar7, gVar8, i17, i16);
                                                    arrayList = arrayList2;
                                                    i15 = size;
                                                    f = f4;
                                                    i14++;
                                                    aVar2 = aVar;
                                                    f4 = f;
                                                    size = i15;
                                                    arrayList2 = arrayList;
                                                } else {
                                                    f6 = 1.0f;
                                                }
                                            }
                                            int i36 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                                            if (i36 == 0) {
                                                c[] cVarArr6 = dVar27.G;
                                                g gVar12 = cVarArr6[i2 + 1].g;
                                                gVar8 = cVarArr6[i2].g;
                                                aVar = aVar2;
                                                gVar7 = gVar12;
                                                i17 = 0;
                                                i16 = 8;
                                                dVar.d(gVar7, gVar8, i17, i16);
                                                arrayList = arrayList2;
                                                i15 = size;
                                                f = f4;
                                                i14++;
                                                aVar2 = aVar;
                                                f4 = f;
                                                size = i15;
                                                arrayList2 = arrayList;
                                            } else {
                                                aVar = aVar2;
                                                if (dVar26 != null) {
                                                    c[] cVarArr7 = dVar26.G;
                                                    g gVar13 = cVarArr7[i2].g;
                                                    int i37 = i2 + 1;
                                                    g gVar14 = cVarArr7[i37].g;
                                                    c[] cVarArr8 = dVar27.G;
                                                    arrayList = arrayList2;
                                                    g gVar15 = cVarArr8[i2].g;
                                                    g gVar16 = cVarArr8[i37].g;
                                                    i15 = size;
                                                    a.f.b.b m = dVar.m();
                                                    dVar11 = dVar27;
                                                    m.f312b = 0.0f;
                                                    if (f4 == 0.0f || f5 == f6) {
                                                        f = f4;
                                                        m.d.j(gVar13, 1.0f);
                                                        m.d.j(gVar14, -1.0f);
                                                        m.d.j(gVar16, 1.0f);
                                                        m.d.j(gVar15, -1.0f);
                                                    } else {
                                                        if (f5 == 0.0f) {
                                                            m.d.j(gVar13, 1.0f);
                                                            m.d.j(gVar14, -1.0f);
                                                        } else if (i36 == 0) {
                                                            m.d.j(gVar15, 1.0f);
                                                            m.d.j(gVar16, -1.0f);
                                                        } else {
                                                            float f7 = (f5 / f4) / (f6 / f4);
                                                            f = f4;
                                                            m.d.j(gVar13, 1.0f);
                                                            m.d.j(gVar14, -1.0f);
                                                            m.d.j(gVar16, f7);
                                                            m.d.j(gVar15, -f7);
                                                        }
                                                        f = f4;
                                                    }
                                                    dVar.c(m);
                                                } else {
                                                    arrayList = arrayList2;
                                                    i15 = size;
                                                    f = f4;
                                                    dVar11 = dVar27;
                                                }
                                                f5 = f6;
                                                dVar26 = dVar11;
                                                i14++;
                                                aVar2 = aVar;
                                                f4 = f;
                                                size = i15;
                                                arrayList2 = arrayList;
                                            }
                                        }
                                    }
                                    if (dVar22 != null || (dVar22 != dVar23 && !z4)) {
                                        dVar4 = dVar23;
                                        dVar3 = dVar22;
                                        i8 = i4;
                                        i6 = 2;
                                        if (z3 || dVar3 == null) {
                                            int i38 = 8;
                                            if (z2 && dVar3 != null) {
                                                int i39 = bVar.j;
                                                boolean z14 = i39 <= 0 && bVar.i == i39;
                                                a.f.b.i.d dVar28 = dVar3;
                                                dVar5 = dVar28;
                                                while (dVar5 != null) {
                                                    a.f.b.i.d dVar29 = dVar5.d0[i];
                                                    while (dVar29 != null && dVar29.X == i38) {
                                                        dVar29 = dVar29.d0[i];
                                                    }
                                                    if (dVar5 == dVar3 || dVar5 == dVar4 || dVar29 == null) {
                                                        dVar6 = dVar28;
                                                        i11 = i8;
                                                        i12 = i38;
                                                        dVar7 = dVar29;
                                                    } else {
                                                        a.f.b.i.d dVar30 = dVar29 == dVar4 ? null : dVar29;
                                                        c cVar18 = dVar5.G[i2];
                                                        g gVar17 = cVar18.g;
                                                        int i40 = i2 + 1;
                                                        g gVar18 = dVar28.G[i40].g;
                                                        int b6 = cVar18.b();
                                                        int b7 = dVar5.G[i40].b();
                                                        if (dVar30 != null) {
                                                            cVar6 = dVar30.G[i2];
                                                            gVar3 = cVar6.g;
                                                            dVar8 = dVar30;
                                                            cVar7 = cVar6.d;
                                                            if (cVar7 == null) {
                                                                gVar4 = null;
                                                                int b8 = cVar6 == null ? cVar6.b() + b7 : b7;
                                                                int b9 = dVar28.G[i40].b() + b6;
                                                                int i41 = !z14 ? 8 : 4;
                                                                if (gVar17 != null || gVar18 == null || gVar3 == null || gVar4 == null) {
                                                                    dVar6 = dVar28;
                                                                    i11 = i8;
                                                                    i12 = 8;
                                                                } else {
                                                                    dVar6 = dVar28;
                                                                    i11 = i8;
                                                                    i12 = 8;
                                                                    dVar.b(gVar17, gVar18, b9, 0.5f, gVar3, gVar4, b8, i41);
                                                                }
                                                                dVar7 = dVar8;
                                                            }
                                                        } else {
                                                            dVar8 = dVar30;
                                                            cVar6 = dVar4.G[i2];
                                                            gVar3 = cVar6 != null ? cVar6.g : null;
                                                            cVar7 = dVar5.G[i40];
                                                        }
                                                        gVar4 = cVar7.g;
                                                        if (cVar6 == null) {
                                                        }
                                                        int b92 = dVar28.G[i40].b() + b6;
                                                        if (!z14) {
                                                        }
                                                        if (gVar17 != null) {
                                                        }
                                                        dVar6 = dVar28;
                                                        i11 = i8;
                                                        i12 = 8;
                                                        dVar7 = dVar8;
                                                    }
                                                    if (dVar5.X == i12) {
                                                        dVar5 = dVar6;
                                                    }
                                                    i38 = i12;
                                                    i8 = i11;
                                                    dVar5 = dVar7;
                                                    dVar28 = dVar5;
                                                }
                                                i5 = i8;
                                                c cVar19 = dVar3.G[i2];
                                                cVar3 = dVar20.G[i2].d;
                                                int i42 = i2 + 1;
                                                cVar4 = dVar4.G[i42];
                                                cVar5 = dVar21.G[i42].d;
                                                if (cVar3 == null) {
                                                    if (dVar3 != dVar4) {
                                                        i10 = 5;
                                                        dVar.d(cVar19.g, cVar3.g, cVar19.b(), 5);
                                                    } else {
                                                        i10 = 5;
                                                        if (cVar5 != null) {
                                                            dVar2 = dVar21;
                                                            i9 = 5;
                                                            dVar.b(cVar19.g, cVar3.g, cVar19.b(), 0.5f, cVar4.g, cVar5.g, cVar4.b(), 5);
                                                        }
                                                    }
                                                    dVar2 = dVar21;
                                                    i9 = i10;
                                                } else {
                                                    dVar2 = dVar21;
                                                    i9 = 5;
                                                }
                                                if (!(cVar5 == null || dVar3 == dVar4)) {
                                                    dVar.d(cVar4.g, cVar5.g, -cVar4.b(), i9);
                                                }
                                                if (!((!z3 && !z2) || dVar3 == null || dVar3 == dVar4)) {
                                                    c[] cVarArr9 = dVar3.G;
                                                    cVar = cVarArr9[i2];
                                                    i7 = i2 + 1;
                                                    cVar2 = dVar4.G[i7];
                                                    c cVar20 = cVar.d;
                                                    gVar = cVar20 != null ? cVar20.g : null;
                                                    c cVar21 = cVar2.d;
                                                    g gVar19 = cVar21 != null ? cVar21.g : null;
                                                    if (dVar2 != dVar4) {
                                                        c cVar22 = dVar2.G[i7].d;
                                                        if (cVar22 != null) {
                                                            gVar9 = cVar22.g;
                                                        }
                                                        gVar2 = gVar9;
                                                    } else {
                                                        gVar2 = gVar19;
                                                    }
                                                    if (dVar3 == dVar4) {
                                                        cVar = cVarArr9[i2];
                                                        cVar2 = cVarArr9[i7];
                                                    }
                                                    if (!(gVar == null || gVar2 == null)) {
                                                        dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
                                                    }
                                                }
                                                i22 = i5 + 1;
                                                eVar2 = eVar;
                                                aVar2 = aVar2;
                                                i21 = i6;
                                                bVarArr = bVarArr;
                                                i3 = i3;
                                            }
                                        } else {
                                            int i43 = bVar.j;
                                            boolean z15 = i43 > 0 && bVar.i == i43;
                                            a.f.b.i.d dVar31 = dVar3;
                                            a.f.b.i.d dVar32 = dVar31;
                                            while (dVar32 != null) {
                                                a.f.b.i.d dVar33 = dVar32.d0[i];
                                                while (true) {
                                                    if (dVar33 != null) {
                                                        if (dVar33.X != 8) {
                                                            break;
                                                        }
                                                        dVar33 = dVar33.d0[i];
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                if (dVar33 != null || dVar32 == dVar4) {
                                                    c cVar23 = dVar32.G[i2];
                                                    g gVar20 = cVar23.g;
                                                    c cVar24 = cVar23.d;
                                                    g gVar21 = cVar24 != null ? cVar24.g : null;
                                                    if (dVar31 != dVar32) {
                                                        cVar10 = dVar31.G[i2 + 1];
                                                    } else {
                                                        if (dVar32 == dVar3 && dVar31 == dVar32) {
                                                            c[] cVarArr10 = dVar20.G;
                                                            if (cVarArr10[i2].d != null) {
                                                                cVar10 = cVarArr10[i2].d;
                                                            } else {
                                                                gVar21 = null;
                                                            }
                                                        }
                                                        b2 = cVar23.b();
                                                        int i44 = i2 + 1;
                                                        int b10 = dVar32.G[i44].b();
                                                        if (dVar33 == null) {
                                                            c cVar25 = dVar33.G[i2];
                                                            gVar5 = cVar25.g;
                                                            cVar8 = cVar25;
                                                            cVar9 = dVar32.G[i44];
                                                        } else {
                                                            c cVar26 = dVar21.G[i44].d;
                                                            if (cVar26 != null) {
                                                                gVar5 = cVar26.g;
                                                                cVar8 = cVar26;
                                                            } else {
                                                                cVar8 = cVar26;
                                                                gVar5 = null;
                                                            }
                                                            cVar9 = dVar32.G[i44];
                                                        }
                                                        gVar6 = cVar9.g;
                                                        if (cVar8 != null) {
                                                            b10 += cVar8.b();
                                                        }
                                                        i13 = b10;
                                                        if (dVar31 != null) {
                                                            b2 += dVar31.G[i44].b();
                                                        }
                                                        if (!(gVar20 == null || gVar21 == null || gVar5 == null || gVar6 == null)) {
                                                            if (dVar32 == dVar3) {
                                                                b2 = dVar3.G[i2].b();
                                                            }
                                                            if (dVar32 == dVar4) {
                                                                i13 = dVar4.G[i44].b();
                                                            }
                                                            dVar10 = dVar33;
                                                            dVar9 = dVar31;
                                                            dVar.b(gVar20, gVar21, b2, 0.5f, gVar5, gVar6, i13, !z15 ? 8 : 5);
                                                            if (dVar32.X != 8) {
                                                                dVar9 = dVar32;
                                                            }
                                                            dVar32 = dVar10;
                                                            dVar31 = dVar9;
                                                        }
                                                    }
                                                    gVar21 = cVar10.g;
                                                    b2 = cVar23.b();
                                                    int i442 = i2 + 1;
                                                    int b102 = dVar32.G[i442].b();
                                                    if (dVar33 == null) {
                                                    }
                                                    gVar6 = cVar9.g;
                                                    if (cVar8 != null) {
                                                    }
                                                    i13 = b102;
                                                    if (dVar31 != null) {
                                                    }
                                                    if (dVar32 == dVar3) {
                                                    }
                                                    if (dVar32 == dVar4) {
                                                    }
                                                    dVar10 = dVar33;
                                                    dVar9 = dVar31;
                                                    dVar.b(gVar20, gVar21, b2, 0.5f, gVar5, gVar6, i13, !z15 ? 8 : 5);
                                                    if (dVar32.X != 8) {
                                                    }
                                                    dVar32 = dVar10;
                                                    dVar31 = dVar9;
                                                }
                                                dVar10 = dVar33;
                                                dVar9 = dVar31;
                                                if (dVar32.X != 8) {
                                                }
                                                dVar32 = dVar10;
                                                dVar31 = dVar9;
                                            }
                                        }
                                    } else {
                                        c cVar27 = dVar20.G[i2];
                                        int i45 = i2 + 1;
                                        c cVar28 = dVar21.G[i45];
                                        c cVar29 = cVar27.d;
                                        g gVar22 = cVar29 != null ? cVar29.g : null;
                                        c cVar30 = cVar28.d;
                                        g gVar23 = cVar30 != null ? cVar30.g : null;
                                        c cVar31 = dVar22.G[i2];
                                        c cVar32 = dVar23.G[i45];
                                        if (gVar22 == null || gVar23 == null) {
                                            dVar4 = dVar23;
                                            dVar3 = dVar22;
                                            i8 = i4;
                                            i6 = 2;
                                        } else {
                                            dVar4 = dVar23;
                                            dVar3 = dVar22;
                                            i8 = i4;
                                            i6 = 2;
                                            dVar.b(cVar31.g, gVar22, cVar31.b(), i == 0 ? dVar24.U : dVar24.V, gVar23, cVar32.g, cVar32.b(), 7);
                                        }
                                    }
                                    dVar2 = dVar21;
                                    i5 = i8;
                                    c[] cVarArr92 = dVar3.G;
                                    cVar = cVarArr92[i2];
                                    i7 = i2 + 1;
                                    cVar2 = dVar4.G[i7];
                                    c cVar202 = cVar.d;
                                    if (cVar202 != null) {
                                    }
                                    c cVar212 = cVar2.d;
                                    if (cVar212 != null) {
                                    }
                                    if (dVar2 != dVar4) {
                                    }
                                    if (dVar3 == dVar4) {
                                    }
                                    dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
                                    i22 = i5 + 1;
                                    eVar2 = eVar;
                                    aVar2 = aVar2;
                                    i21 = i6;
                                    bVarArr = bVarArr;
                                    i3 = i3;
                                }
                            }
                            if (z4) {
                                c cVar33 = cVar16.d;
                                if (cVar33.f337b == eVar2) {
                                    dVar.d(cVar16.g, cVar33.g, -cVar16.b(), 4);
                                    dVar.g(cVar16.g, dVar21.G[i34].d.g, -cVar16.b(), 6);
                                    if (z12) {
                                    }
                                    ArrayList<a.f.b.i.d> arrayList22 = bVar.h;
                                    if (bVar.q) {
                                    }
                                    a.f.b.i.d dVar262 = null;
                                    float f52 = 0.0f;
                                    i14 = 0;
                                    while (i14 < size) {
                                    }
                                    if (dVar22 != null) {
                                    }
                                    dVar4 = dVar23;
                                    dVar3 = dVar22;
                                    i8 = i4;
                                    i6 = 2;
                                    if (z3) {
                                    }
                                    int i382 = 8;
                                    int i392 = bVar.j;
                                    if (i392 <= 0) {
                                    }
                                    a.f.b.i.d dVar282 = dVar3;
                                    dVar5 = dVar282;
                                    while (dVar5 != null) {
                                    }
                                    i5 = i8;
                                    c cVar192 = dVar3.G[i2];
                                    cVar3 = dVar20.G[i2].d;
                                    int i422 = i2 + 1;
                                    cVar4 = dVar4.G[i422];
                                    cVar5 = dVar21.G[i422].d;
                                    if (cVar3 == null) {
                                    }
                                    dVar.d(cVar4.g, cVar5.g, -cVar4.b(), i9);
                                    c[] cVarArr922 = dVar3.G;
                                    cVar = cVarArr922[i2];
                                    i7 = i2 + 1;
                                    cVar2 = dVar4.G[i7];
                                    c cVar2022 = cVar.d;
                                    if (cVar2022 != null) {
                                    }
                                    c cVar2122 = cVar2.d;
                                    if (cVar2122 != null) {
                                    }
                                    if (dVar2 != dVar4) {
                                    }
                                    if (dVar3 == dVar4) {
                                    }
                                    dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
                                    i22 = i5 + 1;
                                    eVar2 = eVar;
                                    aVar2 = aVar2;
                                    i21 = i6;
                                    bVarArr = bVarArr;
                                    i3 = i3;
                                }
                            }
                            dVar.g(cVar16.g, dVar21.G[i34].d.g, -cVar16.b(), 6);
                            if (z12) {
                            }
                            ArrayList<a.f.b.i.d> arrayList222 = bVar.h;
                            if (bVar.q) {
                            }
                            a.f.b.i.d dVar2622 = null;
                            float f522 = 0.0f;
                            i14 = 0;
                            while (i14 < size) {
                            }
                            if (dVar22 != null) {
                            }
                            dVar4 = dVar23;
                            dVar3 = dVar22;
                            i8 = i4;
                            i6 = 2;
                            if (z3) {
                            }
                            int i3822 = 8;
                            int i3922 = bVar.j;
                            if (i3922 <= 0) {
                            }
                            a.f.b.i.d dVar2822 = dVar3;
                            dVar5 = dVar2822;
                            while (dVar5 != null) {
                            }
                            i5 = i8;
                            c cVar1922 = dVar3.G[i2];
                            cVar3 = dVar20.G[i2].d;
                            int i4222 = i2 + 1;
                            cVar4 = dVar4.G[i4222];
                            cVar5 = dVar21.G[i4222].d;
                            if (cVar3 == null) {
                            }
                            dVar.d(cVar4.g, cVar5.g, -cVar4.b(), i9);
                            c[] cVarArr9222 = dVar3.G;
                            cVar = cVarArr9222[i2];
                            i7 = i2 + 1;
                            cVar2 = dVar4.G[i7];
                            c cVar20222 = cVar.d;
                            if (cVar20222 != null) {
                            }
                            c cVar21222 = cVar2.d;
                            if (cVar21222 != null) {
                            }
                            if (dVar2 != dVar4) {
                            }
                            if (dVar3 == dVar4) {
                            }
                            dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
                            i22 = i5 + 1;
                            eVar2 = eVar;
                            aVar2 = aVar2;
                            i21 = i6;
                            bVarArr = bVarArr;
                            i3 = i3;
                        }
                    }
                    if (z12) {
                    }
                    ArrayList<a.f.b.i.d> arrayList2222 = bVar.h;
                    if (bVar.q) {
                    }
                    a.f.b.i.d dVar26222 = null;
                    float f5222 = 0.0f;
                    i14 = 0;
                    while (i14 < size) {
                    }
                    if (dVar22 != null) {
                    }
                    dVar4 = dVar23;
                    dVar3 = dVar22;
                    i8 = i4;
                    i6 = 2;
                    if (z3) {
                    }
                    int i38222 = 8;
                    int i39222 = bVar.j;
                    if (i39222 <= 0) {
                    }
                    a.f.b.i.d dVar28222 = dVar3;
                    dVar5 = dVar28222;
                    while (dVar5 != null) {
                    }
                    i5 = i8;
                    c cVar19222 = dVar3.G[i2];
                    cVar3 = dVar20.G[i2].d;
                    int i42222 = i2 + 1;
                    cVar4 = dVar4.G[i42222];
                    cVar5 = dVar21.G[i42222].d;
                    if (cVar3 == null) {
                    }
                    dVar.d(cVar4.g, cVar5.g, -cVar4.b(), i9);
                    c[] cVarArr92222 = dVar3.G;
                    cVar = cVarArr92222[i2];
                    i7 = i2 + 1;
                    cVar2 = dVar4.G[i7];
                    c cVar202222 = cVar.d;
                    if (cVar202222 != null) {
                    }
                    c cVar212222 = cVar2.d;
                    if (cVar212222 != null) {
                    }
                    if (dVar2 != dVar4) {
                    }
                    if (dVar3 == dVar4) {
                    }
                    dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
                    i22 = i5 + 1;
                    eVar2 = eVar;
                    aVar2 = aVar2;
                    i21 = i6;
                    bVarArr = bVarArr;
                    i3 = i3;
                }
            } else {
                i4 = i22;
                int i46 = dVar24.a0;
                boolean z16 = i46 == 0;
                boolean z17 = i46 == 1;
                if (i46 == 2) {
                    z9 = z16;
                    z7 = z17;
                } else {
                    z8 = z16;
                    z7 = z17;
                    z2 = z7;
                    z3 = z8;
                    z4 = false;
                    a.f.b.i.d dVar252 = dVar20;
                    z5 = false;
                    while (!z5) {
                    }
                    if (dVar23 != null) {
                    }
                    if (z12) {
                    }
                    ArrayList<a.f.b.i.d> arrayList22222 = bVar.h;
                    if (bVar.q) {
                    }
                    a.f.b.i.d dVar262222 = null;
                    float f52222 = 0.0f;
                    i14 = 0;
                    while (i14 < size) {
                    }
                    if (dVar22 != null) {
                    }
                    dVar4 = dVar23;
                    dVar3 = dVar22;
                    i8 = i4;
                    i6 = 2;
                    if (z3) {
                    }
                    int i382222 = 8;
                    int i392222 = bVar.j;
                    if (i392222 <= 0) {
                    }
                    a.f.b.i.d dVar282222 = dVar3;
                    dVar5 = dVar282222;
                    while (dVar5 != null) {
                    }
                    i5 = i8;
                    c cVar192222 = dVar3.G[i2];
                    cVar3 = dVar20.G[i2].d;
                    int i422222 = i2 + 1;
                    cVar4 = dVar4.G[i422222];
                    cVar5 = dVar21.G[i422222].d;
                    if (cVar3 == null) {
                    }
                    dVar.d(cVar4.g, cVar5.g, -cVar4.b(), i9);
                    c[] cVarArr922222 = dVar3.G;
                    cVar = cVarArr922222[i2];
                    i7 = i2 + 1;
                    cVar2 = dVar4.G[i7];
                    c cVar2022222 = cVar.d;
                    if (cVar2022222 != null) {
                    }
                    c cVar2122222 = cVar2.d;
                    if (cVar2122222 != null) {
                    }
                    if (dVar2 != dVar4) {
                    }
                    if (dVar3 == dVar4) {
                    }
                    dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
                    i22 = i5 + 1;
                    eVar2 = eVar;
                    aVar2 = aVar2;
                    i21 = i6;
                    bVarArr = bVarArr;
                    i3 = i3;
                }
            }
            z2 = z7;
            z3 = z9;
            z4 = true;
            a.f.b.i.d dVar2522 = dVar20;
            z5 = false;
            while (!z5) {
            }
            if (dVar23 != null) {
            }
            if (z12) {
            }
            ArrayList<a.f.b.i.d> arrayList222222 = bVar.h;
            if (bVar.q) {
            }
            a.f.b.i.d dVar2622222 = null;
            float f522222 = 0.0f;
            i14 = 0;
            while (i14 < size) {
            }
            if (dVar22 != null) {
            }
            dVar4 = dVar23;
            dVar3 = dVar22;
            i8 = i4;
            i6 = 2;
            if (z3) {
            }
            int i3822222 = 8;
            int i3922222 = bVar.j;
            if (i3922222 <= 0) {
            }
            a.f.b.i.d dVar2822222 = dVar3;
            dVar5 = dVar2822222;
            while (dVar5 != null) {
            }
            i5 = i8;
            c cVar1922222 = dVar3.G[i2];
            cVar3 = dVar20.G[i2].d;
            int i4222222 = i2 + 1;
            cVar4 = dVar4.G[i4222222];
            cVar5 = dVar21.G[i4222222].d;
            if (cVar3 == null) {
            }
            dVar.d(cVar4.g, cVar5.g, -cVar4.b(), i9);
            c[] cVarArr9222222 = dVar3.G;
            cVar = cVarArr9222222[i2];
            i7 = i2 + 1;
            cVar2 = dVar4.G[i7];
            c cVar20222222 = cVar.d;
            if (cVar20222222 != null) {
            }
            c cVar21222222 = cVar2.d;
            if (cVar21222222 != null) {
            }
            if (dVar2 != dVar4) {
            }
            if (dVar3 == dVar4) {
            }
            dVar.b(cVar.g, gVar, cVar.b(), 0.5f, gVar2, cVar2.g, dVar4.G[i7].b(), 5);
            i22 = i5 + 1;
            eVar2 = eVar;
            aVar2 = aVar2;
            i21 = i6;
            bVarArr = bVarArr;
            i3 = i3;
        }
    }

    public static InputConnection b(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof c1) {
                    editorInfo.hintText = ((c1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}
