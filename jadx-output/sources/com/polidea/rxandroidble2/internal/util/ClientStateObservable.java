package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class ClientStateObservable extends io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> {
    private final io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> bleAdapterStateObservable;
    private final io.reactivex.Observable<java.lang.Boolean> locationServicesOkObservable;
    private final com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus;
    private final com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper;
    private final io.reactivex.Scheduler timerScheduler;

    @bleshadow.javax.inject.Inject
    protected ClientStateObservable(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedBooleanObservables.LOCATION_SERVICES_OK) io.reactivex.Observable<java.lang.Boolean> observable2, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT) io.reactivex.Scheduler scheduler) {
        this.rxBleAdapterWrapper = rxBleAdapterWrapper;
        this.bleAdapterStateObservable = observable;
        this.locationServicesOkObservable = observable2;
        this.locationServicesStatus = locationServicesStatus;
        this.timerScheduler = scheduler;
    }

    private static io.reactivex.Single<java.lang.Boolean> checkPermissionUntilGranted(final com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus, io.reactivex.Scheduler scheduler) {
        return io.reactivex.Observable.interval(0L, 1L, java.util.concurrent.TimeUnit.SECONDS, scheduler).takeWhile(new io.reactivex.functions.Predicate<java.lang.Long>() { // from class: com.polidea.rxandroidble2.internal.util.ClientStateObservable.2
            @Override // io.reactivex.functions.Predicate
            public boolean test(java.lang.Long l) {
                return !locationServicesStatus.isLocationPermissionOk();
            }
        }).count().map(new io.reactivex.functions.Function<java.lang.Long, java.lang.Boolean>() { // from class: com.polidea.rxandroidble2.internal.util.ClientStateObservable.1
            @Override // io.reactivex.functions.Function
            public java.lang.Boolean apply(java.lang.Long l) {
                return java.lang.Boolean.valueOf(l.longValue() == 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> checkAdapterAndServicesState(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable, final io.reactivex.Observable<java.lang.Boolean> observable2) {
        return observable.startWith(rxBleAdapterWrapper.isBluetoothEnabled() ? com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_ON : com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_OFF).switchMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State>>() { // from class: com.polidea.rxandroidble2.internal.util.ClientStateObservable.3
            @Override // io.reactivex.functions.Function
            public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> apply(com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState bleAdapterState) {
                if (bleAdapterState != com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_ON) {
                    return io.reactivex.Observable.just(com.polidea.rxandroidble2.RxBleClient.State.BLUETOOTH_NOT_ENABLED);
                }
                return observable2.map(new io.reactivex.functions.Function<java.lang.Boolean, com.polidea.rxandroidble2.RxBleClient.State>() { // from class: com.polidea.rxandroidble2.internal.util.ClientStateObservable.3.1
                    @Override // io.reactivex.functions.Function
                    public com.polidea.rxandroidble2.RxBleClient.State apply(java.lang.Boolean bool) {
                        return bool.booleanValue() ? com.polidea.rxandroidble2.RxBleClient.State.READY : com.polidea.rxandroidble2.RxBleClient.State.LOCATION_SERVICES_NOT_ENABLED;
                    }
                });
            }
        });
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super com.polidea.rxandroidble2.RxBleClient.State> observer) {
        if (!this.rxBleAdapterWrapper.hasBluetoothAdapter()) {
            observer.onSubscribe(io.reactivex.disposables.Disposables.empty());
            observer.onComplete();
        } else {
            checkPermissionUntilGranted(this.locationServicesStatus, this.timerScheduler).flatMapObservable(new io.reactivex.functions.Function<java.lang.Boolean, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State>>() { // from class: com.polidea.rxandroidble2.internal.util.ClientStateObservable.4
                @Override // io.reactivex.functions.Function
                public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> apply(java.lang.Boolean bool) {
                    io.reactivex.Observable<com.polidea.rxandroidble2.RxBleClient.State> observableDistinctUntilChanged = com.polidea.rxandroidble2.internal.util.ClientStateObservable.checkAdapterAndServicesState(com.polidea.rxandroidble2.internal.util.ClientStateObservable.this.rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.util.ClientStateObservable.this.bleAdapterStateObservable, com.polidea.rxandroidble2.internal.util.ClientStateObservable.this.locationServicesOkObservable).distinctUntilChanged();
                    return bool.booleanValue() ? observableDistinctUntilChanged.skip(1L) : observableDistinctUntilChanged;
                }
            }).subscribe(observer);
        }
    }
}
