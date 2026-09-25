package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzda extends com.google.android.gms.internal.clearcut.zzcy {
    private static final java.lang.Class<?> zzlv = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzda() {
        super();
    }

    private static <E> java.util.List<E> zzb(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(obj, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object objUnmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(obj, j);
        if (list instanceof com.google.android.gms.internal.clearcut.zzcx) {
            objUnmodifiableList = ((com.google.android.gms.internal.clearcut.zzcx) list).zzbu();
        } else if (zzlv.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        java.util.List list;
        java.util.List list2;
        java.util.List listZzb = zzb(obj2, j);
        int size = listZzb.size();
        java.util.List listZzb2 = zzb(obj, j);
        if (listZzb2.isEmpty()) {
            java.util.List zzcwVar = listZzb2 instanceof com.google.android.gms.internal.clearcut.zzcx ? new com.google.android.gms.internal.clearcut.zzcw(size) : new java.util.ArrayList(size);
            com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, zzcwVar);
            list2 = zzcwVar;
        } else {
            if (zzlv.isAssignableFrom(listZzb2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(listZzb2.size() + size);
                arrayList.addAll(listZzb2);
                list = arrayList;
            } else if (listZzb2 instanceof com.google.android.gms.internal.clearcut.zzfa) {
                list2 = listZzb2;
                com.google.android.gms.internal.clearcut.zzcw zzcwVar2 = new com.google.android.gms.internal.clearcut.zzcw(listZzb2.size() + size);
                zzcwVar2.addAll((com.google.android.gms.internal.clearcut.zzfa) listZzb2);
                list = zzcwVar2;
            }
            com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, list);
            list2 = list;
        }
        list2 = listZzb2;
        int size2 = list2.size();
        int size3 = listZzb.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(listZzb);
        }
        if (size2 > 0) {
            listZzb = list2;
        }
        com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, listZzb);
    }
}
