package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzin {
    private static final com.google.android.gms.internal.vision.zzin zzzn = new com.google.android.gms.internal.vision.zzin();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.vision.zzir<?>> zzzp = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.vision.zziu zzzo = new com.google.android.gms.internal.vision.zzhp();

    public static com.google.android.gms.internal.vision.zzin zzho() {
        return zzzn;
    }

    public final <T> com.google.android.gms.internal.vision.zzir<T> zzf(java.lang.Class<T> cls) {
        com.google.android.gms.internal.vision.zzgt.zza(cls, "messageType");
        com.google.android.gms.internal.vision.zzir<T> zzirVar = (com.google.android.gms.internal.vision.zzir) this.zzzp.get(cls);
        if (zzirVar != null) {
            return zzirVar;
        }
        com.google.android.gms.internal.vision.zzir<T> zzirVarZze = this.zzzo.zze(cls);
        com.google.android.gms.internal.vision.zzgt.zza(cls, "messageType");
        com.google.android.gms.internal.vision.zzgt.zza(zzirVarZze, "schema");
        com.google.android.gms.internal.vision.zzir<T> zzirVar2 = (com.google.android.gms.internal.vision.zzir) this.zzzp.putIfAbsent(cls, zzirVarZze);
        return zzirVar2 != null ? zzirVar2 : zzirVarZze;
    }

    public final <T> com.google.android.gms.internal.vision.zzir<T> zzu(T t) {
        return zzf(t.getClass());
    }

    private zzin() {
    }
}
