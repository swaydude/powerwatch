package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzga {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private boolean zzc;
    private java.lang.String zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzft zze;

    public zzga(com.google.android.gms.measurement.internal.zzft zzftVar, java.lang.String str, java.lang.String str2) {
        this.zze = zzftVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = null;
    }

    public final java.lang.String zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getString(this.zza, null);
        }
        return this.zzd;
    }

    public final void zza(java.lang.String str) {
        if (this.zze.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcs) || !com.google.android.gms.measurement.internal.zzla.zzc(str, this.zzd)) {
            android.content.SharedPreferences.Editor editorEdit = this.zze.zzg().edit();
            editorEdit.putString(this.zza, str);
            editorEdit.apply();
            this.zzd = str;
        }
    }
}
