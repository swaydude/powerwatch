package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzak {
    final java.lang.String zza;
    final java.lang.String zzb;
    final long zzc;
    final long zzd;
    final com.google.android.gms.measurement.internal.zzam zze;
    private final java.lang.String zzf;

    private zzak(com.google.android.gms.measurement.internal.zzgo zzgoVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, com.google.android.gms.measurement.internal.zzam zzamVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzamVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = android.text.TextUtils.isEmpty(str) ? null : str;
        this.zzc = j;
        this.zzd = j2;
        if (j2 != 0 && j2 > j) {
            zzgoVar.zzr().zzi().zza("Event created with reverse previous/current timestamps. appId, name", com.google.android.gms.measurement.internal.zzfk.zza(str2), com.google.android.gms.measurement.internal.zzfk.zza(str3));
        }
        this.zze = zzamVar;
    }

    zzak(com.google.android.gms.measurement.internal.zzgo zzgoVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzam zzamVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzf = android.text.TextUtils.isEmpty(str) ? null : str;
        this.zzc = j;
        this.zzd = j2;
        if (j2 != 0 && j2 > j) {
            zzgoVar.zzr().zzi().zza("Event created with reverse previous/current timestamps. appId", com.google.android.gms.measurement.internal.zzfk.zza(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    zzgoVar.zzr().zzf().zza("Param name can't be null");
                    it.remove();
                } else {
                    java.lang.Object objZza = zzgoVar.zzi().zza(next, bundle2.get(next));
                    if (objZza == null) {
                        zzgoVar.zzr().zzi().zza("Param value can't be null", zzgoVar.zzj().zzb(next));
                        it.remove();
                    } else {
                        zzgoVar.zzi().zza(bundle2, next, objZza);
                    }
                }
            }
            zzamVar = new com.google.android.gms.measurement.internal.zzam(bundle2);
        } else {
            zzamVar = new com.google.android.gms.measurement.internal.zzam(new android.os.Bundle());
        }
        this.zze = zzamVar;
    }

    final com.google.android.gms.measurement.internal.zzak zza(com.google.android.gms.measurement.internal.zzgo zzgoVar, long j) {
        return new com.google.android.gms.measurement.internal.zzak(zzgoVar, this.zzf, this.zza, this.zzb, this.zzc, j, this.zze);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zze);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 33 + java.lang.String.valueOf(str2).length() + java.lang.String.valueOf(strValueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
