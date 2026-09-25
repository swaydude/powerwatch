package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk extends com.google.android.gms.internal.vision.zzb implements com.google.android.gms.internal.vision.zzi {
    zzk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // com.google.android.gms.internal.vision.zzi
    public final com.google.android.gms.internal.vision.zzg zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.vision.zzf zzfVar) throws android.os.RemoteException {
        com.google.android.gms.internal.vision.zzg zzjVar;
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzfVar);
        android.os.Parcel parcelZza = zza(1, parcelObtainAndWriteInterfaceToken);
        android.os.IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            zzjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.vision.zzg) {
                zzjVar = (com.google.android.gms.internal.vision.zzg) iInterfaceQueryLocalInterface;
            } else {
                zzjVar = new com.google.android.gms.internal.vision.zzj(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzjVar;
    }
}
