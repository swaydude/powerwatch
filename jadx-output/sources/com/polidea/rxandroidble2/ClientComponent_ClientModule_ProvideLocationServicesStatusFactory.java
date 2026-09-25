package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideLocationServicesStatusFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.LocationServicesStatus> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> deviceSdkProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18> locationServicesStatusApi18Provider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23> locationServicesStatusApi23Provider;

    public ClientComponent_ClientModule_ProvideLocationServicesStatusFactory(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23> provider3) {
        this.deviceSdkProvider = provider;
        this.locationServicesStatusApi18Provider = provider2;
        this.locationServicesStatusApi23Provider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.LocationServicesStatus get() {
        return (com.polidea.rxandroidble2.internal.util.LocationServicesStatus) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideLocationServicesStatus(this.deviceSdkProvider.get().intValue(), this.locationServicesStatusApi18Provider, this.locationServicesStatusApi23Provider), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesStatusFactory create(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23> provider3) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesStatusFactory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.util.LocationServicesStatus proxyProvideLocationServicesStatus(int i, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi18> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesStatusApi23> provider2) {
        return (com.polidea.rxandroidble2.internal.util.LocationServicesStatus) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideLocationServicesStatus(i, provider, provider2), "Cannot return null from a non-@Nullable @Provides method");
    }
}
