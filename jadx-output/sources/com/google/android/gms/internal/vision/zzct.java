package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzct {
    public static void checkArgument(boolean z, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    @org.checkerframework.checker.nullness.compatqual.NonNullDecl
    public static <T> T checkNotNull(@org.checkerframework.checker.nullness.compatqual.NonNullDecl T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static int zzc(int i, int i2) {
        java.lang.String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = com.google.android.gms.internal.vision.zzcv.zza("%s (%s) must not be negative", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            strZza = com.google.android.gms.internal.vision.zzcv.zza("%s (%s) must be less than size (%s)", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(strZza);
    }

    public static int zzd(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(zza(i, i2, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    private static java.lang.String zza(int i, int i2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str) {
        if (i < 0) {
            return com.google.android.gms.internal.vision.zzcv.zza("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.gms.internal.vision.zzcv.zza("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static void zza(int i, int i2, int i3) {
        java.lang.String strZza;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZza = zza(i, i3, "start index");
            } else {
                strZza = (i2 < 0 || i2 > i3) ? zza(i2, i3, "end index") : com.google.android.gms.internal.vision.zzcv.zza("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
            }
            throw new java.lang.IndexOutOfBoundsException(strZza);
        }
    }
}
