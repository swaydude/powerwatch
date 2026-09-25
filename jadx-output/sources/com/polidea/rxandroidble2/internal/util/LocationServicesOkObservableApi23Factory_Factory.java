package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServicesOkObservableApi23Factory_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> locationServicesStatusProvider;

    public LocationServicesOkObservableApi23Factory_Factory(bleshadow.javax.inject.Provider<android.content.Context> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider2) {
        this.contextProvider = provider;
        this.locationServicesStatusProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory get() {
        return new com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory(this.contextProvider.get(), this.locationServicesStatusProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory_Factory create(bleshadow.javax.inject.Provider<android.content.Context> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider2) {
        return new com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory_Factory(provider, provider2);
    }

    public static com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory newLocationServicesOkObservableApi23Factory(android.content.Context context, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus) {
        return new com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory(context, locationServicesStatus);
    }
}
