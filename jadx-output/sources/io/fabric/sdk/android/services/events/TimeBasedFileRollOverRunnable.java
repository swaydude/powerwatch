package io.fabric.sdk.android.services.events;

/* JADX INFO: loaded from: classes2.dex */
public class TimeBasedFileRollOverRunnable implements java.lang.Runnable {
    private final android.content.Context context;
    private final io.fabric.sdk.android.services.events.FileRollOverManager fileRollOverManager;

    public TimeBasedFileRollOverRunnable(android.content.Context context, io.fabric.sdk.android.services.events.FileRollOverManager fileRollOverManager) {
        this.context = context;
        this.fileRollOverManager = fileRollOverManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            io.fabric.sdk.android.services.common.CommonUtils.logControlled(this.context, "Performing time based file roll over.");
            if (this.fileRollOverManager.rollFileOver()) {
                return;
            }
            this.fileRollOverManager.cancelTimeBasedFileRollOver();
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.services.common.CommonUtils.logControlledError(this.context, "Failed to roll over file", e);
        }
    }
}
