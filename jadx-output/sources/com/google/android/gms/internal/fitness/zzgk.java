package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgk {
    public static final byte[] zzvz;
    private static final java.nio.ByteBuffer zzwa;
    private static final com.google.android.gms.internal.fitness.zzfr zzwb;
    static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName("ISO-8859-1");

    public static int zzc(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzj(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    static <T> T zza(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean zzc(byte[] bArr) {
        return com.google.android.gms.internal.fitness.zzjc.zzc(bArr);
    }

    public static java.lang.String zzd(byte[] bArr) {
        return new java.lang.String(bArr, UTF_8);
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

    static boolean zzf(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        if (!(zzhoVar instanceof com.google.android.gms.internal.fitness.zzey)) {
            return false;
        }
        return false;
    }

    static java.lang.Object zzb(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.fitness.zzho) obj).zzbl().zza((com.google.android.gms.internal.fitness.zzho) obj2).zzbq();
    }

    static {
        byte[] bArr = new byte[0];
        zzvz = bArr;
        zzwa = java.nio.ByteBuffer.wrap(bArr);
        zzwb = com.google.android.gms.internal.fitness.zzfr.zza(bArr, 0, bArr.length, false);
    }
}
