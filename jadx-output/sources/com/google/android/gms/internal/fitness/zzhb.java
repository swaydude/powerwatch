package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhb implements com.google.android.gms.internal.fitness.zzib {
    private static final com.google.android.gms.internal.fitness.zzhl zzxd = new com.google.android.gms.internal.fitness.zzhe();
    private final com.google.android.gms.internal.fitness.zzhl zzxc;

    public zzhb() {
        this(new com.google.android.gms.internal.fitness.zzhd(com.google.android.gms.internal.fitness.zzgh.zzbn(), zzcb()));
    }

    private zzhb(com.google.android.gms.internal.fitness.zzhl zzhlVar) {
        this.zzxc = (com.google.android.gms.internal.fitness.zzhl) com.google.android.gms.internal.fitness.zzgk.zza(zzhlVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.fitness.zzib
    public final <T> com.google.android.gms.internal.fitness.zzic<T> zzd(java.lang.Class<T> cls) {
        com.google.android.gms.internal.fitness.zzie.zzf((java.lang.Class<?>) cls);
        com.google.android.gms.internal.fitness.zzhm zzhmVarZzc = this.zzxc.zzc(cls);
        if (zzhmVarZzc.zzci()) {
            if (com.google.android.gms.internal.fitness.zzgg.class.isAssignableFrom(cls)) {
                return com.google.android.gms.internal.fitness.zzhr.zza(com.google.android.gms.internal.fitness.zzie.zzcx(), com.google.android.gms.internal.fitness.zzfy.zzbc(), zzhmVarZzc.zzcj());
            }
            return com.google.android.gms.internal.fitness.zzhr.zza(com.google.android.gms.internal.fitness.zzie.zzcv(), com.google.android.gms.internal.fitness.zzfy.zzbd(), zzhmVarZzc.zzcj());
        }
        if (com.google.android.gms.internal.fitness.zzgg.class.isAssignableFrom(cls)) {
            if (zza(zzhmVarZzc)) {
                return com.google.android.gms.internal.fitness.zzhs.zza(cls, zzhmVarZzc, com.google.android.gms.internal.fitness.zzhv.zzcl(), com.google.android.gms.internal.fitness.zzgy.zzca(), com.google.android.gms.internal.fitness.zzie.zzcx(), com.google.android.gms.internal.fitness.zzfy.zzbc(), com.google.android.gms.internal.fitness.zzhj.zzcf());
            }
            return com.google.android.gms.internal.fitness.zzhs.zza(cls, zzhmVarZzc, com.google.android.gms.internal.fitness.zzhv.zzcl(), com.google.android.gms.internal.fitness.zzgy.zzca(), com.google.android.gms.internal.fitness.zzie.zzcx(), null, com.google.android.gms.internal.fitness.zzhj.zzcf());
        }
        if (zza(zzhmVarZzc)) {
            return com.google.android.gms.internal.fitness.zzhs.zza(cls, zzhmVarZzc, com.google.android.gms.internal.fitness.zzhv.zzck(), com.google.android.gms.internal.fitness.zzgy.zzbz(), com.google.android.gms.internal.fitness.zzie.zzcv(), com.google.android.gms.internal.fitness.zzfy.zzbd(), com.google.android.gms.internal.fitness.zzhj.zzce());
        }
        return com.google.android.gms.internal.fitness.zzhs.zza(cls, zzhmVarZzc, com.google.android.gms.internal.fitness.zzhv.zzck(), com.google.android.gms.internal.fitness.zzgy.zzbz(), com.google.android.gms.internal.fitness.zzie.zzcw(), null, com.google.android.gms.internal.fitness.zzhj.zzce());
    }

    private static boolean zza(com.google.android.gms.internal.fitness.zzhm zzhmVar) {
        return zzhmVar.zzch() == com.google.android.gms.internal.fitness.zzgg.zze.zzvt;
    }

    private static com.google.android.gms.internal.fitness.zzhl zzcb() {
        try {
            return (com.google.android.gms.internal.fitness.zzhl) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return zzxd;
        }
    }
}
