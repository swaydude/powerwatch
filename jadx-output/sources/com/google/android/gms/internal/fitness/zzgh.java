package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgh implements com.google.android.gms.internal.fitness.zzhl {
    private static final com.google.android.gms.internal.fitness.zzgh zzve = new com.google.android.gms.internal.fitness.zzgh();

    private zzgh() {
    }

    public static com.google.android.gms.internal.fitness.zzgh zzbn() {
        return zzve;
    }

    @Override // com.google.android.gms.internal.fitness.zzhl
    public final boolean zzb(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.fitness.zzgg.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.fitness.zzhl
    public final com.google.android.gms.internal.fitness.zzhm zzc(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.fitness.zzgg.class.isAssignableFrom(cls)) {
            java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.fitness.zzhm) com.google.android.gms.internal.fitness.zzgg.zza(cls.asSubclass(com.google.android.gms.internal.fitness.zzgg.class)).zza(com.google.android.gms.internal.fitness.zzgg.zze.zzvn, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new java.lang.String("Unable to get message info for "), e);
        }
    }
}
