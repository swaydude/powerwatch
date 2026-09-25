package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class SessionAnalyticsManager implements com.crashlytics.android.answers.BackgroundManager.Listener {
    static final java.lang.String EXECUTOR_SERVICE = "Answers Events Handler";
    static final java.lang.String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
    final com.crashlytics.android.answers.BackgroundManager backgroundManager;
    final com.crashlytics.android.answers.AnswersEventsHandler eventsHandler;
    private final long installedAt;
    final io.fabric.sdk.android.ActivityLifecycleManager lifecycleManager;
    final com.crashlytics.android.answers.AnswersPreferenceManager preferenceManager;

    public void onError(java.lang.String str) {
    }

    public static com.crashlytics.android.answers.SessionAnalyticsManager build(io.fabric.sdk.android.Kit kit, android.content.Context context, io.fabric.sdk.android.services.common.IdManager idManager, java.lang.String str, java.lang.String str2, long j) {
        com.crashlytics.android.answers.SessionMetadataCollector sessionMetadataCollector = new com.crashlytics.android.answers.SessionMetadataCollector(context, idManager, str, str2);
        com.crashlytics.android.answers.AnswersFilesManagerProvider answersFilesManagerProvider = new com.crashlytics.android.answers.AnswersFilesManagerProvider(context, new io.fabric.sdk.android.services.persistence.FileStoreImpl(kit));
        io.fabric.sdk.android.services.network.DefaultHttpRequestFactory defaultHttpRequestFactory = new io.fabric.sdk.android.services.network.DefaultHttpRequestFactory(io.fabric.sdk.android.Fabric.getLogger());
        io.fabric.sdk.android.ActivityLifecycleManager activityLifecycleManager = new io.fabric.sdk.android.ActivityLifecycleManager(context);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceBuildSingleThreadScheduledExecutorService = io.fabric.sdk.android.services.common.ExecutorUtils.buildSingleThreadScheduledExecutorService(EXECUTOR_SERVICE);
        return new com.crashlytics.android.answers.SessionAnalyticsManager(new com.crashlytics.android.answers.AnswersEventsHandler(kit, context, answersFilesManagerProvider, sessionMetadataCollector, defaultHttpRequestFactory, scheduledExecutorServiceBuildSingleThreadScheduledExecutorService, new com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter(context)), activityLifecycleManager, new com.crashlytics.android.answers.BackgroundManager(scheduledExecutorServiceBuildSingleThreadScheduledExecutorService), com.crashlytics.android.answers.AnswersPreferenceManager.build(context), j);
    }

    SessionAnalyticsManager(com.crashlytics.android.answers.AnswersEventsHandler answersEventsHandler, io.fabric.sdk.android.ActivityLifecycleManager activityLifecycleManager, com.crashlytics.android.answers.BackgroundManager backgroundManager, com.crashlytics.android.answers.AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = activityLifecycleManager;
        this.backgroundManager = backgroundManager;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.registerCallbacks(new com.crashlytics.android.answers.AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public void disable() {
        this.lifecycleManager.resetCallbacks();
        this.eventsHandler.disable();
    }

    public void onCustom(com.crashlytics.android.answers.CustomEvent customEvent) {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Logged custom event: " + customEvent);
        this.eventsHandler.processEventAsync(com.crashlytics.android.answers.SessionEvent.customEventBuilder(customEvent));
    }

    public void onPredefined(com.crashlytics.android.answers.PredefinedEvent predefinedEvent) {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Logged predefined event: " + predefinedEvent);
        this.eventsHandler.processEventAsync(com.crashlytics.android.answers.SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void onCrash(java.lang.String str, java.lang.String str2) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException(ON_CRASH_ERROR_MSG);
        }
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Logged crash");
        this.eventsHandler.processEventSync(com.crashlytics.android.answers.SessionEvent.crashEventBuilder(str, str2));
    }

    public void onInstall(long j) {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Logged install");
        this.eventsHandler.processEventAsyncAndFlush(com.crashlytics.android.answers.SessionEvent.installEventBuilder(j));
    }

    public void onLifecycle(android.app.Activity activity, com.crashlytics.android.answers.SessionEvent.Type type) {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Logged lifecycle event: " + type.name());
        this.eventsHandler.processEventAsync(com.crashlytics.android.answers.SessionEvent.lifecycleEventBuilder(type, activity));
    }

    @Override // com.crashlytics.android.answers.BackgroundManager.Listener
    public void onBackground() {
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Flush events when app is backgrounded");
        this.eventsHandler.flushEvents();
    }

    public void setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData, java.lang.String str) {
        this.backgroundManager.setFlushOnBackground(analyticsSettingsData.flushOnBackground);
        this.eventsHandler.setAnalyticsSettingsData(analyticsSettingsData, str);
    }

    boolean isFirstLaunch() {
        return !this.preferenceManager.hasAnalyticsLaunched();
    }
}
