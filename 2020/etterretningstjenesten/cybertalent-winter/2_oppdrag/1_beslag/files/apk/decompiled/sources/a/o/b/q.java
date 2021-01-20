package a.o.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public final class q extends s {
    public q(RecyclerView.l lVar) {
        super(lVar, null);
    }

    @Override // a.o.b.s
    public int b(View view) {
        Objects.requireNonNull(this.f720a);
        return view.getRight() + ((RecyclerView.m) view.getLayoutParams()).f953b.right + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).rightMargin;
    }

    @Override // a.o.b.s
    public int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f720a.C(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // a.o.b.s
    public int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f720a.B(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // a.o.b.s
    public int e(View view) {
        Objects.requireNonNull(this.f720a);
        return (view.getLeft() - ((RecyclerView.m) view.getLayoutParams()).f953b.left) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).leftMargin;
    }

    @Override // a.o.b.s
    public int f() {
        return this.f720a.o;
    }

    @Override // a.o.b.s
    public int g() {
        RecyclerView.l lVar = this.f720a;
        return lVar.o - lVar.J();
    }

    @Override // a.o.b.s
    public int h() {
        return this.f720a.J();
    }

    @Override // a.o.b.s
    public int i() {
        return this.f720a.m;
    }

    @Override // a.o.b.s
    public int j() {
        return this.f720a.n;
    }

    @Override // a.o.b.s
    public int k() {
        return this.f720a.I();
    }

    @Override // a.o.b.s
    public int l() {
        RecyclerView.l lVar = this.f720a;
        return (lVar.o - lVar.I()) - this.f720a.J();
    }

    @Override // a.o.b.s
    public int n(View view) {
        this.f720a.P(view, true, this.f722c);
        return this.f722c.right;
    }

    @Override // a.o.b.s
    public int o(View view) {
        this.f720a.P(view, true, this.f722c);
        return this.f722c.left;
    }

    @Override // a.o.b.s
    public void p(int i) {
        this.f720a.V(i);
    }
}
