package a.h.b;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Arrays;

public class a extends a.h.c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f423b = 0;

    /* renamed from: a.h.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0010a {
        void b(int i);
    }

    public static void b(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                StringBuilder d = b.a.a.a.a.d("Permission request for permissions ");
                d.append(Arrays.toString(strArr));
                d.append(" must not contain null or empty values");
                throw new IllegalArgumentException(d.toString());
            }
        }
        if (activity instanceof AbstractC0010a) {
            ((AbstractC0010a) activity).b(i);
        }
        activity.requestPermissions(strArr, i);
    }
}
