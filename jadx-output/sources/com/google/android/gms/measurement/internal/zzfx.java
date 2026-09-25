package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfx {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzft zze;

    private zzfx(com.google.android.gms.measurement.internal.zzft zzftVar, java.lang.String str, long j) {
        this.zze = zzftVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0);
        this.zza = java.lang.String.valueOf(str).concat(":start");
        this.zzb = java.lang.String.valueOf(str).concat(":count");
        this.zzc = java.lang.String.valueOf(str).concat(":value");
        this.zzd = j;
    }

    private final void zzb() {
        this.zze.zzd();
        long jCurrentTimeMillis = this.zze.zzm().currentTimeMillis();
        android.content.SharedPreferences.Editor editorEdit = this.zze.zzg().edit();
        editorEdit.remove(this.zzb);
        editorEdit.remove(this.zzc);
        editorEdit.putLong(this.zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public final void zza(java.lang.String str, long j) {
        this.zze.zzd();
        if (zzc() == 0) {
            zzb();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.zze.zzg().getLong(this.zzb, 0L);
        if (j2 <= 0) {
            android.content.SharedPreferences.Editor editorEdit = this.zze.zzg().edit();
            editorEdit.putString(this.zzc, str);
            editorEdit.putLong(this.zzb, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.zze.zzp().zzh().nextLong() & kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) < kotlin.jvm.internal.LongCompanionObject.MAX_VALUE / j3;
        android.content.SharedPreferences.Editor editorEdit2 = this.zze.zzg().edit();
        if (z) {
            editorEdit2.putString(this.zzc, str);
        }
        editorEdit2.putLong(this.zzb, j3);
        editorEdit2.apply();
    }

    public final android.util.Pair<java.lang.String, java.lang.Long> zza() {
        long jAbs;
        this.zze.zzd();
        this.zze.zzd();
        long jZzc = zzc();
        if (jZzc == 0) {
            zzb();
            jAbs = 0;
        } else {
            jAbs = java.lang.Math.abs(jZzc - this.zze.zzm().currentTimeMillis());
        }
        long j = this.zzd;
        if (jAbs < j) {
            return null;
        }
        if (jAbs > (j << 1)) {
            zzb();
            return null;
        }
        java.lang.String string = this.zze.zzg().getString(this.zzc, null);
        long j2 = this.zze.zzg().getLong(this.zzb, 0L);
        zzb();
        if (string == null || j2 <= 0) {
            return com.google.android.gms.measurement.internal.zzft.zza;
        }
        return new android.util.Pair<>(string, java.lang.Long.valueOf(j2));
    }

    private final long zzc() {
        return this.zze.zzg().getLong(this.zza, 0L);
    }
}
