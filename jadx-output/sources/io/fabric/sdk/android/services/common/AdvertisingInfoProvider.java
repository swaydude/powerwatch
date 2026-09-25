package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
class AdvertisingInfoProvider {
    private static final java.lang.String ADVERTISING_INFO_PREFERENCES = "TwitterAdvertisingInfoPreferences";
    private static final java.lang.String PREFKEY_ADVERTISING_ID = "advertising_id";
    private static final java.lang.String PREFKEY_LIMIT_AD_TRACKING = "limit_ad_tracking_enabled";
    private final android.content.Context context;
    private final io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore;

    public AdvertisingInfoProvider(android.content.Context context) {
        this.context = context.getApplicationContext();
        this.preferenceStore = new io.fabric.sdk.android.services.persistence.PreferenceStoreImpl(context, ADVERTISING_INFO_PREFERENCES);
    }

    public io.fabric.sdk.android.services.common.AdvertisingInfo getAdvertisingInfo() {
        io.fabric.sdk.android.services.common.AdvertisingInfo infoFromPreferences = getInfoFromPreferences();
        if (isInfoValid(infoFromPreferences)) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Using AdvertisingInfo from Preference Store");
            refreshInfoIfNeededAsync(infoFromPreferences);
            return infoFromPreferences;
        }
        io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfoFromStrategies = getAdvertisingInfoFromStrategies();
        storeInfoToPreferences(advertisingInfoFromStrategies);
        return advertisingInfoFromStrategies;
    }

    private void refreshInfoIfNeededAsync(final io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo) {
        new java.lang.Thread(new io.fabric.sdk.android.services.common.BackgroundPriorityRunnable() { // from class: io.fabric.sdk.android.services.common.AdvertisingInfoProvider.1
            @Override // io.fabric.sdk.android.services.common.BackgroundPriorityRunnable
            public void onRun() {
                io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfoFromStrategies = io.fabric.sdk.android.services.common.AdvertisingInfoProvider.this.getAdvertisingInfoFromStrategies();
                if (advertisingInfo.equals(advertisingInfoFromStrategies)) {
                    return;
                }
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Asychronously getting Advertising Info and storing it to preferences");
                io.fabric.sdk.android.services.common.AdvertisingInfoProvider.this.storeInfoToPreferences(advertisingInfoFromStrategies);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storeInfoToPreferences(io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo) {
        if (isInfoValid(advertisingInfo)) {
            io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore = this.preferenceStore;
            preferenceStore.save(preferenceStore.edit().putString(PREFKEY_ADVERTISING_ID, advertisingInfo.advertisingId).putBoolean(PREFKEY_LIMIT_AD_TRACKING, advertisingInfo.limitAdTrackingEnabled));
        } else {
            io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore2 = this.preferenceStore;
            preferenceStore2.save(preferenceStore2.edit().remove(PREFKEY_ADVERTISING_ID).remove(PREFKEY_LIMIT_AD_TRACKING));
        }
    }

    protected io.fabric.sdk.android.services.common.AdvertisingInfo getInfoFromPreferences() {
        return new io.fabric.sdk.android.services.common.AdvertisingInfo(this.preferenceStore.get().getString(PREFKEY_ADVERTISING_ID, ""), this.preferenceStore.get().getBoolean(PREFKEY_LIMIT_AD_TRACKING, false));
    }

    public io.fabric.sdk.android.services.common.AdvertisingInfoStrategy getReflectionStrategy() {
        return new io.fabric.sdk.android.services.common.AdvertisingInfoReflectionStrategy(this.context);
    }

    public io.fabric.sdk.android.services.common.AdvertisingInfoStrategy getServiceStrategy() {
        return new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy(this.context);
    }

    private boolean isInfoValid(io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo) {
        return (advertisingInfo == null || android.text.TextUtils.isEmpty(advertisingInfo.advertisingId)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.fabric.sdk.android.services.common.AdvertisingInfo getAdvertisingInfoFromStrategies() {
        io.fabric.sdk.android.services.common.AdvertisingInfo advertisingInfo = getReflectionStrategy().getAdvertisingInfo();
        if (!isInfoValid(advertisingInfo)) {
            advertisingInfo = getServiceStrategy().getAdvertisingInfo();
            if (!isInfoValid(advertisingInfo)) {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "AdvertisingInfo not present");
            } else {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Using AdvertisingInfo from Service Provider");
            }
        } else {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Using AdvertisingInfo from Reflection Provider");
        }
        return advertisingInfo;
    }
}
