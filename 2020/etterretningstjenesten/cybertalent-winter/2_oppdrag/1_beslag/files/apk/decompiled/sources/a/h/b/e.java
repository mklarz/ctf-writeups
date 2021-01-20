package a.h.b;

import a.h.j.d;
import a.m.d;
import a.m.g;
import a.m.h;
import a.m.o;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class e extends Activity implements g, d.a {

    /* renamed from: b  reason: collision with root package name */
    public h f438b = new h(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !d.a(decorView, keyEvent)) {
            return d.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !d.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // a.h.j.d.a
    public boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f438b.f(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
