package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgu<T> implements com.google.android.gms.internal.measurement.zzhd<T> {
    private final com.google.android.gms.internal.measurement.zzgo zza;
    private final com.google.android.gms.internal.measurement.zzhv<?, ?> zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.measurement.zzes<?> zzd;

    private zzgu(com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar, com.google.android.gms.internal.measurement.zzes<?> zzesVar, com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        this.zzb = zzhvVar;
        this.zzc = zzesVar.zza(zzgoVar);
        this.zzd = zzesVar;
        this.zza = zzgoVar;
    }

    static <T> com.google.android.gms.internal.measurement.zzgu<T> zza(com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar, com.google.android.gms.internal.measurement.zzes<?> zzesVar, com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        return new com.google.android.gms.internal.measurement.zzgu<>(zzhvVar, zzesVar, zzgoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final T zza() {
        return (T) this.zza.zzbs().zzt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zza(T t, T t2) {
        if (!this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zza(T t) {
        int iHashCode = this.zzb.zzb(t).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzb(T t, T t2) {
        com.google.android.gms.internal.measurement.zzhf.zza(this.zzb, t, t2);
        if (this.zzc) {
            com.google.android.gms.internal.measurement.zzhf.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        java.util.Iterator itZzd = this.zzd.zza(t).zzd();
        while (itZzd.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itZzd.next();
            com.google.android.gms.internal.measurement.zzey zzeyVar = (com.google.android.gms.internal.measurement.zzey) entry.getKey();
            if (zzeyVar.zzc() != com.google.android.gms.internal.measurement.zzip.MESSAGE || zzeyVar.zzd() || zzeyVar.zze()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.measurement.zzfr) {
                zzisVar.zza(zzeyVar.zza(), (java.lang.Object) ((com.google.android.gms.internal.measurement.zzfr) entry).zza().zzc());
            } else {
                zzisVar.zza(zzeyVar.zza(), entry.getValue());
            }
        }
        com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar = this.zzb;
        zzhvVar.zzb(zzhvVar.zzb(t), zzisVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzdt zzdtVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) t;
        com.google.android.gms.internal.measurement.zzhy zzhyVarZzb = zzfdVar.zzb;
        if (zzhyVarZzb == com.google.android.gms.internal.measurement.zzhy.zza()) {
            zzhyVarZzb = com.google.android.gms.internal.measurement.zzhy.zzb();
            zzfdVar.zzb = zzhyVarZzb;
        }
        ((com.google.android.gms.internal.measurement.zzfd.zzd) t).zza();
        com.google.android.gms.internal.measurement.zzfd.zzf zzfVar = null;
        while (i < i2) {
            int iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
            int i3 = zzdtVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                com.google.android.gms.internal.measurement.zzdu zzduVar = null;
                while (iZza < i2) {
                    iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza, zzdtVar);
                    int i5 = zzdtVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iZza = com.google.android.gms.internal.measurement.zzdq.zza(i5, bArr, iZza, i2, zzdtVar);
                        } else {
                            iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza, zzdtVar);
                            i4 = zzdtVar.zza;
                            zzfVar = (com.google.android.gms.internal.measurement.zzfd.zzf) this.zzd.zza(zzdtVar.zzd, this.zza, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (zzfVar != null) {
                                com.google.android.gms.internal.measurement.zzgz.zza();
                                throw new java.lang.NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                iZza = com.google.android.gms.internal.measurement.zzdq.zze(bArr, iZza, zzdtVar);
                                zzduVar = (com.google.android.gms.internal.measurement.zzdu) zzdtVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iZza = com.google.android.gms.internal.measurement.zzdq.zza(i5, bArr, iZza, i2, zzdtVar);
                        }
                    }
                }
                if (zzduVar != null) {
                    zzhyVarZzb.zza((i4 << 3) | 2, zzduVar);
                }
                i = iZza;
            } else if ((i3 & 7) == 2) {
                zzfVar = (com.google.android.gms.internal.measurement.zzfd.zzf) this.zzd.zza(zzdtVar.zzd, this.zza, i3 >>> 3);
                if (zzfVar != null) {
                    com.google.android.gms.internal.measurement.zzgz.zza();
                    throw new java.lang.NoSuchMethodError();
                }
                i = com.google.android.gms.internal.measurement.zzdq.zza(i3, bArr, iZza, i2, zzhyVarZzb, zzdtVar);
            } else {
                i = com.google.android.gms.internal.measurement.zzdq.zza(i3, bArr, iZza, i2, zzdtVar);
            }
        }
        if (i != i2) {
            throw com.google.android.gms.internal.measurement.zzfo.zzg();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:45:0x000c->B:53:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, com.google.android.gms.internal.measurement.zzhe zzheVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        boolean zZzc;
        com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar = this.zzb;
        com.google.android.gms.internal.measurement.zzes<?> zzesVar = this.zzd;
        java.lang.Object objZzc = zzhvVar.zzc(t);
        com.google.android.gms.internal.measurement.zzew<T> zzewVarZzb = zzesVar.zzb(t);
        while (zzheVar.zza() != Integer.MAX_VALUE) {
            try {
                int iZzb = zzheVar.zzb();
                if (iZzb != 11) {
                    if ((iZzb & 7) == 2) {
                        java.lang.Object objZza = zzesVar.zza(zzeqVar, this.zza, iZzb >>> 3);
                        if (objZza != null) {
                            zzesVar.zza(zzheVar, objZza, zzeqVar, zzewVarZzb);
                        } else {
                            zZzc = zzhvVar.zza(objZzc, zzheVar);
                        }
                    } else {
                        zZzc = zzheVar.zzc();
                    }
                    if (!zZzc) {
                        zzhvVar.zzb(t, objZzc);
                        return;
                    }
                } else {
                    int iZzo = 0;
                    java.lang.Object objZza2 = null;
                    com.google.android.gms.internal.measurement.zzdu zzduVarZzn = null;
                    while (zzheVar.zza() != Integer.MAX_VALUE) {
                        int iZzb2 = zzheVar.zzb();
                        if (iZzb2 == 16) {
                            iZzo = zzheVar.zzo();
                            objZza2 = zzesVar.zza(zzeqVar, this.zza, iZzo);
                        } else if (iZzb2 == 26) {
                            if (objZza2 != null) {
                                zzesVar.zza(zzheVar, objZza2, zzeqVar, zzewVarZzb);
                            } else {
                                zzduVarZzn = zzheVar.zzn();
                            }
                        } else if (!zzheVar.zzc()) {
                            break;
                        }
                    }
                    if (zzheVar.zzb() != 12) {
                        throw com.google.android.gms.internal.measurement.zzfo.zze();
                    }
                    if (zzduVarZzn != null) {
                        if (objZza2 != null) {
                            zzesVar.zza(zzduVarZzn, objZza2, zzeqVar, zzewVarZzb);
                        } else {
                            zzhvVar.zza(objZzc, iZzo, zzduVarZzn);
                        }
                    }
                }
                zZzc = true;
                if (!zZzc) {
                    zzhvVar.zzb(t, objZzc);
                    return;
                }
            } catch (java.lang.Throwable th) {
                zzhvVar.zzb(t, objZzc);
                throw th;
            }
        }
        zzhvVar.zzb(t, objZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzc(T t) {
        this.zzb.zzd(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zzb(T t) {
        com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar = this.zzb;
        int iZze = zzhvVar.zze(zzhvVar.zzb(t)) + 0;
        return this.zzc ? iZze + this.zzd.zza(t).zzg() : iZze;
    }
}
