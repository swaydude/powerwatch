package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class c3 {

    private static class a {
        static final java.security.SecureRandom a = new java.security.SecureRandom();

        private a() {
        }
    }

    static long a(byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        long j = 0;
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            for (int i2 = i; i2 < i + 8; i2++) {
                j = (j << 8) | (((long) bArr[i2]) & 255);
            }
        } else {
            for (int i3 = i + 7; i3 >= i; i3--) {
                j = (j << 8) | (((long) bArr[i3]) & 255);
            }
        }
        return j;
    }

    public static java.util.UUID a(java.lang.String str) {
        return a(str.getBytes(java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8)));
    }

    public static java.util.UUID a(java.util.UUID uuid) {
        byte[] bArr = new byte[16];
        com.bugfender.sdk.c3.a.a.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE);
        return a(bArr);
    }

    public static java.util.UUID a(java.util.UUID uuid, java.lang.String str) {
        return a(uuid, str.getBytes(java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8)));
    }

    public static java.util.UUID a(java.util.UUID uuid, byte[] bArr) {
        java.util.Objects.requireNonNull(bArr, "name == null");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(io.fabric.sdk.android.services.common.CommonUtils.SHA1_INSTANCE);
            if (uuid == null) {
                messageDigest.update(new byte[16]);
            } else {
                long mostSignificantBits = uuid.getMostSignificantBits();
                java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
                messageDigest.update(a(mostSignificantBits, byteOrder));
                messageDigest.update(a(uuid.getLeastSignificantBits(), byteOrder));
            }
            return a(messageDigest.digest(bArr), 5);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static java.util.UUID a(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr, "name == null");
        try {
            return a(java.security.MessageDigest.getInstance(io.fabric.sdk.android.services.common.CommonUtils.SHA1_INSTANCE).digest(bArr), 5);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    static java.util.UUID a(byte[] bArr, int i) {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        long jA = a(bArr, 0, byteOrder);
        long jA2 = a(bArr, 8, byteOrder);
        return new java.util.UUID((((long) i) << 12) | (jA & (-61441)), (kotlin.time.DurationKt.MAX_MILLIS & jA2) | Long.MIN_VALUE);
    }

    static void a(long j, byte[] bArr, int i, java.nio.ByteOrder byteOrder) {
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            for (int i2 = i + 7; i2 >= i; i2--) {
                bArr[i2] = (byte) (j & 255);
                j >>= 8;
            }
            return;
        }
        for (int i3 = i; i3 < i + 8; i3++) {
            bArr[i3] = (byte) (j & 255);
            j >>= 8;
        }
    }

    static byte[] a(long j, java.nio.ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        a(j, bArr, 0, byteOrder);
        return bArr;
    }

    public static java.util.UUID b(java.util.UUID uuid) {
        return a(uuid, java.util.UUID.randomUUID().toString());
    }
}
