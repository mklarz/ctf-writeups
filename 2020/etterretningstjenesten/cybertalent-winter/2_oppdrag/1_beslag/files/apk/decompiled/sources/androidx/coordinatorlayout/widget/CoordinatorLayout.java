package androidx.coordinatorlayout.widget;

import a.h.j.j;
import a.h.j.k;
import a.h.j.m;
import a.h.j.r;
import a.h.j.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import no.cybertalent.liberatortoolkit.R;

public class CoordinatorLayout extends ViewGroup implements a.h.j.h {
    public static final String u;
    public static final Class<?>[] v = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> w = new ThreadLocal<>();
    public static final Comparator<View> x = new i();
    public static final a.h.i.b<Rect> y = new a.h.i.c(12);

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f884b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final a.g.b.a<View> f885c = new a.g.b.a<>();
    public final List<View> d = new ArrayList();
    public final List<View> e = new ArrayList();
    public final int[] f = new int[2];
    public Paint g;
    public boolean h;
    public boolean i;
    public int[] j;
    public View k;
    public View l;
    public g m;
    public boolean n;
    public v o;
    public boolean p;
    public Drawable q;
    public ViewGroup.OnHierarchyChangeListener r;
    public k s;
    public final j t = new j();

    public class a implements k {
        public a() {
        }

