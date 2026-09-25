package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcy<T> implements java.io.Serializable {
    public static <T> com.google.android.gms.internal.measurement.zzcy<T> zzc() {
        return com.google.android.gms.internal.measurement.zzcw.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();

    public static <T> com.google.android.gms.internal.measurement.zzcy<T> zza(T t) {
        return new com.google.android.gms.internal.measurement.zzda(com.google.android.gms.internal.measurement.zzcx.zza(t));
    }

    zzcy() {
    }
}
