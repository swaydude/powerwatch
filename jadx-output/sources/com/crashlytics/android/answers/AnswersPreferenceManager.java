package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersPreferenceManager {
    static final java.lang.String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    static final java.lang.String PREF_STORE_NAME = "settings";
    private final io.fabric.sdk.android.services.persistence.PreferenceStore prefStore;

    public static com.crashlytics.android.answers.AnswersPreferenceManager build(android.content.Context context) {
        return new com.crashlytics.android.answers.AnswersPreferenceManager(new io.fabric.sdk.android.services.persistence.PreferenceStoreImpl(context, PREF_STORE_NAME));
    }

    AnswersPreferenceManager(io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore) {
        this.prefStore = preferenceStore;
    }

    public void setAnalyticsLaunched() {
        io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore = this.prefStore;
        preferenceStore.save(preferenceStore.edit().putBoolean(PREFKEY_ANALYTICS_LAUNCHED, true));
    }

    public boolean hasAnalyticsLaunched() {
        return this.prefStore.get().getBoolean(PREFKEY_ANALYTICS_LAUNCHED, false);
    }
}
