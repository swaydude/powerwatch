package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgz {
    private static final com.google.android.gms.internal.measurement.zzgz zza = new com.google.android.gms.internal.measurement.zzgz();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.measurement.zzhd<?>> zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.measurement.zzhg zzb = new com.google.android.gms.internal.measurement.zzgb();

    public static com.google.android.gms.internal.measurement.zzgz zza() {
        return zza;
    }

    public final <T> com.google.android.gms.internal.measurement.zzhd<T> zza(java.lang.Class<T> cls) {
        com.google.android.gms.internal.measurement.zzff.zza(cls, "messageType");
        com.google.android.gms.internal.measurement.zzhd<T> zzhdVar = (com.google.android.gms.internal.measurement.zzhd) this.zzc.get(cls);
        if (zzhdVar != null) {
            return zzhdVar;
        }
        com.google.android.gms.internal.measurement.zzhd<T> zzhdVarZza = this.zzb.zza(cls);
        com.google.android.gms.internal.measurement.zzff.zza(cls, "messageType");
        com.google.android.gms.internal.measurement.zzff.zza(zzhdVarZza, "schema");
        com.google.android.gms.internal.measurement.zzhd<T> zzhdVar2 = (com.google.android.gms.internal.measurement.zzhd) this.zzc.putIfAbsent(cls, zzhdVarZza);
        return zzhdVar2 != null ? zzhdVar2 : zzhdVarZza;
    }

    public final <T> com.google.android.gms.internal.measurement.zzhd<T> zza(T t) {
        return zza((java.lang.Class) t.getClass());
    }

    private zzgz() {
    }
}
