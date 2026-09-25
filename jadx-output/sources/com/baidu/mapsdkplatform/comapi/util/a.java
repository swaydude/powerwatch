package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: com.baidu.mapsdkplatform.comapi.util.a$a, reason: collision with other inner class name */
    static class C0012a {
        public static java.lang.String a(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
            for (int i = 0; i < bArr.length; i++) {
                sb.append(cArr[(bArr[i] & 240) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
            }
            return sb.toString();
        }
    }

    public static java.lang.String a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String strA;
        try {
            strA = a((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            strA = "";
        } catch (java.security.cert.CertificateException e2) {
            e2.printStackTrace();
            strA = "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < strA.length(); i++) {
            stringBuffer.append(strA.charAt(i));
            if (i > 0 && i % 2 == 1 && i < strA.length() - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    static java.lang.String a(java.security.cert.X509Certificate x509Certificate) {
        try {
            return com.baidu.mapsdkplatform.comapi.util.a.C0012a.a(a(x509Certificate.getEncoded()));
        } catch (java.security.cert.CertificateEncodingException unused) {
            return null;
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return java.security.MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
