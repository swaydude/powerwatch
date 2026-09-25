package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
interface SessionAnalyticsManagerStrategy extends io.fabric.sdk.android.services.events.FileRollOverManager {
    void deleteAllEvents();

    void processEvent(com.crashlytics.android.answers.SessionEvent.Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData, java.lang.String str);
}
