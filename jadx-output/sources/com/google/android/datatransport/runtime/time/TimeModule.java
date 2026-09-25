package com.google.android.datatransport.runtime.time;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Module
public abstract class TimeModule {
    @dagger.Provides
    static com.google.android.datatransport.runtime.time.Clock eventClock() {
        return new com.google.android.datatransport.runtime.time.WallTimeClock();
    }

    @dagger.Provides
    static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
        return new com.google.android.datatransport.runtime.time.UptimeClock();
    }
}
