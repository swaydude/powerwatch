package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends com.google.android.gms.internal.clearcut.zza implements com.google.android.gms.internal.clearcut.zzn {
    zzo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // com.google.android.gms.internal.clearcut.zzn
    public final void zza(com.google.android.gms.internal.clearcut.zzl zzlVar, com.google.android.gms.clearcut.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.clearcut.zzc.zza(parcelObtainAndWriteInterfaceToken, zzlVar);
        com.google.android.gms.internal.clearcut.zzc.zza(parcelObtainAndWriteInterfaceToken, zzeVar);
        transactOneway(1, parcelObtainAndWriteInterfaceToken);
    }
}
