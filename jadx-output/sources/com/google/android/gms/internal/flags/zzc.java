package com.google.android.gms.internal.flags;

/* JADX INFO: loaded from: classes.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.google.android.gms.internal.flags.zzc.class.getClassLoader();

    private zzc() {
    }

    public static boolean zza(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void zza(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
