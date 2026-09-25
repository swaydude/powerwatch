package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhp implements com.google.android.gms.internal.vision.zziu {
    private static final com.google.android.gms.internal.vision.zzhz zzyi = new com.google.android.gms.internal.vision.zzhs();
    private final com.google.android.gms.internal.vision.zzhz zzyh;

    public zzhp() {
        this(new com.google.android.gms.internal.vision.zzhr(com.google.android.gms.internal.vision.zzgq.zzfw(), zzhb()));
    }

    private zzhp(com.google.android.gms.internal.vision.zzhz zzhzVar) {
        this.zzyh = (com.google.android.gms.internal.vision.zzhz) com.google.android.gms.internal.vision.zzgt.zza(zzhzVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.vision.zziu
    public final <T> com.google.android.gms.internal.vision.zzir<T> zze(java.lang.Class<T> cls) {
        com.google.android.gms.internal.vision.zzit.zzg(cls);
        com.google.android.gms.internal.vision.zzia zziaVarZzb = this.zzyh.zzb(cls);
        if (zziaVarZzb.zzhj()) {
            if (com.google.android.gms.internal.vision.zzgs.class.isAssignableFrom(cls)) {
                return com.google.android.gms.internal.vision.zzii.zza(com.google.android.gms.internal.vision.zzit.zzhu(), com.google.android.gms.internal.vision.zzgj.zzfq(), zziaVarZzb.zzhk());
            }
            return com.google.android.gms.internal.vision.zzii.zza(com.google.android.gms.internal.vision.zzit.zzhs(), com.google.android.gms.internal.vision.zzgj.zzfr(), zziaVarZzb.zzhk());
        }
        if (com.google.android.gms.internal.vision.zzgs.class.isAssignableFrom(cls)) {
            if (zza(zziaVarZzb)) {
                return com.google.android.gms.internal.vision.zzig.zza(cls, zziaVarZzb, com.google.android.gms.internal.vision.zzim.zzhm(), com.google.android.gms.internal.vision.zzhm.zzha(), com.google.android.gms.internal.vision.zzit.zzhu(), com.google.android.gms.internal.vision.zzgj.zzfq(), com.google.android.gms.internal.vision.zzhx.zzhg());
            }
            return com.google.android.gms.internal.vision.zzig.zza(cls, zziaVarZzb, com.google.android.gms.internal.vision.zzim.zzhm(), com.google.android.gms.internal.vision.zzhm.zzha(), com.google.android.gms.internal.vision.zzit.zzhu(), (com.google.android.gms.internal.vision.zzgf<?>) null, com.google.android.gms.internal.vision.zzhx.zzhg());
        }
        if (zza(zziaVarZzb)) {
            return com.google.android.gms.internal.vision.zzig.zza(cls, zziaVarZzb, com.google.android.gms.internal.vision.zzim.zzhl(), com.google.android.gms.internal.vision.zzhm.zzgz(), com.google.android.gms.internal.vision.zzit.zzhs(), com.google.android.gms.internal.vision.zzgj.zzfr(), com.google.android.gms.internal.vision.zzhx.zzhf());
        }
        return com.google.android.gms.internal.vision.zzig.zza(cls, zziaVarZzb, com.google.android.gms.internal.vision.zzim.zzhl(), com.google.android.gms.internal.vision.zzhm.zzgz(), com.google.android.gms.internal.vision.zzit.zzht(), (com.google.android.gms.internal.vision.zzgf<?>) null, com.google.android.gms.internal.vision.zzhx.zzhf());
    }

    private static boolean zza(com.google.android.gms.internal.vision.zzia zziaVar) {
        return zziaVar.zzhi() == com.google.android.gms.internal.vision.zzgs.zzf.zzwt;
    }

    private static com.google.android.gms.internal.vision.zzhz zzhb() {
        try {
            return (com.google.android.gms.internal.vision.zzhz) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return zzyi;
        }
    }
}
