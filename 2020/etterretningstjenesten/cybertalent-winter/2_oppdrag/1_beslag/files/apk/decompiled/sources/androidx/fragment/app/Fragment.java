package androidx.fragment.app;

import a.k.a.i;
import a.k.a.j;
import a.k.a.y;
import a.m.d;
import a.m.e;
import a.m.g;
import a.m.h;
import a.m.l;
import a.m.s;
import a.m.t;
import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, g, t, a.p.c {
    public static final Object S = new Object();
    public boolean A;
    public boolean B = true;
    public boolean C;
    public ViewGroup D;
    public View E;
    public boolean F;
    public boolean G = true;
    public a H;
    public boolean I;
    public boolean J;
    public float K;
    public LayoutInflater L;
    public boolean M;
    public d.b N = d.b.RESUMED;
    public h O;
    public y P;
    public l<g> Q = new l<>();
    public a.p.b R;

    /* renamed from: b  reason: collision with root package name */
    public int f902b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f903c;
    public SparseArray<Parcelable> d;
    public String e = UUID.randomUUID().toString();
    public Bundle f;
    public Fragment g;
    public String h = null;
    public int i;
    public Boolean j = null;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public j r;
    public a.k.a.h s;
    public j t = new j();
    public Fragment u;
    public int v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public View f905a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f906b;

        /* renamed from: c  reason: collision with root package name */
        public int f907c;
        public int d;
        public int e;
        public int f;
        public Object g;
        public Object h;
        public Object i;
        public c j;
        public boolean k;

        public a() {
            Object obj = Fragment.S;
            this.g = obj;
            this.h = obj;
            this.i = obj;
        }
    }

    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    public interface c {
    }

    public Fragment() {
        t();
    }

    public final View A() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void B(View view) {
        b().f905a = view;
    }

    public void C(Animator animator) {
        b().f906b = animator;
    }

    public void D(Bundle bundle) {
        j jVar = this.r;
        if (jVar != null) {
            if (jVar == null ? false : jVar.S()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f = bundle;
    }

    public void E(boolean z2) {
        b().k = z2;
    }

    public void F(int i2) {
        if (this.H != null || i2 != 0) {
            b().d = i2;
        }
    }

    public void G(c cVar) {
        b();
        c cVar2 = this.H.j;
        if (cVar != cVar2) {
            if (cVar != null && cVar2 != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            } else if (cVar != null) {
                ((j.f) cVar).f588c++;
            }
        }
    }

    @Override // a.m.g
    public d a() {
        return this.O;
    }

    public final a b() {
        if (this.H == null) {
            this.H = new a();
        }
        return this.H;
    }

    public View c() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.f905a;
    }

    @Override // a.p.c
    public final a.p.a e() {
        return this.R.f739b;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // a.m.t
    public s f() {
        j jVar = this.r;
        if (jVar != null) {
            a.k.a.l lVar = jVar.E;
            s sVar = lVar.d.get(this.e);
            if (sVar != null) {
                return sVar;
            }
            s sVar2 = new s();
            lVar.d.put(this.e, sVar2);
            return sVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Animator g() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.f906b;
    }

    public final i h() {
        if (this.s != null) {
            return this.t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public Object i() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull(aVar);
        return null;
    }

    public void j() {
        a aVar = this.H;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    public Object k() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull(aVar);
        return null;
    }

    public int l() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.d;
    }

    public int m() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.e;
    }

    public int n() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f;
    }

    public Object o() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.h;
        if (obj != S) {
            return obj;
        }
        k();
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.C = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        a.k.a.d dVar;
        a.k.a.h hVar = this.s;
        if (hVar == null) {
            dVar = null;
        } else {
            dVar = (a.k.a.d) hVar.f578b;
        }
        if (dVar != null) {
            dVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public void onLowMemory() {
        this.C = true;
    }

    public Object p() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.g;
        if (obj != S) {
            return obj;
        }
        i();
        return null;
    }

    public Object q() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull(aVar);
        return null;
    }

    public Object r() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.i;
        if (obj != S) {
            return obj;
        }
        q();
        return null;
    }

    public int s() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f907c;
    }

    public final void t() {
        this.O = new h(this);
        this.R = new a.p.b(this);
        this.O.a(new e() {
            /* class androidx.fragment.app.Fragment.AnonymousClass2 */

            @Override // a.m.e
            public void g(g gVar, d.a aVar) {
                if (aVar == d.a.ON_STOP) {
                    Objects.requireNonNull(Fragment.this);
                }
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        a.h.b.d.a(this, sb);
        sb.append(" (");
        sb.append(this.e);
        sb.append(")");
        if (this.v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.v));
        }
        if (this.x != null) {
            sb.append(" ");
            sb.append(this.x);
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.q > 0;
    }

    public void v(AttributeSet attributeSet, Bundle bundle) {
        this.C = true;
        a.k.a.h hVar = this.s;
        if ((hVar == null ? null : hVar.f578b) != null) {
            this.C = false;
            this.C = true;
        }
    }

    public void w(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t.X();
        boolean z2 = true;
        this.p = true;
        y yVar = new y();
        this.P = yVar;
        if (yVar.f629b == null) {
            z2 = false;
        }
        if (!z2) {
            this.P = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public LayoutInflater x(Bundle bundle) {
        a.k.a.h hVar = this.s;
        if (hVar != null) {
            LayoutInflater j2 = hVar.j();
            j jVar = this.t;
            Objects.requireNonNull(jVar);
            j2.setFactory2(jVar);
            this.L = j2;
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void y() {
        this.C = true;
        this.t.n();
    }

    public boolean z(Menu menu) {
        if (!this.y) {
            return false | this.t.G(menu);
        }
        return false;
    }
}
