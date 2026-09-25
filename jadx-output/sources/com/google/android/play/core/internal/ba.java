package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ba {
    private final com.google.android.play.core.splitcompat.c a;
    private final com.google.android.play.core.internal.ag b;
    private final android.content.Context c;

    public ba(android.content.Context context, com.google.android.play.core.splitcompat.c cVar, com.google.android.play.core.internal.ag agVar) {
        this.a = cVar;
        this.b = agVar;
        this.c = context;
    }

    public static <T> com.google.android.play.core.internal.ax<T> a(java.lang.Object obj, java.lang.String str, java.lang.Class<T> cls) {
        return new com.google.android.play.core.internal.ax<>(obj, a(obj, str), cls);
    }

    public static <R, P0> R a(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<R> cls2, java.lang.Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(a(cls, str, (java.lang.Class<?>[]) new java.lang.Class[]{cls3}).invoke(null, p0));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to invoke static method %s on type %s", str, cls), e);
        }
    }

    public static <R, P0, P1> R a(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<R> cls2, java.lang.Class<P0> cls3, P0 p0, java.lang.Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(a(cls, str, (java.lang.Class<?>[]) new java.lang.Class[]{cls3, cls4}).invoke(null, p0, p1));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to invoke static method %s on type %s", str, cls), e);
        }
    }

    public static <R, P0> R a(java.lang.Object obj, java.lang.String str, java.lang.Class<R> cls, java.lang.Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(a(obj, str, (java.lang.Class<?>[]) new java.lang.Class[]{cls2}).invoke(obj, p0));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static <R, P0, P1, P2> R a(java.lang.Object obj, java.lang.String str, java.lang.Class<R> cls, java.lang.Class<P0> cls2, P0 p0, java.lang.Class<P1> cls3, P1 p1, java.lang.Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(a(obj, str, (java.lang.Class<?>[]) new java.lang.Class[]{cls2, cls3, cls4}).invoke(obj, p0, p1, p2));
        } catch (java.lang.Exception e) {
            throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    private static java.lang.reflect.Field a(java.lang.Object obj, java.lang.String str) {
        for (java.lang.Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        throw new com.google.android.play.core.internal.az(java.lang.String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    private static java.lang.reflect.Method a(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        for (java.lang.Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                java.lang.reflect.Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        throw new com.google.android.play.core.internal.az(java.lang.String.format("Could not find a method named %s with parameters %s in type %s", str, java.util.Arrays.asList(clsArr), cls));
    }

    private static java.lang.reflect.Method a(java.lang.Object obj, java.lang.String str, java.lang.Class<?>... clsArr) {
        return a(obj.getClass(), str, clsArr);
    }

    private static java.security.cert.X509Certificate a(android.content.pm.Signature signature) {
        try {
            return (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()));
        } catch (java.security.cert.CertificateException e) {
            android.util.Log.e("SplitCompat", "Cannot decode certificate.", e);
            return null;
        }
    }

    private boolean a(java.lang.String str, java.util.List<java.security.cert.X509Certificate> list) {
        try {
            java.security.cert.X509Certificate[][] x509CertificateArrA = com.google.android.play.core.internal.ag.a(str);
            if (x509CertificateArrA != null && x509CertificateArrA.length != 0 && x509CertificateArrA[0].length != 0) {
                return a(x509CertificateArrA, list);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32);
            sb.append("Downloaded split ");
            sb.append(str);
            sb.append(" is not signed.");
            android.util.Log.e("SplitCompat", sb.toString());
            return false;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32);
            sb2.append("Downloaded split ");
            sb2.append(str);
            sb2.append(" is not signed.");
            android.util.Log.e("SplitCompat", sb2.toString(), e);
            return false;
        }
    }

    private static boolean a(java.security.cert.X509Certificate[][] x509CertificateArr, java.util.List<java.security.cert.X509Certificate> list) {
        boolean z;
        if (list.isEmpty()) {
            android.util.Log.e("SplitCompat", "No certificates found for app.");
            return false;
        }
        java.util.Iterator<java.security.cert.X509Certificate> it = list.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            java.security.cert.X509Certificate next = it.next();
            int length = x509CertificateArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (x509CertificateArr[i][0].equals(next)) {
                    break;
                }
                i++;
            }
        } while (z);
        android.util.Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
        return false;
    }

    public static <T> com.google.android.play.core.internal.ax b(java.lang.Object obj, java.lang.String str, java.lang.Class<T> cls) {
        return new com.google.android.play.core.internal.ax(obj, a(obj, str), cls, (byte) 0);
    }

    private java.util.List<java.security.cert.X509Certificate> b() {
        android.content.pm.Signature[] signatureArrC = c();
        if (signatureArrC == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArrC) {
            java.security.cert.X509Certificate x509CertificateA = a(signature);
            if (x509CertificateA != null) {
                arrayList.add(x509CertificateA);
            }
        }
        return arrayList;
    }

    private android.content.pm.Signature[] c() {
        try {
            return this.c.getPackageManager().getPackageInfo(this.c.getPackageName(), 64).signatures;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean a() {
        try {
            java.io.File fileC = this.a.c();
            java.util.List<java.security.cert.X509Certificate> listB = b();
            if (listB == null || listB.isEmpty()) {
                android.util.Log.e("SplitCompat", "No app certificates found.");
                return false;
            }
            java.io.File[] fileArrListFiles = fileC.listFiles();
            java.util.Arrays.sort(fileArrListFiles);
            for (int length = fileArrListFiles.length - 1; length >= 0; length--) {
                java.io.File file = fileArrListFiles[length];
                try {
                    if (!a(file.getAbsolutePath(), listB)) {
                        android.util.Log.e("SplitCompat", "Split verification failure.");
                        return false;
                    }
                    try {
                        file.renameTo(this.a.a(file));
                    } catch (java.io.IOException e) {
                        android.util.Log.e("SplitCompat", "Cannot write verified split.", e);
                        return false;
                    }
                } catch (java.lang.Exception e2) {
                    android.util.Log.e("SplitCompat", "Split verification error.", e2);
                    return false;
                }
            }
            return true;
        } catch (java.io.IOException e3) {
            android.util.Log.e("SplitCompat", "Cannot access directory for unverified splits.", e3);
            return false;
        }
    }

    public boolean a(java.util.List<android.content.Intent> list) throws java.io.IOException {
        java.util.Iterator<android.content.Intent> it = list.iterator();
        while (it.hasNext()) {
            if (!this.a.b(it.next().getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
