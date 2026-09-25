package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzv extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzu {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static com.google.android.gms.location.zzu zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzu ? (com.google.android.gms.location.zzu) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzw(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            onLocationResult((com.google.android.gms.location.LocationResult) com.google.android.gms.internal.location.zzc.zza(parcel, com.google.android.gms.location.LocationResult.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            onLocationAvailability((com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(parcel, com.google.android.gms.location.LocationAvailability.CREATOR));
        }
        return true;
    }
}
