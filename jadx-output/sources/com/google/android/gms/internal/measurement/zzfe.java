package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfe implements com.google.android.gms.internal.measurement.zzgl {
    private static final com.google.android.gms.internal.measurement.zzfe zza = new com.google.android.gms.internal.measurement.zzfe();

    private zzfe() {
    }

    public static com.google.android.gms.internal.measurement.zzfe zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final boolean zza(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.measurement.zzfd.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final com.google.android.gms.internal.measurement.zzgm zzb(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.measurement.zzfd.class.isAssignableFrom(cls)) {
            java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.measurement.zzgm) com.google.android.gms.internal.measurement.zzfd.zza(cls.asSubclass(com.google.android.gms.internal.measurement.zzfd.class)).zza(com.google.android.gms.internal.measurement.zzfd.zze.zzc, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new java.lang.String("Unable to get message info for "), e);
        }
    }
}
