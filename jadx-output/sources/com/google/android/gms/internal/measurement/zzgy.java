package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgy {
    private static final com.google.android.gms.internal.measurement.zzgw zza = zzc();
    private static final com.google.android.gms.internal.measurement.zzgw zzb = new com.google.android.gms.internal.measurement.zzgv();

    static com.google.android.gms.internal.measurement.zzgw zza() {
        return zza;
    }

    static com.google.android.gms.internal.measurement.zzgw zzb() {
        return zzb;
    }

    private static com.google.android.gms.internal.measurement.zzgw zzc() {
        try {
            return (com.google.android.gms.internal.measurement.zzgw) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
