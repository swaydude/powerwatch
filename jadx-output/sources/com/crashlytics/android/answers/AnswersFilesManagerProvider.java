package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersFilesManagerProvider {
    static final java.lang.String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    static final java.lang.String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    final android.content.Context context;
    final io.fabric.sdk.android.services.persistence.FileStore fileStore;

    public AnswersFilesManagerProvider(android.content.Context context, io.fabric.sdk.android.services.persistence.FileStore fileStore) {
        this.context = context;
        this.fileStore = fileStore;
    }

    public com.crashlytics.android.answers.SessionAnalyticsFilesManager getAnalyticsFilesManager() throws java.io.IOException {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
        }
        return new com.crashlytics.android.answers.SessionAnalyticsFilesManager(this.context, new com.crashlytics.android.answers.SessionEventTransform(), new io.fabric.sdk.android.services.common.SystemCurrentTimeProvider(), new io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage(this.context, this.fileStore.getFilesDir(), SESSION_ANALYTICS_FILE_NAME, SESSION_ANALYTICS_TO_SEND_DIR));
    }
}
