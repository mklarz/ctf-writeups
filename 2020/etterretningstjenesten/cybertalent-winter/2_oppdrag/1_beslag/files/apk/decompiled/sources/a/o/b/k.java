package a.o.b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class k extends w {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.y> h = new ArrayList<>();
    public ArrayList<RecyclerView.y> i = new ArrayList<>();
    public ArrayList<b> j = new ArrayList<>();
    public ArrayList<a> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.y>> l = new ArrayList<>();
    public ArrayList<ArrayList<b>> m = new ArrayList<>();
    public ArrayList<ArrayList<a>> n = new ArrayList<>();
    public ArrayList<RecyclerView.y> o = new ArrayList<>();
    public ArrayList<RecyclerView.y> p = new ArrayList<>();
    public ArrayList<RecyclerView.y> q = new ArrayList<>();
    public ArrayList<RecyclerView.y> r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.y f691a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.y f692b;

        /* renamed from: c  reason: collision with root package name */
        public int f693c;
        public int d;
        public int e;
        public int f;

        public a(RecyclerView.y yVar, RecyclerView.y yVar2, int i, int i2, int i3, int i4) {
            this.f691a = yVar;
            this.f692b = yVar2;
            this.f693c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public String toString() {
            StringBuilder d2 = b.a.a.a.a.d("ChangeInfo{oldHolder=");
            d2.append(this.f691a);
            d2.append(", newHolder=");
            d2.append(this.f692b);
            d2.append(", fromX=");
            d2.append(this.f693c);
            d2.append(", fromY=");
            d2.append(this.d);
            d2.append(", toX=");
            d2.append(this.e);
            d2.append(", toY=");
            d2.append(this.f);
            d2.append('}');
            return d2.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.y f694a;

        /* renamed from: b  reason: collision with root package name */
        public int f695b;

        /* renamed from: c  reason: collision with root package name */
        public int f696c;
        public int d;
        public int e;

        public b(RecyclerView.y yVar, int i, int i2, int i3, int i4) {
            this.f694a = yVar;
            this.f695b = i;
            this.f696c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void e(RecyclerView.y yVar) {
        View view = yVar.f970b;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f694a == yVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(yVar);
                this.j.remove(size);
            }
        }
        l(this.k, yVar);
        if (this.h.remove(yVar)) {
            view.setAlpha(1.0f);
            c(yVar);
        }
        if (this.i.remove(yVar)) {
            view.setAlpha(1.0f);
            c(yVar);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.n.get(size2);
            l(arrayList, yVar);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f694a == yVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(yVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.y> arrayList3 = this.l.get(size5);
                if (arrayList3.remove(yVar)) {
                    view.setAlpha(1.0f);
                    c(yVar);
                    if (arrayList3.isEmpty()) {
                        this.l.remove(size5);
                    }
                }
            } else {
                this.q.remove(yVar);
                this.o.remove(yVar);
                this.r.remove(yVar);
                this.p.remove(yVar);
                k();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void f() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.j.get(size);
            View view = bVar.f694a.f970b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f694a);
            this.j.remove(size);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.y yVar = this.i.get(size3);
            yVar.f970b.setAlpha(1.0f);
            c(yVar);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.k.get(size4);
            RecyclerView.y yVar2 = aVar.f691a;
            if (yVar2 != null) {
                m(aVar, yVar2);
            }
            RecyclerView.y yVar3 = aVar.f692b;
            if (yVar3 != null) {
                m(aVar, yVar3);
            }
        }
        this.k.clear();
        if (g()) {
            int size5 = this.m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<b> arrayList = this.m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = arrayList.get(size6);
                        View view2 = bVar2.f694a.f970b;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.f694a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<RecyclerView.y> arrayList2 = this.l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.y yVar4 = arrayList2.get(size8);
                        yVar4.f970b.setAlpha(1.0f);
                        c(yVar4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList<a> arrayList3 = this.n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = arrayList3.get(size10);
                            RecyclerView.y yVar5 = aVar2.f691a;
                            if (yVar5 != null) {
                                m(aVar2, yVar5);
                            }
                            RecyclerView.y yVar6 = aVar2.f692b;
                            if (yVar6 != null) {
                                m(aVar2, yVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    j(this.q);
                    j(this.p);
                    j(this.o);
                    j(this.r);
                    d();
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean g() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override // a.o.b.w
    public boolean i(RecyclerView.y yVar, int i2, int i3, int i4, int i5) {
        View view = yVar.f970b;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) yVar.f970b.getTranslationY());
        n(yVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(yVar);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.j.add(new b(yVar, translationX, translationY, i4, i5));
        return true;
    }

    public void j(List<RecyclerView.y> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).f970b.animate().cancel();
            } else {
                return;
            }
        }
    }

    public void k() {
        if (!g()) {
            d();
        }
    }

    public final void l(List<a> list, RecyclerView.y yVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = list.get(size);
                if (m(aVar, yVar) && aVar.f691a == null && aVar.f692b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean m(a aVar, RecyclerView.y yVar) {
        if (aVar.f692b == yVar) {
            aVar.f692b = null;
        } else if (aVar.f691a != yVar) {
            return false;
        } else {
            aVar.f691a = null;
        }
        yVar.f970b.setAlpha(1.0f);
        yVar.f970b.setTranslationX(0.0f);
        yVar.f970b.setTranslationY(0.0f);
        c(yVar);
        return true;
    }

    public final void n(RecyclerView.y yVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        yVar.f970b.animate().setInterpolator(s);
        e(yVar);
    }
}
