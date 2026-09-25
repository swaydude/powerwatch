package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzez extends com.google.android.gms.internal.clearcut.zzex<com.google.android.gms.internal.clearcut.zzey, com.google.android.gms.internal.clearcut.zzey> {
    zzez() {
    }

    private static void zza(java.lang.Object obj, com.google.android.gms.internal.clearcut.zzey zzeyVar) {
        ((com.google.android.gms.internal.clearcut.zzcg) obj).zzjp = zzeyVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ void zza(com.google.android.gms.internal.clearcut.zzey zzeyVar, int i, long j) {
        zzeyVar.zzb(i << 3, java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ void zza(com.google.android.gms.internal.clearcut.zzey zzeyVar, int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) {
        zzeyVar.zzb((i << 3) | 2, zzbbVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ void zza(com.google.android.gms.internal.clearcut.zzey zzeyVar, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        zzeyVar.zzb(zzfrVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final void zzc(java.lang.Object obj) {
        ((com.google.android.gms.internal.clearcut.zzcg) obj).zzjp.zzv();
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ void zzc(com.google.android.gms.internal.clearcut.zzey zzeyVar, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        zzeyVar.zza(zzfrVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ com.google.android.gms.internal.clearcut.zzey zzdz() {
        return com.google.android.gms.internal.clearcut.zzey.zzeb();
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ void zze(java.lang.Object obj, com.google.android.gms.internal.clearcut.zzey zzeyVar) {
        zza(obj, zzeyVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ void zzf(java.lang.Object obj, com.google.android.gms.internal.clearcut.zzey zzeyVar) {
        zza(obj, zzeyVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ com.google.android.gms.internal.clearcut.zzey zzg(com.google.android.gms.internal.clearcut.zzey zzeyVar, com.google.android.gms.internal.clearcut.zzey zzeyVar2) {
        com.google.android.gms.internal.clearcut.zzey zzeyVar3 = zzeyVar;
        com.google.android.gms.internal.clearcut.zzey zzeyVar4 = zzeyVar2;
        return zzeyVar4.equals(com.google.android.gms.internal.clearcut.zzey.zzea()) ? zzeyVar3 : com.google.android.gms.internal.clearcut.zzey.zza(zzeyVar3, zzeyVar4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ int zzm(com.google.android.gms.internal.clearcut.zzey zzeyVar) {
        return zzeyVar.zzas();
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ com.google.android.gms.internal.clearcut.zzey zzq(java.lang.Object obj) {
        return ((com.google.android.gms.internal.clearcut.zzcg) obj).zzjp;
    }

    @Override // com.google.android.gms.internal.clearcut.zzex
    final /* synthetic */ int zzr(com.google.android.gms.internal.clearcut.zzey zzeyVar) {
        return zzeyVar.zzec();
    }
}
