package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzho extends com.google.android.gms.internal.vision.zzhm {
    private static final java.lang.Class<?> zzyg = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzho() {
        super();
    }

    @Override // com.google.android.gms.internal.vision.zzhm
    final <L> java.util.List<L> zza(java.lang.Object obj, long j) {
        return zza(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.vision.zzhm
    final void zzb(java.lang.Object obj, long j) {
        java.lang.Object objUnmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(obj, j);
        if (list instanceof com.google.android.gms.internal.vision.zzhj) {
            objUnmodifiableList = ((com.google.android.gms.internal.vision.zzhj) list).zzgy();
        } else {
            if (zzyg.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.vision.zzio) && (list instanceof com.google.android.gms.internal.vision.zzgz)) {
                com.google.android.gms.internal.vision.zzgz zzgzVar = (com.google.android.gms.internal.vision.zzgz) list;
                if (zzgzVar.zzdo()) {
                    zzgzVar.zzdp();
                    return;
                }
                return;
            }
            objUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.vision.zzjp.zza(obj, j, objUnmodifiableList);
    }

    private static <L> java.util.List<L> zza(java.lang.Object obj, long j, int i) {
        java.lang.Object obj2;
        java.util.List<L> arrayList;
        java.util.List<L> listZzd = zzd(obj, j);
        if (listZzd.isEmpty()) {
            if (listZzd instanceof com.google.android.gms.internal.vision.zzhj) {
                arrayList = new com.google.android.gms.internal.vision.zzhk(i);
            } else if ((listZzd instanceof com.google.android.gms.internal.vision.zzio) && (listZzd instanceof com.google.android.gms.internal.vision.zzgz)) {
                arrayList = ((com.google.android.gms.internal.vision.zzgz) listZzd).zzag(i);
            } else {
                arrayList = new java.util.ArrayList<>(i);
            }
            com.google.android.gms.internal.vision.zzjp.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zzyg.isAssignableFrom(listZzd.getClass())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(listZzd.size() + i);
            arrayList2.addAll(listZzd);
            com.google.android.gms.internal.vision.zzjp.zza(obj, j, arrayList2);
            obj2 = arrayList2;
        } else if (listZzd instanceof com.google.android.gms.internal.vision.zzjo) {
            com.google.android.gms.internal.vision.zzhk zzhkVar = new com.google.android.gms.internal.vision.zzhk(listZzd.size() + i);
            zzhkVar.addAll((com.google.android.gms.internal.vision.zzjo) listZzd);
            com.google.android.gms.internal.vision.zzjp.zza(obj, j, zzhkVar);
            obj2 = zzhkVar;
        } else {
            if (!(listZzd instanceof com.google.android.gms.internal.vision.zzio) || !(listZzd instanceof com.google.android.gms.internal.vision.zzgz)) {
                return listZzd;
            }
            com.google.android.gms.internal.vision.zzgz zzgzVar = (com.google.android.gms.internal.vision.zzgz) listZzd;
            if (zzgzVar.zzdo()) {
                return listZzd;
            }
            com.google.android.gms.internal.vision.zzgz zzgzVarZzag = zzgzVar.zzag(listZzd.size() + i);
            com.google.android.gms.internal.vision.zzjp.zza(obj, j, zzgzVarZzag);
            return zzgzVarZzag;
        }
        return (java.util.List<L>) obj2;
    }

    @Override // com.google.android.gms.internal.vision.zzhm
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        java.util.List listZzd = zzd(obj2, j);
        java.util.List listZza = zza(obj, j, listZzd.size());
        int size = listZza.size();
        int size2 = listZzd.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzd);
        }
        if (size > 0) {
            listZzd = listZza;
        }
        com.google.android.gms.internal.vision.zzjp.zza(obj, j, listZzd);
    }

    private static <E> java.util.List<E> zzd(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(obj, j);
    }
}
