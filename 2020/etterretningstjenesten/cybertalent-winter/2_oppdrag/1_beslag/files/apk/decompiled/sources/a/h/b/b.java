package a.h.b;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f424a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f425b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f426c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f427b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f428c;

        public a(c cVar, Object obj) {
            this.f427b = cVar;
            this.f428c = obj;
        }

        public void run() {
            this.f427b.f431a = this.f428c;
        }
    }

    /* renamed from: a.h.b.b$b  reason: collision with other inner class name */
    public class RunnableC0011b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Application f429b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f430c;

        public RunnableC0011b(Application application, c cVar) {
            this.f429b = application;
            this.f430c = cVar;
        }

        public void run() {
            this.f429b.unregisterActivityLifecycleCallbacks(this.f430c);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f431a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f432b;

        /* renamed from: c  reason: collision with root package name */
        public final int f433c;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;

        public c(Activity activity) {
            this.f432b = activity;
            this.f433c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f432b == activity) {
                this.f432b = null;
                this.e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.e && !this.f && !this.d) {
                Object obj = this.f431a;
                int i = this.f433c;
                boolean z = false;
                try {
                    Object obj2 = b.f426c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i) {
                            b.g.postAtFrontOfQueue(new c(b.f425b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f = true;
                    this.f431a = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f432b == activity) {
                this.d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method method;
        Class<?> cls2;
        Method method2;
        Class<?> cls3;
        Class<?> cls4 = Boolean.TYPE;
        Method method3 = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f424a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f425b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f426c = field2;
        Class<?> cls5 = f424a;
        if (cls5 != null) {
            try {
                method = cls5.getDeclaredMethod("performStopActivity", IBinder.class, cls4, String.class);
                method.setAccessible(true);
            } catch (Throwable unused4) {
            }
            d = method;
            cls2 = f424a;
            if (cls2 != null) {
                try {
                    method2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls4);
                    method2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                e = method2;
                cls3 = f424a;
                if (a() && cls3 != null) {
                    Method declaredMethod = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls4, Configuration.class, Configuration.class, cls4, cls4);
                    declaredMethod.setAccessible(true);
                    method3 = declaredMethod;
                }
                f = method3;
            }
            method2 = null;
            e = method2;
            cls3 = f424a;
            Method declaredMethod2 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls4, Configuration.class, Configuration.class, cls4, cls4);
            declaredMethod2.setAccessible(true);
            method3 = declaredMethod2;
            f = method3;
        }
        method = null;
        d = method;
        cls2 = f424a;
        if (cls2 != null) {
        }
        method2 = null;
        e = method2;
        cls3 = f424a;
        try {
            Method declaredMethod22 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls4, Configuration.class, Configuration.class, cls4, cls4);
            declaredMethod22.setAccessible(true);
            method3 = declaredMethod22;
        } catch (Throwable unused6) {
        }
        f = method3;
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = f426c.get(activity);
                if (obj2 == null || (obj = f425b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                c cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = g;
                handler.post(new a(cVar, obj2));
                try {
                    if (a()) {
                        Method method = f;
                        Boolean bool = Boolean.FALSE;
                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                    } else {
                        activity.recreate();
                    }
                    handler.post(new RunnableC0011b(application, cVar));
                    return true;
                } catch (Throwable th) {
                    g.post(new RunnableC0011b(application, cVar));
                    throw th;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
