package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class AnswersRetryFilesSender implements io.fabric.sdk.android.services.events.FilesSender {
    private static final int BACKOFF_MS = 1000;
    private static final int BACKOFF_POWER = 8;
    private static final double JITTER_PERCENT = 0.1d;
    private static final int MAX_RETRIES = 5;
    private final com.crashlytics.android.answers.SessionAnalyticsFilesSender filesSender;
    private final com.crashlytics.android.answers.RetryManager retryManager;

    public static com.crashlytics.android.answers.AnswersRetryFilesSender build(com.crashlytics.android.answers.SessionAnalyticsFilesSender sessionAnalyticsFilesSender) {
        return new com.crashlytics.android.answers.AnswersRetryFilesSender(sessionAnalyticsFilesSender, new com.crashlytics.android.answers.RetryManager(new io.fabric.sdk.android.services.concurrency.internal.RetryState(new com.crashlytics.android.answers.RandomBackoff(new io.fabric.sdk.android.services.concurrency.internal.ExponentialBackoff(1000L, 8), JITTER_PERCENT), new io.fabric.sdk.android.services.concurrency.internal.DefaultRetryPolicy(5))));
    }

    AnswersRetryFilesSender(com.crashlytics.android.answers.SessionAnalyticsFilesSender sessionAnalyticsFilesSender, com.crashlytics.android.answers.RetryManager retryManager) {
        this.filesSender = sessionAnalyticsFilesSender;
        this.retryManager = retryManager;
    }

    @Override // io.fabric.sdk.android.services.events.FilesSender
    public boolean send(java.util.List<java.io.File> list) {
        long jNanoTime = java.lang.System.nanoTime();
        if (this.retryManager.canRetry(jNanoTime)) {
            if (this.filesSender.send(list)) {
                this.retryManager.reset();
                return true;
            }
            this.retryManager.recordRetry(jNanoTime);
        }
        return false;
    }
}
