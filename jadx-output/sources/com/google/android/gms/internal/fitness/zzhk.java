package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhk implements com.google.android.gms.internal.fitness.zzhh {
    zzhk() {
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final com.google.android.gms.internal.fitness.zzhf<?, ?> zzh(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final java.util.Map<?, ?> zzf(java.lang.Object obj) {
        return (com.google.android.gms.internal.fitness.zzhi) obj;
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final java.lang.Object zzg(java.lang.Object obj) {
        ((com.google.android.gms.internal.fitness.zzhi) obj).zzal();
        return obj;
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final java.lang.Object zzc(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.fitness.zzhi zzhiVarZzcc = (com.google.android.gms.internal.fitness.zzhi) obj;
        com.google.android.gms.internal.fitness.zzhi zzhiVar = (com.google.android.gms.internal.fitness.zzhi) obj2;
        if (!zzhiVar.isEmpty()) {
            if (!zzhiVarZzcc.isMutable()) {
                zzhiVarZzcc = zzhiVarZzcc.zzcc();
            }
            zzhiVarZzcc.zza(zzhiVar);
        }
        return zzhiVarZzcc;
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final int zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.fitness.zzhi zzhiVar = (com.google.android.gms.internal.fitness.zzhi) obj;
        if (zzhiVar.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = zzhiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }
}
