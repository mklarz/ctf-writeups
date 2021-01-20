package no.cybertalent.liberatortoolkit;

import a.b.c.e;
import a.o.b.l;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.a;
import c.a.a.d.c;
import dalvik.system.InMemoryDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class VaultActivity extends e implements a.AbstractC0031a {
    public static File[] p;
    public static ArrayList<NumberPicker> q;
    public static StringBuilder r;
    public static SharedPreferences s;
    public static ByteBuffer t;
    public a o;

    public native byte[] finalize(byte[] bArr);

    public void onAddClick(View view) {
        if (u()) {
            Toast.makeText(this, "Cannot add notes in LOCKED state", 0).show();
            return;
        }
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("filename", "");
        intent.putExtra("reason", 0);
        startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d, a.b.c.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vault);
        ArrayList<NumberPicker> arrayList = new ArrayList<>();
        q = arrayList;
        arrayList.add((NumberPicker) findViewById(R.id.lock1));
        q.add((NumberPicker) findViewById(R.id.lock2));
        q.add((NumberPicker) findViewById(R.id.lock3));
        q.add((NumberPicker) findViewById(R.id.lock4));
        Iterator<NumberPicker> it = q.iterator();
        while (it.hasNext()) {
            NumberPicker next = it.next();
            next.setMinValue(0);
            next.setMaxValue(9);
        }
        SharedPreferences preferences = getPreferences(0);
        s = preferences;
        if (!preferences.contains("locked")) {
            w(false);
        }
        if (!s.contains("pin_hash")) {
            SharedPreferences.Editor edit = s.edit();
            edit.putString("pin_hash", "null");
            edit.apply();
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.fileList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.h(new l(recyclerView.getContext(), 0));
        this.o = new a(this);
        x();
        a aVar = this.o;
        aVar.d = this;
        recyclerView.setAdapter(aVar);
        v();
        new c(this).execute(new Void[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0221 A[SYNTHETIC] */
    public void onLockerClick(View view) {
        String str;
        String str2;
        Exception e;
        int i = 48;
        String str3 = "";
        String str4 = "\n";
        int i2 = 16;
        int i3 = 0;
        int i4 = 1;
        if (u()) {
            r = new StringBuilder();
            Iterator<NumberPicker> it = q.iterator();
            while (it.hasNext()) {
                r.append(it.next().getValue());
            }
            byte[] finalize = finalize(t(r.toString()));
            if (finalize == null || finalize.length == 0) {
                Toast.makeText(this, "Could not get data, or phone integrity compromised", 1).show();
                Log.e("Unlock", "Could not execute get hash data");
            } else {
                if (Base64.encodeToString(Arrays.copyOfRange(finalize, 0, 16), 0).trim().equals(s.getString("pin_hash", null).trim())) {
                    File[] fileArr = p;
                    int length = fileArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        File file = fileArr[i5];
                        if (file.getName().startsWith("!") && u()) {
                            c.a.a.d.a.b(file, new File((file.getParent() + "/" + new String(Base64.decode(file.getName().substring(i4), 0))).replace(str4, str3)), Arrays.copyOfRange(finalize, 16, 48));
                            if (!file.delete()) {
                                Log.i("UnlockFiles", "Could not delete encrypted file!");
                            }
                        }
                        i5++;
                        i4 = 1;
                    }
                    w(false);
                } else {
                    Toast.makeText(this, "Wrong PIN!", 0).show();
                }
            }
        } else {
            r = new StringBuilder();
            Iterator<NumberPicker> it2 = q.iterator();
            while (it2.hasNext()) {
                r.append(it2.next().getValue());
            }
            byte[] t2 = t(r.toString());
            if (t2 == null) {
                Log.e("Unlock", "Could not execute get hash data");
            } else {
                File[] fileArr2 = p;
                int length2 = fileArr2.length;
                int i6 = 0;
                while (i3 < length2) {
                    File file2 = fileArr2[i3];
                    if (file2.getName().startsWith("!") || u()) {
                        str = str3;
                        str2 = str4;
                    } else {
                        StringBuilder d = b.a.a.a.a.d("!");
                        d.append(Base64.encodeToString(file2.getName().getBytes(), i6));
                        File file3 = new File((file2.getParent() + "/" + d.toString()).replace(str4, str3));
                        byte[] copyOfRange = Arrays.copyOfRange(t2, i2, i);
                        byte[] bArr = c.a.a.d.a.f1089a;
                        try {
                            byte[] bArr2 = new byte[i2];
                            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                            SecretKey c2 = c.a.a.d.a.c(copyOfRange);
                            if (c2 == null) {
                                str = str3;
                                try {
                                    Log.e(c.a.a.d.a.class.getSimpleName(), "Failed to generate key");
                                } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                                    e = e2;
                                    str2 = str4;
                                    e.printStackTrace();
                                    if (!file2.delete()) {
                                    }
                                    i3++;
                                    i = 48;
                                    i2 = 16;
                                    i6 = 0;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                            }
                            new SecureRandom().nextBytes(bArr2);
                            instance.init(1, c2, new IvParameterSpec(bArr2));
                            byte[] doFinal = instance.doFinal(Files.readAllBytes(file2.toPath()));
                            Path path = file3.toPath();
                            OpenOption[] openOptionArr = new OpenOption[3];
                            openOptionArr[0] = StandardOpenOption.WRITE;
                            str2 = str4;
                            try {
                                openOptionArr[1] = StandardOpenOption.CREATE;
                                openOptionArr[2] = StandardOpenOption.TRUNCATE_EXISTING;
                                Files.write(path, bArr2, openOptionArr);
                                Files.write(file3.toPath(), doFinal, StandardOpenOption.APPEND);
                            } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e3) {
                                e = e3;
                            }
                        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
                            e = e4;
                            str = str3;
                            str2 = str4;
                            e.printStackTrace();
                            if (!file2.delete()) {
                            }
                            i3++;
                            i = 48;
                            i2 = 16;
                            i6 = 0;
                            str3 = str;
                            str4 = str2;
                        }
                        if (!file2.delete()) {
                            Log.i("LockFiles", "Could not delete cleartext file!");
                        }
                    }
                    i3++;
                    i = 48;
                    i2 = 16;
                    i6 = 0;
                    str3 = str;
                    str4 = str2;
                }
                String trim = Base64.encodeToString(Arrays.copyOfRange(t2, i6, i2), i6).trim();
                SharedPreferences.Editor edit = s.edit();
                edit.putString("pin_hash", trim);
                edit.apply();
                w(true);
            }
        }
        x();
        v();
    }

    public void onRestart() {
        super.onRestart();
        x();
        this.o.f937a.a();
    }

    public final byte[] t(String str) {
        Class cls;
        Method method;
        try {
            cls = new InMemoryDexClassLoader(t, getClassLoader()).loadClass("com.example.extra.extra");
        } catch (ClassNotFoundException e) {
            Log.e("UnlockFiles", "Could not load class");
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("getData", String.class);
            } catch (NoSuchMethodException e2) {
                Log.e("UnlockFiles", "Could not find method");
                e2.printStackTrace();
                method = null;
            }
            if (method != null) {
                try {
                    return (byte[]) method.invoke(null, str);
                } catch (IllegalAccessException e3) {
                    Log.e("UnlockFiles", "Could not execute getData");
                    e3.printStackTrace();
                    return null;
                } catch (InvocationTargetException e4) {
                    Log.e("UnlockFiles", "Something went wrong executing getData");
                    e4.printStackTrace();
                    return null;
                }
            } else {
                throw new IllegalAccessException();
            }
        } else {
            throw new NoSuchMethodException();
        }
    }

    public final boolean u() {
        return s.getBoolean("locked", true);
    }

    public native byte[] undo(byte[] bArr);

    public final void v() {
        ((Button) findViewById(R.id.btn_unlock)).setText(u() ? R.string.unlock : R.string.lock);
    }

    public final void w(boolean z) {
        SharedPreferences.Editor edit = s.edit();
        edit.putBoolean("locked", z);
        edit.apply();
    }

    public final void x() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir != null) {
            File[] listFiles = externalFilesDir.listFiles();
            p = listFiles;
            if (listFiles == null || listFiles.length == 0) {
                p = new File[]{new File(getExternalFilesDir(null) + "/new_note")};
            }
            this.o.f1085b = Arrays.asList(p);
        }
        this.o.f937a.a();
    }
}
