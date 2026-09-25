package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServicesStatusApi23_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CheckerLocationPermission> checkerLocationPermissionProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CheckerLocationProvider> checkerLocationProvider;
    private final bleshadow.javax.inject.Provider<java.lang.Boolean> isAndroidWearProvider;
    private final bleshadow.javax.inject.Provider<java.lang.Integer> targetSdkProvider;

    public LocationServicesStatusApi23_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CheckerLocationProvider> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CheckerLocationPermission> provider2, bleshadow.javax.inject.Provider<java.lang.Integer> provider3, bleshadow.javax.inject.Provider<java.lang.Boolean> provider4) {
        this.checkerLocationProvider = provider;
        this.checkerLocationPermissionProvider = provider2;
        this.targetSdkProvider = provider3;
        this.isAndroidWearProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23 get() {
        return new com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23(this.checkerLocationProvider.get(), this.checkerLocationPermissionProvider.get(), this.targetSdkProvider.get().intValue(), this.isAndroidWearProvider.get().booleanValue());
    }

    public static com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CheckerLocationProvider> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.CheckerLocationPermission> provider2, bleshadow.javax.inject.Provider<java.lang.Integer> provider3, bleshadow.javax.inject.Provider<java.lang.Boolean> provider4) {
        return new com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23 newLocationServicesStatusApi23(com.polidea.rxandroidble2.internal.util.CheckerLocationProvider checkerLocationProvider, com.polidea.rxandroidble2.internal.util.CheckerLocationPermission checkerLocationPermission, int i, boolean z) {
        return new com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23(checkerLocationProvider, checkerLocationPermission, i, z);
    }
}
