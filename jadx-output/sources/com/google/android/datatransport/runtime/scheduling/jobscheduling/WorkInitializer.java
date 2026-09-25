package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class WorkInitializer {
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler scheduler;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore store;

    @javax.inject.Inject
    WorkInitializer(java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    public void ensureContextsScheduled() {
        this.executor.execute(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$1.lambdaFactory$(this));
    }

    static /* synthetic */ java.lang.Object lambda$ensureContextsScheduled$0(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        java.util.Iterator<com.google.android.datatransport.runtime.TransportContext> it = workInitializer.store.loadActiveContexts().iterator();
        while (it.hasNext()) {
            workInitializer.scheduler.schedule(it.next(), 1);
        }
        return null;
    }
}
