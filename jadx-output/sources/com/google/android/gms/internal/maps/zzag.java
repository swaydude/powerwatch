package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzag extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.internal.maps.zzaf {
    public zzag() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static com.google.android.gms.internal.maps.zzaf zzk(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.maps.zzaf) {
            return (com.google.android.gms.internal.maps.zzaf) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.maps.zzah(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.Tile tile = getTile(parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzb(parcel2, tile);
        return true;
    }
}
