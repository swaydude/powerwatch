package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Uploader$$Lambda$3 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader arg$1;
    private final com.google.android.datatransport.runtime.backends.BackendResponse arg$2;
    private final java.lang.Iterable arg$3;
    private final com.google.android.datatransport.runtime.TransportContext arg$4;
    private final int arg$5;

    private Uploader$$Lambda$3(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.backends.BackendResponse backendResponse, java.lang.Iterable iterable, com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        this.arg$1 = uploader;
        this.arg$2 = backendResponse;
        this.arg$3 = iterable;
        this.arg$4 = transportContext;
        this.arg$5 = i;
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.backends.BackendResponse backendResponse, java.lang.Iterable iterable, com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$3(uploader, backendResponse, iterable, transportContext, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$logAndUpdateState$3(this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5);
    }
}
