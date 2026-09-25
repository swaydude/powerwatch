package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(@javax.annotation.Nullable java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static void closeQuietly(@javax.annotation.Nullable android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & kotlin.UByte.MAX_VALUE) << 8) | (bArr[0] & kotlin.UByte.MAX_VALUE)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        return zza(inputStream, outputStream, false);
    }

    @java.lang.Deprecated
    private static long zza(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z) throws java.io.IOException {
        return copyStream(inputStream, outputStream, z, 1024);
    }

    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    break;
                }
                j += (long) i2;
                outputStream.write(bArr, 0, i2);
            } catch (java.lang.Throwable th) {
                if (z) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream) throws java.io.IOException {
        return readInputStreamFully(inputStream, true);
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream, boolean z) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        zza(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
