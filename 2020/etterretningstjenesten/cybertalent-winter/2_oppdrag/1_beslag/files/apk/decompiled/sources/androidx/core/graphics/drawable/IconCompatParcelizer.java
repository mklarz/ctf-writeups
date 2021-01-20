package androidx.core.graphics.drawable;

import a.s.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f896a = aVar.k(iconCompat.f896a, 1);
        byte[] bArr = iconCompat.f898c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f898c = bArr;
        iconCompat.d = aVar.m(iconCompat.d, 3);
        iconCompat.e = aVar.k(iconCompat.e, 4);
        iconCompat.f = aVar.k(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) aVar.m(iconCompat.g, 6);
        String str = iconCompat.i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f896a) {
            case -1:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f897b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f898c;
                    iconCompat.f897b = bArr2;
                    iconCompat.f896a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr2.length;
                    break;
                }
                iconCompat.f897b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f898c, Charset.forName("UTF-16"));
                iconCompat.f897b = str3;
                if (iconCompat.f896a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f897b = iconCompat.f898c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f896a) {
            case -1:
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f897b;
                break;
            case 2:
                iconCompat.f898c = ((String) iconCompat.f897b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f898c = (byte[]) iconCompat.f897b;
                break;
            case 4:
            case 6:
                iconCompat.f898c = iconCompat.f897b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f896a;
        if (-1 != i) {
            aVar.p(1);
            aVar.t(i);
        }
        byte[] bArr = iconCompat.f898c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            aVar.p(4);
            aVar.t(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            aVar.p(5);
            aVar.t(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
