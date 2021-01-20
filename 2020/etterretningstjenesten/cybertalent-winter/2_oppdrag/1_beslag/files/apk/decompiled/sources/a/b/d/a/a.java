package a.b.d.a;

import a.b.g.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f53a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<Object>> f54b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f55c = new Object();

    public static Drawable a(Context context, int i) {
        return n0.c().e(context, i);
    }
}
