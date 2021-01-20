package a.k.a;

import a.k.a.n;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

public final class a extends n {
    public final j q;
    public int r = -1;

    public a(j jVar) {
        this.q = jVar;
    }

    public static boolean g(n.a aVar) {
        Fragment fragment = aVar.f601b;
        if (fragment == null) {
            return false;
        }
        boolean z = fragment.k;
        return false;
    }

    public void a(int i) {
        if (this.h) {
            Interpolator interpolator = j.G;
            int size = this.f597a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f597a.get(i2).f601b;
                if (fragment != null) {
                    fragment.q += i;
                    Interpolator interpolator2 = j.G;
                }
            }
        }
    }

    public void b(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (!(this.f598b == 0 && this.f599c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f598b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f599c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.f597a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f597a.size();
            for (int i = 0; i < size; i++) {
                n.a aVar = this.f597a.get(i);
                switch (aVar.f600a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder d = b.a.a.a.a.d("cmd=");
                        d.append(aVar.f600a);
                        str2 = d.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f601b);
                if (z) {
                    if (!(aVar.f602c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f602c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public void c() {
        int size = this.f597a.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = this.f597a.get(i);
            Fragment fragment = aVar.f601b;
            if (fragment != null) {
                int i2 = this.f;
                int i3 = this.g;
                if (!(fragment.H == null && i2 == 0 && i3 == 0)) {
                    fragment.b();
                    Fragment.a aVar2 = fragment.H;
                    aVar2.e = i2;
                    aVar2.f = i3;
                }
            }
            switch (aVar.f600a) {
                case 1:
                    fragment.F(aVar.f602c);
                    this.q.c(fragment, false);
                    break;
                case 2:
                default:
                    StringBuilder d = b.a.a.a.a.d("Unknown cmd: ");
                    d.append(aVar.f600a);
                    throw new IllegalArgumentException(d.toString());
                case 3:
                    fragment.F(aVar.d);
                    this.q.Y(fragment);
                    break;
                case 4:
                    fragment.F(aVar.d);
                    Objects.requireNonNull(this.q);
                    if (!fragment.y) {
                        fragment.y = true;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 5:
                    fragment.F(aVar.f602c);
                    Objects.requireNonNull(this.q);
                    if (fragment.y) {
                        fragment.y = false;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 6:
                    fragment.F(aVar.d);
                    this.q.h(fragment);
                    break;
                case 7:
                    fragment.F(aVar.f602c);
                    this.q.e(fragment);
                    break;
                case 8:
                    this.q.d0(fragment);
                    break;
                case 9:
                    this.q.d0(null);
                    break;
                case 10:
                    this.q.c0(fragment, aVar.h);
                    break;
            }
            if (!(this.p || aVar.f600a == 1 || fragment == null)) {
                this.q.U(fragment);
            }
        }
        if (!this.p) {
            j jVar = this.q;
            jVar.V(jVar.o, true);
        }
    }

    public void d(boolean z) {
        for (int size = this.f597a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f597a.get(size);
            Fragment fragment = aVar.f601b;
            if (fragment != null) {
                int i = this.f;
                Interpolator interpolator = j.G;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                int i3 = this.g;
                if (!(fragment.H == null && i2 == 0 && i3 == 0)) {
                    fragment.b();
                    Fragment.a aVar2 = fragment.H;
                    aVar2.e = i2;
                    aVar2.f = i3;
                }
            }
            switch (aVar.f600a) {
                case 1:
                    fragment.F(aVar.f);
                    this.q.Y(fragment);
                    break;
                case 2:
                default:
                    StringBuilder d = b.a.a.a.a.d("Unknown cmd: ");
                    d.append(aVar.f600a);
                    throw new IllegalArgumentException(d.toString());
                case 3:
                    fragment.F(aVar.e);
                    this.q.c(fragment, false);
                    break;
                case 4:
                    fragment.F(aVar.e);
                    Objects.requireNonNull(this.q);
                    if (fragment.y) {
                        fragment.y = false;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 5:
                    fragment.F(aVar.f);
                    Objects.requireNonNull(this.q);
                    if (!fragment.y) {
                        fragment.y = true;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 6:
                    fragment.F(aVar.e);
                    this.q.e(fragment);
                    break;
                case 7:
                    fragment.F(aVar.f);
                    this.q.h(fragment);
                    break;
                case 8:
                    this.q.d0(null);
                    break;
                case 9:
                    this.q.d0(fragment);
                    break;
                case 10:
                    this.q.c0(fragment, aVar.g);
                    break;
            }
            if (!(this.p || aVar.f600a == 3 || fragment == null)) {
                this.q.U(fragment);
            }
        }
        if (!this.p && z) {
            j jVar = this.q;
            jVar.V(jVar.o, true);
        }
    }

    public boolean e(int i) {
        int size = this.f597a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f597a.get(i2).f601b;
            int i3 = fragment != null ? fragment.w : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean f(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f597a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f597a.get(i4).f601b;
            int i5 = fragment != null ? fragment.w : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f597a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f597a.get(i7).f601b;
                        if ((fragment2 != null ? fragment2.w : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
