package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory implements bleshadow.dagger.internal.Factory<io.reactivex.Observable<java.lang.Boolean>> {
    private final bleshadow.javax.inject.Provider<java.lang.Integer> deviceSdkProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory> locationServicesOkObservableApi23FactoryProvider;

    public ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory> provider2) {
        this.deviceSdkProvider = provider;
        this.locationServicesOkObservableApi23FactoryProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public io.reactivex.Observable<java.lang.Boolean> get() {
        return (io.reactivex.Observable) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideLocationServicesOkObservable(this.deviceSdkProvider.get().intValue(), this.locationServicesOkObservableApi23FactoryProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory create(bleshadow.javax.inject.Provider<java.lang.Integer> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory> provider2) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationServicesOkObservableFactory(provider, provider2);
    }

    public static io.reactivex.Observable<java.lang.Boolean> proxyProvideLocationServicesOkObservable(int i, com.polidea.rxandroidble2.internal.util.LocationServicesOkObservableApi23Factory locationServicesOkObservableApi23Factory) {
        return (io.reactivex.Observable) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideLocationServicesOkObservable(i, locationServicesOkObservableApi23Factory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
