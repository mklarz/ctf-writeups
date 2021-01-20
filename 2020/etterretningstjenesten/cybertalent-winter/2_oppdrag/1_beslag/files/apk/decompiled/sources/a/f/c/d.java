package a.f.c;

import a.f.c.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<a> f381a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<e> f382b = new SparseArray<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f383a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f384b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f385c = -1;
        public e d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f383a = obtainStyledAttributes.getResourceId(index, this.f383a);
                } else if (index == 1) {
                    this.f385c = obtainStyledAttributes.getResourceId(index, this.f385c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f385c);
                    context.getResources().getResourceName(this.f385c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.d = eVar;
                        eVar.a(context, this.f385c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f386a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f387b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f388c = Float.NaN;
        public float d = Float.NaN;
        public int e = -1;
        public e f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f = eVar;
                        eVar.a(context, this.e);
                    }
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f387b = obtainStyledAttributes.getDimension(index, this.f387b);
                } else if (index == 3) {
                    this.f388c = obtainStyledAttributes.getDimension(index, this.f388c);
                } else if (index == 4) {
                    this.f386a = obtainStyledAttributes.getDimension(index, this.f386a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public d(Context context, ConstraintLayout constraintLayout, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c2 == 0 || c2 == 1)) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f381a.put(aVar.f383a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.f384b.add(bVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d0, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r1.equals("PropertySet") != false) goto L_0x00e8;
     */
    public final void a(Context context, XmlPullParser xmlPullParser) {
        e.a aVar;
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlPullParser.getEventType();
                    e.a aVar2 = null;
                    while (eventType != 1) {
                        if (eventType != 0) {
                            char c2 = 3;
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                switch (name.hashCode()) {
                                    case -2025855158:
                                        if (name.equals("Layout")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1984451626:
                                        if (name.equals("Motion")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1269513683:
                                        break;
                                    case -1238332596:
                                        if (name.equals("Transform")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -71750448:
                                        if (name.equals("Guideline")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1331510167:
                                        if (name.equals("Barrier")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1791837707:
                                        if (name.equals("CustomAttribute")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1803088381:
                                        if (name.equals("Constraint")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                        aVar = eVar.c(context, Xml.asAttributeSet(xmlPullParser));
                                        aVar2 = aVar;
                                        break;
                                    case 1:
                                        aVar = eVar.c(context, Xml.asAttributeSet(xmlPullParser));
                                        e.b bVar = aVar.d;
                                        bVar.f395a = true;
                                        bVar.f396b = true;
                                        aVar2 = aVar;
                                        break;
                                    case 2:
                                        aVar = eVar.c(context, Xml.asAttributeSet(xmlPullParser));
                                        aVar.d.d0 = 1;
                                        aVar2 = aVar;
                                        break;
                                    case 3:
                                        if (aVar2 != null) {
                                            aVar2.f393b.a(context, Xml.asAttributeSet(xmlPullParser));
                                            break;
                                        } else {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                        }
                                    case 4:
                                        if (aVar2 != null) {
                                            aVar2.e.a(context, Xml.asAttributeSet(xmlPullParser));
                                            break;
                                        } else {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                        }
                                    case 5:
                                        if (aVar2 != null) {
                                            aVar2.d.a(context, Xml.asAttributeSet(xmlPullParser));
                                            break;
                                        } else {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                        }
                                    case 6:
                                        if (aVar2 != null) {
                                            aVar2.f394c.a(context, Xml.asAttributeSet(xmlPullParser));
                                            break;
                                        } else {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                        }
                                    case 7:
                                        if (aVar2 != null) {
                                            b.a(context, xmlPullParser, aVar2.f);
                                            break;
                                        } else {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                        }
                                }
                            } else if (eventType != 3) {
                                continue;
                            } else {
                                String name2 = xmlPullParser.getName();
                                if ("ConstraintSet".equals(name2)) {
                                    this.f382b.put(identifier, eVar);
                                    return;
                                } else if (name2.equalsIgnoreCase("Constraint")) {
                                    eVar.f391c.put(Integer.valueOf(aVar2.f392a), aVar2);
                                    aVar2 = null;
                                }
                            }
                        } else {
                            xmlPullParser.getName();
                        }
                        eventType = xmlPullParser.next();
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                this.f382b.put(identifier, eVar);
                return;
            }
        }
    }
}
