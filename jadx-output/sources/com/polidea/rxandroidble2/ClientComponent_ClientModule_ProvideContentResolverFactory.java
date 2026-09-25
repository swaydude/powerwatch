package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideContentResolverFactory implements bleshadow.dagger.internal.Factory<android.content.ContentResolver> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;

    public ClientComponent_ClientModule_ProvideContentResolverFactory(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public android.content.ContentResolver get() {
        return (android.content.ContentResolver) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideContentResolver(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideContentResolverFactory create(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideContentResolverFactory(provider);
    }

    public static android.content.ContentResolver proxyProvideContentResolver(android.content.Context context) {
        return (android.content.ContentResolver) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideContentResolver(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
