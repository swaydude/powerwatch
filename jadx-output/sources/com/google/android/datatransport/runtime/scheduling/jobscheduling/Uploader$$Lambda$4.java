package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Uploader$$Lambda$4 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore arg$1;

    private Uploader$$Lambda$4(com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore) {
        this.arg$1 = eventStore;
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$4(eventStore);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
        return java.lang.Integer.valueOf(this.arg$1.cleanUp());
    }
}
