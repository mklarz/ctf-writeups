package a.b.c;

import a.b.f.a;
import a.b.g.a1;
import a.e.c;
import a.k.a.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class e extends d implements f {
    public g n;

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(o().d(context));
    }

    @Override // a.b.c.f
    public void c(a aVar) {
    }

    public void closeOptionsMenu() {
        p();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.h.b.e
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        p();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) o().e(i);
    }

    @Override // a.b.c.f
    public void g(a aVar) {
    }

    public MenuInflater getMenuInflater() {
        return o().g();
    }

    public Resources getResources() {
        int i = a1.f138a;
        return super.getResources();
    }

    @Override // a.b.c.f
    public a h(a.AbstractC0002a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        o().j();
    }

    @Override // a.k.a.d
    public void n() {
        o().j();
    }

    public g o() {
        if (this.n == null) {
            c<WeakReference<g>> cVar = g.f12b;
            this.n = new h(this, null, this, this);
        }
        return this.n;
    }

    @Override // a.k.a.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o().k(configuration);
    }

    public void onContentChanged() {
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d
    public void onCreate(Bundle bundle) {
        g o = o();
        o.i();
        o.l(bundle);
        super.onCreate(bundle);
    }

    @Override // a.k.a.d
    public void onDestroy() {
        super.onDestroy();
        o().m();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // a.k.a.d
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a p = p();
        if (menuItem.getItemId() != 16908332 || p == null || (((q) p).e.j() & 4) == 0) {
            return false;
        }
        Intent k = a.h.b.d.k(this);
        if (k == null) {
            return false;
        }
        if (shouldUpRecreateTask(k)) {
            ArrayList arrayList = new ArrayList();
            Intent q = q();
            if (q == null) {
                q = a.h.b.d.k(this);
            }
            if (q != null) {
                ComponentName component = q.getComponent();
                if (component == null) {
                    component = q.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent l = a.h.b.d.l(this, component);
                        if (l == null) {
                            break;
                        }
                        arrayList.add(size, l);
                        component = l.getComponent();
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(q);
            }
            s();
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = a.h.c.a.f439a;
                startActivities(intentArr, null);
                try {
                    int i2 = a.h.b.a.f423b;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(k);
            return true;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // a.k.a.d
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        o().n(bundle);
    }

    @Override // a.k.a.d
    public void onPostResume() {
        super.onPostResume();
        o().o();
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o().p(bundle);
    }

    @Override // a.k.a.d
    public void onStart() {
        super.onStart();
        o().q();
    }

    @Override // a.k.a.d
    public void onStop() {
        super.onStop();
        o().r();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        o().y(charSequence);
    }

    public void openOptionsMenu() {
        p();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public a p() {
        return o().h();
    }

    public Intent q() {
        return a.h.b.d.k(this);
    }

    public void r() {
    }

    public void s() {
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        o().u(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        o().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o().w(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        o().x(i);
    }
}
