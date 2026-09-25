package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzfa {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[com.google.android.gms.internal.measurement.zzfq.values().length];
        zzb = iArr;
        try {
            iArr[com.google.android.gms.internal.measurement.zzfq.BYTE_STRING.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            zzb[com.google.android.gms.internal.measurement.zzfq.MESSAGE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            zzb[com.google.android.gms.internal.measurement.zzfq.STRING.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[com.google.android.gms.internal.measurement.zzez.values().length];
        zza = iArr2;
        try {
            iArr2[com.google.android.gms.internal.measurement.zzez.MAP.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            zza[com.google.android.gms.internal.measurement.zzez.VECTOR.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            zza[com.google.android.gms.internal.measurement.zzez.SCALAR.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
