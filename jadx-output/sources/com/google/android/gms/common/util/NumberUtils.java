package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class NumberUtils {
    public static long parseHexLong(java.lang.String str) {
        if (str.length() <= 16) {
            if (str.length() != 16) {
                return java.lang.Long.parseLong(str, 16);
            }
            return (java.lang.Long.parseLong(str.substring(0, 8), 16) << 32) | java.lang.Long.parseLong(str.substring(8), 16);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 37);
        sb.append("Invalid input: ");
        sb.append(str);
        sb.append(" exceeds 16 characters");
        throw new java.lang.NumberFormatException(sb.toString());
    }

    private NumberUtils() {
    }
}
