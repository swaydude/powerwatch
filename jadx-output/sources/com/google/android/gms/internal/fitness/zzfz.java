package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfz extends com.google.android.gms.internal.fitness.zzfw<com.google.android.gms.internal.fitness.zzgg.zzc> {
    zzfz() {
    }

    @Override // com.google.android.gms.internal.fitness.zzfw
    final boolean zze(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        return zzhoVar instanceof com.google.android.gms.internal.fitness.zzgg.zzd;
    }

    @Override // com.google.android.gms.internal.fitness.zzfw
    final com.google.android.gms.internal.fitness.zzgb<com.google.android.gms.internal.fitness.zzgg.zzc> zza(java.lang.Object obj) {
        return ((com.google.android.gms.internal.fitness.zzgg.zzd) obj).zzvi;
    }

    @Override // com.google.android.gms.internal.fitness.zzfw
    final com.google.android.gms.internal.fitness.zzgb<com.google.android.gms.internal.fitness.zzgg.zzc> zzb(java.lang.Object obj) {
        com.google.android.gms.internal.fitness.zzgg.zzd zzdVar = (com.google.android.gms.internal.fitness.zzgg.zzd) obj;
        if (zzdVar.zzvi.isImmutable()) {
            zzdVar.zzvi = (com.google.android.gms.internal.fitness.zzgb) zzdVar.zzvi.clone();
        }
        return zzdVar.zzvi;
    }

    @Override // com.google.android.gms.internal.fitness.zzfw
    final void zzc(java.lang.Object obj) {
        zza(obj).zzal();
    }

    @Override // com.google.android.gms.internal.fitness.zzfw
    final int zza(java.util.Map.Entry<?, ?> entry) {
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.fitness.zzfw
    final void zza(com.google.android.gms.internal.fitness.zzjo zzjoVar, java.util.Map.Entry<?, ?> entry) throws java.io.IOException {
        throw new java.lang.NoSuchMethodError();
    }
}
