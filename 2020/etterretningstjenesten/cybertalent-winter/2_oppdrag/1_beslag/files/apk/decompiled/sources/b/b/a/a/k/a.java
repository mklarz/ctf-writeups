package b.b.a.a.k;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1061a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1062b = {16843623, 16842908};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1063c = {16842908};
    public static final int[] d = {16843623};
    public static final int[] e = {16842913, 16842919};
    public static final int[] f = {16842913, 16843623, 16842908};
    public static final int[] g = {16842913, 16842908};
    public static final int[] h = {16842913, 16843623};
    public static final int[] i = {16842913};

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{i, StateSet.NOTHING}, new int[]{b(colorStateList, e), b(colorStateList, f1061a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a.h.d.a.c(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}
