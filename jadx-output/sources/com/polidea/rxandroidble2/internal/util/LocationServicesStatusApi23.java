package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class LocationServicesStatusApi23 implements com.polidea.rxandroidble2.internal.util.LocationServicesStatus {
    private final com.polidea.rxandroidble2.internal.util.CheckerLocationPermission checkerLocationPermission;
    private final com.polidea.rxandroidble2.internal.util.CheckerLocationProvider checkerLocationProvider;
    private final boolean isAndroidWear;
    private final int targetSdk;

    @bleshadow.javax.inject.Inject
    LocationServicesStatusApi23(com.polidea.rxandroidble2.internal.util.CheckerLocationProvider checkerLocationProvider, com.polidea.rxandroidble2.internal.util.CheckerLocationPermission checkerLocationPermission, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_TARGET_SDK) int i, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.BOOL_IS_ANDROID_WEAR) boolean z) {
        this.checkerLocationProvider = checkerLocationProvider;
        this.checkerLocationPermission = checkerLocationPermission;
        this.targetSdk = i;
        this.isAndroidWear = z;
    }

    @Override // com.polidea.rxandroidble2.internal.util.LocationServicesStatus
    public boolean isLocationPermissionOk() {
        return this.checkerLocationPermission.isLocationPermissionGranted();
    }

    @Override // com.polidea.rxandroidble2.internal.util.LocationServicesStatus
    public boolean isLocationProviderOk() {
        return !isLocationProviderEnabledRequired() || this.checkerLocationProvider.isLocationProviderEnabled();
    }

    private boolean isLocationProviderEnabledRequired() {
        return !this.isAndroidWear && this.targetSdk >= 23;
    }
}
