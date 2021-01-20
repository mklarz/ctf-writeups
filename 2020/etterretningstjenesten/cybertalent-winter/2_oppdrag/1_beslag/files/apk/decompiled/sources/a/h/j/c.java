package a.h.j;

import b.a.a.a.a;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f505a;

    public c(Object obj) {
        this.f505a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f505a, ((c) obj).f505a);
    }

    public int hashCode() {
        Object obj = this.f505a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder d = a.d("DisplayCutoutCompat{");
        d.append(this.f505a);
        d.append("}");
        return d.toString();
    }
}
