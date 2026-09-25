package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzdk implements com.google.android.gms.internal.clearcut.zzdj {
    zzdk() {
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final int zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.clearcut.zzdi zzdiVar = (com.google.android.gms.internal.clearcut.zzdi) obj;
        if (zzdiVar.isEmpty()) {
            return 0;
        }
        java.util.Iterator it = zzdiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new java.lang.NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final java.lang.Object zzb(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.clearcut.zzdi zzdiVarZzca = (com.google.android.gms.internal.clearcut.zzdi) obj;
        com.google.android.gms.internal.clearcut.zzdi zzdiVar = (com.google.android.gms.internal.clearcut.zzdi) obj2;
        if (!zzdiVar.isEmpty()) {
            if (!zzdiVarZzca.isMutable()) {
                zzdiVarZzca = zzdiVarZzca.zzca();
            }
            zzdiVarZzca.zza(zzdiVar);
        }
        return zzdiVarZzca;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final java.util.Map<?, ?> zzg(java.lang.Object obj) {
        return (com.google.android.gms.internal.clearcut.zzdi) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final java.util.Map<?, ?> zzh(java.lang.Object obj) {
        return (com.google.android.gms.internal.clearcut.zzdi) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final boolean zzi(java.lang.Object obj) {
        return !((com.google.android.gms.internal.clearcut.zzdi) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final java.lang.Object zzj(java.lang.Object obj) {
        ((com.google.android.gms.internal.clearcut.zzdi) obj).zzv();
        return obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final java.lang.Object zzk(java.lang.Object obj) {
        return com.google.android.gms.internal.clearcut.zzdi.zzbz().zzca();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final com.google.android.gms.internal.clearcut.zzdh<?, ?> zzl(java.lang.Object obj) {
        throw new java.lang.NoSuchMethodError();
    }
}
