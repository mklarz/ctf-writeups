package a.p;

import a.m.d;
import a.m.h;
import a.p.a;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f738a;

    /* renamed from: b  reason: collision with root package name */
    public final a f739b = new a();

    public b(c cVar) {
        this.f738a = cVar;
    }

    public void a(Bundle bundle) {
        d a2 = this.f738a.a();
        if (((h) a2).f646b == d.b.INITIALIZED) {
            a2.a(new Recreator(this.f738a));
            a aVar = this.f739b;
            if (!aVar.f737c) {
                if (bundle != null) {
                    aVar.f736b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a2.a(new SavedStateRegistry$1(aVar));
                aVar.f737c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.f739b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f736b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.c.a.b.b<K, V>.d b2 = aVar.f735a.b();
        while (b2.hasNext()) {
            Map.Entry entry = (Map.Entry) b2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
