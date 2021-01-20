package a.h.c.b;

import a.b.g.y;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

public abstract class e {

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Typeface f447b;

        public a(Typeface typeface) {
            this.f447b = typeface;
        }

        public void run() {
            e.this.c(this.f447b);
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f449b;

        public b(int i) {
            this.f449b = i;
        }

        public void run() {
            Objects.requireNonNull((y.a) e.this);
        }
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }

    public final void b(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }

    public abstract void c(Typeface typeface);
}
