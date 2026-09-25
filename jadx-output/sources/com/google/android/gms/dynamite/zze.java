package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class zze implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zze() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb zza(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza zzaVar) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb zzbVar = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb();
        zzbVar.zzir = zzaVar.getLocalVersion(context, str);
        if (zzbVar.zzir != 0) {
            zzbVar.zzis = zzaVar.zza(context, str, false);
        } else {
            zzbVar.zzis = zzaVar.zza(context, str, true);
        }
        if (zzbVar.zzir == 0 && zzbVar.zzis == 0) {
            zzbVar.zzit = 0;
        } else if (zzbVar.zzir >= zzbVar.zzis) {
            zzbVar.zzit = -1;
        } else {
            zzbVar.zzit = 1;
        }
        return zzbVar;
    }
}
