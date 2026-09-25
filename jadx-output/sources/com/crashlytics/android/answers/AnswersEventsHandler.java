package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersEventsHandler implements io.fabric.sdk.android.services.events.EventsStorageListener {
    private final android.content.Context context;
    final java.util.concurrent.ScheduledExecutorService executor;
    private final com.crashlytics.android.answers.AnswersFilesManagerProvider filesManagerProvider;
    private final com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    private final io.fabric.sdk.android.Kit kit;
    private final com.crashlytics.android.answers.SessionMetadataCollector metadataCollector;
    private final io.fabric.sdk.android.services.network.HttpRequestFactory requestFactory;
    com.crashlytics.android.answers.SessionAnalyticsManagerStrategy strategy = new com.crashlytics.android.answers.DisabledSessionAnalyticsManagerStrategy();

    public AnswersEventsHandler(io.fabric.sdk.android.Kit kit, android.content.Context context, com.crashlytics.android.answers.AnswersFilesManagerProvider answersFilesManagerProvider, com.crashlytics.android.answers.SessionMetadataCollector sessionMetadataCollector, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.crashlytics.android.answers.FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter) {
        this.kit = kit;
        this.context = context;
        this.filesManagerProvider = answersFilesManagerProvider;
        this.metadataCollector = sessionMetadataCollector;
        this.requestFactory = httpRequestFactory;
        this.executor = scheduledExecutorService;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter;
    }

    public void processEventAsync(com.crashlytics.android.answers.SessionEvent.Builder builder) {
        processEvent(builder, false, false);
    }

    public void processEventAsyncAndFlush(com.crashlytics.android.answers.SessionEvent.Builder builder) {
        processEvent(builder, false, true);
    }

    public void processEventSync(com.crashlytics.android.answers.SessionEvent.Builder builder) {
        processEvent(builder, true, false);
    }

    public void setAnalyticsSettingsData(final io.fabric.sdk.android.services.settings.AnalyticsSettingsData analyticsSettingsData, final java.lang.String str) {
        executeAsync(new java.lang.Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.crashlytics.android.answers.AnswersEventsHandler.this.strategy.setAnalyticsSettingsData(analyticsSettingsData, str);
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to set analytics settings data", e);
                }
            }
        });
    }

    public void disable() {
        executeAsync(new java.lang.Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.crashlytics.android.answers.SessionAnalyticsManagerStrategy sessionAnalyticsManagerStrategy = com.crashlytics.android.answers.AnswersEventsHandler.this.strategy;
                    com.crashlytics.android.answers.AnswersEventsHandler.this.strategy = new com.crashlytics.android.answers.DisabledSessionAnalyticsManagerStrategy();
                    sessionAnalyticsManagerStrategy.deleteAllEvents();
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to disable events", e);
                }
            }
        });
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorageListener
    public void onRollOver(java.lang.String str) {
        executeAsync(new java.lang.Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.crashlytics.android.answers.AnswersEventsHandler.this.strategy.sendEvents();
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to send events files", e);
                }
            }
        });
    }

    public void enable() {
        executeAsync(new java.lang.Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.crashlytics.android.answers.SessionEventMetadata metadata = com.crashlytics.android.answers.AnswersEventsHandler.this.metadataCollector.getMetadata();
                    com.crashlytics.android.answers.SessionAnalyticsFilesManager analyticsFilesManager = com.crashlytics.android.answers.AnswersEventsHandler.this.filesManagerProvider.getAnalyticsFilesManager();
                    analyticsFilesManager.registerRollOverListener(com.crashlytics.android.answers.AnswersEventsHandler.this);
                    com.crashlytics.android.answers.AnswersEventsHandler answersEventsHandler = com.crashlytics.android.answers.AnswersEventsHandler.this;
                    answersEventsHandler.strategy = new com.crashlytics.android.answers.EnabledSessionAnalyticsManagerStrategy(answersEventsHandler.kit, com.crashlytics.android.answers.AnswersEventsHandler.this.context, com.crashlytics.android.answers.AnswersEventsHandler.this.executor, analyticsFilesManager, com.crashlytics.android.answers.AnswersEventsHandler.this.requestFactory, metadata, com.crashlytics.android.answers.AnswersEventsHandler.this.firebaseAnalyticsApiAdapter);
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to enable events", e);
                }
            }
        });
    }

    public void flushEvents() {
        executeAsync(new java.lang.Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.crashlytics.android.answers.AnswersEventsHandler.this.strategy.rollFileOver();
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to flush events", e);
                }
            }
        });
    }

    void processEvent(final com.crashlytics.android.answers.SessionEvent.Builder builder, boolean z, final boolean z2) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.crashlytics.android.answers.AnswersEventsHandler.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.crashlytics.android.answers.AnswersEventsHandler.this.strategy.processEvent(builder);
                    if (z2) {
                        com.crashlytics.android.answers.AnswersEventsHandler.this.strategy.rollFileOver();
                    }
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to process event", e);
                }
            }
        };
        if (z) {
            executeSync(runnable);
        } else {
            executeAsync(runnable);
        }
    }

    private void executeSync(java.lang.Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to run events task", e);
        }
    }

    private void executeAsync(java.lang.Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(com.crashlytics.android.answers.Answers.TAG, "Failed to submit events task", e);
        }
    }
}
