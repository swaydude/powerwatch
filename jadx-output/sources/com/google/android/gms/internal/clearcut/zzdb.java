package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdb extends com.google.android.gms.internal.clearcut.zzcy {
    private zzdb() {
        super();
    }

    private static <E> com.google.android.gms.internal.clearcut.zzcn<E> zzc(java.lang.Object obj, long j) {
        return (com.google.android.gms.internal.clearcut.zzcn) com.google.android.gms.internal.clearcut.zzfd.zzo(obj, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final void zza(java.lang.Object obj, long j) {
        zzc(obj, j).zzv();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.clearcut.zzcn zzcnVarZzc = zzc(obj, j);
        com.google.android.gms.internal.clearcut.zzcn zzcnVarZzc2 = zzc(obj2, j);
        int size = zzcnVarZzc.size();
        int size2 = zzcnVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzcnVarZzc.zzu()) {
                zzcnVarZzc = zzcnVarZzc.zzi(size2 + size);
            }
            zzcnVarZzc.addAll(zzcnVarZzc2);
        }
        if (size > 0) {
            zzcnVarZzc2 = zzcnVarZzc;
        }
        com.google.android.gms.internal.clearcut.zzfd.zza(obj, j, zzcnVarZzc2);
    }
}
