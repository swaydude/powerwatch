package com.google.android.datatransport.runtime.time;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class UptimeClock implements com.google.android.datatransport.runtime.time.Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
