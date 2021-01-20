package no.cybertalent.liberatortoolkit;

import a.b.c.e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.TextView;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TunerActivity extends e {
    public int o = 0;
    public Uri p;
    public MediaPlayer q;

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Switch f1158a;

        public a(Switch r2) {
            this.f1158a = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (this.f1158a.isChecked()) {
                TunerActivity tunerActivity = TunerActivity.this;
                int i = tunerActivity.o;
                tunerActivity.q = i != 0 ? MediaPlayer.create(tunerActivity, i) : MediaPlayer.create(tunerActivity, tunerActivity.p);
                TunerActivity.this.q.setLooping(true);
                TunerActivity.this.q.start();
                return;
            }
            TunerActivity.this.q.stop();
            TunerActivity.this.q.reset();
            TunerActivity.this.q.release();
        }
    }

    public class b implements NumberPicker.OnValueChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NumberPicker f1160a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f1161b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ TextView f1162c;
        public final /* synthetic */ Switch d;

        public b(NumberPicker numberPicker, TextView textView, TextView textView2, Switch r5) {
            this.f1160a = numberPicker;
            this.f1161b = textView;
            this.f1162c = textView2;
            this.d = r5;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ac, code lost:
            if (r16.f1160a.getValue() == 9) goto L_0x00fc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01d0  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01e0  */
        /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            boolean z;
            TunerActivity tunerActivity;
            int i3;
            Log.d(TunerActivity.this.getPackageName(), String.format("Tuner at channel: %d", Integer.valueOf(this.f1160a.getValue())));
            TunerActivity.this.q.stop();
            String charSequence = this.f1161b.getText().toString();
            String charSequence2 = this.f1162c.getText().toString();
            TunerActivity tunerActivity2 = TunerActivity.this;
            Objects.requireNonNull(tunerActivity2);
            SQLiteDatabase readableDatabase = new c.a.a.d.b(tunerActivity2).getReadableDatabase();
            Cursor query = readableDatabase.query("users", new String[]{"password_hash"}, "username = ?", new String[]{charSequence}, null, null, null);
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i4 = 4;
                if (!query.moveToNext()) {
                    break;
                }
                String string = query.getString(query.getColumnIndexOrThrow("password_hash"));
                int length = string.length();
                byte[] bArr = new byte[(length / 2)];
                int i5 = 0;
                while (i5 < length) {
                    bArr[i5 / 2] = (byte) (Character.digit(string.charAt(i5 + 1), 16) + (Character.digit(string.charAt(i5), 16) << i4));
                    i5 += 2;
                    i4 = 4;
                }
                arrayList.add(bArr);
            }
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                byte[] bArr2 = null;
                try {
                    MessageDigest instance = MessageDigest.getInstance("md5");
                    instance.update(charSequence2.getBytes());
                    bArr2 = instance.digest();
                } catch (NoSuchAlgorithmException e2) {
                    e2.printStackTrace();
                }
                query.close();
                readableDatabase.close();
                z = Arrays.equals((byte[]) arrayList.get(0), bArr2);
            }
            if (this.f1160a.getValue() == 1) {
                tunerActivity = TunerActivity.this;
                i3 = R.raw.static1;
            } else if (this.f1160a.getValue() == 2) {
                tunerActivity = TunerActivity.this;
                i3 = R.raw.radio1;
            } else {
                if (this.f1160a.getValue() != 3) {
                    if (this.f1160a.getValue() == 4) {
                        tunerActivity = TunerActivity.this;
                        i3 = R.raw.radio2;
                    } else {
                        if (this.f1160a.getValue() != 5) {
                            if (this.f1160a.getValue() == 6) {
                                tunerActivity = TunerActivity.this;
                                i3 = R.raw.radio3;
                            } else {
                                if (this.f1160a.getValue() == 7) {
                                    if (z) {
                                        File file = new File(TunerActivity.this.getFilesDir().getAbsolutePath() + "/data.bin");
                                        File file2 = new File(TunerActivity.this.getFilesDir().getAbsolutePath() + "/data.mp3");
                                        c.a.a.d.a.b(file, file2, charSequence2.getBytes());
                                        TunerActivity.this.p = Uri.fromFile(file2);
                                        TunerActivity.this.o = 0;
                                    } else {
                                        tunerActivity = TunerActivity.this;
                                        i3 = R.raw.static4;
                                    }
                                } else if (this.f1160a.getValue() != 8) {
                                }
                                TunerActivity.this.q.stop();
                                TunerActivity.this.q.reset();
                                TunerActivity.this.q.release();
                                TunerActivity tunerActivity3 = TunerActivity.this;
                                int i6 = tunerActivity3.o;
                                tunerActivity3.q = i6 == 0 ? MediaPlayer.create(tunerActivity3, i6) : MediaPlayer.create(tunerActivity3, tunerActivity3.p);
                                if (!this.d.isChecked()) {
                                    TunerActivity.this.q.setLooping(true);
                                    TunerActivity.this.q.start();
                                    return;
                                }
                                return;
                            }
                        }
                        TunerActivity.this.o = R.raw.static3;
                        TunerActivity.this.q.stop();
                        TunerActivity.this.q.reset();
                        TunerActivity.this.q.release();
                        TunerActivity tunerActivity32 = TunerActivity.this;
                        int i62 = tunerActivity32.o;
                        tunerActivity32.q = i62 == 0 ? MediaPlayer.create(tunerActivity32, i62) : MediaPlayer.create(tunerActivity32, tunerActivity32.p);
                        if (!this.d.isChecked()) {
                        }
                    }
                }
                TunerActivity.this.o = R.raw.static2;
                TunerActivity.this.q.stop();
                TunerActivity.this.q.reset();
                TunerActivity.this.q.release();
                TunerActivity tunerActivity322 = TunerActivity.this;
                int i622 = tunerActivity322.o;
                tunerActivity322.q = i622 == 0 ? MediaPlayer.create(tunerActivity322, i622) : MediaPlayer.create(tunerActivity322, tunerActivity322.p);
                if (!this.d.isChecked()) {
                }
            }
            tunerActivity.o = i3;
            TunerActivity.this.q.stop();
            TunerActivity.this.q.reset();
            TunerActivity.this.q.release();
            TunerActivity tunerActivity3222 = TunerActivity.this;
            int i6222 = tunerActivity3222.o;
            tunerActivity3222.q = i6222 == 0 ? MediaPlayer.create(tunerActivity3222, i6222) : MediaPlayer.create(tunerActivity3222, tunerActivity3222.p);
            if (!this.d.isChecked()) {
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d, a.b.c.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tuner);
        Log.d(getPackageName(), "Tuner activated");
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.channel);
        TextView textView = (TextView) findViewById(R.id.tuner_user);
        TextView textView2 = (TextView) findViewById(R.id.tuner_pass);
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(9);
        this.o = R.raw.static1;
        this.q = MediaPlayer.create(this, (int) R.raw.static1);
        Switch r5 = (Switch) findViewById(R.id.switch1);
        r5.setOnCheckedChangeListener(new a(r5));
        numberPicker.setOnValueChangedListener(new b(numberPicker, textView, textView2, r5));
    }

    @Override // a.k.a.d
    public void onPause() {
        super.onPause();
        try {
            this.q.stop();
            this.q.reset();
            this.q.release();
        } catch (IllegalStateException unused) {
            Log.d("Tuner", "MediaPlayer already released");
        }
    }
}
