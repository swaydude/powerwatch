package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzha extends com.google.android.gms.internal.clearcut.zzfu<com.google.android.gms.internal.clearcut.zzha> implements java.lang.Cloneable {
    public long zzbjf = 0;
    public long zzbjg = 0;
    private long zzbjh = 0;
    private java.lang.String tag = "";
    public int zzbji = 0;
    private java.lang.String zzbjj = "";
    private int zzbjk = 0;
    private boolean zzbjl = false;
    private com.google.android.gms.internal.clearcut.zzhb[] zzbjm = com.google.android.gms.internal.clearcut.zzhb.zzge();
    private byte[] zzbjn = com.google.android.gms.internal.clearcut.zzgb.zzse;
    private com.google.android.gms.internal.clearcut.zzge.zzd zzbjo = null;
    public byte[] zzbjp = com.google.android.gms.internal.clearcut.zzgb.zzse;
    private java.lang.String zzbjq = "";
    private java.lang.String zzbjr = "";
    private com.google.android.gms.internal.clearcut.zzgy zzbjs = null;
    private java.lang.String zzbjt = "";
    public long zzbju = 180000;
    private com.google.android.gms.internal.clearcut.zzgz zzbjv = null;
    public byte[] zzbjw = com.google.android.gms.internal.clearcut.zzgb.zzse;
    private java.lang.String zzbjx = "";
    private int zzbjy = 0;
    private int[] zzbjz = com.google.android.gms.internal.clearcut.zzgb.zzrx;
    private long zzbka = 0;
    private com.google.android.gms.internal.clearcut.zzge.zzs zzbkb = null;
    public boolean zzbkc = false;

    public zzha() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzgd, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.clearcut.zzha clone() {
        try {
            com.google.android.gms.internal.clearcut.zzha zzhaVar = (com.google.android.gms.internal.clearcut.zzha) super.clone();
            com.google.android.gms.internal.clearcut.zzhb[] zzhbVarArr = this.zzbjm;
            if (zzhbVarArr != null && zzhbVarArr.length > 0) {
                zzhaVar.zzbjm = new com.google.android.gms.internal.clearcut.zzhb[zzhbVarArr.length];
                int i = 0;
                while (true) {
                    com.google.android.gms.internal.clearcut.zzhb[] zzhbVarArr2 = this.zzbjm;
                    if (i >= zzhbVarArr2.length) {
                        break;
                    }
                    if (zzhbVarArr2[i] != null) {
                        zzhaVar.zzbjm[i] = (com.google.android.gms.internal.clearcut.zzhb) zzhbVarArr2[i].clone();
                    }
                    i++;
                }
            }
            com.google.android.gms.internal.clearcut.zzge.zzd zzdVar = this.zzbjo;
            if (zzdVar != null) {
                zzhaVar.zzbjo = zzdVar;
            }
            com.google.android.gms.internal.clearcut.zzgy zzgyVar = this.zzbjs;
            if (zzgyVar != null) {
                zzhaVar.zzbjs = (com.google.android.gms.internal.clearcut.zzgy) zzgyVar.clone();
            }
            com.google.android.gms.internal.clearcut.zzgz zzgzVar = this.zzbjv;
            if (zzgzVar != null) {
                zzhaVar.zzbjv = (com.google.android.gms.internal.clearcut.zzgz) zzgzVar.clone();
            }
            int[] iArr = this.zzbjz;
            if (iArr != null && iArr.length > 0) {
                zzhaVar.zzbjz = (int[]) iArr.clone();
            }
            com.google.android.gms.internal.clearcut.zzge.zzs zzsVar = this.zzbkb;
            if (zzsVar != null) {
                zzhaVar.zzbkb = zzsVar;
            }
            return zzhaVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzha)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzha zzhaVar = (com.google.android.gms.internal.clearcut.zzha) obj;
        if (this.zzbjf != zzhaVar.zzbjf || this.zzbjg != zzhaVar.zzbjg) {
            return false;
        }
        java.lang.String str = this.tag;
        if (str == null) {
            if (zzhaVar.tag != null) {
                return false;
            }
        } else if (!str.equals(zzhaVar.tag)) {
            return false;
        }
        if (this.zzbji != zzhaVar.zzbji) {
            return false;
        }
        java.lang.String str2 = this.zzbjj;
        if (str2 == null) {
            if (zzhaVar.zzbjj != null) {
                return false;
            }
        } else if (!str2.equals(zzhaVar.zzbjj)) {
            return false;
        }
        if (!com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbjm, zzhaVar.zzbjm) || !java.util.Arrays.equals(this.zzbjn, zzhaVar.zzbjn)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar == null) {
            if (zzhaVar.zzbjo != null) {
                return false;
            }
        } else if (!zzdVar.equals(zzhaVar.zzbjo)) {
            return false;
        }
        if (!java.util.Arrays.equals(this.zzbjp, zzhaVar.zzbjp)) {
            return false;
        }
        java.lang.String str3 = this.zzbjq;
        if (str3 == null) {
            if (zzhaVar.zzbjq != null) {
                return false;
            }
        } else if (!str3.equals(zzhaVar.zzbjq)) {
            return false;
        }
        java.lang.String str4 = this.zzbjr;
        if (str4 == null) {
            if (zzhaVar.zzbjr != null) {
                return false;
            }
        } else if (!str4.equals(zzhaVar.zzbjr)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzgy zzgyVar = this.zzbjs;
        if (zzgyVar == null) {
            if (zzhaVar.zzbjs != null) {
                return false;
            }
        } else if (!zzgyVar.equals(zzhaVar.zzbjs)) {
            return false;
        }
        java.lang.String str5 = this.zzbjt;
        if (str5 == null) {
            if (zzhaVar.zzbjt != null) {
                return false;
            }
        } else if (!str5.equals(zzhaVar.zzbjt)) {
            return false;
        }
        if (this.zzbju != zzhaVar.zzbju) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzgz zzgzVar = this.zzbjv;
        if (zzgzVar == null) {
            if (zzhaVar.zzbjv != null) {
                return false;
            }
        } else if (!zzgzVar.equals(zzhaVar.zzbjv)) {
            return false;
        }
        if (!java.util.Arrays.equals(this.zzbjw, zzhaVar.zzbjw)) {
            return false;
        }
        java.lang.String str6 = this.zzbjx;
        if (str6 == null) {
            if (zzhaVar.zzbjx != null) {
                return false;
            }
        } else if (!str6.equals(zzhaVar.zzbjx)) {
            return false;
        }
        if (!com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbjz, zzhaVar.zzbjz)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar == null) {
            if (zzhaVar.zzbkb != null) {
                return false;
            }
        } else if (!zzsVar.equals(zzhaVar.zzbkb)) {
            return false;
        }
        if (this.zzbkc != zzhaVar.zzbkc) {
            return false;
        }
        if (this.zzrj == null || this.zzrj.isEmpty()) {
            return zzhaVar.zzrj == null || zzhaVar.zzrj.isEmpty();
        }
        return this.zzrj.equals(zzhaVar.zzrj);
    }

    public final int hashCode() {
        int iHashCode = (getClass().getName().hashCode() + 527) * 31;
        long j = this.zzbjf;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzbjg;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31 * 31;
        java.lang.String str = this.tag;
        int iHashCode2 = 0;
        int iHashCode3 = (((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.zzbji) * 31;
        java.lang.String str2 = this.zzbjj;
        int iHashCode4 = ((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31 * 31) + 1237) * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbjm)) * 31) + java.util.Arrays.hashCode(this.zzbjn);
        com.google.android.gms.internal.clearcut.zzge.zzd zzdVar = this.zzbjo;
        int iHashCode5 = ((((iHashCode4 * 31) + (zzdVar == null ? 0 : zzdVar.hashCode())) * 31) + java.util.Arrays.hashCode(this.zzbjp)) * 31;
        java.lang.String str3 = this.zzbjq;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.zzbjr;
        int iHashCode7 = iHashCode6 + (str4 == null ? 0 : str4.hashCode());
        com.google.android.gms.internal.clearcut.zzgy zzgyVar = this.zzbjs;
        int iHashCode8 = ((iHashCode7 * 31) + (zzgyVar == null ? 0 : zzgyVar.hashCode())) * 31;
        java.lang.String str5 = this.zzbjt;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j3 = this.zzbju;
        com.google.android.gms.internal.clearcut.zzgz zzgzVar = this.zzbjv;
        int iHashCode10 = (((((iHashCode9 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (zzgzVar == null ? 0 : zzgzVar.hashCode())) * 31) + java.util.Arrays.hashCode(this.zzbjw)) * 31;
        java.lang.String str6 = this.zzbjx;
        int iHashCode11 = (((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31 * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbjz)) * 31;
        com.google.android.gms.internal.clearcut.zzge.zzs zzsVar = this.zzbkb;
        int iHashCode12 = ((((iHashCode11 * 31) + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31) + (this.zzbkc ? 1231 : 1237)) * 31;
        if (this.zzrj != null && !this.zzrj.isEmpty()) {
            iHashCode2 = this.zzrj.hashCode();
        }
        return iHashCode12 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
        long j = this.zzbjf;
        if (j != 0) {
            zzfsVar.zzi(1, j);
        }
        java.lang.String str = this.tag;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(2, this.tag);
        }
        com.google.android.gms.internal.clearcut.zzhb[] zzhbVarArr = this.zzbjm;
        int i = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.google.android.gms.internal.clearcut.zzhb[] zzhbVarArr2 = this.zzbjm;
                if (i2 >= zzhbVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.clearcut.zzhb zzhbVar = zzhbVarArr2[i2];
                if (zzhbVar != null) {
                    zzfsVar.zza(3, zzhbVar);
                }
                i2++;
            }
        }
        if (!java.util.Arrays.equals(this.zzbjn, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            zzfsVar.zza(4, this.zzbjn);
        }
        if (!java.util.Arrays.equals(this.zzbjp, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            zzfsVar.zza(6, this.zzbjp);
        }
        com.google.android.gms.internal.clearcut.zzgy zzgyVar = this.zzbjs;
        if (zzgyVar != null) {
            zzfsVar.zza(7, zzgyVar);
        }
        java.lang.String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            zzfsVar.zza(8, this.zzbjq);
        }
        com.google.android.gms.internal.clearcut.zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar != null) {
            zzfsVar.zze(9, zzdVar);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            zzfsVar.zzc(11, i3);
        }
        java.lang.String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            zzfsVar.zza(13, this.zzbjr);
        }
        java.lang.String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            zzfsVar.zza(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzfsVar.zzb(15, 0);
            zzfsVar.zzn(com.google.android.gms.internal.clearcut.zzfs.zzj(j2));
        }
        com.google.android.gms.internal.clearcut.zzgz zzgzVar = this.zzbjv;
        if (zzgzVar != null) {
            zzfsVar.zza(16, zzgzVar);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            zzfsVar.zzi(17, j3);
        }
        if (!java.util.Arrays.equals(this.zzbjw, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            zzfsVar.zza(18, this.zzbjw);
        }
        int[] iArr = this.zzbjz;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.zzbjz;
                if (i >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(20, iArr2[i]);
                i++;
            }
        }
        com.google.android.gms.internal.clearcut.zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar != null) {
            zzfsVar.zze(23, zzsVar);
        }
        java.lang.String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            zzfsVar.zza(24, this.zzbjx);
        }
        boolean z = this.zzbkc;
        if (z) {
            zzfsVar.zzb(25, z);
        }
        java.lang.String str6 = this.zzbjj;
        if (str6 != null && !str6.equals("")) {
            zzfsVar.zza(26, this.zzbjj);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    protected final int zzen() {
        int[] iArr;
        int iZzen = super.zzen();
        long j = this.zzbjf;
        if (j != 0) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzd(1, j);
        }
        java.lang.String str = this.tag;
        if (str != null && !str.equals("")) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(2, this.tag);
        }
        com.google.android.gms.internal.clearcut.zzhb[] zzhbVarArr = this.zzbjm;
        int i = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                com.google.android.gms.internal.clearcut.zzhb[] zzhbVarArr2 = this.zzbjm;
                if (i2 >= zzhbVarArr2.length) {
                    break;
                }
                com.google.android.gms.internal.clearcut.zzhb zzhbVar = zzhbVarArr2[i2];
                if (zzhbVar != null) {
                    iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(3, zzhbVar);
                }
                i2++;
            }
        }
        if (!java.util.Arrays.equals(this.zzbjn, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(4, this.zzbjn);
        }
        if (!java.util.Arrays.equals(this.zzbjp, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(6, this.zzbjp);
        }
        com.google.android.gms.internal.clearcut.zzgy zzgyVar = this.zzbjs;
        if (zzgyVar != null) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(7, zzgyVar);
        }
        java.lang.String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(8, this.zzbjq);
        }
        com.google.android.gms.internal.clearcut.zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar != null) {
            iZzen += com.google.android.gms.internal.clearcut.zzbn.zzc(9, zzdVar);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzr(11) + com.google.android.gms.internal.clearcut.zzfs.zzs(i3);
        }
        java.lang.String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(13, this.zzbjr);
        }
        java.lang.String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzr(15) + com.google.android.gms.internal.clearcut.zzfs.zzo(com.google.android.gms.internal.clearcut.zzfs.zzj(j2));
        }
        com.google.android.gms.internal.clearcut.zzgz zzgzVar = this.zzbjv;
        if (zzgzVar != null) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(16, zzgzVar);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzd(17, j3);
        }
        if (!java.util.Arrays.equals(this.zzbjw, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(18, this.zzbjw);
        }
        int[] iArr2 = this.zzbjz;
        if (iArr2 != null && iArr2.length > 0) {
            int iZzs = 0;
            while (true) {
                iArr = this.zzbjz;
                if (i >= iArr.length) {
                    break;
                }
                iZzs += com.google.android.gms.internal.clearcut.zzfs.zzs(iArr[i]);
                i++;
            }
            iZzen = iZzen + iZzs + (iArr.length * 2);
        }
        com.google.android.gms.internal.clearcut.zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar != null) {
            iZzen += com.google.android.gms.internal.clearcut.zzbn.zzc(23, zzsVar);
        }
        java.lang.String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(24, this.zzbjx);
        }
        if (this.zzbkc) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzr(25) + 1;
        }
        java.lang.String str6 = this.zzbjj;
        return (str6 == null || str6.equals("")) ? iZzen : iZzen + com.google.android.gms.internal.clearcut.zzfs.zzb(26, this.zzbjj);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* JADX INFO: renamed from: zzeo */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfu clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzha) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfz clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzha) clone();
    }
}
