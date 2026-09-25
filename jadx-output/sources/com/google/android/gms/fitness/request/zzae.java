package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzae extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.fitness.request.zzaf {
    public zzae() {
        super("com.google.android.gms.fitness.request.IBleScanCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zza
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            onDeviceFound((com.google.android.gms.fitness.data.BleDevice) com.google.android.gms.internal.fitness.zzd.zza(parcel, com.google.android.gms.fitness.data.BleDevice.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            onScanStopped();
        }
        return true;
    }
}
