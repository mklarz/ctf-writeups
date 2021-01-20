package a.h.d;

import android.graphics.Insets;
import b.a.a.a.a;

public final class b {
    public static final b e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f454a;

    /* renamed from: b  reason: collision with root package name */
    public final int f455b;

    /* renamed from: c  reason: collision with root package name */
    public final int f456c;
    public final int d;

    public b(int i, int i2, int i3, int i4) {
        this.f454a = i;
        this.f455b = i2;
        this.f456c = i3;
        this.d = i4;
    }

    public static b a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new b(i, i2, i3, i4);
    }

    public Insets b() {
        return Insets.of(this.f454a, this.f455b, this.f456c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.f454a == bVar.f454a && this.f456c == bVar.f456c && this.f455b == bVar.f455b;
    }

    public int hashCode() {
        return (((((this.f454a * 31) + this.f455b) * 31) + this.f456c) * 31) + this.d;
    }

    public String toString() {
        StringBuilder d2 = a.d("Insets{left=");
        d2.append(this.f454a);
        d2.append(", top=");
        d2.append(this.f455b);
        d2.append(", right=");
        d2.append(this.f456c);
        d2.append(", bottom=");
        d2.append(this.d);
        d2.append('}');
        return d2.toString();
    }
}
