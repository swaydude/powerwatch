package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzga extends com.google.android.gms.internal.measurement.zzfy {
    private static final java.lang.Class<?> zza = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzga() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzfy
    final <L> java.util.List<L> zza(java.lang.Object obj, long j) {
        return zza(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzfy
    final void zzb(java.lang.Object obj, long j) {
        java.lang.Object objUnmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(obj, j);
        if (list instanceof com.google.android.gms.internal.measurement.zzfv) {
            objUnmodifiableList = ((com.google.android.gms.internal.measurement.zzfv) list).g_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.measurement.zzha) && (list instanceof com.google.android.gms.internal.measurement.zzfl)) {
                com.google.android.gms.internal.measurement.zzfl zzflVar = (com.google.android.gms.internal.measurement.zzfl) list;
                if (zzflVar.zza()) {
                    zzflVar.h_();
                    return;
                }
                return;
            }
            objUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.measurement.zzib.zza(obj, j, objUnmodifiableList);
    }

    private static <L> java.util.List<L> zza(java.lang.Object obj, long j, int i) {
        java.lang.Object obj2;
        java.util.List<L> arrayList;
        java.util.List<L> listZzc = zzc(obj, j);
        if (listZzc.isEmpty()) {
            if (listZzc instanceof com.google.android.gms.internal.measurement.zzfv) {
                arrayList = new com.google.android.gms.internal.measurement.zzfw(i);
            } else if ((listZzc instanceof com.google.android.gms.internal.measurement.zzha) && (listZzc instanceof com.google.android.gms.internal.measurement.zzfl)) {
                arrayList = ((com.google.android.gms.internal.measurement.zzfl) listZzc).zza(i);
            } else {
                arrayList = new java.util.ArrayList<>(i);
            }
            com.google.android.gms.internal.measurement.zzib.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(listZzc.size() + i);
            arrayList2.addAll(listZzc);
            com.google.android.gms.internal.measurement.zzib.zza(obj, j, arrayList2);
            obj2 = arrayList2;
        } else if (listZzc instanceof com.google.android.gms.internal.measurement.zzia) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = new com.google.android.gms.internal.measurement.zzfw(listZzc.size() + i);
            zzfwVar.addAll((com.google.android.gms.internal.measurement.zzia) listZzc);
            com.google.android.gms.internal.measurement.zzib.zza(obj, j, zzfwVar);
            obj2 = zzfwVar;
        } else {
            if (!(listZzc instanceof com.google.android.gms.internal.measurement.zzha) || !(listZzc instanceof com.google.android.gms.internal.measurement.zzfl)) {
                return listZzc;
            }
            com.google.android.gms.internal.measurement.zzfl zzflVar = (com.google.android.gms.internal.measurement.zzfl) listZzc;
            if (zzflVar.zza()) {
                return listZzc;
            }
            com.google.android.gms.internal.measurement.zzfl zzflVarZza = zzflVar.zza(listZzc.size() + i);
            com.google.android.gms.internal.measurement.zzib.zza(obj, j, zzflVarZza);
            return zzflVarZza;
        }
        return (java.util.List<L>) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzfy
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        java.util.List listZzc = zzc(obj2, j);
        java.util.List listZza = zza(obj, j, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        com.google.android.gms.internal.measurement.zzib.zza(obj, j, listZzc);
    }

    private static <E> java.util.List<E> zzc(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(obj, j);
    }
}
