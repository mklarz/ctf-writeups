package no.cybertalent.liberatortoolkit;

import a.b.c.e;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import b.b.a.a.a;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;

public class EditActivity extends e {
    public int o;
    public String p;
    public EditText q;
    public EditText r;

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d, a.b.c.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_edit);
        this.q = (EditText) findViewById(R.id.memo_title);
        this.r = (EditText) findViewById(R.id.memo);
        this.o = getIntent().getIntExtra("reason", 0);
        String stringExtra = getIntent().getStringExtra("filename");
        this.p = stringExtra;
        if (this.o == 1 && stringExtra != null) {
            this.q.setText(a.a(stringExtra.replace("_", " ")));
            try {
                this.r.setText(String.join("\n", Files.readAllLines(new File(getExternalFilesDir(null) + "/" + this.p).toPath())));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void onDeleteClick(View view) {
        if (this.p.equals("")) {
            Toast.makeText(this, "Nothing to delete", 0).show();
            return;
        }
        if (new File(getExternalFilesDir(null) + "/" + this.p).delete()) {
            Toast.makeText(this, "File deleted", 0).show();
            finish();
            return;
        }
        Toast.makeText(this, "Could not delete file", 0).show();
    }

    public void onSaveClick(View view) {
        String str = "";
        if (this.q.getText().toString().equals(str)) {
            Toast.makeText(this, "A title is needed!", 0).show();
            return;
        }
        if (this.o != 0) {
            str = this.p;
        }
        this.p = this.q.getText().toString().toLowerCase().replace(" ", "_");
        new File(getExternalFilesDir(null) + "/" + str).delete();
        try {
            Files.write(new File(getExternalFilesDir(null) + "/" + this.p).toPath(), this.r.getText().toString().getBytes(), new OpenOption[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Memo saved!", 0).show();
        finish();
    }
}
