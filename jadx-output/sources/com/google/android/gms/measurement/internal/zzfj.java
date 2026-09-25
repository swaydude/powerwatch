package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfj implements java.lang.Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ java.lang.String zzb;
    private final /* synthetic */ java.lang.Object zzc;
    private final /* synthetic */ java.lang.Object zzd;
    private final /* synthetic */ java.lang.Object zze;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzf;

    zzfj(com.google.android.gms.measurement.internal.zzfk zzfkVar, int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zzf = zzfkVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzft zzftVarZzc = this.zzf.zzx.zzc();
        if (!zzftVarZzc.zzz()) {
            this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.zzf.zza == 0) {
            if (this.zzf.zzt().zzf()) {
                com.google.android.gms.measurement.internal.zzfk zzfkVar = this.zzf;
                zzfkVar.zzu();
                zzfkVar.zza = 'C';
            } else {
                com.google.android.gms.measurement.internal.zzfk zzfkVar2 = this.zzf;
                zzfkVar2.zzu();
                zzfkVar2.zza = 'c';
            }
        }
        if (this.zzf.zzb < 0) {
            com.google.android.gms.measurement.internal.zzfk zzfkVar3 = this.zzf;
            zzfkVar3.zzb = zzfkVar3.zzt().zze();
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        char c = this.zzf.zza;
        long j = this.zzf.zzb;
        java.lang.String strZza = com.google.android.gms.measurement.internal.zzfk.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZza).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strZza);
        java.lang.String string = sb.toString();
        if (string.length() > 1024) {
            string = this.zzb.substring(0, 1024);
        }
        zzftVarZzc.zzb.zza(string, 1L);
    }
}
