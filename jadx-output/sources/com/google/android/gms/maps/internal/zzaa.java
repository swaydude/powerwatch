package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzz {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            onIndoorBuildingFocused();
        } else {
            if (i != 2) {
                return false;
            }
            zza(com.google.android.gms.internal.maps.zzo.zze(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
