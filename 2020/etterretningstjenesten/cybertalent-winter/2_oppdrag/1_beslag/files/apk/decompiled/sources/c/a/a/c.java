package c.a.a;

import a.h.b.a;
import android.view.View;
import no.cybertalent.liberatortoolkit.MainActivity;

public class c implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f1088b;

    public c(MainActivity mainActivity) {
        this.f1088b = mainActivity;
    }

    public void onClick(View view) {
        a.b(this.f1088b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }
}
