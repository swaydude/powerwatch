package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgb<T extends com.google.android.gms.internal.fitness.zzgd<T>> {
    private static final com.google.android.gms.internal.fitness.zzgb zzsm = new com.google.android.gms.internal.fitness.zzgb(true);
    final com.google.android.gms.internal.fitness.zzid<T, java.lang.Object> zzsj;
    private boolean zzsk;
    private boolean zzsl;

    private zzgb() {
        this.zzsj = com.google.android.gms.internal.fitness.zzid.zzai(16);
    }

    private zzgb(boolean z) {
        this(com.google.android.gms.internal.fitness.zzid.zzai(0));
        zzal();
    }

    private zzgb(com.google.android.gms.internal.fitness.zzid<T, java.lang.Object> zzidVar) {
        this.zzsj = zzidVar;
        zzal();
    }

    public static <T extends com.google.android.gms.internal.fitness.zzgd<T>> com.google.android.gms.internal.fitness.zzgb<T> zzbe() {
        return zzsm;
    }

    public final void zzal() {
        if (this.zzsk) {
            return;
        }
        this.zzsj.zzal();
        this.zzsk = true;
    }

    public final boolean isImmutable() {
        return this.zzsk;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.fitness.zzgb) {
            return this.zzsj.equals(((com.google.android.gms.internal.fitness.zzgb) obj).zzsj);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzsj.hashCode();
    }

    public final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
        if (this.zzsl) {
            return new com.google.android.gms.internal.fitness.zzgu(this.zzsj.entrySet().iterator());
        }
        return this.zzsj.entrySet().iterator();
    }

    final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
        if (this.zzsl) {
            return new com.google.android.gms.internal.fitness.zzgu(this.zzsj.zzcs().iterator());
        }
        return this.zzsj.zzcs().iterator();
    }

    private final java.lang.Object zza(T t) {
        java.lang.Object obj = this.zzsj.get(t);
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzgp)) {
            return obj;
        }
        return com.google.android.gms.internal.fitness.zzgp.zzbu();
    }

    private final void zza(T t, java.lang.Object obj) {
        if (t.zzbi()) {
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
                zza(t.zzbg(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzbg(), obj);
        }
        if (obj instanceof com.google.android.gms.internal.fitness.zzgp) {
            this.zzsl = true;
        }
        this.zzsj.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    private static void zza(com.google.android.gms.internal.fitness.zzji zzjiVar, java.lang.Object obj) {
        com.google.android.gms.internal.fitness.zzgk.checkNotNull(obj);
        boolean z = true;
        switch (com.google.android.gms.internal.fitness.zzga.zzsh[zzjiVar.zzdl().ordinal()]) {
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
                if (!(obj instanceof com.google.android.gms.internal.fitness.zzff) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof com.google.android.gms.internal.fitness.zzgj)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj instanceof com.google.android.gms.internal.fitness.zzho) && !(obj instanceof com.google.android.gms.internal.fitness.zzgp)) {
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
        for (int i = 0; i < this.zzsj.zzcq(); i++) {
            if (!zzb(this.zzsj.zzaj(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.zzsj.zzcr().iterator();
        while (it.hasNext()) {
            if (!zzb((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends com.google.android.gms.internal.fitness.zzgd<T>> boolean zzb(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.zzbh() == com.google.android.gms.internal.fitness.zzjl.MESSAGE) {
            if (key.zzbi()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((com.google.android.gms.internal.fitness.zzho) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof com.google.android.gms.internal.fitness.zzho) {
                    if (!((com.google.android.gms.internal.fitness.zzho) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof com.google.android.gms.internal.fitness.zzgp) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(com.google.android.gms.internal.fitness.zzgb<T> zzgbVar) {
        for (int i = 0; i < zzgbVar.zzsj.zzcq(); i++) {
            zzc(zzgbVar.zzsj.zzaj(i));
        }
        java.util.Iterator it = zzgbVar.zzsj.zzcr().iterator();
        while (it.hasNext()) {
            zzc((java.util.Map.Entry) it.next());
        }
    }

    private static java.lang.Object zzd(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.fitness.zzhu) {
            return ((com.google.android.gms.internal.fitness.zzhu) obj).clone();
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
        com.google.android.gms.internal.fitness.zzho zzhoVarZzbr;
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.android.gms.internal.fitness.zzgp) {
            value = com.google.android.gms.internal.fitness.zzgp.zzbu();
        }
        if (key.zzbi()) {
            java.lang.Object objZza = zza(key);
            if (objZza == null) {
                objZza = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) objZza).add(zzd(it.next()));
            }
            this.zzsj.put(key, objZza);
            return;
        }
        if (key.zzbh() == com.google.android.gms.internal.fitness.zzjl.MESSAGE) {
            java.lang.Object objZza2 = zza(key);
            if (objZza2 == null) {
                this.zzsj.put(key, zzd(value));
                return;
            }
            if (objZza2 instanceof com.google.android.gms.internal.fitness.zzhu) {
                zzhoVarZzbr = key.zza((com.google.android.gms.internal.fitness.zzhu) objZza2, (com.google.android.gms.internal.fitness.zzhu) value);
            } else {
                zzhoVarZzbr = key.zza(((com.google.android.gms.internal.fitness.zzho) objZza2).zzbl(), (com.google.android.gms.internal.fitness.zzho) value).zzbr();
            }
            this.zzsj.put(key, zzhoVarZzbr);
            return;
        }
        this.zzsj.put(key, zzd(value));
    }

    static void zza(com.google.android.gms.internal.fitness.zzfs zzfsVar, com.google.android.gms.internal.fitness.zzji zzjiVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzjiVar == com.google.android.gms.internal.fitness.zzji.zzaao) {
            com.google.android.gms.internal.fitness.zzho zzhoVar = (com.google.android.gms.internal.fitness.zzho) obj;
            com.google.android.gms.internal.fitness.zzgk.zzf(zzhoVar);
            zzfsVar.zzb(i, 3);
            zzhoVar.zzb(zzfsVar);
            zzfsVar.zzb(i, 4);
        }
        zzfsVar.zzb(i, zzjiVar.zzdm());
        switch (com.google.android.gms.internal.fitness.zzga.zzsi[zzjiVar.ordinal()]) {
            case 1:
                zzfsVar.zzb(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                zzfsVar.zzb(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                zzfsVar.zza(((java.lang.Long) obj).longValue());
                break;
            case 4:
                zzfsVar.zza(((java.lang.Long) obj).longValue());
                break;
            case 5:
                zzfsVar.zzl(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                zzfsVar.zzc(((java.lang.Long) obj).longValue());
                break;
            case 7:
                zzfsVar.zzo(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                zzfsVar.zza(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                ((com.google.android.gms.internal.fitness.zzho) obj).zzb(zzfsVar);
                break;
            case 10:
                zzfsVar.zzb((com.google.android.gms.internal.fitness.zzho) obj);
                break;
            case 11:
                if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
                    zzfsVar.zza((com.google.android.gms.internal.fitness.zzff) obj);
                } else {
                    zzfsVar.zzm((java.lang.String) obj);
                }
                break;
            case 12:
                if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
                    zzfsVar.zza((com.google.android.gms.internal.fitness.zzff) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzfsVar.zzb(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzfsVar.zzm(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                zzfsVar.zzo(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                zzfsVar.zzc(((java.lang.Long) obj).longValue());
                break;
            case 16:
                zzfsVar.zzn(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                zzfsVar.zzb(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof com.google.android.gms.internal.fitness.zzgj) {
                    zzfsVar.zzl(((com.google.android.gms.internal.fitness.zzgj) obj).zzc());
                } else {
                    zzfsVar.zzl(((java.lang.Integer) obj).intValue());
                }
                break;
        }
    }

    public final int zzbf() {
        int iZzd = 0;
        for (int i = 0; i < this.zzsj.zzcq(); i++) {
            iZzd += zzd((java.util.Map.Entry) this.zzsj.zzaj(i));
        }
        java.util.Iterator it = this.zzsj.zzcr().iterator();
        while (it.hasNext()) {
            iZzd += zzd((java.util.Map.Entry) it.next());
        }
        return iZzd;
    }

    private static int zzd(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.zzbh() == com.google.android.gms.internal.fitness.zzjl.MESSAGE && !key.zzbi() && !key.zzbj()) {
            if (value instanceof com.google.android.gms.internal.fitness.zzgp) {
                return com.google.android.gms.internal.fitness.zzfs.zzb(entry.getKey().zzc(), (com.google.android.gms.internal.fitness.zzgp) value);
            }
            return com.google.android.gms.internal.fitness.zzfs.zzb(entry.getKey().zzc(), (com.google.android.gms.internal.fitness.zzho) value);
        }
        return zzb((com.google.android.gms.internal.fitness.zzgd<?>) key, value);
    }

    static int zza(com.google.android.gms.internal.fitness.zzji zzjiVar, int i, java.lang.Object obj) {
        int iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i);
        if (zzjiVar == com.google.android.gms.internal.fitness.zzji.zzaao) {
            com.google.android.gms.internal.fitness.zzgk.zzf((com.google.android.gms.internal.fitness.zzho) obj);
            iZzp <<= 1;
        }
        return iZzp + zzb(zzjiVar, obj);
    }

    private static int zzb(com.google.android.gms.internal.fitness.zzji zzjiVar, java.lang.Object obj) {
        switch (com.google.android.gms.internal.fitness.zzga.zzsi[zzjiVar.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.fitness.zzfs.zzc(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.android.gms.internal.fitness.zzfs.zzc(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.android.gms.internal.fitness.zzfs.zzd(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.android.gms.internal.fitness.zzfs.zze(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.android.gms.internal.fitness.zzfs.zzq(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.android.gms.internal.fitness.zzfs.zzg(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.android.gms.internal.fitness.zzfs.zzt(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.android.gms.internal.fitness.zzfs.zzb(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.android.gms.internal.fitness.zzfs.zzd((com.google.android.gms.internal.fitness.zzho) obj);
            case 10:
                if (obj instanceof com.google.android.gms.internal.fitness.zzgp) {
                    return com.google.android.gms.internal.fitness.zzfs.zza((com.google.android.gms.internal.fitness.zzgp) obj);
                }
                return com.google.android.gms.internal.fitness.zzfs.zzc((com.google.android.gms.internal.fitness.zzho) obj);
            case 11:
                if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
                    return com.google.android.gms.internal.fitness.zzfs.zzb((com.google.android.gms.internal.fitness.zzff) obj);
                }
                return com.google.android.gms.internal.fitness.zzfs.zzn((java.lang.String) obj);
            case 12:
                if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
                    return com.google.android.gms.internal.fitness.zzfs.zzb((com.google.android.gms.internal.fitness.zzff) obj);
                }
                return com.google.android.gms.internal.fitness.zzfs.zzb((byte[]) obj);
            case 13:
                return com.google.android.gms.internal.fitness.zzfs.zzr(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.android.gms.internal.fitness.zzfs.zzu(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.android.gms.internal.fitness.zzfs.zzh(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.android.gms.internal.fitness.zzfs.zzs(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.android.gms.internal.fitness.zzfs.zzf(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof com.google.android.gms.internal.fitness.zzgj) {
                    return com.google.android.gms.internal.fitness.zzfs.zzv(((com.google.android.gms.internal.fitness.zzgj) obj).zzc());
                }
                return com.google.android.gms.internal.fitness.zzfs.zzv(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(com.google.android.gms.internal.fitness.zzgd<?> zzgdVar, java.lang.Object obj) {
        com.google.android.gms.internal.fitness.zzji zzjiVarZzbg = zzgdVar.zzbg();
        int iZzc = zzgdVar.zzc();
        if (zzgdVar.zzbi()) {
            int iZza = 0;
            if (zzgdVar.zzbj()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    iZza += zzb(zzjiVarZzbg, it.next());
                }
                return com.google.android.gms.internal.fitness.zzfs.zzp(iZzc) + iZza + com.google.android.gms.internal.fitness.zzfs.zzx(iZza);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                iZza += zza(zzjiVarZzbg, iZzc, it2.next());
            }
            return iZza;
        }
        return zza(zzjiVarZzbg, iZzc, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.fitness.zzgb zzgbVar = new com.google.android.gms.internal.fitness.zzgb();
        for (int i = 0; i < this.zzsj.zzcq(); i++) {
            java.util.Map.Entry<K, java.lang.Object> entryZzaj = this.zzsj.zzaj(i);
            zzgbVar.zza((com.google.android.gms.internal.fitness.zzgd) entryZzaj.getKey(), entryZzaj.getValue());
        }
        java.util.Iterator it = this.zzsj.zzcr().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            zzgbVar.zza((com.google.android.gms.internal.fitness.zzgd) entry.getKey(), entry.getValue());
        }
        zzgbVar.zzsl = this.zzsl;
        return zzgbVar;
    }
}
