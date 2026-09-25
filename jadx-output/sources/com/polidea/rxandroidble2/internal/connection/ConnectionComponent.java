package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
@bleshadow.dagger.Subcomponent(modules = {com.polidea.rxandroidble2.internal.connection.ConnectionModule.class})
public interface ConnectionComponent {

    public interface Builder {
        @bleshadow.dagger.BindsInstance
        com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder autoConnect(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.connection.ConnectionComponent.NamedBooleans.AUTO_CONNECT) boolean z);

        com.polidea.rxandroidble2.internal.connection.ConnectionComponent build();

        @bleshadow.dagger.BindsInstance
        com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder operationTimeout(com.polidea.rxandroidble2.Timeout timeout);

        @bleshadow.dagger.BindsInstance
        com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder suppressOperationChecks(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.internal.connection.ConnectionComponent.NamedBooleans.SUPPRESS_OPERATION_CHECKS) boolean z);
    }

    @com.polidea.rxandroidble2.internal.connection.ConnectionScope
    com.polidea.rxandroidble2.internal.operations.ConnectOperation connectOperation();

    @com.polidea.rxandroidble2.internal.connection.ConnectionScope
    java.util.Set<com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher> connectionSubscriptionWatchers();

    @com.polidea.rxandroidble2.internal.connection.ConnectionScope
    com.polidea.rxandroidble2.internal.connection.RxBleGattCallback gattCallback();

    @com.polidea.rxandroidble2.internal.connection.ConnectionScope
    com.polidea.rxandroidble2.RxBleConnection rxBleConnection();

    public static class NamedBooleans {
        public static final java.lang.String AUTO_CONNECT = "autoConnect";
        public static final java.lang.String SUPPRESS_OPERATION_CHECKS = "suppressOperationChecks";

        private NamedBooleans() {
        }
    }

    public static class NamedInts {
        static final java.lang.String GATT_MTU_MINIMUM = "GATT_MTU_MINIMUM";
        static final java.lang.String GATT_WRITE_MTU_OVERHEAD = "GATT_WRITE_MTU_OVERHEAD";

        private NamedInts() {
        }
    }
}
