package com.google.android.datatransport.runtime.time;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeModule_EventClockFactory implements dagger.internal.Factory<com.google.android.datatransport.runtime.time.Clock> {
    private static final com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory INSTANCE = new com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory();

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.time.Clock get() {
        return eventClock();
    }

    public static com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory create() {
        return INSTANCE;
    }

    public static com.google.android.datatransport.runtime.time.Clock eventClock() {
        return (com.google.android.datatransport.runtime.time.Clock) dagger.internal.Preconditions.checkNotNull(com.google.android.datatransport.runtime.time.TimeModule.eventClock(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
