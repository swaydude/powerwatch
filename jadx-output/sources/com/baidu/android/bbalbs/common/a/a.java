package com.baidu.android.bbalbs.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static byte[] a(java.lang.String str, java.lang.String str2, byte[] bArr) throws java.lang.Exception {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes(), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }

    public static byte[] b(java.lang.String str, java.lang.String str2, byte[] bArr) throws java.lang.Exception {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes(), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }
}
