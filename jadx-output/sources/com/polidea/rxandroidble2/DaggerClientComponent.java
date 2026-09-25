package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class DaggerClientComponent implements com.polidea.rxandroidble2.ClientComponent {
    private com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter_Factory androidScanObjectsConverterProvider;
    private android.content.Context applicationContext;
    private bleshadow.javax.inject.Provider<android.content.Context> applicationContextProvider;
    private com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl_Factory backgroundScannerImplProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueue> bindClientOperationQueueProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.RxBleClient> bindRxBleClientProvider;
    private com.polidea.rxandroidble2.internal.util.CheckerLocationPermission_Factory checkerLocationPermissionProvider;
    private com.polidea.rxandroidble2.internal.util.CheckerLocationProvider_Factory checkerLocationProvider;
    private com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl_Factory clientOperationQueueImplProvider;
    private com.polidea.rxandroidble2.internal.util.ClientStateObservable_Factory clientStateObservableProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> deviceComponentBuilderProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.cache.DeviceComponentCache> deviceComponentCacheProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator> internalScanResultCreatorProvider;
    private com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter_Factory internalToExternalScanResultConverterProvider;
    private com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory_Factory locationServicesOkObservableApi23FactoryProvider;
    private com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23_Factory locationServicesStatusApi23Provider;
    private bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provideBluetoothCallbacksExecutorServiceProvider;
    private bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provideBluetoothCallbacksSchedulerProvider;
    private bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provideBluetoothInteractionExecutorServiceProvider;
    private bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provideBluetoothInteractionSchedulerProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothManagerFactory provideBluetoothManagerProvider;
    private bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provideConnectionQueueExecutorServiceProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideContentResolverFactory provideContentResolverProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideFinalizationCloseableFactory provideFinalizationCloseableProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideIsAndroidWearFactory provideIsAndroidWearProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationManagerFactory provideLocationManagerProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory provideLocationServicesOkObservableProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesStatusFactory provideLocationServicesStatusProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanPreconditionVerifierFactory provideScanPreconditionVerifierProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder> provideScanSetupProvider;
    private com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideTargetSdkFactory provideTargetSdkProvider;
    private com.polidea.rxandroidble2.RxBleAdapterStateObservable_Factory rxBleAdapterStateObservableProvider;
    private com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper_Factory rxBleAdapterWrapperProvider;
    private com.polidea.rxandroidble2.RxBleClientImpl_Factory rxBleClientImplProvider;
    private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> rxBleDeviceProvider;
    private com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18_Factory scanPreconditionsVerifierApi18Provider;
    private com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24_Factory scanPreconditionsVerifierApi24Provider;
    private com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator_Factory scanSettingsEmulatorProvider;
    private com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18_Factory scanSetupBuilderImplApi18Provider;
    private com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21_Factory scanSetupBuilderImplApi21Provider;
    private com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23_Factory scanSetupBuilderImplApi23Provider;

    private DaggerClientComponent(com.polidea.rxandroidble2.DaggerClientComponent.Builder builder) {
        initialize(builder);
    }

    public static com.polidea.rxandroidble2.ClientComponent.Builder builder() {
        return new com.polidea.rxandroidble2.DaggerClientComponent.Builder();
    }

    private com.polidea.rxandroidble2.internal.util.LocationServicesStatus getLocationServicesStatus() {
        return com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesStatusFactory.proxyProvideLocationServicesStatus(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideDeviceSdk(), com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18_Factory.create(), this.locationServicesStatusApi23Provider);
    }

    private com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory getLocationServicesOkObservableApi23Factory() {
        return com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory_Factory.newLocationServicesOkObservableApi23Factory(this.applicationContext, getLocationServicesStatus());
    }

    private io.reactivex.Observable<java.lang.Boolean> getNamedObservableOfBoolean() {
        return com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory.proxyProvideLocationServicesOkObservable(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideDeviceSdk(), getLocationServicesOkObservableApi23Factory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper getRxBleAdapterWrapper() {
        return new com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothAdapter());
    }

    private void initialize(com.polidea.rxandroidble2.DaggerClientComponent.Builder builder) {
        this.applicationContext = builder.applicationContext;
        bleshadow.dagger.internal.Factory factoryCreate = bleshadow.dagger.internal.InstanceFactory.create(builder.applicationContext);
        this.applicationContextProvider = factoryCreate;
        this.provideContentResolverProvider = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideContentResolverFactory.create(factoryCreate);
        com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationManagerFactory clientComponent_ClientModule_ProvideLocationManagerFactoryCreate = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationManagerFactory.create(this.applicationContextProvider);
        this.provideLocationManagerProvider = clientComponent_ClientModule_ProvideLocationManagerFactoryCreate;
        this.checkerLocationProvider = com.polidea.rxandroidble2.internal.util.CheckerLocationProvider_Factory.create(this.provideContentResolverProvider, clientComponent_ClientModule_ProvideLocationManagerFactoryCreate);
        this.checkerLocationPermissionProvider = com.polidea.rxandroidble2.internal.util.CheckerLocationPermission_Factory.create(this.applicationContextProvider);
        this.provideTargetSdkProvider = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideTargetSdkFactory.create(this.applicationContextProvider);
        com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideIsAndroidWearFactory clientComponent_ClientModule_ProvideIsAndroidWearFactoryCreate = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideIsAndroidWearFactory.create(this.applicationContextProvider, com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory.create());
        this.provideIsAndroidWearProvider = clientComponent_ClientModule_ProvideIsAndroidWearFactoryCreate;
        this.locationServicesStatusApi23Provider = com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23_Factory.create(this.checkerLocationProvider, this.checkerLocationPermissionProvider, this.provideTargetSdkProvider, clientComponent_ClientModule_ProvideIsAndroidWearFactoryCreate);
        this.rxBleAdapterWrapperProvider = com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper_Factory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothAdapterFactory.create());
        bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionExecutorServiceFactory.create());
        this.provideBluetoothInteractionExecutorServiceProvider = provider;
        bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider2 = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory.create(provider));
        this.provideBluetoothInteractionSchedulerProvider = provider2;
        com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl_Factory clientOperationQueueImpl_FactoryCreate = com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl_Factory.create(provider2);
        this.clientOperationQueueImplProvider = clientOperationQueueImpl_FactoryCreate;
        this.bindClientOperationQueueProvider = bleshadow.dagger.internal.DoubleCheck.provider(clientOperationQueueImpl_FactoryCreate);
        this.rxBleAdapterStateObservableProvider = com.polidea.rxandroidble2.RxBleAdapterStateObservable_Factory.create(this.applicationContextProvider);
        com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesStatusFactory clientComponent_ClientModule_ProvideLocationServicesStatusFactoryCreate = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesStatusFactory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory.create(), com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18_Factory.create(), this.locationServicesStatusApi23Provider);
        this.provideLocationServicesStatusProvider = clientComponent_ClientModule_ProvideLocationServicesStatusFactoryCreate;
        this.locationServicesOkObservableApi23FactoryProvider = com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory_Factory.create(this.applicationContextProvider, clientComponent_ClientModule_ProvideLocationServicesStatusFactoryCreate);
        com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory clientComponent_ClientModule_ProvideLocationServicesOkObservableFactoryCreate = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory.create(), this.locationServicesOkObservableApi23FactoryProvider);
        this.provideLocationServicesOkObservableProvider = clientComponent_ClientModule_ProvideLocationServicesOkObservableFactoryCreate;
        this.clientStateObservableProvider = com.polidea.rxandroidble2.internal.util.ClientStateObservable_Factory.create(this.rxBleAdapterWrapperProvider, this.rxBleAdapterStateObservableProvider, clientComponent_ClientModule_ProvideLocationServicesOkObservableFactoryCreate, this.provideLocationServicesStatusProvider, com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.create());
        this.deviceComponentCacheProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.cache.DeviceComponentCache_Factory.create());
        bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> provider3 = new bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder>() { // from class: com.polidea.rxandroidble2.DaggerClientComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bleshadow.javax.inject.Provider
            public com.polidea.rxandroidble2.internal.DeviceComponent.Builder get() {
                return new com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentBuilder();
            }
        };
        this.deviceComponentBuilderProvider = provider3;
        this.rxBleDeviceProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.RxBleDeviceProvider_Factory.create(this.deviceComponentCacheProvider, provider3));
        this.internalScanResultCreatorProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator_Factory.create(com.polidea.rxandroidble2.internal.util.UUIDUtil_Factory.create()));
        com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator_Factory scanSettingsEmulator_FactoryCreate = com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator_Factory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.create());
        this.scanSettingsEmulatorProvider = scanSettingsEmulator_FactoryCreate;
        this.scanSetupBuilderImplApi18Provider = com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18_Factory.create(this.rxBleAdapterWrapperProvider, this.internalScanResultCreatorProvider, scanSettingsEmulator_FactoryCreate);
        com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter_Factory androidScanObjectsConverter_FactoryCreate = com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter_Factory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory.create());
        this.androidScanObjectsConverterProvider = androidScanObjectsConverter_FactoryCreate;
        this.scanSetupBuilderImplApi21Provider = com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21_Factory.create(this.rxBleAdapterWrapperProvider, this.internalScanResultCreatorProvider, this.scanSettingsEmulatorProvider, androidScanObjectsConverter_FactoryCreate);
        this.scanSetupBuilderImplApi23Provider = com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23_Factory.create(this.rxBleAdapterWrapperProvider, this.internalScanResultCreatorProvider, this.androidScanObjectsConverterProvider);
        this.provideScanSetupProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanSetupProviderFactory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory.create(), this.scanSetupBuilderImplApi18Provider, this.scanSetupBuilderImplApi21Provider, this.scanSetupBuilderImplApi23Provider));
        com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18_Factory scanPreconditionsVerifierApi18_FactoryCreate = com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18_Factory.create(this.rxBleAdapterWrapperProvider, this.provideLocationServicesStatusProvider);
        this.scanPreconditionsVerifierApi18Provider = scanPreconditionsVerifierApi18_FactoryCreate;
        this.scanPreconditionsVerifierApi24Provider = com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24_Factory.create(scanPreconditionsVerifierApi18_FactoryCreate, com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.create());
        this.provideScanPreconditionVerifierProvider = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanPreconditionVerifierFactory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory.create(), this.scanPreconditionsVerifierApi18Provider, this.scanPreconditionsVerifierApi24Provider);
        this.internalToExternalScanResultConverterProvider = com.polidea.rxandroidble2.internal.scan.InternalToExternalScanResultConverter_Factory.create(this.rxBleDeviceProvider);
        this.provideBluetoothCallbacksExecutorServiceProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothCallbacksExecutorServiceFactory.create());
        bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider4 = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideConnectionQueueExecutorServiceFactory.create());
        this.provideConnectionQueueExecutorServiceProvider = provider4;
        this.provideFinalizationCloseableProvider = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideFinalizationCloseableFactory.create(this.provideBluetoothInteractionExecutorServiceProvider, this.provideBluetoothCallbacksExecutorServiceProvider, provider4);
        this.backgroundScannerImplProvider = com.polidea.rxandroidble2.internal.scan.BackgroundScannerImpl_Factory.create(this.rxBleAdapterWrapperProvider, this.androidScanObjectsConverterProvider, this.internalScanResultCreatorProvider, this.internalToExternalScanResultConverterProvider);
        com.polidea.rxandroidble2.RxBleClientImpl_Factory rxBleClientImpl_FactoryCreate = com.polidea.rxandroidble2.RxBleClientImpl_Factory.create(this.rxBleAdapterWrapperProvider, this.bindClientOperationQueueProvider, this.rxBleAdapterStateObservableProvider, com.polidea.rxandroidble2.internal.util.UUIDUtil_Factory.create(), this.provideLocationServicesStatusProvider, this.clientStateObservableProvider, this.rxBleDeviceProvider, this.provideScanSetupProvider, this.provideScanPreconditionVerifierProvider, this.internalToExternalScanResultConverterProvider, this.provideBluetoothInteractionSchedulerProvider, this.provideFinalizationCloseableProvider, this.backgroundScannerImplProvider);
        this.rxBleClientImplProvider = rxBleClientImpl_FactoryCreate;
        this.bindRxBleClientProvider = bleshadow.dagger.internal.DoubleCheck.provider(rxBleClientImpl_FactoryCreate);
        this.provideBluetoothCallbacksSchedulerProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothCallbacksSchedulerFactory.create(this.provideBluetoothCallbacksExecutorServiceProvider));
        this.provideBluetoothManagerProvider = com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothManagerFactory.create(this.applicationContextProvider);
    }

    @Override // com.polidea.rxandroidble2.ClientComponent
    public com.polidea.rxandroidble2.helpers.LocationServicesOkObservable locationServicesOkObservable() {
        return com.polidea.rxandroidble2.helpers.LocationServicesOkObservable_Factory.newLocationServicesOkObservable(getNamedObservableOfBoolean());
    }

    @Override // com.polidea.rxandroidble2.ClientComponent
    public com.polidea.rxandroidble2.RxBleClient rxBleClient() {
        return this.bindRxBleClientProvider.get();
    }

    private static final class Builder implements com.polidea.rxandroidble2.ClientComponent.Builder {
        private android.content.Context applicationContext;

        private Builder() {
        }

        @Override // com.polidea.rxandroidble2.ClientComponent.Builder
        public com.polidea.rxandroidble2.ClientComponent build() {
            if (this.applicationContext == null) {
                throw new java.lang.IllegalStateException(android.content.Context.class.getCanonicalName() + " must be set");
            }
            return new com.polidea.rxandroidble2.DaggerClientComponent(this);
        }

        @Override // com.polidea.rxandroidble2.ClientComponent.Builder
        public com.polidea.rxandroidble2.DaggerClientComponent.Builder applicationContext(android.content.Context context) {
            this.applicationContext = (android.content.Context) bleshadow.dagger.internal.Preconditions.checkNotNull(context);
            return this;
        }
    }

    private final class DeviceComponentBuilder implements com.polidea.rxandroidble2.internal.DeviceComponent.Builder {
        private java.lang.String macAddress;

        private DeviceComponentBuilder() {
        }

        @Override // com.polidea.rxandroidble2.internal.DeviceComponent.Builder
        public com.polidea.rxandroidble2.internal.DeviceComponent build() {
            if (this.macAddress == null) {
                throw new java.lang.IllegalStateException(java.lang.String.class.getCanonicalName() + " must be set");
            }
            return new com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl(this);
        }

        @Override // com.polidea.rxandroidble2.internal.DeviceComponent.Builder
        public com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentBuilder macAddress(java.lang.String str) {
            this.macAddress = (java.lang.String) bleshadow.dagger.internal.Preconditions.checkNotNull(str);
            return this;
        }
    }

    private final class DeviceComponentImpl implements com.polidea.rxandroidble2.internal.DeviceComponent {
        private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder> connectionComponentBuilderProvider;
        private com.polidea.rxandroidble2.internal.connection.ConnectorImpl_Factory connectorImplProvider;
        private java.lang.String macAddress;
        private bleshadow.javax.inject.Provider<java.lang.String> macAddressProvider;
        private com.polidea.rxandroidble2.internal.DeviceModule_ProvideBluetoothDeviceFactory provideBluetoothDeviceProvider;
        private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener> provideConnectionStateChangeListenerProvider;
        private bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> provideConnectionStateRelayProvider;
        private com.polidea.rxandroidble2.internal.DeviceModule_ProvidesDisconnectTimeoutConfFactory providesDisconnectTimeoutConfProvider;
        private bleshadow.javax.inject.Provider rxBleDeviceImplProvider;

        private DeviceComponentImpl(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentBuilder deviceComponentBuilder) {
            initialize(deviceComponentBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public android.bluetooth.BluetoothDevice getBluetoothDevice() {
            return com.polidea.rxandroidble2.internal.DeviceModule_ProvideBluetoothDeviceFactory.proxyProvideBluetoothDevice(this.macAddress, com.polidea.rxandroidble2.DaggerClientComponent.this.getRxBleAdapterWrapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration getNamedTimeoutConfiguration() {
            return com.polidea.rxandroidble2.internal.DeviceModule_ProvidesConnectTimeoutConfFactory.proxyProvidesConnectTimeoutConf(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.proxyProvideComputationScheduler());
        }

        private void initialize(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentBuilder deviceComponentBuilder) {
            bleshadow.dagger.internal.Factory factoryCreate = bleshadow.dagger.internal.InstanceFactory.create(deviceComponentBuilder.macAddress);
            this.macAddressProvider = factoryCreate;
            this.provideBluetoothDeviceProvider = com.polidea.rxandroidble2.internal.DeviceModule_ProvideBluetoothDeviceFactory.create(factoryCreate, com.polidea.rxandroidble2.DaggerClientComponent.this.rxBleAdapterWrapperProvider);
            this.connectionComponentBuilderProvider = new bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder>() { // from class: com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bleshadow.javax.inject.Provider
                public com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder get() {
                    return new com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentBuilder();
                }
            };
            this.connectorImplProvider = com.polidea.rxandroidble2.internal.connection.ConnectorImpl_Factory.create(com.polidea.rxandroidble2.DaggerClientComponent.this.bindClientOperationQueueProvider, this.connectionComponentBuilderProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothCallbacksSchedulerProvider);
            bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> provider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateRelayFactory.create());
            this.provideConnectionStateRelayProvider = provider;
            this.rxBleDeviceImplProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.RxBleDeviceImpl_Factory.create(this.provideBluetoothDeviceProvider, this.connectorImplProvider, provider));
            this.macAddress = deviceComponentBuilder.macAddress;
            this.provideConnectionStateChangeListenerProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.DeviceModule_ProvideConnectionStateChangeListenerFactory.create(this.provideConnectionStateRelayProvider));
            this.providesDisconnectTimeoutConfProvider = com.polidea.rxandroidble2.internal.DeviceModule_ProvidesDisconnectTimeoutConfFactory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.create());
        }

        @Override // com.polidea.rxandroidble2.internal.DeviceComponent
        public com.polidea.rxandroidble2.RxBleDevice provideDevice() {
            return (com.polidea.rxandroidble2.RxBleDevice) this.rxBleDeviceImplProvider.get();
        }

        private final class ConnectionComponentBuilder implements com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder {
            private java.lang.Boolean autoConnect;
            private com.polidea.rxandroidble2.Timeout operationTimeout;
            private java.lang.Boolean suppressOperationChecks;

            private ConnectionComponentBuilder() {
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder
            public com.polidea.rxandroidble2.internal.connection.ConnectionComponent build() {
                if (this.autoConnect == null) {
                    throw new java.lang.IllegalStateException(java.lang.Boolean.class.getCanonicalName() + " must be set");
                }
                if (this.suppressOperationChecks == null) {
                    throw new java.lang.IllegalStateException(java.lang.Boolean.class.getCanonicalName() + " must be set");
                }
                if (this.operationTimeout == null) {
                    throw new java.lang.IllegalStateException(com.polidea.rxandroidble2.Timeout.class.getCanonicalName() + " must be set");
                }
                return new com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentImpl(this);
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder
            public com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentBuilder autoConnect(boolean z) {
                this.autoConnect = (java.lang.Boolean) bleshadow.dagger.internal.Preconditions.checkNotNull(java.lang.Boolean.valueOf(z));
                return this;
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder
            public com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentBuilder suppressOperationChecks(boolean z) {
                this.suppressOperationChecks = (java.lang.Boolean) bleshadow.dagger.internal.Preconditions.checkNotNull(java.lang.Boolean.valueOf(z));
                return this;
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent.Builder
            public com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentBuilder operationTimeout(com.polidea.rxandroidble2.Timeout timeout) {
                this.operationTimeout = (com.polidea.rxandroidble2.Timeout) bleshadow.dagger.internal.Preconditions.checkNotNull(timeout);
                return this;
            }
        }

        private final class ConnectionComponentImpl implements com.polidea.rxandroidble2.internal.connection.ConnectionComponent {
            private java.lang.Boolean autoConnect;
            private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> bluetoothGattProvider;
            private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl> connectionOperationQueueImplProvider;
            private bleshadow.javax.inject.Provider descriptorWriterProvider;
            private bleshadow.javax.inject.Provider disconnectActionProvider;
            private com.polidea.rxandroidble2.internal.operations.DisconnectOperation_Factory disconnectOperationProvider;
            private bleshadow.javax.inject.Provider disconnectionRouterProvider;
            private com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker_Factory illegalOperationCheckerProvider;
            private com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator_Factory illegalOperationMessageCreatorProvider;
            private com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices_Factory loggerUtilBluetoothServicesProvider;
            private com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler_Factory loggingIllegalOperationHandlerProvider;
            private com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl_Factory longWriteOperationBuilderImplProvider;
            private bleshadow.javax.inject.Provider mtuBasedPayloadSizeLimitProvider;
            private bleshadow.javax.inject.Provider mtuWatcherProvider;
            private bleshadow.javax.inject.Provider notificationAndIndicationManagerProvider;
            private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.Timeout> operationTimeoutProvider;
            private com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl_Factory operationsProviderImplProvider;
            private com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideBluetoothGattFactory provideBluetoothGattProvider;
            private com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideIllegalOperationHandlerFactory provideIllegalOperationHandlerProvider;
            private com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvidesOperationTimeoutConfFactory providesOperationTimeoutConfProvider;
            private com.polidea.rxandroidble2.internal.operations.ReadRssiOperation_Factory readRssiOperationProvider;
            private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl> rxBleConnectionImplProvider;
            private bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> rxBleGattCallbackProvider;
            private bleshadow.javax.inject.Provider serviceDiscoveryManagerProvider;
            private bleshadow.javax.inject.Provider<java.lang.Boolean> suppressOperationChecksProvider;
            private com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler_Factory throwingIllegalOperationHandlerProvider;

            private ConnectionComponentImpl(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentBuilder connectionComponentBuilder) {
                initialize(connectionComponentBuilder);
            }

            private com.polidea.rxandroidble2.internal.util.BleConnectionCompat getBleConnectionCompat() {
                return new com.polidea.rxandroidble2.internal.util.BleConnectionCompat(com.polidea.rxandroidble2.DaggerClientComponent.this.applicationContext);
            }

            private void initialize(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.ConnectionComponentBuilder connectionComponentBuilder) {
                this.bluetoothGattProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider_Factory.create());
                this.disconnectionRouterProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.DisconnectionRouter_Factory.create(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.macAddressProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.rxBleAdapterWrapperProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.rxBleAdapterStateObservableProvider));
                this.rxBleGattCallbackProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback_Factory.create(com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothCallbacksSchedulerProvider, this.bluetoothGattProvider, this.disconnectionRouterProvider, com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher_Factory.create()));
                this.autoConnect = connectionComponentBuilder.autoConnect;
                this.connectionOperationQueueImplProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.serialization.ConnectionOperationQueueImpl_Factory.create(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.macAddressProvider, this.disconnectionRouterProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideConnectionQueueExecutorServiceProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothInteractionSchedulerProvider));
                this.provideBluetoothGattProvider = com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideBluetoothGattFactory.create(this.bluetoothGattProvider);
                this.loggerUtilBluetoothServicesProvider = com.polidea.rxandroidble2.internal.logger.LoggerUtilBluetoothServices_Factory.create(com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideCharacteristicPropertiesParserFactory.create());
                this.operationTimeoutProvider = bleshadow.dagger.internal.InstanceFactory.create(connectionComponentBuilder.operationTimeout);
                com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvidesOperationTimeoutConfFactory connectionModule_ProvidesOperationTimeoutConfFactoryCreate = com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvidesOperationTimeoutConfFactory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.create(), this.operationTimeoutProvider);
                this.providesOperationTimeoutConfProvider = connectionModule_ProvidesOperationTimeoutConfFactoryCreate;
                this.readRssiOperationProvider = com.polidea.rxandroidble2.internal.operations.ReadRssiOperation_Factory.create(this.rxBleGattCallbackProvider, this.provideBluetoothGattProvider, connectionModule_ProvidesOperationTimeoutConfFactoryCreate);
                com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl_Factory operationsProviderImpl_FactoryCreate = com.polidea.rxandroidble2.internal.operations.OperationsProviderImpl_Factory.create(this.rxBleGattCallbackProvider, this.provideBluetoothGattProvider, this.loggerUtilBluetoothServicesProvider, this.providesOperationTimeoutConfProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothInteractionSchedulerProvider, com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory.create(), this.readRssiOperationProvider);
                this.operationsProviderImplProvider = operationsProviderImpl_FactoryCreate;
                this.serviceDiscoveryManagerProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.ServiceDiscoveryManager_Factory.create(this.connectionOperationQueueImplProvider, this.provideBluetoothGattProvider, operationsProviderImpl_FactoryCreate));
                this.descriptorWriterProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.DescriptorWriter_Factory.create(this.connectionOperationQueueImplProvider, this.operationsProviderImplProvider));
                this.notificationAndIndicationManagerProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager_Factory.create(com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableNotificationValueFactory.create(), com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableIndicationValueFactory.create(), com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDisableNotificationValueFactory.create(), this.provideBluetoothGattProvider, this.rxBleGattCallbackProvider, this.descriptorWriterProvider));
                this.mtuWatcherProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.MtuWatcher_Factory.create(this.rxBleGattCallbackProvider, com.polidea.rxandroidble2.internal.connection.ConnectionModule_MinimumMtuFactory.create()));
                bleshadow.dagger.internal.DelegateFactory delegateFactory = new bleshadow.dagger.internal.DelegateFactory();
                this.rxBleConnectionImplProvider = delegateFactory;
                bleshadow.javax.inject.Provider provider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.MtuBasedPayloadSizeLimit_Factory.create(delegateFactory, com.polidea.rxandroidble2.internal.connection.ConnectionModule_GattWriteMtuOverheadFactory.create()));
                this.mtuBasedPayloadSizeLimitProvider = provider;
                this.longWriteOperationBuilderImplProvider = com.polidea.rxandroidble2.internal.connection.LongWriteOperationBuilderImpl_Factory.create(this.connectionOperationQueueImplProvider, provider, this.rxBleConnectionImplProvider, this.operationsProviderImplProvider);
                this.suppressOperationChecksProvider = bleshadow.dagger.internal.InstanceFactory.create(connectionComponentBuilder.suppressOperationChecks);
                com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator_Factory illegalOperationMessageCreator_FactoryCreate = com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator_Factory.create(com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideCharacteristicPropertiesParserFactory.create());
                this.illegalOperationMessageCreatorProvider = illegalOperationMessageCreator_FactoryCreate;
                this.loggingIllegalOperationHandlerProvider = com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler_Factory.create(illegalOperationMessageCreator_FactoryCreate);
                com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler_Factory throwingIllegalOperationHandler_FactoryCreate = com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler_Factory.create(this.illegalOperationMessageCreatorProvider);
                this.throwingIllegalOperationHandlerProvider = throwingIllegalOperationHandler_FactoryCreate;
                com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideIllegalOperationHandlerFactory connectionModule_ProvideIllegalOperationHandlerFactoryCreate = com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideIllegalOperationHandlerFactory.create(this.suppressOperationChecksProvider, this.loggingIllegalOperationHandlerProvider, throwingIllegalOperationHandler_FactoryCreate);
                this.provideIllegalOperationHandlerProvider = connectionModule_ProvideIllegalOperationHandlerFactoryCreate;
                this.illegalOperationCheckerProvider = com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker_Factory.create(connectionModule_ProvideIllegalOperationHandlerFactoryCreate);
                bleshadow.dagger.internal.DelegateFactory delegateFactory2 = (bleshadow.dagger.internal.DelegateFactory) this.rxBleConnectionImplProvider;
                bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl> provider2 = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.RxBleConnectionImpl_Factory.create(this.connectionOperationQueueImplProvider, this.rxBleGattCallbackProvider, this.provideBluetoothGattProvider, this.serviceDiscoveryManagerProvider, this.notificationAndIndicationManagerProvider, this.mtuWatcherProvider, this.descriptorWriterProvider, this.operationsProviderImplProvider, this.longWriteOperationBuilderImplProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothInteractionSchedulerProvider, this.illegalOperationCheckerProvider));
                this.rxBleConnectionImplProvider = provider2;
                delegateFactory2.setDelegatedProvider(provider2);
                this.disconnectOperationProvider = com.polidea.rxandroidble2.internal.operations.DisconnectOperation_Factory.create(this.rxBleGattCallbackProvider, this.bluetoothGattProvider, com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.macAddressProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothManagerProvider, com.polidea.rxandroidble2.DaggerClientComponent.this.provideBluetoothInteractionSchedulerProvider, com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.providesDisconnectTimeoutConfProvider, com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.provideConnectionStateChangeListenerProvider);
                this.disconnectActionProvider = bleshadow.dagger.internal.DoubleCheck.provider(com.polidea.rxandroidble2.internal.connection.DisconnectAction_Factory.create(com.polidea.rxandroidble2.DaggerClientComponent.this.bindClientOperationQueueProvider, this.disconnectOperationProvider));
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent
            public com.polidea.rxandroidble2.internal.operations.ConnectOperation connectOperation() {
                return com.polidea.rxandroidble2.internal.operations.ConnectOperation_Factory.newConnectOperation(com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.getBluetoothDevice(), getBleConnectionCompat(), this.rxBleGattCallbackProvider.get(), this.bluetoothGattProvider.get(), com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.getNamedTimeoutConfiguration(), this.autoConnect.booleanValue(), (com.polidea.rxandroidble2.internal.connection.ConnectionStateChangeListener) com.polidea.rxandroidble2.DaggerClientComponent.DeviceComponentImpl.this.provideConnectionStateChangeListenerProvider.get());
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent
            public com.polidea.rxandroidble2.RxBleConnection rxBleConnection() {
                return this.rxBleConnectionImplProvider.get();
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent
            public com.polidea.rxandroidble2.internal.connection.RxBleGattCallback gattCallback() {
                return this.rxBleGattCallbackProvider.get();
            }

            @Override // com.polidea.rxandroidble2.internal.connection.ConnectionComponent
            public java.util.Set<com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher> connectionSubscriptionWatchers() {
                return bleshadow.dagger.internal.SetBuilder.newSetBuilder(3).add((com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher) this.mtuWatcherProvider.get()).add((com.polidea.rxandroidble2.internal.connection.ConnectionSubscriptionWatcher) this.disconnectActionProvider.get()).add(this.connectionOperationQueueImplProvider.get()).build();
            }
        }
    }
}
