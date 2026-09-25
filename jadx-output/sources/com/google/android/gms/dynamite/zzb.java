package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class zzb implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzb() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb zza(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza zzaVar) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb zzbVar = new com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb();
        zzbVar.zzis = zzaVar.zza(context, str, true);
        if (zzbVar.zzis != 0) {
            zzbVar.zzit = 1;
        } else {
            zzbVar.zzir = zzaVar.getLocalVersion(context, str);
            if (zzbVar.zzir != 0) {
                zzbVar.zzit = -1;
            }
        }
        return zzbVar;
    }
}
