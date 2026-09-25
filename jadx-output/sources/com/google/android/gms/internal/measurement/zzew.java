package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzew<T extends com.google.android.gms.internal.measurement.zzey<T>> {
    private static final com.google.android.gms.internal.measurement.zzew zzd = new com.google.android.gms.internal.measurement.zzew(true);
    final com.google.android.gms.internal.measurement.zzhi<T, java.lang.Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzew() {
        this.zza = com.google.android.gms.internal.measurement.zzhi.zza(16);
    }

    private zzew(boolean z) {
        this(com.google.android.gms.internal.measurement.zzhi.zza(0));
        zzb();
    }

    private zzew(com.google.android.gms.internal.measurement.zzhi<T, java.lang.Object> zzhiVar) {
        this.zza = zzhiVar;
        zzb();
    }

    public static <T extends com.google.android.gms.internal.measurement.zzey<T>> com.google.android.gms.internal.measurement.zzew<T> zza() {
        return zzd;
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzew) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzew) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> zzd() {
        if (this.zzc) {
            return new com.google.android.gms.internal.measurement.zzfu(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    final java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> zze() {
        if (this.zzc) {
            return new com.google.android.gms.internal.measurement.zzfu(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    private final java.lang.Object zza(T t) {
        java.lang.Object obj = this.zza.get(t);
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzfp)) {
            return obj;
        }
        return com.google.android.gms.internal.measurement.zzfp.zza();
    }

    private final void zzb(T t, java.lang.Object obj) {
        if (t.zzd()) {
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
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzb(), obj);
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzfp) {
            this.zzc = true;
        }
        this.zza.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    private static void zza(com.google.android.gms.internal.measurement.zzim zzimVar, java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzff.zza(obj);
        boolean z = true;
        switch (com.google.android.gms.internal.measurement.zzev.zza[zzimVar.zza().ordinal()]) {
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
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzdu) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof com.google.android.gms.internal.measurement.zzfi)) {
                    z = false;
                }
                break;
            case 9:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzgo) && !(obj instanceof com.google.android.gms.internal.measurement.zzfp)) {
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

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza((java.util.Map.Entry) this.zza.zzb(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zza((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends com.google.android.gms.internal.measurement.zzey<T>> boolean zza(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == com.google.android.gms.internal.measurement.zzip.MESSAGE) {
            if (key.zzd()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((com.google.android.gms.internal.measurement.zzgo) it.next()).zzbl()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof com.google.android.gms.internal.measurement.zzgo) {
                    if (!((com.google.android.gms.internal.measurement.zzgo) value).zzbl()) {
                        return false;
                    }
                } else {
                    if (value instanceof com.google.android.gms.internal.measurement.zzfp) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzew<T> zzewVar) {
        for (int i = 0; i < zzewVar.zza.zzc(); i++) {
            zzb(zzewVar.zza.zzb(i));
        }
        java.util.Iterator it = zzewVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzb((java.util.Map.Entry) it.next());
        }
    }

    private static java.lang.Object zza(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.measurement.zzgt) {
            return ((com.google.android.gms.internal.measurement.zzgt) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzb(java.util.Map.Entry<T, java.lang.Object> entry) {
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzu;
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.android.gms.internal.measurement.zzfp) {
            value = com.google.android.gms.internal.measurement.zzfp.zza();
        }
        if (key.zzd()) {
            java.lang.Object objZza = zza((com.google.android.gms.internal.measurement.zzey) key);
            if (objZza == null) {
                objZza = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) objZza).add(zza(it.next()));
            }
            this.zza.put(key, objZza);
            return;
        }
        if (key.zzc() == com.google.android.gms.internal.measurement.zzip.MESSAGE) {
            java.lang.Object objZza2 = zza((com.google.android.gms.internal.measurement.zzey) key);
            if (objZza2 == null) {
                this.zza.put(key, zza(value));
                return;
            }
            if (objZza2 instanceof com.google.android.gms.internal.measurement.zzgt) {
                zzgoVarZzu = key.zza((com.google.android.gms.internal.measurement.zzgt) objZza2, (com.google.android.gms.internal.measurement.zzgt) value);
            } else {
                zzgoVarZzu = key.zza(((com.google.android.gms.internal.measurement.zzgo) objZza2).zzbr(), (com.google.android.gms.internal.measurement.zzgo) value).zzu();
            }
            this.zza.put(key, zzgoVarZzu);
            return;
        }
        this.zza.put(key, zza(value));
    }

    static void zza(com.google.android.gms.internal.measurement.zzen zzenVar, com.google.android.gms.internal.measurement.zzim zzimVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzimVar == com.google.android.gms.internal.measurement.zzim.zzj) {
            com.google.android.gms.internal.measurement.zzgo zzgoVar = (com.google.android.gms.internal.measurement.zzgo) obj;
            com.google.android.gms.internal.measurement.zzff.zza(zzgoVar);
            zzenVar.zza(i, 3);
            zzgoVar.zza(zzenVar);
            zzenVar.zza(i, 4);
        }
        zzenVar.zza(i, zzimVar.zzb());
        switch (com.google.android.gms.internal.measurement.zzev.zzb[zzimVar.ordinal()]) {
            case 1:
                zzenVar.zza(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                zzenVar.zza(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                zzenVar.zza(((java.lang.Long) obj).longValue());
                break;
            case 4:
                zzenVar.zza(((java.lang.Long) obj).longValue());
                break;
            case 5:
                zzenVar.zza(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                zzenVar.zzc(((java.lang.Long) obj).longValue());
                break;
            case 7:
                zzenVar.zzd(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                zzenVar.zza(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                ((com.google.android.gms.internal.measurement.zzgo) obj).zza(zzenVar);
                break;
            case 10:
                zzenVar.zza((com.google.android.gms.internal.measurement.zzgo) obj);
                break;
            case 11:
                if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
                    zzenVar.zza((com.google.android.gms.internal.measurement.zzdu) obj);
                } else {
                    zzenVar.zza((java.lang.String) obj);
                }
                break;
            case 12:
                if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
                    zzenVar.zza((com.google.android.gms.internal.measurement.zzdu) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzenVar.zzb(bArr, 0, bArr.length);
                }
                break;
            case 13:
                zzenVar.zzb(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                zzenVar.zzd(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                zzenVar.zzc(((java.lang.Long) obj).longValue());
                break;
            case 16:
                zzenVar.zzc(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                zzenVar.zzb(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof com.google.android.gms.internal.measurement.zzfi) {
                    zzenVar.zza(((com.google.android.gms.internal.measurement.zzfi) obj).zza());
                } else {
                    zzenVar.zza(((java.lang.Integer) obj).intValue());
                }
                break;
        }
    }

    public final int zzg() {
        int iZzc = 0;
        for (int i = 0; i < this.zza.zzc(); i++) {
            iZzc += zzc(this.zza.zzb(i));
        }
        java.util.Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzc += zzc((java.util.Map.Entry) it.next());
        }
        return iZzc;
    }

    private static int zzc(java.util.Map.Entry<T, java.lang.Object> entry) {
        T key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.zzc() == com.google.android.gms.internal.measurement.zzip.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof com.google.android.gms.internal.measurement.zzfp) {
                return com.google.android.gms.internal.measurement.zzen.zzb(entry.getKey().zza(), (com.google.android.gms.internal.measurement.zzfp) value);
            }
            return com.google.android.gms.internal.measurement.zzen.zzb(entry.getKey().zza(), (com.google.android.gms.internal.measurement.zzgo) value);
        }
        return zza((com.google.android.gms.internal.measurement.zzey<?>) key, value);
    }

    static int zza(com.google.android.gms.internal.measurement.zzim zzimVar, int i, java.lang.Object obj) {
        int iZze = com.google.android.gms.internal.measurement.zzen.zze(i);
        if (zzimVar == com.google.android.gms.internal.measurement.zzim.zzj) {
            com.google.android.gms.internal.measurement.zzff.zza((com.google.android.gms.internal.measurement.zzgo) obj);
            iZze <<= 1;
        }
        return iZze + zzb(zzimVar, obj);
    }

    private static int zzb(com.google.android.gms.internal.measurement.zzim zzimVar, java.lang.Object obj) {
        switch (com.google.android.gms.internal.measurement.zzev.zzb[zzimVar.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.measurement.zzen.zzb(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.android.gms.internal.measurement.zzen.zzb(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.android.gms.internal.measurement.zzen.zzd(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.android.gms.internal.measurement.zzen.zze(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.android.gms.internal.measurement.zzen.zzf(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.android.gms.internal.measurement.zzen.zzg(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.android.gms.internal.measurement.zzen.zzi(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.android.gms.internal.measurement.zzen.zzb(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.android.gms.internal.measurement.zzen.zzc((com.google.android.gms.internal.measurement.zzgo) obj);
            case 10:
                if (obj instanceof com.google.android.gms.internal.measurement.zzfp) {
                    return com.google.android.gms.internal.measurement.zzen.zza((com.google.android.gms.internal.measurement.zzfp) obj);
                }
                return com.google.android.gms.internal.measurement.zzen.zzb((com.google.android.gms.internal.measurement.zzgo) obj);
            case 11:
                if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
                    return com.google.android.gms.internal.measurement.zzen.zzb((com.google.android.gms.internal.measurement.zzdu) obj);
                }
                return com.google.android.gms.internal.measurement.zzen.zzb((java.lang.String) obj);
            case 12:
                if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
                    return com.google.android.gms.internal.measurement.zzen.zzb((com.google.android.gms.internal.measurement.zzdu) obj);
                }
                return com.google.android.gms.internal.measurement.zzen.zzb((byte[]) obj);
            case 13:
                return com.google.android.gms.internal.measurement.zzen.zzg(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.android.gms.internal.measurement.zzen.zzj(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.android.gms.internal.measurement.zzen.zzh(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.android.gms.internal.measurement.zzen.zzh(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.android.gms.internal.measurement.zzen.zzf(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof com.google.android.gms.internal.measurement.zzfi) {
                    return com.google.android.gms.internal.measurement.zzen.zzk(((com.google.android.gms.internal.measurement.zzfi) obj).zza());
                }
                return com.google.android.gms.internal.measurement.zzen.zzk(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(com.google.android.gms.internal.measurement.zzey<?> zzeyVar, java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzim zzimVarZzb = zzeyVar.zzb();
        int iZza = zzeyVar.zza();
        if (zzeyVar.zzd()) {
            int iZza2 = 0;
            if (zzeyVar.zze()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    iZza2 += zzb(zzimVarZzb, it.next());
                }
                return com.google.android.gms.internal.measurement.zzen.zze(iZza) + iZza2 + com.google.android.gms.internal.measurement.zzen.zzl(iZza2);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                iZza2 += zza(zzimVarZzb, iZza, it2.next());
            }
            return iZza2;
        }
        return zza(zzimVarZzb, iZza, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.measurement.zzew zzewVar = new com.google.android.gms.internal.measurement.zzew();
        for (int i = 0; i < this.zza.zzc(); i++) {
            java.util.Map.Entry<K, java.lang.Object> entryZzb = this.zza.zzb(i);
            zzewVar.zzb((com.google.android.gms.internal.measurement.zzey) entryZzb.getKey(), entryZzb.getValue());
        }
        java.util.Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            zzewVar.zzb((com.google.android.gms.internal.measurement.zzey) entry.getKey(), entry.getValue());
        }
        zzewVar.zzc = this.zzc;
        return zzewVar;
    }
}
