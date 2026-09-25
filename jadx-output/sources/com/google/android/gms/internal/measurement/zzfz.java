package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfz extends com.google.android.gms.internal.measurement.zzfy {
    private zzfz() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzfy
    final <L> java.util.List<L> zza(java.lang.Object obj, long j) {
        com.google.android.gms.internal.measurement.zzfl zzflVarZzc = zzc(obj, j);
        if (zzflVarZzc.zza()) {
            return zzflVarZzc;
        }
        int size = zzflVarZzc.size();
        com.google.android.gms.internal.measurement.zzfl zzflVarZza = zzflVarZzc.zza(size == 0 ? 10 : size << 1);
        com.google.android.gms.internal.measurement.zzib.zza(obj, j, zzflVarZza);
        return zzflVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzfy
    final void zzb(java.lang.Object obj, long j) {
        zzc(obj, j).h_();
    }

    @Override // com.google.android.gms.internal.measurement.zzfy
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.measurement.zzfl zzflVarZzc = zzc(obj, j);
        com.google.android.gms.internal.measurement.zzfl zzflVarZzc2 = zzc(obj2, j);
        int size = zzflVarZzc.size();
        int size2 = zzflVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzflVarZzc.zza()) {
                zzflVarZzc = zzflVarZzc.zza(size2 + size);
            }
            zzflVarZzc.addAll(zzflVarZzc2);
        }
        if (size > 0) {
            zzflVarZzc2 = zzflVarZzc;
        }
        com.google.android.gms.internal.measurement.zzib.zza(obj, j, zzflVarZzc2);
    }

    private static <E> com.google.android.gms.internal.measurement.zzfl<E> zzc(java.lang.Object obj, long j) {
        return (com.google.android.gms.internal.measurement.zzfl) com.google.android.gms.internal.measurement.zzib.zzf(obj, j);
    }
}
