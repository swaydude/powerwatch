package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhq {
    final android.content.Context zza;
    java.lang.String zzb;
    java.lang.String zzc;
    java.lang.String zzd;
    java.lang.Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzv zzg;
    boolean zzh;

    public zzhq(android.content.Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        this.zzh = true;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        if (zzvVar != null) {
            this.zzg = zzvVar;
            this.zzb = zzvVar.zzf;
            this.zzc = zzvVar.zze;
            this.zzd = zzvVar.zzd;
            this.zzh = zzvVar.zzc;
            this.zzf = zzvVar.zzb;
            if (zzvVar.zzg != null) {
                this.zze = java.lang.Boolean.valueOf(zzvVar.zzg.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
