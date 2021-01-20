package no.cybertalent.liberatortoolkit;

import a.b.c.d;
import a.b.c.e;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import no.cybertalent.liberatortoolkit.helpers.ChatHelper;

public class ChatActivity extends e {
    public static SharedPreferences q = null;
    public static Thread r = null;
    public static boolean s = false;
    public static final Object t = new Object();
    public TextView o;
    public TextView p;

    public class a implements View.OnKeyListener {
        public a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            ChatActivity chatActivity = ChatActivity.this;
            SharedPreferences sharedPreferences = ChatActivity.q;
            chatActivity.t();
            return true;
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ String f1154b;

            public a(String str) {
                this.f1154b = str;
            }

            public void run() {
                String str = this.f1154b;
                if (str == null || str == "") {
                    ChatActivity.this.o.setText(R.string.error_inet);
                } else {
                    ChatActivity.this.o.setText(str);
                }
            }
        }

        public b() {
        }

        public void run() {
            while (true) {
                try {
                    if (!ChatActivity.s) {
                        ChatActivity.this.o.post(new a(ChatHelper.a("chat", ChatActivity.q.getString("token", "0000"))));
                        Thread.sleep(1000);
                    } else {
                        SharedPreferences sharedPreferences = ChatActivity.q;
                        Object obj = ChatActivity.t;
                        synchronized (obj) {
                            obj.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f1156b;

        public c(String str) {
            this.f1156b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
            if (r1 != null) goto L_0x009a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x009f, code lost:
            r0.addSuppressed(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
            throw r2;
         */
        public void run() {
            String str = this.f1156b;
            String string = ChatActivity.q.getString("token", "0000");
            String string2 = ChatActivity.q.getString("nick", "l4m3r");
            boolean z = ChatHelper.emu;
            boolean z2 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://mobile.cybertalent.no/say").openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setDoOutput(true);
                String str2 = "{\"content\":\"" + str + "\", \"token\":\"" + string + "\", \"nick\":\"" + string2 + "\"}";
                OutputStream outputStream = httpURLConnection.getOutputStream();
                byte[] bytes = str2.getBytes("utf-8");
                outputStream.write(bytes, 0, bytes.length);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    z2 = true;
                } else {
                    Log.d("ChatHelper", "Got code: " + responseCode);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (z2) {
                ChatActivity.this.p.setText("");
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, a.h.b.e, a.k.a.d, a.b.c.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_chat);
        this.o = (TextView) findViewById(R.id.chat);
        this.p = (TextView) findViewById(R.id.input);
        this.o.setMovementMethod(new ScrollingMovementMethod());
        this.p.setOnKeyListener(new a());
        SharedPreferences preferences = getPreferences(0);
        q = preferences;
        if (!preferences.contains("token")) {
            SharedPreferences.Editor edit = q.edit();
            edit.putString("token", "0000");
            edit.apply();
        }
        s = false;
        Thread thread = new Thread(new b());
        r = thread;
        thread.start();
    }

    public void onRestart() {
        super.onRestart();
        s = false;
        Object obj = t;
        synchronized (obj) {
            obj.notify();
        }
    }

    public void onSendClick(View view) {
        t();
    }

    @Override // a.k.a.d, a.b.c.e
    public void onStop() {
        super.onStop();
        s = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r3.equals("/nick") == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    public final void t() {
        d dVar;
        String str;
        AlertController.b bVar;
        d.a aVar;
        String str2;
        String charSequence = this.p.getText().toString();
        if (charSequence.startsWith("/")) {
            String[] split = charSequence.split(" ", 2);
            boolean z = false;
            String str3 = split[0];
            str3.hashCode();
            int hashCode = str3.hashCode();
            if (hashCode != 46786578) {
                if (hashCode != 608662896) {
                    if (hashCode == 1456111402 && str3.equals("/token")) {
                        z = true;
                        if (!z) {
                            SharedPreferences.Editor edit = q.edit();
                            edit.putString("nick", split[1]);
                            edit.apply();
                            aVar = new d.a(this);
                            bVar = aVar.f10a;
                            str = "New nick set";
                            bVar.f = str;
                            str2 = "Info";
                        } else if (z) {
                            d.a aVar2 = new d.a(this);
                            String response = ChatHelper.getResponse(split[1]);
                            StringBuilder sb = new StringBuilder();
                            if (ChatHelper.emu) {
                                sb.append("a1");
                            }
                            sb.append(response.toLowerCase());
                            String sb2 = sb.toString();
                            AlertController.b bVar2 = aVar2.f10a;
                            bVar2.f = sb2;
                            bVar2.d = "Response code";
                            dVar = aVar2.a();
                            dVar.show();
                            this.p.setText("");
                            return;
                        } else if (!z) {
                            aVar = new d.a(this);
                            bVar = aVar.f10a;
                            bVar.f = "Invalid command";
                            str2 = "Error";
                        } else {
                            SharedPreferences.Editor edit2 = q.edit();
                            edit2.putString("token", split[1]);
                            edit2.apply();
                            aVar = new d.a(this);
                            bVar = aVar.f10a;
                            str = "New token set";
                            bVar.f = str;
                            str2 = "Info";
                        }
                        bVar.d = str2;
                        dVar = aVar.a();
                        dVar.show();
                        this.p.setText("");
                        return;
                    }
                } else if (str3.equals("/response")) {
                    z = true;
                    if (!z) {
                    }
                    bVar.d = str2;
                    dVar = aVar.a();
                    dVar.show();
                    this.p.setText("");
                    return;
                }
            }
            z = true;
            if (!z) {
            }
            bVar.d = str2;
            dVar = aVar.a();
            dVar.show();
            this.p.setText("");
            return;
        }
        new Thread(new c(charSequence)).start();
    }
}
