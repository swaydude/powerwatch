package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaq extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzap {
    public zzaq() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IGoogleMapDelegate zzgVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzgVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate) {
                zzgVar = (com.google.android.gms.maps.internal.IGoogleMapDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzgVar = new com.google.android.gms.maps.internal.zzg(strongBinder);
            }
        }
        zza(zzgVar);
        parcel2.writeNoException();
        return true;
    }
}
