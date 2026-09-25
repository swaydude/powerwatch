package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class DefaultScheduler$$Lambda$1 implements java.lang.Runnable {
    private final com.google.android.datatransport.runtime.scheduling.DefaultScheduler arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;
    private final com.google.android.datatransport.TransportScheduleCallback arg$3;
    private final com.google.android.datatransport.runtime.EventInternal arg$4;

    private DefaultScheduler$$Lambda$1(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        this.arg$1 = defaultScheduler;
        this.arg$2 = transportContext;
        this.arg$3 = transportScheduleCallback;
        this.arg$4 = eventInternal;
    }

    public static java.lang.Runnable lambdaFactory$(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        return new com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$1(defaultScheduler, transportContext, transportScheduleCallback, eventInternal);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.android.datatransport.runtime.scheduling.DefaultScheduler.lambda$schedule$1(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
    }
}
