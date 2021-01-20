package a.h.i;

import android.util.Log;
import java.io.Writer;

@Deprecated
public class a extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f495a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f496b = new StringBuilder(128);

    public a(String str) {
        this.f495a = str;
    }

    public final void a() {
        if (this.f496b.length() > 0) {
            Log.d(this.f495a, this.f496b.toString());
            StringBuilder sb = this.f496b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f496b.append(c2);
            }
        }
    }
}
