package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzdg<K, V> {
    static <K, V> int zza(com.google.android.gms.internal.clearcut.zzdh<K, V> zzdhVar, K k, V v) {
        return com.google.android.gms.internal.clearcut.zzby.zza(zzdhVar.zzmb, 1, k) + com.google.android.gms.internal.clearcut.zzby.zza(zzdhVar.zzmd, 2, v);
    }

    static <K, V> void zza(com.google.android.gms.internal.clearcut.zzbn zzbnVar, com.google.android.gms.internal.clearcut.zzdh<K, V> zzdhVar, K k, V v) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzby.zza(zzbnVar, zzdhVar.zzmb, 1, k);
        com.google.android.gms.internal.clearcut.zzby.zza(zzbnVar, zzdhVar.zzmd, 2, v);
    }
}
