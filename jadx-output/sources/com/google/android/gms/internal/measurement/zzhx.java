package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhx extends com.google.android.gms.internal.measurement.zzhv<com.google.android.gms.internal.measurement.zzhy, com.google.android.gms.internal.measurement.zzhy> {
    zzhx() {
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final boolean zza(com.google.android.gms.internal.measurement.zzhe zzheVar) {
        return false;
    }

    /* JADX INFO: renamed from: zza, reason: avoid collision after fix types in other method */
    private static void zza2(java.lang.Object obj, com.google.android.gms.internal.measurement.zzhy zzhyVar) {
        ((com.google.android.gms.internal.measurement.zzfd) obj).zzb = zzhyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final void zzd(java.lang.Object obj) {
        ((com.google.android.gms.internal.measurement.zzfd) obj).zzb.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ int zzf(com.google.android.gms.internal.measurement.zzhy zzhyVar) {
        return zzhyVar.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ int zze(com.google.android.gms.internal.measurement.zzhy zzhyVar) {
        return zzhyVar.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ com.google.android.gms.internal.measurement.zzhy zzc(com.google.android.gms.internal.measurement.zzhy zzhyVar, com.google.android.gms.internal.measurement.zzhy zzhyVar2) {
        com.google.android.gms.internal.measurement.zzhy zzhyVar3 = zzhyVar;
        com.google.android.gms.internal.measurement.zzhy zzhyVar4 = zzhyVar2;
        return zzhyVar4.equals(com.google.android.gms.internal.measurement.zzhy.zza()) ? zzhyVar3 : com.google.android.gms.internal.measurement.zzhy.zza(zzhyVar3, zzhyVar4);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zzb(com.google.android.gms.internal.measurement.zzhy zzhyVar, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        zzhyVar.zza(zzisVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzhy zzhyVar, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        zzhyVar.zzb(zzisVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zzb(java.lang.Object obj, com.google.android.gms.internal.measurement.zzhy zzhyVar) {
        zza2(obj, zzhyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ com.google.android.gms.internal.measurement.zzhy zzc(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzhy zzhyVar = ((com.google.android.gms.internal.measurement.zzfd) obj).zzb;
        if (zzhyVar != com.google.android.gms.internal.measurement.zzhy.zza()) {
            return zzhyVar;
        }
        com.google.android.gms.internal.measurement.zzhy zzhyVarZzb = com.google.android.gms.internal.measurement.zzhy.zzb();
        zza2(obj, zzhyVarZzb);
        return zzhyVarZzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ com.google.android.gms.internal.measurement.zzhy zzb(java.lang.Object obj) {
        return ((com.google.android.gms.internal.measurement.zzfd) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, com.google.android.gms.internal.measurement.zzhy zzhyVar) {
        zza2(obj, zzhyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ com.google.android.gms.internal.measurement.zzhy zza(com.google.android.gms.internal.measurement.zzhy zzhyVar) {
        com.google.android.gms.internal.measurement.zzhy zzhyVar2 = zzhyVar;
        zzhyVar2.zzc();
        return zzhyVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ com.google.android.gms.internal.measurement.zzhy zza() {
        return com.google.android.gms.internal.measurement.zzhy.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzhy zzhyVar, int i, com.google.android.gms.internal.measurement.zzhy zzhyVar2) {
        zzhyVar.zza((i << 3) | 3, zzhyVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzhy zzhyVar, int i, com.google.android.gms.internal.measurement.zzdu zzduVar) {
        zzhyVar.zza((i << 3) | 2, zzduVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zzb(com.google.android.gms.internal.measurement.zzhy zzhyVar, int i, long j) {
        zzhyVar.zza((i << 3) | 1, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzhy zzhyVar, int i, int i2) {
        zzhyVar.zza((i << 3) | 5, java.lang.Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzhv
    final /* synthetic */ void zza(com.google.android.gms.internal.measurement.zzhy zzhyVar, int i, long j) {
        zzhyVar.zza(i << 3, java.lang.Long.valueOf(j));
    }
}
