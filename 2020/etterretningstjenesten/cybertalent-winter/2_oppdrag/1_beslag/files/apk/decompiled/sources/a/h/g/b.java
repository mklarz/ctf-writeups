package a.h.g;

import a.h.g.e;
import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

public class b implements Callable<e.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f468c;
    public final /* synthetic */ String d;

    public b(Context context, a aVar, int i, String str) {
        this.f466a = context;
        this.f467b = aVar;
        this.f468c = i;
        this.d = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public e.d call() {
        e.d b2 = e.b(this.f466a, this.f467b, this.f468c);
        Typeface typeface = b2.f480a;
        if (typeface != null) {
            e.f472a.b(this.d, typeface);
        }
        return b2;
    }
}
