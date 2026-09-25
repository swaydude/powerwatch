package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgj {
    private static final com.google.android.gms.internal.measurement.zzgh zza = zzc();
    private static final com.google.android.gms.internal.measurement.zzgh zzb = new com.google.android.gms.internal.measurement.zzgk();

    static com.google.android.gms.internal.measurement.zzgh zza() {
        return zza;
    }

    static com.google.android.gms.internal.measurement.zzgh zzb() {
        return zzb;
    }

    private static com.google.android.gms.internal.measurement.zzgh zzc() {
        try {
            return (com.google.android.gms.internal.measurement.zzgh) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
