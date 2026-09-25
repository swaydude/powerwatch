package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzii<T> implements com.google.android.gms.internal.vision.zzir<T> {
    private final com.google.android.gms.internal.vision.zzic zzyy;
    private final boolean zzyz;
    private final com.google.android.gms.internal.vision.zzjj<?, ?> zzzi;
    private final com.google.android.gms.internal.vision.zzgf<?> zzzj;

    private zzii(com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar, com.google.android.gms.internal.vision.zzgf<?> zzgfVar, com.google.android.gms.internal.vision.zzic zzicVar) {
        this.zzzi = zzjjVar;
        this.zzyz = zzgfVar.zze(zzicVar);
        this.zzzj = zzgfVar;
        this.zzyy = zzicVar;
    }

    static <T> com.google.android.gms.internal.vision.zzii<T> zza(com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar, com.google.android.gms.internal.vision.zzgf<?> zzgfVar, com.google.android.gms.internal.vision.zzic zzicVar) {
        return new com.google.android.gms.internal.vision.zzii<>(zzjjVar, zzgfVar, zzicVar);
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final T newInstance() {
        return (T) this.zzyy.zzgj().zzgb();
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final boolean equals(T t, T t2) {
        if (!this.zzzi.zzv(t).equals(this.zzzi.zzv(t2))) {
            return false;
        }
        if (this.zzyz) {
            return this.zzzj.zze(t).equals(this.zzzj.zze(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final int hashCode(T t) {
        int iHashCode = this.zzzi.zzv(t).hashCode();
        return this.zzyz ? (iHashCode * 53) + this.zzzj.zze(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final void zzd(T t, T t2) {
        com.google.android.gms.internal.vision.zzit.zza(this.zzzi, t, t2);
        if (this.zzyz) {
            com.google.android.gms.internal.vision.zzit.zza(this.zzzj, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final void zza(T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        for (T t2 : this.zzzj.zze(t)) {
            com.google.android.gms.internal.vision.zzgk zzgkVar = (com.google.android.gms.internal.vision.zzgk) t2.getKey();
            if (zzgkVar.zzft() != com.google.android.gms.internal.vision.zzkd.MESSAGE || zzgkVar.zzfu() || zzgkVar.zzfv()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (t2 instanceof com.google.android.gms.internal.vision.zzhf) {
                zzkgVar.zza(zzgkVar.zzag(), (java.lang.Object) ((com.google.android.gms.internal.vision.zzhf) t2).zzgw().zzdk());
            } else {
                zzkgVar.zza(zzgkVar.zzag(), t2.getValue());
            }
        }
        com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar = this.zzzi;
        zzjjVar.zzc(zzjjVar.zzv(t), zzkgVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[EDGE_INSN: B:57:0x00be->B:33:0x00be BREAK  A[LOOP:1: B:18:0x0067->B:60:0x0067], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzir
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgs zzgsVar = (com.google.android.gms.internal.vision.zzgs) t;
        com.google.android.gms.internal.vision.zzjm zzjmVarZzih = zzgsVar.zzwd;
        if (zzjmVarZzih == com.google.android.gms.internal.vision.zzjm.zzig()) {
            zzjmVarZzih = com.google.android.gms.internal.vision.zzjm.zzih();
            zzgsVar.zzwd = zzjmVarZzih;
        }
        com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzgiVarZzgk = ((com.google.android.gms.internal.vision.zzgs.zze) t).zzgk();
        com.google.android.gms.internal.vision.zzgs.zzg zzgVar = null;
        while (i < i2) {
            int iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
            int i3 = zzfbVar.zzro;
            if (i3 == 11) {
                int i4 = 0;
                com.google.android.gms.internal.vision.zzfh zzfhVar = null;
                while (iZza < i2) {
                    iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza, zzfbVar);
                    int i5 = zzfbVar.zzro;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iZza = com.google.android.gms.internal.vision.zzez.zza(i5, bArr, iZza, i2, zzfbVar);
                        } else {
                            iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza, zzfbVar);
                            i4 = zzfbVar.zzro;
                            zzgVar = (com.google.android.gms.internal.vision.zzgs.zzg) this.zzzj.zza(zzfbVar.zzcm, this.zzyy, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (zzgVar != null) {
                                iZza = com.google.android.gms.internal.vision.zzez.zza(com.google.android.gms.internal.vision.zzin.zzho().zzf(zzgVar.zzxa.getClass()), bArr, iZza, i2, zzfbVar);
                                zzgiVarZzgk.zza(zzgVar.zzxb, zzfbVar.zzrq);
                            } else if (i7 == 2) {
                                iZza = com.google.android.gms.internal.vision.zzez.zze(bArr, iZza, zzfbVar);
                                zzfhVar = (com.google.android.gms.internal.vision.zzfh) zzfbVar.zzrq;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iZza = com.google.android.gms.internal.vision.zzez.zza(i5, bArr, iZza, i2, zzfbVar);
                        }
                    }
                }
                if (zzfhVar != null) {
                    zzjmVarZzih.zzb((i4 << 3) | 2, zzfhVar);
                }
                i = iZza;
            } else if ((i3 & 7) == 2) {
                com.google.android.gms.internal.vision.zzgs.zzg zzgVar2 = (com.google.android.gms.internal.vision.zzgs.zzg) this.zzzj.zza(zzfbVar.zzcm, this.zzyy, i3 >>> 3);
                if (zzgVar2 != null) {
                    i = com.google.android.gms.internal.vision.zzez.zza(com.google.android.gms.internal.vision.zzin.zzho().zzf(zzgVar2.zzxa.getClass()), bArr, iZza, i2, zzfbVar);
                    zzgiVarZzgk.zza(zzgVar2.zzxb, zzfbVar.zzrq);
                } else {
                    i = com.google.android.gms.internal.vision.zzez.zza(i3, bArr, iZza, i2, zzjmVarZzih, zzfbVar);
                }
                zzgVar = zzgVar2;
            } else {
                i = com.google.android.gms.internal.vision.zzez.zza(i3, bArr, iZza, i2, zzfbVar);
            }
        }
        if (i != i2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:45:0x000c->B:53:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.zzir
    public final void zza(T t, com.google.android.gms.internal.vision.zzis zzisVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        boolean zZzdv;
        com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar = this.zzzi;
        com.google.android.gms.internal.vision.zzgf<?> zzgfVar = this.zzzj;
        java.lang.Object objZzw = zzjjVar.zzw(t);
        com.google.android.gms.internal.vision.zzgi<T> zzgiVarZzf = zzgfVar.zzf(t);
        while (zzisVar.zzdu() != Integer.MAX_VALUE) {
            try {
                int tag = zzisVar.getTag();
                if (tag != 11) {
                    if ((tag & 7) == 2) {
                        java.lang.Object objZza = zzgfVar.zza(zzgdVar, this.zzyy, tag >>> 3);
                        if (objZza != null) {
                            zzgfVar.zza(zzisVar, objZza, zzgdVar, zzgiVarZzf);
                        } else {
                            zZzdv = zzjjVar.zza(objZzw, zzisVar);
                        }
                    } else {
                        zZzdv = zzisVar.zzdv();
                    }
                    if (!zZzdv) {
                        zzjjVar.zzg(t, objZzw);
                        return;
                    }
                } else {
                    int iZzee = 0;
                    java.lang.Object objZza2 = null;
                    com.google.android.gms.internal.vision.zzfh zzfhVarZzed = null;
                    while (zzisVar.zzdu() != Integer.MAX_VALUE) {
                        int tag2 = zzisVar.getTag();
                        if (tag2 == 16) {
                            iZzee = zzisVar.zzee();
                            objZza2 = zzgfVar.zza(zzgdVar, this.zzyy, iZzee);
                        } else if (tag2 == 26) {
                            if (objZza2 != null) {
                                zzgfVar.zza(zzisVar, objZza2, zzgdVar, zzgiVarZzf);
                            } else {
                                zzfhVarZzed = zzisVar.zzed();
                            }
                        } else if (!zzisVar.zzdv()) {
                            break;
                        }
                    }
                    if (zzisVar.getTag() != 12) {
                        throw com.google.android.gms.internal.vision.zzhc.zzgq();
                    }
                    if (zzfhVarZzed != null) {
                        if (objZza2 != null) {
                            zzgfVar.zza(zzfhVarZzed, objZza2, zzgdVar, zzgiVarZzf);
                        } else {
                            zzjjVar.zza(objZzw, iZzee, zzfhVarZzed);
                        }
                    }
                }
                zZzdv = true;
                if (!zZzdv) {
                    zzjjVar.zzg(t, objZzw);
                    return;
                }
            } catch (java.lang.Throwable th) {
                zzjjVar.zzg(t, objZzw);
                throw th;
            }
        }
        zzjjVar.zzg(t, objZzw);
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final void zzg(T t) {
        this.zzzi.zzg(t);
        this.zzzj.zzg(t);
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final boolean zzt(T t) {
        return this.zzzj.zze(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final int zzr(T t) {
        com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar = this.zzzi;
        int iZzx = zzjjVar.zzx(zzjjVar.zzv(t)) + 0;
        return this.zzyz ? iZzx + this.zzzj.zze(t).zzfo() : iZzx;
    }
}
