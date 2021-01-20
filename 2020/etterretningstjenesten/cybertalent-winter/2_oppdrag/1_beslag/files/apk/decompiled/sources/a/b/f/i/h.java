package a.b.f.i;

import a.b.c.d;
import a.b.f.i.e;
import a.b.f.i.m;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b  reason: collision with root package name */
    public g f109b;

    /* renamed from: c  reason: collision with root package name */
    public d f110c;
    public e d;

    public h(g gVar) {
        this.f109b = gVar;
    }

    @Override // a.b.f.i.m.a
    public void c(g gVar, boolean z) {
        d dVar;
        if ((z || gVar == this.f109b) && (dVar = this.f110c) != null) {
            dVar.dismiss();
        }
    }

    @Override // a.b.f.i.m.a
    public boolean d(g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f109b.r(((e.a) this.d.a()).getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.d;
        g gVar = this.f109b;
        m.a aVar = eVar.f;
        if (aVar != null) {
            aVar.c(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f110c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f110c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f109b.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f109b.performShortcut(i, keyEvent, 0);
    }
}
