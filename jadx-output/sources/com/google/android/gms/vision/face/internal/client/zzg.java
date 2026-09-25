package com.google.android.gms.vision.face.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzg extends com.google.android.gms.internal.vision.zza implements com.google.android.gms.vision.face.internal.client.zzh {
    public zzg() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // com.google.android.gms.internal.vision.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.vision.face.internal.client.FaceParcel[] faceParcelArrZzc = zzc(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (com.google.android.gms.internal.vision.zzp) com.google.android.gms.internal.vision.zzd.zza(parcel, com.google.android.gms.internal.vision.zzp.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedArray(faceParcelArrZzc, 1);
        } else if (i == 2) {
            boolean zZzd = zzd(parcel.readInt());
            parcel2.writeNoException();
            com.google.android.gms.internal.vision.zzd.writeBoolean(parcel2, zZzd);
        } else {
            if (i != 3) {
                return false;
            }
            zzm();
            parcel2.writeNoException();
        }
        return true;
    }
}
