package androidx.savedstate;

import a.m.d;
import a.m.e;
import a.m.g;
import a.m.h;
import a.p.a;
import a.p.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c f987a;

    public Recreator(c cVar) {
        this.f987a = cVar;
    }

    @Override // a.m.e
    public void g(g gVar, d.a aVar) {
        Class cls;
        if (aVar == d.a.ON_CREATE) {
            ((h) gVar.a()).f645a.d(this);
            a e = this.f987a.e();
            if (e.f737c) {
                Bundle bundle = e.f736b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    e.f736b.remove("androidx.savedstate.Restarter");
                    if (e.f736b.isEmpty()) {
                        e.f736b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 != null) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            try {
                                try {
                                    Constructor<? extends U> declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.AbstractC0022a.class).getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        ((a.AbstractC0022a) declaredConstructor.newInstance(new Object[0])).a(this.f987a);
                                    } catch (Exception e2) {
                                        throw new RuntimeException(b.a.a.a.a.b("Failed to instantiate ", next), e2);
                                    }
                                } catch (NoSuchMethodException e3) {
                                    StringBuilder d = b.a.a.a.a.d("Class");
                                    d.append(cls.getSimpleName());
                                    d.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(d.toString(), e3);
                                }
                            } catch (ClassNotFoundException e4) {
                                throw new RuntimeException(b.a.a.a.a.c("Class ", next, " wasn't found"), e4);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
