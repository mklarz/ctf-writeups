package a.b.f;

import a.b.f.i.i;
import a.b.f.i.j;
import a.b.g.e0;
import a.b.g.x0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f67a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f68b;

    /* renamed from: c  reason: collision with root package name */
    public Context f69c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f70c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f71a;

        /* renamed from: b  reason: collision with root package name */
        public Method f72b;

        public a(Object obj, String str) {
            this.f71a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f72b = cls.getMethod(str, f70c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f72b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f72b.invoke(this.f71a, menuItem)).booleanValue();
                }
                this.f72b.invoke(this.f71a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public a.h.j.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f73a;

        /* renamed from: b  reason: collision with root package name */
        public int f74b;

        /* renamed from: c  reason: collision with root package name */
        public int f75c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.f73a = menu;
            this.f74b = 0;
            this.f75c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public SubMenu a() {
            this.h = true;
            SubMenu addSubMenu = this.f73a.addSubMenu(this.f74b, this.i, this.j, this.k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f69c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.f69c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.d == null) {
                        fVar.d = fVar.a(fVar.f69c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & -5) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.e.invoke(jVar.d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.e, f.this.f67a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.h.j.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof a.h.e.a.b) {
                    ((a.h.e.a.b) menuItem).b(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof a.h.e.a.b;
            if (z3) {
                ((a.h.e.a.b) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((a.h.e.a.b) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i4 = this.o;
            if (z3) {
                ((a.h.e.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z3) {
                ((a.h.e.a.b) menuItem).setNumericShortcut(c3, i5);
            } else {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((a.h.e.a.b) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((a.h.e.a.b) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f69c = context;
        Object[] objArr = {context};
        this.f67a = objArr;
        this.f68b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x0228 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v61, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c2;
        char c3;
        a.h.j.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(b.a.a.a.a.b("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                z = z;
                z = z;
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                            z = z;
                            z2 = z2;
                        } else if (name2.equals("group")) {
                            bVar2.f74b = 0;
                            bVar2.f75c = 0;
                            bVar2.d = 0;
                            bVar2.e = 0;
                            bVar2.f = true;
                            bVar2.g = true;
                            z = z;
                        } else if (name2.equals("item")) {
                            z = z;
                            if (!bVar2.h) {
                                a.h.j.b bVar3 = bVar2.A;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.h = true;
                                    bVar2.c(bVar2.f73a.add(bVar2.f74b, bVar2.i, bVar2.j, bVar2.k));
                                    z = z;
                                } else {
                                    bVar2.a();
                                    z = z;
                                }
                            }
                        } else {
                            z = z;
                            if (name2.equals("menu")) {
                                z = true;
                            }
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f69c.obtainStyledAttributes(attributeSet, a.b.b.p);
                        bVar2.f74b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f75c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z = z;
                    } else if (name3.equals("item")) {
                        x0 n = x0.n(f.this.f69c, attributeSet, a.b.b.q);
                        bVar2.i = n.j(2, 0);
                        bVar2.j = (n.h(5, bVar2.f75c) & -65536) | (n.h(6, bVar2.d) & 65535);
                        bVar2.k = n.l(7);
                        bVar2.l = n.l(8);
                        bVar2.m = n.j(0, 0);
                        String k = n.k(9);
                        if (k == null) {
                            c2 = 0;
                        } else {
                            c2 = k.charAt(0);
                        }
                        bVar2.n = c2;
                        bVar2.o = n.h(16, 4096);
                        String k2 = n.k(10);
                        if (k2 == null) {
                            c3 = 0;
                        } else {
                            c3 = k2.charAt(0);
                        }
                        bVar2.p = c3;
                        bVar2.q = n.h(20, 4096);
                        bVar2.r = n.m(11) ? n.a(11, false) : bVar2.e ? 1 : 0;
                        bVar2.s = n.a(3, false);
                        bVar2.t = n.a(4, bVar2.f);
                        bVar2.u = n.a(1, bVar2.g);
                        bVar2.v = n.h(21, -1);
                        bVar2.z = n.k(12);
                        bVar2.w = n.j(13, 0);
                        bVar2.x = n.k(15);
                        String k3 = n.k(14);
                        bVar2.y = k3;
                        boolean z3 = k3 != null;
                        if (z3 && bVar2.w == 0 && bVar2.x == null) {
                            bVar = (a.h.j.b) bVar2.b(k3, f, f.this.f68b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.A = bVar;
                        bVar2.B = n.l(17);
                        bVar2.C = n.l(22);
                        if (n.m(19)) {
                            bVar2.E = e0.b(n.h(19, -1), bVar2.E);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.E = null;
                        }
                        if (n.m(18)) {
                            colorStateList = n.b(18);
                        }
                        bVar2.D = colorStateList;
                        n.f240b.recycle();
                        bVar2.h = false;
                        z = z;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet, bVar2.a());
                        } else {
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                        z = z;
                        z2 = z2;
                    }
                }
                eventType = xmlPullParser.next();
                z = z;
                z2 = z2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.h.e.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f69c.getResources().getLayout(i);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
