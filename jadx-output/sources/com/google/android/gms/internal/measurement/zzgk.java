package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgk implements com.google.android.gms.internal.measurement.zzgh {
    zzgk() {
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final java.util.Map<?, ?> zza(java.lang.Object obj) {
        return (com.google.android.gms.internal.measurement.zzgi) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final com.google.android.gms.internal.measurement.zzgf<?, ?> zzf(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final java.util.Map<?, ?> zzb(java.lang.Object obj) {
        return (com.google.android.gms.internal.measurement.zzgi) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final boolean zzc(java.lang.Object obj) {
        return !((com.google.android.gms.internal.measurement.zzgi) obj).zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final java.lang.Object zzd(java.lang.Object obj) {
        ((com.google.android.gms.internal.measurement.zzgi) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final java.lang.Object zze(java.lang.Object obj) {
        return com.google.android.gms.internal.measurement.zzgi.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final java.lang.Object zza(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zzgi zzgiVarZzb = (com.google.android.gms.internal.measurement.zzgi) obj;
        com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) obj2;
        if (!zzgiVar.isEmpty()) {
            if (!zzgiVarZzb.zzd()) {
                zzgiVarZzb = zzgiVarZzb.zzb();
            }
            zzgiVarZzb.zza(zzgiVar);
        }
        return zzgiVarZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzgh
    public final int zza(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) obj;
        if (zzgiVar.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = zzgiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }
}
