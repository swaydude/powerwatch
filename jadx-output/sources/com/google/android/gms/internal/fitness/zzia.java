package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzia {
    private static final com.google.android.gms.internal.fitness.zzia zzyh = new com.google.android.gms.internal.fitness.zzia();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.fitness.zzic<?>> zzyj = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.fitness.zzib zzyi = new com.google.android.gms.internal.fitness.zzhb();

    public static com.google.android.gms.internal.fitness.zzia zzcp() {
        return zzyh;
    }

    public final <T> com.google.android.gms.internal.fitness.zzic<T> zze(java.lang.Class<T> cls) {
        com.google.android.gms.internal.fitness.zzgk.zza(cls, "messageType");
        com.google.android.gms.internal.fitness.zzic<T> zzicVar = (com.google.android.gms.internal.fitness.zzic) this.zzyj.get(cls);
        if (zzicVar != null) {
            return zzicVar;
        }
        com.google.android.gms.internal.fitness.zzic<T> zzicVarZzd = this.zzyi.zzd(cls);
        com.google.android.gms.internal.fitness.zzgk.zza(cls, "messageType");
        com.google.android.gms.internal.fitness.zzgk.zza(zzicVarZzd, "schema");
        com.google.android.gms.internal.fitness.zzic<T> zzicVar2 = (com.google.android.gms.internal.fitness.zzic) this.zzyj.putIfAbsent(cls, zzicVarZzd);
        return zzicVar2 != null ? zzicVar2 : zzicVarZzd;
    }

    public final <T> com.google.android.gms.internal.fitness.zzic<T> zzl(T t) {
        return zze(t.getClass());
    }

    private zzia() {
    }
}
