package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzn {
    zzp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int getActiveLevelIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(1, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int getDefaultLevelIndex() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final java.util.List<android.os.IBinder> getLevels() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(3, zza());
        java.util.ArrayList<android.os.IBinder> arrayListCreateBinderArrayList = parcelZza.createBinderArrayList();
        parcelZza.recycle();
        return arrayListCreateBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean isUnderground() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(4, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzb(com.google.android.gms.internal.maps.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zznVar);
        android.os.Parcel parcelZza2 = zza(5, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzj() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(6, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }
}
