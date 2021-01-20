package a.f.b.i;

import a.f.b.c;
import java.util.ArrayList;

public class k extends d {
    public ArrayList<d> e0 = new ArrayList<>();

    public void E() {
        ArrayList<d> arrayList = this.e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.e0.get(i);
                if (dVar instanceof k) {
                    ((k) dVar).E();
                }
            }
        }
    }

    @Override // a.f.b.i.d
    public void u() {
        this.e0.clear();
        super.u();
    }

    @Override // a.f.b.i.d
    public void v(c cVar) {
        super.v(cVar);
        int size = this.e0.size();
        for (int i = 0; i < size; i++) {
            this.e0.get(i).v(cVar);
        }
    }
}
