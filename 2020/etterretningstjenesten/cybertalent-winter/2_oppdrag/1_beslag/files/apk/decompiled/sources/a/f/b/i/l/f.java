package a.f.b.i.l;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f358a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f359b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f360c = false;
    public m d;
    public a e = a.UNKNOWN;
    public int f;
    public int g;
    public int h = 1;
    public g i = null;
    public boolean j = false;
    public List<d> k = new ArrayList();
    public List<f> l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.d = mVar;
    }

    @Override // a.f.b.i.l.d
    public void a(d dVar) {
        for (f fVar : this.l) {
            if (!fVar.j) {
                return;
            }
        }
        this.f360c = true;
        d dVar2 = this.f358a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f359b) {
            this.d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (gVar.j) {
                    this.f = this.h * gVar.g;
                } else {
                    return;
                }
            }
            c(fVar2.g + this.f);
        }
        d dVar3 = this.f358a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f360c = false;
        this.f359b = false;
    }

    public void c(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            for (d dVar : this.k) {
                dVar.a(dVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f368b.Y);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
