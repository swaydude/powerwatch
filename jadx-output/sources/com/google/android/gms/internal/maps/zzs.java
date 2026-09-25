package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzq {
    zzs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final java.lang.String getName() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(1, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final java.lang.String getShortName() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        java.lang.String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final void activate() throws android.os.RemoteException {
        zzb(3, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final boolean zzb(com.google.android.gms.internal.maps.zzq zzqVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzqVar);
        android.os.Parcel parcelZza2 = zza(4, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(5, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }
}
