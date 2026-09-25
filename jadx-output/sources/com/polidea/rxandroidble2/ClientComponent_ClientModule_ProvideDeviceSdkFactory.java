package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideDeviceSdkFactory implements bleshadow.dagger.internal.Factory<java.lang.Integer> {
    private static final com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory INSTANCE = new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory();

    @Override // bleshadow.javax.inject.Provider
    public java.lang.Integer get() {
        return java.lang.Integer.valueOf(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideDeviceSdk());
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideDeviceSdkFactory create() {
        return INSTANCE;
    }

    public static int proxyProvideDeviceSdk() {
        return com.polidea.rxandroidble2.ClientComponent.ClientModule.provideDeviceSdk();
    }
}
