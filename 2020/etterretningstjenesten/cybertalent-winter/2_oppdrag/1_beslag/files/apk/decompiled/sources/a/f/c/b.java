package a.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f373a;

    /* renamed from: b  reason: collision with root package name */
    public a f374b;

    /* renamed from: c  reason: collision with root package name */
    public int f375c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(b bVar, Object obj) {
        this.f373a = bVar.f373a;
        this.f374b = bVar.f374b;
        b(obj);
    }

    public b(String str, a aVar, Object obj) {
        this.f373a = str;
        this.f374b = aVar;
        b(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        Object obj;
        a aVar;
        int i;
        float f2;
        a aVar2 = a.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj2 = null;
        a aVar3 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                aVar3 = a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    aVar = a.COLOR_TYPE;
                } else if (index == 2) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == 7) {
                        f2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f2 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == 5) {
                            aVar = a.FLOAT_TYPE;
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else if (index == 6) {
                            aVar = a.INT_TYPE;
                            i = obtainStyledAttributes.getInteger(index, -1);
                            obj = Integer.valueOf(i);
                        } else if (index == 8) {
                            aVar = a.STRING_TYPE;
                            obj = obtainStyledAttributes.getString(index);
                        }
                        aVar3 = aVar;
                        obj2 = obj;
                    }
                    obj2 = Float.valueOf(f2);
                    aVar3 = aVar2;
                }
                i = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i);
                aVar3 = aVar;
                obj2 = obj;
            }
        }
        if (!(str == null || obj2 == null)) {
            hashMap.put(str, new b(str, aVar3, obj2));
        }
        obtainStyledAttributes.recycle();
    }

    public void b(Object obj) {
        switch (this.f374b.ordinal()) {
            case 0:
                this.f375c = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
