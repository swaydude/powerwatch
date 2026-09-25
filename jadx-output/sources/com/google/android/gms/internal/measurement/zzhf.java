package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhf {
    private static final java.lang.Class<?> zza = zzd();
    private static final com.google.android.gms.internal.measurement.zzhv<?, ?> zzb = zza(false);
    private static final com.google.android.gms.internal.measurement.zzhv<?, ?> zzc = zza(true);
    private static final com.google.android.gms.internal.measurement.zzhv<?, ?> zzd = new com.google.android.gms.internal.measurement.zzhx();

    public static void zza(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        if (!com.google.android.gms.internal.measurement.zzfd.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, java.util.List<java.lang.Double> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzg(i, list, z);
    }

    public static void zzb(int i, java.util.List<java.lang.Float> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzf(i, list, z);
    }

    public static void zzc(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzc(i, list, z);
    }

    public static void zzd(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzd(i, list, z);
    }

    public static void zze(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzn(i, list, z);
    }

    public static void zzf(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zze(i, list, z);
    }

    public static void zzg(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzl(i, list, z);
    }

    public static void zzh(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zza(i, list, z);
    }

    public static void zzi(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzj(i, list, z);
    }

    public static void zzj(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzm(i, list, z);
    }

    public static void zzk(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzb(i, list, z);
    }

    public static void zzl(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzk(i, list, z);
    }

    public static void zzm(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzh(i, list, z);
    }

    public static void zzn(int i, java.util.List<java.lang.Boolean> list, com.google.android.gms.internal.measurement.zzis zzisVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzi(i, list, z);
    }

    public static void zza(int i, java.util.List<java.lang.String> list, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zza(i, list);
    }

    public static void zzb(int i, java.util.List<com.google.android.gms.internal.measurement.zzdu> list, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzb(i, list);
    }

    public static void zza(int i, java.util.List<?> list, com.google.android.gms.internal.measurement.zzis zzisVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zza(i, list, zzhdVar);
    }

    public static void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.measurement.zzis zzisVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzisVar.zzb(i, list, zzhdVar);
    }

    static int zza(java.util.List<java.lang.Long> list) {
        int iZzd;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            iZzd = 0;
            while (i < size) {
                iZzd += com.google.android.gms.internal.measurement.zzen.zzd(zzgcVar.zzb(i));
                i++;
            }
        } else {
            iZzd = 0;
            while (i < size) {
                iZzd += com.google.android.gms.internal.measurement.zzen.zzd(list.get(i).longValue());
                i++;
            }
        }
        return iZzd;
    }

    static int zza(int i, java.util.List<java.lang.Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zzb(java.util.List<java.lang.Long> list) {
        int iZze;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            iZze = 0;
            while (i < size) {
                iZze += com.google.android.gms.internal.measurement.zzen.zze(zzgcVar.zzb(i));
                i++;
            }
        } else {
            iZze = 0;
            while (i < size) {
                iZze += com.google.android.gms.internal.measurement.zzen.zze(list.get(i).longValue());
                i++;
            }
        }
        return iZze;
    }

    static int zzb(int i, java.util.List<java.lang.Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zzc(java.util.List<java.lang.Long> list) {
        int iZzf;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzgc) {
            com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) list;
            iZzf = 0;
            while (i < size) {
                iZzf += com.google.android.gms.internal.measurement.zzen.zzf(zzgcVar.zzb(i));
                i++;
            }
        } else {
            iZzf = 0;
            while (i < size) {
                iZzf += com.google.android.gms.internal.measurement.zzen.zzf(list.get(i).longValue());
                i++;
            }
        }
        return iZzf;
    }

    static int zzc(int i, java.util.List<java.lang.Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zzd(java.util.List<java.lang.Integer> list) {
        int iZzk;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            iZzk = 0;
            while (i < size) {
                iZzk += com.google.android.gms.internal.measurement.zzen.zzk(zzfgVar.zzc(i));
                i++;
            }
        } else {
            iZzk = 0;
            while (i < size) {
                iZzk += com.google.android.gms.internal.measurement.zzen.zzk(list.get(i).intValue());
                i++;
            }
        }
        return iZzk;
    }

    static int zzd(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zze(java.util.List<java.lang.Integer> list) {
        int iZzf;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            iZzf = 0;
            while (i < size) {
                iZzf += com.google.android.gms.internal.measurement.zzen.zzf(zzfgVar.zzc(i));
                i++;
            }
        } else {
            iZzf = 0;
            while (i < size) {
                iZzf += com.google.android.gms.internal.measurement.zzen.zzf(list.get(i).intValue());
                i++;
            }
        }
        return iZzf;
    }

    static int zze(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zzf(java.util.List<java.lang.Integer> list) {
        int iZzg;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            iZzg = 0;
            while (i < size) {
                iZzg += com.google.android.gms.internal.measurement.zzen.zzg(zzfgVar.zzc(i));
                i++;
            }
        } else {
            iZzg = 0;
            while (i < size) {
                iZzg += com.google.android.gms.internal.measurement.zzen.zzg(list.get(i).intValue());
                i++;
            }
        }
        return iZzg;
    }

    static int zzf(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zzg(java.util.List<java.lang.Integer> list) {
        int iZzh;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.measurement.zzfg) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) list;
            iZzh = 0;
            while (i < size) {
                iZzh += com.google.android.gms.internal.measurement.zzen.zzh(zzfgVar.zzc(i));
                i++;
            }
        } else {
            iZzh = 0;
            while (i < size) {
                iZzh += com.google.android.gms.internal.measurement.zzen.zzh(list.get(i).intValue());
                i++;
            }
        }
        return iZzh;
    }

    static int zzg(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * com.google.android.gms.internal.measurement.zzen.zze(i));
    }

    static int zzh(java.util.List<?> list) {
        return list.size() << 2;
    }

    static int zzh(int i, java.util.List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.measurement.zzen.zzi(i, 0);
    }

    static int zzi(java.util.List<?> list) {
        return list.size() << 3;
    }

    static int zzi(int i, java.util.List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.measurement.zzen.zzg(i, 0L);
    }

    static int zzj(java.util.List<?> list) {
        return list.size();
    }

    static int zzj(int i, java.util.List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.measurement.zzen.zzb(i, true);
    }

    static int zza(int i, java.util.List<?> list) {
        int iZzb;
        int iZzb2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZze = com.google.android.gms.internal.measurement.zzen.zze(i) * size;
        if (list instanceof com.google.android.gms.internal.measurement.zzfv) {
            com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) list;
            while (i2 < size) {
                java.lang.Object objZzb = zzfvVar.zzb(i2);
                if (objZzb instanceof com.google.android.gms.internal.measurement.zzdu) {
                    iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb((com.google.android.gms.internal.measurement.zzdu) objZzb);
                } else {
                    iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb((java.lang.String) objZzb);
                }
                iZze += iZzb2;
                i2++;
            }
        } else {
            while (i2 < size) {
                java.lang.Object obj = list.get(i2);
                if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
                    iZzb = com.google.android.gms.internal.measurement.zzen.zzb((com.google.android.gms.internal.measurement.zzdu) obj);
                } else {
                    iZzb = com.google.android.gms.internal.measurement.zzen.zzb((java.lang.String) obj);
                }
                iZze += iZzb;
                i2++;
            }
        }
        return iZze;
    }

    static int zza(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        if (obj instanceof com.google.android.gms.internal.measurement.zzft) {
            return com.google.android.gms.internal.measurement.zzen.zza(i, (com.google.android.gms.internal.measurement.zzft) obj);
        }
        return com.google.android.gms.internal.measurement.zzen.zzb(i, (com.google.android.gms.internal.measurement.zzgo) obj, zzhdVar);
    }

    static int zza(int i, java.util.List<?> list, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZze = com.google.android.gms.internal.measurement.zzen.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            if (obj instanceof com.google.android.gms.internal.measurement.zzft) {
                iZza = com.google.android.gms.internal.measurement.zzen.zza((com.google.android.gms.internal.measurement.zzft) obj);
            } else {
                iZza = com.google.android.gms.internal.measurement.zzen.zza((com.google.android.gms.internal.measurement.zzgo) obj, zzhdVar);
            }
            iZze += iZza;
        }
        return iZze;
    }

    static int zzb(int i, java.util.List<com.google.android.gms.internal.measurement.zzdu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZze = size * com.google.android.gms.internal.measurement.zzen.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZze += com.google.android.gms.internal.measurement.zzen.zzb(list.get(i2));
        }
        return iZze;
    }

    static int zzb(int i, java.util.List<com.google.android.gms.internal.measurement.zzgo> list, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzc = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzc += com.google.android.gms.internal.measurement.zzen.zzc(i, list.get(i2), zzhdVar);
        }
        return iZzc;
    }

    public static com.google.android.gms.internal.measurement.zzhv<?, ?> zza() {
        return zzb;
    }

    public static com.google.android.gms.internal.measurement.zzhv<?, ?> zzb() {
        return zzc;
    }

    public static com.google.android.gms.internal.measurement.zzhv<?, ?> zzc() {
        return zzd;
    }

    private static com.google.android.gms.internal.measurement.zzhv<?, ?> zza(boolean z) {
        try {
            java.lang.Class<?> clsZze = zze();
            if (clsZze == null) {
                return null;
            }
            return (com.google.android.gms.internal.measurement.zzhv) clsZze.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> zzd() {
        try {
            return java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> zze() {
        try {
            return java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static boolean zza(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(com.google.android.gms.internal.measurement.zzgh zzghVar, T t, T t2, long j) {
        com.google.android.gms.internal.measurement.zzib.zza(t, j, zzghVar.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j)));
    }

    static <T, FT extends com.google.android.gms.internal.measurement.zzey<FT>> void zza(com.google.android.gms.internal.measurement.zzes<FT> zzesVar, T t, T t2) {
        com.google.android.gms.internal.measurement.zzew<T> zzewVarZza = zzesVar.zza(t2);
        if (zzewVarZza.zza.isEmpty()) {
            return;
        }
        zzesVar.zzb(t).zza((com.google.android.gms.internal.measurement.zzew) zzewVarZza);
    }

    static <T, UT, UB> void zza(com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar, T t, T t2) {
        zzhvVar.zza(t, zzhvVar.zzc(zzhvVar.zzb(t), zzhvVar.zzb(t2)));
    }

    static <UT, UB> UB zza(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.measurement.zzfk zzfkVar, UB ub, com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar) {
        if (zzfkVar == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (zzfkVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, iIntValue, ub, zzhvVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzfkVar.zza(iIntValue2)) {
                    ub = (UB) zza(i, iIntValue2, ub, zzhvVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar) {
        if (ub == null) {
            ub = zzhvVar.zza();
        }
        zzhvVar.zza(ub, i, i2);
        return ub;
    }
}
