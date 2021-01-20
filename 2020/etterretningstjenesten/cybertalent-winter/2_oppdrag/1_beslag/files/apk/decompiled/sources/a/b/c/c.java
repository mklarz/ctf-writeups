package a.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public class c implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController f8b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f9c;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f9c = bVar;
        this.f8b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f9c.i.onClick(this.f8b.f816b, i);
        if (!this.f9c.j) {
            this.f8b.f816b.dismiss();
        }
    }
}
