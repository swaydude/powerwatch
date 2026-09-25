package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzy extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzx {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static com.google.android.gms.location.zzx zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.location.zzx ? (com.google.android.gms.location.zzx) iInterfaceQueryLocalInterface : new com.google.android.gms.location.zzz(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        onLocationChanged((android.location.Location) com.google.android.gms.internal.location.zzc.zza(parcel, android.location.Location.CREATOR));
        return true;
    }
}
