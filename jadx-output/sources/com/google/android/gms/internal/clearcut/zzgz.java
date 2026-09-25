package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzgz extends com.google.android.gms.internal.clearcut.zzfu<com.google.android.gms.internal.clearcut.zzgz> implements java.lang.Cloneable {
    private byte[] zzbjb = com.google.android.gms.internal.clearcut.zzgb.zzse;
    private java.lang.String zzbjc = "";
    private byte[][] zzbjd = com.google.android.gms.internal.clearcut.zzgb.zzsd;
    private boolean zzbje = false;

    public zzgz() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzgc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.clearcut.zzgz clone() {
        try {
            com.google.android.gms.internal.clearcut.zzgz zzgzVar = (com.google.android.gms.internal.clearcut.zzgz) super.clone();
            byte[][] bArr = this.zzbjd;
            if (bArr != null && bArr.length > 0) {
                zzgzVar.zzbjd = (byte[][]) bArr.clone();
            }
            return zzgzVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzgz)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzgz zzgzVar = (com.google.android.gms.internal.clearcut.zzgz) obj;
        if (!java.util.Arrays.equals(this.zzbjb, zzgzVar.zzbjb)) {
            return false;
        }
        java.lang.String str = this.zzbjc;
        if (str == null) {
            if (zzgzVar.zzbjc != null) {
                return false;
            }
        } else if (!str.equals(zzgzVar.zzbjc)) {
            return false;
        }
        if (!com.google.android.gms.internal.clearcut.zzfy.zza(this.zzbjd, zzgzVar.zzbjd)) {
            return false;
        }
        if (this.zzrj == null || this.zzrj.isEmpty()) {
            return zzgzVar.zzrj == null || zzgzVar.zzrj.isEmpty();
        }
        return this.zzrj.equals(zzgzVar.zzrj);
    }

    public final int hashCode() {
        int iHashCode = (((getClass().getName().hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.zzbjb)) * 31;
        java.lang.String str = this.zzbjc;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + com.google.android.gms.internal.clearcut.zzfy.zza(this.zzbjd)) * 31) + 1237) * 31;
        if (this.zzrj != null && !this.zzrj.isEmpty()) {
            iHashCode2 = this.zzrj.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
        if (!java.util.Arrays.equals(this.zzbjb, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            zzfsVar.zza(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzfsVar.zza(2, bArr3);
                }
                i++;
            }
        }
        java.lang.String str = this.zzbjc;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(4, this.zzbjc);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    protected final int zzen() {
        int iZzen = super.zzen();
        if (!java.util.Arrays.equals(this.zzbjb, com.google.android.gms.internal.clearcut.zzgb.zzse)) {
            iZzen += com.google.android.gms.internal.clearcut.zzfs.zzb(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int iZzh = 0;
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i2++;
                    iZzh += com.google.android.gms.internal.clearcut.zzfs.zzh(bArr3);
                }
                i++;
            }
            iZzen = iZzen + iZzh + (i2 * 1);
        }
        java.lang.String str = this.zzbjc;
        return (str == null || str.equals("")) ? iZzen : iZzen + com.google.android.gms.internal.clearcut.zzfs.zzb(4, this.zzbjc);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* JADX INFO: renamed from: zzeo */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfu clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzgz) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfz clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzgz) clone();
    }
}
