package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbq extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbp {
    public zzbq() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate zzbuVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbuVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) {
                zzbuVar = (com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbuVar = new com.google.android.gms.maps.internal.zzbu(strongBinder);
            }
        }
        zza(zzbuVar);
        parcel2.writeNoException();
        return true;
    }
}
