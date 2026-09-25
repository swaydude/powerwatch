package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdd implements com.google.android.gms.internal.clearcut.zzeg {
    private static final com.google.android.gms.internal.clearcut.zzdn zzlz = new com.google.android.gms.internal.clearcut.zzde();
    private final com.google.android.gms.internal.clearcut.zzdn zzly;

    public zzdd() {
        this(new com.google.android.gms.internal.clearcut.zzdf(com.google.android.gms.internal.clearcut.zzcf.zzay(), zzby()));
    }

    private zzdd(com.google.android.gms.internal.clearcut.zzdn zzdnVar) {
        this.zzly = (com.google.android.gms.internal.clearcut.zzdn) com.google.android.gms.internal.clearcut.zzci.zza(zzdnVar, "messageInfoFactory");
    }

    private static boolean zza(com.google.android.gms.internal.clearcut.zzdm zzdmVar) {
        return zzdmVar.zzcf() == com.google.android.gms.internal.clearcut.zzcg.zzg.zzkl;
    }

    private static com.google.android.gms.internal.clearcut.zzdn zzby() {
        try {
            return (com.google.android.gms.internal.clearcut.zzdn) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return zzlz;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzeg
    public final <T> com.google.android.gms.internal.clearcut.zzef<T> zzd(java.lang.Class<T> cls) {
        com.google.android.gms.internal.clearcut.zzeh.zzf((java.lang.Class<?>) cls);
        com.google.android.gms.internal.clearcut.zzdm zzdmVarZzb = this.zzly.zzb(cls);
        if (zzdmVarZzb.zzcg()) {
            return com.google.android.gms.internal.clearcut.zzcg.class.isAssignableFrom(cls) ? com.google.android.gms.internal.clearcut.zzdu.zza(com.google.android.gms.internal.clearcut.zzeh.zzdo(), com.google.android.gms.internal.clearcut.zzbx.zzap(), zzdmVarZzb.zzch()) : com.google.android.gms.internal.clearcut.zzdu.zza(com.google.android.gms.internal.clearcut.zzeh.zzdm(), com.google.android.gms.internal.clearcut.zzbx.zzaq(), zzdmVarZzb.zzch());
        }
        if (!com.google.android.gms.internal.clearcut.zzcg.class.isAssignableFrom(cls)) {
            boolean zZza = zza(zzdmVarZzb);
            com.google.android.gms.internal.clearcut.zzdw zzdwVarZzcj = com.google.android.gms.internal.clearcut.zzdy.zzcj();
            com.google.android.gms.internal.clearcut.zzcy zzcyVarZzbv = com.google.android.gms.internal.clearcut.zzcy.zzbv();
            return zZza ? com.google.android.gms.internal.clearcut.zzds.zza(cls, zzdmVarZzb, zzdwVarZzcj, zzcyVarZzbv, com.google.android.gms.internal.clearcut.zzeh.zzdm(), com.google.android.gms.internal.clearcut.zzbx.zzaq(), com.google.android.gms.internal.clearcut.zzdl.zzcc()) : com.google.android.gms.internal.clearcut.zzds.zza(cls, zzdmVarZzb, zzdwVarZzcj, zzcyVarZzbv, com.google.android.gms.internal.clearcut.zzeh.zzdn(), (com.google.android.gms.internal.clearcut.zzbu<?>) null, com.google.android.gms.internal.clearcut.zzdl.zzcc());
        }
        boolean zZza2 = zza(zzdmVarZzb);
        com.google.android.gms.internal.clearcut.zzdw zzdwVarZzck = com.google.android.gms.internal.clearcut.zzdy.zzck();
        com.google.android.gms.internal.clearcut.zzcy zzcyVarZzbw = com.google.android.gms.internal.clearcut.zzcy.zzbw();
        com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVarZzdo = com.google.android.gms.internal.clearcut.zzeh.zzdo();
        return zZza2 ? com.google.android.gms.internal.clearcut.zzds.zza(cls, zzdmVarZzb, zzdwVarZzck, zzcyVarZzbw, zzexVarZzdo, com.google.android.gms.internal.clearcut.zzbx.zzap(), com.google.android.gms.internal.clearcut.zzdl.zzcd()) : com.google.android.gms.internal.clearcut.zzds.zza(cls, zzdmVarZzb, zzdwVarZzck, zzcyVarZzbw, zzexVarZzdo, (com.google.android.gms.internal.clearcut.zzbu<?>) null, com.google.android.gms.internal.clearcut.zzdl.zzcd());
    }
}
