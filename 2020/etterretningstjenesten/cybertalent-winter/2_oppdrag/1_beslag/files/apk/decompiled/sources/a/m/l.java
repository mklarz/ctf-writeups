package a.m;

import androidx.lifecycle.LiveData;

public class l<T> extends LiveData<T> {
    public void g(T t) {
        LiveData.a("setValue");
        this.f++;
        this.d = t;
        c(null);
    }
}
