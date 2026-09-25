package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends com.google.android.gms.internal.location.zza implements com.google.android.gms.location.zzu {
    zzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, locationAvailability);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationResult(com.google.android.gms.location.LocationResult locationResult) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, locationResult);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
