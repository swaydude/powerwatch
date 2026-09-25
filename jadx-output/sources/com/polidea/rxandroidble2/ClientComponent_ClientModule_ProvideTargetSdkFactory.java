package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideTargetSdkFactory implements bleshadow.dagger.internal.Factory<java.lang.Integer> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;

    public ClientComponent_ClientModule_ProvideTargetSdkFactory(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public java.lang.Integer get() {
        return java.lang.Integer.valueOf(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideTargetSdk(this.contextProvider.get()));
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideTargetSdkFactory create(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideTargetSdkFactory(provider);
    }

    public static int proxyProvideTargetSdk(android.content.Context context) {
        return com.polidea.rxandroidble2.ClientComponent.ClientModule.provideTargetSdk(context);
    }
}
