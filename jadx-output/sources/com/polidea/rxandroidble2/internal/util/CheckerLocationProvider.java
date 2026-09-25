package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class CheckerLocationProvider {
    private final android.content.ContentResolver contentResolver;
    private final android.location.LocationManager locationManager;

    @bleshadow.javax.inject.Inject
    CheckerLocationProvider(android.content.ContentResolver contentResolver, android.location.LocationManager locationManager) {
        this.contentResolver = contentResolver;
        this.locationManager = locationManager;
    }

    public boolean isLocationProviderEnabled() {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            try {
                return android.provider.Settings.Secure.getInt(this.contentResolver, "location_mode") != 0;
            } catch (android.provider.Settings.SettingNotFoundException e) {
                com.polidea.rxandroidble2.internal.RxBleLog.w(e, "Could not use LOCATION_MODE check. Falling back to legacy method.", new java.lang.Object[0]);
            }
        }
        return this.locationManager.isProviderEnabled("network") || this.locationManager.isProviderEnabled("gps");
    }
}
