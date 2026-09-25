package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzgy {
    private static final com.google.android.gms.internal.fitness.zzgy zzwz;
    private static final com.google.android.gms.internal.fitness.zzgy zzxa;

    private zzgy() {
    }

    abstract void zza(java.lang.Object obj, long j);

    abstract <L> void zza(java.lang.Object obj, java.lang.Object obj2, long j);

    static com.google.android.gms.internal.fitness.zzgy zzbz() {
        return zzwz;
    }

    static com.google.android.gms.internal.fitness.zzgy zzca() {
        return zzxa;
    }

    static {
        com.google.android.gms.internal.fitness.zzgx zzgxVar = null;
        zzwz = new com.google.android.gms.internal.fitness.zzha();
        zzxa = new com.google.android.gms.internal.fitness.zzgz();
    }
}
