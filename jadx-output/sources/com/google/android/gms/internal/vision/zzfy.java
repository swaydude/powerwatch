package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfy implements com.google.android.gms.internal.vision.zzis {
    private int tag;
    private int zzrw;
    private final com.google.android.gms.internal.vision.zzft zzsp;
    private int zzsq = 0;

    public static com.google.android.gms.internal.vision.zzfy zza(com.google.android.gms.internal.vision.zzft zzftVar) {
        return zzftVar.zzsi != null ? zzftVar.zzsi : new com.google.android.gms.internal.vision.zzfy(zzftVar);
    }

    private zzfy(com.google.android.gms.internal.vision.zzft zzftVar) {
        com.google.android.gms.internal.vision.zzft zzftVar2 = (com.google.android.gms.internal.vision.zzft) com.google.android.gms.internal.vision.zzgt.zza(zzftVar, "input");
        this.zzsp = zzftVar2;
        zzftVar2.zzsi = this;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzdu() throws java.io.IOException {
        int i = this.zzsq;
        if (i != 0) {
            this.tag = i;
            this.zzsq = 0;
        } else {
            this.tag = this.zzsp.zzex();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzrw) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final boolean zzdv() throws java.io.IOException {
        int i;
        if (this.zzsp.zzdt() || (i = this.tag) == this.zzrw) {
            return false;
        }
        return this.zzsp.zzar(i);
    }

    private final void zzaj(int i) throws java.io.IOException {
        if ((this.tag & 7) != i) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final double readDouble() throws java.io.IOException {
        zzaj(1);
        return this.zzsp.readDouble();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final float readFloat() throws java.io.IOException {
        zzaj(5);
        return this.zzsp.readFloat();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzdw() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzdw();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzdx() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzdx();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzdy() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzdy();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzdz() throws java.io.IOException {
        zzaj(1);
        return this.zzsp.zzdz();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzea() throws java.io.IOException {
        zzaj(5);
        return this.zzsp.zzea();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final boolean zzeb() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzeb();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final java.lang.String readString() throws java.io.IOException {
        zzaj(2);
        return this.zzsp.readString();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final java.lang.String zzec() throws java.io.IOException {
        zzaj(2);
        return this.zzsp.zzec();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> T zza(java.lang.Class<T> cls, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        zzaj(2);
        return (T) zzb(com.google.android.gms.internal.vision.zzin.zzho().zzf(cls), zzgdVar);
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> T zza(com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        zzaj(2);
        return (T) zzb(zzirVar, zzgdVar);
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> T zzb(java.lang.Class<T> cls, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        zzaj(3);
        return (T) zzd(com.google.android.gms.internal.vision.zzin.zzho().zzf(cls), zzgdVar);
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> T zzc(com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        zzaj(3);
        return (T) zzd(zzirVar, zzgdVar);
    }

    private final <T> T zzb(com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int iZzee = this.zzsp.zzee();
        if (this.zzsp.zzsf >= this.zzsp.zzsg) {
            throw new com.google.android.gms.internal.vision.zzhc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iZzas = this.zzsp.zzas(iZzee);
        T tNewInstance = zzirVar.newInstance();
        this.zzsp.zzsf++;
        zzirVar.zza(tNewInstance, this, zzgdVar);
        zzirVar.zzg(tNewInstance);
        this.zzsp.zzaq(0);
        this.zzsp.zzsf--;
        this.zzsp.zzat(iZzas);
        return tNewInstance;
    }

    private final <T> T zzd(com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int i = this.zzrw;
        this.zzrw = ((this.tag >>> 3) << 3) | 4;
        try {
            T tNewInstance = zzirVar.newInstance();
            zzirVar.zza(tNewInstance, this, zzgdVar);
            zzirVar.zzg(tNewInstance);
            if (this.tag != this.zzrw) {
                throw com.google.android.gms.internal.vision.zzhc.zzgs();
            }
            this.zzrw = i;
            return tNewInstance;
        } catch (java.lang.Throwable th) {
            this.zzrw = i;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final com.google.android.gms.internal.vision.zzfh zzed() throws java.io.IOException {
        zzaj(2);
        return this.zzsp.zzed();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzee() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzee();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzef() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzef();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzeg() throws java.io.IOException {
        zzaj(5);
        return this.zzsp.zzeg();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzeh() throws java.io.IOException {
        zzaj(1);
        return this.zzsp.zzeh();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzei() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzei();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzej() throws java.io.IOException {
        zzaj(0);
        return this.zzsp.zzej();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zza(java.util.List<java.lang.Double> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgb) {
            com.google.android.gms.internal.vision.zzgb zzgbVar = (com.google.android.gms.internal.vision.zzgb) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzgbVar.zzc(this.zzsp.readDouble());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzee = this.zzsp.zzee();
                zzak(iZzee);
                int iZzez = this.zzsp.zzez() + iZzee;
                do {
                    zzgbVar.zzc(this.zzsp.readDouble());
                } while (this.zzsp.zzez() < iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.zzsp.readDouble()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzee2 = this.zzsp.zzee();
            zzak(iZzee2);
            int iZzez2 = this.zzsp.zzez() + iZzee2;
            do {
                list.add(java.lang.Double.valueOf(this.zzsp.readDouble()));
            } while (this.zzsp.zzez() < iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzb(java.util.List<java.lang.Float> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgo) {
            com.google.android.gms.internal.vision.zzgo zzgoVar = (com.google.android.gms.internal.vision.zzgo) list;
            int i = this.tag & 7;
            if (i == 2) {
                int iZzee = this.zzsp.zzee();
                zzal(iZzee);
                int iZzez = this.zzsp.zzez() + iZzee;
                do {
                    zzgoVar.zzu(this.zzsp.readFloat());
                } while (this.zzsp.zzez() < iZzez);
                return;
            }
            if (i == 5) {
                do {
                    zzgoVar.zzu(this.zzsp.readFloat());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int iZzee2 = this.zzsp.zzee();
            zzal(iZzee2);
            int iZzez2 = this.zzsp.zzez() + iZzee2;
            do {
                list.add(java.lang.Float.valueOf(this.zzsp.readFloat()));
            } while (this.zzsp.zzez() < iZzez2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(java.lang.Float.valueOf(this.zzsp.readFloat()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzc(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzhqVar.zzac(this.zzsp.zzdw());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzhqVar.zzac(this.zzsp.zzdw());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzdw()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzdw()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzd(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzhqVar.zzac(this.zzsp.zzdx());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzhqVar.zzac(this.zzsp.zzdx());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzdx()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzdx()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zze(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzguVar.zzbl(this.zzsp.zzdy());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzguVar.zzbl(this.zzsp.zzdy());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzdy()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzdy()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzf(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzhqVar.zzac(this.zzsp.zzdz());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzee = this.zzsp.zzee();
                zzak(iZzee);
                int iZzez = this.zzsp.zzez() + iZzee;
                do {
                    zzhqVar.zzac(this.zzsp.zzdz());
                } while (this.zzsp.zzez() < iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzdz()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzee2 = this.zzsp.zzee();
            zzak(iZzee2);
            int iZzez2 = this.zzsp.zzez() + iZzee2;
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzdz()));
            } while (this.zzsp.zzez() < iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzg(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i = this.tag & 7;
            if (i == 2) {
                int iZzee = this.zzsp.zzee();
                zzal(iZzee);
                int iZzez = this.zzsp.zzez() + iZzee;
                do {
                    zzguVar.zzbl(this.zzsp.zzea());
                } while (this.zzsp.zzez() < iZzez);
                return;
            }
            if (i == 5) {
                do {
                    zzguVar.zzbl(this.zzsp.zzea());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int iZzee2 = this.zzsp.zzee();
            zzal(iZzee2);
            int iZzez2 = this.zzsp.zzez() + iZzee2;
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzea()));
            } while (this.zzsp.zzez() < iZzez2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzea()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzh(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzff) {
            com.google.android.gms.internal.vision.zzff zzffVar = (com.google.android.gms.internal.vision.zzff) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzffVar.addBoolean(this.zzsp.zzeb());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzffVar.addBoolean(this.zzsp.zzeb());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.zzsp.zzeb()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Boolean.valueOf(this.zzsp.zzeb()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void readStringList(java.util.List<java.lang.String> list) throws java.io.IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzi(java.util.List<java.lang.String> list) throws java.io.IOException {
        zza(list, true);
    }

    private final void zza(java.util.List<java.lang.String> list, boolean z) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if ((this.tag & 7) != 2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        if ((list instanceof com.google.android.gms.internal.vision.zzhj) && !z) {
            com.google.android.gms.internal.vision.zzhj zzhjVar = (com.google.android.gms.internal.vision.zzhj) list;
            do {
                zzhjVar.zzc(zzed());
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex2 = this.zzsp.zzex();
                }
            } while (iZzex2 == this.tag);
            this.zzsq = iZzex2;
            return;
        }
        do {
            list.add(z ? zzec() : readString());
            if (this.zzsp.zzdt()) {
                return;
            } else {
                iZzex = this.zzsp.zzex();
            }
        } while (iZzex == this.tag);
        this.zzsq = iZzex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> void zza(java.util.List<T> list, com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int iZzex;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(zzb(zzirVar, zzgdVar));
            if (this.zzsp.zzdt() || this.zzsq != 0) {
                return;
            } else {
                iZzex = this.zzsp.zzex();
            }
        } while (iZzex == i);
        this.zzsq = iZzex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> void zzb(java.util.List<T> list, com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int iZzex;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(zzd(zzirVar, zzgdVar));
            if (this.zzsp.zzdt() || this.zzsq != 0) {
                return;
            } else {
                iZzex = this.zzsp.zzex();
            }
        } while (iZzex == i);
        this.zzsq = iZzex;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzj(java.util.List<com.google.android.gms.internal.vision.zzfh> list) throws java.io.IOException {
        int iZzex;
        if ((this.tag & 7) != 2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(zzed());
            if (this.zzsp.zzdt()) {
                return;
            } else {
                iZzex = this.zzsp.zzex();
            }
        } while (iZzex == this.tag);
        this.zzsq = iZzex;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzk(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzguVar.zzbl(this.zzsp.zzee());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzguVar.zzbl(this.zzsp.zzee());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzee()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzee()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzl(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzguVar.zzbl(this.zzsp.zzef());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzguVar.zzbl(this.zzsp.zzef());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzef()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzef()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzm(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i = this.tag & 7;
            if (i == 2) {
                int iZzee = this.zzsp.zzee();
                zzal(iZzee);
                int iZzez = this.zzsp.zzez() + iZzee;
                do {
                    zzguVar.zzbl(this.zzsp.zzeg());
                } while (this.zzsp.zzez() < iZzez);
                return;
            }
            if (i == 5) {
                do {
                    zzguVar.zzbl(this.zzsp.zzeg());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int iZzee2 = this.zzsp.zzee();
            zzal(iZzee2);
            int iZzez2 = this.zzsp.zzez() + iZzee2;
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzeg()));
            } while (this.zzsp.zzez() < iZzez2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzeg()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzn(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzhqVar.zzac(this.zzsp.zzeh());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzee = this.zzsp.zzee();
                zzak(iZzee);
                int iZzez = this.zzsp.zzez() + iZzee;
                do {
                    zzhqVar.zzac(this.zzsp.zzeh());
                } while (this.zzsp.zzez() < iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzeh()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzee2 = this.zzsp.zzee();
            zzak(iZzee2);
            int iZzez2 = this.zzsp.zzez() + iZzee2;
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzeh()));
            } while (this.zzsp.zzez() < iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzo(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzguVar.zzbl(this.zzsp.zzei());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzguVar.zzbl(this.zzsp.zzei());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzei()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Integer.valueOf(this.zzsp.zzei()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzp(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int iZzex;
        int iZzex2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzhqVar.zzac(this.zzsp.zzej());
                    if (this.zzsp.zzdt()) {
                        return;
                    } else {
                        iZzex2 = this.zzsp.zzex();
                    }
                } while (iZzex2 == this.tag);
                this.zzsq = iZzex2;
                return;
            }
            if (i == 2) {
                int iZzez = this.zzsp.zzez() + this.zzsp.zzee();
                do {
                    zzhqVar.zzac(this.zzsp.zzej());
                } while (this.zzsp.zzez() < iZzez);
                zzam(iZzez);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzej()));
                if (this.zzsp.zzdt()) {
                    return;
                } else {
                    iZzex = this.zzsp.zzex();
                }
            } while (iZzex == this.tag);
            this.zzsq = iZzex;
            return;
        }
        if (i2 == 2) {
            int iZzez2 = this.zzsp.zzez() + this.zzsp.zzee();
            do {
                list.add(java.lang.Long.valueOf(this.zzsp.zzej()));
            } while (this.zzsp.zzez() < iZzez2);
            zzam(iZzez2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    private static void zzak(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzis
    public final <K, V> void zza(java.util.Map<K, V> map, com.google.android.gms.internal.vision.zzht<K, V> zzhtVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        zzaj(2);
        int iZzas = this.zzsp.zzas(this.zzsp.zzee());
        java.lang.Object objZza = zzhtVar.zzyn;
        java.lang.Object objZza2 = zzhtVar.zzgc;
        while (true) {
            try {
                int iZzdu = zzdu();
                if (iZzdu == Integer.MAX_VALUE || this.zzsp.zzdt()) {
                    break;
                }
                if (iZzdu == 1) {
                    objZza = zza(zzhtVar.zzym, (java.lang.Class<?>) null, (com.google.android.gms.internal.vision.zzgd) null);
                } else if (iZzdu == 2) {
                    objZza2 = zza(zzhtVar.zzyo, zzhtVar.zzgc.getClass(), zzgdVar);
                } else {
                    try {
                        if (!zzdv()) {
                            throw new com.google.android.gms.internal.vision.zzhc("Unable to parse map entry.");
                        }
                    } catch (com.google.android.gms.internal.vision.zzhb unused) {
                        if (!zzdv()) {
                            throw new com.google.android.gms.internal.vision.zzhc("Unable to parse map entry.");
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                this.zzsp.zzat(iZzas);
                throw th;
            }
        }
        map.put(objZza, objZza2);
        this.zzsp.zzat(iZzas);
    }

    private final java.lang.Object zza(com.google.android.gms.internal.vision.zzka zzkaVar, java.lang.Class<?> cls, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.vision.zzfx.zzrr[zzkaVar.ordinal()]) {
            case 1:
                return java.lang.Boolean.valueOf(zzeb());
            case 2:
                return zzed();
            case 3:
                return java.lang.Double.valueOf(readDouble());
            case 4:
                return java.lang.Integer.valueOf(zzef());
            case 5:
                return java.lang.Integer.valueOf(zzea());
            case 6:
                return java.lang.Long.valueOf(zzdz());
            case 7:
                return java.lang.Float.valueOf(readFloat());
            case 8:
                return java.lang.Integer.valueOf(zzdy());
            case 9:
                return java.lang.Long.valueOf(zzdx());
            case 10:
                return zza(cls, zzgdVar);
            case 11:
                return java.lang.Integer.valueOf(zzeg());
            case 12:
                return java.lang.Long.valueOf(zzeh());
            case 13:
                return java.lang.Integer.valueOf(zzei());
            case 14:
                return java.lang.Long.valueOf(zzej());
            case 15:
                return zzec();
            case 16:
                return java.lang.Integer.valueOf(zzee());
            case 17:
                return java.lang.Long.valueOf(zzdw());
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    private static void zzal(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
    }

    private final void zzam(int i) throws java.io.IOException {
        if (this.zzsp.zzez() != i) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
    }
}
