package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhx implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzho zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhp zzb;

    zzhx(com.google.android.gms.measurement.internal.zzhp zzhpVar, com.google.android.gms.measurement.internal.zzho zzhoVar) {
        this.zzb = zzhpVar;
        this.zza = zzhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
    }
}
