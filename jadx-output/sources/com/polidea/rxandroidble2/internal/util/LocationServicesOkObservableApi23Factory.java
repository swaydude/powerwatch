package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class LocationServicesOkObservableApi23Factory {
    private final android.content.Context context;
    private final com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus;

    @bleshadow.javax.inject.Inject
    LocationServicesOkObservableApi23Factory(android.content.Context context, com.polidea.rxandroidble2.internal.util.LocationServicesStatus locationServicesStatus) {
        this.context = context;
        this.locationServicesStatus = locationServicesStatus;
    }

    public io.reactivex.Observable<java.lang.Boolean> get() {
        return io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<java.lang.Boolean>() { // from class: com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.1
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final io.reactivex.ObservableEmitter<java.lang.Boolean> observableEmitter) {
                boolean zIsLocationProviderOk = com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.this.locationServicesStatus.isLocationProviderOk();
                final android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.1.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context, android.content.Intent intent) {
                        observableEmitter.onNext(java.lang.Boolean.valueOf(com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.this.locationServicesStatus.isLocationProviderOk()));
                    }
                };
                observableEmitter.onNext(java.lang.Boolean.valueOf(zIsLocationProviderOk));
                com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.this.context.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.location.MODE_CHANGED"));
                observableEmitter.setCancellable(new io.reactivex.functions.Cancellable() { // from class: com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.1.2
                    @Override // io.reactivex.functions.Cancellable
                    public void cancel() {
                        com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory.this.context.unregisterReceiver(broadcastReceiver);
                    }
                });
            }
        }).distinctUntilChanged().subscribeOn(io.reactivex.schedulers.Schedulers.trampoline()).unsubscribeOn(io.reactivex.schedulers.Schedulers.trampoline());
    }
}
