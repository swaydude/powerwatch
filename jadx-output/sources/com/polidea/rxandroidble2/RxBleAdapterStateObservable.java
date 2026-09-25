package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleAdapterStateObservable extends io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> {
    private final io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> bleAdapterStateObservable;

    public static class BleAdapterState {
        private final boolean isUsable;
        private final java.lang.String stateName;
        public static final com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState STATE_ON = new com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState(true, "STATE_ON");
        public static final com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState STATE_OFF = new com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState(false, "STATE_OFF");
        public static final com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState STATE_TURNING_ON = new com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState(false, "STATE_TURNING_ON");
        public static final com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState STATE_TURNING_OFF = new com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState(false, "STATE_TURNING_OFF");

        private BleAdapterState(boolean z, java.lang.String str) {
            this.isUsable = z;
            this.stateName = str;
        }

        public boolean isUsable() {
            return this.isUsable;
        }

        public java.lang.String toString() {
            return this.stateName;
        }
    }

    @bleshadow.javax.inject.Inject
    public RxBleAdapterStateObservable(final android.content.Context context) {
        this.bleAdapterStateObservable = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState>() { // from class: com.polidea.rxandroidble2.RxBleAdapterStateObservable.1
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final io.reactivex.ObservableEmitter<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observableEmitter) {
                final android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.polidea.rxandroidble2.RxBleAdapterStateObservable.1.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState bleAdapterStateMapToBleAdapterState = com.polidea.rxandroidble2.RxBleAdapterStateObservable.mapToBleAdapterState(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1));
                        com.polidea.rxandroidble2.internal.RxBleLog.i("Adapter state changed: %s", bleAdapterStateMapToBleAdapterState);
                        observableEmitter.onNext(bleAdapterStateMapToBleAdapterState);
                    }
                };
                context.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                observableEmitter.setCancellable(new io.reactivex.functions.Cancellable() { // from class: com.polidea.rxandroidble2.RxBleAdapterStateObservable.1.2
                    @Override // io.reactivex.functions.Cancellable
                    public void cancel() {
                        context.unregisterReceiver(broadcastReceiver);
                    }
                });
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.trampoline()).unsubscribeOn(io.reactivex.schedulers.Schedulers.trampoline()).share();
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> observer) {
        this.bleAdapterStateObservable.subscribe(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState mapToBleAdapterState(int i) {
        switch (i) {
            case 11:
                return com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_TURNING_ON;
            case 12:
                return com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_ON;
            case 13:
                return com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_TURNING_OFF;
            default:
                return com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState.STATE_OFF;
        }
    }
}
