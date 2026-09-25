package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends com.google.android.gms.internal.measurement.zza implements com.google.android.gms.internal.measurement.zzd {
    zzf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzd
    public final android.os.Bundle zza(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        android.os.Parcel parcelZza = zza(1, parcelA_);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcelZza, android.os.Bundle.CREATOR);
        parcelZza.recycle();
        return bundle2;
    }
}
