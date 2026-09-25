package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientStateObservable_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.ClientStateObservable> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> bleAdapterStateObservableProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Observable<java.lang.Boolean>> locationServicesOkObservableProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> locationServicesStatusProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> rxBleAdapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> timerSchedulerProvider;

    public ClientStateObservable_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> provider2, bleshadow.javax.inject.Provider<io.reactivex.Observable<java.lang.Boolean>> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider4, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider5) {
        this.rxBleAdapterWrapperProvider = provider;
        this.bleAdapterStateObservableProvider = provider2;
        this.locationServicesOkObservableProvider = provider3;
        this.locationServicesStatusProvider = provider4;
        this.timerSchedulerProvider = provider5;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.ClientStateObservable get() {
        return new com.polidea.rxandroidble2.internal.util.ClientStateObservable(this.rxBleAdapterWrapperProvider.get(), this.bleAdapterStateObservableProvider.get(), this.locationServicesOkObservableProvider.get(), this.locationServicesStatusProvider.get(), this.timerSchedulerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.util.ClientStateObservable_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider, bleshadow.javax.inject.Provider<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>> provider2, bleshadow.javax.inject.Provider<io.reactivex.Observable<java.lang.Boolean>> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> provider4, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider5) {
        return new com.polidea.rxandroidble2.internal.util.ClientStateObservable_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.polidea.rxandroidble2.internal.util.ClientStateObservable newClientStateObservable(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable, io.reactivex.Observable<java.lang.Boolean> observable2, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus, io.reactivex.Scheduler scheduler) {
        return new com.polidea.rxandroidble2.internal.util.ClientStateObservable(rxBleAdapterWrapper, observable, observable2, locationServicesStatus, scheduler);
    }
}
