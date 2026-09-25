package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleGattCallback_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> callbackSchedulerProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DisconnectionRouter> disconnectionRouterProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher> nativeCallbackDispatcherProvider;

    public RxBleGattCallback_Factory(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DisconnectionRouter> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher> provider4) {
        this.callbackSchedulerProvider = provider;
        this.bluetoothGattProvider = provider2;
        this.disconnectionRouterProvider = provider3;
        this.nativeCallbackDispatcherProvider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.RxBleGattCallback get() {
        return new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback(this.callbackSchedulerProvider.get(), this.bluetoothGattProvider.get(), this.disconnectionRouterProvider.get(), this.nativeCallbackDispatcherProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.RxBleGattCallback_Factory create(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DisconnectionRouter> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher> provider4) {
        return new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback_Factory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.connection.RxBleGattCallback newRxBleGattCallback(io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider, java.lang.Object obj, java.lang.Object obj2) {
        return new com.polidea.rxandroidble2.internal.connection.RxBleGattCallback(scheduler, bluetoothGattProvider, (com.polidea.rxandroidble2.internal.connection.DisconnectionRouter) obj, (com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher) obj2);
    }
}
