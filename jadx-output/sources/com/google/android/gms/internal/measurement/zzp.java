package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends com.google.android.gms.internal.measurement.zza implements com.google.android.gms.internal.measurement.zzn {
    zzp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzn
    public final void zza(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        zzb(1, parcelA_);
    }
}
