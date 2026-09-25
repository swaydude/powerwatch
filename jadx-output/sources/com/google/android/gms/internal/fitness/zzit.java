package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzit {
    private static final com.google.android.gms.internal.fitness.zzit zzzc = new com.google.android.gms.internal.fitness.zzit(0, new int[0], new java.lang.Object[0], false);
    private int count;
    private boolean zzrc;
    private int zzvc;
    private java.lang.Object[] zzxt;
    private int[] zzzd;

    public static com.google.android.gms.internal.fitness.zzit zzdd() {
        return zzzc;
    }

    static com.google.android.gms.internal.fitness.zzit zza(com.google.android.gms.internal.fitness.zzit zzitVar, com.google.android.gms.internal.fitness.zzit zzitVar2) {
        int i = zzitVar.count + zzitVar2.count;
        int[] iArrCopyOf = java.util.Arrays.copyOf(zzitVar.zzzd, i);
        java.lang.System.arraycopy(zzitVar2.zzzd, 0, iArrCopyOf, zzitVar.count, zzitVar2.count);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzitVar.zzxt, i);
        java.lang.System.arraycopy(zzitVar2.zzxt, 0, objArrCopyOf, zzitVar.count, zzitVar2.count);
        return new com.google.android.gms.internal.fitness.zzit(i, iArrCopyOf, objArrCopyOf, true);
    }

    private zzit() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzit(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzvc = -1;
        this.count = i;
        this.zzzd = iArr;
        this.zzxt = objArr;
        this.zzrc = z;
    }

    public final void zzal() {
        this.zzrc = false;
    }

    final void zza(com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        if (zzjoVar.zzay() == com.google.android.gms.internal.fitness.zzgg.zze.zzvx) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzjoVar.zza(this.zzzd[i] >>> 3, this.zzxt[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzjoVar.zza(this.zzzd[i2] >>> 3, this.zzxt[i2]);
        }
    }

    public final void zzb(com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
        if (zzjoVar.zzay() == com.google.android.gms.internal.fitness.zzgg.zze.zzvw) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzzd[i], this.zzxt[i], zzjoVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzzd[i2], this.zzxt[i2], zzjoVar);
        }
    }

    private static void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzjoVar.zzi(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzjoVar.zzc(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzjoVar.zza(i2, (com.google.android.gms.internal.fitness.zzff) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zzjoVar.zzf(i2, ((java.lang.Integer) obj).intValue());
                return;
            }
            throw new java.lang.RuntimeException(com.google.android.gms.internal.fitness.zzgo.zzbt());
        }
        if (zzjoVar.zzay() == com.google.android.gms.internal.fitness.zzgg.zze.zzvw) {
            zzjoVar.zzy(i2);
            ((com.google.android.gms.internal.fitness.zzit) obj).zzb(zzjoVar);
            zzjoVar.zzz(i2);
        } else {
            zzjoVar.zzz(i2);
            ((com.google.android.gms.internal.fitness.zzit) obj).zzb(zzjoVar);
            zzjoVar.zzy(i2);
        }
    }

    public final int zzde() {
        int i = this.zzvc;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            iZzd += com.google.android.gms.internal.fitness.zzfs.zzd(this.zzzd[i2] >>> 3, (com.google.android.gms.internal.fitness.zzff) this.zzxt[i2]);
        }
        this.zzvc = iZzd;
        return iZzd;
    }

    public final int zzbk() {
        int iZze;
        int i = this.zzvc;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzzd[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iZze = com.google.android.gms.internal.fitness.zzfs.zze(i5, ((java.lang.Long) this.zzxt[i3]).longValue());
            } else if (i6 == 1) {
                iZze = com.google.android.gms.internal.fitness.zzfs.zzg(i5, ((java.lang.Long) this.zzxt[i3]).longValue());
            } else if (i6 == 2) {
                iZze = com.google.android.gms.internal.fitness.zzfs.zzc(i5, (com.google.android.gms.internal.fitness.zzff) this.zzxt[i3]);
            } else if (i6 == 3) {
                iZze = (com.google.android.gms.internal.fitness.zzfs.zzp(i5) << 1) + ((com.google.android.gms.internal.fitness.zzit) this.zzxt[i3]).zzbk();
            } else if (i6 == 5) {
                iZze = com.google.android.gms.internal.fitness.zzfs.zzj(i5, ((java.lang.Integer) this.zzxt[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.fitness.zzgo.zzbt());
            }
            i2 += iZze;
        }
        this.zzvc = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.fitness.zzit)) {
            return false;
        }
        com.google.android.gms.internal.fitness.zzit zzitVar = (com.google.android.gms.internal.fitness.zzit) obj;
        int i = this.count;
        if (i == zzitVar.count) {
            int[] iArr = this.zzzd;
            int[] iArr2 = zzitVar.zzzd;
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
                java.lang.Object[] objArr = this.zzxt;
                java.lang.Object[] objArr2 = zzitVar.zzxt;
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
        int[] iArr = this.zzzd;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        java.lang.Object[] objArr = this.zzxt;
        int i6 = this.count;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    final void zza(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            com.google.android.gms.internal.fitness.zzhp.zza(sb, i, java.lang.String.valueOf(this.zzzd[i2] >>> 3), this.zzxt[i2]);
        }
    }
}
