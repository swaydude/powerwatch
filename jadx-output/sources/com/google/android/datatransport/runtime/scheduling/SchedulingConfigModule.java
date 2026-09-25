package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Module
public abstract class SchedulingConfigModule {
    @dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(com.google.android.datatransport.runtime.time.Clock clock) {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.getDefault(clock);
    }
}
