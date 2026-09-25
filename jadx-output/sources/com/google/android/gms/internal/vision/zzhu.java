package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhu<K, V> {
    static <K, V> void zza(com.google.android.gms.internal.vision.zzga zzgaVar, com.google.android.gms.internal.vision.zzht<K, V> zzhtVar, K k, V v) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgi.zza(zzgaVar, zzhtVar.zzym, 1, k);
        com.google.android.gms.internal.vision.zzgi.zza(zzgaVar, zzhtVar.zzyo, 2, v);
    }

    static <K, V> int zza(com.google.android.gms.internal.vision.zzht<K, V> zzhtVar, K k, V v) {
        return com.google.android.gms.internal.vision.zzgi.zza(zzhtVar.zzym, 1, k) + com.google.android.gms.internal.vision.zzgi.zza(zzhtVar.zzyo, 2, v);
    }
}
