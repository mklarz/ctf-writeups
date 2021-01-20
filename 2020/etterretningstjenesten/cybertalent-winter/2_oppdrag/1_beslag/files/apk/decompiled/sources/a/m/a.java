package a.m;

import a.m.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f635c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, C0018a> f636a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class, Boolean> f637b = new HashMap();

    /* renamed from: a.m.a$a  reason: collision with other inner class name */
    public static class C0018a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<d.a, List<b>> f638a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, d.a> f639b;

        public C0018a(Map<b, d.a> map) {
            this.f639b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> list = this.f638a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f638a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, g gVar, d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.f640a;
                        if (i == 0) {
                            bVar.f641b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f641b.invoke(obj, gVar);
                        } else if (i == 2) {
                            bVar.f641b.invoke(obj, gVar, aVar);
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f640a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f641b;

        public b(int i, Method method) {
            this.f640a = i;
            this.f641b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f640a == bVar.f640a && this.f641b.getName().equals(bVar.f641b.getName());
        }

        public int hashCode() {
            return this.f641b.getName().hashCode() + (this.f640a * 31);
        }
    }

    public final C0018a a(Class cls, Method[] methodArr) {
        int i;
        C0018a b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.f639b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : b(cls2).f639b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                d.a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == d.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0018a aVar = new C0018a(hashMap);
        this.f636a.put(cls, aVar);
        this.f637b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public C0018a b(Class cls) {
        C0018a aVar = this.f636a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final void c(Map<b, d.a> map, b bVar, d.a aVar, Class cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f641b;
            StringBuilder d = b.a.a.a.a.d("Method ");
            d.append(method.getName());
            d.append(" in ");
            d.append(cls.getName());
            d.append(" already declared with different @OnLifecycleEvent value: previous value ");
            d.append(aVar2);
            d.append(", new value ");
            d.append(aVar);
            throw new IllegalArgumentException(d.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
