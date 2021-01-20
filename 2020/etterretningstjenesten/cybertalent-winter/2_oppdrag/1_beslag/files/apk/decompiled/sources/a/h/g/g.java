package a.h.g;

import a.h.g.f;
import android.os.Handler;
import java.util.concurrent.Callable;

public class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f488b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f489c;
    public final /* synthetic */ f.c d;

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f490b;

        public a(Object obj) {
            this.f490b = obj;
        }

        public void run() {
            g.this.d.a(this.f490b);
        }
    }

    public g(f fVar, Callable callable, Handler handler, f.c cVar) {
        this.f488b = callable;
        this.f489c = handler;
        this.d = cVar;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f488b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f489c.post(new a(obj));
    }
}
