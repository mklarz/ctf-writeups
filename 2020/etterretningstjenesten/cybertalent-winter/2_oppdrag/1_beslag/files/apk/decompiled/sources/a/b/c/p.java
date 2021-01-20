package a.b.c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

public class p {
    public static p d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f42a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f43b;

    /* renamed from: c  reason: collision with root package name */
    public final a f44c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f45a;

        /* renamed from: b  reason: collision with root package name */
        public long f46b;
    }

    public p(Context context, LocationManager locationManager) {
        this.f42a = context;
        this.f43b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f43b.isProviderEnabled(str)) {
                return this.f43b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
