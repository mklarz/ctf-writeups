package a.b.f;

import a.h.j.r;
import a.h.j.s;
import a.h.j.t;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<r> f76a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f77b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f78c;
    public s d;
    public boolean e;
    public final t f = new a();

    public class a extends t {

        /* renamed from: a  reason: collision with root package name */
        public boolean f79a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f80b = 0;

        public a() {
        }

        @Override // a.h.j.s
        public void a(View view) {
            int i = this.f80b + 1;
            this.f80b = i;
            if (i == g.this.f76a.size()) {
                s sVar = g.this.d;
                if (sVar != null) {
                    sVar.a(null);
                }
                this.f80b = 0;
                this.f79a = false;
                g.this.e = false;
            }
        }

        @Override // a.h.j.t, a.h.j.s
        public void b(View view) {
            if (!this.f79a) {
                this.f79a = true;
                s sVar = g.this.d;
                if (sVar != null) {
                    sVar.b(null);
                }
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<r> it = this.f76a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public void b() {
        View view;
        if (!this.e) {
            Iterator<r> it = this.f76a.iterator();
            while (it.hasNext()) {
                r next = it.next();
                long j = this.f77b;
                if (j >= 0) {
                    next.c(j);
                }
                Interpolator interpolator = this.f78c;
                if (!(interpolator == null || (view = next.f526a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    next.d(this.f);
                }
                View view2 = next.f526a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
