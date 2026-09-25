package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzeh {
    private static final java.lang.Class<?> zzoh = zzdp();
    private static final com.google.android.gms.internal.clearcut.zzex<?, ?> zzoi = zzd(false);
    private static final com.google.android.gms.internal.clearcut.zzex<?, ?> zzoj = zzd(true);
    private static final com.google.android.gms.internal.clearcut.zzex<?, ?> zzok = new com.google.android.gms.internal.clearcut.zzez();

    static int zza(java.util.List<java.lang.Long> list) {
        int iZze;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzdc) {
            com.google.android.gms.internal.clearcut.zzdc zzdcVar = (com.google.android.gms.internal.clearcut.zzdc) list;
            iZze = 0;
            while (i < size) {
                iZze += com.google.android.gms.internal.clearcut.zzbn.zze(zzdcVar.getLong(i));
                i++;
            }
        } else {
            iZze = 0;
            while (i < size) {
                iZze += com.google.android.gms.internal.clearcut.zzbn.zze(list.get(i).longValue());
                i++;
            }
        }
        return iZze;
    }

    private static <UT, UB> UB zza(int i, int i2, UB ub, com.google.android.gms.internal.clearcut.zzex<UT, UB> zzexVar) {
        if (ub == null) {
            ub = zzexVar.zzdz();
        }
        zzexVar.zza(ub, i, i2);
        return ub;
    }

    static <UT, UB> UB zza(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzck<?> zzckVar, UB ub, com.google.android.gms.internal.clearcut.zzex<UT, UB> zzexVar) {
        if (zzckVar == null) {
            return ub;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (zzckVar.zzb(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, java.lang.Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, iIntValue, ub, zzexVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            java.util.Iterator<java.lang.Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (zzckVar.zzb(iIntValue2) == null) {
                    ub = (UB) zza(i, iIntValue2, ub, zzexVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void zza(int i, java.util.List<java.lang.String> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i, list);
    }

    public static void zza(int i, java.util.List<?> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i, list, zzefVar);
    }

    public static void zza(int i, java.util.List<java.lang.Double> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzg(i, list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T, FT extends com.google.android.gms.internal.clearcut.zzca<FT>> void zza(com.google.android.gms.internal.clearcut.zzbu<FT> zzbuVar, T t, T t2) {
        com.google.android.gms.internal.clearcut.zzby<T> zzbyVarZza = zzbuVar.zza(t2);
        if (zzbyVarZza.isEmpty()) {
            return;
        }
        zzbuVar.zzb(t).zza(zzbyVarZza);
    }

    static <T> void zza(com.google.android.gms.internal.clearcut.zzdj zzdjVar, T t, T t2, long j) {
        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, zzdjVar.zzb(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j)));
    }

    static <T, UT, UB> void zza(com.google.android.gms.internal.clearcut.zzex<UT, UB> zzexVar, T t, T t2) {
        zzexVar.zze(t, zzexVar.zzg(zzexVar.zzq(t), zzexVar.zzq(t2)));
    }

    static int zzb(java.util.List<java.lang.Long> list) {
        int iZzf;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzdc) {
            com.google.android.gms.internal.clearcut.zzdc zzdcVar = (com.google.android.gms.internal.clearcut.zzdc) list;
            iZzf = 0;
            while (i < size) {
                iZzf += com.google.android.gms.internal.clearcut.zzbn.zzf(zzdcVar.getLong(i));
                i++;
            }
        } else {
            iZzf = 0;
            while (i < size) {
                iZzf += com.google.android.gms.internal.clearcut.zzbn.zzf(list.get(i).longValue());
                i++;
            }
        }
        return iZzf;
    }

    public static void zzb(int i, java.util.List<com.google.android.gms.internal.clearcut.zzbb> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i, list);
    }

    public static void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i, list, zzefVar);
    }

    public static void zzb(int i, java.util.List<java.lang.Float> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzf(i, list, z);
    }

    static int zzc(int i, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        return obj instanceof com.google.android.gms.internal.clearcut.zzcv ? com.google.android.gms.internal.clearcut.zzbn.zza(i, (com.google.android.gms.internal.clearcut.zzcv) obj) : com.google.android.gms.internal.clearcut.zzbn.zzb(i, (com.google.android.gms.internal.clearcut.zzdo) obj, zzefVar);
    }

    static int zzc(int i, java.util.List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzr = com.google.android.gms.internal.clearcut.zzbn.zzr(i) * size;
        if (list instanceof com.google.android.gms.internal.clearcut.zzcx) {
            com.google.android.gms.internal.clearcut.zzcx zzcxVar = (com.google.android.gms.internal.clearcut.zzcx) list;
            while (i2 < size) {
                java.lang.Object raw = zzcxVar.getRaw(i2);
                iZzr += raw instanceof com.google.android.gms.internal.clearcut.zzbb ? com.google.android.gms.internal.clearcut.zzbn.zzb((com.google.android.gms.internal.clearcut.zzbb) raw) : com.google.android.gms.internal.clearcut.zzbn.zzh((java.lang.String) raw);
                i2++;
            }
        } else {
            while (i2 < size) {
                java.lang.Object obj = list.get(i2);
                iZzr += obj instanceof com.google.android.gms.internal.clearcut.zzbb ? com.google.android.gms.internal.clearcut.zzbn.zzb((com.google.android.gms.internal.clearcut.zzbb) obj) : com.google.android.gms.internal.clearcut.zzbn.zzh((java.lang.String) obj);
                i2++;
            }
        }
        return iZzr;
    }

    static int zzc(int i, java.util.List<?> list, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = com.google.android.gms.internal.clearcut.zzbn.zzr(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            iZzr += obj instanceof com.google.android.gms.internal.clearcut.zzcv ? com.google.android.gms.internal.clearcut.zzbn.zza((com.google.android.gms.internal.clearcut.zzcv) obj) : com.google.android.gms.internal.clearcut.zzbn.zzb((com.google.android.gms.internal.clearcut.zzdo) obj, zzefVar);
        }
        return iZzr;
    }

    static int zzc(java.util.List<java.lang.Long> list) {
        int iZzg;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzdc) {
            com.google.android.gms.internal.clearcut.zzdc zzdcVar = (com.google.android.gms.internal.clearcut.zzdc) list;
            iZzg = 0;
            while (i < size) {
                iZzg += com.google.android.gms.internal.clearcut.zzbn.zzg(zzdcVar.getLong(i));
                i++;
            }
        } else {
            iZzg = 0;
            while (i < size) {
                iZzg += com.google.android.gms.internal.clearcut.zzbn.zzg(list.get(i).longValue());
                i++;
            }
        }
        return iZzg;
    }

    public static void zzc(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzc(i, list, z);
    }

    public static boolean zzc(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    static int zzd(int i, java.util.List<com.google.android.gms.internal.clearcut.zzbb> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = size * com.google.android.gms.internal.clearcut.zzbn.zzr(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzr += com.google.android.gms.internal.clearcut.zzbn.zzb(list.get(i2));
        }
        return iZzr;
    }

    static int zzd(int i, java.util.List<com.google.android.gms.internal.clearcut.zzdo> list, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzc = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iZzc += com.google.android.gms.internal.clearcut.zzbn.zzc(i, list.get(i2), zzefVar);
        }
        return iZzc;
    }

    static int zzd(java.util.List<java.lang.Integer> list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzch) {
            com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) list;
            iZzx = 0;
            while (i < size) {
                iZzx += com.google.android.gms.internal.clearcut.zzbn.zzx(zzchVar.getInt(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += com.google.android.gms.internal.clearcut.zzbn.zzx(list.get(i).intValue());
                i++;
            }
        }
        return iZzx;
    }

    private static com.google.android.gms.internal.clearcut.zzex<?, ?> zzd(boolean z) {
        try {
            java.lang.Class<?> clsZzdq = zzdq();
            if (clsZzdq == null) {
                return null;
            }
            return (com.google.android.gms.internal.clearcut.zzex) clsZzdq.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void zzd(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzd(i, list, z);
    }

    static boolean zzd(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.internal.clearcut.zzex<?, ?> zzdm() {
        return zzoi;
    }

    public static com.google.android.gms.internal.clearcut.zzex<?, ?> zzdn() {
        return zzoj;
    }

    public static com.google.android.gms.internal.clearcut.zzex<?, ?> zzdo() {
        return zzok;
    }

    private static java.lang.Class<?> zzdp() {
        try {
            return java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> zzdq() {
        try {
            return java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    static int zze(java.util.List<java.lang.Integer> list) {
        int iZzs;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzch) {
            com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) list;
            iZzs = 0;
            while (i < size) {
                iZzs += com.google.android.gms.internal.clearcut.zzbn.zzs(zzchVar.getInt(i));
                i++;
            }
        } else {
            iZzs = 0;
            while (i < size) {
                iZzs += com.google.android.gms.internal.clearcut.zzbn.zzs(list.get(i).intValue());
                i++;
            }
        }
        return iZzs;
    }

    public static void zze(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzn(i, list, z);
    }

    static int zzf(java.util.List<java.lang.Integer> list) {
        int iZzt;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzch) {
            com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) list;
            iZzt = 0;
            while (i < size) {
                iZzt += com.google.android.gms.internal.clearcut.zzbn.zzt(zzchVar.getInt(i));
                i++;
            }
        } else {
            iZzt = 0;
            while (i < size) {
                iZzt += com.google.android.gms.internal.clearcut.zzbn.zzt(list.get(i).intValue());
                i++;
            }
        }
        return iZzt;
    }

    public static void zzf(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zze(i, list, z);
    }

    public static void zzf(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        if (!com.google.android.gms.internal.clearcut.zzcg.class.isAssignableFrom(cls) && (cls2 = zzoh) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int zzg(java.util.List<java.lang.Integer> list) {
        int iZzu;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.clearcut.zzch) {
            com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) list;
            iZzu = 0;
            while (i < size) {
                iZzu += com.google.android.gms.internal.clearcut.zzbn.zzu(zzchVar.getInt(i));
                i++;
            }
        } else {
            iZzu = 0;
            while (i < size) {
                iZzu += com.google.android.gms.internal.clearcut.zzbn.zzu(list.get(i).intValue());
                i++;
            }
        }
        return iZzu;
    }

    public static void zzg(int i, java.util.List<java.lang.Long> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzl(i, list, z);
    }

    static int zzh(java.util.List<?> list) {
        return list.size() << 2;
    }

    public static void zzh(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zza(i, list, z);
    }

    static int zzi(java.util.List<?> list) {
        return list.size() << 3;
    }

    public static void zzi(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzj(i, list, z);
    }

    static int zzj(java.util.List<?> list) {
        return list.size();
    }

    public static void zzj(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzm(i, list, z);
    }

    public static void zzk(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzb(i, list, z);
    }

    public static void zzl(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzk(i, list, z);
    }

    public static void zzm(int i, java.util.List<java.lang.Integer> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzh(i, list, z);
    }

    public static void zzn(int i, java.util.List<java.lang.Boolean> list, com.google.android.gms.internal.clearcut.zzfr zzfrVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfrVar.zzi(i, list, z);
    }

    static int zzo(int i, java.util.List<java.lang.Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzp(int i, java.util.List<java.lang.Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzq(int i, java.util.List<java.lang.Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzr(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzs(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzt(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzu(int i, java.util.List<java.lang.Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * com.google.android.gms.internal.clearcut.zzbn.zzr(i));
    }

    static int zzv(int i, java.util.List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.clearcut.zzbn.zzj(i, 0);
    }

    static int zzw(int i, java.util.List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.clearcut.zzbn.zzg(i, 0L);
    }

    static int zzx(int i, java.util.List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * com.google.android.gms.internal.clearcut.zzbn.zzc(i, true);
    }
}
