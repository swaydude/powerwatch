package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class b {

    static class a {
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

    static java.lang.String a() {
        return java.util.Locale.getDefault().getLanguage();
    }

    protected static java.lang.String a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    private static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String strA;
        try {
            strA = a((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())));
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.cert.CertificateException unused) {
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
            return com.baidu.lbsapi.auth.b.a.a(a(x509Certificate.getEncoded()));
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

    protected static java.lang.String[] b(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        java.lang.String[] strArrB = b(context, packageName);
        if (strArrB == null || strArrB.length <= 0) {
            return null;
        }
        int length = strArrB.length;
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = strArrB[i] + ";" + packageName;
            if (com.baidu.lbsapi.auth.a.a) {
                com.baidu.lbsapi.auth.a.a("mcode" + strArr[i]);
            }
        }
        return strArr;
    }

    private static java.lang.String[] b(android.content.Context context, java.lang.String str) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2 = null;
        try {
            android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                strArr = null;
            } else {
                strArr = new java.lang.String[signatureArr.length];
                for (int i = 0; i < signatureArr.length; i++) {
                    try {
                        strArr[i] = a((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(signatureArr[i].toByteArray())));
                    } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.cert.CertificateException unused) {
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.cert.CertificateException unused2) {
        }
        if (strArr != null && strArr.length > 0) {
            strArr2 = new java.lang.String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                for (int i3 = 0; i3 < strArr[i2].length(); i3++) {
                    stringBuffer.append(strArr[i2].charAt(i3));
                    if (i3 > 0 && i3 % 2 == 1 && i3 < strArr[i2].length() - 1) {
                        stringBuffer.append(":");
                    }
                }
                strArr2[i2] = stringBuffer.toString();
            }
        }
        return strArr2;
    }
}
