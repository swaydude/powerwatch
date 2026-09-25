package com.polidea.rxandroidble2.helpers;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServicesOkObservable_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.helpers.LocationServicesOkObservable> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Observable<java.lang.Boolean>> locationServicesOkObsImplProvider;

    public LocationServicesOkObservable_Factory(bleshadow.javax.inject.Provider<io.reactivex.Observable<java.lang.Boolean>> provider) {
        this.locationServicesOkObsImplProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.helpers.LocationServicesOkObservable get() {
        return new com.polidea.rxandroidble2.helpers.LocationServicesOkObservable(this.locationServicesOkObsImplProvider.get());
    }

    public static com.polidea.rxandroidble2.helpers.LocationServicesOkObservable_Factory create(bleshadow.javax.inject.Provider<io.reactivex.Observable<java.lang.Boolean>> provider) {
        return new com.polidea.rxandroidble2.helpers.LocationServicesOkObservable_Factory(provider);
    }

    public static com.polidea.rxandroidble2.helpers.LocationServicesOkObservable newLocationServicesOkObservable(io.reactivex.Observable<java.lang.Boolean> observable) {
        return new com.polidea.rxandroidble2.helpers.LocationServicesOkObservable(observable);
    }
}
