package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BackgroundPriorityRunnable implements java.lang.Runnable {
    protected abstract void onRun();

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(10);
        onRun();
    }
}
