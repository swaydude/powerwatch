package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhj {
    private static final com.google.android.gms.internal.fitness.zzhh zzxk = zzcg();
    private static final com.google.android.gms.internal.fitness.zzhh zzxl = new com.google.android.gms.internal.fitness.zzhk();

    static com.google.android.gms.internal.fitness.zzhh zzce() {
        return zzxk;
    }

    static com.google.android.gms.internal.fitness.zzhh zzcf() {
        return zzxl;
    }

    private static com.google.android.gms.internal.fitness.zzhh zzcg() {
        try {
            return (com.google.android.gms.internal.fitness.zzhh) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
