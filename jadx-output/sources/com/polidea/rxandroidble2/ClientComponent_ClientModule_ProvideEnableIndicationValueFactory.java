package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideEnableIndicationValueFactory implements bleshadow.dagger.internal.Factory<byte[]> {
    private static final com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableIndicationValueFactory INSTANCE = new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableIndicationValueFactory();

    @Override // bleshadow.javax.inject.Provider
    public byte[] get() {
        return (byte[]) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideEnableIndicationValue(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableIndicationValueFactory create() {
        return INSTANCE;
    }

    public static byte[] proxyProvideEnableIndicationValue() {
        return (byte[]) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideEnableIndicationValue(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
