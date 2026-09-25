package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzi extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzh {
    public zzi() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzh = zzh(com.google.android.gms.internal.maps.zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zza(parcel2, iObjectWrapperZzh);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzi = zzi(com.google.android.gms.internal.maps.zzu.zzg(parcel.readStrongBinder()));
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zza(parcel2, iObjectWrapperZzi);
        }
        return true;
    }
}
