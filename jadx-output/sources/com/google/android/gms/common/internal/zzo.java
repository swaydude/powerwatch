package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzm {
    zzo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzm
    public final boolean zza(com.google.android.gms.common.zzk zzkVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zza(parcelZza, zzkVar);
        com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZza2 = zza(5, parcelZza);
        boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }
}
