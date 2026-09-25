package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideLocationManagerFactory implements bleshadow.dagger.internal.Factory<android.location.LocationManager> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;

    public ClientComponent_ClientModule_ProvideLocationManagerFactory(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public android.location.LocationManager get() {
        return (android.location.LocationManager) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideLocationManager(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationManagerFactory create(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideLocationManagerFactory(provider);
    }

    public static android.location.LocationManager proxyProvideLocationManager(android.content.Context context) {
        return (android.location.LocationManager) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideLocationManager(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
