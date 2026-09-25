package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class CheckerLocationPermission {
    private final android.content.Context context;

    @bleshadow.javax.inject.Inject
    public CheckerLocationPermission(android.content.Context context) {
        this.context = context;
    }

    boolean isLocationPermissionGranted() {
        return isPermissionGranted("android.permission.ACCESS_COARSE_LOCATION") || isPermissionGranted("android.permission.ACCESS_FINE_LOCATION");
    }

    private boolean isPermissionGranted(java.lang.String str) {
        if (str != null) {
            return this.context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) == 0;
        }
        throw new java.lang.IllegalArgumentException("permission is null");
    }
}
