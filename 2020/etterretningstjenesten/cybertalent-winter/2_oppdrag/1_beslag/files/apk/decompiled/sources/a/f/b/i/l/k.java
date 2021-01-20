package a.f.b.i.l;

import java.util.ArrayList;

public class k {

    /* renamed from: c  reason: collision with root package name */
    public static int f364c;

    /* renamed from: a  reason: collision with root package name */
    public m f365a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<m> f366b = new ArrayList<>();

    public k(m mVar, int i) {
        f364c++;
        this.f365a = mVar;
    }

    public final long a(f fVar, long j) {
        m mVar = fVar.d;
        if (mVar instanceof i) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != mVar) {
                    j2 = Math.min(j2, a(fVar2, ((long) fVar2.f) + j));
                }
            }
        }
        if (fVar != mVar.i) {
            return j2;
        }
        long j3 = j - mVar.j();
        return Math.min(Math.min(j2, a(mVar.h, j3)), j3 - ((long) mVar.h.f));
    }

    public final long b(f fVar, long j) {
        m mVar = fVar.d;
        if (mVar instanceof i) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != mVar) {
                    j2 = Math.max(j2, b(fVar2, ((long) fVar2.f) + j));
                }
            }
        }
        if (fVar != mVar.h) {
            return j2;
        }
        long j3 = j + mVar.j();
        return Math.max(Math.max(j2, b(mVar.i, j3)), j3 - ((long) mVar.i.f));
    }
}
