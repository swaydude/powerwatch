package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdc {
    public static <T> com.google.android.gms.internal.measurement.zzcz<T> zza(com.google.android.gms.internal.measurement.zzcz<T> zzczVar) {
        if ((zzczVar instanceof com.google.android.gms.internal.measurement.zzde) || (zzczVar instanceof com.google.android.gms.internal.measurement.zzdb)) {
            return zzczVar;
        }
        return zzczVar instanceof java.io.Serializable ? new com.google.android.gms.internal.measurement.zzdb(zzczVar) : new com.google.android.gms.internal.measurement.zzde(zzczVar);
    }

    public static <T> com.google.android.gms.internal.measurement.zzcz<T> zza(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        return new com.google.android.gms.internal.measurement.zzdd(t);
    }
}
