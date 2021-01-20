package c.a.a.d;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Objects;
import no.cybertalent.liberatortoolkit.R;
import no.cybertalent.liberatortoolkit.VaultActivity;

public class c extends AsyncTask<Void, Void, byte[]> {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    public VaultActivity f1091a;

    public c(VaultActivity vaultActivity) {
        this.f1091a = vaultActivity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    @Override // android.os.AsyncTask
    public byte[] doInBackground(Void[] voidArr) {
        try {
            InputStream openStream = new URL("https://mobile.cybertalent.no/xtra").openStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openStream.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.os.AsyncTask
    public void onPostExecute(byte[] bArr) {
        byte[] bArr2 = bArr;
        VaultActivity vaultActivity = this.f1091a;
        Objects.requireNonNull(vaultActivity);
        if (bArr2 == null) {
            Toast.makeText(vaultActivity, (int) R.string.error_inet, 0).show();
        } else {
            VaultActivity.t = ByteBuffer.wrap(vaultActivity.undo(bArr2));
        }
    }
}
