package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzff {
    public static final byte[] zzb;
    private static final java.nio.ByteBuffer zzd;
    private static final com.google.android.gms.internal.measurement.zzeg zze;
    static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private static final java.nio.charset.Charset zzc = java.nio.charset.Charset.forName("ISO-8859-1");

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T zza(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    static <T> T zza(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean zza(byte[] bArr) {
        return com.google.android.gms.internal.measurement.zzie.zza(bArr);
    }

    public static java.lang.String zzb(byte[] bArr) {
        return new java.lang.String(bArr, zza);
    }

    public static int zzc(byte[] bArr) {
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

    static boolean zza(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        if (!(zzgoVar instanceof com.google.android.gms.internal.measurement.zzdm)) {
            return false;
        }
        return false;
    }

    static java.lang.Object zza(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.measurement.zzgo) obj).zzbr().zza((com.google.android.gms.internal.measurement.zzgo) obj2).zzt();
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzd = java.nio.ByteBuffer.wrap(bArr);
        zze = com.google.android.gms.internal.measurement.zzeg.zza(bArr, 0, bArr.length, false);
    }
}
