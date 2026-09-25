package com.polidea.rxandroidble2.helpers;

/* JADX INFO: loaded from: classes2.dex */
public class LocationServicesOkObservable extends io.reactivex.Observable<java.lang.Boolean> {
    private final io.reactivex.Observable<java.lang.Boolean> locationServicesOkObsImpl;

    public static com.polidea.rxandroidble2.helpers.LocationServicesOkObservable createInstance(android.content.Context context) {
        return com.polidea.rxandroidble2.DaggerClientComponent.builder().applicationContext(context.getApplicationContext()).build().locationServicesOkObservable();
    }

    @bleshadow.javax.inject.Inject
    LocationServicesOkObservable(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedBooleanObservables.LOCATION_SERVICES_OK) io.reactivex.Observable<java.lang.Boolean> observable) {
        this.locationServicesOkObsImpl = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Boolean> observer) {
        this.locationServicesOkObsImpl.subscribe(observer);
    }
}
