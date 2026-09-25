package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.Task zzg;
    private final /* synthetic */ com.google.android.gms.tasks.zzi zzm;

    zzj(com.google.android.gms.tasks.zzi zziVar, com.google.android.gms.tasks.Task task) {
        this.zzm = zziVar;
        this.zzg = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzm.mLock) {
            if (this.zzm.zzl != null) {
                this.zzm.zzl.onComplete(this.zzg);
            }
        }
    }
}
