package a.h.d;

import a.e.f;
import a.e.h;
import a.h.c.b.a;
import a.h.c.b.d;
import a.h.c.b.e;
import a.h.g.b;
import a.h.g.e;
import a.h.g.f;
import a.h.g.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Objects;

@SuppressLint({"NewApi"})
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final i f457a;

    /* renamed from: b  reason: collision with root package name */
    public static final f<String, Typeface> f458b = new f<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        f457a = i >= 29 ? new g() : i >= 28 ? new f() : new e();
    }

    public static Typeface a(Context context, a aVar, Resources resources, int i, int i2, e eVar, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof d) {
            d dVar = (d) aVar;
            boolean z2 = true;
            if (!z ? eVar != null : dVar.f446c != 0) {
                z2 = false;
            }
            int i3 = z ? dVar.f445b : -1;
            a.h.g.a aVar2 = dVar.f444a;
            f<String, Typeface> fVar = a.h.g.e.f472a;
            String str = aVar2.e + "-" + i2;
            typeface = a.h.g.e.f472a.a(str);
            if (typeface != null) {
                if (eVar != null) {
                    eVar.c(typeface);
                }
            } else if (!z2 || i3 != -1) {
                b bVar = new b(context, aVar2, i2, str);
                typeface = null;
                if (z2) {
                    try {
                        typeface = ((e.d) a.h.g.e.f473b.b(bVar, i3)).f480a;
                    } catch (InterruptedException unused) {
                    }
                } else {
                    a.h.g.c cVar = eVar == null ? null : new a.h.g.c(eVar, handler);
                    synchronized (a.h.g.e.f474c) {
                        h<String, ArrayList<f.c<e.d>>> hVar = a.h.g.e.d;
                        ArrayList<f.c<e.d>> orDefault = hVar.getOrDefault(str, null);
                        if (orDefault == null) {
                            if (cVar != null) {
                                ArrayList<f.c<e.d>> arrayList = new ArrayList<>();
                                arrayList.add(cVar);
                                hVar.put(str, arrayList);
                            }
                            a.h.g.f fVar2 = a.h.g.e.f473b;
                            a.h.g.d dVar2 = new a.h.g.d(str);
                            Objects.requireNonNull(fVar2);
                            fVar2.a(new g(fVar2, bVar, new Handler(), dVar2));
                        } else if (cVar != null) {
                            orDefault.add(cVar);
                        }
                    }
                }
            } else {
                e.d b2 = a.h.g.e.b(context, aVar2, i2);
                if (eVar != null) {
                    int i4 = b2.f481b;
                    if (i4 == 0) {
                        eVar.b(b2.f480a, handler);
                    } else {
                        eVar.a(i4, handler);
                    }
                }
                typeface = b2.f480a;
            }
        } else {
            typeface = f457a.a(context, (a.h.c.b.b) aVar, resources, i2);
            if (eVar != null) {
                if (typeface != null) {
                    eVar.b(typeface, handler);
                } else {
                    eVar.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f458b.b(c(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2) {
        Typeface c2 = f457a.c(context, resources, i, str, i2);
        if (c2 != null) {
            f458b.b(c(resources, i, i2), c2);
        }
        return c2;
    }

    public static String c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
