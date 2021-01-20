package a.k.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Objects;

public class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f575a;

    public c(Fragment fragment) {
        this.f575a = fragment;
    }

    @Override // a.k.a.e
    public View b(int i) {
        Objects.requireNonNull(this.f575a);
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // a.k.a.e
    public boolean c() {
        Objects.requireNonNull(this.f575a);
        return false;
    }
}
