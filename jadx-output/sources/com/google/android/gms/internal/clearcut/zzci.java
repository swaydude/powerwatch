package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    public static final byte[] zzkt;
    private static final java.nio.ByteBuffer zzku;
    private static final com.google.android.gms.internal.clearcut.zzbk zzkv;
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        zzkt = bArr;
        zzku = java.nio.ByteBuffer.wrap(bArr);
        zzkv = com.google.android.gms.internal.clearcut.zzbk.zza(bArr, 0, bArr.length, false);
    }

    static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int iZza = zza(length, bArr, 0, length);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static java.lang.Object zza(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.clearcut.zzdo) obj).zzbc().zza((com.google.android.gms.internal.clearcut.zzdo) obj2).zzbi();
    }

    static <T> T zza(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static int zzc(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zze(byte[] bArr) {
        return com.google.android.gms.internal.clearcut.zzff.zze(bArr);
    }

    public static java.lang.String zzf(byte[] bArr) {
        return new java.lang.String(bArr, UTF_8);
    }

    static boolean zzf(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        return false;
    }

    public static int zzl(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
