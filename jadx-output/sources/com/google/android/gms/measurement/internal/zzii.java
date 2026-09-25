package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzii implements java.lang.Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzii(com.google.android.gms.measurement.internal.zzhp zzhpVar, boolean z) {
        this.zzb = zzhpVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzd(this.zza);
    }
}
