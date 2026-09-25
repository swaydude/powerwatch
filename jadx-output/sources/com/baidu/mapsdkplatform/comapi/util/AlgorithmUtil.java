package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public final class AlgorithmUtil {
    private AlgorithmUtil() {
    }

    private static byte[] a(java.lang.String str, java.lang.String str2, byte[] bArr) throws java.lang.Exception {
        if (str2 == null) {
            return null;
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes(), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(str.getBytes()));
        int length = bArr.length;
        while (length % 16 != 0) {
            length++;
        }
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            if (i < bArr.length) {
                bArr2[i] = bArr[i];
            } else {
                bArr2[i] = 0;
            }
        }
        return cipher.doFinal(bArr2);
    }

    private static byte[] b(java.lang.String str, java.lang.String str2, byte[] bArr) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes("ASCII"), "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/NoPadding");
        cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(str.getBytes()));
        return cipher.doFinal(bArr);
    }

    public static byte[] getUrlNeedInfo(java.lang.String str, java.lang.String str2, byte[] bArr) throws java.lang.Exception {
        return b(str, str2, bArr);
    }

    public static byte[] setUrlNeedInfo(java.lang.String str, java.lang.String str2, byte[] bArr) throws java.lang.Exception {
        return a(str, str2, bArr);
    }
}
