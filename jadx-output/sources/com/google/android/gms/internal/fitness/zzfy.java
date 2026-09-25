package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfy {
    private static final com.google.android.gms.internal.fitness.zzfw<?> zzsf = new com.google.android.gms.internal.fitness.zzfz();
    private static final com.google.android.gms.internal.fitness.zzfw<?> zzsg = zzbb();

    private static com.google.android.gms.internal.fitness.zzfw<?> zzbb() {
        try {
            return (com.google.android.gms.internal.fitness.zzfw) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.android.gms.internal.fitness.zzfw<?> zzbc() {
        return zzsf;
    }

    static com.google.android.gms.internal.fitness.zzfw<?> zzbd() {
        com.google.android.gms.internal.fitness.zzfw<?> zzfwVar = zzsg;
        if (zzfwVar != null) {
            return zzfwVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
