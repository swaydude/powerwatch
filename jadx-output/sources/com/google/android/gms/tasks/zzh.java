package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzh implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.zzg zzk;

    zzh(com.google.android.gms.tasks.zzg zzgVar) {
        this.zzk = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzk.mLock) {
            if (this.zzk.zzj != null) {
                this.zzk.zzj.onCanceled();
            }
        }
    }
}
