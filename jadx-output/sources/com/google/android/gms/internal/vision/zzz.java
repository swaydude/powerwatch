package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz extends com.google.android.gms.internal.vision.zzb implements com.google.android.gms.internal.vision.zzaa {
    zzz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.vision.zzaa
    public final com.google.android.gms.internal.vision.zzy zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.vision.zzah zzahVar) throws android.os.RemoteException {
        com.google.android.gms.internal.vision.zzy zzxVar;
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzahVar);
        android.os.Parcel parcelZza = zza(1, parcelObtainAndWriteInterfaceToken);
        android.os.IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            zzxVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.vision.zzy) {
                zzxVar = (com.google.android.gms.internal.vision.zzy) iInterfaceQueryLocalInterface;
            } else {
                zzxVar = new com.google.android.gms.internal.vision.zzx(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzxVar;
    }
}
