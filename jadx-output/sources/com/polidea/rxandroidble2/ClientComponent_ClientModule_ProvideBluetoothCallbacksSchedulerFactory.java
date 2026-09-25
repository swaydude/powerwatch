package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideBluetoothCallbacksSchedulerFactory implements bleshadow.dagger.internal.Factory<io.reactivex.Scheduler> {
    private final bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> serviceProvider;

    public ClientComponent_ClientModule_ProvideBluetoothCallbacksSchedulerFactory(bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider) {
        this.serviceProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public io.reactivex.Scheduler get() {
        return (io.reactivex.Scheduler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothCallbacksScheduler(this.serviceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothCallbacksSchedulerFactory create(bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothCallbacksSchedulerFactory(provider);
    }

    public static io.reactivex.Scheduler proxyProvideBluetoothCallbacksScheduler(java.util.concurrent.ExecutorService executorService) {
        return (io.reactivex.Scheduler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothCallbacksScheduler(executorService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
