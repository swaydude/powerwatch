package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzey {
    private static final com.google.android.gms.internal.clearcut.zzey zzoz = new com.google.android.gms.internal.clearcut.zzey(0, new int[0], new java.lang.Object[0], false);
    private int count;
    private boolean zzfa;
    private int zzjq;
    private java.lang.Object[] zzmj;
    private int[] zzpa;

    private zzey() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzey(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzjq = -1;
        this.count = i;
        this.zzpa = iArr;
        this.zzmj = objArr;
        this.zzfa = z;
    }

    static com.google.android.gms.internal.clearcut.zzey zza(com.google.android.gms.internal.clearcut.zzey zzeyVar, com.google.android.gms.internal.clearcut.zzey zzeyVar2) {
        int i = zzeyVar.count + zzeyVar2.count;
        int[] iArrCopyOf = java.util.Arrays.copyOf(zzeyVar.zzpa, i);
        java.lang.System.arraycopy(zzeyVar2.zzpa, 0, iArrCopyOf, zzeyVar.count, zzeyVar2.count);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzeyVar.zzmj, i);
        java.lang.System.arraycopy(zzeyVar2.zzmj, 0, objArrCopyOf, zzeyVar.count, zzeyVar2.count);
        return new com.google.android.gms.internal.clearcut.zzey(i, iArrCopyOf, objArrCopyOf, true);
    }

    private static void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzfrVar.zzi(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzfrVar.zzc(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzfrVar.zza(i2, (com.google.android.gms.internal.clearcut.zzbb) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new java.lang.RuntimeException(com.google.android.gms.internal.clearcut.zzco.zzbn());
            }
            zzfrVar.zzf(i2, ((java.lang.Integer) obj).intValue());
        } else if (zzfrVar.zzaj() == com.google.android.gms.internal.clearcut.zzcg.zzg.zzko) {
            zzfrVar.zzaa(i2);
            ((com.google.android.gms.internal.clearcut.zzey) obj).zzb(zzfrVar);
            zzfrVar.zzab(i2);
        } else {
            zzfrVar.zzab(i2);
            ((com.google.android.gms.internal.clearcut.zzey) obj).zzb(zzfrVar);
            zzfrVar.zzaa(i2);
        }
    }

    public static com.google.android.gms.internal.clearcut.zzey zzea() {
        return zzoz;
    }

    static com.google.android.gms.internal.clearcut.zzey zzeb() {
        return new com.google.android.gms.internal.clearcut.zzey();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.clearcut.zzey)) {
            return false;
        }
        com.google.android.gms.internal.clearcut.zzey zzeyVar = (com.google.android.gms.internal.clearcut.zzey) obj;
        int i = this.count;
        if (i == zzeyVar.count) {
            int[] iArr = this.zzpa;
            int[] iArr2 = zzeyVar.zzpa;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                java.lang.Object[] objArr = this.zzmj;
                java.lang.Object[] objArr2 = zzeyVar.zzmj;
                int i3 = this.count;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        if (!z2) {
                            return true;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzpa;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        java.lang.Object[] objArr = this.zzmj;
        int i6 = this.count;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    final void zza(com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        if (zzfrVar.zzaj() == com.google.android.gms.internal.clearcut.zzcg.zzg.zzkp) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzfrVar.zza(this.zzpa[i] >>> 3, this.zzmj[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzfrVar.zza(this.zzpa[i2] >>> 3, this.zzmj[i2]);
        }
    }

    final void zza(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            com.google.android.gms.internal.clearcut.zzdr.zza(sb, i, java.lang.String.valueOf(this.zzpa[i2] >>> 3), this.zzmj[i2]);
        }
    }

    public final int zzas() {
        int iZze;
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzpa[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iZze = com.google.android.gms.internal.clearcut.zzbn.zze(i5, ((java.lang.Long) this.zzmj[i3]).longValue());
            } else if (i6 == 1) {
                iZze = com.google.android.gms.internal.clearcut.zzbn.zzg(i5, ((java.lang.Long) this.zzmj[i3]).longValue());
            } else if (i6 == 2) {
                iZze = com.google.android.gms.internal.clearcut.zzbn.zzc(i5, (com.google.android.gms.internal.clearcut.zzbb) this.zzmj[i3]);
            } else if (i6 == 3) {
                iZze = (com.google.android.gms.internal.clearcut.zzbn.zzr(i5) << 1) + ((com.google.android.gms.internal.clearcut.zzey) this.zzmj[i3]).zzas();
            } else {
                if (i6 != 5) {
                    throw new java.lang.IllegalStateException(com.google.android.gms.internal.clearcut.zzco.zzbn());
                }
                iZze = com.google.android.gms.internal.clearcut.zzbn.zzj(i5, ((java.lang.Integer) this.zzmj[i3]).intValue());
            }
            i2 += iZze;
        }
        this.zzjq = i2;
        return i2;
    }

    final void zzb(int i, java.lang.Object obj) {
        if (!this.zzfa) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i2 = this.count;
        int[] iArr = this.zzpa;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzpa = java.util.Arrays.copyOf(iArr, i3);
            this.zzmj = java.util.Arrays.copyOf(this.zzmj, i3);
        }
        int[] iArr2 = this.zzpa;
        int i4 = this.count;
        iArr2[i4] = i;
        this.zzmj[i4] = obj;
        this.count = i4 + 1;
    }

    public final void zzb(com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
        if (zzfrVar.zzaj() == com.google.android.gms.internal.clearcut.zzcg.zzg.zzko) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzpa[i], this.zzmj[i], zzfrVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzpa[i2], this.zzmj[i2], zzfrVar);
        }
    }

    public final int zzec() {
        int i = this.zzjq;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            iZzd += com.google.android.gms.internal.clearcut.zzbn.zzd(this.zzpa[i2] >>> 3, (com.google.android.gms.internal.clearcut.zzbb) this.zzmj[i2]);
        }
        this.zzjq = iZzd;
        return iZzd;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}
