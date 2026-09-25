package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzq extends com.google.android.gms.internal.measurement.zzc implements com.google.android.gms.internal.measurement.zzn {
    public zzq() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
