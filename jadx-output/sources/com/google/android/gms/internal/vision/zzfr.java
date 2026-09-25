package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
class zzfr extends com.google.android.gms.internal.vision.zzfs {
    protected final byte[] zzse;

    zzfr(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr);
        this.zzse = bArr;
    }

    protected int zzeu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    public byte zzan(int i) {
        return this.zzse[i];
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    byte zzao(int i) {
        return this.zzse[i];
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    public int size() {
        return this.zzse.length;
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    public final com.google.android.gms.internal.vision.zzfh zzf(int i, int i2) {
        int iZzc = zzc(0, i2, size());
        if (iZzc == 0) {
            return com.google.android.gms.internal.vision.zzfh.zzrx;
        }
        return new com.google.android.gms.internal.vision.zzfo(this.zzse, zzeu(), iZzc);
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    protected void zza(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zzse, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    final void zza(com.google.android.gms.internal.vision.zzfi zzfiVar) throws java.io.IOException {
        zzfiVar.zzc(this.zzse, zzeu(), size());
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    protected final java.lang.String zza(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzse, zzeu(), size(), charset);
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    public final boolean zzes() {
        int iZzeu = zzeu();
        return com.google.android.gms.internal.vision.zzjs.zzf(this.zzse, iZzeu, size() + iZzeu);
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zzfh) || size() != ((com.google.android.gms.internal.vision.zzfh) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.vision.zzfr) {
            com.google.android.gms.internal.vision.zzfr zzfrVar = (com.google.android.gms.internal.vision.zzfr) obj;
            int iZzet = zzet();
            int iZzet2 = zzfrVar.zzet();
            if (iZzet == 0 || iZzet2 == 0 || iZzet == iZzet2) {
                return zza(zzfrVar, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.vision.zzfs
    final boolean zza(com.google.android.gms.internal.vision.zzfh zzfhVar, int i, int i2) {
        if (i2 > zzfhVar.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > zzfhVar.size()) {
            int size2 = zzfhVar.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (zzfhVar instanceof com.google.android.gms.internal.vision.zzfr) {
            com.google.android.gms.internal.vision.zzfr zzfrVar = (com.google.android.gms.internal.vision.zzfr) zzfhVar;
            byte[] bArr = this.zzse;
            byte[] bArr2 = zzfrVar.zzse;
            int iZzeu = zzeu() + i2;
            int iZzeu2 = zzeu();
            int iZzeu3 = zzfrVar.zzeu();
            while (iZzeu2 < iZzeu) {
                if (bArr[iZzeu2] != bArr2[iZzeu3]) {
                    return false;
                }
                iZzeu2++;
                iZzeu3++;
            }
            return true;
        }
        return zzfhVar.zzf(0, i2).equals(zzf(0, i2));
    }

    @Override // com.google.android.gms.internal.vision.zzfh
    protected final int zzb(int i, int i2, int i3) {
        return com.google.android.gms.internal.vision.zzgt.zza(i, this.zzse, zzeu(), i3);
    }
}
