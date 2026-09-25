package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgj {
    private static final com.google.android.gms.internal.vision.zzgf<?> zztf = new com.google.android.gms.internal.vision.zzgh();
    private static final com.google.android.gms.internal.vision.zzgf<?> zztg = zzfp();

    private static com.google.android.gms.internal.vision.zzgf<?> zzfp() {
        try {
            return (com.google.android.gms.internal.vision.zzgf) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.android.gms.internal.vision.zzgf<?> zzfq() {
        return zztf;
    }

    static com.google.android.gms.internal.vision.zzgf<?> zzfr() {
        com.google.android.gms.internal.vision.zzgf<?> zzgfVar = zztg;
        if (zzgfVar != null) {
            return zzgfVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
