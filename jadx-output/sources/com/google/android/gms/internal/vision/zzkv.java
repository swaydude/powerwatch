package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkv implements com.google.android.gms.internal.vision.zzcu<com.google.android.gms.internal.vision.zzku> {
    private static com.google.android.gms.internal.vision.zzkv zzagg = new com.google.android.gms.internal.vision.zzkv();
    private final com.google.android.gms.internal.vision.zzcu<com.google.android.gms.internal.vision.zzku> zzagd;

    public static boolean zzjp() {
        return ((com.google.android.gms.internal.vision.zzku) zzagg.get()).zzjp();
    }

    public static boolean zzjq() {
        return ((com.google.android.gms.internal.vision.zzku) zzagg.get()).zzjq();
    }

    private zzkv(com.google.android.gms.internal.vision.zzcu<com.google.android.gms.internal.vision.zzku> zzcuVar) {
        this.zzagd = com.google.android.gms.internal.vision.zzcx.zza(zzcuVar);
    }

    public zzkv() {
        this(com.google.android.gms.internal.vision.zzcx.zzd(new com.google.android.gms.internal.vision.zzkw()));
    }

    @Override // com.google.android.gms.internal.vision.zzcu
    public final /* synthetic */ com.google.android.gms.internal.vision.zzku get() {
        return this.zzagd.get();
    }
}
