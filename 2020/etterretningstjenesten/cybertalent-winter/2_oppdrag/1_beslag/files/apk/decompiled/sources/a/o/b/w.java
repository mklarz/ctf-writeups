package a.o.b;

import a.o.b.k;
import androidx.recyclerview.widget.RecyclerView;

public abstract class w extends RecyclerView.i {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean a(RecyclerView.y yVar, RecyclerView.y yVar2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f941a;
        int i4 = cVar.f942b;
        if (yVar2.t()) {
            int i5 = cVar.f941a;
            i = cVar.f942b;
            i2 = i5;
        } else {
            i2 = cVar2.f941a;
            i = cVar2.f942b;
        }
        k kVar = (k) this;
        if (yVar == yVar2) {
            return kVar.i(yVar, i3, i4, i2, i);
        }
        float translationX = yVar.f970b.getTranslationX();
        float translationY = yVar.f970b.getTranslationY();
        float alpha = yVar.f970b.getAlpha();
        kVar.n(yVar);
        yVar.f970b.setTranslationX(translationX);
        yVar.f970b.setTranslationY(translationY);
        yVar.f970b.setAlpha(alpha);
        kVar.n(yVar2);
        yVar2.f970b.setTranslationX((float) (-((int) (((float) (i2 - i3)) - translationX))));
        yVar2.f970b.setTranslationY((float) (-((int) (((float) (i - i4)) - translationY))));
        yVar2.f970b.setAlpha(0.0f);
        kVar.k.add(new k.a(yVar, yVar2, i3, i4, i2, i));
        return true;
    }

    public abstract boolean i(RecyclerView.y yVar, int i, int i2, int i3, int i4);
}
