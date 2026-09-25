package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzn implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.Task zzg;
    private final /* synthetic */ com.google.android.gms.tasks.zzm zzq;

    zzn(com.google.android.gms.tasks.zzm zzmVar, com.google.android.gms.tasks.Task task) {
        this.zzq = zzmVar;
        this.zzg = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzq.mLock) {
            if (this.zzq.zzp != null) {
                this.zzq.zzp.onSuccess(this.zzg.getResult());
            }
        }
    }
}
