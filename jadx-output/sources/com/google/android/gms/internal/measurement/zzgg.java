package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgg<K, V> {
    static <K, V> void zza(com.google.android.gms.internal.measurement.zzen zzenVar, com.google.android.gms.internal.measurement.zzgf<K, V> zzgfVar, K k, V v) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzew.zza(zzenVar, zzgfVar.zza, 1, k);
        com.google.android.gms.internal.measurement.zzew.zza(zzenVar, zzgfVar.zzc, 2, v);
    }

    static <K, V> int zza(com.google.android.gms.internal.measurement.zzgf<K, V> zzgfVar, K k, V v) {
        return com.google.android.gms.internal.measurement.zzew.zza(zzgfVar.zza, 1, k) + com.google.android.gms.internal.measurement.zzew.zza(zzgfVar.zzc, 2, v);
    }
}
