package com.google.android.datatransport.cct;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    static java.lang.String zza(java.lang.String str, java.lang.String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new java.lang.IllegalArgumentException("Invalid input received");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
