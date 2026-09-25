package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EnabledEventsStrategy<T> implements io.fabric.sdk.android.services.events.EventsStrategy<T> {
    static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    protected final android.content.Context context;
    final java.util.concurrent.ScheduledExecutorService executorService;
    protected final io.fabric.sdk.android.services.events.EventsFilesManager<T> filesManager;
    volatile int rolloverIntervalSeconds = -1;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledFuture<?>> scheduledRolloverFutureRef = new java.util.concurrent.atomic.AtomicReference<>();

    public EnabledEventsStrategy(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, io.fabric.sdk.android.services.events.EventsFilesManager<T> eventsFilesManager) {
        this.context = context;
        this.executorService = scheduledExecutorService;
        this.filesManager = eventsFilesManager;
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver(this.rolloverIntervalSeconds, this.rolloverIntervalSeconds);
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventsManager
    public void sendEvents() {
        sendAndCleanUpIfSuccess();
    }

    @Override // io.fabric.sdk.android.services.events.FileRollOverManager
    public void cancelTimeBasedFileRollOver() {
        if (this.scheduledRolloverFutureRef.get() != null) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            this.scheduledRolloverFutureRef.get().cancel(false);
            this.scheduledRolloverFutureRef.set(null);
        }
    }

    @Override // io.fabric.sdk.android.services.events.EventsManager
    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    @Override // io.fabric.sdk.android.services.events.EventsManager
    public void recordEvent(T t) {
        io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, t.toString());
        try {
            this.filesManager.writeEvent(t);
        } catch (java.io.IOException e) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to write event.", e);
        }
        scheduleTimeBasedRollOverIfNeeded();
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

    protected void configureRollover(int i) {
        this.rolloverIntervalSeconds = i;
        scheduleTimeBasedFileRollOver(0L, this.rolloverIntervalSeconds);
    }

    public int getRollover() {
        return this.rolloverIntervalSeconds;
    }

    void scheduleTimeBasedFileRollOver(long j, long j2) {
        if (this.scheduledRolloverFutureRef.get() == null) {
            io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable timeBasedFileRollOverRunnable = new io.fabric.sdk.android.services.events.TimeBasedFileRollOverRunnable(this.context, this);
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.scheduledRolloverFutureRef.set(this.executorService.scheduleAtFixedRate(timeBasedFileRollOverRunnable, j, j2, java.util.concurrent.TimeUnit.SECONDS));
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to schedule time based file roll over", e);
            }
        }
    }

    void sendAndCleanUpIfSuccess() {
        io.fabric.sdk.android.services.events.FilesSender filesSender = getFilesSender();
        if (filesSender == null) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Sending all files");
        java.util.List<java.io.File> batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int size = 0;
        while (batchOfFilesToSend.size() > 0) {
            try {
                io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, java.lang.String.format(java.util.Locale.US, "attempt to send batch of %d files", java.lang.Integer.valueOf(batchOfFilesToSend.size())));
                boolean zSend = filesSender.send(batchOfFilesToSend);
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
}
