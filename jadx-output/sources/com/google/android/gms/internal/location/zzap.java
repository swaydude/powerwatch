package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzap extends com.google.android.gms.internal.location.zza implements com.google.android.gms.internal.location.zzao {
    zzap(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final android.location.Location zza(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(21, parcelObtainAndWriteInterfaceToken);
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.location.zzc.zza(parcelTransactAndReadException, android.location.Location.CREATOR);
        parcelTransactAndReadException.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeLong(j);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, true);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(5, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, pendingIntent);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, iStatusCallback);
        transactAndReadExceptionReturnVoid(73, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, location);
        transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzajVar);
        transactAndReadExceptionReturnVoid(67, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.internal.location.zzbf zzbfVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzbfVar);
        transactAndReadExceptionReturnVoid(59, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.internal.location.zzo zzoVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzoVar);
        transactAndReadExceptionReturnVoid(75, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, activityTransitionRequest);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, pendingIntent);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, iStatusCallback);
        transactAndReadExceptionReturnVoid(72, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzam zzamVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, geofencingRequest);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, pendingIntent);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzamVar);
        transactAndReadExceptionReturnVoid(57, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzaq zzaqVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, locationSettingsRequest);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzaqVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(63, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(com.google.android.gms.location.zzal zzalVar, com.google.android.gms.internal.location.zzam zzamVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzalVar);
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, zzamVar);
        transactAndReadExceptionReturnVoid(74, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final com.google.android.gms.location.LocationAvailability zzb(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(34, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(parcelTransactAndReadException, com.google.android.gms.location.LocationAvailability.CREATOR);
        parcelTransactAndReadException.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.location.zzc.zza(parcelObtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(6, parcelObtainAndWriteInterfaceToken);
    }
}
