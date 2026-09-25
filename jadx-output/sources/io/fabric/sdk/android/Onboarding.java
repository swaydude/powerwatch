package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
class Onboarding extends io.fabric.sdk.android.Kit<java.lang.Boolean> {
    private static final java.lang.String BINARY_BUILD_TYPE = "binary";
    static final java.lang.String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private java.lang.String applicationLabel;
    private java.lang.String installerPackageName;
    private final java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo>> kitsFinder;
    private android.content.pm.PackageInfo packageInfo;
    private android.content.pm.PackageManager packageManager;
    private java.lang.String packageName;
    private final java.util.Collection<io.fabric.sdk.android.Kit> providedKits;
    private final io.fabric.sdk.android.services.network.HttpRequestFactory requestFactory = new io.fabric.sdk.android.services.network.DefaultHttpRequestFactory();
    private java.lang.String targetAndroidSdkVersion;
    private java.lang.String versionCode;
    private java.lang.String versionName;

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getVersion() {
        return "1.4.8.32";
    }

    public Onboarding(java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo>> future, java.util.Collection<io.fabric.sdk.android.Kit> collection) {
        this.kitsFinder = future;
        this.providedKits = collection;
    }

    @Override // io.fabric.sdk.android.Kit
    protected boolean onPreExecute() {
        try {
            this.installerPackageName = getIdManager().getInstallerPackageName();
            this.packageManager = getContext().getPackageManager();
            java.lang.String packageName = getContext().getPackageName();
            this.packageName = packageName;
            android.content.pm.PackageInfo packageInfo = this.packageManager.getPackageInfo(packageName, 0);
            this.packageInfo = packageInfo;
            this.versionCode = java.lang.Integer.toString(packageInfo.versionCode);
            this.versionName = this.packageInfo.versionName == null ? io.fabric.sdk.android.services.common.IdManager.DEFAULT_VERSION_NAME : this.packageInfo.versionName;
            this.applicationLabel = this.packageManager.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.targetAndroidSdkVersion = java.lang.Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed init", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.fabric.sdk.android.Kit
    public java.lang.Boolean doInBackground() throws java.lang.Throwable {
        java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo> map;
        boolean zPerformAutoConfigure;
        java.lang.String appIconHashOrNull = io.fabric.sdk.android.services.common.CommonUtils.getAppIconHashOrNull(getContext());
        io.fabric.sdk.android.services.settings.SettingsData settingsDataRetrieveSettingsData = retrieveSettingsData();
        if (settingsDataRetrieveSettingsData != null) {
            try {
                java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo>> future = this.kitsFinder;
                if (future != null) {
                    map = future.get();
                } else {
                    map = new java.util.HashMap<>();
                }
                zPerformAutoConfigure = performAutoConfigure(appIconHashOrNull, settingsDataRetrieveSettingsData.appData, mergeKits(map, this.providedKits).values());
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Error performing auto configuration.", e);
                zPerformAutoConfigure = false;
            }
        } else {
            zPerformAutoConfigure = false;
        }
        return java.lang.Boolean.valueOf(zPerformAutoConfigure);
    }

    private io.fabric.sdk.android.services.settings.SettingsData retrieveSettingsData() {
        try {
            io.fabric.sdk.android.services.settings.Settings.getInstance().initialize(this, this.idManager, this.requestFactory, this.versionCode, this.versionName, getOverridenSpiEndpoint(), io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(getContext())).loadSettingsData();
            return io.fabric.sdk.android.services.settings.Settings.getInstance().awaitSettingsData();
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Error dealing with settings", e);
            return null;
        }
    }

    java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo> mergeKits(java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo> map, java.util.Collection<io.fabric.sdk.android.Kit> collection) {
        for (io.fabric.sdk.android.Kit kit : collection) {
            if (!map.containsKey(kit.getIdentifier())) {
                map.put(kit.getIdentifier(), new io.fabric.sdk.android.KitInfo(kit.getIdentifier(), kit.getVersion(), BINARY_BUILD_TYPE));
            }
        }
        return map;
    }

    private boolean performAutoConfigure(java.lang.String str, io.fabric.sdk.android.services.settings.AppSettingsData appSettingsData, java.util.Collection<io.fabric.sdk.android.KitInfo> collection) {
        if (io.fabric.sdk.android.services.settings.AppSettingsData.STATUS_NEW.equals(appSettingsData.status)) {
            if (performCreateApp(str, appSettingsData, collection)) {
                return io.fabric.sdk.android.services.settings.Settings.getInstance().loadSettingsSkippingCache();
            }
            io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to create app with Crashlytics service.", null);
            return false;
        }
        if (io.fabric.sdk.android.services.settings.AppSettingsData.STATUS_CONFIGURED.equals(appSettingsData.status)) {
            return io.fabric.sdk.android.services.settings.Settings.getInstance().loadSettingsSkippingCache();
        }
        if (appSettingsData.updateRequired) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Server says an update is required - forcing a full App update.");
            performUpdateApp(str, appSettingsData, collection);
        }
        return true;
    }

    private boolean performCreateApp(java.lang.String str, io.fabric.sdk.android.services.settings.AppSettingsData appSettingsData, java.util.Collection<io.fabric.sdk.android.KitInfo> collection) {
        return new io.fabric.sdk.android.services.settings.CreateAppSpiCall(this, getOverridenSpiEndpoint(), appSettingsData.url, this.requestFactory).invoke(buildAppRequest(io.fabric.sdk.android.services.settings.IconRequest.build(getContext(), str), collection));
    }

    private boolean performUpdateApp(java.lang.String str, io.fabric.sdk.android.services.settings.AppSettingsData appSettingsData, java.util.Collection<io.fabric.sdk.android.KitInfo> collection) {
        return performUpdateApp(appSettingsData, io.fabric.sdk.android.services.settings.IconRequest.build(getContext(), str), collection);
    }

    private boolean performUpdateApp(io.fabric.sdk.android.services.settings.AppSettingsData appSettingsData, io.fabric.sdk.android.services.settings.IconRequest iconRequest, java.util.Collection<io.fabric.sdk.android.KitInfo> collection) {
        return new io.fabric.sdk.android.services.settings.UpdateAppSpiCall(this, getOverridenSpiEndpoint(), appSettingsData.url, this.requestFactory).invoke(buildAppRequest(iconRequest, collection));
    }

    private io.fabric.sdk.android.services.settings.AppRequestData buildAppRequest(io.fabric.sdk.android.services.settings.IconRequest iconRequest, java.util.Collection<io.fabric.sdk.android.KitInfo> collection) {
        android.content.Context context = getContext();
        return new io.fabric.sdk.android.services.settings.AppRequestData(new io.fabric.sdk.android.services.common.ApiKey().getValue(context), getIdManager().getAppIdentifier(), this.versionName, this.versionCode, io.fabric.sdk.android.services.common.CommonUtils.createInstanceIdFrom(io.fabric.sdk.android.services.common.CommonUtils.resolveBuildId(context)), this.applicationLabel, io.fabric.sdk.android.services.common.DeliveryMechanism.determineFrom(this.installerPackageName).getId(), this.targetAndroidSdkVersion, "0", iconRequest, collection);
    }

    java.lang.String getOverridenSpiEndpoint() {
        return io.fabric.sdk.android.services.common.CommonUtils.getStringsFileValue(getContext(), CRASHLYTICS_API_ENDPOINT);
    }
}
