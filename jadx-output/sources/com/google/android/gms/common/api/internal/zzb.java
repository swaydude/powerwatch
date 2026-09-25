package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzb implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zzbi;
    private final /* synthetic */ java.lang.String zzbj;
    private final /* synthetic */ com.google.android.gms.common.api.internal.zza zzbk;

    zzb(com.google.android.gms.common.api.internal.zza zzaVar, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.zzbk = zzaVar;
        this.zzbi = lifecycleCallback;
        this.zzbj = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbk.zzbg > 0) {
            this.zzbi.onCreate(this.zzbk.zzbh != null ? this.zzbk.zzbh.getBundle(this.zzbj) : null);
        }
        if (this.zzbk.zzbg >= 2) {
            this.zzbi.onStart();
        }
        if (this.zzbk.zzbg >= 3) {
            this.zzbi.onResume();
        }
        if (this.zzbk.zzbg >= 4) {
            this.zzbi.onStop();
        }
        if (this.zzbk.zzbg >= 5) {
            this.zzbi.onDestroy();
        }
    }
}
