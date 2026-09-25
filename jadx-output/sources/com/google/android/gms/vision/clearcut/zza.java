package com.google.android.gms.vision.clearcut;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements java.lang.Runnable {
    private final /* synthetic */ int zzbq;
    private final /* synthetic */ com.google.android.gms.internal.vision.zzea.zzo zzbr;
    private final /* synthetic */ com.google.android.gms.vision.clearcut.DynamiteClearcutLogger zzbs;

    zza(com.google.android.gms.vision.clearcut.DynamiteClearcutLogger dynamiteClearcutLogger, int i, com.google.android.gms.internal.vision.zzea.zzo zzoVar) {
        this.zzbs = dynamiteClearcutLogger;
        this.zzbq = i;
        this.zzbr = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbs.zzbp.zzb(this.zzbq, this.zzbr);
    }
}
