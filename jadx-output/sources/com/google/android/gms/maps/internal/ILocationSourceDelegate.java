package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public interface ILocationSourceDelegate extends android.os.IInterface {
    void activate(com.google.android.gms.maps.internal.zzah zzahVar) throws android.os.RemoteException;

    void deactivate() throws android.os.RemoteException;

    public static abstract class zza extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.ILocationSourceDelegate {
        public zza() {
            super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        }

        @Override // com.google.android.gms.internal.maps.zzb
        protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            com.google.android.gms.maps.internal.zzah zzaiVar;
            if (i == 1) {
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzaiVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.zzah) {
                        zzaiVar = (com.google.android.gms.maps.internal.zzah) iInterfaceQueryLocalInterface;
                    } else {
                        zzaiVar = new com.google.android.gms.maps.internal.zzai(strongBinder);
                    }
                }
                activate(zzaiVar);
            } else {
                if (i != 2) {
                    return false;
                }
                deactivate();
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
