package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> configProvider;
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider4) {
        this.contextProvider = provider;
        this.eventStoreProvider = provider2;
        this.configProvider = provider3;
        this.clockProvider = provider4;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider4) {
        return new com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory(provider, provider2, provider3, provider4);
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig, com.google.android.datatransport.runtime.time.Clock clock) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) dagger.internal.Preconditions.checkNotNull(com.google.android.datatransport.runtime.scheduling.SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }
}
