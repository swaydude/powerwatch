package com.google.android.gms.vision.clearcut;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    private final java.lang.Object lock = new java.lang.Object();
    private long zzbu = Long.MIN_VALUE;
    private final long zzbt = java.lang.Math.round(30000.0d);

    public zzb(double d) {
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (this.zzbu + this.zzbt > jCurrentTimeMillis) {
                return false;
            }
            this.zzbu = jCurrentTimeMillis;
            return true;
        }
    }
}
