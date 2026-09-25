package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class FirebaseAnalyticsApiAdapter {
    private final android.content.Context context;
    private com.crashlytics.android.answers.EventLogger eventLogger;
    private final com.crashlytics.android.answers.FirebaseAnalyticsEventMapper eventMapper;

    public FirebaseAnalyticsApiAdapter(android.content.Context context) {
        this(context, new com.crashlytics.android.answers.FirebaseAnalyticsEventMapper());
    }

    public FirebaseAnalyticsApiAdapter(android.content.Context context, com.crashlytics.android.answers.FirebaseAnalyticsEventMapper firebaseAnalyticsEventMapper) {
        this.context = context;
        this.eventMapper = firebaseAnalyticsEventMapper;
    }

    public com.crashlytics.android.answers.EventLogger getFirebaseAnalytics() {
        if (this.eventLogger == null) {
            this.eventLogger = com.crashlytics.android.answers.AppMeasurementEventLogger.getEventLogger(this.context);
        }
        return this.eventLogger;
    }

    public void processEvent(com.crashlytics.android.answers.SessionEvent sessionEvent) {
        com.crashlytics.android.answers.EventLogger firebaseAnalytics = getFirebaseAnalytics();
        if (firebaseAnalytics == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Firebase analytics logging was enabled, but not available...");
            return;
        }
        com.crashlytics.android.answers.FirebaseAnalyticsEvent firebaseAnalyticsEventMapEvent = this.eventMapper.mapEvent(sessionEvent);
        if (firebaseAnalyticsEventMapEvent == null) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Fabric event was not mappable to Firebase event: " + sessionEvent);
            return;
        }
        firebaseAnalytics.logEvent(firebaseAnalyticsEventMapEvent.getEventName(), firebaseAnalyticsEventMapEvent.getEventParams());
        if ("levelEnd".equals(sessionEvent.predefinedType)) {
            firebaseAnalytics.logEvent(com.google.firebase.analytics.FirebaseAnalytics.Event.POST_SCORE, firebaseAnalyticsEventMapEvent.getEventParams());
        }
    }
}
