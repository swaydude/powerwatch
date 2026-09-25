package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzel implements com.google.android.gms.internal.measurement.zzhe {
    private final com.google.android.gms.internal.measurement.zzeg zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public static com.google.android.gms.internal.measurement.zzel zza(com.google.android.gms.internal.measurement.zzeg zzegVar) {
        return zzegVar.zzc != null ? zzegVar.zzc : new com.google.android.gms.internal.measurement.zzel(zzegVar);
    }

    private zzel(com.google.android.gms.internal.measurement.zzeg zzegVar) {
        com.google.android.gms.internal.measurement.zzeg zzegVar2 = (com.google.android.gms.internal.measurement.zzeg) com.google.android.gms.internal.measurement.zzff.zza(zzegVar, "input");
        this.zza = zzegVar2;
        zzegVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zza() throws java.io.IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zza();
        }
        int i2 = this.zzb;
        if (i2 == 0 || i2 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final boolean zzc() throws java.io.IOException {
        int i;
        if (this.zza.zzt() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzb(i);
    }

    private final void zza(int i) throws java.io.IOException {
        if ((this.zzb & 7) != i) {
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final double zzd() throws java.io.IOException {
        zza(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final float zze() throws java.io.IOException {
        zza(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzf() throws java.io.IOException {
        zza(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzg() throws java.io.IOException {
        zza(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzh() throws java.io.IOException {
        zza(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzi() throws java.io.IOException {
        zza(1);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzj() throws java.io.IOException {
        zza(5);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final boolean zzk() throws java.io.IOException {
        zza(0);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final java.lang.String zzl() throws java.io.IOException {
        zza(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final java.lang.String zzm() throws java.io.IOException {
        zza(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> T zza(com.google.android.gms.internal.measurement.zzhd<T> zzhdVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        zza(2);
        return (T) zzc(zzhdVar, zzeqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> T zzb(com.google.android.gms.internal.measurement.zzhd<T> zzhdVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        zza(3);
        return (T) zzd(zzhdVar, zzeqVar);
    }

    private final <T> T zzc(com.google.android.gms.internal.measurement.zzhd<T> zzhdVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        int iZzm = this.zza.zzm();
        if (this.zza.zza >= this.zza.zzb) {
            throw new com.google.android.gms.internal.measurement.zzfo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZzc = this.zza.zzc(iZzm);
        T tZza = zzhdVar.zza();
        this.zza.zza++;
        zzhdVar.zza(tZza, this, zzeqVar);
        zzhdVar.zzc(tZza);
        this.zza.zza(0);
        this.zza.zza--;
        this.zza.zzd(iZzc);
        return tZza;
    }

    private final <T> T zzd(com.google.android.gms.internal.measurement.zzhd<T> zzhdVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            T tZza = zzhdVar.zza();
            zzhdVar.zza(tZza, this, zzeqVar);
            zzhdVar.zzc(tZza);
            if (this.zzb != this.zzc) {
                throw com.google.android.gms.internal.measurement.zzfo.zzg();
            }
            this.zzc = i;
            return tZza;
        } catch (java.lang.Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final com.google.android.gms.internal.measurement.zzdu zzn() throws java.io.IOException {
        zza(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzo() throws java.io.IOException {
        zza(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzp() throws java.io.IOException {
        zza(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzq() throws java.io.IOException {
        zza(5);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzr() throws java.io.IOException {
        zza(1);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final int zzs() throws java.io.IOException {
        zza(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final long zzt() throws java.io.IOException {
        zza(0);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zza(java.util.List<java.lang.Double> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzeo) {
            com.google.android.gms.internal.measurement.zzeo zzeoVar = (com.google.android.gms.internal.measurement.zzeo) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzeoVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzb(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzeoVar.zza(this.zza.zzb());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzm2 = this.zza.zzm();
            zzb(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(java.lang.Double.valueOf(this.zza.zzb()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzb(java.util.List<java.lang.Float> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfc) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzc(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzfcVar.zza(this.zza.zzc());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            if (i == 5) {
                do {
                    zzfcVar.zza(this.zza.zzc());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int iZzm2 = this.zza.zzm();
            zzc(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(java.lang.Float.valueOf(this.zza.zzc()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(java.lang.Float.valueOf(this.zza.zzc()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzc(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgcVar.zza(this.zza.zzd());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzgcVar.zza(this.zza.zzd());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzd()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzd()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzd(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgcVar.zza(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzgcVar.zza(this.zza.zze());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Long.valueOf(this.zza.zze()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zze(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfgVar.zzd(this.zza.zzf());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzfgVar.zzd(this.zza.zzf());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzf(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzgcVar.zza(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzb(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzgcVar.zza(this.zza.zzg());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzm2 = this.zza.zzm();
            zzb(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzg()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzg(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzc(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzfgVar.zzd(this.zza.zzh());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            if (i == 5) {
                do {
                    zzfgVar.zzd(this.zza.zzh());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int iZzm2 = this.zza.zzm();
            zzc(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzh(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzds) {
            com.google.android.gms.internal.measurement.zzds zzdsVar = (com.google.android.gms.internal.measurement.zzds) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzdsVar.zza(this.zza.zzi());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzdsVar.zza(this.zza.zzi());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.zza.zzi()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Boolean.valueOf(this.zza.zzi()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzi(java.util.List<java.lang.String> list) throws java.io.IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzj(java.util.List<java.lang.String> list) throws java.io.IOException {
        zza(list, true);
    }

    private final void zza(java.util.List<java.lang.String> list, boolean z) throws java.io.IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        if ((list instanceof com.google.android.gms.internal.measurement.zzfv) && !z) {
            com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) list;
            do {
                zzfvVar.zza(zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza2 = this.zza.zza();
                }
            } while (iZza2 == this.zzb);
            this.zzd = iZza2;
            return;
        }
        do {
            list.add(z ? zzm() : zzl());
            if (this.zza.zzt()) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> void zza(java.util.List<T> list, com.google.android.gms.internal.measurement.zzhd<T> zzhdVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        int iZza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        do {
            list.add(zzc(zzhdVar, zzeqVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == i);
        this.zzd = iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <T> void zzb(java.util.List<T> list, com.google.android.gms.internal.measurement.zzhd<T> zzhdVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        int iZza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        do {
            list.add(zzd(zzhdVar, zzeqVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == i);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzk(java.util.List<com.google.android.gms.internal.measurement.zzdu> list) throws java.io.IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        do {
            list.add(zzn());
            if (this.zza.zzt()) {
                return;
            } else {
                iZza = this.zza.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzl(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfgVar.zzd(this.zza.zzm());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzfgVar.zzd(this.zza.zzm());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzm()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzm(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfgVar.zzd(this.zza.zzn());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzfgVar.zzd(this.zza.zzn());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzn()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzn(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzc(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzfgVar.zzd(this.zza.zzo());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            if (i == 5) {
                do {
                    zzfgVar.zzd(this.zza.zzo());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int iZzm2 = this.zza.zzm();
            zzc(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzo()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzo()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzo(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzgcVar.zza(this.zza.zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzb(iZzm);
                int iZzu = this.zza.zzu() + iZzm;
                do {
                    zzgcVar.zza(this.zza.zzp());
                } while (this.zza.zzu() < iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzp()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzm2 = this.zza.zzm();
            zzb(iZzm2);
            int iZzu2 = this.zza.zzu() + iZzm2;
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzu() < iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzp(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzfgVar.zzd(this.zza.zzq());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzfgVar.zzd(this.zza.zzq());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzq()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Integer.valueOf(this.zza.zzq()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final void zzq(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZza;
        int iZza2;
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzgcVar.zza(this.zza.zzr());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZza2 = this.zza.zza();
                    }
                } while (iZza2 == this.zzb);
                this.zzd = iZza2;
                return;
            }
            if (i == 2) {
                int iZzu = this.zza.zzu() + this.zza.zzm();
                do {
                    zzgcVar.zza(this.zza.zzr());
                } while (this.zza.zzu() < iZzu);
                zzd(iZzu);
                return;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzr()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZza = this.zza.zza();
                }
            } while (iZza == this.zzb);
            this.zzd = iZza;
            return;
        }
        if (i2 == 2) {
            int iZzu2 = this.zza.zzu() + this.zza.zzm();
            do {
                list.add(java.lang.Long.valueOf(this.zza.zzr()));
            } while (this.zza.zzu() < iZzu2);
            zzd(iZzu2);
            return;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzf();
    }

    private static void zzb(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw com.google.android.gms.internal.measurement.zzfo.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhe
    public final <K, V> void zza(java.util.Map<K, V> map, com.google.android.gms.internal.measurement.zzgf<K, V> zzgfVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        zza(2);
        int iZzc = this.zza.zzc(this.zza.zzm());
        java.lang.Object objZza = zzgfVar.zzb;
        java.lang.Object objZza2 = zzgfVar.zzd;
        while (true) {
            try {
                int iZza = zza();
                if (iZza == Integer.MAX_VALUE || this.zza.zzt()) {
                    break;
                }
                if (iZza == 1) {
                    objZza = zza(zzgfVar.zza, (java.lang.Class<?>) null, (com.google.android.gms.internal.measurement.zzeq) null);
                } else if (iZza == 2) {
                    objZza2 = zza(zzgfVar.zzc, zzgfVar.zzd.getClass(), zzeqVar);
                } else {
                    try {
                        if (!zzc()) {
                            throw new com.google.android.gms.internal.measurement.zzfo("Unable to parse map entry.");
                        }
                    } catch (com.google.android.gms.internal.measurement.zzfn unused) {
                        if (!zzc()) {
                            throw new com.google.android.gms.internal.measurement.zzfo("Unable to parse map entry.");
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                this.zza.zzd(iZzc);
                throw th;
            }
        }
        map.put(objZza, objZza2);
        this.zza.zzd(iZzc);
    }

    private final java.lang.Object zza(com.google.android.gms.internal.measurement.zzim zzimVar, java.lang.Class<?> cls, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.measurement.zzek.zza[zzimVar.ordinal()]) {
            case 1:
                return java.lang.Boolean.valueOf(zzk());
            case 2:
                return zzn();
            case 3:
                return java.lang.Double.valueOf(zzd());
            case 4:
                return java.lang.Integer.valueOf(zzp());
            case 5:
                return java.lang.Integer.valueOf(zzj());
            case 6:
                return java.lang.Long.valueOf(zzi());
            case 7:
                return java.lang.Float.valueOf(zze());
            case 8:
                return java.lang.Integer.valueOf(zzh());
            case 9:
                return java.lang.Long.valueOf(zzg());
            case 10:
                zza(2);
                return zzc(com.google.android.gms.internal.measurement.zzgz.zza().zza((java.lang.Class) cls), zzeqVar);
            case 11:
                return java.lang.Integer.valueOf(zzq());
            case 12:
                return java.lang.Long.valueOf(zzr());
            case 13:
                return java.lang.Integer.valueOf(zzs());
            case 14:
                return java.lang.Long.valueOf(zzt());
            case 15:
                return zzm();
            case 16:
                return java.lang.Integer.valueOf(zzo());
            case 17:
                return java.lang.Long.valueOf(zzf());
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    private static void zzc(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw com.google.android.gms.internal.measurement.zzfo.zzg();
        }
    }

    private final void zzd(int i) throws java.io.IOException {
        if (this.zza.zzu() != i) {
            throw com.google.android.gms.internal.measurement.zzfo.zza();
        }
    }
}
