package com.google.android.gms.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
final class zza implements java.lang.Runnable {
    private final int priority;
    private final java.lang.Runnable zzhu;

    public zza(java.lang.Runnable runnable, int i) {
        this.zzhu = runnable;
        this.priority = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.priority);
        this.zzhu.run();
    }
}
