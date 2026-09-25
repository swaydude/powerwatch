package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgi<T extends com.google.android.gms.internal.vision.zzgk<T>> {
    private static final com.google.android.gms.internal.vision.zzgi zzte = new com.google.android.gms.internal.vision.zzgi(true);
    final com.google.android.gms.internal.vision.zziw<T, java.lang.Object> zztb;
    private boolean zztc;
    private boolean zztd;

    private zzgi() {
        this.zztb = com.google.android.gms.internal.vision.zziw.zzbt(16);
    }

    private zzgi(boolean z) {
        this(com.google.android.gms.internal.vision.zziw.zzbt(0));
        zzdp();
    }

    private zzgi(com.google.android.gms.internal.vision.zziw<T, java.lang.Object> zziwVar) {
        this.zztb = zziwVar;
        zzdp();
    }

    public static <T extends com.google.android.gms.internal.vision.zzgk<T>> com.google.android.gms.internal.vision.zzgi<T> zzfn() {
        return zzte;
    }

    public final void zzdp() {
        if (this.zztc) {
            return;
        }
        this.zztb.zzdp();
        this.zztc = true;
    }

    public final boolean isImmutable() {
        return this.zztc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.vision.zzgi) {
            return this.zztb.equals(((com.google.android.gms.internal.vision.zzgi) obj).zztb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zztb.hashCode();
    }

    public final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
        if (this.zztd) {
            return new com.google.android.gms.internal.vision.zzhi(this.zztb.entrySet().iterator());
        }
        return this.zztb.entrySet().iterator();
    }

    final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
        if (this.zztd) {
            return new com.google.android.gms.internal.vision.zzhi(this.zztb.zzhz().iterator());
        }
        return this.zztb.zzhz().iterator();
    }

    public final java.lang.Object zza(T t) {
        java.lang.Object obj = this.zztb.get(t);
        if (!(obj instanceof com.google.android.gms.internal.vision.zzhd)) {
            return obj;
        }
        return com.google.android.gms.internal.vision.zzhd.zzgu();
    }

    public final void zza(T t, java.lang.Object obj) {
        if (t.zzfu()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzfs(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzfs(), obj);
        }
        if (obj instanceof com.google.android.gms.internal.vision.zzhd) {
            this.zztd = true;
        }
        this.zztb.put(t, obj);
    }

    public final void zzb(T t, java.lang.Object obj) {
        java.util.List arrayList;
        if (!t.zzfu()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zza(t.zzfs(), obj);
        java.lang.Object objZza = zza(t);
        if (objZza == null) {
            arrayList = new java.util.ArrayList();
            this.zztb.put(t, arrayList);
        } else {
            arrayList = (java.util.List) objZza;
        }
        arrayList.add(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    private static void zza(com.google.android.gms.internal.vision.zzka zzkaVar, java.lang.Object obj) {
        com.google.android.gms.internal.vision.zzgt.checkNotNull(obj);
        boolean z = true;
        switch (com.google.android.gms.internal.vision.zzgl.zzth[zzkaVar.zzip().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                break;
            case 2:
                z = obj instanceof java.lang.Long;
                break;
            case 3:
                z = obj instanceof java.lang.Float;
                break;
            case 4:
                z = obj instanceof java.lang.Double;
                break;
            case 5:
                z = obj instanceof java.lang.Boolean;
                break;
            case 6:
                z = obj instanceof java.lang.String;
                break;
            case 7:
                if (!(obj instanceof com.google.android.gms.internal.vision.zzfh) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof com.google.android.gms.internal.vision.zzgw)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj instanceof com.google.android.gms.internal.vision.zzic) && !(obj instanceof com.google.android.gms.internal.vision.zzhd)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zztb.zzhx(); i++) {
            if (!zzb(this.zztb.zzbu(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.zztb.zzhy().iterator();
        while (it.hasNext()) {
            if (!zzb((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends com.google.android.gms.internal.vision.zzgk<T>> boolean zzb(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.zzft() == com.google.android.gms.internal.vision.zzkd.MESSAGE) {
            if (key.zzfu()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((com.google.android.gms.internal.vision.zzic) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof com.google.android.gms.internal.vision.zzic) {
                    if (!((com.google.android.gms.internal.vision.zzic) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof com.google.android.gms.internal.vision.zzhd) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(com.google.android.gms.internal.vision.zzgi<T> zzgiVar) {
        for (int i = 0; i < zzgiVar.zztb.zzhx(); i++) {
            zzc(zzgiVar.zztb.zzbu(i));
        }
        java.util.Iterator it = zzgiVar.zztb.zzhy().iterator();
        while (it.hasNext()) {
            zzc((java.util.Map.Entry) it.next());
        }
    }

    private static java.lang.Object zzh(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.vision.zzih) {
            return ((com.google.android.gms.internal.vision.zzih) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(java.util.Map.Entry<T, java.lang.Object> entry) {
        com.google.android.gms.internal.vision.zzic zzicVarZzgc;
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.android.gms.internal.vision.zzhd) {
            value = com.google.android.gms.internal.vision.zzhd.zzgu();
        }
        if (key.zzfu()) {
            java.lang.Object objZza = zza(key);
            if (objZza == null) {
                objZza = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) objZza).add(zzh(it.next()));
            }
            this.zztb.put(key, objZza);
            return;
        }
        if (key.zzft() == com.google.android.gms.internal.vision.zzkd.MESSAGE) {
            java.lang.Object objZza2 = zza(key);
            if (objZza2 == null) {
                this.zztb.put(key, zzh(value));
                return;
            }
            if (objZza2 instanceof com.google.android.gms.internal.vision.zzih) {
                zzicVarZzgc = key.zza((com.google.android.gms.internal.vision.zzih) objZza2, (com.google.android.gms.internal.vision.zzih) value);
            } else {
                zzicVarZzgc = key.zza(((com.google.android.gms.internal.vision.zzic) objZza2).zzgi(), (com.google.android.gms.internal.vision.zzic) value).zzgc();
            }
            this.zztb.put(key, zzicVarZzgc);
            return;
        }
        this.zztb.put(key, zzh(value));
    }

    static void zza(com.google.android.gms.internal.vision.zzga zzgaVar, com.google.android.gms.internal.vision.zzka zzkaVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzkaVar == com.google.android.gms.internal.vision.zzka.zzabv) {
            com.google.android.gms.internal.vision.zzic zzicVar = (com.google.android.gms.internal.vision.zzic) obj;
            com.google.android.gms.internal.vision.zzgt.zzf(zzicVar);
            zzgaVar.zzg(i, 3);
            zzicVar.zzb(zzgaVar);
            zzgaVar.zzg(i, 4);
        }
        zzgaVar.zzg(i, zzkaVar.zziq());
        switch (com.google.android.gms.internal.vision.zzgl.zzrr[zzkaVar.ordinal()]) {
            case 1:
                zzgaVar.zza(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                zzgaVar.zzs(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                zzgaVar.zzs(((java.lang.Long) obj).longValue());
                break;
            case 4:
                zzgaVar.zzs(((java.lang.Long) obj).longValue());
                break;
            case 5:
                zzgaVar.zzaw(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                zzgaVar.zzu(((java.lang.Long) obj).longValue());
                break;
            case 7:
                zzgaVar.zzaz(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                zzgaVar.zzk(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                ((com.google.android.gms.internal.vision.zzic) obj).zzb(zzgaVar);
                break;
            case 10:
                zzgaVar.zzb((com.google.android.gms.internal.vision.zzic) obj);
                break;
            case 11:
                if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
                    zzgaVar.zza((com.google.android.gms.internal.vision.zzfh) obj);
                } else {
                    zzgaVar.zzx((java.lang.String) obj);
                }
                break;
            case 12:
                if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
                    zzgaVar.zza((com.google.android.gms.internal.vision.zzfh) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzgaVar.zze(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzgaVar.zzax(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                zzgaVar.zzaz(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                zzgaVar.zzu(((java.lang.Long) obj).longValue());
                break;
            case 16:
                zzgaVar.zzay(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                zzgaVar.zzt(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof com.google.android.gms.internal.vision.zzgw) {
                    zzgaVar.zzaw(((com.google.android.gms.internal.vision.zzgw) obj).zzag());
                } else {
                    zzgaVar.zzaw(((java.lang.Integer) obj).intValue());
                }
                break;
        }
    }

    public final int zzfo() {
        int iZzd = 0;
        for (int i = 0; i < this.zztb.zzhx(); i++) {
            iZzd += zzd(this.zztb.zzbu(i));
        }
        java.util.Iterator it = this.zztb.zzhy().iterator();
        while (it.hasNext()) {
            iZzd += zzd((java.util.Map.Entry) it.next());
        }
        return iZzd;
    }

    private static int zzd(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.zzft() == com.google.android.gms.internal.vision.zzkd.MESSAGE && !key.zzfu() && !key.zzfv()) {
            if (value instanceof com.google.android.gms.internal.vision.zzhd) {
                return com.google.android.gms.internal.vision.zzga.zzb(entry.getKey().zzag(), (com.google.android.gms.internal.vision.zzhd) value);
            }
            return com.google.android.gms.internal.vision.zzga.zzb(entry.getKey().zzag(), (com.google.android.gms.internal.vision.zzic) value);
        }
        return zzc(key, value);
    }

    static int zza(com.google.android.gms.internal.vision.zzka zzkaVar, int i, java.lang.Object obj) {
        int iZzba = com.google.android.gms.internal.vision.zzga.zzba(i);
        if (zzkaVar == com.google.android.gms.internal.vision.zzka.zzabv) {
            com.google.android.gms.internal.vision.zzgt.zzf((com.google.android.gms.internal.vision.zzic) obj);
            iZzba <<= 1;
        }
        return iZzba + zzb(zzkaVar, obj);
    }

    private static int zzb(com.google.android.gms.internal.vision.zzka zzkaVar, java.lang.Object obj) {
        switch (com.google.android.gms.internal.vision.zzgl.zzrr[zzkaVar.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.vision.zzga.zzb(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.android.gms.internal.vision.zzga.zzt(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.android.gms.internal.vision.zzga.zzv(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.android.gms.internal.vision.zzga.zzw(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.android.gms.internal.vision.zzga.zzbb(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.android.gms.internal.vision.zzga.zzy(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.android.gms.internal.vision.zzga.zzbe(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.android.gms.internal.vision.zzga.zzl(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.android.gms.internal.vision.zzga.zzd((com.google.android.gms.internal.vision.zzic) obj);
            case 10:
                if (obj instanceof com.google.android.gms.internal.vision.zzhd) {
                    return com.google.android.gms.internal.vision.zzga.zza((com.google.android.gms.internal.vision.zzhd) obj);
                }
                return com.google.android.gms.internal.vision.zzga.zzc((com.google.android.gms.internal.vision.zzic) obj);
            case 11:
                if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
                    return com.google.android.gms.internal.vision.zzga.zzb((com.google.android.gms.internal.vision.zzfh) obj);
                }
                return com.google.android.gms.internal.vision.zzga.zzy((java.lang.String) obj);
            case 12:
                if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
                    return com.google.android.gms.internal.vision.zzga.zzb((com.google.android.gms.internal.vision.zzfh) obj);
                }
                return com.google.android.gms.internal.vision.zzga.zzf((byte[]) obj);
            case 13:
                return com.google.android.gms.internal.vision.zzga.zzbc(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.android.gms.internal.vision.zzga.zzbf(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.android.gms.internal.vision.zzga.zzz(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.android.gms.internal.vision.zzga.zzbd(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.android.gms.internal.vision.zzga.zzx(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof com.google.android.gms.internal.vision.zzgw) {
                    return com.google.android.gms.internal.vision.zzga.zzbg(((com.google.android.gms.internal.vision.zzgw) obj).zzag());
                }
                return com.google.android.gms.internal.vision.zzga.zzbg(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzc(com.google.android.gms.internal.vision.zzgk<?> zzgkVar, java.lang.Object obj) {
        com.google.android.gms.internal.vision.zzka zzkaVarZzfs = zzgkVar.zzfs();
        int iZzag = zzgkVar.zzag();
        if (zzgkVar.zzfu()) {
            int iZza = 0;
            if (zzgkVar.zzfv()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    iZza += zzb(zzkaVarZzfs, it.next());
                }
                return com.google.android.gms.internal.vision.zzga.zzba(iZzag) + iZza + com.google.android.gms.internal.vision.zzga.zzbi(iZza);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                iZza += zza(zzkaVarZzfs, iZzag, it2.next());
            }
            return iZza;
        }
        return zza(zzkaVarZzfs, iZzag, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.vision.zzgi zzgiVar = new com.google.android.gms.internal.vision.zzgi();
        for (int i = 0; i < this.zztb.zzhx(); i++) {
            java.util.Map.Entry<K, java.lang.Object> entryZzbu = this.zztb.zzbu(i);
            zzgiVar.zza((com.google.android.gms.internal.vision.zzgk) entryZzbu.getKey(), entryZzbu.getValue());
        }
        java.util.Iterator it = this.zztb.zzhy().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            zzgiVar.zza((com.google.android.gms.internal.vision.zzgk) entry.getKey(), entry.getValue());
        }
        zzgiVar.zztd = this.zztd;
        return zzgiVar;
    }
}
