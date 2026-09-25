package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdf implements com.google.android.gms.internal.clearcut.zzdn {
    private com.google.android.gms.internal.clearcut.zzdn[] zzma;

    zzdf(com.google.android.gms.internal.clearcut.zzdn... zzdnVarArr) {
        this.zzma = zzdnVarArr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdn
    public final boolean zza(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.clearcut.zzdn zzdnVar : this.zzma) {
            if (zzdnVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdn
    public final com.google.android.gms.internal.clearcut.zzdm zzb(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.clearcut.zzdn zzdnVar : this.zzma) {
            if (zzdnVar.zza(cls)) {
                return zzdnVar.zzb(cls);
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new java.lang.String("No factory is available for message type: "));
    }
}
