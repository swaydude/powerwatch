package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
@io.fabric.sdk.android.services.concurrency.DependsOn({com.crashlytics.android.core.CrashlyticsNdkDataProvider.class})
public class CrashlyticsCore extends io.fabric.sdk.android.Kit<java.lang.Void> {
    static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final java.lang.String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final java.lang.String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final java.lang.String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final java.lang.String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    private static final java.lang.String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
    public static final java.lang.String TAG = "CrashlyticsCore";
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> attributes;
    private com.crashlytics.android.core.CrashlyticsBackgroundWorker backgroundWorker;
    private com.crashlytics.android.core.CrashlyticsController controller;
    private com.crashlytics.android.core.CrashlyticsFileMarker crashMarker;
    private com.crashlytics.android.core.CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory;
    private com.crashlytics.android.core.CrashlyticsFileMarker initializationMarker;
    private com.crashlytics.android.core.CrashlyticsListener listener;
    private final com.crashlytics.android.core.PinningInfoProvider pinningInfo;
    private final long startTime;
    private java.lang.String userEmail;
    private java.lang.String userId;
    private java.lang.String userName;

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getVersion() {
        return "2.7.0.33";
    }

    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private com.crashlytics.android.core.CrashlyticsListener listener;
        private com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider;

        public com.crashlytics.android.core.CrashlyticsCore.Builder delay(float f) {
            if (f <= 0.0f) {
                throw new java.lang.IllegalArgumentException("delay must be greater than 0");
            }
            if (this.delay > 0.0f) {
                throw new java.lang.IllegalStateException("delay already set.");
            }
            this.delay = f;
            return this;
        }

