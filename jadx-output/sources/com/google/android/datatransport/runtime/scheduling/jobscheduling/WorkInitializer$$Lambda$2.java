package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class WorkInitializer$$Lambda$2 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer arg$1;

    private WorkInitializer$$Lambda$2(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        this.arg$1 = workInitializer;
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$2(workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer.lambda$ensureContextsScheduled$0(this.arg$1);
    }
}
