package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfy {
    private final java.lang.String zza;
    private final long zzb;
    private boolean zzc;
    private long zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzft zze;

    public zzfy(com.google.android.gms.measurement.internal.zzft zzftVar, java.lang.String str, long j) {
        this.zze = zzftVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = j;
    }

    public final long zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getLong(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(long j) {
        android.content.SharedPreferences.Editor editorEdit = this.zze.zzg().edit();
        editorEdit.putLong(this.zza, j);
        editorEdit.apply();
        this.zzd = j;
    }
}
