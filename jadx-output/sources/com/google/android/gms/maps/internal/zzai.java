package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzai extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.zzah {
    zzai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zza(android.location.Location location) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, location);
        zzb(2, parcelZza);
    }
}
