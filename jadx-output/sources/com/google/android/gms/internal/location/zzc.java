package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.google.android.gms.internal.location.zzc.class.getClassLoader();

    private zzc() {
    }

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zza(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void zza(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zza(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
