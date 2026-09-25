package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideScanSetupProviderFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> deviceSdkProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18> scanSetupBuilderProviderForApi18Provider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21> scanSetupBuilderProviderForApi21Provider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23> scanSetupBuilderProviderForApi23Provider;

    public ClientComponent_ClientModule_ProvideScanSetupProviderFactory(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23> provider4) {
        this.deviceSdkProvider = provider;
        this.scanSetupBuilderProviderForApi18Provider = provider2;
        this.scanSetupBuilderProviderForApi21Provider = provider3;
        this.scanSetupBuilderProviderForApi23Provider = provider4;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder get() {
        return (com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideScanSetupProvider(this.deviceSdkProvider.get().intValue(), this.scanSetupBuilderProviderForApi18Provider, this.scanSetupBuilderProviderForApi21Provider, this.scanSetupBuilderProviderForApi23Provider), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanSetupProviderFactory create(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21> provider3, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23> provider4) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanSetupProviderFactory(provider, provider2, provider3, provider4);
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder proxyProvideScanSetupProvider(int i, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi18> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi23> provider3) {
        return (com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideScanSetupProvider(i, provider, provider2, provider3), "Cannot return null from a non-@Nullable @Provides method");
    }
}
