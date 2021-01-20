package androidx.lifecycle;

import a.c.a.b.b;
import a.m.d;
import a.m.g;
import a.m.h;
import a.m.m;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f911a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public b<m<? super T>, LiveData<T>.a> f912b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f913c = 0;
    public volatile Object d;
    public volatile Object e;
    public int f;
    public boolean g;
    public boolean h;

    public class LifecycleBoundObserver extends LiveData<T>.a implements Object {
        public final g e;
        public final /* synthetic */ LiveData f;

        public void g(g gVar, d.a aVar) {
            if (((h) this.e.a()).f646b == d.b.DESTROYED) {
                this.f.f(this.f914a);
            } else {
                h(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        public void i() {
            ((h) this.e.a()).f645a.d(this);
        }

        @Override // androidx.lifecycle.LiveData.a
        public boolean j() {
            return ((h) this.e.a()).f646b.compareTo(d.b.STARTED) >= 0;
        }
    }

    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final m<? super T> f914a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f915b;

        /* renamed from: c  reason: collision with root package name */
        public int f916c;
        public final /* synthetic */ LiveData d;

        public void h(boolean z) {
            if (z != this.f915b) {
                this.f915b = z;
                LiveData liveData = this.d;
                int i = liveData.f913c;
                int i2 = 1;
                boolean z2 = i == 0;
                if (!z) {
                    i2 = -1;
                }
                liveData.f913c = i + i2;
                if (z2 && z) {
                    liveData.d();
                }
                LiveData liveData2 = this.d;
                if (liveData2.f913c == 0 && !this.f915b) {
                    liveData2.e();
                }
                if (this.f915b) {
                    this.d.c(this);
                }
            }
        }

        public void i() {
        }

        public abstract boolean j();
    }

    public LiveData() {
        Object obj = i;
        this.d = obj;
        this.e = obj;
        this.f = -1;
    }

    public static void a(String str) {
        if (!a.c.a.a.a.b().f259a.a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    public final void b(LiveData<T>.a aVar) {
        if (aVar.f915b) {
            if (!aVar.j()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f916c;
            int i3 = this.f;
            if (i2 < i3) {
                aVar.f916c = i3;
                aVar.f914a.a((Object) this.d);
            }
        }
    }

    public void c(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar == null) {
                b<K, V>.d b2 = this.f912b.b();
                while (b2.hasNext()) {
                    b((a) ((Map.Entry) b2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.a d2 = this.f912b.d(mVar);
        if (d2 != null) {
            d2.i();
            d2.h(false);
        }
    }
}
