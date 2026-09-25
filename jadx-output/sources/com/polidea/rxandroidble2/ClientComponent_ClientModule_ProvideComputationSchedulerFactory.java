package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideComputationSchedulerFactory implements bleshadow.dagger.internal.Factory<io.reactivex.Scheduler> {
    private static final com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory INSTANCE = new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory();

    @Override // bleshadow.javax.inject.Provider
    public io.reactivex.Scheduler get() {
        return (io.reactivex.Scheduler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideComputationScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideComputationSchedulerFactory create() {
        return INSTANCE;
    }

    public static io.reactivex.Scheduler proxyProvideComputationScheduler() {
        return (io.reactivex.Scheduler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideComputationScheduler(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
