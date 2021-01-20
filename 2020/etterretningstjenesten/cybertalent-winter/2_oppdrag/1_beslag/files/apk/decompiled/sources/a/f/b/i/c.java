package a.f.b.i;

import a.f.b.g;
import java.util.HashSet;
import java.util.Iterator;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f336a = null;

    /* renamed from: b  reason: collision with root package name */
    public final d f337b;

    /* renamed from: c  reason: collision with root package name */
    public final a f338c;
    public c d;
    public int e = 0;
    public int f = -1;
    public g g;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f337b = dVar;
        this.f338c = aVar;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r6.f337b.w == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r4 != r10) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r4 != r10) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        if (r4 != r2) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0074 A[RETURN] */
    public boolean a(c cVar, int i, int i2, boolean z) {
        boolean z2;
        if (cVar == null) {
            e();
            return true;
        }
        if (!z) {
            a aVar = a.CENTER_Y;
            a aVar2 = a.CENTER_X;
            a aVar3 = a.BASELINE;
            a aVar4 = cVar.f338c;
            a aVar5 = this.f338c;
            if (aVar4 != aVar5) {
                switch (aVar5.ordinal()) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        z2 = false;
                        break;
                    case 1:
                    case 3:
                        z2 = aVar4 == a.LEFT || aVar4 == a.RIGHT;
                        if (cVar.f337b instanceof f) {
                            if (!z2) {
                            }
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z3 = aVar4 == a.TOP || aVar4 == a.BOTTOM;
                        if (!(cVar.f337b instanceof f)) {
                            z2 = z3;
                            break;
                        } else if (!z3) {
                        }
                        break;
                    case 6:
                        if (aVar4 != aVar3) {
                            if (aVar4 != aVar2) {
                            }
                        }
                        z2 = false;
                        break;
                    default:
                        throw new AssertionError(this.f338c.name());
                }
                if (!z2) {
                }
            } else if (aVar5 == aVar3) {
                if (cVar.f337b.w) {
                }
                z2 = false;
                if (!z2) {
                    return false;
                }
            }
            z2 = true;
            if (!z2) {
            }
        }
        this.d = cVar;
        if (cVar.f336a == null) {
            cVar.f336a = new HashSet<>();
        }
        this.d.f336a.add(this);
        if (i > 0) {
            this.e = i;
        } else {
            this.e = 0;
        }
        this.f = i2;
        return true;
    }

    public int b() {
        c cVar;
        if (this.f337b.X == 8) {
            return 0;
        }
        int i = this.f;
        if (i <= -1 || (cVar = this.d) == null || cVar.f337b.X != 8) {
            return this.e;
        }
        return i;
    }

    public boolean c() {
        c cVar;
        HashSet<c> hashSet = this.f336a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            switch (next.f338c.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = next.f337b.A;
                    break;
                case 2:
                    cVar = next.f337b.B;
                    break;
                case 3:
                    cVar = next.f337b.y;
                    break;
                case 4:
                    cVar = next.f337b.z;
                    break;
                default:
                    throw new AssertionError(next.f338c.name());
            }
            if (cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.d != null;
    }

    public void e() {
        HashSet<c> hashSet;
        c cVar = this.d;
        if (!(cVar == null || (hashSet = cVar.f336a) == null)) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public void f() {
        g gVar = this.g;
        if (gVar == null) {
            this.g = new g(g.a.UNRESTRICTED);
        } else {
            gVar.c();
        }
    }

    public String toString() {
        return this.f337b.Y + ":" + this.f338c.toString();
    }
}
