package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbt extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbs {
    public zzbt() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            onSnapshotReady((android.graphics.Bitmap) com.google.android.gms.internal.maps.zzc.zza(parcel, android.graphics.Bitmap.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
