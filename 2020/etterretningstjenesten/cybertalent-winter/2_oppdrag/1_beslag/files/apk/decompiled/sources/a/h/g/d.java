package a.h.g;

import a.e.h;
import a.h.g.e;
import a.h.g.f;
import java.util.ArrayList;

public class d implements f.c<e.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f471a;

    public d(String str) {
        this.f471a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 >= r2.size()) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r2.get(r0).a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = 0;
     */
    /* renamed from: b */
    public void a(e.d dVar) {
        synchronized (e.f474c) {
            h<String, ArrayList<f.c<e.d>>> hVar = e.d;
            ArrayList<f.c<e.d>> arrayList = hVar.get(this.f471a);
            if (arrayList != null) {
                hVar.remove(this.f471a);
            }
        }
    }
}
