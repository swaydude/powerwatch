package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideScanPreconditionVerifierFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> deviceSdkProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> scanPreconditionVerifierForApi18Provider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24> scanPreconditionVerifierForApi24Provider;

    public ClientComponent_ClientModule_ProvideScanPreconditionVerifierFactory(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24> provider3) {
        this.deviceSdkProvider = provider;
        this.scanPreconditionVerifierForApi18Provider = provider2;
        this.scanPreconditionVerifierForApi24Provider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier get() {
        return (com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideScanPreconditionVerifier(this.deviceSdkProvider.get().intValue(), this.scanPreconditionVerifierForApi18Provider, this.scanPreconditionVerifierForApi24Provider), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanPreconditionVerifierFactory create(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24> provider3) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideScanPreconditionVerifierFactory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier proxyProvideScanPreconditionVerifier(int i, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24> provider2) {
        return (com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideScanPreconditionVerifier(i, provider, provider2), "Cannot return null from a non-@Nullable @Provides method");
    }
}
