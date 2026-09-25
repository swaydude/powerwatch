package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdu<T> implements com.google.android.gms.internal.clearcut.zzef<T> {
    private final com.google.android.gms.internal.clearcut.zzdo zzmn;
    private final boolean zzmo;
    private final com.google.android.gms.internal.clearcut.zzex<?, ?> zzmx;
    private final com.google.android.gms.internal.clearcut.zzbu<?> zzmy;

    private zzdu(com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVar, com.google.android.gms.internal.clearcut.zzbu<?> zzbuVar, com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        this.zzmx = zzexVar;
        this.zzmo = zzbuVar.zze(zzdoVar);
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
    }

    static <T> com.google.android.gms.internal.clearcut.zzdu<T> zza(com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVar, com.google.android.gms.internal.clearcut.zzbu<?> zzbuVar, com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        return new com.google.android.gms.internal.clearcut.zzdu<>(zzexVar, zzbuVar, zzdoVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean equals(T t, T t2) {
        if (!this.zzmx.zzq(t).equals(this.zzmx.zzq(t2))) {
            return false;
        }
        if (this.zzmo) {
            return this.zzmy.zza(t).equals(this.zzmy.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int hashCode(T t) {
        int iHashCode = this.zzmx.zzq(t).hashCode();
        return this.zzmo ? (iHashCode * 53) + this.zzmy.zza(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final T newInstance() {
        return (T) this.zzmn.zzbd().zzbi();
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(T t, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        for (T t2 : this.zzmy.zza(t)) {
            com.google.android.gms.internal.clearcut.zzca zzcaVar = (com.google.android.gms.internal.clearcut.zzca) t2.getKey();
            if (zzcaVar.zzav() != com.google.android.gms.internal.clearcut.zzfq.MESSAGE || zzcaVar.zzaw() || zzcaVar.zzax()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            zzfrVar.zza(zzcaVar.zzc(), t2 instanceof com.google.android.gms.internal.clearcut.zzct ? ((com.google.android.gms.internal.clearcut.zzct) t2).zzbs().zzr() : t2.getValue());
        }
        com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVar = this.zzmx;
        zzexVar.zzc(zzexVar.zzq(t), zzfrVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0061 A[EDGE_INSN: B:49:0x0061->B:27:0x0061 BREAK  A[LOOP:1: B:14:0x0032->B:52:0x0032], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzcg zzcgVar = (com.google.android.gms.internal.clearcut.zzcg) t;
        com.google.android.gms.internal.clearcut.zzey zzeyVarZzeb = zzcgVar.zzjp;
        if (zzeyVarZzeb == com.google.android.gms.internal.clearcut.zzey.zzea()) {
            zzeyVarZzeb = com.google.android.gms.internal.clearcut.zzey.zzeb();
            zzcgVar.zzjp = zzeyVarZzeb;
        }
        com.google.android.gms.internal.clearcut.zzey zzeyVar = zzeyVarZzeb;
        while (i < i2) {
            int iZza = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
            int i3 = zzayVar.zzfd;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? com.google.android.gms.internal.clearcut.zzax.zza(i3, bArr, iZza, i2, zzeyVar, zzayVar) : com.google.android.gms.internal.clearcut.zzax.zza(i3, bArr, iZza, i2, zzayVar);
            } else {
                int i4 = 0;
                com.google.android.gms.internal.clearcut.zzbb zzbbVar = null;
                while (iZza < i2) {
                    iZza = com.google.android.gms.internal.clearcut.zzax.zza(bArr, iZza, zzayVar);
                    int i5 = zzayVar.zzfd;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iZza = com.google.android.gms.internal.clearcut.zzax.zza(i5, bArr, iZza, i2, zzayVar);
                        } else {
                            iZza = com.google.android.gms.internal.clearcut.zzax.zza(bArr, iZza, zzayVar);
                            i4 = zzayVar.zzfd;
                        }
                    } else if (i6 != 3 || i7 != 2) {
                        if (i5 != 12) {
                            break;
                        } else {
                            iZza = com.google.android.gms.internal.clearcut.zzax.zza(i5, bArr, iZza, i2, zzayVar);
                        }
                    } else {
                        iZza = com.google.android.gms.internal.clearcut.zzax.zze(bArr, iZza, zzayVar);
                        zzbbVar = (com.google.android.gms.internal.clearcut.zzbb) zzayVar.zzff;
                    }
                }
                if (zzbbVar != null) {
                    zzeyVar.zzb((i4 << 3) | 2, zzbbVar);
                }
                i = iZza;
            }
        }
        if (i != i2) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t) {
        this.zzmx.zzc(t);
        this.zzmy.zzc(t);
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t, T t2) {
        com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmx, t, t2);
        if (this.zzmo) {
            com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmy, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int zzm(T t) {
        com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVar = this.zzmx;
        int iZzr = zzexVar.zzr(zzexVar.zzq(t)) + 0;
        return this.zzmo ? iZzr + this.zzmy.zza(t).zzat() : iZzr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(T t) {
        return this.zzmy.zza(t).isInitialized();
    }
}
