package c.a.a;

import a.h.b.a;
import android.view.View;
import no.cybertalent.liberatortoolkit.MainActivity;

public class b implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f1087b;

    public b(MainActivity mainActivity) {
        this.f1087b = mainActivity;
    }

    public void onClick(View view) {
        a.b(this.f1087b, new String[]{"android.permission.INTERNET"}, 0);
    }
}
