package a.g.b;

import a.e.h;
import a.h.i.b;
import java.util.ArrayList;
import java.util.HashSet;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<ArrayList<T>> f415a = new b<>(10);

    /* renamed from: b  reason: collision with root package name */
    public final h<T, ArrayList<T>> f416b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f417c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public void a(T t) {
        if (!(this.f416b.e(t) >= 0)) {
            this.f416b.put(t, null);
        }
    }

    public final void b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> orDefault = this.f416b.getOrDefault(t, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i = 0; i < size; i++) {
                        b(orDefault.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
