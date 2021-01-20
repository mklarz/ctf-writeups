package a.e;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f286a;

    /* renamed from: b  reason: collision with root package name */
    public int f287b;

    /* renamed from: c  reason: collision with root package name */
    public int f288c;
    public int d;
    public int e;
    public int f;
    public int g;

    public f(int i) {
        if (i > 0) {
            this.f288c = i;
            this.f286a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f286a.get(k);
            if (v != null) {
                this.f++;
                return v;
            }
            this.g++;
            return null;
        }
    }

    public final V b(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.f287b++;
            put = this.f286a.put(k, v);
            if (put != null) {
                this.f287b--;
            }
        }
        c(this.f288c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    public void c(int i) {
        while (true) {
            synchronized (this) {
                if (this.f287b < 0 || (this.f286a.isEmpty() && this.f287b != 0)) {
                } else if (this.f287b <= i) {
                    break;
                } else if (this.f286a.isEmpty()) {
                    break;
                } else {
                    Map.Entry<K, V> next = this.f286a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f286a.remove(key);
                    this.f287b--;
                    this.e++;
                }
            }
        }
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f;
        i2 = this.g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f288c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
