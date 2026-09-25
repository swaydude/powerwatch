package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
@bleshadow.dagger.Module(subcomponents = {com.polidea.rxandroidble2.internal.connection.ConnectionComponent.class})
public abstract class DeviceModule {
    public static final java.lang.String CONNECT_TIMEOUT = "connect-timeout";
    private static final int DEFAULT_CONNECT_TIMEOUT = 35;
    private static final int DEFAULT_DISCONNECT_TIMEOUT = 10;
    private static final int DEFAULT_OPERATION_TIMEOUT = 30;
    public static final java.lang.String DISCONNECT_TIMEOUT = "disconnect-timeout";
    public static final java.lang.String MAC_ADDRESS = "mac-address";
    public static final java.lang.String OPERATION_TIMEOUT = "operation-timeout";

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.internal.connection.Connector bindConnector(com.polidea.rxandroidble2.internal.connection.ConnectorImpl connectorImpl);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.RxBleDevice bindDevice(com.polidea.rxandroidble2.internal.RxBleDeviceImpl rxBleDeviceImpl);

    @bleshadow.dagger.Provides
    static android.bluetooth.BluetoothDevice provideBluetoothDevice(@bleshadow.javax.inject.Named(MAC_ADDRESS) java.lang.String str, com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper) {
        return rxBleAdapterWrapper.getRemoteDevice(str);
    }

    @bleshadow.javax.inject.Named(CONNECT_TIMEOUT)
    @bleshadow.dagger.Provides
    static com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration providesConnectTimeoutConf(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT) io.reactivex.Scheduler scheduler) {
        return new com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration(35L, java.util.concurrent.TimeUnit.SECONDS, scheduler);
    }

    @bleshadow.javax.inject.Named(DISCONNECT_TIMEOUT)
    @bleshadow.dagger.Provides
    static com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration providesDisconnectTimeoutConf(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT) io.reactivex.Scheduler scheduler) {
        return new com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration(10L, java.util.concurrent.TimeUnit.SECONDS, scheduler);
    }

    @com.polidea.rxandroidble2.internal.DeviceScope
    @bleshadow.dagger.Provides
    static com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> provideConnectionStateRelay() {
        return com.jakewharton.rxrelay2.BehaviorRelay.createDefault(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState.DISCONNECTED);
    }

    @com.polidea.rxandroidble2.internal.DeviceScope
    @bleshadow.dagger.Provides
    static com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener provideConnectionStateChangeListener(final com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> behaviorRelay) {
        return new com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener() { // from class: com.polidea.rxandroidble2.internal.DeviceModule.1
            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener
            public void onConnectionStateChange(com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState rxBleConnectionState) {
                behaviorRelay.accept(rxBleConnectionState);
            }
        };
    }
}
