package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class TransportImpl$$Lambda$1 implements com.google.android.datatransport.TransportScheduleCallback {
    private static final com.google.android.datatransport.runtime.TransportImpl$$Lambda$1 instance = new com.google.android.datatransport.runtime.TransportImpl$$Lambda$1();

    private TransportImpl$$Lambda$1() {
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(java.lang.Exception exc) {
        com.google.android.datatransport.runtime.TransportImpl.lambda$send$0(exc);
    }
}
