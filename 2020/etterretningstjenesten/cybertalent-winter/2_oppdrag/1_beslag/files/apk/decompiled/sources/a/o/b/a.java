package a.o.b;

import a.o.b.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class a implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public a.h.i.b<b> f659a = new a.h.i.b<>(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f660b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f661c = new ArrayList<>();
    public final AbstractC0020a d;
    public final p e;

    /* renamed from: a.o.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0020a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f662a;

        /* renamed from: b  reason: collision with root package name */
        public int f663b;

        /* renamed from: c  reason: collision with root package name */
        public Object f664c;
        public int d;

        public b(int i, int i2, int i3, Object obj) {
            this.f662a = i;
            this.f663b = i2;
            this.d = i3;
            this.f664c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f662a;
            if (i != bVar.f662a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.f663b) == 1 && this.d == bVar.f663b && this.f663b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.f663b != bVar.f663b) {
                return false;
            }
            Object obj2 = this.f664c;
            Object obj3 = bVar.f664c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f662a * 31) + this.f663b) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f662a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f663b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.f664c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(AbstractC0020a aVar) {
        this.d = aVar;
        this.e = new p(this);
    }

    public final boolean a(int i) {
        int size = this.f661c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f661c.get(i2);
            int i3 = bVar.f662a;
            if (i3 == 8) {
                if (f(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f663b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f661c.size();
        for (int i = 0; i < size; i++) {
            ((u) this.d).a(this.f661c.get(i));
        }
        l(this.f661c);
    }

    public void c() {
        b();
        int size = this.f660b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f660b.get(i);
            int i2 = bVar.f662a;
            if (i2 == 1) {
                ((u) this.d).a(bVar);
                ((u) this.d).d(bVar.f663b, bVar.d);
            } else if (i2 == 2) {
                ((u) this.d).a(bVar);
                AbstractC0020a aVar = this.d;
                int i3 = bVar.f663b;
                int i4 = bVar.d;
                u uVar = (u) aVar;
                uVar.f724a.R(i3, i4, true);
                RecyclerView recyclerView = uVar.f724a;
                recyclerView.h0 = true;
                recyclerView.e0.f966b += i4;
            } else if (i2 == 4) {
                ((u) this.d).a(bVar);
                ((u) this.d).c(bVar.f663b, bVar.d, bVar.f664c);
            } else if (i2 == 8) {
                ((u) this.d).a(bVar);
                ((u) this.d).e(bVar.f663b, bVar.d);
            }
        }
        l(this.f660b);
    }

    public final void d(b bVar) {
        int i;
        int i2 = bVar.f662a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(bVar.f663b, i2);
        int i3 = bVar.f663b;
        int i4 = bVar.f662a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int m2 = m((i * i6) + bVar.f663b, bVar.f662a);
            int i7 = bVar.f662a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                b h = h(i7, m, i5, bVar.f664c);
                e(h, i3);
                k(h);
                if (bVar.f662a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            }
        }
        Object obj = bVar.f664c;
        k(bVar);
        if (i5 > 0) {
            b h2 = h(bVar.f662a, m, i5, obj);
            e(h2, i3);
            k(h2);
        }
    }

    public void e(b bVar, int i) {
        ((u) this.d).a(bVar);
        int i2 = bVar.f662a;
        if (i2 == 2) {
            AbstractC0020a aVar = this.d;
            int i3 = bVar.d;
            u uVar = (u) aVar;
            uVar.f724a.R(i, i3, true);
            RecyclerView recyclerView = uVar.f724a;
            recyclerView.h0 = true;
            recyclerView.e0.f966b += i3;
        } else if (i2 == 4) {
            ((u) this.d).c(i, bVar.d, bVar.f664c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int f(int i, int i2) {
        int size = this.f661c.size();
        while (i2 < size) {
            b bVar = this.f661c.get(i2);
            int i3 = bVar.f662a;
            if (i3 == 8) {
                int i4 = bVar.f663b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f663b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean g() {
        return this.f660b.size() > 0;
    }

    public b h(int i, int i2, int i3, Object obj) {
        b a2 = this.f659a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.f662a = i;
        a2.f663b = i2;
        a2.d = i3;
        a2.f664c = obj;
        return a2;
    }

    public final void i(b bVar) {
        this.f661c.add(bVar);
        int i = bVar.f662a;
        if (i == 1) {
            ((u) this.d).d(bVar.f663b, bVar.d);
        } else if (i == 2) {
            AbstractC0020a aVar = this.d;
            u uVar = (u) aVar;
            uVar.f724a.R(bVar.f663b, bVar.d, false);
            uVar.f724a.h0 = true;
        } else if (i == 4) {
            ((u) this.d).c(bVar.f663b, bVar.d, bVar.f664c);
        } else if (i == 8) {
            ((u) this.d).e(bVar.f663b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014b, code lost:
        if (r4 > r12.f663b) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0175, code lost:
        if (r4 >= r12.f663b) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    public void j() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        b bVar;
        int i4;
        int i5;
        p pVar = this.e;
        ArrayList<b> arrayList = this.f660b;
        Objects.requireNonNull(pVar);
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f662a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            b bVar2 = null;
            if (size == -1) {
                break;
            }
            int i6 = size + 1;
            b bVar3 = arrayList.get(size);
            b bVar4 = arrayList.get(i6);
            int i7 = bVar4.f662a;
            if (i7 == 1) {
                int i8 = bVar3.d;
                int i9 = bVar4.f663b;
                int i10 = i8 < i9 ? -1 : 0;
                int i11 = bVar3.f663b;
                if (i11 < i9) {
                    i10++;
                }
                if (i9 <= i11) {
                    bVar3.f663b = i11 + bVar4.d;
                }
                int i12 = bVar4.f663b;
                if (i12 <= i8) {
                    bVar3.d = i8 + bVar4.d;
                }
                bVar4.f663b = i12 + i10;
                arrayList.set(size, bVar4);
                arrayList.set(i6, bVar3);
            } else if (i7 == 2) {
                int i13 = bVar3.f663b;
                int i14 = bVar3.d;
                int i15 = bVar4.f663b;
                if (i13 < i14) {
                    if (i15 == i13 && bVar4.d == i14 - i13) {
                        z4 = true;
                        z3 = false;
                        if (i14 < i15) {
                            bVar4.f663b = i15 - 1;
                        } else {
                            int i16 = bVar4.d;
                            if (i14 < i15 + i16) {
                                bVar4.d = i16 - 1;
                                bVar3.f662a = 2;
                                bVar3.d = 1;
                                if (bVar4.d == 0) {
                                    arrayList.remove(i6);
                                    ((a) pVar.f719a).k(bVar4);
                                }
                            }
                        }
                        i = bVar3.f663b;
                        i2 = bVar4.f663b;
                        if (i <= i2) {
                            bVar4.f663b = i2 + 1;
                        } else {
                            int i17 = i2 + bVar4.d;
                            if (i < i17) {
                                bVar2 = ((a) pVar.f719a).h(2, i + 1, i17 - i, null);
                                bVar4.d = bVar3.f663b - bVar4.f663b;
                            }
                        }
                        if (z4) {
                            arrayList.set(size, bVar4);
                            arrayList.remove(i6);
                            ((a) pVar.f719a).k(bVar3);
                        } else {
                            if (z3) {
                                if (bVar2 != null) {
                                    int i18 = bVar3.f663b;
                                    if (i18 > bVar2.f663b) {
                                        bVar3.f663b = i18 - bVar2.d;
                                    }
                                    int i19 = bVar3.d;
                                    if (i19 > bVar2.f663b) {
                                        bVar3.d = i19 - bVar2.d;
                                    }
                                }
                                int i20 = bVar3.f663b;
                                if (i20 > bVar4.f663b) {
                                    bVar3.f663b = i20 - bVar4.d;
                                }
                                i3 = bVar3.d;
                            } else {
                                if (bVar2 != null) {
                                    int i21 = bVar3.f663b;
                                    if (i21 >= bVar2.f663b) {
                                        bVar3.f663b = i21 - bVar2.d;
                                    }
                                    int i22 = bVar3.d;
                                    if (i22 >= bVar2.f663b) {
                                        bVar3.d = i22 - bVar2.d;
                                    }
                                }
                                int i23 = bVar3.f663b;
                                if (i23 >= bVar4.f663b) {
                                    bVar3.f663b = i23 - bVar4.d;
                                }
                                i3 = bVar3.d;
                            }
                            bVar3.d = i3 - bVar4.d;
                            arrayList.set(size, bVar4);
                            if (bVar3.f663b != bVar3.d) {
                                arrayList.set(i6, bVar3);
                            } else {
                                arrayList.remove(i6);
                            }
                            if (bVar2 != null) {
                                arrayList.add(size, bVar2);
                            }
                        }
                    } else {
                        z4 = false;
                    }
                } else if (i15 == i14 + 1 && bVar4.d == i13 - i14) {
                    z4 = true;
                } else {
                    z3 = true;
                    z4 = false;
                    if (i14 < i15) {
                    }
                    i = bVar3.f663b;
                    i2 = bVar4.f663b;
                    if (i <= i2) {
                    }
                    if (z4) {
                    }
                }
                z3 = z4;
                if (i14 < i15) {
                }
                i = bVar3.f663b;
                i2 = bVar4.f663b;
                if (i <= i2) {
                }
                if (z4) {
                }
            } else if (i7 == 4) {
                int i24 = bVar3.d;
                int i25 = bVar4.f663b;
                if (i24 < i25) {
                    bVar4.f663b = i25 - 1;
                } else {
                    int i26 = bVar4.d;
                    if (i24 < i25 + i26) {
                        bVar4.d = i26 - 1;
                        bVar = ((a) pVar.f719a).h(4, bVar3.f663b, 1, bVar4.f664c);
                        i4 = bVar3.f663b;
                        i5 = bVar4.f663b;
                        if (i4 > i5) {
                            bVar4.f663b = i5 + 1;
                        } else {
                            int i27 = i5 + bVar4.d;
                            if (i4 < i27) {
                                int i28 = i27 - i4;
                                bVar2 = ((a) pVar.f719a).h(4, i4 + 1, i28, bVar4.f664c);
                                bVar4.d -= i28;
                            }
                        }
                        arrayList.set(i6, bVar3);
                        if (bVar4.d <= 0) {
                            arrayList.set(size, bVar4);
                        } else {
                            arrayList.remove(size);
                            ((a) pVar.f719a).k(bVar4);
                        }
                        if (bVar != null) {
                            arrayList.add(size, bVar);
                        }
                        if (bVar2 == null) {
                            arrayList.add(size, bVar2);
                        }
                    }
                }
                bVar = null;
                i4 = bVar3.f663b;
                i5 = bVar4.f663b;
                if (i4 > i5) {
                }
                arrayList.set(i6, bVar3);
                if (bVar4.d <= 0) {
                }
                if (bVar != null) {
                }
                if (bVar2 == null) {
                }
            }
        }
        int size2 = this.f660b.size();
        for (int i29 = 0; i29 < size2; i29++) {
            b bVar5 = this.f660b.get(i29);
            int i30 = bVar5.f662a;
            if (i30 == 1) {
                i(bVar5);
            } else if (i30 == 2) {
                int i31 = bVar5.f663b;
                int i32 = bVar5.d + i31;
                int i33 = i31;
                boolean z6 = true;
                int i34 = 0;
                while (i33 < i32) {
                    if (((u) this.d).b(i33) != null || a(i33)) {
                        if (!z6) {
                            d(h(2, i31, i34, null));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = true;
                    } else {
                        if (z6) {
                            i(h(2, i31, i34, null));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = false;
                    }
                    if (z2) {
                        i33 -= i34;
                        i32 -= i34;
                        i34 = 1;
                    } else {
                        i34++;
                    }
                    i33++;
                    z6 = z;
                }
                if (i34 != bVar5.d) {
                    k(bVar5);
                    bVar5 = h(2, i31, i34, null);
                }
                if (!z6) {
                    d(bVar5);
                } else {
                    i(bVar5);
                }
            } else if (i30 == 4) {
                int i35 = bVar5.f663b;
                int i36 = bVar5.d + i35;
                boolean z7 = true;
                int i37 = i35;
                int i38 = 0;
                while (i35 < i36) {
                    if (((u) this.d).b(i35) != null || a(i35)) {
                        if (!z7) {
                            d(h(4, i37, i38, bVar5.f664c));
                            i37 = i35;
                            i38 = 0;
                        }
                        z7 = true;
                    } else {
                        if (z7) {
                            i(h(4, i37, i38, bVar5.f664c));
                            i37 = i35;
                            i38 = 0;
                        }
                        z7 = false;
                    }
                    i38++;
                    i35++;
                }
                if (i38 != bVar5.d) {
                    Object obj = bVar5.f664c;
                    k(bVar5);
                    bVar5 = h(4, i37, i38, obj);
                }
                if (!z7) {
                    d(bVar5);
                } else {
                    i(bVar5);
                }
            } else if (i30 == 8) {
                i(bVar5);
            }
        }
        this.f660b.clear();
    }

    public void k(b bVar) {
        bVar.f664c = null;
        this.f659a.b(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k(list.get(i));
        }
        list.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f661c.size() - 1; size >= 0; size--) {
            b bVar = this.f661c.get(size);
            int i9 = bVar.f662a;
            if (i9 == 8) {
                int i10 = bVar.f663b;
                int i11 = bVar.d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f663b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f663b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f663b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f663b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f663b = i3;
                } else if (i9 == 1) {
                    i -= bVar.d;
                } else if (i9 == 2) {
                    i += bVar.d;
                }
            }
        }
        for (int size2 = this.f661c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f661c.get(size2);
            if (bVar2.f662a == 8) {
                int i13 = bVar2.d;
                if (i13 != bVar2.f663b && i13 >= 0) {
                }
            } else if (bVar2.d > 0) {
            }
            this.f661c.remove(size2);
            k(bVar2);
        }
        return i;
    }
}
