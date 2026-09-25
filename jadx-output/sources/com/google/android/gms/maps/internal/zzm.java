package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzl {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        onCameraChange((com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
