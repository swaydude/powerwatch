package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzet {
    private static final com.google.android.gms.internal.measurement.zzes<?> zza = new com.google.android.gms.internal.measurement.zzeu();
    private static final com.google.android.gms.internal.measurement.zzes<?> zzb = zzc();

    private static com.google.android.gms.internal.measurement.zzes<?> zzc() {
        try {
            return (com.google.android.gms.internal.measurement.zzes) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static com.google.android.gms.internal.measurement.zzes<?> zza() {
        return zza;
    }

    static com.google.android.gms.internal.measurement.zzes<?> zzb() {
        com.google.android.gms.internal.measurement.zzes<?> zzesVar = zzb;
        if (zzesVar != null) {
            return zzesVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
