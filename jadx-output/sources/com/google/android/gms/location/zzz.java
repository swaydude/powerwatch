package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzz extends com.google.android.gms.internal.location.zza implements com.google.android.gms.location.zzx {
    zzz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.zzx
    public final void onLocationChanged(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, location);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
