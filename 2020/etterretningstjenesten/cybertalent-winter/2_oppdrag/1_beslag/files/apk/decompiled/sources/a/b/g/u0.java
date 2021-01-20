package a.b.g;

import android.content.Context;
import android.content.ContextWrapper;

public class u0 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f221a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof u0) && !(context.getResources() instanceof w0)) {
            context.getResources();
            int i = a1.f138a;
        }
        return context;
    }
}
