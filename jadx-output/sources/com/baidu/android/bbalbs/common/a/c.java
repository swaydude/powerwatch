package com.baidu.android.bbalbs.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static java.lang.String a(byte[] bArr, java.lang.String str, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & kotlin.UByte.MAX_VALUE);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static java.lang.String a(byte[] bArr, boolean z) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
