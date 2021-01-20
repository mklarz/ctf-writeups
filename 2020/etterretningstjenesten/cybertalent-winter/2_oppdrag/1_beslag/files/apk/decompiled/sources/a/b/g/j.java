package a.b.g;

import a.b.g.n0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import no.cybertalent.liberatortoolkit.R;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f174b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static j f175c;

    /* renamed from: a  reason: collision with root package name */
    public n0 f176a;

    public class a implements n0.c {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f177a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f178b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f179c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i) {
            int c2 = s0.c(context, R.attr.colorControlHighlight);
            int b2 = s0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{s0.f218b, s0.d, s0.f219c, s0.f}, new int[]{b2, a.h.d.a.a(c2, i), a.h.d.a.a(c2, i), i});
        }

        public ColorStateList c(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                ThreadLocal<TypedValue> threadLocal = a.b.d.a.a.f53a;
                return context.getColorStateList(R.color.abc_tint_edittext);
            } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                ThreadLocal<TypedValue> threadLocal2 = a.b.d.a.a.f53a;
                return context.getColorStateList(R.color.abc_tint_switch_track);
            } else if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d2 = s0.d(context, R.attr.colorSwitchThumbNormal);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = s0.f218b;
                    iArr2[0] = s0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.c(context, R.attr.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = s0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = s0.f218b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.c(context, R.attr.colorControlActivated);
                    iArr[2] = s0.f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, s0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, s0.c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    ThreadLocal<TypedValue> threadLocal3 = a.b.d.a.a.f53a;
                    return context.getColorStateList(R.color.abc_tint_spinner);
                } else if (a(this.f178b, i)) {
                    return s0.d(context, R.attr.colorControlNormal);
                } else {
                    if (a(this.e, i)) {
                        ThreadLocal<TypedValue> threadLocal4 = a.b.d.a.a.f53a;
                        return context.getColorStateList(R.color.abc_tint_default);
                    } else if (a(this.f, i)) {
                        ThreadLocal<TypedValue> threadLocal5 = a.b.d.a.a.f53a;
                        return context.getColorStateList(R.color.abc_tint_btn_checkable);
                    } else if (i != R.drawable.abc_seekbar_thumb_material) {
                        return null;
                    } else {
                        ThreadLocal<TypedValue> threadLocal6 = a.b.d.a.a.f53a;
                        return context.getColorStateList(R.color.abc_tint_seek_thumb);
                    }
                }
            }
        }

        public final void d(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f174b;
            }
            drawable.setColorFilter(j.c(i, mode));
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f175c == null) {
                e();
            }
            jVar = f175c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (j.class) {
            g = n0.g(i, mode);
        }
        return g;
    }

    public static synchronized void e() {
        synchronized (j.class) {
            if (f175c == null) {
                j jVar = new j();
                f175c = jVar;
                jVar.f176a = n0.c();
                n0 n0Var = f175c.f176a;
                a aVar = new a();
                synchronized (n0Var) {
                    n0Var.g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, v0 v0Var, int[] iArr) {
        PorterDuff.Mode mode = n0.h;
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = v0Var.d;
            if (z || v0Var.f224c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? v0Var.f222a : null;
                PorterDuff.Mode mode2 = v0Var.f224c ? v0Var.f223b : n0.h;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = n0.g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable b(Context context, int i) {
        return this.f176a.e(context, i);
    }

    public synchronized ColorStateList d(Context context, int i) {
        return this.f176a.h(context, i);
    }
}
