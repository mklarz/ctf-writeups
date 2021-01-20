package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f896a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f897b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f898c = null;
    public Parcelable d = null;
    public int e = 0;
    public int f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = k;
    public String i = null;
    public String j;

    public String toString() {
        String str;
        int i2;
        int i3;
        if (this.f896a == -1) {
            return String.valueOf(this.f897b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f896a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f896a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f897b).getWidth());
                sb.append("x");
                i2 = ((Bitmap) this.f897b).getHeight();
                sb.append(i2);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i4 = this.f896a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Icon icon = (Icon) this.f897b;
                    if (i5 >= 28) {
                        i3 = icon.getResId();
                    } else {
                        try {
                            i3 = ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            i3 = 0;
                        }
                    }
                } else if (i4 == 2) {
                    i3 = this.e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i3);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    i2 = this.f;
                    sb.append(i2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f897b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
