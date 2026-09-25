package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class zzs extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzr {
    public static com.google.android.gms.location.zzr zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzr ? (com.google.android.gms.location.zzr) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzt(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        throw new java.lang.NoSuchMethodError();
    }
}
