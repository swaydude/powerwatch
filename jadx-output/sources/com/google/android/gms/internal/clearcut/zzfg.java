package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
abstract class zzfg {
    zzfg() {
    }

    static void zzc(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (java.lang.IndexOutOfBoundsException unused) {
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i2;
                } catch (java.lang.IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i3);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                int i4 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    iPosition = i4 + 1;
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i4 = iPosition + 1;
                                    byteBuffer.put(iPosition, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                    iPosition = i4;
                                    i = i3;
                                } catch (java.lang.IndexOutOfBoundsException unused3) {
                                    iPosition = i4;
                                }
                            } else {
                                i = i3;
                            }
                        } catch (java.lang.IndexOutOfBoundsException unused4) {
                        }
                        i = i3;
                        int iPosition2 = byteBuffer.position() + java.lang.Math.max(i, (iPosition - byteBuffer.position()) + 1);
                        char cCharAt4 = charSequence.charAt(i);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(cCharAt4);
                        sb.append(" at index ");
                        sb.append(iPosition2);
                        throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    throw new com.google.android.gms.internal.clearcut.zzfi(i, length);
                }
                int i5 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition = i5 + 1;
                byteBuffer.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    abstract int zzb(int i, byte[] bArr, int i2, int i3);

    abstract int zzb(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2);

    abstract void zzb(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer);

    final boolean zze(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }
}
