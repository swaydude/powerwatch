package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhr implements com.google.android.gms.internal.vision.zzhz {
    private com.google.android.gms.internal.vision.zzhz[] zzyl;

    zzhr(com.google.android.gms.internal.vision.zzhz... zzhzVarArr) {
        this.zzyl = zzhzVarArr;
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final boolean zza(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.vision.zzhz zzhzVar : this.zzyl) {
            if (zzhzVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final com.google.android.gms.internal.vision.zzia zzb(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.vision.zzhz zzhzVar : this.zzyl) {
            if (zzhzVar.zza(cls)) {
                return zzhzVar.zzb(cls);
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new java.lang.String("No factory is available for message type: "));
    }
}
