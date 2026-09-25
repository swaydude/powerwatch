package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class PreferenceManager {
    static final java.lang.String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final java.lang.String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
    private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    private final com.crashlytics.android.core.CrashlyticsCore kit;
    private final io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore;

    public static com.crashlytics.android.core.PreferenceManager create(io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore, com.crashlytics.android.core.CrashlyticsCore crashlyticsCore) {
        return new com.crashlytics.android.core.PreferenceManager(preferenceStore, crashlyticsCore);
    }

    public PreferenceManager(io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore, com.crashlytics.android.core.CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = preferenceStore;
        this.kit = crashlyticsCore;
    }

    void setShouldAlwaysSendReports(boolean z) {
        io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore = this.preferenceStore;
        preferenceStore.save(preferenceStore.edit().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
    }

    boolean shouldAlwaysSendReports() {
        if (!this.preferenceStore.get().contains(PREF_MIGRATION_COMPLETE)) {
            io.fabric.sdk.android.services.persistence.PreferenceStoreImpl preferenceStoreImpl = new io.fabric.sdk.android.services.persistence.PreferenceStoreImpl(this.kit);
            if (!this.preferenceStore.get().contains(PREF_ALWAYS_SEND_REPORTS_KEY) && preferenceStoreImpl.get().contains(PREF_ALWAYS_SEND_REPORTS_KEY)) {
                boolean z = preferenceStoreImpl.get().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
                io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore = this.preferenceStore;
                preferenceStore.save(preferenceStore.edit().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
            }
            io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore2 = this.preferenceStore;
            preferenceStore2.save(preferenceStore2.edit().putBoolean(PREF_MIGRATION_COMPLETE, true));
        }
        return this.preferenceStore.get().getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
    }
}
