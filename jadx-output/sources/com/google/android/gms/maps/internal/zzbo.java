package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbo extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbn {
    public zzbo() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        onStreetViewPanoramaLongClick((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
