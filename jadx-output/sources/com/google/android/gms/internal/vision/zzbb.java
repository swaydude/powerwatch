package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbb {
    private static final androidx.collection.ArrayMap<java.lang.String, android.net.Uri> zzfu = new androidx.collection.ArrayMap<>();

    public static synchronized android.net.Uri getContentProviderUri(java.lang.String str) {
        android.net.Uri uri;
        androidx.collection.ArrayMap<java.lang.String, android.net.Uri> arrayMap = zzfu;
        uri = arrayMap.get(str);
        if (uri == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(android.net.Uri.encode(str));
            uri = android.net.Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new java.lang.String("content://com.google.android.gms.phenotype/"));
            arrayMap.put(str, uri);
        }
        return uri;
    }
}
