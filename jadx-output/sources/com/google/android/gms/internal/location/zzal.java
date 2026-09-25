package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzal extends com.google.android.gms.internal.location.zza implements com.google.android.gms.internal.location.zzaj {
    zzal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzaj
    public final void zza(com.google.android.gms.internal.location.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzadVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
