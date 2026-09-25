package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
final class zza implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza {
    zza() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
    public final int zza(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        return com.google.android.gms.dynamite.DynamiteModule.zza(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
    public final int getLocalVersion(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, str);
    }
}
