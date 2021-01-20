package a.m;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, p> f653a = new HashMap<>();

    public final void a() {
        for (p pVar : this.f653a.values()) {
            Map<String, Object> map = pVar.f652a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : pVar.f652a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            pVar.a();
        }
        this.f653a.clear();
    }
}
