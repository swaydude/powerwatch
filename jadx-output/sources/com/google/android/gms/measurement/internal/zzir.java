package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzir extends com.google.android.gms.measurement.internal.zzkp {
    public zzir(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    public final byte[] zza(com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) {
        com.google.android.gms.measurement.internal.zzlb next;
        com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVar;
        byte[] bArr;
        long j;
        com.google.android.gms.measurement.internal.zzaj zzajVarZza;
        zzd();
        this.zzx.zzaf();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (!zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzbf)) {
            zzr().zzw().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzanVar.zza) && !"_iapx".equals(zzanVar.zza)) {
            zzr().zzw().zza("Generating a payload for this event is not available. package_name, event_name", str, zzanVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzbr.zzf.zza zzaVarZzb = com.google.android.gms.internal.measurement.zzbr.zzf.zzb();
        zzi().zzf();
        try {
            com.google.android.gms.measurement.internal.zzg zzgVarZzb = zzi().zzb(str);
            if (zzgVarZzb == null) {
                zzr().zzw().zza("Log and bundle not available. package_name", str);
                byte[] bArr2 = new byte[0];
                zzi().zzh();
                return bArr2;
            }
            if (!zzgVarZzb.zzr()) {
                zzr().zzw().zza("Log and bundle disabled. package_name", str);
                byte[] bArr3 = new byte[0];
                zzi().zzh();
                return bArr3;
            }
            com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVarZza = com.google.android.gms.internal.measurement.zzbr.zzg.zzbf().zza(1).zza("android");
            if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzc())) {
                zzaVarZza.zzf(zzgVarZzb.zzc());
            }
            if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzn())) {
                zzaVarZza.zze(zzgVarZzb.zzn());
            }
            if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzl())) {
                zzaVarZza.zzg(zzgVarZzb.zzl());
            }
            if (zzgVarZzb.zzm() != -2147483648L) {
                zzaVarZza.zzh((int) zzgVarZzb.zzm());
            }
            zzaVarZza.zzf(zzgVarZzb.zzo()).zzk(zzgVarZzb.zzq());
            if (com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zze(zzgVarZzb.zzc(), com.google.android.gms.measurement.internal.zzap.zzch)) {
                if (!android.text.TextUtils.isEmpty(zzgVarZzb.zze())) {
                    zzaVarZza.zzk(zzgVarZzb.zze());
                } else if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzg())) {
                    zzaVarZza.zzp(zzgVarZzb.zzg());
                } else if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzf())) {
                    zzaVarZza.zzo(zzgVarZzb.zzf());
                }
            } else if (!android.text.TextUtils.isEmpty(zzgVarZzb.zze())) {
                zzaVarZza.zzk(zzgVarZzb.zze());
            } else if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzf())) {
                zzaVarZza.zzo(zzgVarZzb.zzf());
            }
            zzaVarZza.zzh(zzgVarZzb.zzp());
            if (this.zzx.zzab() && zzt().zzf(zzaVarZza.zzj())) {
                zzaVarZza.zzj();
                if (!android.text.TextUtils.isEmpty(null)) {
                    zzaVarZza.zzn(null);
                }
            }
            android.util.Pair<java.lang.String, java.lang.Boolean> pairZza = zzs().zza(zzgVarZzb.zzc());
            if (zzgVarZzb.zzaf() && pairZza != null && !android.text.TextUtils.isEmpty((java.lang.CharSequence) pairZza.first)) {
                try {
                    zzaVarZza.zzh(zza((java.lang.String) pairZza.first, java.lang.Long.toString(zzanVar.zzd)));
                    if (pairZza.second != null) {
                        zzaVarZza.zza(((java.lang.Boolean) pairZza.second).booleanValue());
                    }
                } catch (java.lang.SecurityException e) {
                    zzr().zzw().zza("Resettable device id encryption failed", e.getMessage());
                    byte[] bArr4 = new byte[0];
                    zzi().zzh();
                    return bArr4;
                }
            }
            zzl().zzaa();
            com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVarZzc = zzaVarZza.zzc(android.os.Build.MODEL);
            zzl().zzaa();
            zzaVarZzc.zzb(android.os.Build.VERSION.RELEASE).zzf((int) zzl().zzf()).zzd(zzl().zzg());
            try {
                zzaVarZza.zzi(zza(zzgVarZzb.zzd(), java.lang.Long.toString(zzanVar.zzd)));
                if (!android.text.TextUtils.isEmpty(zzgVarZzb.zzi())) {
                    zzaVarZza.zzl(zzgVarZzb.zzi());
                }
                java.lang.String strZzc = zzgVarZzb.zzc();
                java.util.List<com.google.android.gms.measurement.internal.zzlb> listZza = zzi().zza(strZzc);
                java.util.Iterator<com.google.android.gms.measurement.internal.zzlb> it = listZza.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!"_lte".equals(next.zzc));
                if (next == null || next.zze == null) {
                    com.google.android.gms.measurement.internal.zzlb zzlbVar = new com.google.android.gms.measurement.internal.zzlb(strZzc, kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzm().currentTimeMillis(), 0L);
                    listZza.add(zzlbVar);
                    zzi().zza(zzlbVar);
                }
                if (zzt().zze(strZzc, com.google.android.gms.measurement.internal.zzap.zzbc)) {
                    com.google.android.gms.measurement.internal.zzkw zzkwVarZzg = zzg();
                    zzkwVarZzg.zzr().zzx().zza("Checking account type status for ad personalization signals");
                    if (zzkwVarZzg.zzl().zzj()) {
                        java.lang.String strZzc2 = zzgVarZzb.zzc();
                        if (zzgVarZzb.zzaf() && zzkwVarZzg.zzj().zze(strZzc2)) {
                            zzkwVarZzg.zzr().zzw().zza("Turning off ad personalization due to account type");
                            java.util.Iterator<com.google.android.gms.measurement.internal.zzlb> it2 = listZza.iterator();
                            while (it2.hasNext()) {
                                if ("_npa".equals(it2.next().zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            listZza.add(new com.google.android.gms.measurement.internal.zzlb(strZzc2, kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzkwVarZzg.zzm().currentTimeMillis(), 1L));
                        }
                    }
                }
                com.google.android.gms.internal.measurement.zzbr.zzk[] zzkVarArr = new com.google.android.gms.internal.measurement.zzbr.zzk[listZza.size()];
                for (int i = 0; i < listZza.size(); i++) {
                    com.google.android.gms.internal.measurement.zzbr.zzk.zza zzaVarZza2 = com.google.android.gms.internal.measurement.zzbr.zzk.zzj().zza(listZza.get(i).zzc).zza(listZza.get(i).zzd);
                    zzg().zza(zzaVarZza2, listZza.get(i).zze);
                    zzkVarArr[i] = (com.google.android.gms.internal.measurement.zzbr.zzk) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZza2.zzu());
                }
                zzaVarZza.zzb(java.util.Arrays.asList(zzkVarArr));
                android.os.Bundle bundleZzb = zzanVar.zzb.zzb();
                bundleZzb.putLong("_c", 1L);
                zzr().zzw().zza("Marking in-app purchase as real-time");
                bundleZzb.putLong("_r", 1L);
                bundleZzb.putString("_o", zzanVar.zzc);
                if (zzp().zzf(zzaVarZza.zzj())) {
                    zzp().zza(bundleZzb, "_dbg", (java.lang.Object) 1L);
                    zzp().zza(bundleZzb, "_r", (java.lang.Object) 1L);
                }
                com.google.android.gms.measurement.internal.zzaj zzajVarZza2 = zzi().zza(str, zzanVar.zza);
                if (zzajVarZza2 == null) {
                    zzaVar = zzaVarZza;
                    bArr = null;
                    zzajVarZza = new com.google.android.gms.measurement.internal.zzaj(str, zzanVar.zza, 0L, 0L, zzanVar.zzd, 0L, null, null, null, null);
                    j = 0;
                } else {
                    zzaVar = zzaVarZza;
                    bArr = null;
                    j = zzajVarZza2.zzf;
                    zzajVarZza = zzajVarZza2.zza(zzanVar.zzd);
                }
                zzi().zza(zzajVarZza);
                com.google.android.gms.measurement.internal.zzak zzakVar = new com.google.android.gms.measurement.internal.zzak(this.zzx, zzanVar.zzc, str, zzanVar.zza, zzanVar.zzd, j, bundleZzb);
                com.google.android.gms.internal.measurement.zzbr.zzc.zza zzaVarZzb2 = com.google.android.gms.internal.measurement.zzbr.zzc.zzj().zza(zzakVar.zzc).zza(zzakVar.zzb).zzb(zzakVar.zzd);
                for (java.lang.String str2 : zzakVar.zze) {
                    com.google.android.gms.internal.measurement.zzbr.zze.zza zzaVarZza3 = com.google.android.gms.internal.measurement.zzbr.zze.zzk().zza(str2);
                    zzg().zza(zzaVarZza3, zzakVar.zze.zza(str2));
                    zzaVarZzb2.zza(zzaVarZza3);
                }
                com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVar2 = zzaVar;
                zzaVar2.zza(zzaVarZzb2).zza(com.google.android.gms.internal.measurement.zzbr.zzh.zza().zza(com.google.android.gms.internal.measurement.zzbr.zzd.zza().zza(zzajVarZza.zzc).zza(zzanVar.zza)));
                zzaVar2.zzc(e_().zza(zzgVarZzb.zzc(), java.util.Collections.emptyList(), zzaVar2.zzd(), java.lang.Long.valueOf(zzaVarZzb2.zzf()), java.lang.Long.valueOf(zzaVarZzb2.zzf())));
                if (zzaVarZzb2.zze()) {
                    zzaVar2.zzb(zzaVarZzb2.zzf()).zzc(zzaVarZzb2.zzf());
                }
                long jZzk = zzgVarZzb.zzk();
                if (jZzk != 0) {
                    zzaVar2.zze(jZzk);
                }
                long jZzj = zzgVarZzb.zzj();
                if (jZzj != 0) {
                    zzaVar2.zzd(jZzj);
                } else if (jZzk != 0) {
                    zzaVar2.zzd(jZzk);
                }
                zzgVarZzb.zzv();
                com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVarZza4 = zzaVar2.zzg((int) zzgVarZzb.zzs()).zzg(zzt().zze()).zza(zzm().currentTimeMillis());
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                zzaVarZza4.zzb(true);
                zzaVarZzb.zza(zzaVar2);
                zzgVarZzb.zza(zzaVar2.zzf());
                zzgVarZzb.zzb(zzaVar2.zzg());
                zzi().zza(zzgVarZzb);
                zzi().b_();
                zzi().zzh();
                try {
                    return zzg().zzc(((com.google.android.gms.internal.measurement.zzbr.zzf) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzb.zzu())).zzbi());
                } catch (java.io.IOException e2) {
                    zzr().zzf().zza("Data loss. Failed to bundle and serialize. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e2);
                    return bArr;
                }
            } catch (java.lang.SecurityException e3) {
                zzr().zzw().zza("app instance id encryption failed", e3.getMessage());
                byte[] bArr5 = new byte[0];
                zzi().zzh();
                return bArr5;
            }
        } catch (java.lang.Throwable th) {
            zzi().zzh();
            throw th;
        }
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        throw new java.lang.SecurityException("This implementation should not be used.");
    }
}
