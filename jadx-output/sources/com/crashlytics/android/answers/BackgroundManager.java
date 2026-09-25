package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class BackgroundManager {
    private static final int BACKGROUND_DELAY = 5000;
    private final java.util.concurrent.ScheduledExecutorService executorService;
    private final java.util.List<com.crashlytics.android.answers.BackgroundManager.Listener> listeners = new java.util.ArrayList();
    private volatile boolean flushOnBackground = true;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledFuture<?>> backgroundFutureRef = new java.util.concurrent.atomic.AtomicReference<>();
    boolean inBackground = true;

    public interface Listener {
        void onBackground();
    }

    public BackgroundManager(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    public void setFlushOnBackground(boolean z) {
        this.flushOnBackground = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackground() {
        java.util.Iterator<com.crashlytics.android.answers.BackgroundManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBackground();
        }
    }

    public void registerListener(com.crashlytics.android.answers.BackgroundManager.Listener listener) {
        this.listeners.add(listener);
    }

    public void onActivityResumed() {
        this.inBackground = false;
        java.util.concurrent.ScheduledFuture<?> andSet = this.backgroundFutureRef.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    public void onActivityPaused() {
        if (!this.flushOnBackground || this.inBackground) {
            return;
        }
        this.inBackground = true;
        try {
            this.backgroundFutureRef.compareAndSet(null, this.executorService.schedule(new java.lang.Runnable() { // from class: com.crashlytics.android.answers.BackgroundManager.1
                @Override // java.lang.Runnable
                public void run() {
                    com.crashlytics.android.answers.BackgroundManager.this.backgroundFutureRef.set(null);
                    com.crashlytics.android.answers.BackgroundManager.this.notifyBackground();
                }
            }, 5000L, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.answers.Answers.TAG, "Failed to schedule background detector", e);
        }
    }
}
