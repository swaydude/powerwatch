package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacr implements android.os.IBinder.DeathRecipient, com.google.android.gms.common.api.internal.zacq {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.BasePendingResult<?>> zalf;
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.zac> zalg;
    private final java.lang.ref.WeakReference<android.os.IBinder> zalh;

    private zacr(com.google.android.gms.common.api.internal.BasePendingResult<?> basePendingResult, com.google.android.gms.common.api.zac zacVar, android.os.IBinder iBinder) {
        this.zalg = new java.lang.ref.WeakReference<>(zacVar);
        this.zalf = new java.lang.ref.WeakReference<>(basePendingResult);
        this.zalh = new java.lang.ref.WeakReference<>(iBinder);
    }

    @Override // com.google.android.gms.common.api.internal.zacq
    public final void zab(com.google.android.gms.common.api.internal.BasePendingResult<?> basePendingResult) {
        zabw();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        zabw();
    }

    private final void zabw() {
        com.google.android.gms.common.api.internal.BasePendingResult<?> basePendingResult = this.zalf.get();
        com.google.android.gms.common.api.zac zacVar = this.zalg.get();
        if (zacVar != null && basePendingResult != null) {
            zacVar.remove(basePendingResult.zal().intValue());
        }
        android.os.IBinder iBinder = this.zalh.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (java.util.NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ zacr(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, com.google.android.gms.common.api.zac zacVar, android.os.IBinder iBinder, com.google.android.gms.common.api.internal.zaco zacoVar) {
        this(basePendingResult, null, iBinder);
    }
}
