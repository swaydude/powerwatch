package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Module
public abstract class SchedulingModule {
    @dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.Scheduler scheduler(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler);

    @dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig, com.google.android.datatransport.runtime.time.Clock clock) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler(context, eventStore, schedulerConfig);
        }
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerScheduler(context, eventStore, clock, schedulerConfig);
    }
}
