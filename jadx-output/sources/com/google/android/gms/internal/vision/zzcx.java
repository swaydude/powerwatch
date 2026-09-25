package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcx {
    public static <T> com.google.android.gms.internal.vision.zzcu<T> zza(com.google.android.gms.internal.vision.zzcu<T> zzcuVar) {
        if ((zzcuVar instanceof com.google.android.gms.internal.vision.zzcz) || (zzcuVar instanceof com.google.android.gms.internal.vision.zzcw)) {
            return zzcuVar;
        }
        return zzcuVar instanceof java.io.Serializable ? new com.google.android.gms.internal.vision.zzcw(zzcuVar) : new com.google.android.gms.internal.vision.zzcz(zzcuVar);
    }

    public static <T> com.google.android.gms.internal.vision.zzcu<T> zzd(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        return new com.google.android.gms.internal.vision.zzcy(t);
    }
}
