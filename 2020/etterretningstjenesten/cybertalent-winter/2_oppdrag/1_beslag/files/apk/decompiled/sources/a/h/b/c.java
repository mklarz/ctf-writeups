package a.h.b;

import android.util.Log;
import java.lang.reflect.Method;

public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f434b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f435c;

    public c(Object obj, Object obj2) {
        this.f434b = obj;
        this.f435c = obj2;
    }

    public void run() {
        Boolean bool = Boolean.FALSE;
        try {
            Method method = b.d;
            if (method != null) {
                method.invoke(this.f434b, this.f435c, bool, "AppCompat recreation");
                return;
            }
            b.e.invoke(this.f434b, this.f435c, bool);
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
