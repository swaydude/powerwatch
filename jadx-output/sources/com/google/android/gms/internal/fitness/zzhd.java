package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhd implements com.google.android.gms.internal.fitness.zzhl {
    private com.google.android.gms.internal.fitness.zzhl[] zzxg;

    zzhd(com.google.android.gms.internal.fitness.zzhl... zzhlVarArr) {
        this.zzxg = zzhlVarArr;
    }

    @Override // com.google.android.gms.internal.fitness.zzhl
    public final boolean zzb(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.fitness.zzhl zzhlVar : this.zzxg) {
            if (zzhlVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.zzhl
    public final com.google.android.gms.internal.fitness.zzhm zzc(java.lang.Class<?> cls) {
        for (com.google.android.gms.internal.fitness.zzhl zzhlVar : this.zzxg) {
            if (zzhlVar.zzb(cls)) {
                return zzhlVar.zzc(cls);
            }
        }
        java.lang.String strValueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new java.lang.String("No factory is available for message type: "));
    }
}
