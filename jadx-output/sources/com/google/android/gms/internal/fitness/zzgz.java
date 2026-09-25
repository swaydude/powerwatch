package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgz extends com.google.android.gms.internal.fitness.zzgy {
    private zzgz() {
        super();
    }

    @Override // com.google.android.gms.internal.fitness.zzgy
    final void zza(java.lang.Object obj, long j) {
        zzb(obj, j).zzal();
    }

    @Override // com.google.android.gms.internal.fitness.zzgy
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.fitness.zzgl zzglVarZzb = zzb(obj, j);
        com.google.android.gms.internal.fitness.zzgl zzglVarZzb2 = zzb(obj2, j);
        int size = zzglVarZzb.size();
        int size2 = zzglVarZzb2.size();
        if (size > 0 && size2 > 0) {
            if (!zzglVarZzb.zzak()) {
                zzglVarZzb = zzglVarZzb.zzac(size2 + size);
            }
            zzglVarZzb.addAll(zzglVarZzb2);
        }
        if (size > 0) {
            zzglVarZzb2 = zzglVarZzb;
        }
        com.google.android.gms.internal.fitness.zzja.zza(obj, j, zzglVarZzb2);
    }

    private static <E> com.google.android.gms.internal.fitness.zzgl<E> zzb(java.lang.Object obj, long j) {
        return (com.google.android.gms.internal.fitness.zzgl) com.google.android.gms.internal.fitness.zzja.zzo(obj, j);
    }
}
