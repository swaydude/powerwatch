package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfg extends com.google.android.gms.internal.vision.zzfe {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private int tag;
    private final boolean zzru;
    private final int zzrv;
    private int zzrw;

    public zzfg(java.nio.ByteBuffer byteBuffer, boolean z) {
        super(null);
        this.zzru = true;
        this.buffer = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.pos = iArrayOffset;
        this.zzrv = iArrayOffset;
        this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final boolean zzdt() {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzdu() throws java.io.IOException {
        if (zzdt()) {
            return Integer.MAX_VALUE;
        }
        int iZzek = zzek();
        this.tag = iZzek;
        if (iZzek == this.zzrw) {
            return Integer.MAX_VALUE;
        }
        return iZzek >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int getTag() {
        return this.tag;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[LOOP:2: B:43:0x0074->B:46:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.vision.zzis
    public final boolean zzdv() throws java.io.IOException {
        int i;
        int i2;
        if (zzdt() || (i = this.tag) == (i2 = this.zzrw)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 == 1) {
                zzah(8);
                return true;
            }
            if (i3 == 2) {
                zzah(zzek());
                return true;
            }
            if (i3 != 3) {
                if (i3 == 5) {
                    zzah(4);
                    return true;
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            this.zzrw = ((i >>> 3) << 3) | 4;
            while (zzdu() != Integer.MAX_VALUE && zzdv()) {
            }
            if (this.tag != this.zzrw) {
                throw com.google.android.gms.internal.vision.zzhc.zzgs();
            }
            this.zzrw = i2;
            return true;
        }
        int i4 = this.limit;
        int i5 = this.pos;
        if (i4 - i5 >= 10) {
            byte[] bArr = this.buffer;
            int i6 = 0;
            while (i6 < 10) {
                int i7 = i5 + 1;
                if (bArr[i5] >= 0) {
                    this.pos = i7;
                } else {
                    i6++;
                    i5 = i7;
                }
            }
            for (int i8 = 0; i8 < 10; i8++) {
                if (readByte() < 0) {
                }
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgo();
        }
        while (i8 < 10) {
            if (readByte() < 0) {
            }
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgo();
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final double readDouble() throws java.io.IOException {
        zzaj(1);
        return java.lang.Double.longBitsToDouble(zzeo());
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final float readFloat() throws java.io.IOException {
        zzaj(5);
        return java.lang.Float.intBitsToFloat(zzen());
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzdw() throws java.io.IOException {
        zzaj(0);
        return zzel();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzdx() throws java.io.IOException {
        zzaj(0);
        return zzel();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzdy() throws java.io.IOException {
        zzaj(0);
        return zzek();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzdz() throws java.io.IOException {
        zzaj(1);
        return zzeo();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzea() throws java.io.IOException {
        zzaj(5);
        return zzen();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final boolean zzeb() throws java.io.IOException {
        zzaj(0);
        return zzek() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final java.lang.String readString() throws java.io.IOException {
        return zzj(false);
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final java.lang.String zzec() throws java.io.IOException {
        return zzj(true);
    }

    private final java.lang.String zzj(boolean z) throws java.io.IOException {
        zzaj(2);
        int iZzek = zzek();
        if (iZzek == 0) {
            return "";
        }
        zzai(iZzek);
        if (z) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            if (!com.google.android.gms.internal.vision.zzjs.zzf(bArr, i, i + iZzek)) {
                throw com.google.android.gms.internal.vision.zzhc.zzgt();
            }
        }
        java.lang.String str = new java.lang.String(this.buffer, this.pos, iZzek, com.google.android.gms.internal.vision.zzgt.UTF_8);
        this.pos += iZzek;
        return str;
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

    private final <T> T zzb(com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int iZzek = zzek();
        zzai(iZzek);
        int i = this.limit;
        int i2 = this.pos + iZzek;
        this.limit = i2;
        try {
            T tNewInstance = zzirVar.newInstance();
            zzirVar.zza(tNewInstance, this, zzgdVar);
            zzirVar.zzg(tNewInstance);
            if (this.pos != i2) {
                throw com.google.android.gms.internal.vision.zzhc.zzgs();
            }
            this.limit = i;
            return tNewInstance;
        } catch (java.lang.Throwable th) {
            this.limit = i;
            throw th;
        }
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
        com.google.android.gms.internal.vision.zzfh zzfhVarZza;
        zzaj(2);
        int iZzek = zzek();
        if (iZzek == 0) {
            return com.google.android.gms.internal.vision.zzfh.zzrx;
        }
        zzai(iZzek);
        if (this.zzru) {
            zzfhVarZza = com.google.android.gms.internal.vision.zzfh.zzb(this.buffer, this.pos, iZzek);
        } else {
            zzfhVarZza = com.google.android.gms.internal.vision.zzfh.zza(this.buffer, this.pos, iZzek);
        }
        this.pos += iZzek;
        return zzfhVarZza;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzee() throws java.io.IOException {
        zzaj(0);
        return zzek();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzef() throws java.io.IOException {
        zzaj(0);
        return zzek();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzeg() throws java.io.IOException {
        zzaj(5);
        return zzen();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzeh() throws java.io.IOException {
        zzaj(1);
        return zzeo();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final int zzei() throws java.io.IOException {
        zzaj(0);
        return com.google.android.gms.internal.vision.zzft.zzau(zzek());
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final long zzej() throws java.io.IOException {
        zzaj(0);
        return com.google.android.gms.internal.vision.zzft.zzr(zzel());
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zza(java.util.List<java.lang.Double> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgb) {
            com.google.android.gms.internal.vision.zzgb zzgbVar = (com.google.android.gms.internal.vision.zzgb) list;
            int i3 = this.tag & 7;
            if (i3 == 1) {
                do {
                    zzgbVar.zzc(readDouble());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            if (i3 == 2) {
                int iZzek = zzek();
                zzak(iZzek);
                int i4 = this.pos + iZzek;
                while (this.pos < i4) {
                    zzgbVar.zzc(java.lang.Double.longBitsToDouble(zzeq()));
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i5 = this.tag & 7;
        if (i5 == 1) {
            do {
                list.add(java.lang.Double.valueOf(readDouble()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        if (i5 == 2) {
            int iZzek2 = zzek();
            zzak(iZzek2);
            int i6 = this.pos + iZzek2;
            while (this.pos < i6) {
                list.add(java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(zzeq())));
            }
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzb(java.util.List<java.lang.Float> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgo) {
            com.google.android.gms.internal.vision.zzgo zzgoVar = (com.google.android.gms.internal.vision.zzgo) list;
            int i3 = this.tag & 7;
            if (i3 == 2) {
                int iZzek = zzek();
                zzal(iZzek);
                int i4 = this.pos + iZzek;
                while (this.pos < i4) {
                    zzgoVar.zzu(java.lang.Float.intBitsToFloat(zzep()));
                }
                return;
            }
            if (i3 == 5) {
                do {
                    zzgoVar.zzu(readFloat());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i5 = this.tag & 7;
        if (i5 == 2) {
            int iZzek2 = zzek();
            zzal(iZzek2);
            int i6 = this.pos + iZzek2;
            while (this.pos < i6) {
                list.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(zzep())));
            }
            return;
        }
        if (i5 == 5) {
            do {
                list.add(java.lang.Float.valueOf(readFloat()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzc(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i3 = this.tag & 7;
            if (i3 == 0) {
                do {
                    zzhqVar.zzac(zzdw());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            if (i3 == 2) {
                int iZzek = this.pos + zzek();
                while (this.pos < iZzek) {
                    zzhqVar.zzac(zzel());
                }
                zzam(iZzek);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i4 = this.tag & 7;
        if (i4 == 0) {
            do {
                list.add(java.lang.Long.valueOf(zzdw()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        if (i4 == 2) {
            int iZzek2 = this.pos + zzek();
            while (this.pos < iZzek2) {
                list.add(java.lang.Long.valueOf(zzel()));
            }
            zzam(iZzek2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzd(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i3 = this.tag & 7;
            if (i3 == 0) {
                do {
                    zzhqVar.zzac(zzdx());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            if (i3 == 2) {
                int iZzek = this.pos + zzek();
                while (this.pos < iZzek) {
                    zzhqVar.zzac(zzel());
                }
                zzam(iZzek);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i4 = this.tag & 7;
        if (i4 == 0) {
            do {
                list.add(java.lang.Long.valueOf(zzdx()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        if (i4 == 2) {
            int iZzek2 = this.pos + zzek();
            while (this.pos < iZzek2) {
                list.add(java.lang.Long.valueOf(zzel()));
            }
            zzam(iZzek2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zze(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i3 = this.tag & 7;
            if (i3 == 0) {
                do {
                    zzguVar.zzbl(zzdy());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            if (i3 == 2) {
                int iZzek = this.pos + zzek();
                while (this.pos < iZzek) {
                    zzguVar.zzbl(zzek());
                }
                zzam(iZzek);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i4 = this.tag & 7;
        if (i4 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(zzdy()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        if (i4 == 2) {
            int iZzek2 = this.pos + zzek();
            while (this.pos < iZzek2) {
                list.add(java.lang.Integer.valueOf(zzek()));
            }
            zzam(iZzek2);
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzf(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i3 = this.tag & 7;
            if (i3 == 1) {
                do {
                    zzhqVar.zzac(zzdz());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            if (i3 == 2) {
                int iZzek = zzek();
                zzak(iZzek);
                int i4 = this.pos + iZzek;
                while (this.pos < i4) {
                    zzhqVar.zzac(zzeq());
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i5 = this.tag & 7;
        if (i5 == 1) {
            do {
                list.add(java.lang.Long.valueOf(zzdz()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        if (i5 == 2) {
            int iZzek2 = zzek();
            zzak(iZzek2);
            int i6 = this.pos + iZzek2;
            while (this.pos < i6) {
                list.add(java.lang.Long.valueOf(zzeq()));
            }
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzg(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i3 = this.tag & 7;
            if (i3 == 2) {
                int iZzek = zzek();
                zzal(iZzek);
                int i4 = this.pos + iZzek;
                while (this.pos < i4) {
                    zzguVar.zzbl(zzep());
                }
                return;
            }
            if (i3 == 5) {
                do {
                    zzguVar.zzbl(zzea());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i5 = this.tag & 7;
        if (i5 == 2) {
            int iZzek2 = zzek();
            zzal(iZzek2);
            int i6 = this.pos + iZzek2;
            while (this.pos < i6) {
                list.add(java.lang.Integer.valueOf(zzep()));
            }
            return;
        }
        if (i5 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(zzea()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzh(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzff) {
            com.google.android.gms.internal.vision.zzff zzffVar = (com.google.android.gms.internal.vision.zzff) list;
            int i3 = this.tag & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int iZzek = this.pos + zzek();
                    while (this.pos < iZzek) {
                        zzffVar.addBoolean(zzek() != 0);
                    }
                    zzam(iZzek);
                    return;
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            do {
                zzffVar.addBoolean(zzeb());
                if (zzdt()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i2;
            return;
        }
        int i4 = this.tag & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int iZzek2 = this.pos + zzek();
                while (this.pos < iZzek2) {
                    list.add(java.lang.Boolean.valueOf(zzek() != 0));
                }
                zzam(iZzek2);
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(java.lang.Boolean.valueOf(zzeb()));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
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
        int i;
        int i2;
        if ((this.tag & 7) != 2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        if ((list instanceof com.google.android.gms.internal.vision.zzhj) && !z) {
            com.google.android.gms.internal.vision.zzhj zzhjVar = (com.google.android.gms.internal.vision.zzhj) list;
            do {
                zzhjVar.zzc(zzed());
                if (zzdt()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i2;
            return;
        }
        do {
            list.add(zzj(z));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> void zza(java.util.List<T> list, com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int i;
        int i2 = this.tag;
        if ((i2 & 7) != 2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(zzb(zzirVar, zzgdVar));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == i2);
        this.pos = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzis
    public final <T> void zzb(java.util.List<T> list, com.google.android.gms.internal.vision.zzir<T> zzirVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int i;
        int i2 = this.tag;
        if ((i2 & 7) != 3) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(zzd(zzirVar, zzgdVar));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == i2);
        this.pos = i;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzj(java.util.List<com.google.android.gms.internal.vision.zzfh> list) throws java.io.IOException {
        int i;
        if ((this.tag & 7) != 2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(zzed());
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzk(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i3 = this.tag & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int iZzek = this.pos + zzek();
                    while (this.pos < iZzek) {
                        zzguVar.zzbl(zzek());
                    }
                    return;
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            do {
                zzguVar.zzbl(zzee());
                if (zzdt()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i2;
            return;
        }
        int i4 = this.tag & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int iZzek2 = this.pos + zzek();
                while (this.pos < iZzek2) {
                    list.add(java.lang.Integer.valueOf(zzek()));
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(java.lang.Integer.valueOf(zzee()));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzl(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i3 = this.tag & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int iZzek = this.pos + zzek();
                    while (this.pos < iZzek) {
                        zzguVar.zzbl(zzek());
                    }
                    return;
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            do {
                zzguVar.zzbl(zzef());
                if (zzdt()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i2;
            return;
        }
        int i4 = this.tag & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int iZzek2 = this.pos + zzek();
                while (this.pos < iZzek2) {
                    list.add(java.lang.Integer.valueOf(zzek()));
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(java.lang.Integer.valueOf(zzef()));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzm(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i3 = this.tag & 7;
            if (i3 == 2) {
                int iZzek = zzek();
                zzal(iZzek);
                int i4 = this.pos + iZzek;
                while (this.pos < i4) {
                    zzguVar.zzbl(zzep());
                }
                return;
            }
            if (i3 == 5) {
                do {
                    zzguVar.zzbl(zzeg());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i5 = this.tag & 7;
        if (i5 == 2) {
            int iZzek2 = zzek();
            zzal(iZzek2);
            int i6 = this.pos + iZzek2;
            while (this.pos < i6) {
                list.add(java.lang.Integer.valueOf(zzep()));
            }
            return;
        }
        if (i5 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(zzeg()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzn(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i3 = this.tag & 7;
            if (i3 == 1) {
                do {
                    zzhqVar.zzac(zzeh());
                    if (zzdt()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (zzek() == this.tag);
                this.pos = i2;
                return;
            }
            if (i3 == 2) {
                int iZzek = zzek();
                zzak(iZzek);
                int i4 = this.pos + iZzek;
                while (this.pos < i4) {
                    zzhqVar.zzac(zzeq());
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        int i5 = this.tag & 7;
        if (i5 == 1) {
            do {
                list.add(java.lang.Long.valueOf(zzeh()));
                if (zzdt()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i;
            return;
        }
        if (i5 == 2) {
            int iZzek2 = zzek();
            zzak(iZzek2);
            int i6 = this.pos + iZzek2;
            while (this.pos < i6) {
                list.add(java.lang.Long.valueOf(zzeq()));
            }
            return;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgr();
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzo(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzgu) {
            com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) list;
            int i3 = this.tag & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int iZzek = this.pos + zzek();
                    while (this.pos < iZzek) {
                        zzguVar.zzbl(com.google.android.gms.internal.vision.zzft.zzau(zzek()));
                    }
                    return;
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            do {
                zzguVar.zzbl(zzei());
                if (zzdt()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i2;
            return;
        }
        int i4 = this.tag & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int iZzek2 = this.pos + zzek();
                while (this.pos < iZzek2) {
                    list.add(java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzft.zzau(zzek())));
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(java.lang.Integer.valueOf(zzei()));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
    }

    @Override // com.google.android.gms.internal.vision.zzis
    public final void zzp(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int i;
        int i2;
        if (list instanceof com.google.android.gms.internal.vision.zzhq) {
            com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) list;
            int i3 = this.tag & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int iZzek = this.pos + zzek();
                    while (this.pos < iZzek) {
                        zzhqVar.zzac(com.google.android.gms.internal.vision.zzft.zzr(zzel()));
                    }
                    return;
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            do {
                zzhqVar.zzac(zzej());
                if (zzdt()) {
                    return;
                } else {
                    i2 = this.pos;
                }
            } while (zzek() == this.tag);
            this.pos = i2;
            return;
        }
        int i4 = this.tag & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int iZzek2 = this.pos + zzek();
                while (this.pos < iZzek2) {
                    list.add(java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzft.zzr(zzel())));
                }
                return;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            list.add(java.lang.Long.valueOf(zzej()));
            if (zzdt()) {
                return;
            } else {
                i = this.pos;
            }
        } while (zzek() == this.tag);
        this.pos = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzis
    public final <K, V> void zza(java.util.Map<K, V> map, com.google.android.gms.internal.vision.zzht<K, V> zzhtVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        zzaj(2);
        int iZzek = zzek();
        zzai(iZzek);
        int i = this.limit;
        this.limit = this.pos + iZzek;
        try {
            java.lang.Object objZza = zzhtVar.zzyn;
            java.lang.Object objZza2 = zzhtVar.zzgc;
            while (true) {
                int iZzdu = zzdu();
                if (iZzdu == Integer.MAX_VALUE) {
                    map.put(objZza, objZza2);
                    this.limit = i;
                    return;
                } else if (iZzdu == 1) {
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
            }
        } catch (java.lang.Throwable th) {
            this.limit = i;
            throw th;
        }
    }

    private final java.lang.Object zza(com.google.android.gms.internal.vision.zzka zzkaVar, java.lang.Class<?> cls, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.vision.zzfd.zzrr[zzkaVar.ordinal()]) {
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
                return zzj(true);
            case 16:
                return java.lang.Integer.valueOf(zzee());
            case 17:
                return java.lang.Long.valueOf(zzdw());
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    private final int zzek() throws java.io.IOException {
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 == i2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        byte[] bArr = this.buffer;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.pos = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return (int) zzem();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 < 0) {
            i = i6 ^ (-128);
        } else {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                i = i8 ^ 16256;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 < 0) {
                    i = i9 ^ (-2080896);
                } else {
                    i7 = i5 + 1;
                    byte b2 = bArr[i5];
                    i = (i9 ^ (b2 << 28)) ^ 266354560;
                    if (b2 < 0) {
                        i5 = i7 + 1;
                        if (bArr[i7] < 0) {
                            i7 = i5 + 1;
                            if (bArr[i5] < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            throw com.google.android.gms.internal.vision.zzhc.zzgo();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i5 = i7;
        }
        this.pos = i5;
        return i;
    }

    private final long zzel() throws java.io.IOException {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 == i2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        byte[] bArr = this.buffer;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.pos = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return zzem();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 >= 0) {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                i5 = i7;
                j = i8 ^ 16256;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 < 0) {
                    i = i9 ^ (-2080896);
                } else {
                    long j4 = i9;
                    int i10 = i5 + 1;
                    long j5 = j4 ^ (((long) bArr[i5]) << 28);
                    if (j5 >= 0) {
                        j3 = 266354560;
                    } else {
                        i5 = i10 + 1;
                        long j6 = j5 ^ (((long) bArr[i10]) << 35);
                        if (j6 < 0) {
                            j2 = -34093383808L;
                        } else {
                            i10 = i5 + 1;
                            j5 = j6 ^ (((long) bArr[i5]) << 42);
                            if (j5 >= 0) {
                                j3 = 4363953127296L;
                            } else {
                                i5 = i10 + 1;
                                j6 = j5 ^ (((long) bArr[i10]) << 49);
                                if (j6 < 0) {
                                    j2 = -558586000294016L;
                                } else {
                                    int i11 = i5 + 1;
                                    long j7 = (j6 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                    if (j7 < 0) {
                                        i5 = i11 + 1;
                                        if (bArr[i11] < 0) {
                                            throw com.google.android.gms.internal.vision.zzhc.zzgo();
                                        }
                                    } else {
                                        i5 = i11;
                                    }
                                    j = j7;
                                }
                            }
                        }
                        j = j6 ^ j2;
                    }
                    j = j5 ^ j3;
                    i5 = i10;
                }
            }
            this.pos = i5;
            return j;
        }
        i = i6 ^ (-128);
        j = i;
        this.pos = i5;
        return j;
    }

    private final long zzem() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte b = readByte();
            j |= ((long) (b & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE)) << i;
            if ((b & kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgo();
    }

    private final byte readByte() throws java.io.IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    private final int zzen() throws java.io.IOException {
        zzai(4);
        return zzep();
    }

    private final long zzeo() throws java.io.IOException {
        zzai(8);
        return zzeq();
    }

    private final int zzep() {
        int i = this.pos;
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & kotlin.UByte.MAX_VALUE) << 24) | (bArr[i] & kotlin.UByte.MAX_VALUE) | ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 16);
    }

    private final long zzeq() {
        int i = this.pos;
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final void zzah(int i) throws java.io.IOException {
        zzai(i);
        this.pos += i;
    }

    private final void zzai(int i) throws java.io.IOException {
        if (i < 0 || i > this.limit - this.pos) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
    }

    private final void zzaj(int i) throws java.io.IOException {
        if ((this.tag & 7) != i) {
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
    }

    private final void zzak(int i) throws java.io.IOException {
        zzai(i);
        if ((i & 7) != 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
    }

    private final void zzal(int i) throws java.io.IOException {
        zzai(i);
        if ((i & 3) != 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
    }

    private final void zzam(int i) throws java.io.IOException {
        if (this.pos != i) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
    }
}
