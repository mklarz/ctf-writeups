package a.h.j;

import a.h.j.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import no.cybertalent.liberatortoolkit.R;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, r> f516a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f517b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f518c = false;

    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f519a;

        public a(k kVar) {
            this.f519a = kVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f519a.a(view, v.h(windowInsets, view)).f();
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f520a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f521b;

        /* renamed from: c  reason: collision with root package name */
        public final int f522c;

        public b(int i, Class<T> cls, int i2) {
            this.f520a = i;
            this.f521b = cls;
            this.f522c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f520a = i;
            this.f521b = cls;
            this.f522c = i3;
        }

        public abstract T a(View view);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.f522c) {
                return a(view);
            }
            T t = (T) view.getTag(this.f520a);
            if (this.f521b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    public interface c {
        boolean a(View view, KeyEvent keyEvent);
    }

    public static class d {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f523a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f524b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f525c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f523a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static r a(View view) {
        if (f516a == null) {
            f516a = new WeakHashMap<>();
        }
        r rVar = f516a.get(view);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(view);
        f516a.put(view, rVar2);
        return rVar2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = d.d;
        d dVar = (d) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (dVar == null) {
            dVar = new d();
            view.setTag(R.id.tag_unhandled_key_event_manager, dVar);
        }
        if (keyEvent.getAction() == 0) {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = dVar.f523a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = d.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (dVar.f523a == null) {
                        dVar.f523a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = d.d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            dVar.f523a.put(view2, bool);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                dVar.f523a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }
        View a2 = dVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (dVar.f524b == null) {
                    dVar.f524b = new SparseArray<>();
                }
                dVar.f524b.put(keyCode, new WeakReference<>(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f518c) {
            return null;
        }
        if (f517b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f517b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f518c = true;
                return null;
            }
        }
        Object obj = f517b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence d(View view) {
        return (CharSequence) new o(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view);
    }

    public static v e(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v g = v.g(rootWindowInsets);
        g.f533a.k(g);
        g.f533a.d(view.getRootView());
        return g;
    }

    public static void f(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void g(View view, a aVar) {
        if (aVar == null && (c(view) instanceof a.C0013a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f502b);
    }

    public static void h(View view, k kVar) {
        if (kVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(kVar));
        }
    }
}
