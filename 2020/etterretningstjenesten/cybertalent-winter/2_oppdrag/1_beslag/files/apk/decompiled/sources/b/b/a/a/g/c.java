package b.b.a.a.g;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface c {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f1029b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f1030a = new e(null);

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public e evaluate(float f, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f1030a;
            float e = b.b.a.a.a.e(eVar3.f1033a, eVar4.f1033a, f);
            float e2 = b.b.a.a.a.e(eVar3.f1034b, eVar4.f1034b, f);
            float e3 = b.b.a.a.a.e(eVar3.f1035c, eVar4.f1035c, f);
            eVar5.f1033a = e;
            eVar5.f1034b = e2;
            eVar5.f1035c = e3;
            return this.f1030a;
        }
    }

    /* renamed from: b.b.a.a.g.c$c  reason: collision with other inner class name */
    public static class C0028c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f1031a = new C0028c("circularReveal");

        public C0028c(String str) {
            super(e.class, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f1032a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f1033a;

        /* renamed from: b  reason: collision with root package name */
        public float f1034b;

        /* renamed from: c  reason: collision with root package name */
        public float f1035c;

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.f1033a = f;
            this.f1034b = f2;
            this.f1035c = f3;
        }

        public e(a aVar) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
