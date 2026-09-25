package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhm {
    private static final com.google.android.gms.internal.vision.zzhm zzye;
    private static final com.google.android.gms.internal.vision.zzhm zzyf;

    private zzhm() {
    }

    abstract <L> java.util.List<L> zza(java.lang.Object obj, long j);

    abstract <L> void zza(java.lang.Object obj, java.lang.Object obj2, long j);

    abstract void zzb(java.lang.Object obj, long j);

    static com.google.android.gms.internal.vision.zzhm zzgz() {
        return zzye;
    }

    static com.google.android.gms.internal.vision.zzhm zzha() {
        return zzyf;
    }

    static {
        com.google.android.gms.internal.vision.zzhl zzhlVar = null;
        zzye = new com.google.android.gms.internal.vision.zzho();
        zzyf = new com.google.android.gms.internal.vision.zzhn();
    }
}
