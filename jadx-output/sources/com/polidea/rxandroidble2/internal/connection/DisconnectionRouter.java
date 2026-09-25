package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class DisconnectionRouter implements com.polidea.rxandroidble2.internal.connection.DisconnectionRouterInput, com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput {
    private final com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.exceptions.BleException> bleExceptionBehaviorRelay;
    private final io.reactivex.Observable<java.lang.Object> firstDisconnectionExceptionObs;
    private final io.reactivex.Observable<com.polidea.rxandroidble2.exceptions.BleException> firstDisconnectionValueObs;

    @bleshadow.javax.inject.Inject
    DisconnectionRouter(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.DeviceModule.MAC_ADDRESS) final java.lang.String str, com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable) {
        com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.exceptions.BleException> behaviorRelayCreate = com.jakewharton.rxrelay2.BehaviorRelay.create();
        this.bleExceptionBehaviorRelay = behaviorRelayCreate;
        final io.reactivex.disposables.Disposable disposableSubscribe = awaitAdapterNotUsable(rxBleAdapterWrapper, observable).map(new io.reactivex.functions.Function<java.lang.Boolean, com.polidea.rxandroidble2.exceptions.BleException>() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.3
            @Override // io.reactivex.functions.Function
            public com.polidea.rxandroidble2.exceptions.BleException apply(java.lang.Boolean bool) {
                return com.polidea.rxandroidble2.exceptions.BleDisconnectedException.adapterDisabled(str);
            }
        }).doOnNext(new io.reactivex.functions.Consumer<com.polidea.rxandroidble2.exceptions.BleException>() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.2
            @Override // io.reactivex.functions.Consumer
            public void accept(com.polidea.rxandroidble2.exceptions.BleException bleException) {
                com.polidea.rxandroidble2.internal.RxBleLog.v("An exception received, indicating that the adapter has became unusable.", new java.lang.Object[0]);
            }
        }).subscribe(behaviorRelayCreate, new io.reactivex.functions.Consumer<java.lang.Throwable>() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.1
            @Override // io.reactivex.functions.Consumer
            public void accept(java.lang.Throwable th) {
                com.polidea.rxandroidble2.internal.RxBleLog.e(th, "Failed to monitor adapter state.", new java.lang.Object[0]);
            }
        });
        io.reactivex.Observable<com.polidea.rxandroidble2.exceptions.BleException> observableAutoConnect = behaviorRelayCreate.firstElement().toObservable().doOnTerminate(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.4
            @Override // io.reactivex.functions.Action
            public void run() {
                disposableSubscribe.dispose();
            }
        }).replay().autoConnect(0);
        this.firstDisconnectionValueObs = observableAutoConnect;
        this.firstDisconnectionExceptionObs = observableAutoConnect.flatMap(new io.reactivex.functions.Function<com.polidea.rxandroidble2.exceptions.BleException, io.reactivex.ObservableSource<?>>() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.5
            @Override // io.reactivex.functions.Function
            public io.reactivex.ObservableSource<?> apply(com.polidea.rxandroidble2.exceptions.BleException bleException) {
                return io.reactivex.Observable.error(bleException);
            }
        });
    }

    private static io.reactivex.Observable<java.lang.Boolean> awaitAdapterNotUsable(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observable) {
        return observable.map(new io.reactivex.functions.Function<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState, java.lang.Boolean>() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.7
            @Override // io.reactivex.functions.Function
            public java.lang.Boolean apply(com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState bleAdapterState) {
                return java.lang.Boolean.valueOf(bleAdapterState.isUsable());
            }
        }).startWith(java.lang.Boolean.valueOf(rxBleAdapterWrapper.isBluetoothEnabled())).filter(new io.reactivex.functions.Predicate<java.lang.Boolean>() { // from class: com.polidea.rxandroidble2.internal.connection.DisconnectionRouter.6
            @Override // io.reactivex.functions.Predicate
            public boolean test(java.lang.Boolean bool) {
                return !bool.booleanValue();
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.connection.DisconnectionRouterInput
    public void onDisconnectedException(com.polidea.rxandroidble2.exceptions.BleDisconnectedException bleDisconnectedException) {
        this.bleExceptionBehaviorRelay.accept(bleDisconnectedException);
    }

    @Override // com.polidea.rxandroidble2.internal.connection.DisconnectionRouterInput
    public void onGattConnectionStateException(com.polidea.rxandroidble2.exceptions.BleGattException bleGattException) {
        this.bleExceptionBehaviorRelay.accept(bleGattException);
    }

    @Override // com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput
    public io.reactivex.Observable<com.polidea.rxandroidble2.exceptions.BleException> asValueOnlyObservable() {
        return this.firstDisconnectionValueObs;
    }

    @Override // com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput
    public <T> io.reactivex.Observable<T> asErrorOnlyObservable() {
        return (io.reactivex.Observable<T>) this.firstDisconnectionExceptionObs;
    }
}
