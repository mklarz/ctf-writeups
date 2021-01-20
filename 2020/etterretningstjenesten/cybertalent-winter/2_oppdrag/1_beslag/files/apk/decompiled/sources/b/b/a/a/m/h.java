package b.b.a.a.m;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public class h {
    public static h e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1073a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1074b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f1075c;
    public c d;

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            h hVar = h.this;
            c cVar = (c) message.obj;
            synchronized (hVar.f1073a) {
                if (hVar.f1075c == cVar || hVar.d == cVar) {
                    hVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    public interface b {
        void a(int i);

        void b();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f1077a;

        /* renamed from: b  reason: collision with root package name */
        public int f1078b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1079c;

        public c(int i, b bVar) {
            this.f1077a = new WeakReference<>(bVar);
            this.f1078b = i;
        }
    }

    public static h b() {
        if (e == null) {
            e = new h();
        }
        return e;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.f1077a.get();
        if (bVar == null) {
            return false;
        }
        this.f1074b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.f1075c;
        if (cVar != null) {
            if (bVar != null && cVar.f1077a.get() == bVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(b bVar) {
        c cVar = this.d;
        if (cVar != null) {
            if (bVar != null && cVar.f1077a.get() == bVar) {
                return true;
            }
        }
        return false;
    }

    public void e(b bVar) {
        synchronized (this.f1073a) {
            if (c(bVar)) {
                c cVar = this.f1075c;
                if (!cVar.f1079c) {
                    cVar.f1079c = true;
                    this.f1074b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f1073a) {
            if (c(bVar)) {
                c cVar = this.f1075c;
                if (cVar.f1079c) {
                    cVar.f1079c = false;
                    g(cVar);
                }
            }
        }
    }

    public final void g(c cVar) {
        int i = cVar.f1078b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f1074b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f1074b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    public final void h() {
        c cVar = this.d;
        if (cVar != null) {
            this.f1075c = cVar;
            this.d = null;
            b bVar = cVar.f1077a.get();
            if (bVar != null) {
                bVar.b();
            } else {
                this.f1075c = null;
            }
        }
    }
}
