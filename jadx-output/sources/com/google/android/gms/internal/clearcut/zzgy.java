package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzgy extends com.google.android.gms.internal.clearcut.zzfu<com.google.android.gms.internal.clearcut.zzgy> implements java.lang.Cloneable {
    private java.lang.String[] zzbiw = com.google.android.gms.internal.clearcut.zzgb.zzsc;
    private java.lang.String[] zzbix = com.google.android.gms.internal.clearcut.zzgb.zzsc;
    private int[] zzbiy = com.google.android.gms.internal.clearcut.zzgb.zzrx;
    private long[] zzbiz = com.google.android.gms.internal.clearcut.zzgb.zzry;
    private long[] zzbja = com.google.android.gms.internal.clearcut.zzgb.zzry;

    public zzgy() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzgb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.clearcut.zzgy clone() {
        try {
            com.google.android.gms.internal.clearcut.zzgy zzgyVar = (com.google.android.gms.internal.clearcut.zzgy) super.clone();
            java.lang.String[] strArr = this.zzbiw;
            if (strArr != null && strArr.length > 0) {
                zzgyVar.zzbiw = (java.lang.String[]) strArr.clone();
            }
            java.lang.String[] strArr2 = this.zzbix;
            if (strArr2 != null && strArr2.length > 0) {
                zzgyVar.zzbix = (java.lang.String[]) strArr2.clone();
            }
            int[] iArr = this.zzbiy;
            if (iArr != null && iArr.length > 0) {
                zzgyVar.zzbiy = (int[]) iArr.clone();
            }
            long[] jArr = this.zzbiz;
            if (jArr != null && jArr.length > 0) {
                zzgyVar.zzbiz = (long[]) jArr.clone();
            }
            long[] jArr2 = this.zzbja;
            if (jArr2 != null && jArr2.length > 0) {
                zzgyVar.zzbja = (long[]) jArr2.clone();
            }
            return zzgyVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzgy)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzgy zzgyVar = (com.google.android.gms.internal.clearcut.zzgy) obj;
        if (!com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbiw, zzgyVar.zzbiw) || !com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbix, zzgyVar.zzbix) || !com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbiy, zzgyVar.zzbiy) || !com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbiz, zzgyVar.zzbiz) || !com.google.android.gms.internal.clearcut.zzfy.equals(this.zzbja, zzgyVar.zzbja)) {
            return false;
        }
        if (this.zzrj == null || this.zzrj.isEmpty()) {
            return zzgyVar.zzrj == null || zzgyVar.zzrj.isEmpty();
        }
        return this.zzrj.equals(zzgyVar.zzrj);
    }

    public final int hashCode() {
        return ((((((((((((getClass().getName().hashCode() + 527) * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbiw)) * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbix)) * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbiy)) * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbiz)) * 31) + com.google.android.gms.internal.clearcut.zzfy.hashCode(this.zzbja)) * 31) + ((this.zzrj == null || this.zzrj.isEmpty()) ? 0 : this.zzrj.hashCode());
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(com.google.android.gms.internal.clearcut.zzfs zzfsVar) throws java.io.IOException {
        java.lang.String[] strArr = this.zzbiw;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.zzbiw;
                if (i2 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i2];
                if (str != null) {
                    zzfsVar.zza(1, str);
                }
                i2++;
            }
        }
        java.lang.String[] strArr3 = this.zzbix;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                java.lang.String[] strArr4 = this.zzbix;
                if (i3 >= strArr4.length) {
                    break;
                }
                java.lang.String str2 = strArr4[i3];
                if (str2 != null) {
                    zzfsVar.zza(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.zzbiy;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.zzbiy;
                if (i4 >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(3, iArr2[i4]);
                i4++;
            }
        }
        long[] jArr = this.zzbiz;
        if (jArr != null && jArr.length > 0) {
            int i5 = 0;
            while (true) {
                long[] jArr2 = this.zzbiz;
                if (i5 >= jArr2.length) {
                    break;
                }
                zzfsVar.zzi(4, jArr2[i5]);
                i5++;
            }
        }
        long[] jArr3 = this.zzbja;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.zzbja;
                if (i >= jArr4.length) {
                    break;
                }
                zzfsVar.zzi(5, jArr4[i]);
                i++;
            }
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    protected final int zzen() {
        long[] jArr;
        int[] iArr;
        int iZzen = super.zzen();
        java.lang.String[] strArr = this.zzbiw;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int iZzh = 0;
            int i3 = 0;
            while (true) {
                java.lang.String[] strArr2 = this.zzbiw;
                if (i2 >= strArr2.length) {
                    break;
                }
                java.lang.String str = strArr2[i2];
                if (str != null) {
                    i3++;
                    iZzh += com.google.android.gms.internal.clearcut.zzfs.zzh(str);
                }
                i2++;
            }
            iZzen = iZzen + iZzh + (i3 * 1);
        }
        java.lang.String[] strArr3 = this.zzbix;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            int iZzh2 = 0;
            int i5 = 0;
            while (true) {
                java.lang.String[] strArr4 = this.zzbix;
                if (i4 >= strArr4.length) {
                    break;
                }
                java.lang.String str2 = strArr4[i4];
                if (str2 != null) {
                    i5++;
                    iZzh2 += com.google.android.gms.internal.clearcut.zzfs.zzh(str2);
                }
                i4++;
            }
            iZzen = iZzen + iZzh2 + (i5 * 1);
        }
        int[] iArr2 = this.zzbiy;
        if (iArr2 != null && iArr2.length > 0) {
            int i6 = 0;
            int iZzs = 0;
            while (true) {
                iArr = this.zzbiy;
                if (i6 >= iArr.length) {
                    break;
                }
                iZzs += com.google.android.gms.internal.clearcut.zzfs.zzs(iArr[i6]);
                i6++;
            }
            iZzen = iZzen + iZzs + (iArr.length * 1);
        }
        long[] jArr2 = this.zzbiz;
        if (jArr2 != null && jArr2.length > 0) {
            int i7 = 0;
            int iZzo = 0;
            while (true) {
                jArr = this.zzbiz;
                if (i7 >= jArr.length) {
                    break;
                }
                iZzo += com.google.android.gms.internal.clearcut.zzfs.zzo(jArr[i7]);
                i7++;
            }
            iZzen = iZzen + iZzo + (jArr.length * 1);
        }
        long[] jArr3 = this.zzbja;
        if (jArr3 == null || jArr3.length <= 0) {
            return iZzen;
        }
        int iZzo2 = 0;
        while (true) {
            long[] jArr4 = this.zzbja;
            if (i >= jArr4.length) {
                return iZzen + iZzo2 + (jArr4.length * 1);
            }
            iZzo2 += com.google.android.gms.internal.clearcut.zzfs.zzo(jArr4[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* JADX INFO: renamed from: zzeo */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfu clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzgy) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* JADX INFO: renamed from: zzep */
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzfz clone() throws java.lang.CloneNotSupportedException {
        return (com.google.android.gms.internal.clearcut.zzgy) clone();
    }
}
