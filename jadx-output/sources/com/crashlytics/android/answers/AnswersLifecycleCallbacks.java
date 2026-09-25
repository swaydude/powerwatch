package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersLifecycleCallbacks extends io.fabric.sdk.android.ActivityLifecycleManager.Callbacks {
    private final com.crashlytics.android.answers.SessionAnalyticsManager analyticsManager;
    private final com.crashlytics.android.answers.BackgroundManager backgroundManager;

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    public AnswersLifecycleCallbacks(com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager, com.crashlytics.android.answers.BackgroundManager backgroundManager) {
        this.analyticsManager = sessionAnalyticsManager;
        this.backgroundManager = backgroundManager;
    }

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.analyticsManager.onLifecycle(activity, com.crashlytics.android.answers.SessionEvent.Type.START);
    }

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.analyticsManager.onLifecycle(activity, com.crashlytics.android.answers.SessionEvent.Type.RESUME);
        this.backgroundManager.onActivityResumed();
    }

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivityPaused(android.app.Activity activity) {
        this.analyticsManager.onLifecycle(activity, com.crashlytics.android.answers.SessionEvent.Type.PAUSE);
        this.backgroundManager.onActivityPaused();
    }

    @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
    public void onActivityStopped(android.app.Activity activity) {
        this.analyticsManager.onLifecycle(activity, com.crashlytics.android.answers.SessionEvent.Type.STOP);
    }
}
