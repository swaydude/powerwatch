package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideBluetoothInteractionExecutorServiceFactory implements bleshadow.dagger.internal.Factory<java.util.concurrent.ExecutorService> {
    private static final com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionExecutorServiceFactory INSTANCE = new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionExecutorServiceFactory();

    @Override // bleshadow.javax.inject.Provider
    public java.util.concurrent.ExecutorService get() {
        return (java.util.concurrent.ExecutorService) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothInteractionExecutorService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionExecutorServiceFactory create() {
        return INSTANCE;
    }

    public static java.util.concurrent.ExecutorService proxyProvideBluetoothInteractionExecutorService() {
        return (java.util.concurrent.ExecutorService) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothInteractionExecutorService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
