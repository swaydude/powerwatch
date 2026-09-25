package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideEnableNotificationValueFactory implements bleshadow.dagger.internal.Factory<byte[]> {
    private static final com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableNotificationValueFactory INSTANCE = new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableNotificationValueFactory();

    @Override // bleshadow.javax.inject.Provider
    public byte[] get() {
        return (byte[]) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideEnableNotificationValue(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideEnableNotificationValueFactory create() {
        return INSTANCE;
    }

    public static byte[] proxyProvideEnableNotificationValue() {
        return (byte[]) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideEnableNotificationValue(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
