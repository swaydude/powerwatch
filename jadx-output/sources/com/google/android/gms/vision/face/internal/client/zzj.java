package com.google.android.gms.vision.face.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj extends com.google.android.gms.internal.vision.zzb implements com.google.android.gms.vision.face.internal.client.zzh {
    zzj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final com.google.android.gms.vision.face.internal.client.FaceParcel[] zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.vision.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzpVar);
        android.os.Parcel parcelZza = zza(1, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.vision.face.internal.client.FaceParcel[] faceParcelArr = (com.google.android.gms.vision.face.internal.client.FaceParcel[]) parcelZza.createTypedArray(com.google.android.gms.vision.face.internal.client.FaceParcel.CREATOR);
        parcelZza.recycle();
        return faceParcelArr;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final boolean zzd(int i) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeInt(i);
        android.os.Parcel parcelZza = zza(2, parcelObtainAndWriteInterfaceToken);
        boolean zZza = com.google.android.gms.internal.vision.zzd.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzh
    public final void zzm() throws android.os.RemoteException {
        zzb(3, obtainAndWriteInterfaceToken());
    }
}
