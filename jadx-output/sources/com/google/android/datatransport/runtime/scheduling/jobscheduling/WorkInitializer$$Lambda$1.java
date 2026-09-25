package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class WorkInitializer$$Lambda$1 implements java.lang.Runnable {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer arg$1;

    private WorkInitializer$$Lambda$1(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        this.arg$1 = workInitializer;
    }

    public static java.lang.Runnable lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$1(workInitializer);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer = this.arg$1;
        workInitializer.guard.runCriticalSection(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$2.lambdaFactory$(workInitializer));
    }
}
