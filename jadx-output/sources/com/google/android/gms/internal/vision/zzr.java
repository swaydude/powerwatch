package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr {
    public static boolean zza(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(context, str) > com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, "com.google.android.gms.vision.dynamite");
    }

    public static com.google.android.gms.dynamite.DynamiteModule zza(android.content.Context context, java.lang.String str, boolean z) {
        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy;
        java.lang.String str2 = java.lang.String.format("%s.%s", "com.google.android.gms.vision", str);
        if (!z) {
            str2 = "com.google.android.gms.vision.dynamite";
        }
        try {
            com.google.android.gms.vision.L.d("Loading module %s", str2);
            if (z) {
                versionPolicy = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE;
            } else {
                versionPolicy = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION;
            }
            return com.google.android.gms.dynamite.DynamiteModule.load(context, versionPolicy, str2);
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
            com.google.android.gms.vision.L.e(e, "Error loading module %s optional module %b", str2, java.lang.Boolean.valueOf(z));
            return null;
        }
    }
}
