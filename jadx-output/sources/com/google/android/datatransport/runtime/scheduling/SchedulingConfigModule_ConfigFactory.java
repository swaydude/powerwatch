package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider) {
        this.clockProvider = provider;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig get() {
        return config(this.clockProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider) {
        return new com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory(provider);
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(com.google.android.datatransport.runtime.time.Clock clock) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) dagger.internal.Preconditions.checkNotNull(com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }
}
