package a.h.g;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f464b;

    /* renamed from: c  reason: collision with root package name */
    public final String f465c;
    public final List<List<byte[]>> d;
    public final String e;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f463a = str;
        this.f464b = str2;
        this.f465c = str3;
        Objects.requireNonNull(list);
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder d2 = b.a.a.a.a.d("FontRequest {mProviderAuthority: ");
        d2.append(this.f463a);
        d2.append(", mProviderPackage: ");
        d2.append(this.f464b);
        d2.append(", mQuery: ");
        d2.append(this.f465c);
        d2.append(", mCertificates:");
        sb.append(d2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
