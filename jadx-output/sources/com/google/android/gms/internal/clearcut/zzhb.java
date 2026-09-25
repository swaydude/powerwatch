package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzhb extends com.google.android.gms.internal.clearcut.zzfu<com.google.android.gms.internal.clearcut.zzhb> implements java.lang.Cloneable {
    private static volatile com.google.android.gms.internal.clearcut.zzhb[] zzbkd;
    private java.lang.String zzbke = "";
    private java.lang.String value = "";

    public zzhb() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    public static com.google.android.gms.internal.clearcut.zzhb[] zzge() {
        if (zzbkd == null) {
            synchronized (com.google.android.gms.internal.clearcut.zzfy.zzrr) {
                if (zzbkd == null) {
                    zzbkd = new com.google.android.gms.internal.clearcut.zzhb[0];
                }
            }
        }
        return zzbkd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzgf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.clearcut.zzhb clone() {
        try {
            return (com.google.android.gms.internal.clearcut.zzhb) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzhb)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzhb zzhbVar = (com.google.android.gms.internal.clearcut.zzhb) obj;
        java.lang.String str = this.zzbke;
        if (str == null) {
            if (zzhbVar.zzbke != null) {
                return false;
            }
        } else if (!str.equals(zzhbVar.zzbke)) {
            return false;
        }
        java.lang.String str2 = this.value;
        if (str2 == null) {
            if (zzhbVar.value != null) {
                return false;
            }
        } else if (!str2.equals(zzhbVar.value)) {
            return false;
        }
        if (this.zzrj == null || this.zzrj.isEmpty()) {
            return zzhbVar.zzrj == null || zzhbVar.zzrj.isEmpty();
        }
        return this.zzrj.equals(zzhbVar.zzrj);
    }

    public final int hashCode() {
        int iHashCode = (getClass().getName().hashCode() + 527) * 31;
        java.lang.String str = this.zzbke;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.value;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        if (this.zzrj != null && !this.zzrj.isEmpty()) {
            iHashCode2 = this.zzrj.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
        java.lang.String str = this.zzbke;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(1, this.zzbke);
        }
        java.lang.String str2 = this.value;
        if (str2 != null && !str2.equals("")) {
            zzfsVar.zza(2, this.value);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    protected final int zzen() {
        int iZzen = super.zzen();
        java.lang.String str = this.zzbke;
        if (str != null && !str.equals("")) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(1, this.zzbke);
        }
        java.lang.String str2 = this.value;
        return (str2 == null || str2.equals("")) ? iZzen : iZzen + com.google.android.gms.internal.clearcut.zzfs.zzb(2, this.value);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* JADX INFO: renamed from: zzeo */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfu clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzhb) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfz clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzhb) clone();
    }
}
