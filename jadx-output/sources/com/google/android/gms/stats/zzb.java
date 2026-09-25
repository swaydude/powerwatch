package com.google.android.gms.stats;

/* JADX INFO: loaded from: classes.dex */
final class zzb implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.stats.WakeLock zzp;

    zzb(com.google.android.gms.stats.WakeLock wakeLock) {
        this.zzp = wakeLock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzp.zza(0);
    }
}
