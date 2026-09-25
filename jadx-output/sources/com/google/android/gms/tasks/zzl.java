package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzl implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.Task zzg;
    private final /* synthetic */ com.google.android.gms.tasks.zzk zzo;

    zzl(com.google.android.gms.tasks.zzk zzkVar, com.google.android.gms.tasks.Task task) {
        this.zzo = zzkVar;
        this.zzg = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzo.mLock) {
            if (this.zzo.zzn != null) {
                this.zzo.zzn.onFailure(this.zzg.getException());
            }
        }
    }
}
