package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Uploader$$Lambda$1 implements java.lang.Runnable {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;
    private final int arg$3;
    private final java.lang.Runnable arg$4;

    private Uploader$$Lambda$1(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext, int i, java.lang.Runnable runnable) {
        this.arg$1 = uploader;
        this.arg$2 = transportContext;
        this.arg$3 = i;
        this.arg$4 = runnable;
    }

    public static java.lang.Runnable lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.TransportContext transportContext, int i, java.lang.Runnable runnable) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$1(uploader, transportContext, i, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$upload$1(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
    }
}
