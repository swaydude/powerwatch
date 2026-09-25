package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
class zzbi extends com.google.android.gms.internal.clearcut.zzbh {
    protected final byte[] zzfp;

    zzbi(byte[] bArr) {
        this.zzfp = bArr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzbb) || size() != ((com.google.android.gms.internal.clearcut.zzbb) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzbi)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.clearcut.zzbi zzbiVar = (com.google.android.gms.internal.clearcut.zzbi) obj;
        int iZzab = zzab();
        int iZzab2 = zzbiVar.zzab();
        if (iZzab == 0 || iZzab2 == 0 || iZzab == iZzab2) {
            return zza(zzbiVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public int size() {
        return this.zzfp.length;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    protected final int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.clearcut.zzci.zza(i, this.zzfp, zzac(), i3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final com.google.android.gms.internal.clearcut.zzbb zza(int i, int i2) {
        int iZzb = zzb(0, i2, size());
        return iZzb == 0 ? com.google.android.gms.internal.clearcut.zzbb.zzfi : new com.google.android.gms.internal.clearcut.zzbe(this.zzfp, zzac(), iZzb);
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    protected final java.lang.String zza(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzfp, zzac(), size(), charset);
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    final void zza(com.google.android.gms.internal.clearcut.zzba zzbaVar) throws java.io.IOException {
        zzbaVar.zza(this.zzfp, zzac(), size());
    }

    @Override // com.google.android.gms.internal.clearcut.zzbh
    final boolean zza(com.google.android.gms.internal.clearcut.zzbb zzbbVar, int i, int i2) {
        if (i2 > zzbbVar.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > zzbbVar.size()) {
            int size2 = zzbbVar.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (!(zzbbVar instanceof com.google.android.gms.internal.clearcut.zzbi)) {
            return zzbbVar.zza(0, i2).equals(zza(0, i2));
        }
        com.google.android.gms.internal.clearcut.zzbi zzbiVar = (com.google.android.gms.internal.clearcut.zzbi) zzbbVar;
        byte[] bArr = this.zzfp;
        byte[] bArr2 = zzbiVar.zzfp;
        int iZzac = zzac() + i2;
        int iZzac2 = zzac();
        int iZzac3 = zzbiVar.zzac();
        while (iZzac2 < iZzac) {
            if (bArr[iZzac2] != bArr2[iZzac3]) {
                return false;
            }
            iZzac2++;
            iZzac3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final boolean zzaa() {
        int iZzac = zzac();
        return com.google.android.gms.internal.clearcut.zzff.zze(this.zzfp, iZzac, size() + iZzac);
    }

    protected int zzac() {
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public byte zzj(int i) {
        return this.zzfp[i];
    }
}
