package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcn<T> implements java.io.Serializable {
    public static <T> com.google.android.gms.internal.vision.zzcn<T> zzbx() {
        return com.google.android.gms.internal.vision.zzck.zzlf;
    }

    public abstract T get();

    public abstract boolean isPresent();

    public static <T> com.google.android.gms.internal.vision.zzcn<T> zzb(T t) {
        return new com.google.android.gms.internal.vision.zzcs(com.google.android.gms.internal.vision.zzct.checkNotNull(t));
    }

    zzcn() {
    }
}
