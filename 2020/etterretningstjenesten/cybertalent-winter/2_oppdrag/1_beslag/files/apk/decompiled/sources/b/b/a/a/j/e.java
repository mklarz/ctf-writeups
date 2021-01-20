package b.b.a.a.j;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.a.a.a.a;
import b.b.a.a.b;
import no.cybertalent.liberatortoolkit.R;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1058a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1059b = {R.attr.colorSecondary};

    public static void a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException(a.c("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    public static TypedArray b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        int[] iArr3 = b.h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr3, i, i2);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            a(context, f1059b, "Theme.MaterialComponents");
        }
        a(context, f1058a, "Theme.AppCompat");
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, i2);
        if (!obtainStyledAttributes2.getBoolean(2, false)) {
            obtainStyledAttributes2.recycle();
        } else {
            if (iArr2.length != 0) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
                for (int i3 : iArr2) {
                    if (obtainStyledAttributes3.getResourceId(i3, -1) == -1) {
                        obtainStyledAttributes3.recycle();
                    }
                }
                obtainStyledAttributes3.recycle();
                obtainStyledAttributes2.recycle();
                if (!z) {
                    throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
                }
            }
            z = false;
            obtainStyledAttributes2.recycle();
            if (!z) {
            }
        }
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
