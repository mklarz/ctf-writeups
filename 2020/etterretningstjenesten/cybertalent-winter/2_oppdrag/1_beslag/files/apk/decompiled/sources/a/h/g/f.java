package a.h.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f482a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f483b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f484c;
    public int d = 0;
    public Handler.Callback e = new a();

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                f fVar = f.this;
                synchronized (fVar.f482a) {
                    if (!fVar.f484c.hasMessages(1)) {
                        fVar.f483b.quit();
                        fVar.f483b = null;
                        fVar.f484c = null;
                    }
                }
                return true;
            } else if (i != 1) {
                return true;
            } else {
                f fVar2 = f.this;
                Objects.requireNonNull(fVar2);
                ((Runnable) message.obj).run();
                synchronized (fVar2.f482a) {
                    fVar2.f484c.removeMessages(0);
                    Handler handler = fVar2.f484c;
                    handler.sendMessageDelayed(handler.obtainMessage(0), (long) 10000);
                }
                return true;
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f486b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Callable f487c;
        public final /* synthetic */ ReentrantLock d;
        public final /* synthetic */ AtomicBoolean e;
        public final /* synthetic */ Condition f;

        public b(f fVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f486b = atomicReference;
            this.f487c = callable;
            this.d = reentrantLock;
            this.e = atomicBoolean;
            this.f = condition;
        }

        public void run() {
            try {
                this.f486b.set(this.f487c.call());
            } catch (Exception unused) {
            }
            this.d.lock();
            try {
                this.e.set(false);
                this.f.signal();
            } finally {
                this.d.unlock();
            }
        }
    }

    public interface c<T> {
        void a(T t);
    }

    public f(String str, int i, int i2) {
    }

    public final void a(Runnable runnable) {
        synchronized (this.f482a) {
            if (this.f483b == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.f483b = handlerThread;
                handlerThread.start();
                this.f484c = new Handler(this.f483b.getLooper(), this.e);
                this.d++;
            }
            this.f484c.removeMessages(0);
            Handler handler = this.f484c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> T b(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new b(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
