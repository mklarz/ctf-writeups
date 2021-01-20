package a.q;

import a.h.j.m;
import a.h.j.r;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class b extends h {
    public static final Property<i, PointF> A = new C0023b(PointF.class, "topLeft");
    public static final Property<i, PointF> B = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> C = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> D = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> E = new f(PointF.class, "position");
    public static f F = new f();
    public static final String[] y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> z = new a(PointF.class, "boundsOrigin");
    public int[] x = new int[2];

    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f741a = new Rect();

        public a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f741a);
            Rect rect = this.f741a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f741a);
            this.f741a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f741a);
        }
    }

    /* renamed from: a.q.b$b  reason: collision with other inner class name */
    public static class C0023b extends Property<i, PointF> {
        public C0023b(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f744a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f745b = round;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                t.b(iVar2.e, iVar2.f744a, round, iVar2.f746c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f746c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.d = round;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                t.b(iVar2.e, iVar2.f744a, iVar2.f745b, iVar2.f746c, round);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            t.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f742a;
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.f742a = iVar;
            this.mViewBounds = iVar;
        }
    }

    public class h extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f743a;

        public h(b bVar, ViewGroup viewGroup) {
            this.f743a = viewGroup;
        }

        @Override // a.q.h.d
        public void b(h hVar) {
            a.h.b.d.x(this.f743a, false);
            hVar.v(this);
        }

        @Override // a.q.h.d, a.q.k
        public void c(h hVar) {
            a.h.b.d.x(this.f743a, false);
        }

        @Override // a.q.h.d, a.q.k
        public void d(h hVar) {
            a.h.b.d.x(this.f743a, true);
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f744a;

        /* renamed from: b  reason: collision with root package name */
        public int f745b;

        /* renamed from: c  reason: collision with root package name */
        public int f746c;
        public int d;
        public View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }
    }

    public final void H(p pVar) {
        View view = pVar.f777b;
        WeakHashMap<View, r> weakHashMap = m.f516a;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            pVar.f776a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            pVar.f776a.put("android:changeBounds:parent", pVar.f777b.getParent());
        }
    }

    @Override // a.q.h
    public void d(p pVar) {
        H(pVar);
    }

    @Override // a.q.h
    public void g(p pVar) {
        H(pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    @Override // a.q.h
    public Animator k(ViewGroup viewGroup, p pVar, p pVar2) {
        int i2;
        ObjectAnimator objectAnimator;
        b bVar;
        Property<View, PointF> property;
        Path path;
        if (pVar == null || pVar2 == null) {
            return null;
        }
        Map<String, Object> map = pVar.f776a;
        Map<String, Object> map2 = pVar2.f776a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = pVar2.f777b;
        Rect rect = (Rect) pVar.f776a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) pVar2.f776a.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) pVar.f776a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) pVar2.f776a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (!(i7 == i8 && i9 == i10)) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        t.b(view, i3, i5, i7, i9);
        if (i2 != 2) {
            bVar = this;
            if (i3 == i4 && i5 == i6) {
                path = bVar.t.a((float) i7, (float) i9, (float) i8, (float) i10);
                property = C;
            } else {
                path = bVar.t.a((float) i3, (float) i5, (float) i4, (float) i6);
                property = D;
            }
        } else if (i11 == i13 && i12 == i14) {
            bVar = this;
            path = bVar.t.a((float) i3, (float) i5, (float) i4, (float) i6);
            property = E;
        } else {
            bVar = this;
            i iVar = new i(view);
            ObjectAnimator q = a.h.b.d.q(iVar, A, bVar.t.a((float) i3, (float) i5, (float) i4, (float) i6));
            ObjectAnimator q2 = a.h.b.d.q(iVar, B, bVar.t.a((float) i7, (float) i9, (float) i8, (float) i10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(q, q2);
            animatorSet.addListener(new g(bVar, iVar));
            objectAnimator = animatorSet;
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                a.h.b.d.x(viewGroup4, true);
                bVar.a(new h(bVar, viewGroup4));
            }
            return objectAnimator;
        }
        objectAnimator = a.h.b.d.q(view, property, path);
        if (view.getParent() instanceof ViewGroup) {
        }
        return objectAnimator;
    }

    @Override // a.q.h
    public String[] p() {
        return y;
    }
}
