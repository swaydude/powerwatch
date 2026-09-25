package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgb implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzd zza;
    private final /* synthetic */ android.content.ServiceConnection zzb;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgc zzc;

    zzgb(com.google.android.gms.measurement.internal.zzgc zzgcVar, com.google.android.gms.internal.measurement.zzd zzdVar, android.content.ServiceConnection serviceConnection) {
        this.zzc = zzgcVar;
        this.zza = zzdVar;
        this.zzb = serviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzfz zzfzVar = this.zzc.zza;
        java.lang.String str = this.zzc.zzb;
        com.google.android.gms.internal.measurement.zzd zzdVar = this.zza;
        android.content.ServiceConnection serviceConnection = this.zzb;
        android.os.Bundle bundleZza = zzfzVar.zza(str, zzdVar);
        zzfzVar.zza.zzq().zzd();
        if (bundleZza != null) {
            long j = bundleZza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzfzVar.zza.zzr().zzf().zza("Service response is missing Install Referrer install timestamp");
            } else {
                java.lang.String string = bundleZza.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfzVar.zza.zzr().zzf().zza("No referrer defined in Install Referrer response");
                } else {
                    zzfzVar.zza.zzr().zzx().zza("InstallReferrer API result", string);
                    com.google.android.gms.measurement.internal.zzla zzlaVarZzi = zzfzVar.zza.zzi();
                    java.lang.String strValueOf = java.lang.String.valueOf(string);
                    android.os.Bundle bundleZza2 = zzlaVarZzi.zza(android.net.Uri.parse(strValueOf.length() != 0 ? "?".concat(strValueOf) : new java.lang.String("?")));
                    if (bundleZza2 == null) {
                        zzfzVar.zza.zzr().zzf().zza("No campaign params defined in Install Referrer result");
                    } else {
                        java.lang.String string2 = bundleZza2.getString(com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM);
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = bundleZza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzfzVar.zza.zzr().zzf().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                bundleZza2.putLong("click_timestamp", j2);
                                if (j == zzfzVar.zza.zzc().zzi.zza()) {
                                    zzfzVar.zza.zzu();
                                    zzfzVar.zza.zzr().zzx().zza("Install Referrer campaign has already been logged");
                                } else if (com.google.android.gms.internal.measurement.zzkh.zzb() || !zzfzVar.zza.zzb().zza(com.google.android.gms.measurement.internal.zzap.zzcx) || zzfzVar.zza.zzab()) {
                                    zzfzVar.zza.zzc().zzi.zza(j);
                                    zzfzVar.zza.zzu();
                                    zzfzVar.zza.zzr().zzx().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                                    bundleZza2.putString("_cis", "referrer API");
                                    zzfzVar.zza.zzh().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundleZza2);
                                }
                            }
                        } else if (j == zzfzVar.zza.zzc().zzi.zza()) {
                            zzfzVar.zza.zzu();
                            zzfzVar.zza.zzr().zzx().zza("Install Referrer campaign has already been logged");
                        } else if (com.google.android.gms.internal.measurement.zzkh.zzb()) {
                            zzfzVar.zza.zzc().zzi.zza(j);
                            zzfzVar.zza.zzu();
                            zzfzVar.zza.zzr().zzx().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                            bundleZza2.putString("_cis", "referrer API");
                            zzfzVar.zza.zzh().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundleZza2);
                        } else {
                            zzfzVar.zza.zzc().zzi.zza(j);
                            zzfzVar.zza.zzu();
                            zzfzVar.zza.zzr().zzx().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                            bundleZza2.putString("_cis", "referrer API");
                            zzfzVar.zza.zzh().zza(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundleZza2);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(zzfzVar.zza.zzn(), serviceConnection);
        }
    }
}
