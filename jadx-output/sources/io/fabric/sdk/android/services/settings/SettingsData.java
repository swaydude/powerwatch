package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class SettingsData {
    public final io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData;
    public final io.fabric.sdk.android.services.settings.AppSettingsData appData;
    public final io.fabric.sdk.android.services.settings.BetaSettingsData betaSettingsData;
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final io.fabric.sdk.android.services.settings.FeaturesSettingsData featuresData;
    public final io.fabric.sdk.android.services.settings.PromptSettingsData promptData;
    public final io.fabric.sdk.android.services.settings.SessionSettingsData sessionData;
    public final int settingsVersion;

    public SettingsData(long j, io.fabric.sdk.android.services.settings.AppSettingsData appSettingsData, io.fabric.sdk.android.services.settings.SessionSettingsData sessionSettingsData, io.fabric.sdk.android.services.settings.PromptSettingsData promptSettingsData, io.fabric.sdk.android.services.settings.FeaturesSettingsData featuresSettingsData, io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData, io.fabric.sdk.android.services.settings.BetaSettingsData betaSettingsData, int i, int i2) {
        this.expiresAtMillis = j;
        this.appData = appSettingsData;
        this.sessionData = sessionSettingsData;
        this.promptData = promptSettingsData;
        this.featuresData = featuresSettingsData;
        this.settingsVersion = i;
        this.cacheDuration = i2;
        this.analyticsSettingsData = analyticsSettingsData;
        this.betaSettingsData = betaSettingsData;
    }

    public boolean isExpired(long j) {
        return this.expiresAtMillis < j;
    }
}
