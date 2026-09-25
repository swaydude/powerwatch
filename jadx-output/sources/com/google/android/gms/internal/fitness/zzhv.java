package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhv {
    private static final com.google.android.gms.internal.fitness.zzht zzyf = zzcm();
    private static final com.google.android.gms.internal.fitness.zzht zzyg = new com.google.android.gms.internal.fitness.zzhw();

    static com.google.android.gms.internal.fitness.zzht zzck() {
        return zzyf;
    }

    static com.google.android.gms.internal.fitness.zzht zzcl() {
        return zzyg;
    }

    private static com.google.android.gms.internal.fitness.zzht zzcm() {
        try {
            return (com.google.android.gms.internal.fitness.zzht) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
