package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class DefaultScheduler$$Lambda$2 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.DefaultScheduler arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;
    private final com.google.android.datatransport.runtime.EventInternal arg$3;

    private DefaultScheduler$$Lambda$2(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        this.arg$1 = defaultScheduler;
        this.arg$2 = transportContext;
        this.arg$3 = eventInternal;
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        return new com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$2(defaultScheduler, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
        return com.google.android.datatransport.runtime.scheduling.DefaultScheduler.lambda$schedule$0(this.arg$1, this.arg$2, this.arg$3);
    }
}
