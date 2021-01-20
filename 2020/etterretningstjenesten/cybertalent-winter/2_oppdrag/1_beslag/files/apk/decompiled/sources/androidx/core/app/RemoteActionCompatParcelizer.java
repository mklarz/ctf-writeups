package androidx.core.app;

import a.s.a;
import a.s.c;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f893a;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        remoteActionCompat.f893a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f894b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f894b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f895c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f895c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.m(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (aVar.i(5)) {
            z = aVar.f();
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (aVar.i(6)) {
            z2 = aVar.f();
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f893a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f894b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f895c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z = remoteActionCompat.e;
        aVar.p(5);
        aVar.q(z);
        boolean z2 = remoteActionCompat.f;
        aVar.p(6);
        aVar.q(z2);
    }
}
