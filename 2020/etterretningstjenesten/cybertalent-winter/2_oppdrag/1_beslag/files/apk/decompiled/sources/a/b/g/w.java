package a.b.g;

import a.b.c.d;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class w extends Spinner {
    public static final int[] j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final e f225b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f226c;
    public h0 d;
    public SpinnerAdapter e;
    public final boolean f;
    public f g;
    public int h;
    public final Rect i = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().a()) {
                w.this.b();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public a.b.c.d f228b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f229c;
        public CharSequence d;

        public b() {
        }

        @Override // a.b.g.w.f
        public boolean a() {
            a.b.c.d dVar = this.f228b;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // a.b.g.w.f
        public CharSequence c() {
            return this.d;
        }

        @Override // a.b.g.w.f
        public void d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.g.w.f
        public void dismiss() {
            a.b.c.d dVar = this.f228b;
            if (dVar != null) {
                dVar.dismiss();
                this.f228b = null;
            }
        }

        @Override // a.b.g.w.f
        public int e() {
            return 0;
        }

        @Override // a.b.g.w.f
        public void g(int i, int i2) {
            if (this.f229c != null) {
                d.a aVar = new d.a(w.this.getPopupContext());
                CharSequence charSequence = this.d;
                if (charSequence != null) {
                    aVar.f10a.d = charSequence;
                }
                ListAdapter listAdapter = this.f229c;
                int selectedItemPosition = w.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f10a;
                bVar.h = listAdapter;
                bVar.i = this;
                bVar.k = selectedItemPosition;
                bVar.j = true;
                a.b.c.d a2 = aVar.a();
                this.f228b = a2;
                ListView listView = a2.d.g;
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.f228b.show();
            }
        }

        @Override // a.b.g.w.f
        public void i(CharSequence charSequence) {
            this.d = charSequence;
        }

        @Override // a.b.g.w.f
        public int j() {
            return 0;
        }

        @Override // a.b.g.w.f
        public void l(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // a.b.g.w.f
        public void m(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.g.w.f
        public Drawable n() {
            return null;
        }

        @Override // a.b.g.w.f
        public void o(ListAdapter listAdapter) {
            this.f229c = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.f229c.getItemId(i));
            }
            a.b.c.d dVar = this.f228b;
            if (dVar != null) {
                dVar.dismiss();
                this.f228b = null;
            }
        }

        @Override // a.b.g.w.f
        public void p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public SpinnerAdapter f230b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f231c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f230b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f231c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof t0) {
                t0 t0Var = (t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f231c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f230b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f231c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f230b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends k0 implements f {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F = new Rect();
        public int G;

        public class a implements AdapterView.OnItemClickListener {
            public a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    w.this.performItemClick(view, i, dVar.E.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                d dVar = d.this;
                w wVar = w.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, r> weakHashMap = m.f516a;
                if (!(wVar.isAttachedToWindow() && wVar.getGlobalVisibleRect(dVar.F))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.b();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f234b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f234b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f234b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.q = w.this;
            s(true);
            this.o = 0;
            this.r = new a(w.this);
        }

        @Override // a.b.g.w.f
        public CharSequence c() {
            return this.D;
        }

        @Override // a.b.g.w.f
        public void g(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            t();
            this.A.setInputMethodMode(2);
            b();
            f0 f0Var = this.d;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i);
            f0Var.setTextAlignment(i2);
            int selectedItemPosition = w.this.getSelectedItemPosition();
            f0 f0Var2 = this.d;
            if (a() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.A.setOnDismissListener(new c(bVar));
            }
        }

        @Override // a.b.g.w.f
        public void i(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // a.b.g.k0, a.b.g.w.f
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.E = listAdapter;
        }

        @Override // a.b.g.w.f
        public void p(int i) {
            this.G = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        public void t() {
            int i;
            Drawable n = n();
            int i2 = 0;
            if (n != null) {
                n.getPadding(w.this.i);
                i2 = b1.b(w.this) ? w.this.i.right : -w.this.i.left;
            } else {
                Rect rect = w.this.i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i3 = wVar.h;
            if (i3 == -2) {
                int a2 = wVar.a((SpinnerAdapter) this.E, n());
                int i4 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.i;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a2 > i5) {
                    a2 = i5;
                }
                i = Math.max(a2, (width - paddingLeft) - paddingRight);
            } else if (i3 == -1) {
                i = (width - paddingLeft) - paddingRight;
            } else {
                r(i3);
                this.g = !b1.b(w.this) ? (((width - paddingRight) - this.f) - this.G) + i2 : paddingLeft + this.G + i2;
            }
            r(i);
            this.g = !b1.b(w.this) ? (((width - paddingRight) - this.f) - this.G) + i2 : paddingLeft + this.G + i2;
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f236a;

        public class a implements Parcelable.Creator<e> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f236a = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f236a ? (byte) 1 : 0);
        }
    }

    public interface f {
        boolean a();

        CharSequence c();

        void d(int i);

        void dismiss();

        int e();

        void g(int i, int i2);

        void i(CharSequence charSequence);

        int j();

        void l(Drawable drawable);

        void m(int i);

        Drawable n();

        void o(ListAdapter listAdapter);

        void p(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    public w(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Throwable th;
        TypedArray typedArray;
        Exception e2;
        int[] iArr = a.b.b.v;
        s0.a(this, getContext());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        this.f225b = new e(this);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f226c = new a.b.f.c(context, resourceId);
        } else {
            this.f226c = context;
        }
        TypedArray typedArray2 = null;
        int i3 = -1;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, j, i2, 0);
            try {
                if (typedArray.hasValue(0)) {
                    i3 = typedArray.getInt(0, 0);
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
                } catch (Throwable th2) {
                    th = th2;
                    typedArray2 = typedArray;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            typedArray = null;
            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i3 == 0) {
            b bVar = new b();
            this.g = bVar;
            bVar.i(obtainStyledAttributes.getString(2));
        } else if (i3 == 1) {
            d dVar = new d(this.f226c, attributeSet, i2);
            x0 o = x0.o(this.f226c, attributeSet, iArr, i2, 0);
            this.h = o.i(3, -2);
            dVar.A.setBackgroundDrawable(o.e(1));
            dVar.D = obtainStyledAttributes.getString(2);
            o.f240b.recycle();
            this.g = dVar;
            this.d = new v(this, this, dVar);
        }
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.f = true;
        SpinnerAdapter spinnerAdapter = this.e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.e = null;
        }
        this.f225b.d(attributeSet, i2);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i3 + rect.left + rect.right;
    }

    public void b() {
        this.g.g(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f225b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.g;
        return fVar != null ? fVar.e() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.g;
        return fVar != null ? fVar.j() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.g != null ? this.h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.g;
    }

    public Drawable getPopupBackground() {
        f fVar = this.g;
        return fVar != null ? fVar.n() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f226c;
    }

    public CharSequence getPrompt() {
        f fVar = this.g;
        return fVar != null ? fVar.c() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f225b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f225b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.g;
        if (fVar != null && fVar.a()) {
            this.g.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f236a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.g;
        eVar.f236a = fVar != null && fVar.a();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AbsSpinner, android.widget.Spinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f226c;
            if (context == null) {
                context = getContext();
            }
            this.g.o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f225b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f225b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.p(i2);
            this.g.d(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.g != null) {
            this.h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(a.b.d.a.a.a(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f225b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f225b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
