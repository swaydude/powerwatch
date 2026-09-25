package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Uploader$$Lambda$2 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;

    private Uploader$$Lambda$2(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext) {
        this.arg$1 = uploader;
        this.arg$2 = transportContext;
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$2(uploader, transportContext);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$logAndUpdateState$2(this.arg$1, this.arg$2);
    }
}
