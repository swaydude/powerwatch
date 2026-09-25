package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzby<FieldDescriptorType extends com.google.android.gms.internal.clearcut.zzca<FieldDescriptorType>> {
    private static final com.google.android.gms.internal.clearcut.zzby zzgw = new com.google.android.gms.internal.clearcut.zzby(true);
    private boolean zzgu;
    private boolean zzgv = false;
    private final com.google.android.gms.internal.clearcut.zzei<FieldDescriptorType, java.lang.Object> zzgt = com.google.android.gms.internal.clearcut.zzei.zzaj(16);

    private zzby() {
    }

    private zzby(boolean z) {
        zzv();
    }

    static int zza(com.google.android.gms.internal.clearcut.zzfl zzflVar, int i, java.lang.Object obj) {
        int iZzr = com.google.android.gms.internal.clearcut.zzbn.zzr(i);
        if (zzflVar == com.google.android.gms.internal.clearcut.zzfl.zzql) {
            com.google.android.gms.internal.clearcut.zzci.zzf((com.google.android.gms.internal.clearcut.zzdo) obj);
            iZzr <<= 1;
        }
        return iZzr + zzb(zzflVar, obj);
    }

    private final java.lang.Object zza(FieldDescriptorType fielddescriptortype) {
        java.lang.Object obj = this.zzgt.get(fielddescriptortype);
        return obj instanceof com.google.android.gms.internal.clearcut.zzcr ? com.google.android.gms.internal.clearcut.zzcr.zzbr() : obj;
    }

    static void zza(com.google.android.gms.internal.clearcut.zzbn zzbnVar, com.google.android.gms.internal.clearcut.zzfl zzflVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzflVar == com.google.android.gms.internal.clearcut.zzfl.zzql) {
            com.google.android.gms.internal.clearcut.zzdo zzdoVar = (com.google.android.gms.internal.clearcut.zzdo) obj;
            com.google.android.gms.internal.clearcut.zzci.zzf(zzdoVar);
            zzbnVar.zzb(i, 3);
            zzdoVar.zzb(zzbnVar);
            zzbnVar.zzb(i, 4);
        }
        zzbnVar.zzb(i, zzflVar.zzel());
        switch (com.google.android.gms.internal.clearcut.zzbz.zzgq[zzflVar.ordinal()]) {
            case 1:
                zzbnVar.zza(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                zzbnVar.zza(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                zzbnVar.zzb(((java.lang.Long) obj).longValue());
                break;
            case 4:
                zzbnVar.zzb(((java.lang.Long) obj).longValue());
                break;
            case 5:
                zzbnVar.zzn(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                zzbnVar.zzd(((java.lang.Long) obj).longValue());
                break;
            case 7:
                zzbnVar.zzq(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                zzbnVar.zza(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                ((com.google.android.gms.internal.clearcut.zzdo) obj).zzb(zzbnVar);
                break;
            case 10:
                zzbnVar.zzb((com.google.android.gms.internal.clearcut.zzdo) obj);
                break;
            case 11:
                if (!(obj instanceof com.google.android.gms.internal.clearcut.zzbb)) {
                    zzbnVar.zzg((java.lang.String) obj);
                } else {
                    zzbnVar.zza((com.google.android.gms.internal.clearcut.zzbb) obj);
                }
                break;
            case 12:
                if (!(obj instanceof com.google.android.gms.internal.clearcut.zzbb)) {
                    byte[] bArr = (byte[]) obj;
                    zzbnVar.zzd(bArr, 0, bArr.length);
                } else {
                    zzbnVar.zza((com.google.android.gms.internal.clearcut.zzbb) obj);
                }
                break;
            case 13:
                zzbnVar.zzo(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                zzbnVar.zzq(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                zzbnVar.zzd(((java.lang.Long) obj).longValue());
                break;
            case 16:
                zzbnVar.zzp(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                zzbnVar.zzc(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof com.google.android.gms.internal.clearcut.zzcj)) {
                    zzbnVar.zzn(((java.lang.Integer) obj).intValue());
                } else {
                    zzbnVar.zzn(((com.google.android.gms.internal.clearcut.zzcj) obj).zzc());
                }
                break;
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        if (!fielddescriptortype.zzaw()) {
            zza(fielddescriptortype.zzau(), obj);
        } else {
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
                zza(fielddescriptortype.zzau(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzcr) {
            this.zzgv = true;
        }
        this.zzgt.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    private static void zza(com.google.android.gms.internal.clearcut.zzfl zzflVar, java.lang.Object obj) {
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(obj);
        boolean z = true;
        boolean z2 = false;
        switch (com.google.android.gms.internal.clearcut.zzbz.zzgx[zzflVar.zzek().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                z2 = z;
                break;
            case 2:
                z = obj instanceof java.lang.Long;
                z2 = z;
                break;
            case 3:
                z = obj instanceof java.lang.Float;
                z2 = z;
                break;
            case 4:
                z = obj instanceof java.lang.Double;
                z2 = z;
                break;
            case 5:
                z = obj instanceof java.lang.Boolean;
                z2 = z;
                break;
            case 6:
                z = obj instanceof java.lang.String;
                z2 = z;
                break;
            case 7:
                if (!(obj instanceof com.google.android.gms.internal.clearcut.zzbb) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof com.google.android.gms.internal.clearcut.zzcj)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof com.google.android.gms.internal.clearcut.zzdo) && !(obj instanceof com.google.android.gms.internal.clearcut.zzcr)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (!z2) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static <T extends com.google.android.gms.internal.clearcut.zzca<T>> com.google.android.gms.internal.clearcut.zzby<T> zzar() {
        return zzgw;
    }

    private static int zzb(com.google.android.gms.internal.clearcut.zzca<?> zzcaVar, java.lang.Object obj) {
        com.google.android.gms.internal.clearcut.zzfl zzflVarZzau = zzcaVar.zzau();
        int iZzc = zzcaVar.zzc();
        if (!zzcaVar.zzaw()) {
            return zza(zzflVarZzau, iZzc, obj);
        }
        int iZza = 0;
        java.util.List list = (java.util.List) obj;
        if (zzcaVar.zzax()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza += zzb(zzflVarZzau, it.next());
            }
            return com.google.android.gms.internal.clearcut.zzbn.zzr(iZzc) + iZza + com.google.android.gms.internal.clearcut.zzbn.zzz(iZza);
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iZza += zza(zzflVarZzau, iZzc, it2.next());
        }
        return iZza;
    }

    private static int zzb(com.google.android.gms.internal.clearcut.zzfl zzflVar, java.lang.Object obj) {
        switch (com.google.android.gms.internal.clearcut.zzbz.zzgq[zzflVar.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.clearcut.zzbn.zzb(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.android.gms.internal.clearcut.zzbn.zzb(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.android.gms.internal.clearcut.zzbn.zze(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.android.gms.internal.clearcut.zzbn.zzf(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.android.gms.internal.clearcut.zzbn.zzs(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.android.gms.internal.clearcut.zzbn.zzh(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.android.gms.internal.clearcut.zzbn.zzv(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.android.gms.internal.clearcut.zzbn.zzb(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.android.gms.internal.clearcut.zzbn.zzd((com.google.android.gms.internal.clearcut.zzdo) obj);
            case 10:
                return obj instanceof com.google.android.gms.internal.clearcut.zzcr ? com.google.android.gms.internal.clearcut.zzbn.zza((com.google.android.gms.internal.clearcut.zzcr) obj) : com.google.android.gms.internal.clearcut.zzbn.zzc((com.google.android.gms.internal.clearcut.zzdo) obj);
            case 11:
                return obj instanceof com.google.android.gms.internal.clearcut.zzbb ? com.google.android.gms.internal.clearcut.zzbn.zzb((com.google.android.gms.internal.clearcut.zzbb) obj) : com.google.android.gms.internal.clearcut.zzbn.zzh((java.lang.String) obj);
            case 12:
                return obj instanceof com.google.android.gms.internal.clearcut.zzbb ? com.google.android.gms.internal.clearcut.zzbn.zzb((com.google.android.gms.internal.clearcut.zzbb) obj) : com.google.android.gms.internal.clearcut.zzbn.zzd((byte[]) obj);
            case 13:
                return com.google.android.gms.internal.clearcut.zzbn.zzt(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.android.gms.internal.clearcut.zzbn.zzw(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.android.gms.internal.clearcut.zzbn.zzi(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.android.gms.internal.clearcut.zzbn.zzu(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.android.gms.internal.clearcut.zzbn.zzg(((java.lang.Long) obj).longValue());
            case 18:
                return obj instanceof com.google.android.gms.internal.clearcut.zzcj ? com.google.android.gms.internal.clearcut.zzbn.zzx(((com.google.android.gms.internal.clearcut.zzcj) obj).zzc()) : com.google.android.gms.internal.clearcut.zzbn.zzx(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzb(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzav() == com.google.android.gms.internal.clearcut.zzfq.MESSAGE) {
            boolean zZzaw = key.zzaw();
            java.lang.Object value = entry.getValue();
            if (zZzaw) {
                java.util.Iterator it = ((java.util.List) value).iterator();
                while (it.hasNext()) {
                    if (!((com.google.android.gms.internal.clearcut.zzdo) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof com.google.android.gms.internal.clearcut.zzdo)) {
                    if (value instanceof com.google.android.gms.internal.clearcut.zzcr) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((com.google.android.gms.internal.clearcut.zzdo) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void zzc(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.android.gms.internal.clearcut.zzcr) {
            value = com.google.android.gms.internal.clearcut.zzcr.zzbr();
        }
        if (key.zzaw()) {
            java.lang.Object objZza = zza(key);
            if (objZza == null) {
                objZza = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) objZza).add(zzd(it.next()));
            }
            this.zzgt.put(key, objZza);
            return;
        }
        if (key.zzav() != com.google.android.gms.internal.clearcut.zzfq.MESSAGE) {
            this.zzgt.put(key, zzd(value));
            return;
        }
        java.lang.Object objZza2 = zza(key);
        if (objZza2 == null) {
            this.zzgt.put(key, zzd(value));
        } else {
            this.zzgt.put(key, objZza2 instanceof com.google.android.gms.internal.clearcut.zzdv ? key.zza((com.google.android.gms.internal.clearcut.zzdv) objZza2, (com.google.android.gms.internal.clearcut.zzdv) value) : key.zza(((com.google.android.gms.internal.clearcut.zzdo) objZza2).zzbc(), (com.google.android.gms.internal.clearcut.zzdo) value).zzbj());
        }
    }

    private static int zzd(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.zzav() != com.google.android.gms.internal.clearcut.zzfq.MESSAGE || key.zzaw() || key.zzax()) {
            return zzb((com.google.android.gms.internal.clearcut.zzca<?>) key, value);
        }
        boolean z = value instanceof com.google.android.gms.internal.clearcut.zzcr;
        int iZzc = entry.getKey().zzc();
        return z ? com.google.android.gms.internal.clearcut.zzbn.zzb(iZzc, (com.google.android.gms.internal.clearcut.zzcr) value) : com.google.android.gms.internal.clearcut.zzbn.zzd(iZzc, (com.google.android.gms.internal.clearcut.zzdo) value);
    }

    private static java.lang.Object zzd(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.clearcut.zzdv) {
            return ((com.google.android.gms.internal.clearcut.zzdv) obj).zzci();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.clearcut.zzby zzbyVar = new com.google.android.gms.internal.clearcut.zzby();
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            java.util.Map.Entry<K, java.lang.Object> entryZzak = this.zzgt.zzak(i);
            zzbyVar.zza((com.google.android.gms.internal.clearcut.zzca) entryZzak.getKey(), entryZzak.getValue());
        }
        java.util.Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            zzbyVar.zza((com.google.android.gms.internal.clearcut.zzca) entry.getKey(), entry.getValue());
        }
        zzbyVar.zzgv = this.zzgv;
        return zzbyVar;
    }

    final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> descendingIterator() {
        return this.zzgv ? new com.google.android.gms.internal.clearcut.zzcu(this.zzgt.zzdt().iterator()) : this.zzgt.zzdt().iterator();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzby) {
            return this.zzgt.equals(((com.google.android.gms.internal.clearcut.zzby) obj).zzgt);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzgt.hashCode();
    }

    final boolean isEmpty() {
        return this.zzgt.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            if (!zzb(this.zzgt.zzak(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            if (!zzb((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> iterator() {
        return this.zzgv ? new com.google.android.gms.internal.clearcut.zzcu(this.zzgt.entrySet().iterator()) : this.zzgt.entrySet().iterator();
    }

    public final void zza(com.google.android.gms.internal.clearcut.zzby<FieldDescriptorType> zzbyVar) {
        for (int i = 0; i < zzbyVar.zzgt.zzdr(); i++) {
            zzc(zzbyVar.zzgt.zzak(i));
        }
        java.util.Iterator it = zzbyVar.zzgt.zzds().iterator();
        while (it.hasNext()) {
            zzc((java.util.Map.Entry) it.next());
        }
    }

    public final int zzas() {
        int iZzb = 0;
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            java.util.Map.Entry<K, java.lang.Object> entryZzak = this.zzgt.zzak(i);
            iZzb += zzb((com.google.android.gms.internal.clearcut.zzca<?>) entryZzak.getKey(), entryZzak.getValue());
        }
        java.util.Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iZzb += zzb((com.google.android.gms.internal.clearcut.zzca<?>) entry.getKey(), entry.getValue());
        }
        return iZzb;
    }

    public final int zzat() {
        int iZzd = 0;
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            iZzd += zzd((java.util.Map.Entry) this.zzgt.zzak(i));
        }
        java.util.Iterator it = this.zzgt.zzds().iterator();
        while (it.hasNext()) {
            iZzd += zzd((java.util.Map.Entry) it.next());
        }
        return iZzd;
    }

    public final void zzv() {
        if (this.zzgu) {
            return;
        }
        this.zzgt.zzv();
        this.zzgu = true;
    }
}
