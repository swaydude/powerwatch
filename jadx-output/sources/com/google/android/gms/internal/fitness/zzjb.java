package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzjb {
    zzjb() {
    }

    abstract int zza(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2);

    abstract int zzb(int i, byte[] bArr, int i2, int i3);

    final boolean zzc(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }
}
