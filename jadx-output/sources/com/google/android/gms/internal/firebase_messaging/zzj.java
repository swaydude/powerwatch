package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    private static final java.io.OutputStream zza = new com.google.android.gms.internal.firebase_messaging.zzi();

    private static byte[] zza(java.util.Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArrRemoveFirst = deque.removeFirst();
            int iMin = java.lang.Math.min(i2, bArrRemoveFirst.length);
            java.lang.System.arraycopy(bArrRemoveFirst, 0, bArr, i - i2, iMin);
            i2 -= iMin;
        }
        return bArr;
    }

    public static byte[] zza(java.io.InputStream inputStream) throws java.io.IOException {
        com.google.android.gms.internal.firebase_messaging.zzg.zza(inputStream);
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
        int iZza = 8192;
        int i = 0;
        while (i < 2147483639) {
            int iMin = java.lang.Math.min(iZza, 2147483639 - i);
            byte[] bArr = new byte[iMin];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = inputStream.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    return zza(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            iZza = com.google.android.gms.internal.firebase_messaging.zzn.zza(iZza, 2);
        }
        if (inputStream.read() == -1) {
            return zza(arrayDeque, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static java.io.InputStream zza(java.io.InputStream inputStream, long j) {
        return new com.google.android.gms.internal.firebase_messaging.zzl(inputStream, 1048577L);
    }
}
