package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgp extends com.google.android.gms.measurement.internal.zzfb {
    private final com.google.android.gms.measurement.internal.zzks zza;
    private java.lang.Boolean zzb;
    private java.lang.String zzc;

    public zzgp(com.google.android.gms.measurement.internal.zzks zzksVar) {
        this(zzksVar, null);
    }

    private zzgp(com.google.android.gms.measurement.internal.zzks zzksVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzksVar);
        this.zza = zzksVar;
        this.zzc = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zzb(com.google.android.gms.measurement.internal.zzm zzmVar) {
        zzb(zzmVar, false);
        zza(new com.google.android.gms.measurement.internal.zzgs(this, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzan zzanVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        zzb(zzmVar, false);
        zza(new com.google.android.gms.measurement.internal.zzgx(this, zzanVar, zzmVar));
    }

    final com.google.android.gms.measurement.internal.zzan zzb(com.google.android.gms.measurement.internal.zzan zzanVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        boolean z = false;
        if ("_cmp".equals(zzanVar.zza) && zzanVar.zzb != null && zzanVar.zzb.zza() != 0) {
            java.lang.String strZzd = zzanVar.zzb.zzd("_cis");
            if (!android.text.TextUtils.isEmpty(strZzd) && (("referrer broadcast".equals(strZzd) || "referrer API".equals(strZzd)) && this.zza.zzb().zze(zzmVar.zza, com.google.android.gms.measurement.internal.zzap.zzaq))) {
                z = true;
            }
        }
        if (!z) {
            return zzanVar;
        }
        this.zza.zzr().zzv().zza("Event has been filtered ", zzanVar.toString());
        return new com.google.android.gms.measurement.internal.zzan("_cmpx", zzanVar.zzb, zzanVar.zzc, zzanVar.zzd);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zza(str, true);
        zza(new com.google.android.gms.measurement.internal.zzha(this, zzanVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final byte[] zza(com.google.android.gms.measurement.internal.zzan zzanVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        zza(str, true);
        this.zza.zzr().zzw().zza("Log and bundle. event", this.zza.zzi().zza(zzanVar.zza));
        long jNanoTime = this.zza.zzm().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzq().zzb(new com.google.android.gms.measurement.internal.zzgz(this, zzanVar, str)).get();
            if (bArr == null) {
                this.zza.zzr().zzf().zza("Log and bundle returned null. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                bArr = new byte[0];
            }
            this.zza.zzr().zzw().zza("Log and bundle processed. event, size, time_ms", this.zza.zzi().zza(zzanVar.zza), java.lang.Integer.valueOf(bArr.length), java.lang.Long.valueOf((this.zza.zzm().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to log and bundle. appId, event, error", com.google.android.gms.measurement.internal.zzfk.zza(str), this.zza.zzi().zza(zzanVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzkz zzkzVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkzVar);
        zzb(zzmVar, false);
        zza(new com.google.android.gms.measurement.internal.zzhc(this, zzkzVar, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zza(com.google.android.gms.measurement.internal.zzm zzmVar, boolean z) {
        zzb(zzmVar, false);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzlb> list = (java.util.List) this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzhb(this, zzmVar)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzlb zzlbVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzla.zze(zzlbVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzkz(zzlbVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zza.zzb().zze(zzmVar.zza, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                this.zza.zzr().zzf().zza("Failed to get user properties. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzmVar.zza), e);
                return null;
            }
            this.zza.zzr().zzf().zza("Failed to get user attributes. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzmVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzm zzmVar) {
        zzb(zzmVar, false);
        zza(new com.google.android.gms.measurement.internal.zzhe(this, zzmVar));
    }

    private final void zzb(com.google.android.gms.measurement.internal.zzm zzmVar, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzmVar);
        zza(zzmVar.zza, false);
        this.zza.zzj().zza(zzmVar.zzb, zzmVar.zzr, zzmVar.zzv);
    }

    private final void zza(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.zza.zzr().zzf().zza("Measurement Service called without app package");
            throw new java.lang.SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    this.zzb = java.lang.Boolean.valueOf("com.google.android.gms".equals(this.zzc) || com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(this.zza.zzn(), android.os.Binder.getCallingUid()) || com.google.android.gms.common.GoogleSignatureVerifier.getInstance(this.zza.zzn()).isUidGoogleSigned(android.os.Binder.getCallingUid()));
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (java.lang.SecurityException e) {
                this.zza.zzr().zzf().zza("Measurement Service called with invalid calling package. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                throw e;
            }
        }
        if (this.zzc == null && com.google.android.gms.common.GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzn(), android.os.Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
        } else {
            throw new java.lang.SecurityException(java.lang.String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(long j, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zza(new com.google.android.gms.measurement.internal.zzhd(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.lang.String zzc(com.google.android.gms.measurement.internal.zzm zzmVar) {
        zzb(zzmVar, false);
        return this.zza.zzd(zzmVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzv zzvVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar.zzc);
        zzb(zzmVar, false);
        com.google.android.gms.measurement.internal.zzv zzvVar2 = new com.google.android.gms.measurement.internal.zzv(zzvVar);
        zzvVar2.zza = zzmVar.zza;
        zza(new com.google.android.gms.measurement.internal.zzhg(this, zzvVar2, zzmVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(com.google.android.gms.measurement.internal.zzv zzvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar.zzc);
        zza(zzvVar.zza, true);
        zza(new com.google.android.gms.measurement.internal.zzgr(this, new com.google.android.gms.measurement.internal.zzv(zzvVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zza(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.measurement.internal.zzm zzmVar) {
        zzb(zzmVar, false);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzlb> list = (java.util.List) this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzgu(this, zzmVar, str, str2)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzlb zzlbVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzla.zze(zzlbVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzkz(zzlbVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zza.zzb().zze(zzmVar.zza, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                this.zza.zzr().zzf().zza("Failed to query user properties. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzmVar.zza), e);
            } else {
                this.zza.zzr().zzf().zza("Failed to get user attributes. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzmVar.zza), e);
            }
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzkz> zza(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        zza(str, true);
        try {
            java.util.List<com.google.android.gms.measurement.internal.zzlb> list = (java.util.List) this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzgt(this, str, str2, str3)).get();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.google.android.gms.measurement.internal.zzlb zzlbVar : list) {
                if (z || !com.google.android.gms.measurement.internal.zzla.zze(zzlbVar.zzc)) {
                    arrayList.add(new com.google.android.gms.measurement.internal.zzkz(zzlbVar));
                }
            }
            return arrayList;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zza.zzb().zze(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                this.zza.zzr().zzf().zza("Failed to get user properties as. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            } else {
                this.zza.zzr().zzf().zza("Failed to get user attributes. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            }
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzm zzmVar) {
        zzb(zzmVar, false);
        try {
            return (java.util.List) this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzgw(this, zzmVar, str, str2)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            this.zza.zzr().zzf().zza("Failed to get conditional user properties", e);
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zza(str, true);
        try {
            return (java.util.List) this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzgv(this, str, str2, str3)).get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zza.zzb().zze(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                this.zza.zzr().zzf().zza("Failed to get conditional user properties as", e);
            } else {
                this.zza.zzr().zzf().zza("Failed to get conditional user properties", e);
            }
            return java.util.Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zzd(com.google.android.gms.measurement.internal.zzm zzmVar) {
        zza(zzmVar.zza, false);
        zza(new com.google.android.gms.measurement.internal.zzgy(this, zzmVar));
    }

    private final void zza(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        if (this.zza.zzq().zzg()) {
            runnable.run();
        } else {
            this.zza.zzq().zza(runnable);
        }
    }
}
