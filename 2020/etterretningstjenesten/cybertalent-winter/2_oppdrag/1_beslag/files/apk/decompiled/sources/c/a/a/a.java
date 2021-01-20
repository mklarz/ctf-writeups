package c.a.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import no.cybertalent.liberatortoolkit.EditActivity;
import no.cybertalent.liberatortoolkit.R;
import no.cybertalent.liberatortoolkit.VaultActivity;

public class a extends RecyclerView.d<b> {

    /* renamed from: b  reason: collision with root package name */
    public List<File> f1085b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f1086c;
    public AbstractC0031a d;
    public Context e;

    /* renamed from: c.a.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0031a {
    }

    public class b extends RecyclerView.y implements View.OnClickListener {
        public TextView u;

        public b(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.fileListRow);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            AbstractC0031a aVar = a.this.d;
            if (aVar != null) {
                int e = e();
                VaultActivity vaultActivity = (VaultActivity) aVar;
                if (vaultActivity.u()) {
                    Toast.makeText(vaultActivity, "Cannot view notes in LOCKED state", 0).show();
                    return;
                }
                Intent intent = new Intent(vaultActivity, EditActivity.class);
                intent.putExtra("filename", vaultActivity.o.f1085b.get(e).getName());
                intent.putExtra("reason", 1);
                vaultActivity.startActivity(intent);
            }
        }
    }

    public a(Context context) {
        this.f1086c = LayoutInflater.from(context);
        this.e = context;
        ArrayList arrayList = new ArrayList();
        this.f1085b = arrayList;
        arrayList.add(new File(this.e.getExternalFilesDir(null) + "/new_note"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public int a() {
        return this.f1085b.size();
    }
}
