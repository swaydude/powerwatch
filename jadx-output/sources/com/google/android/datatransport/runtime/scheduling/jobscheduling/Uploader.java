package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class Uploader {
    private static final java.lang.String LOG_TAG = "Uploader";
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    @javax.inject.Inject
    public Uploader(android.content.Context context, com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard, com.google.android.datatransport.runtime.time.Clock clock) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
    }

    boolean isNetworkAvailable() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void upload(com.google.android.datatransport.runtime.TransportContext transportContext, int i, java.lang.Runnable runnable) {
        this.executor.execute(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$1.lambdaFactory$(this, transportContext, i, runnable));
    }

    static /* synthetic */ void lambda$upload$1(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext, int i, java.lang.Runnable runnable) {
        try {
            try {
                com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard = uploader.guard;
                com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore = uploader.eventStore;
                eventStore.getClass();
                synchronizationGuard.runCriticalSection(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$4.lambdaFactory$(eventStore));
                if (!uploader.isNetworkAvailable()) {
                    uploader.guard.runCriticalSection(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$5.lambdaFactory$(uploader, transportContext, i));
                } else {
                    uploader.logAndUpdateState(transportContext, i);
                }
            } catch (com.google.android.datatransport.runtime.synchronization.SynchronizationException unused) {
                uploader.workScheduler.schedule(transportContext, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    static /* synthetic */ java.lang.Object lambda$upload$0(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        uploader.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    void logAndUpdateState(com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        com.google.android.datatransport.runtime.backends.BackendResponse backendResponseSend;
        com.google.android.datatransport.runtime.backends.TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        java.lang.Iterable iterable = (java.lang.Iterable) this.guard.runCriticalSection(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$2.lambdaFactory$(this, transportContext));
        if (iterable.iterator().hasNext()) {
            if (transportBackend == null) {
                com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseSend = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) it.next()).getEvent());
                }
                backendResponseSend = transportBackend.send(com.google.android.datatransport.runtime.backends.BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
            }
            this.guard.runCriticalSection(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$3.lambdaFactory$(this, backendResponseSend, iterable, transportContext, i));
        }
    }

    static /* synthetic */ java.lang.Iterable lambda$logAndUpdateState$2(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext) {
        return uploader.eventStore.loadBatch(transportContext);
    }

    static /* synthetic */ java.lang.Object lambda$logAndUpdateState$3(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.backends.BackendResponse backendResponse, java.lang.Iterable iterable, com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        if (backendResponse.getStatus() == com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR) {
            uploader.eventStore.recordFailure(iterable);
            uploader.workScheduler.schedule(transportContext, i + 1);
            return null;
        }
        uploader.eventStore.recordSuccess(iterable);
        if (backendResponse.getStatus() == com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK) {
            uploader.eventStore.recordNextCallTime(transportContext, uploader.clock.getTime() + backendResponse.getNextRequestWaitMillis());
        }
        if (!uploader.eventStore.hasPendingEventsFor(transportContext)) {
            return null;
        }
        uploader.workScheduler.schedule(transportContext, 1);
        return null;
    }
}
