package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultScheduler implements com.google.android.datatransport.runtime.scheduling.Scheduler {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(com.google.android.datatransport.runtime.TransportRuntime.class.getName());
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    @javax.inject.Inject
    public DefaultScheduler(java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$1.lambdaFactory$(this, transportContext, transportScheduleCallback, eventInternal));
    }

    static /* synthetic */ void lambda$schedule$1(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        try {
            com.google.android.datatransport.runtime.backends.TransportBackend transportBackend = defaultScheduler.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend == null) {
                java.lang.String str = java.lang.String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(str);
                transportScheduleCallback.onSchedule(new java.lang.IllegalArgumentException(str));
            } else {
                defaultScheduler.guard.runCriticalSection(com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$2.lambdaFactory$(defaultScheduler, transportContext, transportBackend.decorate(eventInternal)));
                transportScheduleCallback.onSchedule(null);
            }
        } catch (java.lang.Exception e) {
            LOGGER.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    static /* synthetic */ java.lang.Object lambda$schedule$0(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        defaultScheduler.eventStore.persist(transportContext, eventInternal);
        defaultScheduler.workScheduler.schedule(transportContext, 1);
        return null;
    }
}
