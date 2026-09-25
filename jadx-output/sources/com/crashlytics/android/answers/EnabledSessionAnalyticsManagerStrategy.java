package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class EnabledSessionAnalyticsManagerStrategy implements com.crashlytics.android.answers.SessionAnalyticsManagerStrategy {
    static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    private final android.content.Context context;
    private final java.util.concurrent.ScheduledExecutorService executorService;
    private final com.crashlytics.android.answers.SessionAnalyticsFilesManager filesManager;
    io.fabric.sdk.android.services.events.FilesSender filesSender;
    private final com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    private final io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory;
    private final io.fabric.sdk.android.Kit kit;
    final com.crashlytics.android.answers.SessionEventMetadata metadata;
    private final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledFuture<?>> rolloverFutureRef = new java.util.concurrent.atomic.AtomicReference<>();
    io.fabric.sdk.android.services.common.ApiKey apiKey = new io.fabric.sdk.android.services.common.ApiKey();
    com.crashlytics.android.answers.EventFilter eventFilter = new com.crashlytics.android.answers.KeepAllEventFilter();
    boolean customEventsEnabled = true;
    boolean predefinedEventsEnabled = true;
    volatile int rolloverIntervalSeconds = -1;
    boolean forwardToFirebaseAnalyticsEnabled = false;
    boolean includePurchaseEventsInForwardedEvents = false;

    public EnabledSessionAnalyticsManagerStrategy(io.fabric.sdk.android.Kit kit, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.crashlytics.android.answers.SessionAnalyticsFilesManager sessionAnalyticsFilesManager, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, com.crashlytics.android.answers.SessionEventMetadata sessionEventMetadata, com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter) {
        this.kit = kit;
        this.context = context;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = httpRequestFactory;
        this.metadata = sessionEventMetadata;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter;
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData, java.lang.String str) {
        this.filesSender = com.crashlytics.android.answers.AnswersRetryFilesSender.build(new com.crashlytics.android.answers.SessionAnalyticsFilesSender(this.kit, str, analyticsSettingsData.analyticsURL, this.httpRequestFactory, this.apiKey.getValue(this.context)));
        this.filesManager.setAnalyticsSettingsData(analyticsSettingsData);
        this.forwardToFirebaseAnalyticsEnabled = analyticsSettingsData.forwardToFirebaseAnalytics;
        this.includePurchaseEventsInForwardedEvents = analyticsSettingsData.includePurchaseEventsInForwardedEvents;
        io.fabric.sdk.android.Logger logger = io.fabric.sdk.android.Fabric.getLogger();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Firebase analytics forwarding ");
        sb.append(this.forwardToFirebaseAnalyticsEnabled ? "enabled" : "disabled");
        logger.d(com.crashlytics.android.answers.Answers.TAG, sb.toString());
        io.fabric.sdk.android.Logger logger2 = io.fabric.sdk.android.Fabric.getLogger();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("Firebase analytics including purchase events ");
        sb2.append(this.includePurchaseEventsInForwardedEvents ? "enabled" : "disabled");
        logger2.d(com.crashlytics.android.answers.Answers.TAG, sb2.toString());
        this.customEventsEnabled = analyticsSettingsData.trackCustomEvents;
        io.fabric.sdk.android.Logger logger3 = io.fabric.sdk.android.Fabric.getLogger();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append("Custom event tracking ");
        sb3.append(this.customEventsEnabled ? "enabled" : "disabled");
        logger3.d(com.crashlytics.android.answers.Answers.TAG, sb3.toString());
        this.predefinedEventsEnabled = analyticsSettingsData.trackPredefinedEvents;
        io.fabric.sdk.android.Logger logger4 = io.fabric.sdk.android.Fabric.getLogger();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append("Predefined event tracking ");
        sb4.append(this.predefinedEventsEnabled ? "enabled" : "disabled");
        logger4.d(com.crashlytics.android.answers.Answers.TAG, sb4.toString());
        if (analyticsSettingsData.samplingRate > 1) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Event sampling enabled");
            this.eventFilter = new com.crashlytics.android.answers.SamplingEventFilter(analyticsSettingsData.samplingRate);
        }
        this.rolloverIntervalSeconds = analyticsSettingsData.flushIntervalSeconds;
        scheduleTimeBasedFileRollOver(0L, this.rolloverIntervalSeconds);
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void processEvent(com.crashlytics.android.answers.SessionEvent.Builder builder) {
        com.crashlytics.android.answers.SessionEvent sessionEventBuild = builder.build(this.metadata);
        if (!this.customEventsEnabled && com.crashlytics.android.answers.SessionEvent.Type.CUSTOM.equals(sessionEventBuild.type)) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Custom events tracking disabled - skipping event: " + sessionEventBuild);
            return;
        }
        if (!this.predefinedEventsEnabled && com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED.equals(sessionEventBuild.type)) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Predefined events tracking disabled - skipping event: " + sessionEventBuild);
            return;
        }
        if (this.eventFilter.skipEvent(sessionEventBuild)) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Skipping filtered event: " + sessionEventBuild);
            return;
        }
        try {
            this.filesManager.writeEvent(sessionEventBuild);
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to write event: " + sessionEventBuild, e);
        }
        scheduleTimeBasedRollOverIfNeeded();
        boolean z = com.crashlytics.android.answers.SessionEvent.Type.CUSTOM.equals(sessionEventBuild.type) || com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED.equals(sessionEventBuild.type);
        boolean zEquals = "purchase".equals(sessionEventBuild.predefinedType);
        if (this.forwardToFirebaseAnalyticsEnabled && z) {
            if (!zEquals || this.includePurchaseEventsInForwardedEvents) {
                try {
                    this.firebaseAnalyticsApiAdapter.processEvent(sessionEventBuild);
                } catch (java.lang.Exception e2) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to map event to Firebase: " + sessionEventBuild, e2);
                }
            }
        }
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver(this.rolloverIntervalSeconds, this.rolloverIntervalSeconds);
        }
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void sendEvents() {
        if (this.filesSender == null) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Sending all files");
        java.util.List<java.io.File> batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int size = 0;
        while (batchOfFilesToSend.size() > 0) {
            try {
                io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, java.lang.String.format(java.util.Locale.US, "attempt to send batch of %d files", java.lang.Integer.valueOf(batchOfFilesToSend.size())));
                boolean zSend = this.filesSender.send(batchOfFilesToSend);
                if (zSend) {
                    size += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!zSend) {
                    break;
                } else {
                    batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
                }
            } catch (java.lang.Exception e) {
                io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to send batch of analytics files to server: " + e.getMessage(), e);
            }
        }
        if (size == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            this.rolloverFutureRef.get().cancel(false);
            this.rolloverFutureRef.set(null);
        }
    }

    @Override // com.crashlytics.android.answers.SessionAnalyticsManagerStrategy
    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to roll file over.", e);
            return false;
        }
    }

    void scheduleTimeBasedFileRollOver(long j, long j2) {
        if (this.rolloverFutureRef.get() == null) {
            io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable timeBasedFileRollOverRunnable = new io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable(this.context, this);
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(timeBasedFileRollOverRunnable, j, j2, java.util.concurrent.TimeUnit.SECONDS));
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to schedule time based file roll over", e);
            }
        }
    }
}
