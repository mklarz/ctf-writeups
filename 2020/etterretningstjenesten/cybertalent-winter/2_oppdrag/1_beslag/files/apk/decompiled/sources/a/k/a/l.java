package a.k.a;

import a.m.p;
import a.m.q;
import a.m.s;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class l extends p {
    public static final q g = new a();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<Fragment> f592b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, l> f593c = new HashMap<>();
    public final HashMap<String, s> d = new HashMap<>();
    public final boolean e;
    public boolean f = false;

    public static class a implements q {
        public <T extends p> T a(Class<T> cls) {
            return new l(true);
        }
    }

    public l(boolean z) {
        this.e = z;
    }

    @Override // a.m.p
    public void a() {
        Interpolator interpolator = j.G;
        this.f = true;
    }

    public boolean b(Fragment fragment) {
        if (this.f592b.contains(fragment) && this.e) {
            return this.f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f592b.equals(lVar.f592b) && this.f593c.equals(lVar.f593c) && this.d.equals(lVar.d);
    }

    public int hashCode() {
        int hashCode = this.f593c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.f592b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f592b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f593c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
