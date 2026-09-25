package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjl extends com.google.android.gms.internal.vision.zzjj<com.google.android.gms.internal.vision.zzjm, com.google.android.gms.internal.vision.zzjm> {
    zzjl() {
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final boolean zza(com.google.android.gms.internal.vision.zzis zzisVar) {
        return false;
    }

    private static void zza(java.lang.Object obj, com.google.android.gms.internal.vision.zzjm zzjmVar) {
        ((com.google.android.gms.internal.vision.zzgs) obj).zzwd = zzjmVar;
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final void zzg(java.lang.Object obj) {
        ((com.google.android.gms.internal.vision.zzgs) obj).zzwd.zzdp();
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ int zzr(com.google.android.gms.internal.vision.zzjm zzjmVar) {
        return zzjmVar.zzgf();
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ int zzx(com.google.android.gms.internal.vision.zzjm zzjmVar) {
        return zzjmVar.zzii();
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ com.google.android.gms.internal.vision.zzjm zzh(com.google.android.gms.internal.vision.zzjm zzjmVar, com.google.android.gms.internal.vision.zzjm zzjmVar2) {
        com.google.android.gms.internal.vision.zzjm zzjmVar3 = zzjmVar;
        com.google.android.gms.internal.vision.zzjm zzjmVar4 = zzjmVar2;
        return zzjmVar4.equals(com.google.android.gms.internal.vision.zzjm.zzig()) ? zzjmVar3 : com.google.android.gms.internal.vision.zzjm.zza(zzjmVar3, zzjmVar4);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zzc(com.google.android.gms.internal.vision.zzjm zzjmVar, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        zzjmVar.zza(zzkgVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zza(com.google.android.gms.internal.vision.zzjm zzjmVar, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        zzjmVar.zzb(zzkgVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zzg(java.lang.Object obj, com.google.android.gms.internal.vision.zzjm zzjmVar) {
        zza(obj, zzjmVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ com.google.android.gms.internal.vision.zzjm zzw(java.lang.Object obj) {
        com.google.android.gms.internal.vision.zzjm zzjmVar = ((com.google.android.gms.internal.vision.zzgs) obj).zzwd;
        if (zzjmVar != com.google.android.gms.internal.vision.zzjm.zzig()) {
            return zzjmVar;
        }
        com.google.android.gms.internal.vision.zzjm zzjmVarZzih = com.google.android.gms.internal.vision.zzjm.zzih();
        zza(obj, zzjmVarZzih);
        return zzjmVarZzih;
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ com.google.android.gms.internal.vision.zzjm zzv(java.lang.Object obj) {
        return ((com.google.android.gms.internal.vision.zzgs) obj).zzwd;
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zzf(java.lang.Object obj, com.google.android.gms.internal.vision.zzjm zzjmVar) {
        zza(obj, zzjmVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ com.google.android.gms.internal.vision.zzjm zzn(com.google.android.gms.internal.vision.zzjm zzjmVar) {
        com.google.android.gms.internal.vision.zzjm zzjmVar2 = zzjmVar;
        zzjmVar2.zzdp();
        return zzjmVar2;
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ com.google.android.gms.internal.vision.zzjm zzif() {
        return com.google.android.gms.internal.vision.zzjm.zzih();
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zza(com.google.android.gms.internal.vision.zzjm zzjmVar, int i, com.google.android.gms.internal.vision.zzjm zzjmVar2) {
        zzjmVar.zzb((i << 3) | 3, zzjmVar2);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zza(com.google.android.gms.internal.vision.zzjm zzjmVar, int i, com.google.android.gms.internal.vision.zzfh zzfhVar) {
        zzjmVar.zzb((i << 3) | 2, zzfhVar);
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zzb(com.google.android.gms.internal.vision.zzjm zzjmVar, int i, long j) {
        zzjmVar.zzb((i << 3) | 1, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zzc(com.google.android.gms.internal.vision.zzjm zzjmVar, int i, int i2) {
        zzjmVar.zzb((i << 3) | 5, java.lang.Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.vision.zzjj
    final /* synthetic */ void zza(com.google.android.gms.internal.vision.zzjm zzjmVar, int i, long j) {
        zzjmVar.zzb(i << 3, java.lang.Long.valueOf(j));
    }
}
