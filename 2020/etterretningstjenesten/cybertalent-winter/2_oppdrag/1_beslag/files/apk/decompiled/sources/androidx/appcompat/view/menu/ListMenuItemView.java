package androidx.appcompat.view.menu;

import a.b.b;
import a.b.f.i.i;
import a.b.f.i.n;
import a.b.g.x0;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public i f827b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f828c;
    public RadioButton d;
    public TextView e;
    public CheckBox f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x0 o2 = x0.o(getContext(), attributeSet, b.r, R.attr.listMenuViewStyle, 0);
        this.k = o2.e(5);
        this.l = o2.j(1, -1);
        this.n = o2.a(7, false);
        this.m = context;
        this.o = o2.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        o2.f240b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f = checkBox;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            rect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.d = radioButton;
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        String str;
        int i2;
        int i3 = (!z || !this.f827b.m()) ? 8 : 0;
        if (i3 == 0) {
            TextView textView = this.g;
            i iVar = this.f827b;
            char e2 = iVar.e();
            if (e2 == 0) {
                str = "";
            } else {
                Resources resources = iVar.n.f106a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.f106a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = iVar.n.n() ? iVar.k : iVar.i;
                i.c(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                i.c(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                i.c(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                i.c(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                i.c(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                i.c(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == '\b') {
                    i2 = R.string.abc_menu_delete_shortcut_label;
                } else if (e2 == '\n') {
                    i2 = R.string.abc_menu_enter_shortcut_label;
                } else if (e2 != ' ') {
                    sb.append(e2);
                    str = sb.toString();
                } else {
                    i2 = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i2));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.g.getVisibility() != i3) {
            this.g.setVisibility(i3);
        }
    }

    @Override // a.b.f.i.n.a
    public void d(i iVar, int i2) {
        this.f827b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.e);
        setCheckable(iVar.isCheckable());
        boolean m2 = iVar.m();
        iVar.e();
        c(m2);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    @Override // a.b.f.i.n.a
    public i getItemData() {
        return this.f827b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.k;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.e = textView;
        int i2 = this.l;
        if (i2 != -1) {
            textView.setTextAppearance(this.m, i2);
        }
        this.g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(R.id.group_divider);
        this.j = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f828c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f828c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.d != null || this.f != null) {
            if (this.f827b.h()) {
                if (this.d == null) {
                    b();
                }
                compoundButton2 = this.d;
                compoundButton = this.f;
            } else {
                if (this.f == null) {
                    a();
                }
                compoundButton2 = this.f;
                compoundButton = this.d;
            }
            if (z) {
                compoundButton2.setChecked(this.f827b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f827b.h()) {
            if (this.d == null) {
                b();
            }
            compoundButton = this.d;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f827b.n);
        boolean z = this.r;
        if (z || this.n) {
            ImageView imageView = this.f828c;
            if (imageView != null || drawable != null || this.n) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f828c = imageView2;
                    LinearLayout linearLayout = this.j;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.n) {
                    ImageView imageView3 = this.f828c;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f828c.getVisibility() != 0) {
                        this.f828c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f828c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.e.setText(charSequence);
            if (this.e.getVisibility() != 0) {
                textView = this.e;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.e.getVisibility() != 8) {
                textView = this.e;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
