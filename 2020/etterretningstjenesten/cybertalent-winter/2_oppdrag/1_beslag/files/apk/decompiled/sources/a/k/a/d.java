package a.k.a;

import a.a.c;
import a.e.i;
import a.h.b.a;
import a.m.d;
import a.m.h;
import a.m.s;
import a.m.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

public class d extends ComponentActivity implements a.AbstractC0010a {
    public final f g;
    public final h h = new h(this);
    public boolean i;
    public boolean j;
    public boolean k = true;
    public int l;
    public i<String> m;

    public class a extends h<d> implements t, c {
        public a() {
            super(d.this);
        }

        @Override // a.m.g
        public a.m.d a() {
            return d.this.h;
        }

        @Override // a.k.a.e
        public View b(int i) {
            return d.this.findViewById(i);
        }

        @Override // a.k.a.e
        public boolean c() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // a.a.c
        public OnBackPressedDispatcher d() {
            return d.this.f;
        }

        @Override // a.m.t
        public s f() {
            return d.this.f();
        }

        @Override // a.k.a.h
        public void g(Fragment fragment) {
            d.this.m();
        }

        @Override // a.k.a.h
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, null, printWriter, strArr);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.k.a.h
        public d i() {
            return d.this;
        }

        @Override // a.k.a.h
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // a.k.a.h
        public void k() {
            d.this.n();
        }
    }

    public d() {
        a aVar = new a();
        a.h.b.d.c(aVar, "callbacks == null");
        this.g = new f(aVar);
    }

    public static void k(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean l(i iVar, d.b bVar) {
        List<Fragment> list;
        j jVar = (j) iVar;
        if (jVar.f.isEmpty()) {
            list = Collections.emptyList();
        } else {
            synchronized (jVar.f) {
                list = (List) jVar.f.clone();
            }
        }
        boolean z = false;
        for (Fragment fragment : list) {
            if (fragment != null) {
                if (fragment.O.f646b.compareTo(d.b.STARTED) >= 0) {
                    fragment.O.f(bVar);
                    z = true;
                }
                h hVar = fragment.s;
                if ((hVar == null ? null : hVar.i()) != null) {
                    z |= l(fragment.h(), bVar);
                }
            }
        }
        return z;
    }

    @Override // a.h.b.a.AbstractC0010a
    public final void b(int i2) {
        if (i2 != -1) {
            k(i2);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.k);
        if (getApplication() != null) {
            a.n.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.g.f576a.f.I(str, fileDescriptor, printWriter, strArr);
    }

    public void m() {
    }

    @Deprecated
    public void n() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.g.a();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String d = this.m.d(i5);
            this.m.h(i5);
            if (d == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.g.f576a.f.O(d) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d);
            }
        } else {
            int i6 = a.h.b.a.f423b;
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a();
        this.g.f576a.f.i(configuration);
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e
    public void onCreate(Bundle bundle) {
        h<?> hVar = this.g.f576a;
        hVar.f.d(hVar, hVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            h<?> hVar2 = this.g.f576a;
            if (hVar2 instanceof t) {
                hVar2.f.a0(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.l = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.m = new i<>(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.m.g(intArray[i2], stringArray[i2]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.m == null) {
            this.m = new i<>(10);
            this.l = 0;
        }
        super.onCreate(bundle);
        this.h.d(d.a.ON_CREATE);
        this.g.f576a.f.k();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        f fVar = this.g;
        return onCreatePanelMenu | fVar.f576a.f.l(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        this.g.f576a.f.onCreateView(view, str, context, attributeSet);
        return super.onCreateView(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.f576a.f.m();
        this.h.d(d.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.g.f576a.f.n();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.g.f576a.f.C(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.g.f576a.f.j(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.g.f576a.f.o(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.g.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.g.f576a.f.D(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.j = false;
        this.g.f576a.f.H(3);
        this.h.d(d.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.g.f576a.f.F(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.h.d(d.a.ON_RESUME);
        j jVar = this.g.f576a.f;
        jVar.u = false;
        jVar.v = false;
        jVar.H(4);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.g.f576a.f.G(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.g.a();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String d = this.m.d(i4);
            this.m.h(i4);
            if (d == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.g.f576a.f.O(d) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.j = true;
        this.g.a();
        this.g.f576a.f.K();
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (l(this.g.f576a.f, d.b.CREATED));
        this.h.d(d.a.ON_STOP);
        Parcelable b0 = this.g.f576a.f.b0();
        if (b0 != null) {
            bundle.putParcelable("android:support:fragments", b0);
        }
        if (this.m.i() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.i()];
            String[] strArr = new String[this.m.i()];
            for (int i2 = 0; i2 < this.m.i(); i2++) {
                iArr[i2] = this.m.f(i2);
                strArr[i2] = this.m.j(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.k = false;
        if (!this.i) {
            this.i = true;
            j jVar = this.g.f576a.f;
            jVar.u = false;
            jVar.v = false;
            jVar.H(2);
        }
        this.g.a();
        this.g.f576a.f.K();
        this.h.d(d.a.ON_START);
        j jVar2 = this.g.f576a.f;
        jVar2.u = false;
        jVar2.v = false;
        jVar2.H(3);
    }

    public void onStateNotSaved() {
        this.g.a();
    }

    public void onStop() {
        super.onStop();
        this.k = true;
        do {
        } while (l(this.g.f576a.f, d.b.CREATED));
        j jVar = this.g.f576a.f;
        jVar.v = true;
        jVar.H(2);
        this.h.d(d.a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (i2 != -1) {
            k(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            k(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (i2 != -1) {
            k(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            k(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        this.g.f576a.f.onCreateView(null, str, context, attributeSet);
        return super.onCreateView(str, context, attributeSet);
    }
}
