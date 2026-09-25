package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzeo extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzep {
    public zzeo() {
        super("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    }

    public static com.google.android.gms.internal.fitness.zzep zzk(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzep) {
            return (com.google.android.gms.internal.fitness.zzep) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzer(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.fitness.result.BleDevicesResult) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.result.BleDevicesResult.CREATOR));
        return true;
    }
}
