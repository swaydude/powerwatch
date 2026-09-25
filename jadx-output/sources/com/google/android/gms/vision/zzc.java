package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    private static final java.lang.Object lock = new java.lang.Object();
    private static int zzat;
    private final android.util.SparseIntArray zzau = new android.util.SparseIntArray();
    private final android.util.SparseIntArray zzav = new android.util.SparseIntArray();

    public final int zzb(int i) {
        synchronized (lock) {
            int i2 = this.zzau.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = zzat;
            zzat = i3 + 1;
            this.zzau.append(i, i3);
            this.zzav.append(i3, i);
            return i3;
        }
    }

    public final int zzc(int i) {
        int i2;
        synchronized (lock) {
            i2 = this.zzav.get(i);
        }
        return i2;
    }
}
