package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhn extends com.google.android.gms.internal.vision.zzhm {
    private zzhn() {
        super();
    }

    @Override // com.google.android.gms.internal.vision.zzhm
    final <L> java.util.List<L> zza(java.lang.Object obj, long j) {
        com.google.android.gms.internal.vision.zzgz zzgzVarZzc = zzc(obj, j);
        if (zzgzVarZzc.zzdo()) {
            return zzgzVarZzc;
        }
        int size = zzgzVarZzc.size();
        com.google.android.gms.internal.vision.zzgz zzgzVarZzag = zzgzVarZzc.zzag(size == 0 ? 10 : size << 1);
        com.google.android.gms.internal.vision.zzjp.zza(obj, j, zzgzVarZzag);
        return zzgzVarZzag;
    }

    @Override // com.google.android.gms.internal.vision.zzhm
    final void zzb(java.lang.Object obj, long j) {
        zzc(obj, j).zzdp();
    }

    @Override // com.google.android.gms.internal.vision.zzhm
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.vision.zzgz zzgzVarZzc = zzc(obj, j);
        com.google.android.gms.internal.vision.zzgz zzgzVarZzc2 = zzc(obj2, j);
        int size = zzgzVarZzc.size();
        int size2 = zzgzVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgzVarZzc.zzdo()) {
                zzgzVarZzc = zzgzVarZzc.zzag(size2 + size);
            }
            zzgzVarZzc.addAll(zzgzVarZzc2);
        }
        if (size > 0) {
            zzgzVarZzc2 = zzgzVarZzc;
        }
        com.google.android.gms.internal.vision.zzjp.zza(obj, j, zzgzVarZzc2);
    }

    private static <E> com.google.android.gms.internal.vision.zzgz<E> zzc(java.lang.Object obj, long j) {
        return (com.google.android.gms.internal.vision.zzgz) com.google.android.gms.internal.vision.zzjp.zzp(obj, j);
    }
}
