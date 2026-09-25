package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhy implements com.google.android.gms.internal.vision.zzhv {
    zzhy() {
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final java.util.Map<?, ?> zzk(java.lang.Object obj) {
        return (com.google.android.gms.internal.vision.zzhw) obj;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final com.google.android.gms.internal.vision.zzht<?, ?> zzp(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final java.util.Map<?, ?> zzl(java.lang.Object obj) {
        return (com.google.android.gms.internal.vision.zzhw) obj;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final boolean zzm(java.lang.Object obj) {
        return !((com.google.android.gms.internal.vision.zzhw) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final java.lang.Object zzn(java.lang.Object obj) {
        ((com.google.android.gms.internal.vision.zzhw) obj).zzdp();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final java.lang.Object zzo(java.lang.Object obj) {
        return com.google.android.gms.internal.vision.zzhw.zzhc().zzhd();
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final java.lang.Object zzc(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.vision.zzhw zzhwVarZzhd = (com.google.android.gms.internal.vision.zzhw) obj;
        com.google.android.gms.internal.vision.zzhw zzhwVar = (com.google.android.gms.internal.vision.zzhw) obj2;
        if (!zzhwVar.isEmpty()) {
            if (!zzhwVarZzhd.isMutable()) {
                zzhwVarZzhd = zzhwVarZzhd.zzhd();
            }
            zzhwVarZzhd.zza(zzhwVar);
        }
        return zzhwVarZzhd;
    }

    @Override // com.google.android.gms.internal.vision.zzhv
    public final int zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.vision.zzhw zzhwVar = (com.google.android.gms.internal.vision.zzhw) obj;
        if (zzhwVar.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = zzhwVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }
}
