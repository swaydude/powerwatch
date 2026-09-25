package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class SessionAnalyticsFilesManager extends io.fabric.sdk.android.services.events.EventsFilesManager<com.crashlytics.android.answers.SessionEvent> {
    private static final java.lang.String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    private static final java.lang.String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    private io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData;

    SessionAnalyticsFilesManager(android.content.Context context, com.crashlytics.android.answers.SessionEventTransform sessionEventTransform, io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider, io.fabric.sdk.android.services.events.EventsStorage eventsStorage) throws java.io.IOException {
        super(context, sessionEventTransform, currentTimeProvider, eventsStorage, 100);
    }

    @Override // io.fabric.sdk.android.services.events.EventsFilesManager
    protected java.lang.String generateUniqueRollOverFileName() {
        return SESSION_ANALYTICS_TO_SEND_FILE_PREFIX + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + java.util.UUID.randomUUID().toString() + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + this.currentTimeProvider.getCurrentTimeMillis() + SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION;
    }

    @Override // io.fabric.sdk.android.services.events.EventsFilesManager
    protected int getMaxFilesToKeep() {
        io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData = this.analyticsSettingsData;
        return analyticsSettingsData == null ? super.getMaxFilesToKeep() : analyticsSettingsData.maxPendingSendFileCount;
    }

    @Override // io.fabric.sdk.android.services.events.EventsFilesManager
    protected int getMaxByteSizePerFile() {
        io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData = this.analyticsSettingsData;
        return analyticsSettingsData == null ? super.getMaxByteSizePerFile() : analyticsSettingsData.maxByteSizePerFile;
    }

    void setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData) {
        this.analyticsSettingsData = analyticsSettingsData;
    }
}
