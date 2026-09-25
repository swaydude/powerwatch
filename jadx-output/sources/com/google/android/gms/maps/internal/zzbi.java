package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbi extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbh {
    public zzbi() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        onStreetViewPanoramaCameraChange((com.google.android.gms.maps.model.StreetViewPanoramaCamera) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
