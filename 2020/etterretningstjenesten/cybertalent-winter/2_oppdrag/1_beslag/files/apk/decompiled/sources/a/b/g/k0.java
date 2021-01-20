package a.b.g;

import a.b.f.i.p;
import a.h.j.m;
import a.h.j.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class k0 implements p {
    public static Method B;
    public static Method C;
    public PopupWindow A;

    /* renamed from: b  reason: collision with root package name */
    public Context f183b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f184c;
    public f0 d;
    public int e = -2;
    public int f = -2;
    public int g;
    public int h;
    public int i = 1002;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m = 0;
    public int n = Integer.MAX_VALUE;
    public int o = 0;
    public DataSetObserver p;
    public View q;
    public AdapterView.OnItemClickListener r;
    public final e s = new e();
    public final d t = new d();
    public final c u = new c();
    public final a v = new a();
    public final Handler w;
    public final Rect x = new Rect();
    public Rect y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f0 f0Var = k0.this.d;
            if (f0Var != null) {
                f0Var.setListSelectionHidden(true);
                f0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (k0.this.a()) {
                k0.this.b();
            }
        }

        public void onInvalidated() {
            k0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (k0.this.A.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && k0.this.A.getContentView() != null) {
                    k0 k0Var = k0.this;
                    k0Var.w.removeCallbacks(k0Var.s);
                    k0.this.s.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k0.this.A) != null && popupWindow.isShowing() && x >= 0 && x < k0.this.A.getWidth() && y >= 0 && y < k0.this.A.getHeight()) {
                k0 k0Var = k0.this;
                k0Var.w.postDelayed(k0Var.s, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                k0 k0Var2 = k0.this;
                k0Var2.w.removeCallbacks(k0Var2.s);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            f0 f0Var = k0.this.d;
            if (f0Var != null) {
                WeakHashMap<View, r> weakHashMap = m.f516a;
                if (f0Var.isAttachedToWindow() && k0.this.d.getCount() > k0.this.d.getChildCount()) {
                    int childCount = k0.this.d.getChildCount();
                    k0 k0Var = k0.this;
                    if (childCount <= k0Var.n) {
                        k0Var.A.setInputMethodMode(2);
                        k0.this.b();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f183b = context;
        this.w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.b.o, i2, i3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i2, i3);
        this.A = pVar;
        pVar.setInputMethodMode(1);
    }

    @Override // a.b.f.i.p
    public boolean a() {
        return this.A.isShowing();
    }

    @Override // a.b.f.i.p
    public void b() {
        int i2;
        int i3;
        f0 f0Var;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (this.d == null) {
            f0 q2 = q(this.f183b, !this.z);
            this.d = q2;
            q2.setAdapter(this.f184c);
            this.d.setOnItemClickListener(this.r);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new j0(this));
            this.d.setOnScrollListener(this.u);
            this.A.setContentView(this.d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.A.getContentView();
        }
        Drawable background = this.A.getBackground();
        int i6 = 0;
        if (background != null) {
            background.getPadding(this.x);
            Rect rect = this.x;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.j) {
                this.h = -i7;
            }
        } else {
            this.x.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = this.A.getMaxAvailableHeight(this.q, this.h, this.A.getInputMethodMode() == 2);
        if (this.e == -1) {
            i3 = maxAvailableHeight + i2;
        } else {
            int i8 = this.f;
            if (i8 != -2) {
                i4 = 1073741824;
                if (i8 == -1) {
                    int i9 = this.f183b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.x;
                    i8 = i9 - (rect2.left + rect2.right);
                }
            } else {
                int i10 = this.f183b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.x;
                i8 = i10 - (rect3.left + rect3.right);
                i4 = Integer.MIN_VALUE;
            }
            int a2 = this.d.a(View.MeasureSpec.makeMeasureSpec(i8, i4), maxAvailableHeight - 0, -1);
            i3 = a2 + (a2 > 0 ? this.d.getPaddingBottom() + this.d.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z2 = this.A.getInputMethodMode() == 2;
        this.A.setWindowLayoutType(this.i);
        if (this.A.isShowing()) {
            View view = this.q;
            WeakHashMap<View, r> weakHashMap = m.f516a;
            if (view.isAttachedToWindow()) {
                int i11 = this.f;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.q.getWidth();
                }
                int i12 = this.e;
                if (i12 == -1) {
                    if (!z2) {
                        i3 = -1;
                    }
                    if (z2) {
                        this.A.setWidth(this.f == -1 ? -1 : 0);
                        this.A.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.A;
                        if (this.f == -1) {
                            i6 = -1;
                        }
                        popupWindow.setWidth(i6);
                        this.A.setHeight(-1);
                    }
                } else if (i12 != -2) {
                    i3 = i12;
                }
                this.A.setOutsideTouchable(true);
                this.A.update(this.q, this.g, this.h, i11 < 0 ? -1 : i11, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i13 = this.f;
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = this.q.getWidth();
        }
        int i14 = this.e;
        if (i14 == -1) {
            i3 = -1;
        } else if (i14 != -2) {
            i3 = i14;
        }
        this.A.setWidth(i13);
        this.A.setHeight(i3);
        if (i5 <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(this.A, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.A.setIsClippedToScreen(true);
        }
        this.A.setOutsideTouchable(true);
        this.A.setTouchInterceptor(this.t);
        if (this.l) {
            this.A.setOverlapAnchor(this.k);
        }
        if (i5 <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(this.A, this.y);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.A.setEpicenterBounds(this.y);
        }
        this.A.showAsDropDown(this.q, this.g, this.h, this.m);
        this.d.setSelection(-1);
        if ((!this.z || this.d.isInTouchMode()) && (f0Var = this.d) != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
        if (!this.z) {
            this.w.post(this.v);
        }
    }

    public void d(int i2) {
        this.g = i2;
    }

    @Override // a.b.f.i.p
    public void dismiss() {
        this.A.dismiss();
        this.A.setContentView(null);
        this.d = null;
        this.w.removeCallbacks(this.s);
    }

    public int e() {
        return this.g;
    }

    @Override // a.b.f.i.p
    public ListView f() {
        return this.d;
    }

    public int j() {
        if (!this.j) {
            return 0;
        }
        return this.h;
    }

    public void l(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    public void m(int i2) {
        this.h = i2;
        this.j = true;
    }

    public Drawable n() {
        return this.A.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.p;
        if (dataSetObserver == null) {
            this.p = new b();
        } else {
            ListAdapter listAdapter2 = this.f184c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f184c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p);
        }
        f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f184c);
        }
    }

    public f0 q(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public void r(int i2) {
        Drawable background = this.A.getBackground();
        if (background != null) {
            background.getPadding(this.x);
            Rect rect = this.x;
            this.f = rect.left + rect.right + i2;
            return;
        }
        this.f = i2;
    }

    public void s(boolean z2) {
        this.z = z2;
        this.A.setFocusable(z2);
    }
}
