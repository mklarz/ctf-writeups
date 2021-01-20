package a.o.b;

import android.view.View;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public final b f725a;

    /* renamed from: b  reason: collision with root package name */
    public a f726b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f727a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f728b;

        /* renamed from: c  reason: collision with root package name */
        public int f729c;
        public int d;
        public int e;

        public boolean a() {
            int i = this.f727a;
            if ((i & 7) != 0 && (i & (b(this.d, this.f728b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f727a;
            if ((i2 & 112) != 0 && (i2 & (b(this.d, this.f729c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f727a;
            if ((i3 & 1792) != 0 && (i3 & (b(this.e, this.f728b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f727a;
            return (i4 & 28672) == 0 || (i4 & (b(this.e, this.f729c) << 12)) != 0;
        }

        public int b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    public interface b {
        int a();

        int b();

        int c(View view);

        int d(View view);

        View e(int i);
    }

    public x(b bVar) {
        this.f725a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.f725a.b();
        int a2 = this.f725a.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.f725a.e(i);
            int d = this.f725a.d(e);
            int c2 = this.f725a.c(e);
            a aVar = this.f726b;
            aVar.f728b = b2;
            aVar.f729c = a2;
            aVar.d = d;
            aVar.e = c2;
            if (i3 != 0) {
                aVar.f727a = 0;
                aVar.f727a = i3 | 0;
                if (aVar.a()) {
                    return e;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.f726b;
                aVar2.f727a = 0;
                aVar2.f727a = i4 | 0;
                if (aVar2.a()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        a aVar = this.f726b;
        int b2 = this.f725a.b();
        int a2 = this.f725a.a();
        int d = this.f725a.d(view);
        int c2 = this.f725a.c(view);
        aVar.f728b = b2;
        aVar.f729c = a2;
        aVar.d = d;
        aVar.e = c2;
        if (i == 0) {
            return false;
        }
        a aVar2 = this.f726b;
        aVar2.f727a = 0;
        aVar2.f727a = 0 | i;
        return aVar2.a();
    }
}
