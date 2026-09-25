package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
public class Settings {
    public static final java.lang.String SETTINGS_CACHE_FILENAME = "com.crashlytics.settings.json";
    private static final java.lang.String SETTINGS_URL_FORMAT = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings";
    private boolean initialized;
    private io.fabric.sdk.android.services.settings.SettingsController settingsController;
    private final java.util.concurrent.atomic.AtomicReference<io.fabric.sdk.android.services.settings.SettingsData> settingsData;
    private final java.util.concurrent.CountDownLatch settingsDataLatch;

    public interface SettingsAccess<T> {
        T usingSettings(io.fabric.sdk.android.services.settings.SettingsData settingsData);
    }

    static class LazyHolder {
        private static final io.fabric.sdk.android.services.settings.Settings INSTANCE = new io.fabric.sdk.android.services.settings.Settings();

        LazyHolder() {
        }
    }

    public static io.fabric.sdk.android.services.settings.Settings getInstance() {
        return io.fabric.sdk.android.services.settings.Settings.LazyHolder.INSTANCE;
    }

    private Settings() {
        this.settingsData = new java.util.concurrent.atomic.AtomicReference<>();
        this.settingsDataLatch = new java.util.concurrent.CountDownLatch(1);
        this.initialized = false;
    }

    public synchronized io.fabric.sdk.android.services.settings.Settings initialize(io.fabric.sdk.android.Kit kit, io.fabric.sdk.android.services.common.IdManager idManager, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, java.lang.String str, java.lang.String str2, java.lang.String str3, io.fabric.sdk.android.services.common.DataCollectionArbiter dataCollectionArbiter) {
        if (this.initialized) {
            return this;
        }
        if (this.settingsController == null) {
            android.content.Context context = kit.getContext();
            java.lang.String appIdentifier = idManager.getAppIdentifier();
            java.lang.String value = new io.fabric.sdk.android.services.common.ApiKey().getValue(context);
            java.lang.String installerPackageName = idManager.getInstallerPackageName();
            this.settingsController = new io.fabric.sdk.android.services.settings.DefaultSettingsController(kit, new io.fabric.sdk.android.services.settings.SettingsRequest(value, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager.getAppInstallIdentifier(), io.fabric.sdk.android.services.common.CommonUtils.createInstanceIdFrom(io.fabric.sdk.android.services.common.CommonUtils.resolveBuildId(context)), str2, str, io.fabric.sdk.android.services.common.DeliveryMechanism.determineFrom(installerPackageName).getId(), io.fabric.sdk.android.services.common.CommonUtils.getAppIconHashOrNull(context)), new io.fabric.sdk.android.services.common.SystemCurrentTimeProvider(), new io.fabric.sdk.android.services.settings.DefaultSettingsJsonTransform(), new io.fabric.sdk.android.services.settings.DefaultCachedSettingsIo(kit), new io.fabric.sdk.android.services.settings.DefaultSettingsSpiCall(kit, str3, java.lang.String.format(java.util.Locale.US, SETTINGS_URL_FORMAT, appIdentifier), httpRequestFactory), dataCollectionArbiter);
        }
        this.initialized = true;
        return this;
    }

    public void clearSettings() {
        this.settingsData.set(null);
    }

    public void setSettingsController(io.fabric.sdk.android.services.settings.SettingsController settingsController) {
        this.settingsController = settingsController;
    }

    public <T> T withSettings(io.fabric.sdk.android.services.settings.Settings.SettingsAccess<T> settingsAccess, T t) {
        io.fabric.sdk.android.services.settings.SettingsData settingsData = this.settingsData.get();
        return settingsData == null ? t : settingsAccess.usingSettings(settingsData);
    }

    public io.fabric.sdk.android.services.settings.SettingsData awaitSettingsData() {
        try {
            this.settingsDataLatch.await();
            return this.settingsData.get();
        } catch (java.lang.InterruptedException unused) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public synchronized boolean loadSettingsData() {
        io.fabric.sdk.android.services.settings.SettingsData settingsDataLoadSettingsData;
        settingsDataLoadSettingsData = this.settingsController.loadSettingsData();
        setSettingsData(settingsDataLoadSettingsData);
        return settingsDataLoadSettingsData != null;
    }

    public synchronized boolean loadSettingsSkippingCache() {
        io.fabric.sdk.android.services.settings.SettingsData settingsDataLoadSettingsData;
        settingsDataLoadSettingsData = this.settingsController.loadSettingsData(io.fabric.sdk.android.services.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP);
        setSettingsData(settingsDataLoadSettingsData);
        if (settingsDataLoadSettingsData == null) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to force reload of settings from Crashlytics.", null);
        }
        return settingsDataLoadSettingsData != null;
    }

    private void setSettingsData(io.fabric.sdk.android.services.settings.SettingsData settingsData) {
        this.settingsData.set(settingsData);
        this.settingsDataLatch.countDown();
    }
}
