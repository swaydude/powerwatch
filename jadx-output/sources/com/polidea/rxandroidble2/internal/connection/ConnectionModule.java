package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@bleshadow.dagger.Module
public abstract class ConnectionModule {
    public static final java.lang.String OPERATION_TIMEOUT = "operation-timeout";

    @bleshadow.javax.inject.Named("GATT_WRITE_MTU_OVERHEAD")
    @bleshadow.dagger.Provides
    static int gattWriteMtuOverhead() {
        return 3;
    }

    @bleshadow.javax.inject.Named("GATT_MTU_MINIMUM")
    @bleshadow.dagger.Provides
    static int minimumMtu() {
        return 23;
    }

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueue bindConnectionOperationQueue(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl connectionOperationQueueImpl);

    @bleshadow.dagger.Binds
    @bleshadow.dagger.multibindings.IntoSet
    abstract com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher bindConnectionQueueSubscriptionWatcher(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl connectionOperationQueueImpl);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.internal.connection.MtuProvider bindCurrentMtuProvider(com.polidea.rxandroidble2.internal.connection.MtuWatcher mtuWatcher);

    @bleshadow.dagger.Binds
    @bleshadow.dagger.multibindings.IntoSet
    abstract com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher bindDisconnectActionSubscriptionWatcher(com.polidea.rxandroidble2.internal.connection.DisconnectAction disconnectAction);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.internal.connection.DisconnectionRouterInput bindDisconnectionRouterInput(com.polidea.rxandroidble2.internal.connection.DisconnectionRouter disconnectionRouter);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.internal.connection.DisconnectionRouterOutput bindDisconnectionRouterOutput(com.polidea.rxandroidble2.internal.connection.DisconnectionRouter disconnectionRouter);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder bindLongWriteOperationBuilder(com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl longWriteOperationBuilderImpl);

    @bleshadow.dagger.Binds
    @bleshadow.dagger.multibindings.IntoSet
    abstract com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher bindMtuWatcherSubscriptionWatcher(com.polidea.rxandroidble2.internal.connection.MtuWatcher mtuWatcher);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.internal.operations.OperationsProvider bindOperationsProvider(com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl operationsProviderImpl);

    @bleshadow.dagger.Binds
    abstract com.polidea.rxandroidble2.RxBleConnection bindRxBleConnection(com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl rxBleConnectionImpl);

    @bleshadow.javax.inject.Named("operation-timeout")
    @bleshadow.dagger.Provides
    static com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration providesOperationTimeoutConf(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT) io.reactivex.Scheduler scheduler, com.polidea.rxandroidble2.Timeout timeout) {
        return new com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration(timeout.timeout, timeout.timeUnit, scheduler);
    }

    @bleshadow.dagger.Provides
    static com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler provideIllegalOperationHandler(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.connection.ConnectionComponent.NamedBooleans.SUPPRESS_OPERATION_CHECKS) boolean z, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler> provider2) {
        if (z) {
            return provider.get();
        }
        return provider2.get();
    }

    @bleshadow.dagger.Provides
    static com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser provideCharacteristicPropertiesParser() {
        return new com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser(1, 2, 4, 8, 16, 32, 64);
    }

    @bleshadow.dagger.Provides
    static android.bluetooth.BluetoothGatt provideBluetoothGatt(com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider) {
        return bluetoothGattProvider.getBluetoothGatt();
    }
}
