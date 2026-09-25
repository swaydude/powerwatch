package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
interface zzir<T> {
    boolean equals(T t, T t2);

    int hashCode(T t);

    T newInstance();

    void zza(T t, com.google.android.gms.internal.vision.zzis zzisVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException;

    void zza(T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException;

    void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException;

    void zzd(T t, T t2);

    void zzg(T t);

    int zzr(T t);

    boolean zzt(T t);
}
