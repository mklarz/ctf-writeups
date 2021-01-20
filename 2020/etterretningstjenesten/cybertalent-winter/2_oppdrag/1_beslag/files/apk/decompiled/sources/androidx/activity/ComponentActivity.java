package androidx.activity;

import a.h.b.e;
import a.m.d;
import a.m.g;
import a.m.h;
import a.m.o;
import a.m.s;
import a.m.t;
import a.p.c;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class ComponentActivity extends e implements g, t, c, a.a.c {

    /* renamed from: c  reason: collision with root package name */
    public final h f800c;
    public final a.p.b d = new a.p.b(this);
    public s e;
    public final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public s f804a;
    }

    public ComponentActivity() {
        h hVar = new h(this);
        this.f800c = hVar;
        hVar.a(new a.m.e() {
            /* class androidx.activity.ComponentActivity.AnonymousClass2 */

            @Override // a.m.e
            public void g(g gVar, d.a aVar) {
                if (aVar == d.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        hVar.a(new a.m.e() {
            /* class androidx.activity.ComponentActivity.AnonymousClass3 */

            @Override // a.m.e
            public void g(g gVar, d.a aVar) {
                if (aVar == d.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.f().a();
                }
            }
        });
    }

    @Override // a.m.g
    public d a() {
        return this.f800c;
    }

    @Override // a.a.c
    public final OnBackPressedDispatcher d() {
        return this.f;
    }

    @Override // a.p.c
    public final a.p.a e() {
        return this.d.f739b;
    }

    @Override // a.m.t
    public s f() {
        if (getApplication() != null) {
            if (this.e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.e = bVar.f804a;
                }
                if (this.e == null) {
                    this.e = new s();
                }
            }
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f.a();
    }

    @Override // a.h.b.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a(bundle);
        o.b(this);
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        s sVar = this.e;
        if (sVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f804a;
        }
        if (sVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f804a = sVar;
        return bVar2;
    }

    @Override // a.h.b.e
    public void onSaveInstanceState(Bundle bundle) {
        h hVar = this.f800c;
        if (hVar instanceof h) {
            hVar.f(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }
}