        public com.crashlytics.android.core.CrashlyticsCore.Builder listener(com.crashlytics.android.core.CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new java.lang.IllegalArgumentException("listener must not be null.");
            }
            if (this.listener != null) {
                throw new java.lang.IllegalStateException("listener already set.");
            }
            this.listener = crashlyticsListener;
            return this;
        }

        @java.lang.Deprecated
        public com.crashlytics.android.core.CrashlyticsCore.Builder pinningInfo(com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider) {
            if (pinningInfoProvider == null) {
                throw new java.lang.IllegalArgumentException("pinningInfoProvider must not be null.");
            }
            if (this.pinningInfoProvider != null) {
                throw new java.lang.IllegalStateException("pinningInfoProvider already set.");
            }
            this.pinningInfoProvider = pinningInfoProvider;
            return this;
        }

        public com.crashlytics.android.core.CrashlyticsCore.Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public com.crashlytics.android.core.CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = 1.0f;
            }
            return new com.crashlytics.android.core.CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }
    }

    public CrashlyticsCore() {
        this(1.0f, null, null, false);
    }

    CrashlyticsCore(float f, com.crashlytics.android.core.CrashlyticsListener crashlyticsListener, com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, io.fabric.sdk.android.services.common.ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler"));
    }

    CrashlyticsCore(float f, com.crashlytics.android.core.CrashlyticsListener crashlyticsListener, com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider, boolean z, java.util.concurrent.ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        this.listener = crashlyticsListener == null ? new com.crashlytics.android.core.CrashlyticsCore.NoOpListener() : crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new com.crashlytics.android.core.CrashlyticsBackgroundWorker(executorService);
        this.attributes = new java.util.concurrent.ConcurrentHashMap<>();
        this.startTime = java.lang.System.currentTimeMillis();
    }

    @Override // io.fabric.sdk.android.Kit
    protected boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(android.content.Context context) {
        java.lang.String value;
        if (!io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(context).isDataCollectionEnabled()) {
            io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Crashlytics is disabled, because data collection is disabled by Firebase.");
            this.disabled = true;
        }
        if (this.disabled || (value = new io.fabric.sdk.android.services.common.ApiKey().getValue(context)) == null) {
            return false;
        }
        java.lang.String strResolveBuildId = io.fabric.sdk.android.services.common.CommonUtils.resolveBuildId(context);
        if (!isBuildIdValid(strResolveBuildId, io.fabric.sdk.android.services.common.CommonUtils.getBooleanResourceValue(context, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            throw new io.fabric.sdk.android.services.concurrency.UnmetDependencyException(MISSING_BUILD_ID_MSG);
        }
        try {
            io.fabric.sdk.android.Fabric.getLogger().i(TAG, "Initializing Crashlytics Core " + getVersion());
            io.fabric.sdk.android.services.persistence.FileStoreImpl fileStoreImpl = new io.fabric.sdk.android.services.persistence.FileStoreImpl(this);
            this.crashMarker = new com.crashlytics.android.core.CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, fileStoreImpl);
            this.initializationMarker = new com.crashlytics.android.core.CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, fileStoreImpl);
            com.crashlytics.android.core.PreferenceManager preferenceManagerCreate = com.crashlytics.android.core.PreferenceManager.create(new io.fabric.sdk.android.services.persistence.PreferenceStoreImpl(getContext(), PREFERENCE_STORE_NAME), this);
            com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider = this.pinningInfo;
            com.crashlytics.android.core.CrashlyticsPinningInfoProvider crashlyticsPinningInfoProvider = pinningInfoProvider != null ? new com.crashlytics.android.core.CrashlyticsPinningInfoProvider(pinningInfoProvider) : null;
            io.fabric.sdk.android.services.network.DefaultHttpRequestFactory defaultHttpRequestFactory = new io.fabric.sdk.android.services.network.DefaultHttpRequestFactory(io.fabric.sdk.android.Fabric.getLogger());
            this.httpRequestFactory = defaultHttpRequestFactory;
            defaultHttpRequestFactory.setPinningInfoProvider(crashlyticsPinningInfoProvider);
            io.fabric.sdk.android.services.common.IdManager idManager = getIdManager();
            com.crashlytics.android.core.AppData appDataCreate = com.crashlytics.android.core.AppData.create(context, idManager, value, strResolveBuildId);
            this.controller = new com.crashlytics.android.core.CrashlyticsController(this, this.backgroundWorker, this.httpRequestFactory, idManager, preferenceManagerCreate, fileStoreImpl, appDataCreate, new com.crashlytics.android.core.ResourceUnityVersionProvider(context, new com.crashlytics.android.core.ManifestUnityVersionProvider(context, appDataCreate.packageName)), new com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar(this), com.crashlytics.android.answers.AppMeasurementEventLogger.getEventLogger(context));
            boolean zDidPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.enableExceptionHandling(java.lang.Thread.getDefaultUncaughtExceptionHandler(), new io.fabric.sdk.android.services.common.FirebaseInfo().isFirebaseCrashlyticsEnabled(context));
            if (zDidPreviousInitializationFail && io.fabric.sdk.android.services.common.CommonUtils.canTryConnection(context)) {
                io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                finishInitSynchronously();
                return false;
            }
            io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Exception handling initialization successful");
            return true;
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Crashlytics was not started due to an exception during initialization", e);
            this.controller = null;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.fabric.sdk.android.Kit
    public java.lang.Void doInBackground() {
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            try {
                this.controller.registerDevicePowerStateListener();
                io.fabric.sdk.android.services.settings.SettingsData settingsDataAwaitSettingsData = io.fabric.sdk.android.services.settings.Settings.getInstance().awaitSettingsData();
                if (settingsDataAwaitSettingsData == null) {
                    io.fabric.sdk.android.Fabric.getLogger().w(TAG, "Received null settings, skipping report submission!");
                    return null;
                }
                this.controller.registerAnalyticsEventListener(settingsDataAwaitSettingsData);
                if (!settingsDataAwaitSettingsData.featuresData.collectReports) {
                    io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Collection of crash reports disabled in Crashlytics settings.");
                    return null;
                }
                if (!io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(getContext()).isDataCollectionEnabled()) {
                    io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Automatic collection of crash reports disabled by Firebase settings.");
                    return null;
                }
                com.crashlytics.android.core.CrashlyticsNdkData nativeCrashData = getNativeCrashData();
                if (nativeCrashData != null && !this.controller.finalizeNativeReport(nativeCrashData)) {
                    io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Could not finalize previous NDK sessions.");
                }
                if (!this.controller.finalizeSessions(settingsDataAwaitSettingsData.sessionData)) {
                    io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Could not finalize previous sessions.");
                }
                this.controller.submitAllReports(this.delay, settingsDataAwaitSettingsData);
                return null;
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
        } finally {
            markInitializationComplete();
        }
    }

    public static com.crashlytics.android.core.CrashlyticsCore getInstance() {
        return (com.crashlytics.android.core.CrashlyticsCore) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.core.CrashlyticsCore.class);
    }

    public com.crashlytics.android.core.PinningInfoProvider getPinningInfoProvider() {
        if (this.disabled) {
            return null;
        }
        return this.pinningInfo;
    }

    public void logException(java.lang.Throwable th) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging exceptions.")) {
            if (th == null) {
                io.fabric.sdk.android.Fabric.getLogger().log(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
            } else {
                this.controller.writeNonFatalException(java.lang.Thread.currentThread(), th);
            }
        }
    }

    public void log(java.lang.String str) {
        doLog(3, TAG, str);
    }

    private void doLog(int i, java.lang.String str, java.lang.String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.writeToLog(java.lang.System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    public void log(int i, java.lang.String str, java.lang.String str2) {
        doLog(i, str, str2);
        io.fabric.sdk.android.Fabric.getLogger().log(i, "" + str, "" + str2, true);
    }

    public void setUserIdentifier(java.lang.String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            java.lang.String strSanitizeAttribute = sanitizeAttribute(str);
            this.userId = strSanitizeAttribute;
            this.controller.cacheUserData(strSanitizeAttribute, this.userName, this.userEmail);
        }
    }

    public void setUserName(java.lang.String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            java.lang.String strSanitizeAttribute = sanitizeAttribute(str);
            this.userName = strSanitizeAttribute;
            this.controller.cacheUserData(this.userId, strSanitizeAttribute, this.userEmail);
        }
    }

    public void setUserEmail(java.lang.String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            java.lang.String strSanitizeAttribute = sanitizeAttribute(str);
            this.userEmail = strSanitizeAttribute;
            this.controller.cacheUserData(this.userId, this.userName, strSanitizeAttribute);
        }
    }

    public void setString(java.lang.String str, java.lang.String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting keys.")) {
            if (str == null) {
                android.content.Context context = getContext();
                if (context != null && io.fabric.sdk.android.services.common.CommonUtils.isAppDebuggable(context)) {
                    throw new java.lang.IllegalArgumentException("Custom attribute key must not be null.");
                }
                io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
            java.lang.String strSanitizeAttribute = sanitizeAttribute(str);
            if (this.attributes.size() >= 64 && !this.attributes.containsKey(strSanitizeAttribute)) {
                io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Exceeded maximum number of custom attributes (64)");
            } else {
                this.attributes.put(strSanitizeAttribute, str2 == null ? "" : sanitizeAttribute(str2));
                this.controller.cacheKeyData(this.attributes);
            }
        }
    }

    public void setBool(java.lang.String str, boolean z) {
        setString(str, java.lang.Boolean.toString(z));
    }

    public void setDouble(java.lang.String str, double d) {
        setString(str, java.lang.Double.toString(d));
    }

    public void setFloat(java.lang.String str, float f) {
        setString(str, java.lang.Float.toString(f));
    }

    public void setInt(java.lang.String str, int i) {
        setString(str, java.lang.Integer.toString(i));
    }

    public void setLong(java.lang.String str, long j) {
        setString(str, java.lang.Long.toString(j));
    }

    public void crash() {
        new com.crashlytics.android.core.CrashTest().indexOutOfBounds();
    }

    public boolean verifyPinning(java.net.URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Could not verify SSL pinning", e);
            return false;
        }
    }

    @java.lang.Deprecated
    public synchronized void setListener(com.crashlytics.android.core.CrashlyticsListener crashlyticsListener) {
        io.fabric.sdk.android.Fabric.getLogger().w(TAG, "Use of setListener is deprecated.");
        if (crashlyticsListener == null) {
            throw new java.lang.IllegalArgumentException("listener must not be null.");
        }
        this.listener = crashlyticsListener;
    }

    java.util.Map<java.lang.String, java.lang.String> getAttributes() {
        return java.util.Collections.unmodifiableMap(this.attributes);
    }

    com.crashlytics.android.core.CrashlyticsController getController() {
        return this.controller;
    }

    java.lang.String getUserIdentifier() {
        if (getIdManager().canCollectUserIds()) {
            return this.userId;
        }
        return null;
    }

    java.lang.String getUserEmail() {
        if (getIdManager().canCollectUserIds()) {
            return this.userEmail;
        }
        return null;
    }

    java.lang.String getUserName() {
        if (getIdManager().canCollectUserIds()) {
            return this.userName;
        }
        return null;
    }

    private void finishInitSynchronously() {
        io.fabric.sdk.android.services.concurrency.PriorityCallable<java.lang.Void> priorityCallable = new io.fabric.sdk.android.services.concurrency.PriorityCallable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsCore.1
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                return com.crashlytics.android.core.CrashlyticsCore.this.doInBackground();
            }

            @Override // io.fabric.sdk.android.services.concurrency.PriorityTask, io.fabric.sdk.android.services.concurrency.PriorityProvider
            public io.fabric.sdk.android.services.concurrency.Priority getPriority() {
                return io.fabric.sdk.android.services.concurrency.Priority.IMMEDIATE;
            }
        };
        java.util.Iterator<io.fabric.sdk.android.services.concurrency.Task> it = getDependencies().iterator();
        while (it.hasNext()) {
            priorityCallable.addDependency(it.next());
        }
        java.util.concurrent.Future futureSubmit = getFabric().getExecutorService().submit(priorityCallable);
        io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(4L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Crashlytics was interrupted during initialization.", e);
        } catch (java.util.concurrent.ExecutionException e2) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Problem encountered during Crashlytics initialization.", e2);
        } catch (java.util.concurrent.TimeoutException e3) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Crashlytics timed out during initialization.", e3);
        }
    }

    void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new java.util.concurrent.Callable<java.lang.Void>() { // from class: com.crashlytics.android.core.CrashlyticsCore.2
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() throws java.lang.Exception {
                com.crashlytics.android.core.CrashlyticsCore.this.initializationMarker.create();
                io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Initialization marker file created.");
                return null;
            }
        });
    }

    void markInitializationComplete() {
        this.backgroundWorker.submit(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsCore.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Boolean call() throws java.lang.Exception {
                try {
                    boolean zRemove = com.crashlytics.android.core.CrashlyticsCore.this.initializationMarker.remove();
                    io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Initialization marker file removed: " + zRemove);
                    return java.lang.Boolean.valueOf(zRemove);
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.core.CrashlyticsCore.TAG, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return false;
                }
            }
        });
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    void setCrashlyticsNdkDataProvider(com.crashlytics.android.core.CrashlyticsNdkDataProvider crashlyticsNdkDataProvider) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider;
    }

    com.crashlytics.android.core.CrashlyticsNdkData getNativeCrashData() {
        com.crashlytics.android.core.CrashlyticsNdkDataProvider crashlyticsNdkDataProvider = this.crashlyticsNdkDataProvider;
        if (crashlyticsNdkDataProvider != null) {
            return crashlyticsNdkDataProvider.getCrashlyticsNdkData();
        }
        return null;
    }

    boolean internalVerifyPinning(java.net.URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        io.fabric.sdk.android.services.network.HttpRequest httpRequestBuildHttpRequest = this.httpRequestFactory.buildHttpRequest(io.fabric.sdk.android.services.network.HttpMethod.GET, url.toString());
        ((javax.net.ssl.HttpsURLConnection) httpRequestBuildHttpRequest.getConnection()).setInstanceFollowRedirects(false);
        httpRequestBuildHttpRequest.code();
        return true;
    }

    private void checkForPreviousCrash() {
        if (java.lang.Boolean.TRUE.equals((java.lang.Boolean) this.backgroundWorker.submitAndWait(new com.crashlytics.android.core.CrashlyticsCore.CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    void createCrashMarker() {
        this.crashMarker.create();
    }

    private static java.lang.String formatLogMessage(int i, java.lang.String str, java.lang.String str2) {
        return io.fabric.sdk.android.services.common.CommonUtils.logPriorityToString(i) + "/" + str + " " + str2;
    }

    private static boolean ensureFabricWithCalled(java.lang.String str) {
        com.crashlytics.android.core.CrashlyticsCore crashlyticsCore = getInstance();
        if (crashlyticsCore != null && crashlyticsCore.controller != null) {
            return true;
        }
        io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Crashlytics must be initialized by calling Fabric.with(Context) " + str, null);
        return false;
    }

    private static java.lang.String sanitizeAttribute(java.lang.String str) {
        if (str == null) {
            return str;
        }
        java.lang.String strTrim = str.trim();
        return strTrim.length() > 1024 ? strTrim.substring(0, 1024) : strTrim;
    }

    private static final class CrashMarkerCheck implements java.util.concurrent.Callable<java.lang.Boolean> {
        private final com.crashlytics.android.core.CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(com.crashlytics.android.core.CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public java.lang.Boolean call() throws java.lang.Exception {
            if (!this.crashMarker.isPresent()) {
                return java.lang.Boolean.FALSE;
            }
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Found previous crash marker.");
            this.crashMarker.remove();
            return java.lang.Boolean.TRUE;
        }
    }

    private static final class NoOpListener implements com.crashlytics.android.core.CrashlyticsListener {
        @Override // com.crashlytics.android.core.CrashlyticsListener
        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }

        private NoOpListener() {
        }
    }

    static boolean isBuildIdValid(java.lang.String str, boolean z) {
        if (!z) {
            io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Configured not to require a build ID.");
            return true;
        }
        if (!io.fabric.sdk.android.services.common.CommonUtils.isNullOrEmpty(str)) {
            return true;
        }
        android.util.Log.e(TAG, ".");
        android.util.Log.e(TAG, ".     |  | ");
        android.util.Log.e(TAG, ".     |  |");
        android.util.Log.e(TAG, ".     |  |");
        android.util.Log.e(TAG, ".   \\ |  | /");
        android.util.Log.e(TAG, ".    \\    /");
        android.util.Log.e(TAG, ".     \\  /");
        android.util.Log.e(TAG, ".      \\/");
        android.util.Log.e(TAG, ".");
        android.util.Log.e(TAG, MISSING_BUILD_ID_MSG);
        android.util.Log.e(TAG, ".");
        android.util.Log.e(TAG, ".      /\\");
        android.util.Log.e(TAG, ".     /  \\");
        android.util.Log.e(TAG, ".    /    \\");
        android.util.Log.e(TAG, ".   / |  | \\");
        android.util.Log.e(TAG, ".     |  |");
        android.util.Log.e(TAG, ".     |  |");
        android.util.Log.e(TAG, ".     |  |");
        android.util.Log.e(TAG, ".");
        return false;
    }
}
