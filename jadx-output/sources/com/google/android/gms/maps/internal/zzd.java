package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzd extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzc {
    public zzd() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            onFinish();
        } else {
            if (i != 2) {
                return false;
            }
            onCancel();
        }
        parcel2.writeNoException();
        return true;
    }
}
