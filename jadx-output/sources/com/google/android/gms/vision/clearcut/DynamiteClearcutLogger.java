package com.google.android.gms.vision.clearcut;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class DynamiteClearcutLogger {
    private static final java.util.concurrent.ThreadPoolExecutor zzbn = new java.util.concurrent.ThreadPoolExecutor(1, 2, 2, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(10), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
    private com.google.android.gms.vision.clearcut.zzb zzbo = new com.google.android.gms.vision.clearcut.zzb(0.03333333333333333d);
    private com.google.android.gms.vision.clearcut.VisionClearcutLogger zzbp;

    public DynamiteClearcutLogger(android.content.Context context) {
        this.zzbp = new com.google.android.gms.vision.clearcut.VisionClearcutLogger(context);
    }

    public final void zza(int i, com.google.android.gms.internal.vision.zzea.zzo zzoVar) {
        if (i == 3 && !this.zzbo.tryAcquire()) {
            com.google.android.gms.vision.L.v("Skipping image analysis log due to rate limiting", new java.lang.Object[0]);
        } else {
            zzbn.execute(new com.google.android.gms.vision.clearcut.zza(this, i, zzoVar));
        }
    }
}
