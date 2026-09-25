package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
@bleshadow.dagger.Component(modules = {com.polidea.rxandroidble2.ClientComponent.ClientModule.class})
@com.polidea.rxandroidble2.ClientScope
public interface ClientComponent {

    public interface Builder {
        @bleshadow.dagger.BindsInstance
        com.polidea.rxandroidble2.ClientComponent.Builder applicationContext(android.content.Context context);

        com.polidea.rxandroidble2.ClientComponent build();
    }

    public interface ClientComponentFinalizer {
        void onFinalize();
    }

    com.polidea.rxandroidble2.helpers.LocationServicesOkObservable locationServicesOkObservable();

    com.polidea.rxandroidble2.RxBleClient rxBleClient();

    public static class NamedExecutors {
        public static final java.lang.String BLUETOOTH_CALLBACKS = "executor_bluetooth_callbacks";
        public static final java.lang.String BLUETOOTH_INTERACTION = "executor_bluetooth_interaction";
        public static final java.lang.String CONNECTION_QUEUE = "executor_connection_queue";

        private NamedExecutors() {
        }
    }

    public static class NamedSchedulers {
        public static final java.lang.String BLUETOOTH_CALLBACKS = "bluetooth_callbacks";
        public static final java.lang.String BLUETOOTH_INTERACTION = "bluetooth_interaction";
        public static final java.lang.String COMPUTATION = "computation";
        public static final java.lang.String TIMEOUT = "timeout";

        private NamedSchedulers() {
        }
    }

    public static class PlatformConstants {
        public static final java.lang.String BOOL_IS_ANDROID_WEAR = "android-wear";
        public static final java.lang.String INT_DEVICE_SDK = "device-sdk";
        public static final java.lang.String INT_TARGET_SDK = "target-sdk";

        private PlatformConstants() {
        }
    }

    public static class NamedBooleanObservables {
        public static final java.lang.String LOCATION_SERVICES_OK = "location-ok-boolean-observable";

        private NamedBooleanObservables() {
        }
    }

    public static class BluetoothConstants {
        public static final java.lang.String DISABLE_NOTIFICATION_VALUE = "disable-notification-value";
        public static final java.lang.String ENABLE_INDICATION_VALUE = "enable-indication-value";
        public static final java.lang.String ENABLE_NOTIFICATION_VALUE = "enable-notification-value";

        private BluetoothConstants() {
        }
    }

    @bleshadow.dagger.Module(subcomponents = {com.polidea.rxandroidble2.internal.DeviceComponent.class})
    public static abstract class ClientModule {
        @bleshadow.dagger.Binds
        abstract com.polidea.rxandroidble2.scan.BackgroundScanner bindBackgroundScanner(com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl backgroundScannerImpl);

        @bleshadow.dagger.Binds
        @com.polidea.rxandroidble2.ClientScope
        abstract com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue bindClientOperationQueue(com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl clientOperationQueueImpl);

        @bleshadow.dagger.Binds
        @com.polidea.rxandroidble2.ClientScope
        abstract com.polidea.rxandroidble2.RxBleClient bindRxBleClient(com.polidea.rxandroidble2.RxBleClientImpl rxBleClientImpl);

