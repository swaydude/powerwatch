package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static java.lang.String a(java.lang.String str) {
        try {
            return com.bugfender.sdk.m.a(b(str)).substring(0, 10);
        } catch (java.security.NoSuchAlgorithmException e) {
            com.bugfender.sdk.d1.a(e);
            return "";
        }
    }

    private static byte[] b(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        return java.security.MessageDigest.getInstance(io.fabric.sdk.android.services.common.CommonUtils.SHA256_INSTANCE).digest(str.getBytes(com.bugfender.sdk.t2.a));
    }
}
