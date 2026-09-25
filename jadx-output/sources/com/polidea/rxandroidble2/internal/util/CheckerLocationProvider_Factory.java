package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckerLocationProvider_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.CheckerLocationProvider> {
    private final bleshadow.javax.inject.Provider<android.content.ContentResolver> contentResolverProvider;
    private final bleshadow.javax.inject.Provider<android.location.LocationManager> locationManagerProvider;

    public CheckerLocationProvider_Factory(bleshadow.javax.inject.Provider<android.content.ContentResolver> provider, bleshadow.javax.inject.Provider<android.location.LocationManager> provider2) {
        this.contentResolverProvider = provider;
        this.locationManagerProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.CheckerLocationProvider get() {
        return new com.polidea.rxandroidble2.internal.util.CheckerLocationProvider(this.contentResolverProvider.get(), this.locationManagerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.util.CheckerLocationProvider_Factory create(bleshadow.javax.inject.Provider<android.content.ContentResolver> provider, bleshadow.javax.inject.Provider<android.location.LocationManager> provider2) {
        return new com.polidea.rxandroidble2.internal.util.CheckerLocationProvider_Factory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.util.CheckerLocationProvider newCheckerLocationProvider(android.content.ContentResolver contentResolver, android.location.LocationManager locationManager) {
        return new com.polidea.rxandroidble2.internal.util.CheckerLocationProvider(contentResolver, locationManager);
    }
}
