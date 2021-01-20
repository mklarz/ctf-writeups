package a.k.a;

import a.h.b.d;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h<E> extends e {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f578b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f579c;
    public final Handler d;
    public final int e;
    public final j f = new j();

    public h(d dVar) {
        Handler handler = new Handler();
        this.f578b = dVar;
        d.c(dVar, "context == null");
        this.f579c = dVar;
        d.c(handler, "handler == null");
        this.d = handler;
        this.e = 0;
    }

    public abstract void g(Fragment fragment);

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract E i();

    public abstract LayoutInflater j();

    public abstract void k();
}