        @Override // a.h.j.k
        public v a(View view, v vVar) {
            c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.o, vVar)) {
                coordinatorLayout.o = vVar;
                boolean z = true;
                boolean z2 = vVar.d() > 0;
                coordinatorLayout.p = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!vVar.f533a.i()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, r> weakHashMap = m.f516a;
                        if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).f888a) != null) {
                            vVar = cVar.e(vVar);
                            if (vVar.f533a.i()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return vVar;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)I */
        public int b() {
            return -16777216;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;)F */
        public float c() {
            return 0.0f;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;La/h/j/v;)La/h/j/v; */
        public v e(v vVar) {
            return vVar;
        }

        public void f(f fVar) {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;)V */
        public void h() {
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;FFZ)Z */
        public boolean l() {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;II[I)V */
        @Deprecated
        public void n() {
        }

        public void o(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                n();
            }
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                p(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;Landroid/view/View;I)V */
        @Deprecated
        public void r() {
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable u(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return v(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/coordinatorlayout/widget/CoordinatorLayout;TV;Landroid/view/View;)V */
        @Deprecated
        public void x() {
        }

        public void y(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                x();
            }
        }

        public boolean z(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f888a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f889b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f890c = 0;
        public int d = 0;
        public int e = -1;
        public int f = -1;
        public int g = 0;
        public int h = 0;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public final Rect q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$c>>> */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.g.a.f414b);
            this.f890c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f889b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.u;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.w;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = context.getClassLoader().loadClass(string).getConstructor(CoordinatorLayout.v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(b.a.a.a.a.b("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f888a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f888a;
            if (cVar2 != null) {
                cVar2.f(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
        }

        public boolean a(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        public void b(c cVar) {
            c cVar2 = this.f888a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    Objects.requireNonNull(cVar2);
                }
                this.f888a = cVar;
                this.f889b = true;
                if (cVar != null) {
                    cVar.f(this);
                }
            }
        }

        public void c(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends a.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f892c;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new h[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f892c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f892c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f567a, i);
            SparseArray<Parcelable> sparseArray = this.f892c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f892c.keyAt(i2);
                parcelableArr[i2] = this.f892c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public static class i implements Comparator<View> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            float z = view.getZ();
            float z2 = view2.getZ();
            if (z > z2) {
                return -1;
            }
            return z < z2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = a.g.a.f413a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.j;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f2);
            }
        }
        this.q = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
    }

    public static Rect a() {
        Rect a2 = y.a();
        return a2 == null ? new Rect() : a2;
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public List<View> d(View view) {
        a.g.b.a<View> aVar = this.f885c;
        int i2 = aVar.f416b.f303c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<T> k2 = aVar.f416b.k(i3);
            if (k2 != null && k2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f416b.h(i3));
            }
        }
        this.e.clear();
        if (arrayList != null) {
            this.e.addAll(arrayList);
        }
        return this.e;
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f888a;
        if (cVar != null) {
            float c2 = cVar.c();
            if (c2 > 0.0f) {
                if (this.g == null) {
                    this.g = new Paint();
                }
                this.g.setColor(fVar.f888a.b());
                Paint paint = this.g;
                int round = Math.round(c2 * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public List<View> e(View view) {
        ArrayList<T> orDefault = this.f885c.f416b.getOrDefault(view, null);
        this.e.clear();
        if (orDefault != null) {
            this.e.addAll(orDefault);
        }
        return this.e;
    }

    public void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = a.g.b.b.f418a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = a.g.b.b.f418a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        a.g.b.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = a.g.b.b.f419b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void g(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5 = fVar.f890c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f884b);
    }

    public final v getLastWindowInsets() {
        return this.o;
    }

    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i2) {
        StringBuilder sb;
        int[] iArr = this.j;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // a.h.j.h
    public void i(View view, View view2, int i2, int i3) {
        c cVar;
        j jVar = this.t;
        if (i3 == 1) {
            jVar.f513b = i2;
        } else {
            jVar.f512a = i2;
        }
        this.l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            f fVar = (f) getChildAt(i4).getLayoutParams();
            if (fVar.a(i3) && (cVar = fVar.f888a) != null && i3 == 0) {
                cVar.r();
            }
        }
    }

    public f j(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f889b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder d2 = b.a.a.a.a.d("Default behavior class ");
                        d2.append(dVar.value().getName());
                        d2.append(" could not be instantiated. Did you forget");
                        d2.append(" a default constructor?");
                        Log.e("CoordinatorLayout", d2.toString(), e2);
                    }
                }
            }
            fVar.f889b = true;
        }
        return fVar;
    }

    @Override // a.h.j.h
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.f888a) != null) {
                    cVar.q(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            q(1);
        }
    }

    @Override // a.h.j.h
    public void m(View view, int i2) {
        j jVar = this.t;
        if (i2 == 1) {
            jVar.f513b = 0;
        } else {
            jVar.f512a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.f888a;
                if (cVar != null) {
                    cVar.y(this, childAt, view, i2);
                }
                fVar.c(i2, false);
                fVar.p = false;
            }
        }
        this.l = null;
    }

    @Override // a.h.j.h
    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.f888a) != null) {
                    int[] iArr2 = this.f;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    cVar.o(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            q(1);
        }
    }

    @Override // a.h.j.h
    public boolean o(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f888a;
                if (cVar != null) {
                    boolean w2 = cVar.w(this, childAt, view, view2, i2, i3);
                    z |= w2;
                    fVar.c(i3, w2);
                } else {
                    fVar.c(i3, false);
                }
            }
        }
        return z;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p && this.q != null) {
            v vVar = this.o;
            int d2 = vVar != null ? vVar.d() : 0;
            if (d2 > 0) {
                this.q.setBounds(0, 0, getWidth(), d2);
                this.q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t2 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t2;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int layoutDirection = getLayoutDirection();
        int size = this.f884b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f884b.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f888a) == null || !cVar.j(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        if (r0.k(r30, r20, r8, r21, r23, 0) == false) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    public void onMeasure(int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        c cVar;
        int i11;
        f fVar;
        int i12;
        int i13;
        boolean z2;
        u();
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i15);
            a.g.b.a<View> aVar = this.f885c;
            int i16 = aVar.f416b.f303c;
            int i17 = 0;
            while (true) {
                if (i17 < i16) {
                    ArrayList<T> k2 = aVar.f416b.k(i17);
                    if (k2 != null && k2.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i17++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i15++;
        }
        if (z != this.n) {
            if (z) {
                if (this.i) {
                    if (this.m == null) {
                        this.m = new g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.m);
                }
                this.n = true;
            } else {
                if (this.i && this.m != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.m);
                }
                this.n = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int layoutDirection = getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i18 = paddingLeft + paddingRight;
        int i19 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.o != null && getFitsSystemWindows();
        int size3 = this.f884b.size();
        int i20 = suggestedMinimumWidth;
        int i21 = suggestedMinimumHeight;
        int i22 = 0;
        int i23 = 0;
        while (i23 < size3) {
            View view = this.f884b.get(i23);
            if (view.getVisibility() == 8) {
                i6 = i23;
                i4 = size3;
                i5 = paddingLeft;
            } else {
                f fVar2 = (f) view.getLayoutParams();
                int i24 = fVar2.e;
                if (i24 < 0 || mode == 0) {
                    i7 = i22;
                } else {
                    int h2 = h(i24);
                    int i25 = fVar2.f890c;
                    if (i25 == 0) {
                        i25 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, layoutDirection) & 7;
                    i7 = i22;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        i8 = Math.max(0, (size - paddingRight) - h2);
                        if (z4) {
                        }
                        i10 = i2;
                        i9 = i3;
                        cVar = fVar2.f888a;
                        if (cVar != null) {
                        }
                        measureChildWithMargins(view, i10, i8, i9, 0);
                        int max = Math.max(i13, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int max2 = Math.max(i11, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i22 = View.combineMeasuredStates(i12, view.getMeasuredState());
                        i20 = max;
                        i21 = max2;
                    } else if ((absoluteGravity != 5 || z3) && (absoluteGravity != 3 || !z3)) {
                        i14 = 0;
                    } else {
                        i8 = Math.max(0, h2 - paddingLeft);
                        if (z4 || view.getFitsSystemWindows()) {
                            i10 = i2;
                            i9 = i3;
                        } else {
                            int c2 = this.o.c() + this.o.b();
                            int a2 = this.o.a() + this.o.d();
                            i10 = View.MeasureSpec.makeMeasureSpec(size - c2, mode);
                            i9 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                        }
                        cVar = fVar2.f888a;
                        if (cVar != null) {
                            fVar = fVar2;
                            i12 = i7;
                            i6 = i23;
                            i11 = i21;
                            i5 = paddingLeft;
                            i13 = i20;
                            i4 = size3;
                        } else {
                            fVar = fVar2;
                            i11 = i21;
                            i4 = size3;
                            i5 = paddingLeft;
                            i12 = i7;
                            i6 = i23;
                            i13 = i20;
                        }
                        measureChildWithMargins(view, i10, i8, i9, 0);
                        int max3 = Math.max(i13, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int max22 = Math.max(i11, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i22 = View.combineMeasuredStates(i12, view.getMeasuredState());
                        i20 = max3;
                        i21 = max22;
                    }
                }
                i8 = i14;
                if (z4) {
                }
                i10 = i2;
                i9 = i3;
                cVar = fVar2.f888a;
                if (cVar != null) {
                }
                measureChildWithMargins(view, i10, i8, i9, 0);
                int max32 = Math.max(i13, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max222 = Math.max(i11, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i22 = View.combineMeasuredStates(i12, view.getMeasuredState());
                i20 = max32;
                i21 = max222;
            }
            i23 = i6 + 1;
            paddingLeft = i5;
            size3 = i4;
            i14 = 0;
        }
        setMeasuredDimension(View.resolveSizeAndState(i20, i2, -16777216 & i22), View.resolveSizeAndState(i21, i3, i22 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f888a) != null) {
                    z2 |= cVar.l();
                }
            }
        }
        if (z2) {
            q(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f888a) != null) {
                    z |= cVar.m(this, childAt, view, f2, f3);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        n(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        l(view, i2, i3, i4, i5, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        i(view, view2, i2, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f567a);
        SparseArray<Parcelable> sparseArray = hVar.f892c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = j(childAt).f888a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.t(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable u2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f888a;
            if (!(id == -1 || cVar == null || (u2 = cVar.u(this, childAt)) == null)) {
                sparseArray.append(id, u2);
            }
        }
        hVar.f892c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        m(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.k == null) {
            z2 = t(motionEvent, 1);
        } else {
            z2 = false;
        }
        c cVar = ((f) this.k.getLayoutParams()).f888a;
        if (cVar != null) {
            z = cVar.z(this, this.k, motionEvent);
            motionEvent2 = null;
            if (this.k != null) {
                z |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 || actionMasked == 3) {
                v(false);
            }
            return z;
        }
        z = false;
        motionEvent2 = null;
        if (this.k != null) {
        }
        if (motionEvent2 != null) {
        }
        v(false);
        return z;
    }

    public boolean p(View view, int i2, int i3) {
        Rect a2 = a();
        f(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a2.setEmpty();
            y.b(a2);
        }
    }

    public final void q(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        Rect rect2;
        int i11;
        int i12;
        int i13;
        f fVar;
        c cVar;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        int layoutDirection = getLayoutDirection();
        int size = this.f884b.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f884b.get(i14);
            f fVar2 = (f) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.l == this.f884b.get(i15)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            f(fVar3.k, a5);
                            c(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            i13 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i12 = i14;
                            i11 = i15;
                            rect2 = a4;
                            fVar = fVar2;
                            g(layoutDirection, a5, a7, fVar3, measuredWidth, measuredHeight);
                            boolean z4 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            b(fVar3, a7, measuredWidth, measuredHeight);
                            int i16 = a7.left - a6.left;
                            int i17 = a7.top - a6.top;
                            if (i16 != 0) {
                                WeakHashMap<View, r> weakHashMap2 = m.f516a;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap<View, r> weakHashMap3 = m.f516a;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z4 && (cVar = fVar3.f888a) != null) {
                                cVar.g(this, view, fVar3.k);
                            }
                            a5.setEmpty();
                            a.h.i.b<Rect> bVar = y;
                            bVar.b(a5);
                            a6.setEmpty();
                            bVar.b(a6);
                            a7.setEmpty();
                            bVar.b(a7);
                            i15 = i11 + 1;
                            fVar2 = fVar;
                            size = i13;
                            i14 = i12;
                            a4 = rect2;
                        }
                    }
                    i11 = i15;
                    i13 = size;
                    rect2 = a4;
                    i12 = i14;
                    fVar = fVar2;
                    i15 = i11 + 1;
                    fVar2 = fVar;
                    size = i13;
                    i14 = i12;
                    a4 = rect2;
                }
                i3 = i14;
                c(view, true, a3);
                if (fVar2.g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar2.g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i18 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i19 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar2.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, r> weakHashMap4 = m.f516a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar4 = (f) view.getLayoutParams();
                        c cVar2 = fVar4.f888a;
                        Rect a8 = a();
                        Rect a9 = a();
                        a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(this, view, a8)) {
                            a8.set(a9);
                        } else if (!a9.contains(a8)) {
                            StringBuilder d2 = b.a.a.a.a.d("Rect should be within the child's bounds. Rect:");
                            d2.append(a8.toShortString());
                            d2.append(" | Bounds:");
                            d2.append(a9.toShortString());
                            throw new IllegalArgumentException(d2.toString());
                        }
                        a9.setEmpty();
                        a.h.i.b<Rect> bVar2 = y;
                        bVar2.b(a9);
                        if (!a8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar4.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (a8.top - ((ViewGroup.MarginLayoutParams) fVar4).topMargin) - fVar4.j) >= (i10 = a2.top)) {
                                z2 = false;
                            } else {
                                x(view, i10 - i9);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin) + fVar4.j) < (i8 = a2.bottom)) {
                                x(view, height - i8);
                                z2 = true;
                            }
                            if (!z2) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (a8.left - ((ViewGroup.MarginLayoutParams) fVar4).leftMargin) - fVar4.i) >= (i7 = a2.left)) {
                                z3 = false;
                            } else {
                                w(view, i7 - i6);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin) + fVar4.i) < (i5 = a2.right)) {
                                w(view, width - i5);
                                z3 = true;
                            }
                            if (!z3) {
                                w(view, 0);
                            }
                        }
                        a8.setEmpty();
                        bVar2.b(a8);
                    }
                }
                if (i2 != 2) {
                    rect = a4;
                    rect.set(((f) view.getLayoutParams()).q);
                    if (rect.equals(a3)) {
                        i4 = size;
                    } else {
                        ((f) view.getLayoutParams()).q.set(a3);
                    }
                } else {
                    rect = a4;
                }
                i4 = size;
                for (int i20 = i3 + 1; i20 < i4; i20++) {
                    View view2 = this.f884b.get(i20);
                    f fVar5 = (f) view2.getLayoutParams();
                    c cVar3 = fVar5.f888a;
                    if (cVar3 != null && cVar3.d(this, view2, view)) {
                        if (i2 != 0 || !fVar5.p) {
                            if (i2 != 2) {
                                z = cVar3.g(this, view2, view);
                            } else {
                                cVar3.h();
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar5.p = z;
                            }
                        } else {
                            fVar5.p = false;
                        }
                    }
                }
            }
            i14 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        a2.setEmpty();
        a.h.i.b<Rect> bVar3 = y;
        bVar3.b(a2);
        a3.setEmpty();
        bVar3.b(a3);
        a4.setEmpty();
        bVar3.b(a4);
    }

    public void r(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        int i3 = 0;
        if (view2 == null && fVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a2 = a();
            Rect a3 = a();
            try {
                f(view2, a2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i2, a2, a3, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a2.setEmpty();
                a.h.i.b<Rect> bVar = y;
                bVar.b(a2);
                a3.setEmpty();
                bVar.b(a3);
            }
        } else {
            int i4 = fVar.e;
            if (i4 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i5 = fVar3.f890c;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int h2 = h(i4) - measuredWidth2;
                if (i6 == 1) {
                    h2 += measuredWidth2 / 2;
                } else if (i6 == 5) {
                    h2 += measuredWidth2;
                }
                if (i7 == 16) {
                    i3 = 0 + (measuredHeight2 / 2);
                } else if (i7 == 80) {
                    i3 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(h2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            Rect a4 = a();
            a4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.o != null) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a4.left = this.o.b() + a4.left;
                    a4.top = this.o.d() + a4.top;
                    a4.right -= this.o.c();
                    a4.bottom -= this.o.a();
                }
            }
            Rect a5 = a();
            int i8 = fVar4.f890c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i2);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
            a4.setEmpty();
            a.h.i.b<Rect> bVar2 = y;
            bVar2.b(a4);
            a5.setEmpty();
            bVar2.b(a5);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c cVar = ((f) view.getLayoutParams()).f888a;
        if (cVar == null || !cVar.s(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.h) {
            v(false);
            this.h = true;
        }
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                Drawable drawable4 = this.q;
                WeakHashMap<View, r> weakHashMap = m.f516a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            WeakHashMap<View, r> weakHashMap2 = m.f516a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = getContext();
            Object obj = a.h.c.a.f439a;
            drawable = context.getDrawable(i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z) {
            this.q.setVisible(z, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.d;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f888a;
            boolean z4 = true;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && cVar != null) {
                    if (i2 == 0) {
                        z2 = cVar.i(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z2 = cVar.z(this, view, motionEvent);
                    }
                    if (z2) {
                        this.k = view;
                    }
                }
                c cVar2 = fVar.f888a;
                if (cVar2 == null) {
                    fVar.m = false;
                }
                boolean z5 = fVar.m;
                if (z5) {
                    z = true;
                } else {
                    z = (cVar2 != null && cVar2.c() > 0.0f) | z5;
                    fVar.m = z;
                }
                if (!z || z5) {
                    z4 = false;
                }
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.i(this, view, motionEvent2);
                } else if (i2 == 1) {
                    cVar.z(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109  */
    public final void u() {
        boolean z;
        c cVar;
        boolean z2;
        this.f884b.clear();
        a.g.b.a<View> aVar = this.f885c;
        int i2 = aVar.f416b.f303c;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList<T> k2 = aVar.f416b.k(i3);
            if (k2 != null) {
                k2.clear();
                aVar.f415a.b(k2);
            }
        }
        aVar.f416b.clear();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            f j2 = j(childAt);
            if (j2.f == -1) {
                j2.l = null;
                j2.k = null;
            } else {
                View view = j2.k;
                if (view != null) {
                    if (view.getId() == j2.f) {
                        View view2 = j2.k;
                        for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                            if (parent == null || parent == childAt) {
                                j2.l = null;
                                j2.k = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                            }
                        }
                        j2.l = view2;
                        z2 = true;
                    }
                    z2 = false;
                    break;
                }
                View findViewById = findViewById(j2.f);
                j2.k = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        ViewParent parent2 = findViewById.getParent();
                        while (parent2 != this && parent2 != null) {
                            if (parent2 != childAt) {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                        j2.l = findViewById;
                    } else if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (!isInEditMode()) {
                    StringBuilder d2 = b.a.a.a.a.d("Could not find CoordinatorLayout descendant view with id ");
                    d2.append(getResources().getResourceName(j2.f));
                    d2.append(" to anchor view ");
                    d2.append(childAt);
                    throw new IllegalStateException(d2.toString());
                }
                j2.l = null;
                j2.k = null;
            }
            this.f885c.a(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != j2.l) {
                        WeakHashMap<View, r> weakHashMap = m.f516a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).g, layoutDirection);
                        if (!(absoluteGravity != 0 && (Gravity.getAbsoluteGravity(j2.h, layoutDirection) & absoluteGravity) == absoluteGravity) && ((cVar = j2.f888a) == null || !cVar.d(this, childAt, childAt2))) {
                            z = false;
                            if (!z) {
                                continue;
                            } else {
                                if (!(this.f885c.f416b.e(childAt2) >= 0)) {
                                    this.f885c.a(childAt2);
                                }
                                a.g.b.a<View> aVar2 = this.f885c;
                                if (aVar2.f416b.e(childAt2) >= 0) {
                                    if (aVar2.f416b.e(childAt) >= 0) {
                                        ArrayList<T> orDefault = aVar2.f416b.getOrDefault(childAt2, null);
                                        if (orDefault == null) {
                                            orDefault = aVar2.f415a.a();
                                            if (orDefault == null) {
                                                orDefault = new ArrayList<>();
                                            }
                                            aVar2.f416b.put(childAt2, orDefault);
                                        }
                                        orDefault.add(childAt);
                                    }
                                }
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        List<View> list = this.f884b;
        a.g.b.a<View> aVar3 = this.f885c;
        aVar3.f417c.clear();
        aVar3.d.clear();
        int i6 = aVar3.f416b.f303c;
        for (int i7 = 0; i7 < i6; i7++) {
            aVar3.b(aVar3.f416b.h(i7), aVar3.f417c, aVar3.d);
        }
        list.addAll(aVar3.f417c);
        Collections.reverse(this.f884b);
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).f888a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    cVar.i(this, childAt, obtain);
                } else {
                    cVar.z(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m = false;
        }
        this.k = null;
        this.h = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public final void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            view.offsetLeftAndRight(i2 - i3);
            fVar.i = i2;
        }
    }

    public final void x(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            WeakHashMap<View, r> weakHashMap = m.f516a;
            view.offsetTopAndBottom(i2 - i3);
            fVar.j = i2;
        }
    }

    public final void y() {
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (getFitsSystemWindows()) {
            if (this.s == null) {
                this.s = new a();
            }
            m.h(this, this.s);
            setSystemUiVisibility(1280);
            return;
        }
        m.h(this, null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
