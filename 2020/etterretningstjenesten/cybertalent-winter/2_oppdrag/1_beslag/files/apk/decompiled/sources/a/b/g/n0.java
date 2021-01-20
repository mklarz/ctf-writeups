package a.b.g;

import a.b.g.j;
import a.e.d;
import a.e.e;
import a.e.f;
import a.e.h;
import a.e.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class n0 {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static n0 i;
    public static final a j = new a(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, i<ColorStateList>> f196a;

    /* renamed from: b  reason: collision with root package name */
    public h<String, b> f197b;

    /* renamed from: c  reason: collision with root package name */
    public i<String> f198c;
    public final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public c g;

    public static class a extends f<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
    }

    public static synchronized n0 c() {
        n0 n0Var;
        synchronized (n0.class) {
            if (i == null) {
                i = new n0();
            }
            n0Var = i;
        }
        return n0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n0.class) {
            a aVar = j;
            Objects.requireNonNull(aVar);
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(aVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
            if (eVar == null) {
                eVar = new e<>();
                this.d.put(context, eVar);
            }
            eVar.f(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable b(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        c cVar = this.g;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j2) {
        Object[] objArr;
        Object obj;
        e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e2 = eVar.e(j2, null);
        if (e2 != null) {
            Drawable.ConstantState constantState = e2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = d.b(eVar.f284b, eVar.d, j2);
            if (b2 >= 0 && (objArr = eVar.f285c)[b2] != (obj = e.e)) {
                objArr[b2] = obj;
                eVar.f283a = true;
            }
        }
        return null;
    }

    public synchronized Drawable e(Context context, int i2) {
        return f(context, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    public synchronized Drawable f(Context context, int i2, boolean z) {
        Drawable i3;
        if (!this.f) {
            boolean z2 = true;
            this.f = true;
            Drawable e2 = e(context, R.drawable.abc_vector_test);
            if (e2 != null) {
                if (!(e2 instanceof a.r.a.a.b)) {
                    if (!"android.graphics.drawable.VectorDrawable".equals(e2.getClass().getName())) {
                        z2 = false;
                    }
                }
            }
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        i3 = i(context, i2);
        if (i3 == null) {
            i3 = b(context, i2);
        }
        if (i3 == null) {
            Object obj = a.h.c.a.f439a;
            i3 = context.getDrawable(i2);
        }
        if (i3 != null) {
            i3 = j(context, i2, z, i3);
        }
        if (i3 != null) {
            int[] iArr = e0.f151a;
        }
        return i3;
    }

    public synchronized ColorStateList h(Context context, int i2) {
        ColorStateList colorStateList;
        i<ColorStateList> iVar;
        WeakHashMap<Context, i<ColorStateList>> weakHashMap = this.f196a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = iVar.e(i2, null);
        }
        if (colorStateList == null) {
            c cVar = this.g;
            if (cVar != null) {
                colorStateList2 = ((j.a) cVar).c(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f196a == null) {
                    this.f196a = new WeakHashMap<>();
                }
                i<ColorStateList> iVar2 = this.f196a.get(context);
                if (iVar2 == null) {
                    iVar2 = new i<>(10);
                    this.f196a.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1 A[Catch:{ Exception -> 0x00a9 }] */
    public final Drawable i(Context context, int i2) {
        int next;
        h<String, b> hVar = this.f197b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        i<String> iVar = this.f198c;
        if (iVar != null) {
            String e2 = iVar.e(i2, null);
            if ("appcompat_skip_skip".equals(e2) || (e2 != null && this.f197b.getOrDefault(e2, null) == null)) {
                return null;
            }
        } else {
            this.f198c = new i<>(10);
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        if (next != 2) {
                            String name = xml.getName();
                            this.f198c.a(i2, name);
                            b bVar = this.f197b.get(name);
                            if (bVar != null) {
                                d2 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (d2 != null) {
                                d2.setChangingConfigurations(typedValue.changingConfigurations);
                                a(context, j2, d2);
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                }
                if (next != 2) {
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (d2 == null) {
            this.f198c.a(i2, "appcompat_skip_skip");
        }
        return d2;
    }

    public final Drawable j(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList h2 = h(context, i2);
        PorterDuff.Mode mode = null;
        if (h2 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(h2);
            c cVar = this.g;
            if (cVar != null) {
                j.a aVar = (j.a) cVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        c cVar2 = this.g;
        if (cVar2 != null) {
            j.a aVar2 = (j.a) cVar2;
            Objects.requireNonNull(aVar2);
            boolean z2 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = s0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = j.f174b;
                aVar2.d(findDrawableByLayerId, c2, mode2);
                aVar2.d(layerDrawable.findDrawableByLayerId(16908303), s0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.d(layerDrawable.findDrawableByLayerId(16908301), s0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = s0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = j.f174b;
                aVar2.d(findDrawableByLayerId2, b2, mode3);
                aVar2.d(layerDrawable2.findDrawableByLayerId(16908303), s0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.d(layerDrawable2.findDrawableByLayerId(16908301), s0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (k(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    public boolean k(Context context, int i2, Drawable drawable) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        c cVar = this.g;
        if (cVar != null) {
            j.a aVar = (j.a) cVar;
            Objects.requireNonNull(aVar);
            PorterDuff.Mode mode = j.f174b;
            int i5 = 16842801;
            if (aVar.a(aVar.f177a, i2)) {
                i5 = R.attr.colorControlNormal;
            } else if (aVar.a(aVar.f179c, i2)) {
                i5 = R.attr.colorControlActivated;
            } else if (aVar.a(aVar.d, i2)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                i3 = 16842800;
                i4 = Math.round(40.8f);
                z = true;
                if (z) {
                    if (e0.a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(j.c(s0.c(context, i3), mode));
                    if (i4 != -1) {
                        drawable.setAlpha(i4);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            } else if (i2 != R.drawable.abc_dialog_material_background) {
                i3 = 0;
                z = false;
                i4 = -1;
                if (z) {
                }
                if (z2) {
                }
            }
            i3 = i5;
            i4 = -1;
            z = true;
            if (z) {
            }
            if (z2) {
            }
        }
        return false;
    }
}
