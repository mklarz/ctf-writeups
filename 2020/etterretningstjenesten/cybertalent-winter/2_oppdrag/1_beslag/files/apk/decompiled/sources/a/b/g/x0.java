package a.b.g;

import a.b.d.a.a;
import a.h.b.d;
import a.h.c.b.e;
import a.h.d.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f239a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f240b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f241c;

    public x0(Context context, TypedArray typedArray) {
        this.f239a = context;
        this.f240b = typedArray;
    }

    public static x0 n(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 o(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f240b.getBoolean(i, z);
    }

    public ColorStateList b(int i) {
        int resourceId;
        if (this.f240b.hasValue(i) && (resourceId = this.f240b.getResourceId(i, 0)) != 0) {
            Context context = this.f239a;
            ThreadLocal<TypedValue> threadLocal = a.f53a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return this.f240b.getColorStateList(i);
    }

    public int c(int i, int i2) {
        return this.f240b.getDimensionPixelOffset(i, i2);
    }

    public int d(int i, int i2) {
        return this.f240b.getDimensionPixelSize(i, i2);
    }

    public Drawable e(int i) {
        int resourceId;
        return (!this.f240b.hasValue(i) || (resourceId = this.f240b.getResourceId(i, 0)) == 0) ? this.f240b.getDrawable(i) : a.a(this.f239a, resourceId);
    }

    public Drawable f(int i) {
        int resourceId;
        Drawable f;
        if (!this.f240b.hasValue(i) || (resourceId = this.f240b.getResourceId(i, 0)) == 0) {
            return null;
        }
        j a2 = j.a();
        Context context = this.f239a;
        synchronized (a2) {
            f = a2.f176a.f(context, resourceId, true);
        }
        return f;
    }

    public Typeface g(int i, int i2, e eVar) {
        Throwable e;
        String str;
        StringBuilder sb;
        int resourceId = this.f240b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f241c == null) {
            this.f241c = new TypedValue();
        }
        Context context = this.f239a;
        TypedValue typedValue = this.f241c;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                Typeface a2 = c.f458b.a(c.c(resources, resourceId, i2));
                if (a2 != null) {
                    eVar.b(a2, null);
                    return a2;
                }
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        a.h.c.b.a r = d.r(resources.getXml(resourceId), resources);
                        if (r != null) {
                            return c.a(context, r, resources, resourceId, i2, eVar, null, true);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        eVar.a(-3, null);
                        return null;
                    }
                    Typeface b2 = c.b(context, resources, resourceId, charSequence2, i2);
                    if (b2 != null) {
                        eVar.b(b2, null);
                    } else {
                        eVar.a(-3, null);
                    }
                    return b2;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str = "Failed to parse xml resource ";
                    sb.append(str);
                    sb.append(charSequence2);
                    Log.e("ResourcesCompat", sb.toString(), e);
                    eVar.a(-3, null);
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    str = "Failed to read xml resource ";
                    sb.append(str);
                    sb.append(charSequence2);
                    Log.e("ResourcesCompat", sb.toString(), e);
                    eVar.a(-3, null);
                    return null;
                }
            }
            eVar.a(-3, null);
            return null;
        }
        StringBuilder d = b.a.a.a.a.d("Resource \"");
        d.append(resources.getResourceName(resourceId));
        d.append("\" (");
        d.append(Integer.toHexString(resourceId));
        d.append(") is not a Font: ");
        d.append(typedValue);
        throw new Resources.NotFoundException(d.toString());
    }

    public int h(int i, int i2) {
        return this.f240b.getInt(i, i2);
    }

    public int i(int i, int i2) {
        return this.f240b.getLayoutDimension(i, i2);
    }

    public int j(int i, int i2) {
        return this.f240b.getResourceId(i, i2);
    }

    public String k(int i) {
        return this.f240b.getString(i);
    }

    public CharSequence l(int i) {
        return this.f240b.getText(i);
    }

    public boolean m(int i) {
        return this.f240b.hasValue(i);
    }
}
