package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideIsAndroidWearFactory implements bleshadow.dagger.internal.Factory<java.lang.Boolean> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;
    private final bleshadow.javax.inject.Provider<java.lang.Integer> deviceSdkProvider;

    public ClientComponent_ClientModule_ProvideIsAndroidWearFactory(bleshadow.javax.inject.Provider<android.content.Context> provider, bleshadow.javax.inject.Provider<java.lang.Integer> provider2) {
        this.contextProvider = provider;
        this.deviceSdkProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideIsAndroidWear(this.contextProvider.get(), this.deviceSdkProvider.get().intValue()));
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideIsAndroidWearFactory create(bleshadow.javax.inject.Provider<android.content.Context> provider, bleshadow.javax.inject.Provider<java.lang.Integer> provider2) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideIsAndroidWearFactory(provider, provider2);
    }

    public static boolean proxyProvideIsAndroidWear(android.content.Context context, int i) {
        return com.polidea.rxandroidble2.ClientComponent.ClientModule.provideIsAndroidWear(context, i);
    }
}
