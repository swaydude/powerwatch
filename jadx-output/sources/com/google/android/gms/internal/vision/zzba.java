package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba {
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map;

    zzba(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map) {
        this.map = map;
    }

    @javax.annotation.Nullable
    public final java.lang.String zza(@javax.annotation.Nullable android.net.Uri uri, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.String str2, java.lang.String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.map.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            java.lang.String strValueOf = java.lang.String.valueOf(str2);
            java.lang.String strValueOf2 = java.lang.String.valueOf(str3);
            str3 = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf);
        }
        return map.get(str3);
    }
}
