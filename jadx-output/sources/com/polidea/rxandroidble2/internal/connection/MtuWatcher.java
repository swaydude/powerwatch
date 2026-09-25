package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class MtuWatcher implements com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher, com.polidea.rxandroidble2.internal.connection.MtuProvider, io.reactivex.functions.Consumer<java.lang.Integer> {
    private java.lang.Integer currentMtu;
    private final io.reactivex.Observable<java.lang.Integer> mtuObservable;
    private final io.reactivex.disposables.SerialDisposable serialSubscription = new io.reactivex.disposables.SerialDisposable();

    @bleshadow.javax.inject.Inject
    MtuWatcher(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, @bleshadow.javax.inject.Named("GATT_MTU_MINIMUM") int i) {
        this.mtuObservable = rxBleGattCallback.getOnMtuChanged().retry(new io.reactivex.functions.Predicate<java.lang.Throwable>() { // from class: com.polidea.rxandroidble2.internal.connection.MtuWatcher.1
            @Override // io.reactivex.functions.Predicate
            public boolean test(java.lang.Throwable th) {
                return (th instanceof com.polidea.rxandroidble2.exceptions.BleGattException) && ((com.polidea.rxandroidble2.exceptions.BleGattException) th).getBleGattOperationType() == com.polidea.rxandroidble2.exceptions.BleGattOperationType.ON_MTU_CHANGED;
            }
        });
        this.currentMtu = java.lang.Integer.valueOf(i);
    }

    @Override // com.polidea.rxandroidble2.internal.connection.MtuProvider
    public int getMtu() {
        return this.currentMtu.intValue();
    }

    @Override // com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher
    public void onConnectionSubscribed() {
        this.serialSubscription.set(this.mtuObservable.subscribe(this, io.reactivex.internal.functions.Functions.emptyConsumer()));
    }

    @Override // com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher
    public void onConnectionUnsubscribed() {
        this.serialSubscription.dispose();
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(java.lang.Integer num) {
        this.currentMtu = num;
    }
}
