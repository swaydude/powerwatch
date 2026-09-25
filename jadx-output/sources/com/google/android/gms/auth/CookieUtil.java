package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    private static boolean zza(java.lang.Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static java.lang.String getCookieUrl(java.lang.String str, java.lang.Boolean bool) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.lang.String str2 = zza(bool) ? "https" : "http";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 3 + java.lang.String.valueOf(str).length());
        sb.append(str2);
        sb.append("://");
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String getCookieValue(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append('=');
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (zza(bool)) {
            sb.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb.append(";Secure");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        return sb.toString();
    }
}
