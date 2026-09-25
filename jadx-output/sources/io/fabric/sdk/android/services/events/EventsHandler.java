package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EventsHandler<T> implements io.fabric.sdk.android.services.events.EventsStorageListener {
    protected final android.content.Context context;
    protected final java.util.concurrent.ScheduledExecutorService executor;
    protected io.fabric.sdk.android.services.events.EventsStrategy<T> strategy;

    protected abstract io.fabric.sdk.android.services.events.EventsStrategy<T> getDisabledEventsStrategy();

    public EventsHandler(android.content.Context context, io.fabric.sdk.android.services.events.EventsStrategy<T> eventsStrategy, io.fabric.sdk.android.services.events.EventsFilesManager eventsFilesManager, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.context = context.getApplicationContext();
        this.executor = scheduledExecutorService;
        this.strategy = eventsStrategy;
        eventsFilesManager.registerRollOverListener(this);
    }

    public void recordEventAsync(final T t, final boolean z) {
        executeAsync(new java.lang.Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.fabric.sdk.android.services.events.EventsHandler.this.strategy.recordEvent((T) t);
                    if (z) {
                        io.fabric.sdk.android.services.events.EventsHandler.this.strategy.rollFileOver();
                    }
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.services.common.CommonUtils.logControlledError(io.fabric.sdk.android.services.events.EventsHandler.this.context, "Failed to record event.", e);
                }
            }
        });
    }

    public void recordEventSync(final T t) {
        executeSync(new java.lang.Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.fabric.sdk.android.services.events.EventsHandler.this.strategy.recordEvent((T) t);
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.services.common.CommonUtils.logControlledError(io.fabric.sdk.android.services.events.EventsHandler.this.context, "Crashlytics failed to record event", e);
                }
            }
        });
    }

    @Override // io.fabric.sdk.android.services.events.EventsStorageListener
    public void onRollOver(java.lang.String str) {
        executeAsync(new java.lang.Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.fabric.sdk.android.services.events.EventsHandler.this.strategy.sendEvents();
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.services.common.CommonUtils.logControlledError(io.fabric.sdk.android.services.events.EventsHandler.this.context, "Failed to send events files.", e);
                }
            }
        });
    }

    public void disable() {
        executeAsync(new java.lang.Runnable() { // from class: io.fabric.sdk.android.services.events.EventsHandler.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    io.fabric.sdk.android.services.events.EventsStrategy<T> eventsStrategy = io.fabric.sdk.android.services.events.EventsHandler.this.strategy;
                    io.fabric.sdk.android.services.events.EventsHandler eventsHandler = io.fabric.sdk.android.services.events.EventsHandler.this;
                    eventsHandler.strategy = eventsHandler.getDisabledEventsStrategy();
                    eventsStrategy.deleteAllEvents();
                } catch (java.lang.Exception e) {
                    io.fabric.sdk.android.services.common.CommonUtils.logControlledError(io.fabric.sdk.android.services.events.EventsHandler.this.context, "Failed to disable events.", e);
                }
            }
        });
    }

    protected void executeSync(java.lang.Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to run events task", e);
        }
    }

    protected void executeAsync(java.lang.Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to submit events task", e);
        }
    }
}
