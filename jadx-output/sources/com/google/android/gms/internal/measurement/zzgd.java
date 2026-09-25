package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgd implements com.google.android.gms.internal.measurement.zzgl {
    private com.google.android.gms.internal.measurement.zzgl[] zza;

    zzgd(com.google.android.gms.internal.measurement.zzgl... zzglVarArr) {
        this.zza = zzglVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final boolean zza(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.measurement.zzgl zzglVar : this.zza) {
            if (zzglVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final com.google.android.gms.internal.measurement.zzgm zzb(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.measurement.zzgl zzglVar : this.zza) {
            if (zzglVar.zza(cls)) {
                return zzglVar.zzb(cls);
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new java.lang.String("No factory is available for message type: "));
    }
}
