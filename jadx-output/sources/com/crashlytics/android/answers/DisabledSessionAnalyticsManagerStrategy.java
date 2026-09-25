package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class DisabledSessionAnalyticsManagerStrategy implements com.crashlytics.android.answers.SessionAnalyticsManagerStrategy {
    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void cancelTimeBasedFileRollOver() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void deleteAllEvents() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void processEvent(com.crashlytics.android.answers.SessionEvent.Builder builder) {
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public boolean rollFileOver() throws java.io.IOException {
        return false;
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void scheduleTimeBasedRollOverIfNeeded() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void sendEvents() {
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData, java.lang.String str) {
    }

    DisabledSessionAnalyticsManagerStrategy() {
    }
}
