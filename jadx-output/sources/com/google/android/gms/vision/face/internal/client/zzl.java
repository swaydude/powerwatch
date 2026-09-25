package com.google.android.gms.vision.face.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzl extends com.google.android.gms.internal.vision.zza implements com.google.android.gms.vision.face.internal.client.zzi {
    public zzl() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static com.google.android.gms.vision.face.internal.client.zzi asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.vision.face.internal.client.zzi) {
            return (com.google.android.gms.vision.face.internal.client.zzi) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.vision.face.internal.client.zzk(iBinder);
    }

    @Override // com.google.android.gms.internal.vision.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.vision.face.internal.client.zzh zzhVarNewFaceDetector = newFaceDetector(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (com.google.android.gms.vision.face.internal.client.zzf) com.google.android.gms.internal.vision.zzd.zza(parcel, com.google.android.gms.vision.face.internal.client.zzf.CREATOR));
        parcel2.writeNoException();
        com.google.android.gms.internal.vision.zzd.zza(parcel2, zzhVarNewFaceDetector);
        return true;
    }
}
