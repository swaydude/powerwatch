package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzak extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzaj {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        onMapClick((com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
