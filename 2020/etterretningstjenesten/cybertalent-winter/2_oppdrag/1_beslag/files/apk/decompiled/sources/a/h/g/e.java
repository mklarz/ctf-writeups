package a.h.g;

import a.e.f;
import a.e.h;
import a.h.g.f;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final f<String, Typeface> f472a = new f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final f f473b = new f("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f474c = new Object();
    public static final h<String, ArrayList<f.c<d>>> d = new h<>();
    public static final Comparator<byte[]> e = new a();

    public class a implements Comparator<byte[]> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                i2 = bArr3.length;
                i = bArr4.length;
            } else {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        i2 = bArr3[i3];
                        i = bArr4[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f475a;

        /* renamed from: b  reason: collision with root package name */
        public final c[] f476b;

        public b(int i, c[] cVarArr) {
            this.f475a = i;
            this.f476b = cVarArr;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f477a;

        /* renamed from: b  reason: collision with root package name */
        public final int f478b;

        /* renamed from: c  reason: collision with root package name */
        public final int f479c;
        public final boolean d;
        public final int e;

        public c(Uri uri, int i, int i2, boolean z, int i3) {
            Objects.requireNonNull(uri);
            this.f477a = uri;
            this.f478b = i;
            this.f479c = i2;
            this.d = z;
            this.e = i3;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f480a;

        /* renamed from: b  reason: collision with root package name */
        public final int f481b;

        public d(Typeface typeface, int i) {
            this.f480a = typeface;
            this.f481b = i;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [a.h.g.e$c[], android.database.Cursor] */
    public static b a(Context context, CancellationSignal cancellationSignal, a aVar) {
        Cursor cursor;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = aVar.f463a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(b.a.a.a.a.b("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(aVar.f464b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, e);
            List<List<byte[]>> list = aVar.d;
            if (list == null) {
                list = a.h.b.d.s(resources, 0);
            }
            int i = 0;
            while (true) {
                cursor = 0;
                if (i >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, e);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return new b(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f465c}, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        arrayList3.add(new c(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                    }
                }
                return new b(0, (c[]) arrayList3.toArray(new c[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aVar.f464b);
        }
    }

    public static d b(Context context, a aVar, int i) {
        try {
            b a2 = a(context, null, aVar);
            int i2 = a2.f475a;
            int i3 = -3;
            if (i2 == 0) {
                Typeface b2 = a.h.d.c.f457a.b(context, null, a2.f476b, i);
                if (b2 != null) {
                    i3 = 0;
                }
                return new d(b2, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new d(null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new d(null, -1);
        }
    }
}