        @bleshadow.dagger.Binds
        abstract io.reactivex.Observable<com.polidea.rxandroidble2.RxBleAdapterStateObservable.BleAdapterState> bindStateObs(com.polidea.rxandroidble2.RxBleAdapterStateObservable rxBleAdapterStateObservable);

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT)
        @bleshadow.dagger.Binds
        abstract io.reactivex.Scheduler bindTimeoutScheduler(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.COMPUTATION) io.reactivex.Scheduler scheduler);

        @bleshadow.dagger.Binds
        abstract io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.scan.ScanResult> provideScanResultMapper(com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter internalToExternalScanResultConverter);

        @bleshadow.dagger.Provides
        static android.bluetooth.BluetoothManager provideBluetoothManager(android.content.Context context) {
            return (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        }

        @bleshadow.dagger.Provides
        static android.bluetooth.BluetoothAdapter provideBluetoothAdapter() {
            return android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.COMPUTATION)
        @bleshadow.dagger.Provides
        static io.reactivex.Scheduler provideComputationScheduler() {
            return io.reactivex.schedulers.Schedulers.computation();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK)
        @bleshadow.dagger.Provides
        static int provideDeviceSdk() {
            return android.os.Build.VERSION.SDK_INT;
        }

        @bleshadow.dagger.Provides
        static android.content.ContentResolver provideContentResolver(android.content.Context context) {
            return context.getContentResolver();
        }

        @bleshadow.dagger.Provides
        static com.polidea.rxandroidble2.internal.util.LocationServicesStatus provideLocationServicesStatus(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK) int i, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23> provider2) {
            if (i < 23) {
                return provider.get();
            }
            return provider2.get();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedBooleanObservables.LOCATION_SERVICES_OK)
        @bleshadow.dagger.Provides
        static io.reactivex.Observable<java.lang.Boolean> provideLocationServicesOkObservable(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK) int i, com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory locationServicesOkObservableApi23Factory) {
            if (i < 23) {
                return com.polidea.rxandroidble2.internal.util.ObservableUtil.justOnNext(true);
            }
            return locationServicesOkObservableApi23Factory.get();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.CONNECTION_QUEUE)
        @com.polidea.rxandroidble2.ClientScope
        @bleshadow.dagger.Provides
        static java.util.concurrent.ExecutorService provideConnectionQueueExecutorService() {
            return java.util.concurrent.Executors.newCachedThreadPool();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.BLUETOOTH_INTERACTION)
        @com.polidea.rxandroidble2.ClientScope
        @bleshadow.dagger.Provides
        static java.util.concurrent.ExecutorService provideBluetoothInteractionExecutorService() {
            return java.util.concurrent.Executors.newSingleThreadExecutor();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.BLUETOOTH_CALLBACKS)
        @com.polidea.rxandroidble2.ClientScope
        @bleshadow.dagger.Provides
        static java.util.concurrent.ExecutorService provideBluetoothCallbacksExecutorService() {
            return java.util.concurrent.Executors.newSingleThreadExecutor();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION)
        @com.polidea.rxandroidble2.ClientScope
        @bleshadow.dagger.Provides
        static io.reactivex.Scheduler provideBluetoothInteractionScheduler(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.BLUETOOTH_INTERACTION) java.util.concurrent.ExecutorService executorService) {
            return io.reactivex.schedulers.Schedulers.from(executorService);
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_CALLBACKS)
        @com.polidea.rxandroidble2.ClientScope
        @bleshadow.dagger.Provides
        static io.reactivex.Scheduler provideBluetoothCallbacksScheduler(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.BLUETOOTH_CALLBACKS) java.util.concurrent.ExecutorService executorService) {
            return io.reactivex.schedulers.Schedulers.from(executorService);
        }

        @bleshadow.dagger.Provides
        static com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer provideFinalizationCloseable(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.BLUETOOTH_INTERACTION) final java.util.concurrent.ExecutorService executorService, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.BLUETOOTH_CALLBACKS) final java.util.concurrent.ExecutorService executorService2, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedExecutors.CONNECTION_QUEUE) final java.util.concurrent.ExecutorService executorService3) {
            return new com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer() { // from class: com.polidea.rxandroidble2.ClientComponent.ClientModule.1
                @Override // com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer
                public void onFinalize() {
                    executorService.shutdown();
                    executorService2.shutdown();
                    executorService3.shutdown();
                }
            };
        }

        @bleshadow.dagger.Provides
        static android.location.LocationManager provideLocationManager(android.content.Context context) {
            return (android.location.LocationManager) context.getSystemService(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_TARGET_SDK)
        @bleshadow.dagger.Provides
        static int provideTargetSdk(android.content.Context context) {
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
            } catch (java.lang.Throwable unused) {
                return Integer.MAX_VALUE;
            }
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.BOOL_IS_ANDROID_WEAR)
        @bleshadow.dagger.Provides
        static boolean provideIsAndroidWear(android.content.Context context, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK) int i) {
            return i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        }

        @com.polidea.rxandroidble2.ClientScope
        @bleshadow.dagger.Provides
        static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder provideScanSetupProvider(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK) int i, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23> provider3) {
            if (i < 21) {
                return provider.get();
            }
            if (i < 23) {
                return provider2.get();
            }
            return provider3.get();
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.BluetoothConstants.ENABLE_NOTIFICATION_VALUE)
        @bleshadow.dagger.Provides
        static byte[] provideEnableNotificationValue() {
            return android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.BluetoothConstants.ENABLE_INDICATION_VALUE)
        @bleshadow.dagger.Provides
        static byte[] provideEnableIndicationValue() {
            return android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        }

        @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.BluetoothConstants.DISABLE_NOTIFICATION_VALUE)
        @bleshadow.dagger.Provides
        static byte[] provideDisableNotificationValue() {
            return android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }

        @bleshadow.dagger.Provides
        static com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier provideScanPreconditionVerifier(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.PlatformConstants.INT_DEVICE_SDK) int i, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24> provider2) {
            if (i < 24) {
                return provider.get();
            }
            return provider2.get();
        }
    }
}
