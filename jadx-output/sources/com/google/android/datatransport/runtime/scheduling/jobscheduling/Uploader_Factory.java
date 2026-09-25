package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Uploader_Factory implements dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> backendRegistryProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> provider4, javax.inject.Provider<java.util.concurrent.Executor> provider5, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> provider6, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider7) {
        this.contextProvider = provider;
        this.backendRegistryProvider = provider2;
        this.eventStoreProvider = provider3;
        this.workSchedulerProvider = provider4;
        this.executorProvider = provider5;
        this.guardProvider = provider6;
        this.clockProvider = provider7;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader get() {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> provider4, javax.inject.Provider<java.util.concurrent.Executor> provider5, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> provider6, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider7) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader newInstance(android.content.Context context, com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard, com.google.android.datatransport.runtime.time.Clock clock) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock);
    }
}
