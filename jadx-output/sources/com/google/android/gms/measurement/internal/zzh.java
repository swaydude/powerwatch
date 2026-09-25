package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzh implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzan zzb;
    private final /* synthetic */ java.lang.String zzc;
    private final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzd;

    zzh(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzn zznVar, com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = zznVar;
        this.zzb = zzanVar;
        this.zzc = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzw().zza(this.zza, this.zzb, this.zzc);
    }
}
