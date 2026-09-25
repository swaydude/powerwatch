package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzah extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzaf {
    zzah(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaf
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        android.os.Parcel parcelZza2 = zza(1, parcelZza);
        com.google.android.gms.maps.model.Tile tile = (com.google.android.gms.maps.model.Tile) com.google.android.gms.internal.maps.zzc.zza(parcelZza2, com.google.android.gms.maps.model.Tile.CREATOR);
        parcelZza2.recycle();
        return tile;
    }
}
