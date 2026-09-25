package com.polidea.rxandroidble2.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class ConnectionSharingAdapter implements io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.RxBleConnection, com.polidea.rxandroidble2.RxBleConnection> {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection>> connectionObservable = new java.util.concurrent.atomic.AtomicReference<>();

    @Override // io.reactivex.ObservableTransformer
    /* JADX INFO: renamed from: apply */
    public io.reactivex.ObservableSource<com.polidea.rxandroidble2.RxBleConnection> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> observable) {
        synchronized (this.connectionObservable) {
            io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> observable2 = this.connectionObservable.get();
            if (observable2 != null) {
                return observable2;
            }
            io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> observableRefCount = observable.doFinally(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.utils.ConnectionSharingAdapter.1
                @Override // io.reactivex.functions.Action
                public void run() {
                    com.polidea.rxandroidble2.utils.ConnectionSharingAdapter.this.connectionObservable.set(null);
                }
            }).replay(1).refCount();
            this.connectionObservable.set(observableRefCount);
            return observableRefCount;
        }
    }
}
