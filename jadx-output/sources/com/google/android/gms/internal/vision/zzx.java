package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzx extends com.google.android.gms.internal.vision.zzb implements com.google.android.gms.internal.vision.zzy {
    zzx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    @Override // com.google.android.gms.internal.vision.zzy
    public final com.google.android.gms.internal.vision.zzac[] zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.vision.zzp zzpVar, com.google.android.gms.internal.vision.zzae zzaeVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, iObjectWrapper);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzpVar);
        com.google.android.gms.internal.vision.zzd.zza(parcelObtainAndWriteInterfaceToken, zzaeVar);
        android.os.Parcel parcelZza = zza(3, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.internal.vision.zzac[] zzacVarArr = (com.google.android.gms.internal.vision.zzac[]) parcelZza.createTypedArray(com.google.android.gms.internal.vision.zzac.CREATOR);
        parcelZza.recycle();
        return zzacVarArr;
    }

    @Override // com.google.android.gms.internal.vision.zzy
    public final void zzq() throws android.os.RemoteException {
        zzb(2, obtainAndWriteInterfaceToken());
    }
}
