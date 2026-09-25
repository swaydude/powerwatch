package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zziu {
    public static java.lang.Object zza(java.lang.Object obj) {
        java.io.ObjectInputStream objectInputStream;
        java.io.ObjectOutputStream objectOutputStream;
        try {
            if (obj == null) {
                return null;
            }
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        java.lang.Object object = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return object;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                objectInputStream = null;
                objectOutputStream = null;
            }
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static java.lang.String zza(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        boolean zEquals;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
        int iMin = java.lang.Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            java.lang.String str2 = strArr[i];
            if (str == null && str2 == null) {
                zEquals = true;
            } else {
                zEquals = str == null ? false : str.equals(str2);
            }
            if (zEquals) {
                return strArr2[i];
            }
        }
        return null;
    }
}
