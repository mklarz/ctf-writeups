package a.q;

import android.view.View;
import b.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f776a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f777b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f778c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f777b == pVar.f777b && this.f776a.equals(pVar.f776a);
    }

    public int hashCode() {
        return this.f776a.hashCode() + (this.f777b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder d = a.d("TransitionValues@");
        d.append(Integer.toHexString(hashCode()));
        d.append(":\n");
        String b2 = a.b(d.toString() + "    view = " + this.f777b + "\n", "    values:");
        for (String str : this.f776a.keySet()) {
            b2 = b2 + "    " + str + ": " + this.f776a.get(str) + "\n";
        }
        return b2;
    }
}
