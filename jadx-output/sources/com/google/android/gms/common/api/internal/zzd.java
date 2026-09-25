package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzd implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zzbi;
    private final /* synthetic */ java.lang.String zzbj;
    private final /* synthetic */ com.google.android.gms.common.api.internal.zzc zzbl;

    zzd(com.google.android.gms.common.api.internal.zzc zzcVar, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.zzbl = zzcVar;
        this.zzbi = lifecycleCallback;
        this.zzbj = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbl.zzbg > 0) {
            this.zzbi.onCreate(this.zzbl.zzbh != null ? this.zzbl.zzbh.getBundle(this.zzbj) : null);
        }
        if (this.zzbl.zzbg >= 2) {
            this.zzbi.onStart();
        }
        if (this.zzbl.zzbg >= 3) {
            this.zzbi.onResume();
        }
        if (this.zzbl.zzbg >= 4) {
            this.zzbi.onStop();
        }
        if (this.zzbl.zzbg >= 5) {
            this.zzbi.onDestroy();
        }
    }
}
