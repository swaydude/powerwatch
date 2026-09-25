package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideFinalizationCloseableFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer> {
    private final bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> callbacksExecutorServiceProvider;
    private final bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> connectionQueueExecutorServiceProvider;
    private final bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> interactionExecutorServiceProvider;

    public ClientComponent_ClientModule_ProvideFinalizationCloseableFactory(bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider, bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider2, bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider3) {
        this.interactionExecutorServiceProvider = provider;
        this.callbacksExecutorServiceProvider = provider2;
        this.connectionQueueExecutorServiceProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer get() {
        return (com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideFinalizationCloseable(this.interactionExecutorServiceProvider.get(), this.callbacksExecutorServiceProvider.get(), this.connectionQueueExecutorServiceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideFinalizationCloseableFactory create(bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider, bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider2, bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider3) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideFinalizationCloseableFactory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer proxyProvideFinalizationCloseable(java.util.concurrent.ExecutorService executorService, java.util.concurrent.ExecutorService executorService2, java.util.concurrent.ExecutorService executorService3) {
        return (com.polidea.rxandroidble2.ClientComponent.ClientComponentFinalizer) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideFinalizationCloseable(executorService, executorService2, executorService3), "Cannot return null from a non-@Nullable @Provides method");
    }
}
