package no.cybertalent.liberatortoolkit;

import a.b.c.e;
import a.h.c.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import c.a.a.b;
import c.a.a.c;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends e {
    public View o;

    public void onChatClick(View view) {
        startActivity(new Intent(this, ChatActivity.class));
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d, a.b.c.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.o = findViewById(R.id.mLayout);
        if (a.a(this, "android.permission.INTERNET") == 0) {
            Snackbar.i(this.o, "Got internet permission!", -1).k();
        } else {
            int i = a.h.b.a.f423b;
            if (shouldShowRequestPermissionRationale("android.permission.INTERNET")) {
                Snackbar i2 = Snackbar.i(this.o, "Internet access is required", -2);
                i2.j("OK", new b(this));
                i2.k();
            } else {
                Snackbar.i(this.o, "No internet permission?", -1).k();
                a.h.b.a.b(this, new String[]{"android.permission.INTERNET"}, 0);
            }
        }
        if (a.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Snackbar.i(this.o, "Got external write permission!", -1).k();
        } else {
            int i3 = a.h.b.a.f423b;
            if (shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                Snackbar i4 = Snackbar.i(this.o, "External storage write is required", -2);
                i4.j("OK", new c(this));
                i4.k();
            } else {
                Snackbar.i(this.o, "No external storage write permission?", -1).k();
                a.h.b.a.b(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            }
        }
        System.loadLibrary("native-lib");
    }

    @Override // a.k.a.d
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        View view;
        String str;
        Snackbar snackbar;
        if (i == 0) {
            if (iArr.length == 1 && iArr[0] == 0) {
                view = this.o;
                str = "Internet permission granted";
            }
            snackbar = Snackbar.i(this.o, "You denied?!?", -1);
            snackbar.k();
        } else if (i == 1) {
            if (iArr.length == 1 && iArr[0] == 0) {
                view = this.o;
                str = "External storage write granted";
            }
            snackbar = Snackbar.i(this.o, "You denied?!?", -1);
            snackbar.k();
        } else {
            return;
        }
        snackbar = Snackbar.i(view, str, -1);
        snackbar.k();
    }

    public void onTunerClick(View view) {
        startActivity(new Intent(this, TunerActivity.class));
    }

    public void onVaultClick(View view) {
        startActivity(new Intent(this, VaultActivity.class));
    }
}
