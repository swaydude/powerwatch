package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgq implements com.google.android.gms.internal.vision.zzhz {
    private static final com.google.android.gms.internal.vision.zzgq zzvy = new com.google.android.gms.internal.vision.zzgq();

    private zzgq() {
    }

    public static com.google.android.gms.internal.vision.zzgq zzfw() {
        return zzvy;
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final boolean zza(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.vision.zzgs.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final com.google.android.gms.internal.vision.zzia zzb(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.vision.zzgs.class.isAssignableFrom(cls)) {
            java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.vision.zzia) com.google.android.gms.internal.vision.zzgs.zzd(cls.asSubclass(com.google.android.gms.internal.vision.zzgs.class)).zza(com.google.android.gms.internal.vision.zzgs.zzf.zzwn, (java.lang.Object) null, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new java.lang.String("Unable to get message info for "), e);
        }
    }
}
