package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends com.google.android.gms.internal.ads_identifier.zza implements com.google.android.gms.internal.ads_identifier.zze {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.AdvertisingInterface.ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final java.lang.String getId() throws android.os.RemoteException {
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        java.lang.String string = parcelTransactAndReadException.readString();
        parcelTransactAndReadException.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final boolean zzb(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.ads_identifier.zzc.zza(parcelObtainAndWriteInterfaceToken, true);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        boolean zZza = com.google.android.gms.internal.ads_identifier.zzc.zza(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final boolean zzc() throws android.os.RemoteException {
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        boolean zZza = com.google.android.gms.internal.ads_identifier.zzc.zza(parcelTransactAndReadException);
        parcelTransactAndReadException.recycle();
        return zZza;
    }
}
