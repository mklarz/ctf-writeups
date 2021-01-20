package a.c.a.a;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f258c;

    /* renamed from: a  reason: collision with root package name */
    public c f259a;

    /* renamed from: b  reason: collision with root package name */
    public c f260b;

    public a() {
        b bVar = new b();
        this.f260b = bVar;
        this.f259a = bVar;
    }

    public static a b() {
        if (f258c != null) {
            return f258c;
        }
        synchronized (a.class) {
            if (f258c == null) {
                f258c = new a();
            }
        }
        return f258c;
    }

    @Override // a.c.a.a.c
    public boolean a() {
        return this.f259a.a();
    }
}
