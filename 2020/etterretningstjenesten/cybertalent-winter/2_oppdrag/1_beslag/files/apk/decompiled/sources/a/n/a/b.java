package a.n.a;

import a.e.i;
import a.h.b.d;
import a.m.g;
import a.m.l;
import a.m.m;
import a.m.p;
import a.m.q;
import a.m.r;
import a.m.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final g f654a;

    /* renamed from: b  reason: collision with root package name */
    public final C0019b f655b;

    public static class a<D> extends l<D> {
        @Override // androidx.lifecycle.LiveData
        public void d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void e() {
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.m.m<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(m<? super D> mVar) {
            super.f(mVar);
        }

        @Override // a.m.l
        public void g(D d) {
            super.g(null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            d.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.n.a.b$b  reason: collision with other inner class name */
    public static class C0019b extends p {

        /* renamed from: c  reason: collision with root package name */
        public static final q f656c = new a();

        /* renamed from: b  reason: collision with root package name */
        public i<a> f657b = new i<>(10);

        /* renamed from: a.n.a.b$b$a */
        public static class a implements q {
            public <T extends p> T a(Class<T> cls) {
                return new C0019b();
            }
        }

        @Override // a.m.p
        public void a() {
            if (this.f657b.i() <= 0) {
                i<a> iVar = this.f657b;
                int i = iVar.d;
                Object[] objArr = iVar.f306c;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                iVar.d = 0;
                iVar.f304a = false;
                return;
            }
            Objects.requireNonNull(this.f657b.j(0));
            throw null;
        }
    }

    public b(g gVar, s sVar) {
        this.f654a = gVar;
        q qVar = C0019b.f656c;
        String canonicalName = C0019b.class.getCanonicalName();
        if (canonicalName != null) {
            String b2 = b.a.a.a.a.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            p pVar = sVar.f653a.get(b2);
            if (!C0019b.class.isInstance(pVar)) {
                pVar = qVar instanceof r ? ((r) qVar).a(b2, C0019b.class) : ((C0019b.a) qVar).a(C0019b.class);
                p put = sVar.f653a.put(b2, pVar);
                if (put != null) {
                    put.a();
                }
            }
            this.f655b = (C0019b) pVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // a.n.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0019b bVar = this.f655b;
        if (bVar.f657b.i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f657b.i() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f657b.f(0));
                printWriter.print(": ");
                printWriter.println(bVar.f657b.j(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.a(this.f654a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
