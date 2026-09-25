package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
class DefaultSettingsController implements io.fabric.sdk.android.services.settings.SettingsController {
    private static final java.lang.String LOAD_ERROR_MESSAGE = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.";
    private static final java.lang.String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
    private final io.fabric.sdk.android.services.settings.CachedSettingsIo cachedSettingsIo;
    private final io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider;
    private final io.fabric.sdk.android.services.common.DataCollectionArbiter dataCollectionArbiter;
    private final io.fabric.sdk.android.Kit kit;
    private final io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore;
    private final io.fabric.sdk.android.services.settings.SettingsJsonTransform settingsJsonTransform;
    private final io.fabric.sdk.android.services.settings.SettingsRequest settingsRequest;
    private final io.fabric.sdk.android.services.settings.SettingsSpiCall settingsSpiCall;

    public DefaultSettingsController(io.fabric.sdk.android.Kit kit, io.fabric.sdk.android.services.settings.SettingsRequest settingsRequest, io.fabric.sdk.android.services.common.CurrentTimeProvider currentTimeProvider, io.fabric.sdk.android.services.settings.SettingsJsonTransform settingsJsonTransform, io.fabric.sdk.android.services.settings.CachedSettingsIo cachedSettingsIo, io.fabric.sdk.android.services.settings.SettingsSpiCall settingsSpiCall, io.fabric.sdk.android.services.common.DataCollectionArbiter dataCollectionArbiter) {
        this.kit = kit;
        this.settingsRequest = settingsRequest;
        this.currentTimeProvider = currentTimeProvider;
        this.settingsJsonTransform = settingsJsonTransform;
        this.cachedSettingsIo = cachedSettingsIo;
        this.settingsSpiCall = settingsSpiCall;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.preferenceStore = new io.fabric.sdk.android.services.persistence.PreferenceStoreImpl(kit);
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsController
    public io.fabric.sdk.android.services.settings.SettingsData loadSettingsData() {
        return loadSettingsData(io.fabric.sdk.android.services.settings.SettingsCacheBehavior.USE_CACHE);
    }

    @Override // io.fabric.sdk.android.services.settings.SettingsController
    public io.fabric.sdk.android.services.settings.SettingsData loadSettingsData(io.fabric.sdk.android.services.settings.SettingsCacheBehavior settingsCacheBehavior) {
        org.json.JSONObject jSONObjectInvoke;
        io.fabric.sdk.android.services.settings.SettingsData settingsDataBuildFromJson = null;
        if (!this.dataCollectionArbiter.isDataCollectionEnabled()) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!io.fabric.sdk.android.Fabric.isDebuggable() && !buildInstanceIdentifierChanged()) {
                settingsDataBuildFromJson = getCachedSettingsData(settingsCacheBehavior);
            }
            if (settingsDataBuildFromJson == null && (jSONObjectInvoke = this.settingsSpiCall.invoke(this.settingsRequest)) != null) {
                settingsDataBuildFromJson = this.settingsJsonTransform.buildFromJson(this.currentTimeProvider, jSONObjectInvoke);
                this.cachedSettingsIo.writeCachedSettings(settingsDataBuildFromJson.expiresAtMillis, jSONObjectInvoke);
                logSettings(jSONObjectInvoke, "Loaded settings: ");
                setStoredBuildInstanceIdentifier(getBuildInstanceIdentifierFromContext());
            }
            return settingsDataBuildFromJson == null ? getCachedSettingsData(io.fabric.sdk.android.services.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION) : settingsDataBuildFromJson;
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, LOAD_ERROR_MESSAGE, e);
            return null;
        }
    }

    private io.fabric.sdk.android.services.settings.SettingsData getCachedSettingsData(io.fabric.sdk.android.services.settings.SettingsCacheBehavior settingsCacheBehavior) {
        io.fabric.sdk.android.services.settings.SettingsData settingsData = null;
        try {
            if (!io.fabric.sdk.android.services.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                org.json.JSONObject cachedSettings = this.cachedSettingsIo.readCachedSettings();
                if (cachedSettings != null) {
                    io.fabric.sdk.android.services.settings.SettingsData settingsDataBuildFromJson = this.settingsJsonTransform.buildFromJson(this.currentTimeProvider, cachedSettings);
                    if (settingsDataBuildFromJson != null) {
                        logSettings(cachedSettings, "Loaded cached settings: ");
                        long currentTimeMillis = this.currentTimeProvider.getCurrentTimeMillis();
                        if (io.fabric.sdk.android.services.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) || !settingsDataBuildFromJson.isExpired(currentTimeMillis)) {
                            try {
                                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Returning cached settings.");
                                settingsData = settingsDataBuildFromJson;
                            } catch (java.lang.Exception e) {
                                e = e;
                                settingsData = settingsDataBuildFromJson;
                                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to get cached settings", e);
                            }
                        } else {
                            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Cached settings have expired.");
                        }
                    } else {
                        io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to transform cached settings data.", null);
                    }
                } else {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "No cached settings data found.");
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        return settingsData;
    }

    private void logSettings(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, str + jSONObject.toString());
    }

    java.lang.String getBuildInstanceIdentifierFromContext() {
        return io.fabric.sdk.android.services.common.CommonUtils.createInstanceIdFrom(io.fabric.sdk.android.services.common.CommonUtils.resolveBuildId(this.kit.getContext()));
    }

    java.lang.String getStoredBuildInstanceIdentifier() {
        return this.preferenceStore.get().getString(PREFS_BUILD_INSTANCE_IDENTIFIER, "");
    }

    boolean setStoredBuildInstanceIdentifier(java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = this.preferenceStore.edit();
        editorEdit.putString(PREFS_BUILD_INSTANCE_IDENTIFIER, str);
        return this.preferenceStore.save(editorEdit);
    }

    boolean buildInstanceIdentifierChanged() {
        return !getStoredBuildInstanceIdentifier().equals(getBuildInstanceIdentifierFromContext());
    }
}
