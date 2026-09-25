package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj extends com.google.android.gms.internal.vision.zzb implements com.google.android.gms.internal.vision.zzg {
    zzj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    @Override // com.google.android.gms.internal.vision.zzg
    public final com.google.android.gms.vision.barcode.Barcode[] zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.vision.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzpVar);
        android.os.Parcel parcelZza = zza(1, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.vision.barcode.Barcode[] barcodeArr = (com.google.android.gms.vision.barcode.Barcode[]) parcelZza.createTypedArray(com.google.android.gms.vision.barcode.Barcode.CREATOR);
        parcelZza.recycle();
        return barcodeArr;
    }

    @Override // com.google.android.gms.internal.vision.zzg
    public final com.google.android.gms.vision.barcode.Barcode[] zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.vision.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzpVar);
        android.os.Parcel parcelZza = zza(2, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.vision.barcode.Barcode[] barcodeArr = (com.google.android.gms.vision.barcode.Barcode[]) parcelZza.createTypedArray(com.google.android.gms.vision.barcode.Barcode.CREATOR);
        parcelZza.recycle();
        return barcodeArr;
    }

    @Override // com.google.android.gms.internal.vision.zzg
    public final void zzm() throws android.os.RemoteException {
        zzb(3, obtainAndWriteInterfaceToken());
    }
}
