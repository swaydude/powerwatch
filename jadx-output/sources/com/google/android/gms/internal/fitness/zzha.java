package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzha extends com.google.android.gms.internal.fitness.zzgy {
    private static final java.lang.Class<?> zzxb = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzha() {
        super();
    }

    @Override // com.google.android.gms.internal.fitness.zzgy
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object objUnmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(obj, j);
        if (list instanceof com.google.android.gms.internal.fitness.zzgv) {
            objUnmodifiableList = ((com.google.android.gms.internal.fitness.zzgv) list).zzby();
        } else {
            if (zzxb.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.fitness.zzhx) && (list instanceof com.google.android.gms.internal.fitness.zzgl)) {
                com.google.android.gms.internal.fitness.zzgl zzglVar = (com.google.android.gms.internal.fitness.zzgl) list;
                if (zzglVar.zzak()) {
                    zzglVar.zzal();
                    return;
                }
                return;
            }
            objUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.fitness.zzja.zza(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.fitness.zzgy
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        java.util.List list;
        java.util.List list2;
        java.util.List listZzac;
        java.util.List listZzc = zzc(obj2, j);
        int size = listZzc.size();
        java.util.List listZzc2 = zzc(obj, j);
        if (listZzc2.isEmpty()) {
            if (listZzc2 instanceof com.google.android.gms.internal.fitness.zzgv) {
                listZzac = new com.google.android.gms.internal.fitness.zzgw(size);
            } else if ((listZzc2 instanceof com.google.android.gms.internal.fitness.zzhx) && (listZzc2 instanceof com.google.android.gms.internal.fitness.zzgl)) {
                listZzac = ((com.google.android.gms.internal.fitness.zzgl) listZzc2).zzac(size);
            } else {
                listZzac = new java.util.ArrayList(size);
            }
            com.google.android.gms.internal.fitness.zzja.zza(obj, j, listZzac);
            list2 = listZzac;
        } else {
            if (zzxb.isAssignableFrom(listZzc2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(listZzc2.size() + size);
                arrayList.addAll(listZzc2);
                com.google.android.gms.internal.fitness.zzja.zza(obj, j, arrayList);
                list = arrayList;
            } else if (listZzc2 instanceof com.google.android.gms.internal.fitness.zziv) {
                com.google.android.gms.internal.fitness.zzgw zzgwVar = new com.google.android.gms.internal.fitness.zzgw(listZzc2.size() + size);
                zzgwVar.addAll((com.google.android.gms.internal.fitness.zziv) listZzc2);
                com.google.android.gms.internal.fitness.zzja.zza(obj, j, zzgwVar);
                list = zzgwVar;
            } else if ((listZzc2 instanceof com.google.android.gms.internal.fitness.zzhx) && (listZzc2 instanceof com.google.android.gms.internal.fitness.zzgl)) {
                com.google.android.gms.internal.fitness.zzgl zzglVar = (com.google.android.gms.internal.fitness.zzgl) listZzc2;
                if (!zzglVar.zzak()) {
                    list2 = listZzc2;
                    list2 = listZzc2;
                    list2 = listZzc2;
                    com.google.android.gms.internal.fitness.zzgl<E> zzglVarZzac = zzglVar.zzac(listZzc2.size() + size);
                    com.google.android.gms.internal.fitness.zzja.zza(obj, j, zzglVarZzac);
                    list2 = zzglVarZzac;
                }
            }
            list2 = list;
        }
        list2 = listZzc2;
        list2 = listZzc2;
        list2 = listZzc2;
        list2 = listZzc2;
        list2 = listZzc2;
        list2 = listZzc2;
        int size2 = list2.size();
        int size3 = listZzc.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(listZzc);
        }
        if (size2 > 0) {
            listZzc = list2;
        }
        com.google.android.gms.internal.fitness.zzja.zza(obj, j, listZzc);
    }

    private static <E> java.util.List<E> zzc(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(obj, j);
    }
}
