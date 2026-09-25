package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgb implements com.google.android.gms.internal.measurement.zzhg {
    private static final com.google.android.gms.internal.measurement.zzgl zzb = new com.google.android.gms.internal.measurement.zzge();
    private final com.google.android.gms.internal.measurement.zzgl zza;

    public zzgb() {
        this(new com.google.android.gms.internal.measurement.zzgd(com.google.android.gms.internal.measurement.zzfe.zza(), zza()));
    }

    private zzgb(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        this.zza = (com.google.android.gms.internal.measurement.zzgl) com.google.android.gms.internal.measurement.zzff.zza(zzglVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final <T> com.google.android.gms.internal.measurement.zzhd<T> zza(java.lang.Class<T> cls) {
        com.google.android.gms.internal.measurement.zzhf.zza((java.lang.Class<?>) cls);
        com.google.android.gms.internal.measurement.zzgm zzgmVarZzb = this.zza.zzb(cls);
        if (zzgmVarZzb.zzb()) {
            if (com.google.android.gms.internal.measurement.zzfd.class.isAssignableFrom(cls)) {
                return com.google.android.gms.internal.measurement.zzgu.zza(com.google.android.gms.internal.measurement.zzhf.zzc(), com.google.android.gms.internal.measurement.zzet.zza(), zzgmVarZzb.zzc());
            }
            return com.google.android.gms.internal.measurement.zzgu.zza(com.google.android.gms.internal.measurement.zzhf.zza(), com.google.android.gms.internal.measurement.zzet.zzb(), zzgmVarZzb.zzc());
        }
        if (com.google.android.gms.internal.measurement.zzfd.class.isAssignableFrom(cls)) {
            if (zza(zzgmVarZzb)) {
                return com.google.android.gms.internal.measurement.zzgs.zza(cls, zzgmVarZzb, com.google.android.gms.internal.measurement.zzgy.zzb(), com.google.android.gms.internal.measurement.zzfy.zzb(), com.google.android.gms.internal.measurement.zzhf.zzc(), com.google.android.gms.internal.measurement.zzet.zza(), com.google.android.gms.internal.measurement.zzgj.zzb());
            }
            return com.google.android.gms.internal.measurement.zzgs.zza(cls, zzgmVarZzb, com.google.android.gms.internal.measurement.zzgy.zzb(), com.google.android.gms.internal.measurement.zzfy.zzb(), com.google.android.gms.internal.measurement.zzhf.zzc(), (com.google.android.gms.internal.measurement.zzes<?>) null, com.google.android.gms.internal.measurement.zzgj.zzb());
        }
        if (zza(zzgmVarZzb)) {
            return com.google.android.gms.internal.measurement.zzgs.zza(cls, zzgmVarZzb, com.google.android.gms.internal.measurement.zzgy.zza(), com.google.android.gms.internal.measurement.zzfy.zza(), com.google.android.gms.internal.measurement.zzhf.zza(), com.google.android.gms.internal.measurement.zzet.zzb(), com.google.android.gms.internal.measurement.zzgj.zza());
        }
        return com.google.android.gms.internal.measurement.zzgs.zza(cls, zzgmVarZzb, com.google.android.gms.internal.measurement.zzgy.zza(), com.google.android.gms.internal.measurement.zzfy.zza(), com.google.android.gms.internal.measurement.zzhf.zzb(), (com.google.android.gms.internal.measurement.zzes<?>) null, com.google.android.gms.internal.measurement.zzgj.zza());
    }

    private static boolean zza(com.google.android.gms.internal.measurement.zzgm zzgmVar) {
        return zzgmVar.zza() == com.google.android.gms.internal.measurement.zzfd.zze.zzh;
    }

    private static com.google.android.gms.internal.measurement.zzgl zza() {
        try {
            return (com.google.android.gms.internal.measurement.zzgl) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return zzb;
        }
    }
}
