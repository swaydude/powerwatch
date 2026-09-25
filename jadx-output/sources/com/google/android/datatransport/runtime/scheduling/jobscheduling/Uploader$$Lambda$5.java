package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Uploader$$Lambda$5 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;
    private final int arg$3;

    private Uploader$$Lambda$5(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        this.arg$1 = uploader;
        this.arg$2 = transportContext;
        this.arg$3 = i;
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$5(uploader, transportContext, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$upload$0(this.arg$1, this.arg$2, this.arg$3);
    }
}
