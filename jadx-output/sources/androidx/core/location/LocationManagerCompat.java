package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {
    public static boolean isLocationEnabled(android.location.LocationManager locationManager) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return locationManager.isLocationEnabled();
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    private LocationManagerCompat() {
    }
}
