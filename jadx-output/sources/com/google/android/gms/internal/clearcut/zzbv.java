package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbv extends com.google.android.gms.internal.clearcut.zzbu<com.google.android.gms.internal.clearcut.zzcg.zze> {
    zzbv() {
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final int zza(java.util.Map.Entry<?, ?> entry) {
        return ((com.google.android.gms.internal.clearcut.zzcg.zze) entry.getKey()).number;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final com.google.android.gms.internal.clearcut.zzby<com.google.android.gms.internal.clearcut.zzcg.zze> zza(java.lang.Object obj) {
        return ((com.google.android.gms.internal.clearcut.zzcg.zzd) obj).zzjv;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final void zza(com.google.android.gms.internal.clearcut.zzfr zzfrVar, java.util.Map.Entry<?, ?> entry) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzcg.zze zzeVar = (com.google.android.gms.internal.clearcut.zzcg.zze) entry.getKey();
        switch (com.google.android.gms.internal.clearcut.zzbw.zzgq[zzeVar.zzjx.ordinal()]) {
            case 1:
                zzfrVar.zza(zzeVar.number, ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case 2:
                zzfrVar.zza(zzeVar.number, ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case 3:
                zzfrVar.zzi(zzeVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 4:
                zzfrVar.zza(zzeVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 5:
                zzfrVar.zzc(zzeVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 6:
                zzfrVar.zzc(zzeVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 7:
                zzfrVar.zzf(zzeVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 8:
                zzfrVar.zzb(zzeVar.number, ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                zzfrVar.zzd(zzeVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 10:
                zzfrVar.zzm(zzeVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 11:
                zzfrVar.zzj(zzeVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 12:
                zzfrVar.zze(zzeVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzfrVar.zzb(zzeVar.number, ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 14:
                zzfrVar.zzc(zzeVar.number, ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzfrVar.zza(zzeVar.number, (com.google.android.gms.internal.clearcut.zzbb) entry.getValue());
                break;
            case 16:
                zzfrVar.zza(zzeVar.number, (java.lang.String) entry.getValue());
                break;
            case 17:
                zzfrVar.zzb(zzeVar.number, entry.getValue(), com.google.android.gms.internal.clearcut.zzea.zzcm().zze(entry.getValue().getClass()));
                break;
            case 18:
                zzfrVar.zza(zzeVar.number, entry.getValue(), com.google.android.gms.internal.clearcut.zzea.zzcm().zze(entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final void zza(java.lang.Object obj, com.google.android.gms.internal.clearcut.zzby<com.google.android.gms.internal.clearcut.zzcg.zze> zzbyVar) {
        ((com.google.android.gms.internal.clearcut.zzcg.zzd) obj).zzjv = zzbyVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final com.google.android.gms.internal.clearcut.zzby<com.google.android.gms.internal.clearcut.zzcg.zze> zzb(java.lang.Object obj) {
        com.google.android.gms.internal.clearcut.zzby<com.google.android.gms.internal.clearcut.zzcg.zze> zzbyVarZza = zza(obj);
        if (!zzbyVarZza.isImmutable()) {
            return zzbyVarZza;
        }
        com.google.android.gms.internal.clearcut.zzby<com.google.android.gms.internal.clearcut.zzcg.zze> zzbyVar = (com.google.android.gms.internal.clearcut.zzby) zzbyVarZza.clone();
        zza(obj, zzbyVar);
        return zzbyVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final void zzc(java.lang.Object obj) {
        zza(obj).zzv();
    }

    @Override // com.google.android.gms.internal.clearcut.zzbu
    final boolean zze(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        return zzdoVar instanceof com.google.android.gms.internal.clearcut.zzcg.zzd;
    }
}
