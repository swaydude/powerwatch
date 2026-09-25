package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class SamplingEventFilter implements com.crashlytics.android.answers.EventFilter {
    static final java.util.Set<com.crashlytics.android.answers.SessionEvent.Type> EVENTS_TYPE_TO_SAMPLE = new java.util.HashSet<com.crashlytics.android.answers.SessionEvent.Type>() { // from class: com.crashlytics.android.answers.SamplingEventFilter.1
        {
            add(com.crashlytics.android.answers.SessionEvent.Type.START);
            add(com.crashlytics.android.answers.SessionEvent.Type.RESUME);
            add(com.crashlytics.android.answers.SessionEvent.Type.PAUSE);
            add(com.crashlytics.android.answers.SessionEvent.Type.STOP);
        }
    };
    final int samplingRate;

    public SamplingEventFilter(int i) {
        this.samplingRate = i;
    }

    @Override // com.crashlytics.android.answers.EventFilter
    public boolean skipEvent(com.crashlytics.android.answers.SessionEvent sessionEvent) {
        return (EVENTS_TYPE_TO_SAMPLE.contains(sessionEvent.type) && sessionEvent.sessionEventMetadata.betaDeviceToken == null) && (java.lang.Math.abs(sessionEvent.sessionEventMetadata.installationId.hashCode() % this.samplingRate) != 0);
    }
}
