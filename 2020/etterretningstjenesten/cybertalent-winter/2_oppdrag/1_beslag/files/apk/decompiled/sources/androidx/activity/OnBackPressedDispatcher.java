package androidx.activity;

import a.a.b;
import a.m.d;
import a.m.e;
import a.m.g;
import a.m.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f808a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f809b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements e, a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final d f810a;

        /* renamed from: b  reason: collision with root package name */
        public final b f811b;

        /* renamed from: c  reason: collision with root package name */
        public a.a.a f812c;

        public LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f810a = dVar;
            this.f811b = bVar;
            dVar.a(this);
        }

        @Override // a.a.a
        public void cancel() {
            ((h) this.f810a).f645a.d(this);
            this.f811b.f1b.remove(this);
            a.a.a aVar = this.f812c;
            if (aVar != null) {
                aVar.cancel();
                this.f812c = null;
            }
        }

        @Override // a.m.e
        public void g(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f811b;
                onBackPressedDispatcher.f809b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.f1b.add(aVar2);
                this.f812c = aVar2;
            } else if (aVar == d.a.ON_STOP) {
                a.a.a aVar3 = this.f812c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == d.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f813a;

        public a(b bVar) {
            this.f813a = bVar;
        }

        @Override // a.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f809b.remove(this.f813a);
            this.f813a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f808a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f809b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f0a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f808a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
