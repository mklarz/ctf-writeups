package a.b.c;

import a.b.b;
import a.b.f.c;
import a.b.g.b0;
import a.b.g.d;
import a.b.g.f;
import a.b.g.g;
import a.b.g.k;
import a.b.g.l;
import a.b.g.o;
import a.b.g.s;
import a.b.g.t;
import a.b.g.u0;
import a.b.g.w;
import a.b.g.z;
import a.e.h;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class n {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final h<String, Constructor<? extends View>> sConstructorMap = new h<>();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f37b;

        /* renamed from: c  reason: collision with root package name */
        public final String f38c;
        public Method d;
        public Context e;

        public a(View view, String str) {
            this.f37b = view;
            this.f38c = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.d == null) {
                Context context = this.f37b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f38c, View.class)) != null) {
                            this.d = method;
                            this.e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f37b.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder d2 = b.a.a.a.a.d(" with id '");
                    d2.append(this.f37b.getContext().getResources().getResourceEntryName(id));
                    d2.append("'");
                    str = d2.toString();
                }
                StringBuilder d3 = b.a.a.a.a.d("Could not find method ");
                d3.append(this.f38c);
                d3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                d3.append(this.f37b.getClass());
                d3.append(str);
                throw new IllegalStateException(d3.toString());
            }
            try {
                this.d.invoke(this.e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (view.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        h<String, Constructor<? extends View>> hVar = sConstructorMap;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.y, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof c) || ((c) context).f59a != resourceId) ? new c(context, resourceId) : context;
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    public d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f createButton(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet, R.attr.buttonStyle);
    }

    public g createCheckBox(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public a.b.g.h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new a.b.g.h(context, attributeSet);
    }

    public k createEditText(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    public l createImageButton(Context context, AttributeSet attributeSet) {
        return new l(context, attributeSet);
    }

    public a.b.g.n createImageView(Context context, AttributeSet attributeSet) {
        return new a.b.g.n(context, attributeSet, 0);
    }

    public o createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    public a.b.g.r createRadioButton(Context context, AttributeSet attributeSet) {
        return new a.b.g.r(context, attributeSet);
    }

    public s createRatingBar(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    public t createSeekBar(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public w createSpinner(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet, R.attr.spinnerStyle);
    }

    public z createTextView(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    public b0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            u0.a(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\b':
                view2 = createToggleButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\t':
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\n':
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\f':
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case '\r':
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
