package a.o.b;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class n implements Runnable {
    public static final ThreadLocal<n> f = new ThreadLocal<>();
    public static Comparator<c> g = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<RecyclerView> f708b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public long f709c;
    public long d;
    public ArrayList<c> e = new ArrayList<>();

    public static class a implements Comparator<c> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.f713a;
                if (z == cVar4.f713a) {
                    int i = cVar4.f714b - cVar3.f714b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.f715c - cVar4.f715c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
            }
            return 1;
        }
    }

    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f710a;

        /* renamed from: b  reason: collision with root package name */
        public int f711b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f712c;
        public int d;

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.f712c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f712c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f712c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f712c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.f712c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.m;
            if (recyclerView.l != null && lVar != null && lVar.j) {
                if (z) {
                    if (!recyclerView.e.g()) {
                        lVar.i(recyclerView.l.a(), this);
                    }
                } else if (!recyclerView.N()) {
                    lVar.h(this.f710a, this.f711b, recyclerView.e0, this);
                }
                int i = this.d;
                if (i > lVar.k) {
                    lVar.k = i;
                    lVar.l = z;
                    recyclerView.f934c.l();
                }
            }
        }

        public boolean c(int i) {
            if (this.f712c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f712c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f713a;

        /* renamed from: b  reason: collision with root package name */
        public int f714b;

        /* renamed from: c  reason: collision with root package name */
        public int f715c;
        public RecyclerView d;
        public int e;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f709c == 0) {
            this.f709c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.d0;
        bVar.f710a = i;
        bVar.f711b = i2;
    }

    public void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f708b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f708b.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.d0.b(recyclerView3, false);
                i += recyclerView3.d0.d;
            }
        }
        this.e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f708b.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.d0;
                int abs = Math.abs(bVar.f711b) + Math.abs(bVar.f710a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.e.size()) {
                        cVar2 = new c();
                        this.e.add(cVar2);
                    } else {
                        cVar2 = this.e.get(i3);
                    }
                    int[] iArr = bVar.f712c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f713a = i6 <= abs;
                    cVar2.f714b = abs;
                    cVar2.f715c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.e, g);
        int i7 = 0;
        while (i7 < this.e.size() && (recyclerView = (cVar = this.e.get(i7)).d) != null) {
            RecyclerView.y c2 = c(recyclerView, cVar.e, cVar.f713a ? Long.MAX_VALUE : j);
            if (!(c2 == null || c2.f971c == null || !c2.i() || c2.j() || (recyclerView2 = c2.f971c.get()) == null)) {
                if (recyclerView2.B && recyclerView2.f.h() != 0) {
                    recyclerView2.d0();
                }
                b bVar2 = recyclerView2.d0;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i8 = a.h.f.a.f462a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.v vVar = recyclerView2.e0;
                        RecyclerView.d dVar = recyclerView2.l;
                        vVar.f967c = 1;
                        vVar.d = dVar.a();
                        vVar.f = false;
                        vVar.g = false;
                        vVar.h = false;
                        for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                            c(recyclerView2, bVar2.f712c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = a.h.f.a.f462a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f713a = false;
            cVar.f714b = 0;
            cVar.f715c = 0;
            cVar.d = null;
            cVar.e = 0;
            i7++;
        }
    }

    public final RecyclerView.y c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f.h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.y J = RecyclerView.J(recyclerView.f.g(i2));
            if (J.d == i && !J.j()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.r rVar = recyclerView.f934c;
        try {
            recyclerView.U();
            RecyclerView.y j2 = rVar.j(i, false, j);
            if (j2 != null) {
                if (!j2.i() || j2.j()) {
                    rVar.a(j2, false);
                } else {
                    rVar.g(j2.f970b);
                }
            }
            return j2;
        } finally {
            recyclerView.V(false);
        }
    }

    public void run() {
        try {
            int i = a.h.f.a.f462a;
            Trace.beginSection("RV Prefetch");
            if (this.f708b.isEmpty()) {
                this.f709c = 0;
                Trace.endSection();
                return;
            }
            int size = this.f708b.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f708b.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f709c = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j) + this.d);
            this.f709c = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f709c = 0;
            int i3 = a.h.f.a.f462a;
            Trace.endSection();
            throw th;
        }
    }
}
