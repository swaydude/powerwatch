package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: loaded from: classes.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.google.android.gms.internal.ads_identifier.zzc.class.getClassLoader();

    private zzc() {
    }

    public static void zza(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean zza(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
