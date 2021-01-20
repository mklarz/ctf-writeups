package a.f.c;

import a.f.b.i.d;
import a.f.b.i.g;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class c extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f379b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public int f380c;
    public Context d;
    public g e;
    public String f;
    public HashMap<Integer, String> g = new HashMap<>();

    public c(Context context) {
        super(context);
        this.d = context;
        e(null);
    }

    public final void a(String str) {
        if (str != null && str.length() != 0 && this.d != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object c2 = constraintLayout2.c(0, trim);
                if (c2 instanceof Integer) {
                    i = ((Integer) c2).intValue();
                }
            }
            if (i == 0 && constraintLayout2 != null) {
                i = d(constraintLayout2, trim);
            }
            if (i == 0) {
                try {
                    i = j.class.getField(trim).getInt(null);
                } catch (Exception unused) {
                }
            }
            if (i == 0) {
                i = this.d.getResources().getIdentifier(trim, "id", this.d.getPackageName());
            }
            if (i != 0) {
                this.g.put(Integer.valueOf(i), trim);
                b(i);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void b(int i) {
        if (i != getId()) {
            int i2 = this.f380c + 1;
            int[] iArr = this.f379b;
            if (i2 > iArr.length) {
                this.f379b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f379b;
            int i3 = this.f380c;
            iArr2[i3] = i;
            this.f380c = i3 + 1;
        }
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f380c; i++) {
                View d2 = constraintLayout.d(this.f379b[i]);
                if (d2 != null) {
                    d2.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        d2.setTranslationZ(d2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f411b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                }
            }
        }
    }

    public void f(d dVar, boolean z) {
    }

    public void g() {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f379b, this.f380c);
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
        if (this.e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).l0 = (d) this.e;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f = str;
        if (str != null) {
            int i = 0;
            this.f380c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.f380c = 0;
        for (int i : iArr) {
            b(i);
        }
    }
}
