package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory implements bleshadow.dagger.internal.Factory<io.reactivex.Scheduler> {
    private final bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> serviceProvider;

    public ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory(bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider) {
        this.serviceProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public io.reactivex.Scheduler get() {
        return (io.reactivex.Scheduler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothInteractionScheduler(this.serviceProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory create(bleshadow.javax.inject.Provider<java.util.concurrent.ExecutorService> provider) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory(provider);
    }

    public static io.reactivex.Scheduler proxyProvideBluetoothInteractionScheduler(java.util.concurrent.ExecutorService executorService) {
        return (io.reactivex.Scheduler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothInteractionScheduler(executorService), "Cannot return null from a non-@Nullable @Provides method");
    }
}
